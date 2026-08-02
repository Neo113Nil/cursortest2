package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;
    public final /* synthetic */ wls c;

    public /* synthetic */ p70(n70 n70Var, wls wlsVar, int i) {
        this.a = i;
        this.b = n70Var;
        this.c = wlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Throwable th;
        View O;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        n70 n70Var = this.b;
        Throwable th2 = null;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) wlsVar.invoke((Uri) obj, ((jpl) n70Var.Z()).c);
                bool.getClass();
                return bool;
            case 1:
                n70 n70Var2 = this.b;
                zo31 zo31Var = n70Var2.N;
                Context context = n70Var2.P;
                s561 s561Var = (s561) zo31Var;
                AppCompatTextView appCompatTextView = s561Var.b;
                LinearLayoutCompat linearLayoutCompat = s561Var.a;
                xty0.d(appCompatTextView, ((s8m0) n70Var2.Z()).d);
                int i2 = 0;
                for (Object obj2 : ((s8m0) n70Var2.Z()).f) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th3 = th2;
                        scc.m();
                        throw th3;
                    }
                    r8m0 r8m0Var = (r8m0) obj2;
                    View inflate = LayoutInflater.from(context).inflate(doh0.ybsdk_savings_widget_details_button, (ViewGroup) linearLayoutCompat, false);
                    linearLayoutCompat.addView(inflate);
                    int i4 = tbh0.copy;
                    if (((AppCompatImageView) cma1.O(i4, inflate)) != null) {
                        i4 = tbh0.label;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i4, inflate);
                        if (appCompatTextView2 != null && (O = cma1.O((i4 = tbh0.tooltipGuide), inflate)) != null) {
                            i4 = tbh0.value;
                            th = th2;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i4, inflate);
                            if (appCompatTextView3 == null) {
                                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                                return th;
                            }
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            c361 c361Var = new c361(constraintLayout, appCompatTextView2, O, appCompatTextView3);
                            appCompatTextView2.setText(d.a(context, r8m0Var.a));
                            appCompatTextView3.setText(d.a(context, r8m0Var.b));
                            constraintLayout.setOnClickListener(new opo(c361Var, n70Var2, this.c, r8m0Var, 2));
                            if (i2 < scc.f(((s8m0) n70Var2.Z()).f)) {
                                View inflate2 = LayoutInflater.from(context).inflate(doh0.ybsdk_savings_widget_details_divider, (ViewGroup) linearLayoutCompat, false);
                                linearLayoutCompat.addView(inflate2);
                                if (inflate2 == null) {
                                    ny61.t("rootView");
                                    return th;
                                }
                            }
                            i2 = i3;
                            th2 = th;
                        }
                    }
                    th = th2;
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                    return th;
                }
                return zy11Var;
            case 2:
                Boolean bool2 = (Boolean) wlsVar.invoke(((t8m0) n70Var.Z()).d.e, ((Uri) obj).toString());
                bool2.getClass();
                return bool2;
            default:
                zo31 zo31Var2 = n70Var.N;
                Context context2 = n70Var.P;
                xty0.d(((t561) zo31Var2).c, ((u8m0) n70Var.Z()).d);
                t561 t561Var = (t561) n70Var.N;
                t561Var.b.removeAllViews();
                for (u2m0 u2m0Var : ((u8m0) n70Var.Z()).e) {
                    LayoutInflater from = LayoutInflater.from(context2);
                    LinearLayoutCompat linearLayoutCompat2 = t561Var.b;
                    View inflate3 = from.inflate(doh0.ybsdk_savings_widget_document_button, (ViewGroup) linearLayoutCompat2, false);
                    linearLayoutCompat2.addView(inflate3);
                    int i5 = tbh0.arrow;
                    if (((AppCompatImageView) cma1.O(i5, inflate3)) != null) {
                        i5 = tbh0.icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i5, inflate3);
                        if (appCompatImageView != null) {
                            i5 = tbh0.iconShimmer;
                            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) cma1.O(i5, inflate3);
                            if (shimmerFrameLayout != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate3;
                                int i6 = tbh0.title;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) cma1.O(i6, inflate3);
                                if (appCompatTextView4 != null) {
                                    i561 i561Var = new i561(constraintLayout2, appCompatImageView, shimmerFrameLayout, appCompatTextView4);
                                    appCompatTextView4.setText(d.a(context2, u2m0Var.b));
                                    rbv rbvVar = u2m0Var.a;
                                    if (rbvVar != null) {
                                        v4b1.k(rbvVar, appCompatImageView, new ohk0(26, i561Var), null, 4);
                                    }
                                    constraintLayout2.setOnClickListener(new nl(14, wlsVar, u2m0Var, n70Var));
                                } else {
                                    i5 = i6;
                                }
                            }
                        }
                    }
                    ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i5)));
                    return null;
                    break;
                }
                return zy11Var;
        }
    }

    public /* synthetic */ p70(wls wlsVar, n70 n70Var, int i) {
        this.a = i;
        this.c = wlsVar;
        this.b = n70Var;
    }
}
