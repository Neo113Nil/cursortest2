package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Hold.java */
/* loaded from: classes13.dex */
public final class fav extends p4u0 {
    @Override // xsna.p4u0
    @NonNull
    public final Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable gnp0 gnp0Var, @Nullable gnp0 gnp0Var2) {
        return ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.p4u0
    @NonNull
    public final Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable gnp0 gnp0Var, @Nullable gnp0 gnp0Var2) {
        return ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
