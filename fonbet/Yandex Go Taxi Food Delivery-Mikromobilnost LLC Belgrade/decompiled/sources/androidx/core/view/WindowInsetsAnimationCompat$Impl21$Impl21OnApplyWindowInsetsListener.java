package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.PathInterpolator;
import defpackage.k751;
import defpackage.kz;
import defpackage.n751;
import defpackage.op31;
import defpackage.q651;
import defpackage.u1w;
import defpackage.u651;
import defpackage.x651;
import defpackage.y651;
import java.util.Collections;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener implements View.OnApplyWindowInsetsListener {
    private static final int COMPAT_ANIMATION_DURATION_IME = 160;
    private static final int COMPAT_ANIMATION_DURATION_SYSTEM_BAR = 250;
    final e mCallback;
    private n751 mLastInsets;

    public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener(View view, e eVar) {
        this.mCallback = eVar;
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(view);
        this.mLastInsets = a != null ? new x651(a).a.h() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.mLastInsets = n751.h(view, windowInsets);
            return f.j(view, windowInsets);
        }
        final n751 h = n751.h(view, windowInsets);
        k751 k751Var = h.a;
        if (this.mLastInsets == null) {
            WeakHashMap weakHashMap = b.a;
            this.mLastInsets = op31.a(view);
        }
        if (this.mLastInsets == null) {
            this.mLastInsets = h;
            return f.j(view, windowInsets);
        }
        e k = f.k(view);
        if (k != null && Objects.equals(k.mDispachedInsets, h)) {
            return f.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        n751 n751Var = this.mLastInsets;
        int i = 1;
        while (i <= 512) {
            u1w g = k751Var.g(i);
            u1w g2 = n751Var.a.g(i);
            int i2 = g.a;
            int i3 = g.d;
            int i4 = g.c;
            int i5 = g.b;
            int i6 = g2.a;
            int i7 = g2.d;
            int i8 = g2.c;
            int i9 = g2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        final int i12 = i10 | i11;
        if (i12 == 0) {
            this.mLastInsets = h;
            return f.j(view, windowInsets);
        }
        final n751 n751Var2 = this.mLastInsets;
        final u651 u651Var = new u651(i12, (i10 & 8) != 0 ? f.e : (i11 & 8) != 0 ? f.f : (i10 & 519) != 0 ? f.g : (i11 & 519) != 0 ? f.h : null, (i12 & 8) != 0 ? 160L : 250L);
        u651Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(u651Var.a.b());
        u1w g3 = k751Var.g(i12);
        u1w g4 = n751Var2.a.g(i12);
        int min = Math.min(g3.a, g4.a);
        int i13 = g3.b;
        int i14 = g4.b;
        int min2 = Math.min(i13, i14);
        int i15 = g3.c;
        int i16 = g4.c;
        int min3 = Math.min(i15, i16);
        int i17 = g3.d;
        int i18 = g4.d;
        q651 q651Var = new q651(u1w.c(min, min2, min3, Math.min(i17, i18)), u1w.c(Math.max(g3.a, g4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        f.g(view, u651Var, h, false);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                u651Var.a.e(valueAnimator.getAnimatedFraction());
                n751 n751Var3 = h;
                n751 n751Var4 = n751Var2;
                float c = u651Var.a.c();
                int i19 = i12;
                PathInterpolator pathInterpolator = f.e;
                x651 x651Var = new x651(n751Var3);
                int i20 = 1;
                while (true) {
                    y651 y651Var = x651Var.a;
                    if (i20 > 512) {
                        f.h(view, y651Var.h(), Collections.singletonList(u651Var));
                        return;
                    }
                    if ((i19 & i20) == 0) {
                        y651Var.b(i20, n751Var3.a.g(i20));
                    } else {
                        u1w g5 = n751Var3.a.g(i20);
                        u1w g6 = n751Var4.a.g(i20);
                        float f = 1.0f - c;
                        y651Var.b(i20, n751.e(g5, (int) (((g5.a - g6.a) * f) + 0.5d), (int) (((g5.b - g6.b) * f) + 0.5d), (int) (((g5.c - g6.c) * f) + 0.5d), (int) (((g5.d - g6.d) * f) + 0.5d)));
                    }
                    i20 <<= 1;
                }
            }
        });
        duration.addListener(new AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                u651Var.a.e(1.0f);
                f.f(view, u651Var);
            }
        });
        OneShotPreDrawListener.add(view, new kz(view, u651Var, q651Var, duration, 8));
        this.mLastInsets = h;
        return f.j(view, windowInsets);
    }
}
