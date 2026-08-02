package xsna;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes13.dex */
public final class tmo extends qkp {
    public final int e;
    public final int f;

    @NonNull
    public final TimeInterpolator g;

    @Nullable
    public AutoCompleteTextView h;
    public final sg0 i;
    public final smo j;
    public final q7 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;

    @Nullable
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.smo] */
    public tmo(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.i = new sg0(this, 5);
        this.j = new View.OnFocusChangeListener() { // from class: xsna.smo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                tmo tmoVar = tmo.this;
                tmoVar.l = z;
                tmoVar.q();
                if (z) {
                    return;
                }
                tmoVar.t(false);
                tmoVar.m = false;
            }
        };
        this.k = new q7(this, 18);
        this.o = Long.MAX_VALUE;
        this.f = tb30.c(R$attr.motionDurationShort3, 67, aVar.getContext());
        this.e = tb30.c(R$attr.motionDurationShort3, 50, aVar.getContext());
        this.g = tb30.d(aVar.getContext(), R$attr.motionEasingLinearInterpolator, rq2.a);
    }

    @Override // xsna.qkp
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && gcd0.m(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new io.reactivex.rxjava3.android.a(this, 4));
    }

    @Override // xsna.qkp
    public final int c() {
        return R$string.exposed_dropdown_menu_content_description;
    }

    @Override // xsna.qkp
    public final int d() {
        return R$drawable.mtrl_dropdown_arrow;
    }

    @Override // xsna.qkp
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // xsna.qkp
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // xsna.qkp
    public final q7 h() {
        return this.k;
    }

    @Override // xsna.qkp
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // xsna.qkp
    public final boolean j() {
        return this.l;
    }

    @Override // xsna.qkp
    public final boolean l() {
        return this.n;
    }

    @Override // xsna.qkp
    public final void m(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.qmo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    tmo tmoVar = tmo.this;
                    long j = currentTimeMillis - tmoVar.o;
                    if (j < 0 || j > 300) {
                        tmoVar.m = false;
                    }
                    tmoVar.u();
                    tmoVar.m = true;
                    tmoVar.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: xsna.rmo
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                tmo tmoVar = tmo.this;
                tmoVar.m = true;
                tmoVar.o = System.currentTimeMillis();
                tmoVar.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!gcd0.m(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // xsna.qkp
    public final void n(@NonNull am amVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
        if (!gcd0.m(this.h)) {
            amVar.n(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // xsna.qkp
    @SuppressLint({"WrongConstant"})
    public final void o(@NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || gcd0.m(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // xsna.qkp
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 0;
        ofFloat.addUpdateListener(new pmo(this, i));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new pmo(this, i));
        this.q = ofFloat2;
        ofFloat2.addListener(new op6(this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // xsna.qkp
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
