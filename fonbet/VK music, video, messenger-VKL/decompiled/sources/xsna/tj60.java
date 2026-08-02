package xsna;

import android.view.MotionEvent;
import com.my.target.common.MyTargetActivity;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.template.StoryTemplatesContainerData;
import com.vk.dto.user.UserProfile;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.webrtc.RTCStats;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsExtensionsKt;
import xsna.b6l0;
import xsna.bzp0;
import xsna.exy0;
import xsna.mjm0;
import xsna.ngl;
import xsna.x160;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tj60 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, i7f0, a0i, r2m, x160.a, ngl.a, exy0.a, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tj60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.x160.a
    public boolean a(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent;
        onInterceptTouchEvent = super/*androidx.viewpager.widget.ViewPager*/.onInterceptTouchEvent(motionEvent);
        return onInterceptTouchEvent;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((sj60) this.c).invoke(obj);
            case 1:
                return (UserProfile) ((kdw) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((st80) this.c).invoke(obj);
            case 3:
            case 6:
            case 7:
            case 8:
            case 20:
            default:
                return (it80) ((yaq0) this.c).invoke(obj);
            case 4:
                return (Collection) ((kdw) this.c).invoke(obj);
            case 5:
                return ((gj80) this.c).invoke(obj);
            case 9:
                return (b6l0.a) ((s1f0) this.c).invoke(obj);
            case 10:
                return (GetStoriesResponse) ((kdw) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((rj60) this.c).invoke(obj);
            case 12:
                return (Pair) ((gj80) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.o) ((wgm0) this.c).invoke(obj);
            case 14:
                return (StoryTemplatesContainerData) ((mjm0.a) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.e) ((ed5) this.c).invoke(obj);
            case 16:
                return (Boolean) ((kdw) this.c).invoke(obj);
            case 17:
                return (List) ((kdw) this.c).invoke(obj);
            case 18:
                return (uss0) ((s1f0) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((v9t0) this.c).invoke(obj);
            case 21:
                return (utk) ((kso) this.c).invoke(obj);
            case 22:
                return (xiw0) ((q3s0) this.c).invoke(obj);
        }
    }

    @Override // xsna.exy0.a
    public void b() {
        WeakReference weakReference = jpy0.this.b;
        MyTargetActivity myTargetActivity = weakReference == null ? null : (MyTargetActivity) weakReference.get();
        if (myTargetActivity != null) {
            myTargetActivity.finish();
        }
    }

    @Override // xsna.a0i
    public void c(zzh zzhVar) {
        m2g0 m2g0Var = (m2g0) this.c;
        t2g0 a = a3g0.a(zzhVar);
        if (a != null) {
            m2g0Var.a(a);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        ((wlw0) this.c).invoke(cVar.a);
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        StaticAdsItemViewEvent staticAdsItemViewEvent;
        l340 l340Var = (l340) this.c;
        if (cVar instanceof c.b) {
            staticAdsItemViewEvent = twk0.b;
        } else if (cVar instanceof c.a) {
            staticAdsItemViewEvent = swk0.b;
        } else if (cVar instanceof c.C0669c) {
            staticAdsItemViewEvent = new uwk0(((c.C0669c) cVar).a);
        } else {
            if (!(cVar instanceof c.e) && !(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            staticAdsItemViewEvent = null;
        }
        if (staticAdsItemViewEvent != null) {
            l340Var.a(staticAdsItemViewEvent);
        }
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return RTCStatsExtensionsKt.a((String) this.c, (RTCStats) obj, qcyVar);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((kdw) this.c).invoke(obj)).booleanValue();
    }
}
