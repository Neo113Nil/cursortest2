package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.stickers.views.animation.VKAnimationView;
import xsna.qr60;
import xsna.w5u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class epq0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ epq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((n43) obj2).invoke(obj);
                break;
            case 1:
                ((zvq0) obj2).e(new awq0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 2:
                int i2 = VKAnimationView.w;
                ((iyd0) obj2).invoke(obj);
                break;
            case 3:
                ((m2l0) obj2).invoke(obj);
                break;
            case 4:
                ((w5u0.a) obj2).invoke(obj);
                break;
            case 5:
                ((iyd0) obj2).invoke(obj);
                break;
            case 6:
                ((l5r0) obj2).invoke(obj);
                break;
            case 7:
                ((iyd0) obj2).invoke(obj);
                break;
            case 8:
                ((du0) obj2).invoke(obj);
                break;
            case 9:
                ((iyd0) obj2).invoke(obj);
                break;
            case 10:
                ((z4t0) obj2).invoke(obj);
                break;
            default:
                ((u1y0) obj2).invoke(obj);
                break;
        }
    }
}
