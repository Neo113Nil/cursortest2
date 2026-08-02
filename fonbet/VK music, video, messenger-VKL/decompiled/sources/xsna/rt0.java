package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import androidx.preference.Preference;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.BiometricsLockSettingsFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.media.recorder.RecorderBase;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import xsna.lnj.a;
import xsna.lnj.b;
import xsna.lnj.c;
import xsna.myt0;
import xsna.p8c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rt0 implements io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.l, pcs, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.s, RecorderBase.d, myt0.a, Preference.c, io.reactivex.rxjava3.functions.c, h9l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.media.recorder.RecorderBase.d
    public void a(File file, boolean z) {
        rk9 rk9Var = (rk9) this.c;
        if (z) {
            qj9 qj9Var = rk9Var.d;
            if (qj9Var != null) {
                qj9Var.f(file, false);
            }
        } else {
            qj9 qj9Var2 = rk9Var.d;
            if (qj9Var2 != null) {
                qj9Var2.onFinish(file);
            }
        }
        com.vk.media.recorder.f fVar = rk9Var.a;
        if (fVar != null) {
            fVar.i = null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (List) ((p22) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((r45) obj2).invoke(obj);
            case 3:
            case 4:
            case 5:
            case 7:
            case 10:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 20:
            default:
                return (it80) ((fo20) obj2).invoke(obj);
            case 6:
                return (mj9) ((x50) obj2).invoke(obj);
            case 8:
                return (hda) ((yx0) obj2).invoke(obj);
            case 9:
                return (Clips) ((t3b) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((mvq) obj2).invoke(obj);
            case 15:
                return (Integer) ((g3t) obj2).invoke(obj);
            case 18:
                return (it80) ((x50) obj2).invoke(obj);
            case 19:
                return (LikesDeleteResponseDto) ((fnz) obj2).invoke(obj);
            case 21:
                return (d210) ((w110) obj2).invoke(obj);
            case 22:
                return (List) ((com.vk.music.playlist.a) obj2).invoke(obj);
            case 23:
                return (tt70) ((w110) obj2).invoke(obj);
            case 24:
                return (x960) ((w110) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.b0) ((wu60) obj2).invoke(obj);
            case 26:
                return (p8c0.a) ((fo20) obj2).invoke(obj);
            case 27:
                int i2 = PostingAttachLocationFragment.I0;
                return (io.reactivex.rxjava3.core.t) ((fcc0) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((w110) obj2).invoke(obj);
        }
    }

    @Override // xsna.myt0.a
    public void b() {
        lnj lnjVar = (lnj) this.c;
        View view = lnjVar.b;
        View view2 = lnjVar.c;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(lnjVar.new c(4));
        animatorSet.addListener(lnjVar.new b(lnjVar.g));
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(lnj.i);
        lnjVar.f = animatorSet;
        Pair pair = lnjVar.d ? new Pair(Integer.valueOf(view2.getBottom()), 0) : new Pair(0, Integer.valueOf(view2.getBottom()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view2.setAlpha(1.0f);
        view2.setVisibility(0);
        if (lnjVar.d) {
            view2.setBottom(intValue);
        } else {
            view2.setTop(intValue);
        }
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
        ofInt.addUpdateListener(lnjVar.new a());
        AnimatorSet animatorSet2 = lnjVar.f;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat, ofFloat2, ofInt);
        }
        AnimatorSet animatorSet3 = lnjVar.f;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        l7m f = m7m.f(debugDevSettingsFragment);
        ((VkHealthPermissionsComponent) j6i.b(f, VkHealthPermissionsComponent.class)).Wb().j(debugDevSettingsFragment.requireContext(), RequestedMiniApp.VK_WORKOUT, null, new g22(12, debugDevSettingsFragment, ((VkWorkoutComponent) j6i.b(f, VkWorkoutComponent.class)).Te()));
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        BiometricsLockSettingsFragment biometricsLockSettingsFragment = (BiometricsLockSettingsFragment) this.c;
        int i = BiometricsLockSettingsFragment.Y;
        biometricsLockSettingsFragment.getFeature().C(a.j.b);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return new xz40((a550) this.c);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ((AdminCommunitiesDataSource) this.c).b.S(2, new com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.a(yVar));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 4:
                return ((Boolean) ((s55) this.c).invoke(obj)).booleanValue();
            case 14:
                return ((Boolean) ((x50) this.c).invoke(obj)).booleanValue();
            case 16:
                return ((Boolean) ((x50) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((zqh) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final va9 va9Var = (va9) this.c;
        final ya9 ya9Var = new ya9(rVar);
        ((rew0) va9Var.f.getValue()).j(ya9Var);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.ta9
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                ((rew0) va9.this.f.getValue()).k(ya9Var);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (qih0) ((f21) this.c).invoke(obj, obj2);
    }
}
