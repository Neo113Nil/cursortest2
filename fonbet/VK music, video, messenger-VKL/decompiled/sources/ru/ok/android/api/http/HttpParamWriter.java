package ru.ok.android.api.http;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.AutoApiParam;
import ru.ok.android.api.core.VectorApiWriter;
import ru.ok.android.api.json.AbstractJsonWriter;
import ru.ok.android.api.json.JsonQuoter;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonWalker;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.api.util.SimpleIntStack;
import ru.ok.android.commons.convert.Hex;
import ru.ok.android.commons.io.OutputStreamWriter;
import xsna.emb;
import xsna.zcl;

/* compiled from: HttpParamWriter.kt */
/* loaded from: classes9.dex */
public final class HttpParamWriter extends AbstractJsonWriter implements VectorApiWriter {
    public static final Companion Companion = new Companion(null);
    private static final byte[] N_U_L_L = {110, 117, 108, 108};
    private final List<AutoApiParam> autoParams;
    private final Writer charOut;
    private final OutputStream directOut;
    private final MessageDigest md5;
    private int pendingAutoParamIndex;
    private final String secret;
    private boolean signaturePending;
    private final SimpleIntStack stack;

    /* compiled from: HttpParamWriter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final MessageDigest createDigest() {
            try {
                return MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stackToString(SimpleIntStack simpleIntStack) {
            StringBuilder sb = new StringBuilder();
            SimpleIntStack simpleIntStack2 = new SimpleIntStack(simpleIntStack.size());
            while (!simpleIntStack.isEmpty()) {
                simpleIntStack2.push(simpleIntStack.pop());
            }
            while (!simpleIntStack2.isEmpty()) {
                int pop = simpleIntStack2.pop();
                sb.append(stackToString(pop));
                simpleIntStack.push(pop);
            }
            return sb.toString();
        }

        private Companion() {
        }

        private final String stackToString(int i) {
            switch (i) {
                case 0:
                case 2:
                    return "";
                case 1:
                    return "=";
                case 3:
                case 5:
                    return "{";
                case 4:
                    return "{:";
                case 6:
                case 7:
                    return X3.j.d;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* compiled from: HttpParamWriter.kt */
    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ParamScope {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int DANGLING_NAME = 4;
        public static final int DANGLING_PARAM = 1;
        public static final int EMPTY_ARRAY = 6;
        public static final int EMPTY_OBJECT = 3;
        public static final int EMPTY_PARAMS = 0;
        public static final int NONEMPTY_ARRAY = 7;
        public static final int NONEMPTY_OBJECT = 5;
        public static final int NONEMPTY_PARAMS = 2;

        /* compiled from: HttpParamWriter.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int DANGLING_NAME = 4;
            public static final int DANGLING_PARAM = 1;
            public static final int EMPTY_ARRAY = 6;
            public static final int EMPTY_OBJECT = 3;
            public static final int EMPTY_PARAMS = 0;
            public static final int NONEMPTY_ARRAY = 7;
            public static final int NONEMPTY_OBJECT = 5;
            public static final int NONEMPTY_PARAMS = 2;

            private Companion() {
            }
        }
    }

    public HttpParamWriter(OutputStream outputStream) {
        this(outputStream, null, null, 6, null);
    }

    private final void beforeValue() throws IOException {
        int peek = this.stack.peek();
        if (peek == 1) {
            this.stack.popPush(2);
            this.directOut.write(61);
            this.md5.update((byte) 61);
        } else if (peek == 4) {
            this.stack.popPush(5);
            this.charOut.write(58);
        } else if (peek == 6) {
            this.stack.popPush(7);
        } else {
            if (peek == 7) {
                this.charOut.write(44);
                return;
            }
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
    }

    private final void directHexValue(byte[] bArr) throws IOException {
        beforeValue();
        Hex.writeHex(this.directOut, bArr);
    }

    private final void internalName(String str) throws IOException {
        int peek = this.stack.peek();
        if (peek == 0) {
            this.stack.popPush(1);
            this.charOut.write(str);
            return;
        }
        if (peek == 5) {
            this.charOut.write(44);
            this.stack.popPush(4);
            JsonQuoter.writeQuoted(this.charOut, str);
        } else if (peek == 2) {
            this.directOut.write(38);
            this.stack.popPush(1);
            this.charOut.write(str);
        } else if (peek == 3) {
            this.stack.popPush(4);
            JsonQuoter.writeQuoted(this.charOut, str);
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
    }

    private final void vectorElementValue(String str) {
        if (str != null) {
            JsonQuoter.writeQuoted(this.charOut, str);
        } else {
            this.charOut.write("null");
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginArray() throws IOException {
        beforeValue();
        this.stack.push(6);
        this.charOut.write(91);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginObject() throws IOException {
        beforeValue();
        this.stack.push(3);
        this.charOut.write(123);
    }

    public final void beginParams() throws IOException {
        if (!this.stack.isEmpty()) {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
        boolean z = this.secret != null;
        this.signaturePending = z;
        this.pendingAutoParamIndex = z ? 0 : -1;
        this.md5.reset();
        this.stack.push(0);
        if (this.signaturePending) {
            return;
        }
        Iterator<AutoApiParam> it = this.autoParams.iterator();
        while (it.hasNext()) {
            it.next().write(this);
        }
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.charOut.close();
        int peek = this.stack.peek();
        if (peek != 0 && peek != 2) {
            throw JsonStateException.nestingProblem("Unfinished document");
        }
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter
    public void comment(String str) throws IOException {
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endArray() throws IOException {
        int peek = this.stack.peek();
        if (peek == 6 || peek == 7) {
            this.stack.pop();
            this.charOut.write(93);
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endObject() throws IOException {
        int peek = this.stack.peek();
        if (peek == 3 || peek == 5) {
            this.stack.pop();
            this.charOut.write(125);
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
    }

    public final void endParams() throws IOException {
        if (this.stack.size() != 1) {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
        int i = this.pendingAutoParamIndex;
        if (i >= 0) {
            this.pendingAutoParamIndex = -1;
            while (i < this.autoParams.size()) {
                this.autoParams.get(i).write(this);
                i++;
            }
        }
        if (this.signaturePending) {
            this.md5.update(this.secret.getBytes(emb.b));
            byte[] digest = this.md5.digest();
            internalName("sig");
            directHexValue(digest);
            this.signaturePending = false;
        }
        this.stack.pop();
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
        this.charOut.flush();
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter
    public void jsonValue(String str) throws IOException {
        beforeValue();
        this.charOut.write(str);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public JsonWriter name(String str) throws IOException {
        int i;
        int peek = this.stack.peek();
        if ((peek == 0 || peek == 2) && (i = this.pendingAutoParamIndex) >= 0) {
            this.pendingAutoParamIndex = -1;
            while (i < this.autoParams.size()) {
                AutoApiParam autoApiParam = this.autoParams.get(i);
                int compareTo = str.compareTo(autoApiParam.getName());
                if (compareTo < 0) {
                    break;
                }
                if (compareTo > 0) {
                    autoApiParam.write(this);
                }
                i++;
            }
            this.pendingAutoParamIndex = i;
        }
        internalName(str);
        return this;
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter
    public void nullValue() throws IOException {
        beforeValue();
        if (this.stack.peek() == 2) {
            this.md5.update(N_U_L_L);
        } else {
            this.charOut.write("null");
        }
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(String str) throws IOException {
        beforeValue();
        if (this.stack.peek() != 2) {
            JsonQuoter.writeQuoted(this.charOut, str);
            return;
        }
        if (str.length() == 0) {
            this.md5.update(N_U_L_L);
        }
        this.charOut.write(str);
    }

    @Override // ru.ok.android.api.core.VectorApiWriter
    public void vectorValue(Iterable<String> iterable) throws IOException {
        Iterator<String> it = iterable.iterator();
        if (this.stack.peek() == 1) {
            beforeValue();
            if (it.hasNext()) {
                this.charOut.write(it.next());
                while (it.hasNext()) {
                    this.charOut.write(44);
                    this.charOut.write(it.next());
                }
                return;
            }
            return;
        }
        beforeValue();
        this.charOut.write(91);
        if (it.hasNext()) {
            vectorElementValue(it.next());
            while (it.hasNext()) {
                this.charOut.write(44);
                vectorElementValue(it.next());
            }
        }
        this.charOut.write(93);
    }

    public HttpParamWriter(OutputStream outputStream, List<? extends AutoApiParam> list) {
        this(outputStream, list, null, 4, null);
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter
    public void comment(String str, Object... objArr) throws IOException {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpParamWriter(OutputStream outputStream, List<? extends AutoApiParam> list, String str) {
        this.directOut = outputStream;
        this.autoParams = list;
        this.secret = str;
        this.stack = new SimpleIntStack();
        OutputStream urlEncoderOutputStream = new UrlEncoderOutputStream(outputStream);
        if (str != null) {
            MessageDigest createDigest = Companion.createDigest();
            this.md5 = createDigest;
            urlEncoderOutputStream = new MessageDigestOutputStream(urlEncoderOutputStream, createDigest);
        } else {
            this.md5 = NopMessageDigest.INSTANCE;
        }
        this.charOut = new OutputStreamWriter(urlEncoderOutputStream);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void jsonValue(Reader reader) throws IOException {
        beforeValue();
        int peek = this.stack.peek();
        if (peek == 2 || peek == 5) {
            JsonWalker.walkValue(reader, this.charOut);
            return;
        }
        if (peek != 6 && peek != 7) {
            throw JsonStateException.nestingProblem("Nesting problem: " + Companion.stackToString(this.stack));
        }
        JsonWalker.walkManyValues(reader, this.charOut);
    }

    public HttpParamWriter(OutputStream outputStream, List list, String str, int i, zcl zclVar) {
        this(outputStream, (i & 2) != 0 ? EmptyList.b : list, (i & 4) != 0 ? null : str);
    }
}
