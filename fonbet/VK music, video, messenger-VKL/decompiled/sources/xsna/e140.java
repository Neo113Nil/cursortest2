package xsna;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.TextView;
import com.vk.core.view.TintTextView;
import com.vk.dto.im.MsgType;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* compiled from: MsgTypePopup.kt */
/* loaded from: classes2.dex */
public final class e140 {
    public final int a;
    public final int b;
    public final bpn0 c;
    public final WindowManager d;
    public final LayoutAnimationController e;
    public final LayoutAnimationController f;
    public final g6b g;
    public final View h;
    public final TintTextView i;
    public final TextView j;
    public final ViewGroup k;
    public final bpn0 l;
    public final TextView m;
    public int n;
    public boolean o;
    public WeakReference<View> p;
    public final int q;
    public final long[] r;
    public izs<? super MsgType, s3q0> s;
    public int t;
    public TextView u;
    public TextView v;

    public e140(Activity activity, LayoutInflater layoutInflater) {
        int a = iah0.a(280);
        this.a = a;
        this.b = iah0.a(20);
        int i = 7;
        bpn0 bpn0Var = new bpn0(new fqd(i, layoutInflater, activity));
        this.c = bpn0Var;
        this.d = activity.getWindowManager();
        this.e = AnimationUtils.loadLayoutAnimation(activity, R.anim.layout_animation_fall_down);
        this.f = AnimationUtils.loadLayoutAnimation(activity, R.anim.layout_animation_fall_up);
        this.g = new g6b(activity);
        View inflate = ((LayoutInflater) bpn0Var.getValue()).inflate(R.layout.vkim_msg_type_window, (ViewGroup) null, false);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        this.h = inflate;
        this.k = (ViewGroup) inflate.findViewById(R.id.popup_btn_container);
        this.l = new bpn0(new vf1(12, this, activity));
        this.n = a;
        this.q = iah0.f().heightPixels - iah0.a(180);
        long millis = TimeUnit.SECONDS.toMillis(15L);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis2 = timeUnit.toMillis(1L);
        long millis3 = timeUnit.toMillis(5L);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        this.r = new long[]{millis, millis2, millis3, timeUnit2.toMillis(1L), timeUnit2.toMillis(24L)};
        this.t = e3m.f(R.attr.vk_ui_text_accent, activity);
        awt0.h(inflate, new by20(this, 4), false);
        bwt0.i0(inflate, new hs00(this, i));
        inflate.requestFocus();
        TintTextView tintTextView = (TintTextView) inflate.findViewById(R.id.mute_msg_btn);
        this.i = tintTextView;
        bwt0.i0(tintTextView, new fju(this, 9));
        TextView textView = (TextView) inflate.findViewById(R.id.disappeared_msg_btn);
        this.j = textView;
        bwt0.i0(textView, new ugm(this, 23));
        TextView textView2 = (TextView) inflate.findViewById(R.id.duration_btn);
        this.m = textView2;
        bwt0.i0(textView2, new o3w(this, 16));
        d();
    }

    public static void c(e140 e140Var, View view, izs izsVar) {
        e140Var.b(view, true, e3m.f(R.attr.vk_ui_text_accent, e140Var.h.getContext()), izsVar);
    }

    public final void a() {
        if (this.o) {
            this.k.getLayoutAnimation().getAnimation().cancel();
            this.d.removeViewImmediate(this.h);
            this.o = false;
        }
    }

    public final void b(View view, boolean z, int i, izs<? super MsgType, s3q0> izsVar) {
        if (this.o) {
            return;
        }
        this.t = i;
        this.i.setDrawableTint(i);
        TextView textView = this.u;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        hno0.a(this.j, ColorStateList.valueOf(i));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, -2147352574, 1);
        layoutParams.dimAmount = 0.5f;
        if (gz80.a(28)) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.softInputMode = 17;
        WindowManager windowManager = this.d;
        View view2 = this.h;
        windowManager.addView(view2, layoutParams);
        this.p = new WeakReference<>(view);
        View findViewById = view2.findViewById(R.id.disappeared_msg_container);
        g2v.c().getClass();
        bwt0.p0(findViewById, z);
        this.s = izsVar;
        awt0.s(view2, new j4(16, view, this));
        this.o = true;
    }

    public final void d() {
        cew.b.getClass();
        this.m.setText(this.g.b(this.r[cew.h().getInt("pref_message_expiration_option_index", 0)]));
    }

    public final void e() {
        View view;
        if (this.o) {
            WeakReference<View> weakReference = this.p;
            if (weakReference == null || (view = weakReference.get()) == null) {
                a();
            } else if (view.isAttachedToWindow()) {
                bwt0.V(view, new s(15, this, view));
            } else {
                a();
            }
        }
    }
}
