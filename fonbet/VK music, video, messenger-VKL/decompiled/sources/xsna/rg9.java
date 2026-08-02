package xsna;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CameraChannelDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class rg9 extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                lh9.d((lh9) this.receiver, (Bitmap) obj);
                break;
            default:
                ((ci50) this.receiver).b((zeh0) obj);
                break;
        }
        return s3q0.a;
    }
}
