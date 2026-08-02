package yads;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;
import xsna.fo8;

/* loaded from: classes10.dex */
public final class iw0 {
    public final Context a;

    public iw0(Context context) {
        this.a = context;
    }

    public final Typeface a(tw0 tw0Var) {
        try {
            File b = b(tw0Var);
            if (b.exists()) {
                return Typeface.createFromFile(b);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final File b(tw0 tw0Var) {
        return new File(new File(this.a.getFilesDir(), "downloaded_fonts"), k53.a(fo8.a(tw0Var.name(), ".ttf")));
    }
}
