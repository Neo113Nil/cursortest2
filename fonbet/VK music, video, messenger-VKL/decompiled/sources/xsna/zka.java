package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.wka;

/* compiled from: CategoryItemAnimator.kt */
/* loaded from: classes16.dex */
public final class zka extends AnimatorListenerAdapter {
    public final /* synthetic */ wka b;
    public final /* synthetic */ wka.b c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ View e;

    public zka(wka wkaVar, wka.b bVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.b = wkaVar;
        this.c = bVar;
        this.d = viewPropertyAnimator;
        this.e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setListener(null);
        View view = this.e;
        view.setAlpha(1.0f);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        wka.b bVar = this.c;
        hla hlaVar = bVar.b;
        wka wkaVar = this.b;
        wkaVar.h(hlaVar);
        ArrayList<hla> arrayList = wkaVar.w;
        ttp0.a(arrayList).remove(bVar.b);
        wkaVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        hla hlaVar = this.c.b;
        this.b.getClass();
    }
}
