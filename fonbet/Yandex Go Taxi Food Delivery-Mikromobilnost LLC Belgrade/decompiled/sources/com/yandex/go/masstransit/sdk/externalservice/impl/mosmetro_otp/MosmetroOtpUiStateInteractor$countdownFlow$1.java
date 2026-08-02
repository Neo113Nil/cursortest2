package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import defpackage.b7z0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vye;
import defpackage.wls;
import defpackage.zy11;
import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.MosmetroOtpUiStateInteractor$countdownFlow$1", f = "MosmetroOtpUiStateInteractor.kt", l = {HProv.ALG_SID_NO_HASH, HProv.ALG_SID_KECCAK_256, 105, 112}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpUiStateInteractor$countdownFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $targetTime;
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpUiStateInteractor$countdownFlow$1(String str, h hVar, Continuation continuation) {
        super(2, continuation);
        this.$targetTime = str;
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MosmetroOtpUiStateInteractor$countdownFlow$1 mosmetroOtpUiStateInteractor$countdownFlow$1 = new MosmetroOtpUiStateInteractor$countdownFlow$1(this.$targetTime, this.this$0, continuation);
        mosmetroOtpUiStateInteractor$countdownFlow$1.L$0 = obj;
        return mosmetroOtpUiStateInteractor$countdownFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MosmetroOtpUiStateInteractor$countdownFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0123 -> B:8:0x0128). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Long valueOf;
        long longValue;
        vye vyeVar;
        long j3;
        long j4;
        long j5;
        vye vyeVar2;
        int i;
        Integer num;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        if (i2 == 0) {
            j = 0;
            j2 = 1000;
            kotlin.b.b(obj);
            String str = this.$targetTime;
            if (str == null) {
                Integer num2 = new Integer(0);
                this.L$0 = null;
                this.label = 1;
                return vprVar.emit(num2, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            this.this$0.getClass();
            if (!evu0.J(str)) {
                try {
                    valueOf = Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
                } catch (Throwable unused) {
                }
                if (valueOf == null) {
                    longValue = valueOf.longValue();
                    h hVar = this.this$0;
                    String str2 = this.$targetTime;
                    b7z0 b7z0Var = hVar.c;
                    LinkedHashMap linkedHashMap = hVar.d;
                    Object obj2 = linkedHashMap.get(str2);
                    if (obj2 == null) {
                        long a = longValue - b7z0Var.a();
                        if (a < 0) {
                            a = 0;
                        }
                        vye vyeVar3 = new vye(a, b7z0Var.uptimeMillis());
                        linkedHashMap.put(str2, vyeVar3);
                        obj2 = vyeVar3;
                    }
                    vyeVar = (vye) obj2;
                    j5 = this.this$0.c.uptimeMillis() - vyeVar.b;
                    j4 = vyeVar.a - j5;
                    if (j4 > j) {
                    }
                    num = new Integer(r11);
                    this.L$0 = vprVar;
                    this.L$1 = vyeVar;
                    this.J$0 = longValue;
                    this.J$1 = j5;
                    this.J$2 = j4;
                    this.I$0 = r11;
                    this.label = 3;
                    if (vprVar.emit(num, this) != coroutineSingletons) {
                    }
                }
                Integer num3 = new Integer(0);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (vprVar.emit(num3, this) == coroutineSingletons) {
                }
            }
            valueOf = null;
            if (valueOf == null) {
            }
        } else {
            if (i2 == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i2 == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j6 = this.J$0;
                vye vyeVar4 = (vye) this.L$1;
                kotlin.b.b(obj);
                vyeVar = vyeVar4;
                longValue = j6;
                long j7 = 1000;
                j = 0;
                j2 = j7;
                j5 = this.this$0.c.uptimeMillis() - vyeVar.b;
                j4 = vyeVar.a - j5;
                int i3 = j4 > j ? (int) (j4 / j2) : 0;
                num = new Integer(i3);
                this.L$0 = vprVar;
                this.L$1 = vyeVar;
                this.J$0 = longValue;
                this.J$1 = j5;
                this.J$2 = j4;
                this.I$0 = i3;
                this.label = 3;
                if (vprVar.emit(num, this) != coroutineSingletons) {
                    long j8 = longValue;
                    vyeVar2 = vyeVar;
                    i = i3;
                    j3 = j8;
                    if (i > 0) {
                        this.this$0.d.remove(this.$targetTime);
                        return zy11Var;
                    }
                    this.L$0 = vprVar;
                    this.L$1 = vyeVar2;
                    this.J$0 = j3;
                    this.J$1 = j5;
                    this.J$2 = j4;
                    this.I$0 = i;
                    this.label = 4;
                    j7 = j2;
                    if (kotlinx.coroutines.a.i(j7, this) != coroutineSingletons) {
                        long j9 = j3;
                        vyeVar = vyeVar2;
                        longValue = j9;
                        j2 = j7;
                        j5 = this.this$0.c.uptimeMillis() - vyeVar.b;
                        j4 = vyeVar.a - j5;
                        if (j4 > j) {
                        }
                        num = new Integer(i3);
                        this.L$0 = vprVar;
                        this.L$1 = vyeVar;
                        this.J$0 = longValue;
                        this.J$1 = j5;
                        this.J$2 = j4;
                        this.I$0 = i3;
                        this.label = 3;
                        if (vprVar.emit(num, this) != coroutineSingletons) {
                        }
                    }
                }
            }
            i = this.I$0;
            long j10 = this.J$2;
            long j11 = this.J$1;
            j = 0;
            long j12 = this.J$0;
            j2 = 1000;
            vyeVar2 = (vye) this.L$1;
            kotlin.b.b(obj);
            j3 = j12;
            j4 = j10;
            j5 = j11;
            if (i > 0) {
            }
        }
    }
}
