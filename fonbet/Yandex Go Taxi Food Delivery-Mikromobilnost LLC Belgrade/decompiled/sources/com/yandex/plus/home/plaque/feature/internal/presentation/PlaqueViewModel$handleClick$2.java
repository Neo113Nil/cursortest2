package com.yandex.plus.home.plaque.feature.internal.presentation;

import android.net.Uri;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.plus.log.api.LogPriority;
import defpackage.aic0;
import defpackage.bic0;
import defpackage.boc0;
import defpackage.cic0;
import defpackage.dic0;
import defpackage.eic0;
import defpackage.jmc0;
import defpackage.kjz;
import defpackage.kmc0;
import defpackage.lmc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o370;
import defpackage.pgz;
import defpackage.rkc0;
import defpackage.t2h;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zhc0;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.feature.internal.presentation.PlaqueViewModel$handleClick$2", f = "PlaqueViewModel.kt", l = {175, SubsamplingScaleImageView.ORIENTATION_180, 189, 192, 202}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlaqueViewModel$handleClick$2 extends SuspendLambda implements wls {
    final /* synthetic */ eic0 $action;
    final /* synthetic */ boc0 $currentContext;
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueViewModel$handleClick$2(eic0 eic0Var, boc0 boc0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$action = eic0Var;
        this.$currentContext = boc0Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaqueViewModel$handleClick$2(this.$action, this.$currentContext, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueViewModel$handleClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01bf, code lost:
    
        if (r3.emit(r5, r19) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0145, code lost:
    
        if (r3.emit(r4, r19) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        if (r3.emit(r4, r19) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009a, code lost:
    
        if (r3.emit(r4, r19) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d0, code lost:
    
        if (r2 == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0158  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object value;
        boc0 boc0Var;
        Object value2;
        boc0 boc0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    d dVar = this.this$0;
                    eic0 eic0Var = this.$action;
                    if (!(a instanceof Result.Failure)) {
                        kjz kjzVar = dVar.a;
                        bic0 bic0Var = (bic0) eic0Var;
                        String str = bic0Var.a;
                        pgz pgzVar = (pgz) kjzVar.c;
                        LogPriority logPriority = LogPriority.INFO;
                        if (pgzVar.e(logPriority)) {
                            pgzVar.a(logPriority, "PlaqueContextObservableImpl", unr0.l(')', "onRemoteActionSuccess(", str));
                        }
                        rkc0 rkc0Var = (rkc0) kjzVar.b;
                        Set set = rkc0Var.c;
                        r0 r0Var = rkc0Var.e;
                        do {
                            value = r0Var.getValue();
                            boc0Var = (boc0) value;
                            set.add(str);
                        } while (!r0Var.k(value, boc0.a(boc0Var, kotlin.collections.b.o(boc0Var.a, new Pair("PerformActionsSucceed", kotlin.collections.a.N0(set))))));
                        n0 n0Var = dVar.k;
                        jmc0 jmc0Var = new jmc0(bic0Var.a, true, bic0Var.c);
                        this.L$0 = a;
                        this.L$1 = null;
                        this.I$0 = 0;
                        this.label = 4;
                    }
                    d dVar2 = this.this$0;
                    eic0 eic0Var2 = this.$action;
                    if (Result.a(a) != null) {
                    }
                } else if (i == 4) {
                    a = this.L$0;
                    kotlin.b.b(obj);
                    d dVar22 = this.this$0;
                    eic0 eic0Var22 = this.$action;
                    if (Result.a(a) != null) {
                        kjz kjzVar2 = dVar22.a;
                        bic0 bic0Var2 = (bic0) eic0Var22;
                        String str2 = bic0Var2.a;
                        pgz pgzVar2 = (pgz) kjzVar2.c;
                        LogPriority logPriority2 = LogPriority.INFO;
                        if (pgzVar2.e(logPriority2)) {
                            pgzVar2.a(logPriority2, "PlaqueContextObservableImpl", unr0.l(')', "onRemoteActionFailure(", str2));
                        }
                        rkc0 rkc0Var2 = (rkc0) kjzVar2.b;
                        Set set2 = rkc0Var2.d;
                        r0 r0Var2 = rkc0Var2.e;
                        do {
                            value2 = r0Var2.getValue();
                            boc0Var2 = (boc0) value2;
                            set2.add(str2);
                        } while (!r0Var2.k(value2, boc0.a(boc0Var2, kotlin.collections.b.o(boc0Var2.a, new Pair("PerformActionsFailed", kotlin.collections.a.N0(set2))))));
                        n0 n0Var2 = dVar22.k;
                        jmc0 jmc0Var2 = new jmc0(bic0Var2.a, false, bic0Var2.c);
                        this.L$0 = a;
                        this.L$1 = null;
                        this.I$0 = 0;
                        this.label = 5;
                    }
                } else {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            kotlin.b.b(obj);
        } else {
            kotlin.b.b(obj);
            eic0 eic0Var3 = this.$action;
            if (eic0Var3 instanceof dic0) {
                Boolean bool = (Boolean) this.$currentContext.c.get(((dic0) eic0Var3).a);
                boolean booleanValue = bool != null ? bool.booleanValue() : this.$currentContext.d;
                n0 n0Var3 = this.this$0.k;
                lmc0 lmc0Var = new lmc0(((dic0) this.$action).a, booleanValue);
                this.Z$0 = booleanValue;
                this.label = 1;
            } else if (eic0Var3 instanceof cic0) {
                n0 n0Var4 = this.this$0.k;
                cic0 cic0Var = (cic0) eic0Var3;
                kmc0 kmc0Var = new kmc0(cic0Var.b, cic0Var.c);
                this.label = 2;
            } else if (eic0Var3 instanceof zhc0) {
                o370 o370Var = this.this$0.g;
                String str3 = ((zhc0) eic0Var3).b;
                t2h t2hVar = (t2h) o370Var.a;
                t2hVar.getClass();
                t2hVar.a(Uri.parse(str3));
            } else if (!(eic0Var3 instanceof aic0)) {
                if (!(eic0Var3 instanceof bic0)) {
                    w511.b();
                    return null;
                }
                this.label = 3;
                a = this.this$0.d.a((bic0) eic0Var3, this);
            }
        }
        return zy11.a;
    }
}
