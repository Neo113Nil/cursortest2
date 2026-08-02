package com.yandex.go.about.domain;

import android.content.Context;
import android.net.Uri;
import defpackage.b1;
import defpackage.b5;
import defpackage.b6;
import defpackage.c5;
import defpackage.c6;
import defpackage.d6;
import defpackage.jl40;
import defpackage.k3c;
import defpackage.kyh0;
import defpackage.lg21;
import defpackage.m950;
import defpackage.mg21;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.sy60;
import defpackage.w511;
import defpackage.xl51;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final Context a;
    public final lg21 b;
    public final k3c c;
    public final b1 d;
    public final xl51 e;
    public final c f;

    public d(Context context, lg21 lg21Var, k3c k3cVar, b1 b1Var, xl51 xl51Var, c cVar) {
        this.a = context;
        this.b = lg21Var;
        this.c = k3cVar;
        this.d = b1Var;
        this.e = xl51Var;
        this.f = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6 d6Var, b5 b5Var, ContinuationImpl continuationImpl) {
        AboutScreenUiActionInteractor$handleAction$1 aboutScreenUiActionInteractor$handleAction$1;
        int i;
        if (continuationImpl instanceof AboutScreenUiActionInteractor$handleAction$1) {
            aboutScreenUiActionInteractor$handleAction$1 = (AboutScreenUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = aboutScreenUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aboutScreenUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aboutScreenUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aboutScreenUiActionInteractor$handleAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean l = jl40.l(d6Var, b6.a);
                    b1 b1Var = this.d;
                    if (!l) {
                        if (jl40.l(d6Var, b6.b)) {
                            b1Var.g(BusinessNameAboutAnalytics$ActionV2.LogoTap);
                        } else {
                            boolean l2 = jl40.l(d6Var, b6.c);
                            xl51 xl51Var = this.e;
                            lg21 lg21Var = this.b;
                            if (l2) {
                                b1Var.g(BusinessNameAboutAnalytics$ActionV2.License);
                                ((mg21) lg21Var).b(Uri.parse(xl51Var.a(xl51Var.c)));
                            } else if (jl40.l(d6Var, b6.d)) {
                                b1Var.g(BusinessNameAboutAnalytics$ActionV2.AnotherApps);
                                int i3 = kyh0.about_other_apps_error;
                                Context context = this.a;
                                q5z.P(context, "https://play.google.com/store/apps/developer?id=Mikromobilnost+LLC+Belgrade", "https://mobile.yandex.ru", context.getString(i3));
                            } else if (d6Var instanceof c6) {
                                ((mg21) lg21Var).c(((c6) d6Var).a);
                            } else if (jl40.l(d6Var, b6.e)) {
                                b1Var.g(BusinessNameAboutAnalytics$ActionV2.PrivacyPolicy);
                                ((mg21) lg21Var).b(Uri.parse(xl51Var.a(xl51Var.e)));
                            } else if (jl40.l(d6Var, b6.f)) {
                                c5 c5Var = b5Var.a;
                                c5Var.z((m950) c5Var.I.get(), sy60.Q2);
                            } else {
                                if (!jl40.l(d6Var, b6.g)) {
                                    w511.b();
                                    return null;
                                }
                                b1Var.g(BusinessNameAboutAnalytics$ActionV2.License);
                                ((mg21) lg21Var).b(Uri.parse(xl51Var.a(xl51Var.d)));
                            }
                        }
                        return zy11.a;
                    }
                    b1Var.g(BusinessNameAboutAnalytics$ActionV2.UUID);
                    aboutScreenUiActionInteractor$handleAction$1.L$0 = null;
                    aboutScreenUiActionInteractor$handleAction$1.L$1 = null;
                    aboutScreenUiActionInteractor$handleAction$1.label = 1;
                    obj = this.f.a(aboutScreenUiActionInteractor$handleAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.c.a(true, (String) obj, "text");
                return zy11.a;
            }
        }
        aboutScreenUiActionInteractor$handleAction$1 = new AboutScreenUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = aboutScreenUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aboutScreenUiActionInteractor$handleAction$1.label;
        if (i != 0) {
        }
        this.c.a(true, (String) obj2, "text");
        return zy11.a;
    }
}
