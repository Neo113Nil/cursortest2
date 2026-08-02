package xsna;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kbz0 implements ehx {
    public final kiw a;

    public kbz0(kiw kiwVar) {
        this.a = kiwVar;
    }

    @Override // xsna.ehx
    public final Bitmap getBitmap() {
        return this.a.a();
    }

    @Override // xsna.ehx
    public final int getHeight() {
        return this.a.c;
    }

    @Override // xsna.ehx
    public final String getUrl() {
        return this.a.a;
    }

    @Override // xsna.ehx
    public final int getWidth() {
        return this.a.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalImageData{width=");
        kiw kiwVar = this.a;
        sb.append(kiwVar.b);
        sb.append(", height=");
        sb.append(kiwVar.c);
        sb.append(", url=");
        sb.append(kiwVar.a);
        sb.append(", bitmap=");
        sb.append(kiwVar.a());
        sb.append('}');
        return sb.toString();
    }
}
