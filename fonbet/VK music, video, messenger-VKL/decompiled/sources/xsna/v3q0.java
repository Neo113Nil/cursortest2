package xsna;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes12.dex */
public final class v3q0 implements mag0<Drawable, Drawable> {
    @Override // xsna.mag0
    @Nullable
    public final hag0<Drawable> a(@NonNull Drawable drawable, int i, int i2, @NonNull au80 au80Var) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d670(drawable2);
        }
        return null;
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Drawable drawable, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
