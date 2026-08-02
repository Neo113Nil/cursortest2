package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.vault.flexsdk.descriptors.widget.Vault;
import com.yandex.go.vault.flexsdk.descriptors.widget.animation.LockOverlayView;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.a;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.b;
import com.yandex.go.vault.flexsdk.shared.VaultPaletteDto;
import defpackage.a431;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes14.dex */
public final class b431 extends y {
    public final ArrayList A;
    public Bitmap B;
    public Integer C;
    public boolean D;
    public final ValueAnimator a;
    public final ValueAnimator b;
    public final tls c;
    public final wx11 w;
    public final a x;
    public final ArrayList y;
    public final ArrayList z;

    public b431(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, tls tlsVar, wx11 wx11Var, a aVar) {
        super(new a10(18));
        this.a = valueAnimator;
        this.b = valueAnimator2;
        this.c = tlsVar;
        this.w = wx11Var;
        this.x = aVar;
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [com.yandex.go.vault.flexsdk.descriptors.widget.animation.VaultsPagerAdapter$VaultsPagerViewHolder$bind$5] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        int color;
        final a431 a431Var = (a431) x0Var;
        View view = a431Var.a;
        Vault vault = (Vault) getItem(i);
        View view2 = a431Var.a;
        a431Var.N = vault;
        final b431 b431Var = a431Var.S;
        Bitmap bitmap = b431Var.B;
        a aVar = b431Var.x;
        if (bitmap == null || b431Var.C == null) {
            return;
        }
        b431Var.D = false;
        ShimmeringBar shimmeringBar = (ShimmeringBar) view2.findViewById(b9h0.shimmer);
        final ClickableImageView clickableImageView = (ClickableImageView) view2.findViewById(b9h0.first_frame);
        GoImageView goImageView = (GoImageView) view2.findViewById(b9h0.shadow_top);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view2.findViewById(b9h0.vault_title);
        a431Var.O = (LottieAnimationView) view2.findViewById(b9h0.lottie_top_container);
        a431Var.P = (LottieAnimationView) view2.findViewById(b9h0.lottie_main_container);
        a431Var.Q = (LockOverlayView) view2.findViewById(b9h0.lock_overlay);
        b431Var.A.add(new wx11(18, appCompatTextView));
        String str = vault.f;
        int i2 = vault.g;
        String str2 = vault.b;
        Integer S = q5z.S(str);
        if (S != null) {
            goImageView.getDrawable().setTint(S.intValue());
        }
        appCompatTextView.setText(str2);
        int i3 = z331.a[vault.a.ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            color = view2.getContext().getColor(mqg0.white);
        } else if (i3 == 2) {
            color = qje.t(xng0.controlMain, view2.getContext());
        } else {
            if (i3 != 3) {
                w511.b();
                return;
            }
            color = view2.getContext().getColor(mqg0.component_purple_high);
        }
        Integer S2 = q5z.S(vault.c);
        if (S2 != null) {
            color = S2.intValue();
        }
        appCompatTextView.setTextColor(color);
        LottieAnimationView lottieAnimationView = a431Var.O;
        if (lottieAnimationView == null) {
            lottieAnimationView = null;
        }
        LottieAnimationView lottieAnimationView2 = a431Var.P;
        if (lottieAnimationView2 == null) {
            lottieAnimationView2 = null;
        }
        Iterator it = scc.g(lottieAnimationView, lottieAnimationView2).iterator();
        while (it.hasNext()) {
            ((LottieAnimationView) it.next()).setImageAssetsFolder("lottie_loader");
        }
        clickableImageView.setContentDescription(str2 + " " + b431Var.C + " / " + i2 + " ");
        a431Var.R = new Animator.AnimatorListener() { // from class: com.yandex.go.vault.flexsdk.descriptors.widget.animation.VaultsPagerAdapter$VaultsPagerViewHolder$bind$5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                LottieAnimationView lottieAnimationView3 = a431.this.O;
                if (lottieAnimationView3 == null) {
                    lottieAnimationView3 = null;
                }
                lottieAnimationView3.setVisibility(4);
                clickableImageView.setVisibility(4);
                LottieAnimationView lottieAnimationView4 = a431.this.P;
                if (lottieAnimationView4 == null) {
                    lottieAnimationView4 = null;
                }
                lottieAnimationView4.setVisibility(0);
                b431Var.a.start();
                LottieAnimationView lottieAnimationView5 = a431.this.P;
                (lottieAnimationView5 != null ? lottieAnimationView5 : null).playAnimation();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
            }
        };
        LottieAnimationView lottieAnimationView3 = a431Var.O;
        if (lottieAnimationView3 == null) {
            lottieAnimationView3 = null;
        }
        lottieAnimationView3.addLottieOnCompositionLoadedListener(new y331(a431Var, clickableImageView, goImageView, S));
        LottieAnimationView lottieAnimationView4 = a431Var.O;
        if (lottieAnimationView4 == null) {
            lottieAnimationView4 = null;
        }
        lottieAnimationView4.setRepeatCount(-1);
        b431Var.y.add(new pv01(28, a431Var));
        b431Var.z.add(new zr01(23, b431Var, a431Var));
        Bitmap bitmap2 = b431Var.B;
        if (bitmap2 != null) {
            LockOverlayView lockOverlayView = a431Var.Q;
            if (lockOverlayView == null) {
                lockOverlayView = null;
            }
            lockOverlayView.setKeyBitmap(bitmap2);
        }
        Integer num = b431Var.C;
        if (num != null) {
            int intValue = num.intValue();
            LockOverlayView lockOverlayView2 = a431Var.Q;
            if (lockOverlayView2 == null) {
                lockOverlayView2 = null;
            }
            lockOverlayView2.setKeyAmount(intValue);
        }
        LockOverlayView lockOverlayView3 = a431Var.Q;
        if (lockOverlayView3 == null) {
            lockOverlayView3 = null;
        }
        lockOverlayView3.setMaxKeyAmount(i2);
        LottieAnimationView lottieAnimationView5 = a431Var.O;
        if (lottieAnimationView5 == null) {
            lottieAnimationView5 = null;
        }
        lottieAnimationView5.setAnimation(view2.getContext().getAssets().open("lottie_lock.json"), "lottie_lock_key");
        String str3 = vault.d;
        e331 e331Var = new e331(i4, clickableImageView, shimmeringBar);
        b bVar = aVar.a;
        ru.yandex.taxi.utils.a.c(bVar.z.b().i(new obv(str3, null, 6, 0)), new wx11(20, e331Var), new bgc(12), bVar.Jg());
        aVar.a(vault.e, new wx11(19, a431Var));
        b431Var.a.addUpdateListener(new qx7(a431Var, i));
        clickableImageView.setDebounceClickListener(new bh11(17, a431Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(llh0.layout_pager_item, viewGroup, false);
        int i2 = b9h0.first_frame;
        ClickableImageView clickableImageView = (ClickableImageView) cma1.O(i2, inflate);
        if (clickableImageView != null) {
            i2 = b9h0.lock_overlay;
            LockOverlayView lockOverlayView = (LockOverlayView) cma1.O(i2, inflate);
            if (lockOverlayView != null) {
                i2 = b9h0.lottie_main_container;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) cma1.O(i2, inflate);
                if (lottieAnimationView != null) {
                    i2 = b9h0.lottie_top_container;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) cma1.O(i2, inflate);
                    if (lottieAnimationView2 != null) {
                        i2 = b9h0.shadow;
                        GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
                        if (goImageView != null) {
                            i2 = b9h0.shadow_top;
                            if (((GoImageView) cma1.O(i2, inflate)) != null) {
                                i2 = b9h0.shimmer;
                                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i2, inflate);
                                if (shimmeringBar != null) {
                                    i2 = b9h0.space;
                                    if (((Space) cma1.O(i2, inflate)) != null) {
                                        i2 = b9h0.vault_title;
                                        if (((AppCompatTextView) cma1.O(i2, inflate)) != null) {
                                            l7n l7nVar = new l7n((ConstraintLayout) inflate, clickableImageView, lockOverlayView, lottieAnimationView, lottieAnimationView2, goImageView, shimmeringBar);
                                            int i3 = (int) (Resources.getSystem().getDisplayMetrics().widthPixels / 1.3d);
                                            c.D(i3, i3, shimmeringBar);
                                            c.D(i3, i3, clickableImageView);
                                            c.D(goImageView.getLayoutParams().width, i3, goImageView);
                                            c.D(i3, i3, lottieAnimationView);
                                            c.D(i3, i3, lottieAnimationView2);
                                            float f = i3;
                                            lockOverlayView.setPaintOffset(f / 5.6f);
                                            shimmeringBar.setGradientWidth((int) (f / 1.4f));
                                            a aVar = this.x;
                                            VaultPaletteDto vaultPaletteDto = aVar.a.E.c;
                                            Integer S = q5z.S(vaultPaletteDto != null ? vaultPaletteDto.f : null);
                                            if (S != null) {
                                                shimmeringBar.setEdgeColor(S.intValue());
                                            }
                                            VaultPaletteDto vaultPaletteDto2 = aVar.a.E.c;
                                            Integer S2 = q5z.S(vaultPaletteDto2 != null ? vaultPaletteDto2.g : null);
                                            if (S2 != null) {
                                                shimmeringBar.setCenterColor(S2.intValue());
                                            }
                                            return new a431(this, l7nVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
