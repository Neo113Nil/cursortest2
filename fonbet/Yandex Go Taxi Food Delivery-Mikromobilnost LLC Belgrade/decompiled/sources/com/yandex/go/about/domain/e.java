package com.yandex.go.about.domain;

import defpackage.avj0;
import defpackage.e6;
import defpackage.f6;
import defpackage.fa31;
import defpackage.kyh0;
import defpackage.l5;
import defpackage.mn0;
import defpackage.ny61;
import defpackage.pwd0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f6 b;

    public e(vpr vprVar, f6 f6Var) {
        this.a = vprVar;
        this.b = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AboutScreenUiStateInteractor$special$$inlined$map$1$2$1 aboutScreenUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AboutScreenUiStateInteractor$special$$inlined$map$1$2$1) {
            aboutScreenUiStateInteractor$special$$inlined$map$1$2$1 = (AboutScreenUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    l5 l5Var = (l5) obj;
                    fa31 fa31Var = l5Var.a;
                    StringBuilder sb = new StringBuilder();
                    avj0 avj0Var = (avj0) ((zuj0) this.b.b);
                    sb.append(avj0Var.i(kyh0.about_version_info, fa31Var.a, "28.07.2026"));
                    sb.append(avj0Var.i(kyh0.about_version_info_end, fa31Var.b));
                    sb.append('\n');
                    String sb2 = sb.toString();
                    List<pwd0> list = l5Var.d;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (pwd0 pwd0Var : list) {
                        arrayList.add(new mn0(pwd0Var.a, pwd0Var.b));
                    }
                    String str = l5Var.c;
                    if (str == null) {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str2 = l5Var.b;
                    if (str2 == null) {
                        str2 = null;
                    }
                    e6 e6Var = new e6(sb2, str, str2 != null ? str2 : "", arrayList);
                    aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(e6Var, aboutScreenUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        aboutScreenUiStateInteractor$special$$inlined$map$1$2$1 = new AboutScreenUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aboutScreenUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
