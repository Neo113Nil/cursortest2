package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class g7w0 extends mzz {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g7w0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    @Override // defpackage.mzz
    public final int g(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((String) obj2).length() * 2;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }
}
