package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.acx0;
import defpackage.akj0;
import defpackage.amj0;
import defpackage.bcx0;
import defpackage.bkj0;
import defpackage.ccx0;
import defpackage.cex0;
import defpackage.ckj0;
import defpackage.dkj0;
import defpackage.fwi;
import defpackage.hz8;
import defpackage.ix8;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.m3u0;
import defpackage.ny61;
import defpackage.p651;
import defpackage.rcx0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xbx0;
import defpackage.xlj0;
import defpackage.ybx0;
import defpackage.zbx0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ m3u0 a;
    public final /* synthetic */ androidx.compose.foundation.lazy.b b;
    public final /* synthetic */ p651 c;
    public final /* synthetic */ fwi w;
    public final /* synthetic */ lz40 x;
    public final /* synthetic */ tls y;
    public final /* synthetic */ tls z;

    public a(m3u0 m3u0Var, androidx.compose.foundation.lazy.b bVar, p651 p651Var, fwi fwiVar, lz40 lz40Var, tls tlsVar, tls tlsVar2) {
        this.a = m3u0Var;
        this.b = bVar;
        this.c = p651Var;
        this.w = fwiVar;
        this.x = lz40Var;
        this.y = tlsVar;
        this.z = tlsVar2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00eb, code lost:
    
        if (r3.emit(r9, r0) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.i(r2, r9, r8, r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0157, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.i(r2, 0, 0, r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0175, code lost:
    
        if (r3.emit(r8, r0) == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c5, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.i(r2, r9, 0, r0) == r1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1 tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        dkj0 i2;
        boolean z;
        dkj0 dkj0Var;
        if (continuation instanceof TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1) {
            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1 = (TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i3 = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                lz40 lz40Var = this.x;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        ccx0 ccx0Var = (ccx0) obj;
                        boolean z2 = ccx0Var instanceof bcx0;
                        androidx.compose.foundation.lazy.b bVar = this.b;
                        ckj0 ckj0Var = ckj0.a;
                        m3u0 m3u0Var = this.a;
                        if (!z2) {
                            if (!(ccx0Var instanceof xbx0)) {
                                if (!jl40.l(ccx0Var, acx0.a)) {
                                    if (!jl40.l(ccx0Var, ybx0.a)) {
                                        if (!jl40.l(ccx0Var, zbx0.a)) {
                                            w511.b();
                                            break;
                                        } else {
                                            Iterator it = ((cex0) m3u0Var.getValue()).d.a.iterator();
                                            int i4 = 0;
                                            while (true) {
                                                if (it.hasNext()) {
                                                    rcx0 rcx0Var = (rcx0) it.next();
                                                    if ((!(rcx0Var instanceof amj0) || ((amj0) rcx0Var).m != RequirementTypeUiState.DEFAULT) && !(rcx0Var instanceof hz8)) {
                                                        i4++;
                                                    }
                                                } else {
                                                    i4 = -1;
                                                }
                                            }
                                            if (i4 != -1) {
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = null;
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.I$0 = i4;
                                                tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 6;
                                                break;
                                            }
                                        }
                                    } else {
                                        ix8 ix8Var = new ix8(0);
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 5;
                                        break;
                                    }
                                } else {
                                    tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                    tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                    tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                    tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 4;
                                    break;
                                }
                            } else {
                                dkj0 i5 = c.i(((xbx0) ccx0Var).a, ((cex0) m3u0Var.getValue()).d.a);
                                if (!(i5 instanceof bkj0)) {
                                    if (!(i5 instanceof akj0)) {
                                        if (!i5.equals(ckj0Var)) {
                                            w511.b();
                                            break;
                                        }
                                    } else {
                                        this.z.invoke(((akj0) i5).c.i);
                                    }
                                } else {
                                    xlj0 xlj0Var = ((bkj0) i5).b.k;
                                    if (xlj0Var != null) {
                                        this.y.invoke(xlj0Var);
                                    }
                                }
                            }
                        } else {
                            List list = ((cex0) m3u0Var.getValue()).d.a;
                            bcx0 bcx0Var = (bcx0) ccx0Var;
                            String str = bcx0Var.a;
                            String str2 = bcx0Var.b;
                            if (str != null) {
                                dkj0 i6 = c.i(str, list);
                                if (!(i6 instanceof ckj0)) {
                                    i2 = i6;
                                    z = i2 instanceof bkj0;
                                    fwi fwiVar = this.w;
                                    p651 p651Var = this.c;
                                    if (!z) {
                                        int i7 = ((bkj0) i2).a;
                                        int i8 = -p651Var.c(fwiVar);
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$4 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                                        break;
                                    } else if (!(i2 instanceof akj0)) {
                                        if (!i2.equals(ckj0Var)) {
                                            w511.b();
                                            break;
                                        }
                                        break;
                                    } else {
                                        int i9 = ((akj0) i2).a;
                                        int i10 = -p651Var.c(fwiVar);
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = null;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$4 = i2;
                                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 2;
                                        if (com.yandex.go.summary.ui.compose.common.animation.c.i(bVar, i9, i10, tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1) != coroutineSingletons) {
                                            dkj0Var = i2;
                                            ix8 ix8Var2 = new ix8(((akj0) dkj0Var).b);
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = null;
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$4 = null;
                                            tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 3;
                                            break;
                                        }
                                    }
                                }
                            }
                            i2 = str2 != null ? c.i(str2, list) : ckj0Var;
                            z = i2 instanceof bkj0;
                            fwi fwiVar2 = this.w;
                            p651 p651Var2 = this.c;
                            if (!z) {
                            }
                        }
                        break;
                    case 1:
                    case 3:
                        kotlin.b.b(obj2);
                        break;
                    case 2:
                        dkj0Var = (dkj0) tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$4;
                        kotlin.b.b(obj2);
                        ix8 ix8Var22 = new ix8(((akj0) dkj0Var).b);
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = null;
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.L$4 = null;
                        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label = 3;
                        break;
                    case 4:
                    case 5:
                        kotlin.b.b(obj2);
                        break;
                    case 6:
                        kotlin.b.b(obj2);
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1 = new TariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardItemKt$CollectTariffCardComposeActionEffect$1$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        lz40 lz40Var2 = this.x;
        switch (i) {
        }
        return null;
    }
}
