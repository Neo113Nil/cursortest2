package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.x0;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.vault.flexsdk.descriptors.widget.Vault;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.VaultsPagerAdapter$VaultsPagerViewHolder$bind$5;
import defpackage.a431;

/* loaded from: classes14.dex */
public final class a431 extends x0 {
    public Vault N;
    public LottieAnimationView O;
    public LottieAnimationView P;
    public LockOverlayView Q;
    public VaultsPagerAdapter$VaultsPagerViewHolder$bind$5 R;
    public final /* synthetic */ b431 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a431(b431 b431Var, l7n l7nVar) {
        super(l7nVar.b);
        this.S = b431Var;
    }

    public final void W() {
        b431 b431Var = this.S;
        ValueAnimator valueAnimator = b431Var.b;
        if (b431Var.D) {
            return;
        }
        Integer num = b431Var.C;
        int intValue = num != null ? num.intValue() : 0;
        Vault vault = this.N;
        if (intValue < (vault == null ? null : vault).g) {
            wx11 wx11Var = b431Var.w;
            if (vault == null) {
                vault = null;
            }
            int i = vault.g;
            Integer num2 = b431Var.C;
            wx11Var.invoke(Integer.valueOf(i - (num2 != null ? num2.intValue() : 0)));
            return;
        }
        LottieAnimationView lottieAnimationView = this.P;
        if (lottieAnimationView == null) {
            lottieAnimationView = null;
        }
        if (lottieAnimationView.getComposition() == null) {
            b431Var.x.a.Mg(null);
            return;
        }
        b431Var.D = true;
        LottieAnimationView lottieAnimationView2 = this.O;
        if (lottieAnimationView2 == null) {
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.setRepeatCount(-1);
        tls tlsVar = b431Var.c;
        Vault vault2 = this.N;
        tlsVar.invoke((vault2 != null ? vault2 : null).a);
        valueAnimator.addUpdateListener(new mxp0(26, this));
        valueAnimator.start();
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.vault.flexsdk.descriptors.widget.animation.VaultsPagerAdapter$VaultsPagerViewHolder$onVaultClicked$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LockOverlayView lockOverlayView = a431.this.Q;
                if (lockOverlayView == null) {
                    lockOverlayView = null;
                }
                lockOverlayView.setVisibility(4);
                LottieAnimationView lottieAnimationView3 = a431.this.O;
                if (lottieAnimationView3 == null) {
                    lottieAnimationView3 = null;
                }
                lottieAnimationView3.playAnimation();
                a431 a431Var = a431.this;
                LottieAnimationView lottieAnimationView4 = a431Var.O;
                if (lottieAnimationView4 == null) {
                    lottieAnimationView4 = null;
                }
                VaultsPagerAdapter$VaultsPagerViewHolder$bind$5 vaultsPagerAdapter$VaultsPagerViewHolder$bind$5 = a431Var.R;
                lottieAnimationView4.addAnimatorListener(vaultsPagerAdapter$VaultsPagerViewHolder$bind$5 != null ? vaultsPagerAdapter$VaultsPagerViewHolder$bind$5 : null);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }
}
