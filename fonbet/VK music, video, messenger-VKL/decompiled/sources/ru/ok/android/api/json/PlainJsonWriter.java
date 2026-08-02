package ru.ok.android.api.json;

import androidx.annotation.NonNull;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import ru.ok.android.api.util.SimpleIntStack;
import ru.ok.android.commons.io.OutputStreamWriter;
import xsna.lhg;

/* loaded from: classes9.dex */
public class PlainJsonWriter extends AbstractJsonWriter {

    @NonNull
    private final Writer out;
    private final SimpleIntStack stack;

    public PlainJsonWriter(@NonNull Writer writer) {
        SimpleIntStack simpleIntStack = new SimpleIntStack();
        this.stack = simpleIntStack;
        this.out = writer;
        simpleIntStack.push(0);
    }

    private void beforeName() throws IOException {
        int peek = this.stack.peek();
        if (peek == 6) {
            this.out.write(44);
        } else if (peek != 4) {
            throw JsonStateException.nestingProblem("Nesting problem: " + stackToString(this.stack));
        }
        this.stack.popPush(5);
    }

    private void beforeValue() throws IOException {
        int peek = this.stack.peek();
        if (peek == 0) {
            this.stack.popPush(1);
            return;
        }
        if (peek == 5) {
            this.out.write(StringUtils.PROCESS_POSTFIX_DELIMITER);
            this.stack.popPush(6);
        } else if (peek == 2) {
            this.stack.popPush(3);
        } else if (peek == 3) {
            this.out.write(44);
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + stackToString(this.stack));
        }
    }

    private void close(int i, int i2) throws IOException {
        int peek = this.stack.peek();
        if (peek == i2 || peek == i) {
            this.stack.pop();
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + stackToString(this.stack));
        }
    }

    private void open(int i) throws IOException {
        beforeValue();
        this.stack.push(i);
    }

    private static String stackToString(@NonNull SimpleIntStack simpleIntStack) {
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

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginArray() throws IOException {
        open(2);
        this.out.write(91);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void beginObject() throws IOException {
        open(4);
        this.out.write(123);
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str) throws IOException {
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endArray() throws IOException {
        close(2, 3);
        this.out.write(93);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void endObject() throws IOException {
        close(4, 6);
        this.out.write(125);
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter
    public void jsonValue(@NonNull String str) throws IOException {
        beforeValue();
        this.out.write(str);
    }

    @Override // ru.ok.android.api.json.JsonWriter
    @NonNull
    public JsonWriter name(@NonNull String str) throws IOException {
        beforeName();
        JsonQuoter.writeQuoted(this.out, str);
        return this;
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void value(@NonNull String str) throws IOException {
        beforeValue();
        JsonQuoter.writeQuoted(this.out, str);
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter
    public void comment(@NonNull String str, Object... objArr) throws IOException {
    }

    @Override // ru.ok.android.api.json.JsonWriter
    public void jsonValue(@NonNull Reader reader) throws IOException {
        beforeValue();
        int peek = this.stack.peek();
        if (peek == 2 || peek == 3) {
            JsonWalker.walkManyValues(reader, this.out);
        } else if (peek == 6) {
            JsonWalker.walkValue(reader, this.out);
        } else {
            throw JsonStateException.nestingProblem("Nesting problem: " + stackToString(this.stack));
        }
    }

    @Override // ru.ok.android.api.json.AbstractJsonWriter, ru.ok.android.api.json.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        if (this.stack.peek() != 1) {
            throw JsonStateException.nestingProblem("Unfinished document");
        }
    }

    public PlainJsonWriter(@NonNull OutputStream outputStream) {
        this(new OutputStreamWriter(outputStream));
    }

    private static String stackToString(int i) {
        switch (i) {
            case 0:
            case 1:
                return "";
            case 2:
            case 3:
                return X3.j.d;
            case 4:
            case 6:
                return "{";
            case 5:
                return "{:";
            default:
                throw new IllegalArgumentException(lhg.a(i, ""));
        }
    }
}
