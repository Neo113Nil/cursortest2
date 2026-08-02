package xsna;

import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;

/* compiled from: CourierMapLocationOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class izj {
    public final CourierMapFragment.b a;
    public io.reactivex.rxjava3.disposables.c b;

    /* compiled from: CourierMapLocationOneTimeEventHandler.kt */
    public static final class a implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public izj(CourierMapFragment.b bVar) {
        this.a = bVar;
    }
}
