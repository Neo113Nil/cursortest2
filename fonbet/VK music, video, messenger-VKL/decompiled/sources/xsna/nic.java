package xsna;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes13.dex */
public final class nic extends qkp {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;

    @NonNull
    public final TimeInterpolator h;

    @Nullable
    public EditText i;
    public final x16 j;
    public final kic k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.kic] */
    public nic(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.j = new x16(this, 4);
        this.k = new View.OnFocusChangeListener() { // from class: xsna.kic
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                nic nicVar = nic.this;
                nicVar.t(nicVar.u());
            }
        };
        this.e = tb30.c(R$attr.motionDurationShort3, 100, aVar.getContext());
        this.f = tb30.c(R$attr.motionDurationShort3, 150, aVar.getContext());
        this.g = tb30.d(aVar.getContext(), R$attr.motionEasingLinearInterpolator, rq2.a);
        this.h = tb30.d(aVar.getContext(), R$attr.motionEasingEmphasizedInterpolator, rq2.d);
    }

    @Override // xsna.qkp
    public final void a() {
        if (this.b.q != null) {
            return;
        }
        t(u());
    }

    @Override // xsna.qkp
    public final int c() {
        return R$string.clear_text_end_icon_content_description;
    }

    @Override // xsna.qkp
    public final int d() {
        return R$drawable.mtrl_ic_cancel;
    }

    @Override // xsna.qkp
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // xsna.qkp
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // xsna.qkp
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // xsna.qkp
    public final void m(@Nullable EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(u());
    }

    @Override // xsna.qkp
    public final void p(boolean z) {
        if (this.b.q == null) {
            return;
        }
        t(z);
    }

    @Override // xsna.qkp
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.o(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.m(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new lic(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new com.vk.movika.sdk.android.defaultplayer.control.m(this, 1));
        this.m = ofFloat3;
        ofFloat3.addListener(new mic(this, 0));
    }

    @Override // xsna.qkp
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new p31(this, 4));
        }
    }

    public final void t(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
