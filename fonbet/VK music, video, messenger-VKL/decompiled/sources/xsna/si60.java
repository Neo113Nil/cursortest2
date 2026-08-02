package xsna;

import android.view.View;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.voip.VoipService;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Optional;
import xsna.bzd0;
import xsna.bzp0;
import xsna.dra0;
import xsna.ngl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class si60 implements io.reactivex.rxjava3.functions.l, VkCheckboxItem.a, i0u0, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.m, ngl.a, SkuDetailsResponseListener, yads.l32 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ si60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.l32
    public boolean a(yads.m22 m22Var) {
        return yads.oz1.a((yads.oz1) this.c, m22Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((ev60) obj2).invoke(obj);
            case 2:
                return (dra0.c) ((ev60) obj2).invoke(obj);
            case 3:
                return (List) ((ev60) obj2).invoke(obj);
            case 4:
                return (bzd0.b) ((mgz) obj2).invoke(obj);
            case 5:
            case 12:
            case 14:
            default:
                Object obj3 = VoipService.q;
                return (Boolean) ((ev60) obj2).invoke(obj);
            case 6:
                return (UsersUserFullDto) ((ev60) obj2).invoke(obj);
            case 7:
                return (WebStoryBox) ((ape0) obj2).invoke(obj);
            case 8:
                return (nov) ((ape0) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.e) ((eci0) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.t) ((ev60) obj2).invoke(obj);
            case 11:
                return (nak) ((izs) obj2).invoke(obj);
            case 13:
                return (Optional) ((ape0) obj2).invoke(obj);
            case 15:
                return (Boolean) ((ev60) obj2).invoke(obj);
            case 16:
                return (VideoDiscoveryRecommendationsRepository.a) ((ev60) obj2).invoke(obj);
            case 17:
                return (Boolean) ((eci0) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.view.components.checkbox.VkCheckboxItem.a
    public void b(boolean z) {
        bth0 bth0Var = (bth0) this.c;
        bth0Var.y.setChecked(z);
        bth0Var.v.d = z;
        bth0Var.Q4();
    }

    public void c(com.vk.feed.settings.impl.presentation.filtered.tab.f fVar) {
        NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
        int i = NewsfeedFilterListFragment2.X;
        newsfeedFilterListFragment2.getFeature().V(fVar);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        xkx0 xkx0Var = (xkx0) this.c;
        xkx0Var.getClass();
        com.vk.registration.funnels.b.a.getClass();
        com.vk.registration.funnels.b.w();
        xkx0Var.B0();
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference(((olq0) this.c).f).get();
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        ((com.my.tracker.obfuscated.m0) this.c).c(billingResult, list);
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        final jpr0 jpr0Var = (jpr0) this.c;
        u76 u76Var = jpr0Var.c;
        if (u76Var.O2() != null) {
            bVar.onComplete();
            return;
        }
        ((u440) u76Var).A0 = new hp30(bVar, 27);
        bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.ipr0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                ((u440) jpr0.this.c).A0 = null;
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((pst0) this.c).invoke(obj)).booleanValue();
    }
}
