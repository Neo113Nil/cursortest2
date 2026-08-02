package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.Size;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: EditorImagelinkResource.kt */
/* loaded from: classes4.dex */
public final class j4p implements e4p {
    public final Context a;
    public final int b;
    public final String c;
    public Size d;

    public j4p(Context context, int i) {
        this.a = context;
        this.b = i;
        this.c = String.valueOf(i);
    }

    @Override // xsna.e4p
    public final JSONObject a() {
        return new JSONObject(pn00.k(new Pair("resId", Integer.valueOf(this.b)), new Pair("width", Integer.valueOf(getWidth())), new Pair("height", Integer.valueOf(getHeight()))));
    }

    public final boolean equals(Object obj) {
        j4p j4pVar = obj instanceof j4p ? (j4p) obj : null;
        if (j4pVar != null) {
            return epx.f(this.c, j4pVar.c);
        }
        return false;
    }

    @Override // xsna.e4p
    public final int getHeight() {
        if (this.d == null) {
            Resources resources = this.a.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, this.b, options);
            this.d = new Size(options.outWidth, options.outHeight);
        }
        return this.d.getHeight();
    }

    @Override // xsna.e4p
    public final String getKey() {
        return this.c;
    }

    @Override // xsna.e4p
    public final int getWidth() {
        if (this.d == null) {
            Resources resources = this.a.getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, this.b, options);
            this.d = new Size(options.outWidth, options.outHeight);
        }
        return this.d.getWidth();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
