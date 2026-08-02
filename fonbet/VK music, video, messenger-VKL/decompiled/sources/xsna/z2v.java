package xsna;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: HideAppContentBottomSheet.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class z2v extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2v(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((a3v) this.receiver).C((x2v) obj);
                break;
            default:
                ((plx0) this.receiver).C((flx0) obj);
                break;
        }
        return s3q0.a;
    }
}
