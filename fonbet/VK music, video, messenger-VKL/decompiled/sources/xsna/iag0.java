package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes12.dex */
public final class iag0 implements mag0<Uri, Bitmap> {
    public final oag0 a;
    public final tc7 b;

    public iag0(oag0 oag0Var, tc7 tc7Var) {
        this.a = oag0Var;
        this.b = tc7Var;
    }

    @Override // xsna.mag0
    @Nullable
    public final hag0<Bitmap> a(@NonNull Uri uri, int i, int i2, @NonNull au80 au80Var) throws IOException {
        hag0 c = this.a.c(uri, au80Var);
        if (c == null) {
            return null;
        }
        return iko.a(this.b, (Drawable) ((cko) c).get(), i, i2);
    }

    @Override // xsna.mag0
    public final boolean b(@NonNull Uri uri, @NonNull au80 au80Var) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
