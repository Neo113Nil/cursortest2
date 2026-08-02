package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.preference.Preference;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoFeedClipsBlockItemsGroupsFullResultDto;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.sdk.shared.item.common.description.c;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.stickers.bridge.b;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.gl.objects.SimpleGLProgram;
import ru.ok.tensorflow.classification.ClassifierWithRegression;
import ru.ok.tensorflow.tflite.InterpreterWrapper;
import xsna.c4u;
import xsna.lnj.a;
import xsna.lnj.b;
import xsna.lnj.c;
import xsna.lsv;
import xsna.myt0;
import xsna.ub9;
import xsna.uoq;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.c, ub9.c, InterpreterWrapper.RunnableOnGPU, r2m, io.reactivex.rxjava3.functions.m, myt0.a, Preference.c, SwipeDrawableRefreshLayout.g, h9l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 2:
                return (Pair) ((cf3) this.c).invoke(obj, obj2);
            case 27:
                return (c4u.a) ((com.vk.movika.tools.controls.seekbar.m) this.c).invoke(obj, obj2);
            default:
                return (lsv.b) ((cf3) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        re9 re9Var = (re9) this.c;
        re9Var.c.execute(new cy3(2, re9Var, aVar));
        return "triggerAePrecapture";
    }

    @Override // xsna.myt0.a
    public void b() {
        lnj lnjVar = (lnj) this.c;
        View view = lnjVar.b;
        View view2 = lnjVar.c;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(lnjVar.new c(0));
        animatorSet.addListener(lnjVar.new b(null));
        animatorSet.setDuration(225L);
        animatorSet.setInterpolator(lnj.h);
        lnjVar.e = animatorSet;
        Pair pair = lnjVar.d ? new Pair(0, Integer.valueOf(view2.getBottom())) : new Pair(Integer.valueOf(view2.getBottom()), 0);
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setVisibility(0);
        view2.setVisibility(0);
        if (lnjVar.d) {
            view2.setBottom(intValue);
        } else {
            view2.setTop(intValue);
        }
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
        ofInt.addUpdateListener(lnjVar.new a());
        AnimatorSet animatorSet2 = lnjVar.e;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofInt);
        }
        AnimatorSet animatorSet3 = lnjVar.e;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        l7m f = m7m.f(debugDevSettingsFragment);
        ((VkHealthPermissionsComponent) j6i.b(f, VkHealthPermissionsComponent.class)).Wb().j(debugDevSettingsFragment.requireContext(), RequestedMiniApp.VK_WORKOUT, null, new l22(11, debugDevSettingsFragment, ((VkWorkoutComponent) j6i.b(f, VkWorkoutComponent.class)).Te()));
        return true;
    }

    @Override // xsna.r2m
    public void g(com.vk.clips.sdk.shared.item.common.description.c cVar) {
        ClipItemViewEvent w4dVar;
        ClipItemViewEvent clipItemViewEvent;
        u6d u6dVar = ((h1d) this.c).b;
        if (cVar instanceof c.b) {
            clipItemViewEvent = u4d.b;
        } else if (cVar instanceof c.a) {
            clipItemViewEvent = t4d.b;
        } else {
            if (cVar instanceof c.C0669c) {
                w4dVar = new v4d(((c.C0669c) cVar).a);
            } else if (cVar instanceof c.e) {
                w4dVar = new x4d(((c.e) cVar).a);
            } else {
                if (!(cVar instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                w4dVar = new w4d(((c.d) cVar).a);
            }
            clipItemViewEvent = w4dVar;
        }
        u6dVar.a(clipItemViewEvent);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
        qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
        ((boq) faveFeedFragment.W.getValue()).a(new uoq.c(xn60.d.b.b));
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new bl40((xk40) this.c);
    }

    @Override // ru.ok.tensorflow.tflite.InterpreterWrapper.RunnableOnGPU
    public void run(SimpleGLProgram simpleGLProgram) {
        ((ClassifierWithRegression) this.c).lambda$runNetworkGPU$1(simpleGLProgram);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 11:
                return ((Boolean) ((vt1) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((i4e) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (AboutVideoItem.c0) ((m7) this.c).invoke(obj);
            case 1:
                return (jks) ((vt1) this.c).invoke(obj);
            case 2:
            case 7:
            case 8:
            case 9:
            case 11:
            case 19:
            case 20:
            case 22:
            case 24:
            default:
                return (ngx0) ((wd8) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((m7) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((w96) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((yf7) this.c).invoke(obj);
            case 6:
                return (k08) ((vt1) this.c).invoke(obj);
            case 10:
                return (rms0) ((vt1) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((i4e) this.c).invoke(obj);
            case 13:
                return (List) ((i4e) this.c).invoke(obj);
            case 14:
                return (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) ((vt1) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((ij8) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((i4e) this.c).invoke(obj);
            case 17:
                return (b.a) ((x62) this.c).invoke(obj);
            case 18:
                return (String) ((vt1) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((ij8) this.c).invoke(obj);
            case 23:
                return (it80) ((vt1) this.c).invoke(obj);
            case 25:
                return (Boolean) ((vt1) this.c).invoke(obj);
        }
    }
}
