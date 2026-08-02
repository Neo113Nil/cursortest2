package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import xsna.e6c;
import xsna.fl6;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 1:
                ((pf0) this.c).invoke(obj);
                return;
            case 2:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 3:
                ((l14) this.c).invoke(obj);
                return;
            case 4:
                ((rh4) this.c).invoke(obj);
                return;
            case 5:
                ((rh4) this.c).invoke(obj);
                return;
            case 6:
                ((fl6.f) this.c).invoke(obj);
                return;
            case 7:
                ((rh4) this.c).invoke(obj);
                return;
            case 8:
                ((rh4) this.c).invoke(obj);
                return;
            case 9:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 10:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 11:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 12:
                ((e6c.b) this.c).invoke(obj);
                return;
            case 13:
                ((y90) this.c).invoke(obj);
                return;
            case 14:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 15:
                ((ux9) this.c).invoke(obj);
                return;
            case 16:
                ((dmf) this.c).invoke(obj);
                return;
            case 17:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 18:
                ((y90) this.c).invoke(obj);
                return;
            case 19:
                ((rh4) this.c).invoke(obj);
                return;
            case 20:
                ((rh4) this.c).invoke(obj);
                return;
            case 21:
                ((vth) this.c).invoke(obj);
                return;
            case 22:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                return;
            case 23:
                ((com.vk.movika.sdk.base.logic.interactor.e) this.c).invoke(obj);
                throw null;
            case 24:
                ((td5) this.c).invoke(obj);
                return;
            case 25:
                ((o1g) this.c).invoke(obj);
                return;
            case 26:
                ((yp1) this.c).invoke(obj);
                return;
            case 27:
                ((h8n) this.c).e(new i8n(new qr60.a.e(ListLoadingState.ERROR), null, null));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return;
            case 28:
                ((udo) this.c).invoke(obj);
                return;
            default:
                ((hnq) this.c).invoke(obj);
                return;
        }
    }
}
