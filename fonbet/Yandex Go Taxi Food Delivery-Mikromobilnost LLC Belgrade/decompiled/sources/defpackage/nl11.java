package defpackage;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* loaded from: classes11.dex */
public abstract class nl11 {
    public final Object fromJson(Reader reader) throws IOException {
        return read(new wdx(reader));
    }

    public final Object fromJsonTree(pcx pcxVar) {
        try {
            return read(new rex(pcxVar));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final nl11 nullSafe() {
        return !(this instanceof ml11) ? new ml11(this) : this;
    }

    public abstract Object read(wdx wdxVar);

    public final String toJson(Object obj) {
        StringBuilder sb = new StringBuilder();
        try {
            toJson(chb1.h(sb), obj);
            return sb.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final pcx toJsonTree(Object obj) {
        try {
            tex texVar = new tex();
            write(texVar, obj);
            return texVar.b0();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(afx afxVar, Object obj);

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new afx(writer), obj);
    }
}
