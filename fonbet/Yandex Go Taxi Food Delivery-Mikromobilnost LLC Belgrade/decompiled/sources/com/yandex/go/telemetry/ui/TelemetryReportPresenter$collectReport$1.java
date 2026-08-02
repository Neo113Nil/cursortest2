package com.yandex.go.telemetry.ui;

import com.yandex.go.telemetry.domain.a;
import com.yandex.go.telemetry.experiment.TelemetryReportConfigExperiment;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.udy0;
import defpackage.vdy0;
import defpackage.wls;
import defpackage.xdy0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.telemetry.ui.TelemetryReportPresenter$collectReport$1", f = "TelemetryReportPresenter.kt", l = {59, 60, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TelemetryReportPresenter$collectReport$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ udy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemetryReportPresenter$collectReport$1(udy0 udy0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = udy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TelemetryReportPresenter$collectReport$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TelemetryReportPresenter$collectReport$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0169  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0162 -> B:7:0x0165). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        udy0 udy0Var;
        StringBuilder sb;
        int i;
        StringBuilder sb2;
        Object obj2;
        String str;
        udy0 udy0Var2;
        StringBuilder sb3;
        StringBuilder sb4;
        Iterator it2;
        String str2;
        List list2;
        int i2;
        Object b;
        Object obj3;
        Iterator it3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 2;
        if (i3 == 0) {
            b.b(obj);
            List list3 = ((TelemetryReportConfigExperiment) this.this$0.B.a.b()).c;
            r0 r0Var = this.this$0.F;
            vdy0 vdy0Var = new vdy0(0, list3.size(), "");
            r0Var.getClass();
            r0Var.m(null, vdy0Var);
            udy0 udy0Var3 = this.this$0;
            StringBuilder sb5 = new StringBuilder();
            it = list3.iterator();
            list = list3;
            udy0Var = udy0Var3;
            sb = sb5;
            i = 0;
            sb2 = sb;
            if (it.hasNext()) {
            }
        } else {
            if (i3 == 1) {
                i = this.I$1;
                i2 = this.I$0;
                String str3 = (String) this.L$7;
                Iterator it4 = (Iterator) this.L$5;
                sb = (StringBuilder) this.L$3;
                sb2 = (StringBuilder) this.L$2;
                udy0Var = (udy0) this.L$1;
                list = (List) this.L$0;
                b.b(obj);
                str2 = str3;
                it3 = it4;
                obj3 = obj;
                str = (String) obj3;
                a aVar = udy0Var.D;
                this.L$0 = list;
                this.L$1 = udy0Var;
                this.L$2 = sb2;
                this.L$3 = sb;
                this.L$4 = null;
                this.L$5 = it3;
                this.L$6 = null;
                this.L$7 = str2;
                this.L$8 = str;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = i4;
                obj2 = aVar.a(str2, this);
                if (obj2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 2) {
                i = this.I$1;
                i2 = this.I$0;
                String str4 = (String) this.L$8;
                str2 = (String) this.L$7;
                it2 = (Iterator) this.L$5;
                sb4 = (StringBuilder) this.L$3;
                sb3 = (StringBuilder) this.L$2;
                udy0Var2 = (udy0) this.L$1;
                List list4 = (List) this.L$0;
                b.b(obj);
                str = str4;
                list2 = list4;
                obj2 = obj;
                String str5 = (String) obj2;
                a aVar2 = udy0Var2.E;
                this.L$0 = list2;
                this.L$1 = udy0Var2;
                this.L$2 = sb3;
                this.L$3 = sb4;
                this.L$4 = null;
                this.L$5 = it2;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = str;
                this.L$9 = str5;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 3;
                b = aVar2.b(str2, this);
                if (b != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            String str6 = (String) this.L$9;
            String str7 = (String) this.L$8;
            it2 = (Iterator) this.L$5;
            sb4 = (StringBuilder) this.L$3;
            sb3 = (StringBuilder) this.L$2;
            udy0Var2 = (udy0) this.L$1;
            List list5 = (List) this.L$0;
            b.b(obj);
            b = obj;
            String str8 = (String) b;
            if (i != 0) {
                sb4.append("\n\n\n");
            }
            g8e.D(sb4, str7, "\n\n", str6, "\n\n");
            sb4.append(str8);
            r0 r0Var2 = udy0Var2.F;
            vdy0 vdy0Var2 = new vdy0(i + 1, list5.size(), sb4.toString());
            r0Var2.getClass();
            r0Var2.m(null, vdy0Var2);
            i = i2;
            it = it2;
            sb = sb4;
            sb2 = sb3;
            udy0Var = udy0Var2;
            list = list5;
            i4 = 2;
            if (it.hasNext()) {
                Object next = it.next();
                int i5 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                String str9 = (String) next;
                a aVar3 = udy0Var.C;
                this.L$0 = list;
                this.L$1 = udy0Var;
                this.L$2 = sb2;
                this.L$3 = sb;
                this.L$4 = null;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = str9;
                this.L$8 = null;
                this.L$9 = null;
                this.I$0 = i5;
                this.I$1 = i;
                this.label = 1;
                obj3 = aVar3.c(str9, this);
                if (obj3 != coroutineSingletons) {
                    Iterator it5 = it;
                    str2 = str9;
                    i2 = i5;
                    it3 = it5;
                    str = (String) obj3;
                    a aVar4 = udy0Var.D;
                    this.L$0 = list;
                    this.L$1 = udy0Var;
                    this.L$2 = sb2;
                    this.L$3 = sb;
                    this.L$4 = null;
                    this.L$5 = it3;
                    this.L$6 = null;
                    this.L$7 = str2;
                    this.L$8 = str;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = i4;
                    obj2 = aVar4.a(str2, this);
                    if (obj2 != coroutineSingletons) {
                        StringBuilder sb6 = sb;
                        it2 = it3;
                        list2 = list;
                        udy0Var2 = udy0Var;
                        sb3 = sb2;
                        sb4 = sb6;
                        String str52 = (String) obj2;
                        a aVar22 = udy0Var2.E;
                        this.L$0 = list2;
                        this.L$1 = udy0Var2;
                        this.L$2 = sb3;
                        this.L$3 = sb4;
                        this.L$4 = null;
                        this.L$5 = it2;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = str;
                        this.L$9 = str52;
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.label = 3;
                        b = aVar22.b(str2, this);
                        if (b != coroutineSingletons) {
                            str7 = str;
                            list5 = list2;
                            str6 = str52;
                            String str82 = (String) b;
                            if (i != 0) {
                            }
                            g8e.D(sb4, str7, "\n\n", str6, "\n\n");
                            sb4.append(str82);
                            r0 r0Var22 = udy0Var2.F;
                            vdy0 vdy0Var22 = new vdy0(i + 1, list5.size(), sb4.toString());
                            r0Var22.getClass();
                            r0Var22.m(null, vdy0Var22);
                            i = i2;
                            it = it2;
                            sb = sb4;
                            sb2 = sb3;
                            udy0Var = udy0Var2;
                            list = list5;
                            i4 = 2;
                            if (it.hasNext()) {
                                r0 r0Var3 = udy0Var.F;
                                xdy0 xdy0Var = new xdy0(sb.toString());
                                r0Var3.getClass();
                                r0Var3.m(null, xdy0Var);
                                sb2.getClass();
                                return zy11.a;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
