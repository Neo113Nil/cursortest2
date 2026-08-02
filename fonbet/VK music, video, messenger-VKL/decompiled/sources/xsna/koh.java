package xsna;

/* compiled from: RxExt.kt */
/* loaded from: classes5.dex */
public final class koh implements izs {
    public static final koh c = new koh(0);
    public static final koh d = new koh(1);
    public final /* synthetic */ int b;

    public /* synthetic */ koh(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof zaa0);
            default:
                return s3q0.a;
        }
    }
}
