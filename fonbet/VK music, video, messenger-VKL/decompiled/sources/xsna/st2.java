package xsna;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinContainer;
import com.vk.voip.ui.call_invite.views.AnonymCallJoinScrollView;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.ify;
import xsna.pt2;

/* compiled from: AnonymCallInviteVc.kt */
/* loaded from: classes7.dex */
public final class st2 extends pe {
    public pt2.a A;
    public AnonymCallJoinContainer e;
    public ViewGroup f;
    public AnonymCallJoinScrollView g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public View o;
    public View p;
    public TextView q;
    public a r;
    public q2x0 s;
    public final b t;
    public io.reactivex.rxjava3.disposables.c u;
    public final j79 v;
    public final l1 w;
    public final com.vk.movika.sdk.base.ui.g x;
    public final id y;
    public final pao0 z;

    /* compiled from: AnonymCallInviteVc.kt */
    public static final class a implements ify.a {
        public final AnonymCallJoinContainer b;
        public final gzs<s3q0> c;
        public final gzs<s3q0> d;

        public a(AnonymCallJoinContainer anonymCallJoinContainer, gzs gzsVar, gzs gzsVar2) {
            this.b = anonymCallJoinContainer;
            this.c = gzsVar;
            this.d = gzsVar2;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            dnp0 dnp0Var = new dnp0();
            dnp0Var.c(new wra());
            dnp0Var.setInterpolator(new AccelerateInterpolator());
            dnp0Var.e(300L);
            AnonymCallJoinContainer anonymCallJoinContainer = this.b;
            zmp0.a(anonymCallJoinContainer, dnp0Var);
            this.d.invoke();
            anonymCallJoinContainer.requestLayout();
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            dnp0 dnp0Var = new dnp0();
            dnp0Var.c(new wra());
            dnp0Var.setInterpolator(new AccelerateInterpolator());
            dnp0Var.e(300L);
            AnonymCallJoinContainer anonymCallJoinContainer = this.b;
            zmp0.a(anonymCallJoinContainer, dnp0Var);
            this.c.invoke();
            anonymCallJoinContainer.requestLayout();
        }
    }

    public st2(Context context, String str) {
        super(context);
        this.t = new b();
        this.u = EmptyDisposable.INSTANCE;
        this.v = new j79();
        this.w = new l1(this, 4);
        this.x = new com.vk.movika.sdk.base.ui.g(this, 6);
        this.y = new id(this, 1);
        this.z = new pao0(3);
    }

    @Override // xsna.pe
    public final void a() {
        q2x0 q2x0Var = this.s;
        if (q2x0Var != null) {
            q2x0Var.a();
        }
    }

    @Override // xsna.pe
    public final void b(s89 s89Var) {
        View view = this.n;
        if (view != null) {
            bwt0.p0(view, false);
        }
        View view2 = this.m;
        if (view2 != null) {
            bwt0.p0(view2, true);
        }
        AnonymCallJoinContainer anonymCallJoinContainer = this.e;
        if (anonymCallJoinContainer != null) {
            anonymCallJoinContainer.requestLayout();
        }
        super.b(s89Var);
        AnonymCallJoinScrollView anonymCallJoinScrollView = this.g;
        if (anonymCallJoinScrollView != null) {
            anonymCallJoinScrollView.postDelayed(this.y, 300L);
        }
    }

    public final void c(boolean z) {
        String str;
        CharSequence text;
        String obj;
        TextView textView = this.q;
        if (textView == null || (text = textView.getText()) == null || (obj = text.toString()) == null || (str = drm0.p0(obj).toString()) == null) {
            str = "";
        }
        this.u.dispose();
        this.u = this.v.b(str).subscribe(new xz(new rt2(this, str, z), 2));
    }

    /* compiled from: AnonymCallInviteVc.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z = drm0.p0(editable).length() > 0;
            st2 st2Var = st2.this;
            View view = st2Var.h;
            if (view != null) {
                view.setEnabled(z);
            }
            View view2 = st2Var.i;
            if (view2 != null) {
                view2.setEnabled(z);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
