package xsna;

import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.video.VideoOwner;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import java.lang.ref.WeakReference;
import xsna.d6z0;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cmc0 implements PostingSettingsCommunityView.a, io.reactivex.rxjava3.functions.l, zm, io.reactivex.rxjava3.functions.c, d6z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cmc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.d6z0.a
    public void a(boolean z) {
        izy0 izy0Var = (izy0) this.c;
        o4 o4Var = izy0Var.e;
        saz0 saz0Var = izy0Var.b;
        WeakReference weakReference = izy0Var.k;
        d6z0 d6z0Var = weakReference == null ? null : (d6z0) weakReference.get();
        if (d6z0Var == null) {
            gu8.c("ViewabilityTracker", "help view is null");
            izy0Var.k = null;
            return;
        }
        ViewParent parent = d6z0Var.getParent();
        WeakReference weakReference2 = izy0Var.j;
        View view = weakReference2 == null ? null : (View) weakReference2.get();
        if (parent == null || parent != view) {
            gu8.c("ViewabilityTracker", "onStateChanged viewParent is null or not equals to rootView");
            d6z0Var.setStateChangedListener(null);
            izy0Var.k.clear();
            izy0Var.k = null;
            return;
        }
        gu8.c("ViewabilityTracker", "onViewVisibilityChanged = " + z);
        if (!z) {
            saz0Var.h(o4Var);
            izy0Var.c(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        } else {
            izy0Var.e();
            if (izy0Var.g) {
                saz0Var.c(o4Var);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.t) ((azt) this.c).invoke(obj);
            case 2:
            default:
                return (VideoOwner) ((eyp0) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((byh) this.c).invoke(obj);
            case 4:
                return (hda) ((x9s0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((o15) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (r1k0.b) ((gre) this.c).invoke(obj, obj2);
    }

    @Override // xsna.zm
    public boolean a(View view) {
        com.vk.writebar.a aVar = (com.vk.writebar.a) this.c;
        aVar.g.d();
        aVar.g();
        aVar.g.a();
        return true;
    }
}
