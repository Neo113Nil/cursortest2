package com.yandex.go.superapp.unified_polling;

import com.yandex.go.drive.api.models.GoDriveSessionState;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrderDto;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrdersDto;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto;
import defpackage.b64;
import defpackage.fnt;
import defpackage.gy11;
import defpackage.hy11;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lfnt;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1", f = "UnifiedPollingRepositoryImpl.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ SuperAppOrdersPayloadDto $payload;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1(k kVar, SuperAppOrdersPayloadDto superAppOrdersPayloadDto, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$payload = superAppOrdersPayloadDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        fnt fntVar;
        GoDriveSessionState goDriveSessionState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        SuperAppOrdersPayloadDto superAppOrdersPayloadDto = this.$payload;
        this.label = 1;
        kVar.getClass();
        kotlinx.serialization.json.b bVar = superAppOrdersPayloadDto.c;
        ?? r3 = EmptyList.a;
        if (bVar != null) {
            hy11 hy11Var = (hy11) kVar.d.get();
            hy11Var.getClass();
            try {
                failure = (DriveOrdersDto) ((xnt) hy11Var.a).d(bVar, DriveOrdersDto.Companion.serializer());
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a == null) {
                List<DriveOrderDto> list = ((DriveOrdersDto) failure).a;
                if (list != null) {
                    r3 = new ArrayList();
                    for (DriveOrderDto driveOrderDto : list) {
                        if (driveOrderDto.getA() == null) {
                            jst.e.d("DriveSdkInGo", b64.l("failed to parse order: ", driveOrderDto.getD(), Extension.FIX_SPACE, driveOrderDto.getB()));
                            fntVar = null;
                        } else {
                            String a2 = driveOrderDto.getA();
                            String b = driveOrderDto.getB();
                            Long c = driveOrderDto.getC();
                            String d = driveOrderDto.getD();
                            String e = driveOrderDto.getE();
                            String f = driveOrderDto.getF();
                            String g = driveOrderDto.getG();
                            switch (gy11.a[driveOrderDto.getH().ordinal()]) {
                                case 1:
                                    goDriveSessionState = GoDriveSessionState.ReservationFree;
                                    break;
                                case 2:
                                    goDriveSessionState = GoDriveSessionState.ReservationPaid;
                                    break;
                                case 3:
                                    goDriveSessionState = GoDriveSessionState.AcceptanceFree;
                                    break;
                                case 4:
                                    goDriveSessionState = GoDriveSessionState.AcceptancePaid;
                                    break;
                                case 5:
                                    goDriveSessionState = GoDriveSessionState.Riding;
                                    break;
                                case 6:
                                    goDriveSessionState = GoDriveSessionState.Parking;
                                    break;
                                case 7:
                                    goDriveSessionState = GoDriveSessionState.Unrecognized;
                                    break;
                                default:
                                    w511.b();
                                    return null;
                            }
                            fntVar = new fnt(a2, b, c, d, e, f, g, goDriveSessionState);
                        }
                        if (fntVar != null) {
                            r3.add(fntVar);
                        }
                    }
                }
            } else {
                jst.e.h("DriveSdkInGo", "failed to parse orders", a);
            }
        }
        return r3 == coroutineSingletons ? coroutineSingletons : r3;
    }
}
