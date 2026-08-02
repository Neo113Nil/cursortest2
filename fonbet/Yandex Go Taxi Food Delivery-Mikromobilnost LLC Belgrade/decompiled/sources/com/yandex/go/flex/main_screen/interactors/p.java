package com.yandex.go.flex.main_screen.interactors;

import defpackage.e3n;
import defpackage.f8z0;
import defpackage.g6u;
import defpackage.hst;
import defpackage.jst;
import defpackage.lzy;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.q0z;
import defpackage.s630;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u1m;
import defpackage.uyj;
import defpackage.ywl;
import defpackage.zwy;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class p {
    public final d a;
    public final lzy b;
    public final q0z c;
    public final zwy d;
    public final tt2 e;
    public final flex.engine.a f;

    public p(d dVar, lzy lzyVar, q0z q0zVar, zwy zwyVar, tt2 tt2Var, flex.engine.a aVar) {
        this.a = dVar;
        this.b = lzyVar;
        this.c = q0zVar;
        this.d = zwyVar;
        this.e = tt2Var;
        this.f = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ShowInitialDocumentInteractor$show$1 showInitialDocumentInteractor$show$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long a;
        u1m u1mVar;
        g6u g6uVar;
        ShowInitialDocumentInteractor$show$2 showInitialDocumentInteractor$show$2;
        long j;
        if (continuationImpl instanceof ShowInitialDocumentInteractor$show$1) {
            showInitialDocumentInteractor$show$1 = (ShowInitialDocumentInteractor$show$1) continuationImpl;
            int i2 = showInitialDocumentInteractor$show$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showInitialDocumentInteractor$show$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showInitialDocumentInteractor$show$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showInitialDocumentInteractor$show$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = s630.a();
                    this.a.getClass();
                    u1mVar = new u1m(6, "mlutp/v1/widgets/layout/superapp", (Map) null);
                    showInitialDocumentInteractor$show$1.L$0 = u1mVar;
                    showInitialDocumentInteractor$show$1.J$0 = a;
                    showInitialDocumentInteractor$show$1.label = 1;
                    zwy zwyVar = this.d;
                    zwyVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new LoadInitialDocumentInteractor$load$2(zwyVar, u1mVar, null), showInitialDocumentInteractor$show$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = showInitialDocumentInteractor$show$1.J$0;
                        kotlin.b.b(obj);
                        hst hstVar = jst.e;
                        e3n.p(f8z0.a(j));
                        hstVar.getClass();
                        return zy11.a;
                    }
                    a = showInitialDocumentInteractor$show$1.J$0;
                    u1mVar = (u1m) showInitialDocumentInteractor$show$1.L$0;
                    kotlin.b.b(obj);
                }
                jst.e.getClass();
                r0 r0Var = this.c.a.a;
                r0Var.getClass();
                r0Var.m(null, "empty");
                r0 r0Var2 = this.b.a.a;
                r0Var2.getClass();
                r0Var2.m(null, "empty");
                this.e.getClass();
                sjh sjhVar2 = uyj.a;
                g6uVar = o400.a;
                showInitialDocumentInteractor$show$2 = new ShowInitialDocumentInteractor$show$2(this, (ywl) obj, u1mVar, null);
                showInitialDocumentInteractor$show$1.L$0 = null;
                showInitialDocumentInteractor$show$1.L$1 = null;
                showInitialDocumentInteractor$show$1.J$0 = a;
                showInitialDocumentInteractor$show$1.label = 2;
                if (tje.k0(g6uVar, showInitialDocumentInteractor$show$2, showInitialDocumentInteractor$show$1) != coroutineSingletons) {
                    j = a;
                    hst hstVar2 = jst.e;
                    e3n.p(f8z0.a(j));
                    hstVar2.getClass();
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        showInitialDocumentInteractor$show$1 = new ShowInitialDocumentInteractor$show$1(this, continuationImpl);
        Object obj2 = showInitialDocumentInteractor$show$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showInitialDocumentInteractor$show$1.label;
        if (i != 0) {
        }
        jst.e.getClass();
        r0 r0Var3 = this.c.a.a;
        r0Var3.getClass();
        r0Var3.m(null, "empty");
        r0 r0Var22 = this.b.a.a;
        r0Var22.getClass();
        r0Var22.m(null, "empty");
        this.e.getClass();
        sjh sjhVar22 = uyj.a;
        g6uVar = o400.a;
        showInitialDocumentInteractor$show$2 = new ShowInitialDocumentInteractor$show$2(this, (ywl) obj2, u1mVar, null);
        showInitialDocumentInteractor$show$1.L$0 = null;
        showInitialDocumentInteractor$show$1.L$1 = null;
        showInitialDocumentInteractor$show$1.J$0 = a;
        showInitialDocumentInteractor$show$1.label = 2;
        if (tje.k0(g6uVar, showInitialDocumentInteractor$show$2, showInitialDocumentInteractor$show$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
