package com.yandex.passport.internal.usecase;

import android.net.Uri;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.ae;
import com.yandex.passport.data.network.vd;
import com.yandex.passport.data.network.zd;
import com.yandex.passport.internal.ModernAccount;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.rzo;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/common/url/b;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.UpdateAvatarUseCase$run-gIAlu-s$$inlined$openUrl-EIfw9EY$1", f = "UpdateAvatarUseCase.kt", l = {HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "invokeSuspend")
/* renamed from: com.yandex.passport.internal.usecase.UpdateAvatarUseCase$run-gIAlu-s$$inlined$openUrl-EIfw9EY$1, reason: invalid class name */
/* loaded from: classes15.dex */
public final class UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $account$inlined;
    final /* synthetic */ String $commonUrl;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ t1 this$0;
    final /* synthetic */ t1 this$0$inline_fun;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1(t1 t1Var, String str, Continuation continuation, t1 t1Var2, ModernAccount modernAccount) {
        super(2, continuation);
        this.this$0$inline_fun = t1Var;
        this.$commonUrl = str;
        this.this$0 = t1Var2;
        this.$account$inlined = modernAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1(this.this$0$inline_fun, this.$commonUrl, continuation, this.this$0, this.$account$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c1 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:7:0x0011, B:8:0x00b7, B:10:0x00c1, B:11:0x00cb), top: B:6:0x0011 }] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InputStream openInputStream;
        ae aeVar;
        MasterToken masterToken;
        Object c;
        long j;
        com.yandex.passport.data.models.g gVar;
        Throwable th;
        Closeable closeable;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            openInputStream = this.this$0$inline_fun.b.getContentResolver().openInputStream(Uri.parse(this.$commonUrl));
            if (openInputStream == null) {
                return null;
            }
            try {
                byte[] R = rzo.R(openInputStream);
                t1 t1Var = this.this$0;
                aeVar = t1Var.d;
                com.yandex.passport.internal.network.mappers.b bVar = t1Var.g;
                Environment environment = this.$account$inlined.getUid().getEnvironment();
                bVar.getClass();
                com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(environment);
                long locationId = this.$account$inlined.getLocationId();
                masterToken = this.$account$inlined.getMasterToken();
                t1 t1Var2 = this.this$0;
                this.L$0 = openInputStream;
                this.L$1 = aeVar;
                this.L$2 = a;
                this.L$3 = masterToken;
                this.J$0 = locationId;
                this.label = 1;
                c = t1.c(t1Var2, R, this);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j = locationId;
                gVar = a;
            } catch (Throwable th2) {
                InputStream inputStream = openInputStream;
                th = th2;
                closeable = inputStream;
                throw th;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) this.L$0;
                try {
                    kotlin.b.b(obj);
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        value = new com.yandex.passport.common.url.b(((zd) value).b);
                    }
                    Result result = new Result(value);
                    ooc.g(closeable, null);
                    return result;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        ooc.g(closeable, th);
                        throw th4;
                    }
                }
            }
            long j2 = this.J$0;
            MasterToken masterToken2 = (MasterToken) this.L$3;
            com.yandex.passport.data.models.g gVar2 = (com.yandex.passport.data.models.g) this.L$2;
            aeVar = (ae) this.L$1;
            ?? r8 = (Closeable) this.L$0;
            try {
                kotlin.b.b(obj);
                j = j2;
                masterToken = masterToken2;
                c = obj;
                openInputStream = r8;
                gVar = gVar2;
            } catch (Throwable th5) {
                th = th5;
                closeable = r8;
                throw th;
            }
        }
        ae aeVar2 = aeVar;
        vd vdVar = new vd(gVar, j, masterToken.getNonNullValueOrThrow(), (byte[]) c);
        this.L$0 = openInputStream;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        Object a2 = aeVar2.a(vdVar, this);
        if (a2 != coroutineSingletons) {
            InputStream inputStream2 = openInputStream;
            obj = a2;
            closeable = inputStream2;
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            Result result2 = new Result(value);
            ooc.g(closeable, null);
            return result2;
        }
        return coroutineSingletons;
    }
}
