package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryMemoryType;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.posting.presentation.video.search.SearchVideoPickerFragment;
import com.vk.posting.presentation.video.search.a;
import com.vk.sharing.core.view.TargetSendActionView;
import com.vk.story.viewer.impl.presentation.stories.view.reactions.OnboardingType;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import me.grishka.appkit.views.UsableRecyclerView;
import ru.ok.gleffects.EffectHolder;
import xsna.nms0;
import xsna.ouj0;
import xsna.syc;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class jk9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jk9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        LottieAnimationView lottieAnimationView;
        ViewGroup Wj;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        switch (this.b) {
            case 0:
                zd9 zd9Var = (zd9) this.c;
                qj9 qj9Var = zd9Var.s.d;
                if (qj9Var != null) {
                    qj9Var.onStart();
                }
                zd9Var.x = System.currentTimeMillis();
                zd9Var.b.postDelayed(zd9Var.E, 32L);
                if (g620.f().getExperiments().c()) {
                    ((mo9) zd9Var.getCameraPreview()).g.getClass();
                    return;
                }
                return;
            case 1:
                syc sycVar = (syc) this.c;
                syc.a aVar = sycVar.g;
                if (((aVar instanceof syc.a.f) || (aVar instanceof syc.a.e)) && (view = sycVar.d) != null && (lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.lottie)) != null) {
                    lottieAnimationView.clearAnimation();
                }
                sycVar.f = false;
                View view2 = sycVar.d;
                if (view2 != null) {
                    sycVar.c((ViewGroup) view2.getParent());
                    return;
                }
                return;
            case 2:
                ((n3g) this.c).g = false;
                return;
            case 3:
                DeprecatedAttachActivity.g gVar = (DeprecatedAttachActivity.g) this.c;
                DeprecatedAttachActivity deprecatedAttachActivity = DeprecatedAttachActivity.this;
                androidx.lifecycle.f fVar = gVar.n;
                if (!(fVar instanceof iin0) || (Wj = ((iin0) fVar).Wj(deprecatedAttachActivity)) == null || gVar.m == Wj) {
                    return;
                }
                if (Wj.getParent() != null) {
                    ((ViewGroup) Wj.getParent()).removeView(Wj);
                }
                deprecatedAttachActivity.D.removeAllViews();
                Wj.setVisibility(0);
                deprecatedAttachActivity.D.addView(Wj);
                gVar.m = Wj;
                deprecatedAttachActivity.G0 = null;
                return;
            case 4:
                ((EffectHolder) this.c).lambda$onStopRecording$4();
                return;
            case 5:
                whz whzVar = ((vhz) this.c).d;
                whzVar.getView().setAlpha(1.0f);
                whzVar.setVideoFocused(true);
                return;
            case 6:
                jd80 jd80Var = (jd80) this.c;
                jd80Var.k.a();
                jd80Var.f = true;
                StoryEntry invoke = jd80Var.c.invoke();
                if (invoke == null || (clickableStickers = invoke.X) == null || (list = clickableStickers.d) == null) {
                    return;
                }
                List<ClickableSticker> list2 = list;
                boolean z = list2 instanceof Collection;
                if (!z || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((ClickableSticker) it.next()) instanceof ClickableClip) {
                            for (Object obj : list2) {
                                if (((ClickableSticker) obj) instanceof ClickableClip) {
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.vk.dto.stories.model.clickable.ClickableClip");
                                    }
                                    if (epx.f(((ClickableClip) obj).e, invoke.d)) {
                                        jd80Var.a(OnboardingType.CLIP_REPOST);
                                        return;
                                    }
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                }
                if (!z || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((ClickableSticker) it2.next()) instanceof ClickablePost) {
                            for (Object obj2 : list2) {
                                if (((ClickableSticker) obj2) instanceof ClickablePost) {
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.vk.dto.stories.model.clickable.ClickablePost");
                                    }
                                    if (epx.f(((ClickablePost) obj2).f, invoke.d)) {
                                        jd80Var.a(OnboardingType.POST_REPOST);
                                        return;
                                    }
                                    return;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                }
                if (!z || !list2.isEmpty()) {
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((ClickableSticker) it3.next()).Cb() == WebStickerType.REPLY) {
                            if (epx.f(invoke.P, invoke.d)) {
                                jd80Var.a(OnboardingType.USER_STORY_REPOST);
                                return;
                            } else {
                                jd80Var.a(OnboardingType.STORY_REPOST);
                                return;
                            }
                        }
                    }
                }
                if (z && list2.isEmpty()) {
                    return;
                }
                Iterator<T> it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (((ClickableSticker) it4.next()) instanceof ClickablePhoto) {
                        if (invoke.C0 == StoryMemoryType.AVATAR) {
                            jd80Var.a(OnboardingType.USER_STORY_AVATAR);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 7:
                ((gzs) this.c).invoke();
                return;
            case 8:
                ihd0 ihd0Var = (ihd0) this.c;
                synchronized (ihd0Var.h) {
                    try {
                        if (ihd0Var.i) {
                            return;
                        }
                        ihd0Var.j.close();
                        ihd0Var.k.release();
                        ihd0Var.o.a();
                        ihd0Var.i = true;
                        return;
                    } finally {
                    }
                }
            case 9:
                rsf0 rsf0Var = (rsf0) this.c;
                bpn0 bpn0Var = t65.a;
                t65.a(rsf0Var.a().getSelectedCellView());
                return;
            case 10:
                SearchVideoPickerFragment searchVideoPickerFragment = (SearchVideoPickerFragment) this.c;
                int i = SearchVideoPickerFragment.U;
                a.b bVar = a.b.b;
                searchVideoPickerFragment.getClass();
                xn50.a.c(searchVideoPickerFragment, bVar);
                return;
            case 11:
                ouj0.a aVar2 = (ouj0.a) this.c;
                ouj0.this.d.e(aVar2.a);
                return;
            case 12:
                ValueAnimator valueAnimator = ((TargetSendActionView) this.c).g.e;
                if (valueAnimator != null) {
                    valueAnimator.end();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            case 13:
                ((IUnityAdsTokenListener) this.c).onUnityAdsTokenReady(null);
                return;
            case 14:
                Runnable runnable = (Runnable) this.c;
                int i2 = UsableRecyclerView.J;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(th.getMessage());
                    sb.append(", current_screen_name: ");
                    UiTracker uiTracker = UiTracker.a;
                    sb.append(UiTracker.d());
                    throw new UsableRecyclerView.u(sb.toString(), th);
                }
            case 15:
                ((wwq0) ((vxq0) this.c).u.getValue()).d();
                return;
            case 16:
                nms0.c cVar = (nms0.c) this.c;
                cVar.b.postVsyncCallback(cVar);
                return;
            case 17:
                one.video.calls.sdk_private.x xVar = (one.video.calls.sdk_private.x) this.c;
                try {
                    xVar.s = true;
                    while (xVar.s) {
                        xVar.j();
                    }
                    return;
                } catch (Throwable th2) {
                    if (xVar.s) {
                        xVar.f.w(th2);
                        return;
                    } else {
                        th2.toString();
                        return;
                    }
                }
            case 18:
                yads.pi3.a((yads.pi3) this.c);
                return;
            default:
                ((pbz0) this.c).getClass();
                return;
        }
    }
}
