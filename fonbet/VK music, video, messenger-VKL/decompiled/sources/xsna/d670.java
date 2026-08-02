package xsna;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes12.dex */
public final class d670 extends cko<Drawable> {
    @Override // xsna.hag0
    @NonNull
    public final Class<Drawable> b() {
        return this.b.getClass();
    }

    @Override // xsna.hag0
    public final int getSize() {
        T t = this.b;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // xsna.hag0
    public final void a() {
    }
}
