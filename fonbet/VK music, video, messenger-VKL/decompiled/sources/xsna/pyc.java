package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.feed.item.onboarding.FastForwardOnboardingView;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.syc;
import xsna.w8e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pyc implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pyc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        switch (this.b) {
            case 0:
                syc.a aVar = (syc.a) this.c;
                syc sycVar = (syc) this.d;
                ViewGroup viewGroup = (ViewGroup) this.e;
                q8e q8eVar = (q8e) this.f;
                View view = (View) this.g;
                int i = 1;
                if (aVar instanceof syc.a.f) {
                    g620.f().e().f().i();
                    w8e w8eVar = sycVar.a;
                    w8eVar.getClass();
                    int height = (int) (viewGroup.getHeight() * 0.15f);
                    long j = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
                    long j2 = 2250 - j;
                    DecelerateInterpolator decelerateInterpolator = w8eVar.d;
                    w8e.a aVar2 = new w8e.a(j2, height, decelerateInterpolator, decelerateInterpolator);
                    if (!w8eVar.c) {
                        w8eVar.c = true;
                        w8eVar.b = false;
                        w8eVar.a.uo(false);
                        q8eVar.smoothScrollBy(0, height, decelerateInterpolator, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                        q8eVar.postDelayed(new v8e(w8eVar, q8eVar, aVar2, 0), j + j2);
                    }
                    sycVar.f(view, 750L, Integer.valueOf(R.string.clip_feed_onboarding));
                    return;
                }
                if (aVar instanceof syc.a.d) {
                    g620.f().e().f().g();
                    cp2.c(view, 250L, 0L, new ke9(1, view, sycVar), null, 10);
                    return;
                }
                if (aVar instanceof syc.a.e) {
                    sycVar.f(view, 0L, Integer.valueOf(R.string.im_chat_clips_scroll_onboarding));
                    return;
                }
                if (aVar instanceof syc.a.b) {
                    cp2.c(view, 250L, 0L, new ne9(2, view, sycVar), null, 10);
                    return;
                }
                if (!(aVar instanceof syc.a.c)) {
                    if (!aVar.equals(syc.a.C3705a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g620.f().e().f().h();
                    sycVar.f(view, 750L, Integer.valueOf(R.string.clip_feed_author_onboarding));
                    return;
                }
                syc.a.c cVar = (syc.a.c) aVar;
                VkPlaceholder.b.c cVar2 = null;
                FastForwardOnboardingView fastForwardOnboardingView = view instanceof FastForwardOnboardingView ? (FastForwardOnboardingView) view : null;
                if (fastForwardOnboardingView == null) {
                    return;
                }
                fastForwardOnboardingView.setMiddle(new VkPlaceholder.b(cVar2, new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.clips_fast_forward_onboarding_text)), i));
                fastForwardOnboardingView.setOnTouchListener(new tyc(fastForwardOnboardingView, cVar, System.currentTimeMillis(), sycVar));
                cp2.c(viewGroup, 250L, 0L, null, null, 14);
                return;
            default:
                v7i v7iVar = (v7i) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
                AtomicReference atomicReference = (AtomicReference) this.e;
                AtomicInteger atomicInteger = (AtomicInteger) this.f;
                v7i v7iVar2 = (v7i) this.g;
                if (!v7iVar.b()) {
                    atomicBoolean.set(true);
                    synchronized (v7iVar.d) {
                        th = v7iVar.b;
                    }
                    if (th != null) {
                        while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
                        }
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    if (atomicBoolean.get()) {
                        v7iVar2.a((Throwable) atomicReference.get());
                        return;
                    } else {
                        v7iVar2.e();
                        return;
                    }
                }
                return;
        }
    }
}
