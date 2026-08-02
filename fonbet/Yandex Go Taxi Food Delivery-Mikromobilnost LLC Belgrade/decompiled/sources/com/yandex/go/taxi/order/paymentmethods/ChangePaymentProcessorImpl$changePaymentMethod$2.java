package com.yandex.go.taxi.order.paymentmethods;

import com.yandex.go.taxi.order.domain.repositories.e;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.e3n;
import defpackage.jc9;
import defpackage.kp50;
import defpackage.kv90;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.vg10;
import defpackage.wls;
import defpackage.yc9;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.paymentmethods.ChangePaymentProcessorImpl$changePaymentMethod$2", f = "ChangePaymentProcessorImpl.kt", l = {44, 46, 48, 53, 54, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangePaymentProcessorImpl$changePaymentMethod$2 extends SuspendLambda implements wls {
    final /* synthetic */ yc9 $param;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePaymentProcessorImpl$changePaymentMethod$2(a aVar, yc9 yc9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$param = yc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangePaymentProcessorImpl$changePaymentMethod$2(this.this$0, this.$param, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentProcessorImpl$changePaymentMethod$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166 A[Catch: all -> 0x0079, CancellationException -> 0x024c, TryCatch #2 {CancellationException -> 0x024c, blocks: (B:9:0x0030, B:10:0x01d4, B:27:0x0050, B:28:0x019d, B:30:0x01a4, B:36:0x01b0, B:38:0x01b4, B:46:0x01de, B:47:0x01e6, B:48:0x01e7, B:49:0x01ee, B:51:0x0142, B:54:0x015d, B:56:0x0166, B:62:0x0171, B:63:0x017e, B:66:0x0175, B:73:0x0072, B:77:0x008f, B:78:0x0214, B:79:0x021c, B:84:0x00ac, B:87:0x00c1, B:90:0x0114, B:92:0x011e, B:95:0x01fb, B:110:0x00ff), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171 A[Catch: all -> 0x0079, CancellationException -> 0x024c, TryCatch #2 {CancellationException -> 0x024c, blocks: (B:9:0x0030, B:10:0x01d4, B:27:0x0050, B:28:0x019d, B:30:0x01a4, B:36:0x01b0, B:38:0x01b4, B:46:0x01de, B:47:0x01e6, B:48:0x01e7, B:49:0x01ee, B:51:0x0142, B:54:0x015d, B:56:0x0166, B:62:0x0171, B:63:0x017e, B:66:0x0175, B:73:0x0072, B:77:0x008f, B:78:0x0214, B:79:0x021c, B:84:0x00ac, B:87:0x00c1, B:90:0x0114, B:92:0x011e, B:95:0x01fb, B:110:0x00ff), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175 A[Catch: all -> 0x0079, CancellationException -> 0x024c, TryCatch #2 {CancellationException -> 0x024c, blocks: (B:9:0x0030, B:10:0x01d4, B:27:0x0050, B:28:0x019d, B:30:0x01a4, B:36:0x01b0, B:38:0x01b4, B:46:0x01de, B:47:0x01e6, B:48:0x01e7, B:49:0x01ee, B:51:0x0142, B:54:0x015d, B:56:0x0166, B:62:0x0171, B:63:0x017e, B:66:0x0175, B:73:0x0072, B:77:0x008f, B:78:0x0214, B:79:0x021c, B:84:0x00ac, B:87:0x00c1, B:90:0x0114, B:92:0x011e, B:95:0x01fb, B:110:0x00ff), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e A[Catch: all -> 0x01f7, CancellationException -> 0x024c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x024c, blocks: (B:9:0x0030, B:10:0x01d4, B:27:0x0050, B:28:0x019d, B:30:0x01a4, B:36:0x01b0, B:38:0x01b4, B:46:0x01de, B:47:0x01e6, B:48:0x01e7, B:49:0x01ee, B:51:0x0142, B:54:0x015d, B:56:0x0166, B:62:0x0171, B:63:0x017e, B:66:0x0175, B:73:0x0072, B:77:0x008f, B:78:0x0214, B:79:0x021c, B:84:0x00ac, B:87:0x00c1, B:90:0x0114, B:92:0x011e, B:95:0x01fb, B:110:0x00ff), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb A[Catch: all -> 0x01f7, CancellationException -> 0x024c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x024c, blocks: (B:9:0x0030, B:10:0x01d4, B:27:0x0050, B:28:0x019d, B:30:0x01a4, B:36:0x01b0, B:38:0x01b4, B:46:0x01de, B:47:0x01e6, B:48:0x01e7, B:49:0x01ee, B:51:0x0142, B:54:0x015d, B:56:0x0166, B:62:0x0171, B:63:0x017e, B:66:0x0175, B:73:0x0072, B:77:0x008f, B:78:0x0214, B:79:0x021c, B:84:0x00ac, B:87:0x00c1, B:90:0x0114, B:92:0x011e, B:95:0x01fb, B:110:0x00ff), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ysg] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yandex.go.taxi.order.models.api.TaxiOrder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.yandex.go.taxi.order.models.api.TaxiOrder] */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.yandex.go.taxi.order.models.api.TaxiOrder] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.yandex.go.taxi.order.models.api.TaxiOrder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0194 -> B:28:0x019d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        ?? r6;
        a aVar2;
        Object a;
        yc9 yc9Var;
        Object obj2;
        ?? r2;
        OrderChangesDto.Status status;
        a aVar3;
        OrderChangesDto.PendingChangeDto pendingChangeDto;
        a aVar4;
        OrderChangesDto.PendingChangeDto pendingChangeDto2;
        a aVar5;
        Object obj3;
        yc9 yc9Var2;
        a aVar6;
        Object obj4;
        yc9 yc9Var3;
        OrderChangesDto.PendingChangeDto pendingChangeDto3;
        OrderChangesDto.Status status2;
        boolean z;
        long U;
        OrderChangesDto.PendingChangeDto pendingChangeDto4;
        OrderChangesDto.Status status3;
        Object obj5;
        a aVar7;
        yc9 yc9Var4;
        a aVar8;
        boolean z2;
        yc9 yc9Var5;
        a aVar9;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z3 = true;
        try {
            try {
                switch (this.label) {
                    case 0:
                        b.b(obj);
                        ?? i = ((e0) this.this$0.e).i(this.$param.b);
                        yc9 yc9Var6 = this.$param;
                        if (i == null) {
                            vg10.p("Failed to change payment method: missing order [", yc9Var6, ".orderId]");
                            return null;
                        }
                        PaymentMethod$Type paymentMethod$Type = yc9Var6.d;
                        String str = yc9Var6.e;
                        synchronized (i) {
                            TaxiOrderPendingChanges taxiOrderPendingChanges = i.i;
                            lv90.Companion.getClass();
                            i.i = taxiOrderPendingChanges.k(kv90.a(paymentMethod$Type, str, null));
                        }
                        aVar2 = this.this$0;
                        yc9 yc9Var7 = this.$param;
                        try {
                            this.L$0 = i;
                            this.L$1 = aVar2;
                            this.L$2 = yc9Var7;
                            this.L$3 = aVar2;
                            this.label = 1;
                            a = a.a(aVar2, yc9Var7, this);
                            if (a != coroutineSingletons) {
                                yc9Var = yc9Var7;
                                obj2 = i;
                                r2 = aVar2;
                                try {
                                    OrderChangesDto.PendingChangeDto pendingChangeDto5 = (OrderChangesDto.PendingChangeDto) a;
                                    status = pendingChangeDto5.b;
                                    String str2 = pendingChangeDto5.a;
                                    if (status == OrderChangesDto.Status.FAILED) {
                                        e eVar = aVar2.b;
                                        String str3 = yc9Var.b;
                                        this.L$0 = obj2;
                                        this.L$1 = aVar2;
                                        this.L$2 = yc9Var;
                                        this.L$3 = r2;
                                        this.L$4 = pendingChangeDto5;
                                        this.label = 2;
                                        r2 = r2;
                                        obj2 = obj2;
                                        if (eVar.a(str3, str2, this) != coroutineSingletons) {
                                            a aVar10 = aVar2;
                                            aVar4 = r2;
                                            pendingChangeDto2 = pendingChangeDto5;
                                            aVar5 = aVar10;
                                            yc9 yc9Var8 = yc9Var;
                                            obj3 = obj2;
                                            yc9Var2 = yc9Var8;
                                            String str4 = yc9Var2.a;
                                            String str5 = yc9Var2.b;
                                            this.L$0 = obj3;
                                            this.L$1 = aVar5;
                                            this.L$2 = yc9Var2;
                                            this.L$3 = aVar4;
                                            this.L$4 = pendingChangeDto2;
                                            this.L$5 = null;
                                            this.label = 4;
                                            obj4 = a.b(aVar5, str4, str5, pendingChangeDto2, this);
                                            pendingChangeDto3 = pendingChangeDto2;
                                            yc9Var3 = yc9Var2;
                                            if (obj4 == coroutineSingletons) {
                                                r2 = pendingChangeDto2;
                                                obj2 = yc9Var2;
                                            }
                                            status2 = (OrderChangesDto.Status) obj4;
                                            aVar5.getClass();
                                            if (status2 != OrderChangesDto.Status.SUCCESS && status2 != OrderChangesDto.Status.FAILED) {
                                                z = false;
                                                if (z) {
                                                    o430 o430Var = e3n.b;
                                                    U = 0;
                                                } else {
                                                    o430 o430Var2 = e3n.b;
                                                    U = kp50.U(5, DurationUnit.SECONDS);
                                                }
                                                this.L$0 = obj3;
                                                this.L$1 = aVar5;
                                                this.L$2 = yc9Var3;
                                                this.L$3 = aVar4;
                                                this.L$4 = pendingChangeDto3;
                                                this.L$5 = status2;
                                                this.label = 5;
                                                r2 = pendingChangeDto3;
                                                obj2 = yc9Var3;
                                                if (kotlinx.coroutines.a.j(U, this) != coroutineSingletons) {
                                                    a aVar11 = aVar4;
                                                    pendingChangeDto4 = pendingChangeDto3;
                                                    status3 = status2;
                                                    obj5 = obj3;
                                                    aVar7 = aVar5;
                                                    yc9Var4 = yc9Var3;
                                                    aVar8 = aVar11;
                                                    aVar7.getClass();
                                                    if (status3 != OrderChangesDto.Status.SUCCESS && status3 != OrderChangesDto.Status.FAILED) {
                                                        z2 = false;
                                                        if (z2) {
                                                            pendingChangeDto2 = pendingChangeDto4;
                                                            aVar4 = aVar8;
                                                            yc9Var2 = yc9Var4;
                                                            aVar5 = aVar7;
                                                            obj3 = obj5;
                                                            z3 = true;
                                                            String str42 = yc9Var2.a;
                                                            String str52 = yc9Var2.b;
                                                            this.L$0 = obj3;
                                                            this.L$1 = aVar5;
                                                            this.L$2 = yc9Var2;
                                                            this.L$3 = aVar4;
                                                            this.L$4 = pendingChangeDto2;
                                                            this.L$5 = null;
                                                            this.label = 4;
                                                            obj4 = a.b(aVar5, str42, str52, pendingChangeDto2, this);
                                                            pendingChangeDto3 = pendingChangeDto2;
                                                            yc9Var3 = yc9Var2;
                                                            if (obj4 == coroutineSingletons) {
                                                            }
                                                            status2 = (OrderChangesDto.Status) obj4;
                                                            aVar5.getClass();
                                                            if (status2 != OrderChangesDto.Status.SUCCESS) {
                                                                z = false;
                                                                if (z) {
                                                                }
                                                                this.L$0 = obj3;
                                                                this.L$1 = aVar5;
                                                                this.L$2 = yc9Var3;
                                                                this.L$3 = aVar4;
                                                                this.L$4 = pendingChangeDto3;
                                                                this.L$5 = status2;
                                                                this.label = 5;
                                                                r2 = pendingChangeDto3;
                                                                obj2 = yc9Var3;
                                                                if (kotlinx.coroutines.a.j(U, this) != coroutineSingletons) {
                                                                }
                                                            }
                                                        } else {
                                                            if (status3 == null) {
                                                                throw new IllegalArgumentException("Required value was null.");
                                                            }
                                                            if (status3 == OrderChangesDto.Status.FAILED) {
                                                                throw aVar7.c("Polling error", pendingChangeDto4.a);
                                                            }
                                                            e eVar2 = aVar7.b;
                                                            String str6 = yc9Var4.b;
                                                            this.L$0 = obj5;
                                                            this.L$1 = aVar7;
                                                            this.L$2 = yc9Var4;
                                                            this.L$3 = aVar8;
                                                            this.L$4 = null;
                                                            this.L$5 = null;
                                                            this.L$6 = status3;
                                                            r2 = 6;
                                                            this.label = 6;
                                                            obj2 = aVar8;
                                                            if (eVar2.b(str6, this) != coroutineSingletons) {
                                                                aVar = aVar8;
                                                                yc9Var5 = yc9Var4;
                                                                aVar9 = aVar7;
                                                                r6 = obj5;
                                                                aVar9.a.j(0L, yc9Var5.b);
                                                                return zy11.a;
                                                            }
                                                        }
                                                    }
                                                    z2 = true;
                                                    if (z2) {
                                                    }
                                                }
                                            }
                                            z = z3;
                                            if (z) {
                                            }
                                            this.L$0 = obj3;
                                            this.L$1 = aVar5;
                                            this.L$2 = yc9Var3;
                                            this.L$3 = aVar4;
                                            this.L$4 = pendingChangeDto3;
                                            this.L$5 = status2;
                                            this.label = 5;
                                            r2 = pendingChangeDto3;
                                            obj2 = yc9Var3;
                                            if (kotlinx.coroutines.a.j(U, this) != coroutineSingletons) {
                                            }
                                        }
                                    } else {
                                        e eVar3 = aVar2.b;
                                        String str7 = yc9Var.b;
                                        this.L$0 = obj2;
                                        this.L$1 = aVar2;
                                        this.L$2 = r2;
                                        this.L$3 = pendingChangeDto5;
                                        this.label = 3;
                                        r2 = r2;
                                        obj2 = obj2;
                                        if (eVar3.c(str7, str2, this) != coroutineSingletons) {
                                            aVar3 = aVar2;
                                            r6 = obj2;
                                            pendingChangeDto = pendingChangeDto5;
                                            aVar6 = r2;
                                            throw aVar3.c("Request with retries failed", pendingChangeDto.a);
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    aVar = r2;
                                    r6 = obj2;
                                    synchronized (r6) {
                                    }
                                }
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = i;
                            aVar = aVar2;
                            synchronized (r6) {
                            }
                        }
                        break;
                    case 1:
                        a aVar12 = (a) this.L$3;
                        yc9 yc9Var9 = (yc9) this.L$2;
                        a aVar13 = (a) this.L$1;
                        Object obj6 = (TaxiOrder) this.L$0;
                        try {
                            b.b(obj);
                            yc9Var = yc9Var9;
                            aVar2 = aVar13;
                            obj2 = obj6;
                            a = obj;
                            r2 = aVar12;
                            OrderChangesDto.PendingChangeDto pendingChangeDto52 = (OrderChangesDto.PendingChangeDto) a;
                            status = pendingChangeDto52.b;
                            String str22 = pendingChangeDto52.a;
                            if (status == OrderChangesDto.Status.FAILED) {
                            }
                            return coroutineSingletons;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar12;
                            r6 = obj6;
                            synchronized (r6) {
                            }
                        }
                        break;
                    case 2:
                        OrderChangesDto.PendingChangeDto pendingChangeDto6 = (OrderChangesDto.PendingChangeDto) this.L$4;
                        aVar4 = (a) this.L$3;
                        yc9 yc9Var10 = (yc9) this.L$2;
                        aVar5 = (a) this.L$1;
                        obj3 = (TaxiOrder) this.L$0;
                        b.b(obj);
                        pendingChangeDto2 = pendingChangeDto6;
                        yc9Var2 = yc9Var10;
                        String str422 = yc9Var2.a;
                        String str522 = yc9Var2.b;
                        this.L$0 = obj3;
                        this.L$1 = aVar5;
                        this.L$2 = yc9Var2;
                        this.L$3 = aVar4;
                        this.L$4 = pendingChangeDto2;
                        this.L$5 = null;
                        this.label = 4;
                        obj4 = a.b(aVar5, str422, str522, pendingChangeDto2, this);
                        pendingChangeDto3 = pendingChangeDto2;
                        yc9Var3 = yc9Var2;
                        if (obj4 == coroutineSingletons) {
                        }
                        status2 = (OrderChangesDto.Status) obj4;
                        aVar5.getClass();
                        if (status2 != OrderChangesDto.Status.SUCCESS) {
                        }
                        z = z3;
                        if (z) {
                        }
                        this.L$0 = obj3;
                        this.L$1 = aVar5;
                        this.L$2 = yc9Var3;
                        this.L$3 = aVar4;
                        this.L$4 = pendingChangeDto3;
                        this.L$5 = status2;
                        this.label = 5;
                        r2 = pendingChangeDto3;
                        obj2 = yc9Var3;
                        if (kotlinx.coroutines.a.j(U, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        pendingChangeDto = (OrderChangesDto.PendingChangeDto) this.L$3;
                        aVar6 = (a) this.L$2;
                        aVar3 = (a) this.L$1;
                        r6 = (TaxiOrder) this.L$0;
                        try {
                            b.b(obj);
                            aVar6 = aVar6;
                            throw aVar3.c("Request with retries failed", pendingChangeDto.a);
                        } catch (Throwable th4) {
                            th = th4;
                            aVar = aVar6;
                            synchronized (r6) {
                                TaxiOrderPendingChanges taxiOrderPendingChanges2 = r6.i;
                                lv90.Companion.getClass();
                                TaxiOrderPendingChanges k = taxiOrderPendingChanges2.k(lv90.g);
                                k.g(ChangeOrderState$Source.PAYMENT);
                                r6.i = k;
                            }
                            aVar.d.g(r6);
                            aVar.g.b("changePaymentMethod", th, new jc9(7));
                            throw th;
                        }
                    case 4:
                        OrderChangesDto.PendingChangeDto pendingChangeDto7 = (OrderChangesDto.PendingChangeDto) this.L$4;
                        aVar4 = (a) this.L$3;
                        yc9 yc9Var11 = (yc9) this.L$2;
                        aVar5 = (a) this.L$1;
                        obj3 = (TaxiOrder) this.L$0;
                        b.b(obj);
                        obj4 = obj;
                        pendingChangeDto3 = pendingChangeDto7;
                        yc9Var3 = yc9Var11;
                        status2 = (OrderChangesDto.Status) obj4;
                        aVar5.getClass();
                        if (status2 != OrderChangesDto.Status.SUCCESS) {
                        }
                        z = z3;
                        if (z) {
                        }
                        this.L$0 = obj3;
                        this.L$1 = aVar5;
                        this.L$2 = yc9Var3;
                        this.L$3 = aVar4;
                        this.L$4 = pendingChangeDto3;
                        this.L$5 = status2;
                        this.label = 5;
                        r2 = pendingChangeDto3;
                        obj2 = yc9Var3;
                        if (kotlinx.coroutines.a.j(U, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        status3 = (OrderChangesDto.Status) this.L$5;
                        pendingChangeDto4 = (OrderChangesDto.PendingChangeDto) this.L$4;
                        a aVar14 = (a) this.L$3;
                        yc9Var4 = (yc9) this.L$2;
                        aVar7 = (a) this.L$1;
                        obj5 = (TaxiOrder) this.L$0;
                        try {
                            b.b(obj);
                            aVar8 = aVar14;
                            aVar7.getClass();
                            if (status3 != OrderChangesDto.Status.SUCCESS) {
                                z2 = false;
                                if (z2) {
                                }
                                break;
                            }
                            z2 = true;
                            if (z2) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            aVar = aVar14;
                            r6 = obj5;
                            synchronized (r6) {
                            }
                        }
                        break;
                    case 6:
                        aVar = (a) this.L$3;
                        yc9Var5 = (yc9) this.L$2;
                        aVar9 = (a) this.L$1;
                        r6 = (TaxiOrder) this.L$0;
                        try {
                            b.b(obj);
                            aVar9.a.j(0L, yc9Var5.b);
                            return zy11.a;
                        } catch (Throwable th6) {
                            th = th6;
                            synchronized (r6) {
                            }
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th7) {
            th = th7;
            aVar = aVar4;
            r6 = obj3;
        }
    }
}
