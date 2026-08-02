package com.ybsdk.widgets.tooltip;

import android.content.Context;
import android.graphics.BlendModeColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.view.b;
import androidx.lifecycle.p;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.ybsdk.core.design.animation.AnimUtils;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.gch0;
import defpackage.i0t0;
import defpackage.kp50;
import defpackage.kvz0;
import defpackage.m810;
import defpackage.nah0;
import defpackage.ooc;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.qoh0;
import defpackage.rbv;
import defpackage.ruz0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.v4b1;
import defpackage.v6e0;
import defpackage.vng;
import defpackage.w511;
import defpackage.xwg;
import defpackage.y7x0;
import defpackage.y7z0;
import defpackage.ylg0;
import defpackage.zgz0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class a implements ruz0 {
    public pzt0 A;
    public TooltipCommon$DismissReason B = TooltipCommon$DismissReason.OUTSIDE_ACTION;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final sls g;
    public final sls h;
    public final tls i;
    public final int j;
    public final int k;
    public final TooltipCommon$PreferredPosition l;
    public final TooltipCommon$PreferredGravity m;
    public final boolean n;
    public final boolean o;
    public final Integer p;
    public final Integer q;
    public final int r;
    public final Integer s;
    public final rbv t;
    public TooltipPopupWindow u;
    public v6e0 v;
    public TooltipPopupBubble$show$4 w;
    public View x;
    public ViewPropertyAnimator y;
    public Rect z;

    public a(int i, int i2, int i3, int i4, int i5, sls slsVar, sls slsVar2, tls tlsVar, rbv rbvVar, Context context, TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity, TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition, Integer num, Integer num2, Integer num3, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = slsVar;
        this.h = slsVar2;
        this.i = tlsVar;
        this.j = i3;
        this.k = i4;
        this.l = tooltipCommon$PreferredPosition;
        this.m = tooltipCommon$PreferredGravity;
        this.n = z;
        this.o = z2;
        this.p = num;
        this.q = num2;
        this.r = i5;
        this.s = num3;
        this.t = rbvVar;
    }

    public final void a() {
        View contentView;
        pzt0 pzt0Var = this.A;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.A = null;
        TooltipPopupWindow tooltipPopupWindow = this.u;
        if (tooltipPopupWindow == null || (contentView = tooltipPopupWindow.getContentView()) == null) {
            return;
        }
        zgz0 zgz0Var = new zgz0(8, this);
        if (this.y != null) {
            return;
        }
        ViewPropertyAnimator a = AnimUtils.a(0.0f, contentView);
        int i = ylg0.ybsdk_default_interpolator;
        Context context = this.a;
        a.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        a.setStartDelay(50L);
        a.setDuration(300L);
        ViewPropertyAnimator d = AnimUtils.d(kp50.t(5), contentView);
        d.setInterpolator(AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator));
        d.setDuration(300L);
        this.y = a.withStartAction(new i0t0(d, 4)).withEndAction(new y7x0(24, zgz0Var, this));
        a.start();
    }

    public final void b(TextView textView) {
        Integer num = this.s;
        textView.setMaxWidth(num != null ? num.intValue() : m810.b(this.a.getResources().getDisplayMetrics().widthPixels * 0.8f));
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.ybsdk.widgets.tooltip.TooltipPopupBubble$show$4] */
    public final void c(View view, long j) {
        int i;
        this.z = null;
        this.B = TooltipCommon$DismissReason.OUTSIDE_ACTION;
        String str = this.c;
        String str2 = this.b;
        if ((str2 == null || evu0.J(str2)) && (str == null || evu0.J(str))) {
            return;
        }
        this.x = view;
        view.setTag(nah0.ybsdk_tooltip_controller_id, this);
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(qoh0.ybsdk_tooltip_bubble_content, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(gch0.bubbleTitleText);
        TextView textView2 = (TextView) inflate.findViewById(gch0.bubbleSubtitleText);
        TextView textView3 = (TextView) inflate.findViewById(gch0.bubbleLinkText);
        ImageView imageView = (ImageView) inflate.findViewById(gch0.bubbleLinkImage);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(gch0.bubbleHolder);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate.findViewById(gch0.bubbleLinkHolder);
        ImageView imageView2 = (ImageView) inflate.findViewById(gch0.bubbleArrow);
        int i2 = kvz0.a[this.m.ordinal()];
        int i3 = 2;
        if (i2 == 1) {
            i = 17;
        } else {
            if (i2 != 2 && i2 != 3) {
                w511.b();
                return;
            }
            i = 8388611;
        }
        float f = i == 17 ? 0.5f : 0.0f;
        Iterator it = scc.g(textView, textView2, linearLayoutCompat).iterator();
        while (it.hasNext()) {
            ((ConstraintLayout.LayoutParams) ((View) it.next()).getLayoutParams()).horizontalBias = f;
        }
        textView.setGravity(i);
        textView2.setGravity(i);
        linearLayoutCompat.setGravity(i);
        textView2.setTextColor(this.f);
        b(textView2);
        b(textView3);
        b(textView);
        int paddingLeft = inflate.getPaddingLeft();
        int paddingRight = inflate.getPaddingRight();
        int i4 = this.k;
        inflate.setPadding(paddingLeft, i4, paddingRight, i4);
        Integer num = this.p;
        if (num != null) {
            textView.setTextAppearance(num.intValue());
        }
        Integer num2 = this.q;
        if (num2 != null) {
            textView2.setTextAppearance(num2.intValue());
        }
        String str3 = this.d;
        int i5 = 8;
        linearLayoutCompat.setVisibility((str3 == null || str3.length() == 0) ? 8 : 0);
        if (linearLayoutCompat.getVisibility() == 0) {
            textView3.setText(str3);
            rbv rbvVar = this.t;
            if (rbvVar != null) {
                v4b1.k(rbvVar, imageView, null, null, 6);
                imageView.setVisibility(0);
            }
        }
        textView.setText(str2);
        textView.setVisibility((str2 == null || evu0.J(str2)) ? 8 : 0);
        textView2.setText(str);
        if (str != null && !evu0.J(str)) {
            i5 = 0;
        }
        textView2.setVisibility(i5);
        float t = kp50.t(this.r);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t);
        gradientDrawable.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        constraintLayout.setBackground(gradientDrawable);
        BlendModeColorFilter k = ooc.k(this.e, BlendModeCompat.SRC_IN);
        imageView2.setColorFilter(k);
        constraintLayout.getBackground().setColorFilter(k);
        this.v = new v6e0(this, imageView2, view, inflate, 1);
        inflate.setAlpha(0.0f);
        ViewPropertyAnimator a = AnimUtils.a(1.0f, inflate);
        a.setInterpolator(AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator));
        a.setStartDelay(150L);
        a.setDuration(300L);
        inflate.setTranslationY(kp50.t(5));
        ViewPropertyAnimator d = AnimUtils.d(0.0f, inflate);
        d.setInterpolator(AnimationUtils.loadInterpolator(context, ylg0.ybsdk_default_interpolator));
        d.setStartDelay(100L);
        d.setDuration(300L);
        a.withStartAction(new y7x0(25, d, this)).start();
        this.w = new View.OnAttachStateChangeListener() { // from class: com.ybsdk.widgets.tooltip.TooltipPopupBubble$show$4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                a aVar = a.this;
                pzt0 pzt0Var = aVar.A;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                aVar.A = null;
                TooltipPopupWindow tooltipPopupWindow = aVar.u;
                if (tooltipPopupWindow != null) {
                    tooltipPopupWindow.dismiss();
                }
            }
        };
        inflate.getViewTreeObserver().addOnPreDrawListener(this.v);
        view.getViewTreeObserver().addOnPreDrawListener(this.v);
        view.addOnAttachStateChangeListener(this.w);
        TooltipPopupWindow tooltipPopupWindow = new TooltipPopupWindow(inflate, -2, -2);
        tooltipPopupWindow.setInputMethodMode(2);
        tooltipPopupWindow.setOutsideTouchable(this.o);
        tooltipPopupWindow.setFocusable(false);
        tooltipPopupWindow.setBackgroundDrawable(null);
        tooltipPopupWindow.setOnDismissListener(new xwg(i3, this));
        inflate.setOnClickListener(new y7z0(2, this, tooltipPopupWindow));
        tooltipPopupWindow.showAtLocation(view, 0, 0, 0);
        this.u = tooltipPopupWindow;
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String obj = evu0.k0(str2 + " " + str).toString();
        if (obj.length() > 0) {
            b.r(inflate, obj);
        }
        pey o = vng.o(view);
        if (o != null) {
            p s = eja1.s(o);
            Long valueOf = Long.valueOf(j);
            if (j <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.A = tje.N(s, null, null, new TooltipPopupBubble$show$6$2$1(j, this, null), 3);
            }
        }
    }
}
