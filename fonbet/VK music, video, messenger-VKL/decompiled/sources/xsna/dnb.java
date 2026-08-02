package xsna;

import xsna.m7a0;

/* compiled from: RxExt.kt */
/* loaded from: classes2.dex */
public final class dnb implements izs {
    public static final dnb c = new dnb(0);
    public static final dnb d = new dnb(1);
    public final /* synthetic */ int b;

    public /* synthetic */ dnb(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof r480);
            case 1:
                if (obj != null) {
                    return (m7a0.b) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vk.photos.root.rxbus.PhotoEvent.Deleted");
            default:
                return new io.reactivex.rxjava3.internal.operators.maybe.p(new esf(obj));
        }
    }
}
