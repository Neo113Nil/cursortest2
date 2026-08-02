package xsna;

/* compiled from: ReactedPeersModal.kt */
/* loaded from: classes2.dex */
public final class oze0 implements izs {
    public static final oze0 c = new oze0(0);
    public static final oze0 d = new oze0(1);
    public final /* synthetic */ int b;

    public /* synthetic */ oze0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            default:
                if (obj != null) {
                    return (nda0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.PhotoUploadEvent");
        }
    }
}
