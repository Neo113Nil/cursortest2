package com.squareup.moshi;

import defpackage.ffx;
import defpackage.kbs;
import defpackage.ng70;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qq6;
import defpackage.unr0;
import defpackage.yp6;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public int a;
    public int[] b;
    public String[] c;
    public int[] w;
    public boolean x;
    public boolean y;
    public LinkedHashMap z;

    /* renamed from: com.squareup.moshi.JsonReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Token.values().length];
            a = iArr;
            try {
                iArr[Token.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Token.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Token.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Token.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Token.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Token.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class Options {
        public final String[] a;
        public final ng70 b;

        public Options(String[] strArr, ng70 ng70Var) {
            this.a = strArr;
            this.b = ng70Var;
        }

        public static Options of(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                yp6 yp6Var = new yp6();
                for (int i = 0; i < strArr.length; i++) {
                    JsonUtf8Writer.v(yp6Var, strArr[i]);
                    yp6Var.readByte();
                    byteStringArr[i] = yp6Var.l0(yp6Var.b);
                }
                return new Options((String[]) strArr.clone(), ffx.b0(byteStringArr));
            } catch (IOException e) {
                ny61.f(e);
                return null;
            }
        }

        public List<String> strings() {
            return Collections.unmodifiableList(Arrays.asList(this.a));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        private static final /* synthetic */ Token[] $VALUES;
        public static final Token BEGIN_ARRAY;
        public static final Token BEGIN_OBJECT;
        public static final Token BOOLEAN;
        public static final Token END_ARRAY;
        public static final Token END_DOCUMENT;
        public static final Token END_OBJECT;
        public static final Token NAME;
        public static final Token NULL;
        public static final Token NUMBER;
        public static final Token STRING;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            BEGIN_ARRAY = token;
            Token token2 = new Token("END_ARRAY", 1);
            END_ARRAY = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            BEGIN_OBJECT = token3;
            Token token4 = new Token("END_OBJECT", 3);
            END_OBJECT = token4;
            Token token5 = new Token("NAME", 4);
            NAME = token5;
            Token token6 = new Token("STRING", 5);
            STRING = token6;
            Token token7 = new Token("NUMBER", 6);
            NUMBER = token7;
            Token token8 = new Token("BOOLEAN", 7);
            BOOLEAN = token8;
            Token token9 = new Token("NULL", 8);
            NULL = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            END_DOCUMENT = token10;
            $VALUES = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) $VALUES.clone();
        }
    }

    public JsonReader(JsonReader jsonReader) {
        this.a = jsonReader.a;
        this.b = (int[]) jsonReader.b.clone();
        this.c = (String[]) jsonReader.c.clone();
        this.w = (int[]) jsonReader.w.clone();
        this.x = jsonReader.x;
        this.y = jsonReader.y;
    }

    public static JsonReader of(qq6 qq6Var) {
        return new JsonUtf8Reader(qq6Var);
    }

    public final void a(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                kbs.s(getPath(), "Nesting too deep at ");
                return;
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.w;
            this.w = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    public final void c(String str) {
        StringBuilder v = oyr.v(str, " at path ");
        v.append(getPath());
        throw new JsonEncodingException(v.toString());
    }

    public final JsonDataException d(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + getPath());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + getPath());
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    public final boolean failOnUnknown() {
        return this.y;
    }

    public final String getPath() {
        return JsonScope.a(this.a, this.b, this.c, this.w);
    }

    public abstract boolean hasNext() throws IOException;

    public final boolean isLenient() {
        return this.x;
    }

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    public abstract String nextName() throws IOException;

    public abstract <T> T nextNull() throws IOException;

    public abstract qq6 nextSource() throws IOException;

    public abstract String nextString() throws IOException;

    public abstract Token peek() throws IOException;

    public abstract JsonReader peekJson();

    public abstract void promoteNameToValue() throws IOException;

    public final Object readJsonValue() throws IOException {
        switch (AnonymousClass1.a[peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                beginArray();
                while (hasNext()) {
                    arrayList.add(readJsonValue());
                }
                endArray();
                return arrayList;
            case 2:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                beginObject();
                while (hasNext()) {
                    String nextName = nextName();
                    Object readJsonValue = readJsonValue();
                    Object put = linkedHashTreeMap.put(nextName, readJsonValue);
                    if (put != null) {
                        StringBuilder x = unr0.x("Map key '", nextName, "' has multiple values at path ");
                        x.append(getPath());
                        x.append(Extension.COLON_SPACE);
                        x.append(put);
                        x.append(" and ");
                        x.append(readJsonValue);
                        throw new JsonDataException(x.toString());
                    }
                }
                endObject();
                return linkedHashTreeMap;
            case 3:
                return nextString();
            case 4:
                return Double.valueOf(nextDouble());
            case 5:
                return Boolean.valueOf(nextBoolean());
            case 6:
                return nextNull();
            default:
                StringBuilder sb = new StringBuilder("Expected a value but was ");
                sb.append(peek());
                kbs.q(sb, " at path ", getPath());
                return null;
        }
    }

    public abstract int selectName(Options options) throws IOException;

    public abstract int selectString(Options options) throws IOException;

    public final void setFailOnUnknown(boolean z) {
        this.y = z;
    }

    public final void setLenient(boolean z) {
        this.x = z;
    }

    public final <T> void setTag(Class<T> cls, T t) {
        if (!cls.isAssignableFrom(t.getClass())) {
            ny61.g("Tag value must be of type ".concat(cls.getName()));
            return;
        }
        if (this.z == null) {
            this.z = new LinkedHashMap();
        }
        this.z.put(cls, t);
    }

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    public final <T> T tag(Class<T> cls) {
        LinkedHashMap linkedHashMap = this.z;
        if (linkedHashMap == null) {
            return null;
        }
        return (T) linkedHashMap.get(cls);
    }

    public JsonReader() {
        this.b = new int[32];
        this.c = new String[32];
        this.w = new int[32];
    }
}
