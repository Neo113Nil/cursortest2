package com.yandex.go.summary.ui.compose;

import androidx.compose.runtime.f;
import defpackage.cex0;
import defpackage.ch6;
import defpackage.gpo;
import defpackage.gr5;
import defpackage.htz0;
import defpackage.m3u0;
import defpackage.ny61;
import defpackage.osz0;
import defpackage.rol0;
import defpackage.ug00;
import defpackage.vpr;
import defpackage.yur;
import defpackage.yw20;
import defpackage.zqv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ yur a;
    public final /* synthetic */ yw20 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ yur w;
    public final /* synthetic */ yur x;
    public final /* synthetic */ yur y;
    public final /* synthetic */ yur z;

    public a(yur yurVar, yw20 yw20Var, m3u0 m3u0Var, yur yurVar2, yur yurVar3, yur yurVar4, yur yurVar5) {
        this.a = yurVar;
        this.b = yw20Var;
        this.c = m3u0Var;
        this.w = yurVar2;
        this.x = yurVar3;
        this.y = yurVar4;
        this.z = yurVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ch6 ch6Var, Continuation continuation) {
        SummaryPaneKt$ForceFocusEffect$1$1$4$emit$1 summaryPaneKt$ForceFocusEffect$1$1$4$emit$1;
        int i;
        osz0 osz0Var;
        cex0 cex0Var;
        htz0 htz0Var;
        if (continuation instanceof SummaryPaneKt$ForceFocusEffect$1$1$4$emit$1) {
            summaryPaneKt$ForceFocusEffect$1$1$4$emit$1 = (SummaryPaneKt$ForceFocusEffect$1$1$4$emit$1) continuation;
            int i2 = summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.label;
                m3u0 m3u0Var = this.c;
                osz0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (ch6Var.b) {
                        yur.b(this.a);
                    } else {
                        int i3 = ch6Var.a;
                        yw20 yw20Var = this.b;
                        if (i3 == -2) {
                            yw20Var.a();
                            rol0 o = f.o(new gr5(m3u0Var, 14));
                            SummaryPaneKt$ForceFocusEffect$1$1$4$2 summaryPaneKt$ForceFocusEffect$1$1$4$2 = new SummaryPaneKt$ForceFocusEffect$1$1$4$2(2, null);
                            summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.L$0 = null;
                            summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.label = 1;
                            if (e.x(o, summaryPaneKt$ForceFocusEffect$1$1$4$2, summaryPaneKt$ForceFocusEffect$1$1$4$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            yw20Var.b();
                            ug00 ug00Var = ((zqv0) m3u0Var.getValue()).a;
                            if (ug00Var.b == null && ug00Var.a == null) {
                                yur.b(this.z);
                            } else {
                                yur.b(this.y);
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                gpo gpoVar = ((zqv0) m3u0Var.getValue()).b.b;
                cex0Var = gpoVar == null ? gpoVar.a : null;
                if (!(cex0Var instanceof cex0)) {
                    cex0Var = null;
                }
                if (cex0Var != null && (htz0Var = cex0Var.c) != null) {
                    osz0Var = htz0Var.a;
                }
                if (osz0Var == null) {
                    yur.b(this.w);
                } else {
                    yur.b(this.x);
                }
                return zy11.a;
            }
        }
        summaryPaneKt$ForceFocusEffect$1$1$4$emit$1 = new SummaryPaneKt$ForceFocusEffect$1$1$4$emit$1(this, continuation);
        Object obj2 = summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaneKt$ForceFocusEffect$1$1$4$emit$1.label;
        m3u0 m3u0Var2 = this.c;
        osz0Var = null;
        if (i != 0) {
        }
        gpo gpoVar2 = ((zqv0) m3u0Var2.getValue()).b.b;
        if (gpoVar2 == null) {
        }
        if (!(cex0Var instanceof cex0)) {
        }
        if (cex0Var != null) {
            osz0Var = htz0Var.a;
        }
        if (osz0Var == null) {
        }
        return zy11.a;
    }
}
