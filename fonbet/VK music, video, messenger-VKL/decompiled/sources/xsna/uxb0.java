package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.ui.members.VoipDataProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.U5;
import java.util.List;
import xsna.h1o0;
import xsna.o2z0;
import xsna.spw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class uxb0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ActivationBarrierCallback, r580, pcs, io.reactivex.rxjava3.functions.c, ModalBottomSheetBehavior.e, o2z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uxb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
        o2z0 o2z0Var = (o2z0) this.c;
        if (o2z0Var.b == null) {
            return;
        }
        o8z0.d(new vb(o2z0Var, 22));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((juz) obj2).invoke(obj);
            case 1:
                return (q8c0) ((juz) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((ggb0) obj2).invoke(obj);
            case 3:
                return (ta90) ((orm) obj2).invoke(obj);
            case 4:
                return (it80) ((mmk0) obj2).invoke(obj);
            case 5:
            case 12:
            case 14:
            case 17:
            case 18:
            default:
                return (Boolean) ((kul0) obj2).invoke(obj);
            case 6:
                return (ppt) ((wpl0) obj2).invoke(obj);
            case 7:
                return (hsl0) ((kul0) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.o) ((ggb0) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.b0) ((ggb0) obj2).invoke(obj);
            case 10:
                return (List) ((ggb0) obj2).invoke(obj);
            case 11:
                return (h1o0.b.C2967b) ((kul0) obj2).invoke(obj);
            case 13:
                int i2 = UserProfileFragment.p0;
                return (io.reactivex.rxjava3.core.b0) ((ggb0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((wqb) obj2).invoke(obj);
            case 16:
                return (List) ((cbt0) obj2).invoke(obj);
            case 19:
                return ((VoipDataProvider.d) obj2).invoke(obj);
        }
    }

    @Override // xsna.r580
    public void c(DonutVideoAction donutVideoAction) {
        ((VideoItemSliderVh) this.c).j(donutVideoAction, DonutVideoClickSource.DESCRIPTION);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.e
    public boolean d(float f, int i) {
        RecyclerView recyclerView = ((hox0) this.c).i;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((LinearLayoutManager) recyclerView.getLayoutManager()).s() == 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        U5.a((U5) this.c);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        int i = VoipCallActivity.P;
        gzs<s3q0> gzsVar = ((shj0) this.c).b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 5:
                int i2 = StickersRecyclerView.w;
                return ((Boolean) ((dl70) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ow60) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (spw0.d.b) ((cc5) this.c).invoke(obj, obj2);
    }
}
