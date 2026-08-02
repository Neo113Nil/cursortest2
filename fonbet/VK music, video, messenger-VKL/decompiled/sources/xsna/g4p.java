package xsna;

import android.graphics.BitmapFactory;
import android.util.Size;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: EditorImageLinkFile.kt */
/* loaded from: classes4.dex */
public final class g4p implements e4p {
    public final String a;
    public final String b;
    public Size c;
    public Boolean d;

    public g4p(String str) {
        this.a = str;
        this.b = str;
    }

    @Override // xsna.e4p
    public final JSONObject a() {
        return new JSONObject(pn00.k(new Pair("uri", this.a), new Pair("width", Integer.valueOf(getWidth())), new Pair("height", Integer.valueOf(getHeight()))));
    }

    public final boolean equals(Object obj) {
        g4p g4pVar = obj instanceof g4p ? (g4p) obj : null;
        if (g4pVar != null) {
            return epx.f(this.b, g4pVar.b);
        }
        return false;
    }

    @Override // xsna.e4p
    public final int getHeight() {
        if (this.c == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.a, options);
            this.c = new Size(options.outWidth, options.outHeight);
        }
        return this.c.getHeight();
    }

    @Override // xsna.e4p
    public final String getKey() {
        return this.b;
    }

    @Override // xsna.e4p
    public final int getWidth() {
        if (this.c == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.a, options);
            this.c = new Size(options.outWidth, options.outHeight);
        }
        return this.c.getWidth();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
