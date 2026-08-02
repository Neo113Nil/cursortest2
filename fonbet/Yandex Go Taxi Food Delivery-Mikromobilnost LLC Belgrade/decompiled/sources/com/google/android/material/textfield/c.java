package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.c;
import defpackage.b4a1;
import defpackage.bk;
import defpackage.cmi;
import defpackage.cxg0;
import defpackage.eng0;
import defpackage.kbs;
import defpackage.kp50;
import defpackage.kxh0;
import defpackage.mj2;
import defpackage.sje;
import defpackage.t8;
import defpackage.uhm;
import defpackage.wh;
import defpackage.yi;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class c extends g {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final cmi i;
    public final bk j;
    public final sje k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public c(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.i = new cmi(10, this);
        this.j = new bk(17, this);
        this.k = new sje(1, this);
        this.o = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        this.f = kp50.O(endCompoundLayout.getContext(), eng0.motionDurationShort3, 67);
        this.e = kp50.O(endCompoundLayout.getContext(), eng0.motionDurationShort3, 50);
        this.g = kp50.P(endCompoundLayout.getContext(), eng0.motionEasingLinearInterpolator, mj2.a);
    }

    @Override // com.google.android.material.textfield.g
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && b4a1.c(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new uhm(2, this));
    }

    @Override // com.google.android.material.textfield.g
    public final int c() {
        return kxh0.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.g
    public final int d() {
        return cxg0.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.g
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // com.google.android.material.textfield.g
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.g
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.g
    public final boolean k() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.g
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            kbs.g("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new t8(7, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: fnm
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                c cVar = c.this;
                cVar.m = true;
                cVar.o = SystemClock.uptimeMillis();
                cVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.g
    public final void m(wh whVar) {
        if (!b4a1.c(this.h)) {
            whVar.p(Spinner.class.getName());
        }
        if (whVar.a.isShowingHintText()) {
            whVar.x(null);
        }
    }

    @Override // com.google.android.material.textfield.g
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || b4a1.c(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.g
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 27;
        ofFloat.addUpdateListener(new yi(i, this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new yi(i, this));
        this.q = ofFloat2;
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                c.this.p();
                c.this.r.start();
            }
        });
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.g
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
