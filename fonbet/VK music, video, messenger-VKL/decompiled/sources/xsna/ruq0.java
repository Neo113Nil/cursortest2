package xsna;

/* compiled from: RxExt.kt */
/* loaded from: classes5.dex */
public final class ruq0 implements izs {
    public static final ruq0 c = new ruq0(0);
    public final /* synthetic */ int b;

    public /* synthetic */ ruq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (obj != null) {
                    return (zaa0) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.PhotoRemoveEvent");
            default:
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new csf(obj));
        }
    }
}
