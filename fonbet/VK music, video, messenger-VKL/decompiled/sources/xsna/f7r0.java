package xsna;

import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.superapp.browser.ui.VkBrowserActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f7r0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ f7r0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                int i2 = VKAnimationView.w;
                ((e7r0) izsVar).invoke(obj);
                break;
            case 1:
                ((lir0) izsVar).invoke(obj);
                break;
            case 2:
                int i3 = VkBrowserActivity.l;
                ((mz80) izsVar).invoke(obj);
                break;
            default:
                ((gqq0) izsVar).invoke(obj);
                break;
        }
    }
}
