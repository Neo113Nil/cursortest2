package com.yandex.passport.internal.usecase;

import android.net.Uri;
import android.os.Build;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.j3;
import com.yandex.passport.data.network.o3;
import com.yandex.passport.data.network.r3;
import com.yandex.passport.data.network.s3;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d0 extends com.yandex.passport.common.domain.a {
    public final s3 b;
    public final com.yandex.passport.internal.network.e c;
    public final q d;
    public final h0 e;
    public final com.yandex.passport.common.common.a f;
    public final com.yandex.passport.internal.network.mappers.b g;
    public final String h;
    public final String i;

    public d0(com.yandex.passport.common.coroutine.a aVar, s3 s3Var, com.yandex.passport.internal.network.e eVar, q qVar, h0 h0Var, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = s3Var;
        this.c = eVar;
        this.d = qVar;
        this.e = h0Var;
        this.f = aVar2;
        this.g = bVar;
        this.h = String.valueOf(Build.VERSION.SDK_INT);
        this.i = "7.55.1";
    }

    public static c0 c(o3 o3Var) {
        String str = o3Var.a;
        List list = o3Var.b;
        if (jl40.l(str, "ALLOW")) {
            return !list.isEmpty() ? new a0(((r3) kotlin.collections.a.P(list)).b()) : b0.a;
        }
        if (jl40.l(str, "DENY")) {
            return new z(0);
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("Unknown challenge.action = ", str, LogLevel.ERROR, null, 8);
        }
        return new z(0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(1:(10:12|13|14|15|16|(1:18)|19|20|21|22)(2:25|26))(7:27|28|29|30|(4:32|(1:34)|35|(2:39|40))|41|(1:43)(7:46|16|(0)|19|20|21|22)))(1:47))(1:61)|48|(2:50|(1:52))|53|(4:55|(2:57|(2:59|45)(5:60|30|(0)|41|(0)(0)))|19|20)|21|22))|67|6|7|(0)(0)|48|(0)|53|(0)|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017c, code lost:
    
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007e, code lost:
    
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a5, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0196 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:16:0x0192, B:18:0x0196, B:19:0x019f, B:66:0x0189, B:28:0x0053, B:30:0x00d5, B:32:0x00e1, B:34:0x00eb, B:35:0x00f2, B:37:0x00f6, B:39:0x00fa, B:41:0x0104, B:55:0x00af, B:57:0x00b7, B:13:0x0039, B:14:0x017f, B:43:0x0108), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:16:0x0192, B:18:0x0196, B:19:0x019f, B:66:0x0189, B:28:0x0053, B:30:0x00d5, B:32:0x00e1, B:34:0x00eb, B:35:0x00f2, B:37:0x00f6, B:39:0x00fa, B:41:0x0104, B:55:0x00af, B:57:0x00b7, B:13:0x0039, B:14:0x017f, B:43:0x0108), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #1 {all -> 0x003e, blocks: (B:13:0x0039, B:14:0x017f, B:43:0x0108), top: B:7:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af A[Catch: all -> 0x01a4, TRY_ENTER, TryCatch #0 {all -> 0x01a4, blocks: (B:16:0x0192, B:18:0x0196, B:19:0x019f, B:66:0x0189, B:28:0x0053, B:30:0x00d5, B:32:0x00e1, B:34:0x00eb, B:35:0x00f2, B:37:0x00f6, B:39:0x00fa, B:41:0x0104, B:55:0x00af, B:57:0x00b7, B:13:0x0039, B:14:0x017f, B:43:0x0108), top: B:7:0x002c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.yandex.passport.common.core.Uid] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.yandex.passport.common.core.Uid] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.yandex.passport.common.core.Uid] */
    /* JADX WARN: Type inference failed for: r2v21 */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uid uid, Continuation continuation) {
        GetChallengeUseCase$run$1 getChallengeUseCase$run$1;
        int i;
        Object failure;
        Throwable a;
        Object a2;
        ModernAccount modernAccount;
        ?? r2;
        Object value;
        Throwable a3;
        String f;
        d0 d0Var = this;
        d0 d0Var2 = uid;
        if (continuation instanceof GetChallengeUseCase$run$1) {
            getChallengeUseCase$run$1 = (GetChallengeUseCase$run$1) continuation;
            int i2 = getChallengeUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChallengeUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getChallengeUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChallengeUseCase$run$1.label;
                Object obj2 = b0.a;
                ClientCredentials clientCredentials = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getChallengeUseCase$run$1.L$0 = d0Var;
                    getChallengeUseCase$run$1.L$1 = d0Var2;
                    getChallengeUseCase$run$1.label = 1;
                    obj = d0Var.d.a(d0Var2, getChallengeUseCase$run$1);
                } else if (i == 1) {
                    ?? r0 = (Uid) getChallengeUseCase$run$1.L$1;
                    d0 d0Var3 = (d0) getChallengeUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    d0Var2 = r0;
                    d0Var = d0Var3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d0Var2 = (d0) getChallengeUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        Object failure2 = ((Result) obj).getValue();
                        kotlin.b.b(failure2);
                        obj2 = failure2;
                        if (!(obj2 instanceof Result.Failure)) {
                            d0Var2.getClass();
                            obj2 = c((o3) obj2);
                        }
                        kotlin.b.b(obj2);
                        failure = obj2;
                        return new Result(failure);
                    }
                    modernAccount = (ModernAccount) getChallengeUseCase$run$1.L$2;
                    Uid uid2 = (Uid) getChallengeUseCase$run$1.L$1;
                    d0 d0Var4 = (d0) getChallengeUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    r2 = uid2;
                    d0Var2 = d0Var4;
                    a2 = obj;
                    value = ((Result) a2).getValue();
                    a3 = Result.a(value);
                    if (a3 != null) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can't get client token", a3);
                        }
                        if ((a3 instanceof InvalidTokenException) || (a3 instanceof PassportAccountNotFoundException)) {
                            return new Result(d6z.d(obj2));
                        }
                    }
                    if (!(value instanceof Result.Failure)) {
                        obj2 = value;
                        if (!(obj2 instanceof Result.Failure)) {
                        }
                        kotlin.b.b(obj2);
                        failure = obj2;
                        return new Result(failure);
                    }
                    s3 s3Var = d0Var2.b;
                    com.yandex.passport.common.common.a aVar = d0Var2.f;
                    com.yandex.passport.internal.network.mappers.b bVar = d0Var2.g;
                    Environment environment = r2.getEnvironment();
                    bVar.getClass();
                    com.yandex.passport.data.models.g a4 = com.yandex.passport.internal.network.mappers.b.a(environment);
                    long locationId = modernAccount.getLocationId();
                    String str = d0Var2.h;
                    String a5 = ((com.yandex.passport.internal.common.e) aVar).a();
                    String b = ((com.yandex.passport.internal.common.e) aVar).b();
                    String str2 = d0Var2.i;
                    String valueOf = String.valueOf(r2.getValue());
                    f = ((com.yandex.passport.internal.network.l) d0Var2.c).f(r2.getEnvironment(), Long.valueOf(modernAccount.getLocationId()), null);
                    Uri build = Uri.parse(f).buildUpon().appendEncodedPath("closewebview").build();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    j3 j3Var = new j3(a4, locationId, str, a5, b, str2, valueOf, build.toString(), ((ClientToken) value).getValue());
                    getChallengeUseCase$run$1.L$0 = d0Var2;
                    getChallengeUseCase$run$1.L$1 = null;
                    getChallengeUseCase$run$1.L$2 = null;
                    getChallengeUseCase$run$1.label = 3;
                    obj = s3Var.a(j3Var, getChallengeUseCase$run$1);
                }
                failure = ((Result) obj).getValue();
                a = Result.a(failure);
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can't find suitable master account for uid: " + d0Var2, a);
                    }
                }
                if (!(failure instanceof Result.Failure)) {
                    ModernAccount modernAccount2 = (ModernAccount) failure;
                    if (modernAccount2.isChild()) {
                        h0 h0Var = d0Var.e;
                        g0 g0Var = new g0(modernAccount2, clientCredentials, 6);
                        getChallengeUseCase$run$1.L$0 = d0Var;
                        getChallengeUseCase$run$1.L$1 = d0Var2;
                        getChallengeUseCase$run$1.L$2 = modernAccount2;
                        getChallengeUseCase$run$1.label = 2;
                        a2 = h0Var.a(g0Var, getChallengeUseCase$run$1);
                        if (a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        d0 d0Var5 = d0Var2;
                        d0Var2 = d0Var;
                        modernAccount = modernAccount2;
                        r2 = d0Var5;
                        value = ((Result) a2).getValue();
                        a3 = Result.a(value);
                        if (a3 != null) {
                        }
                        if (!(value instanceof Result.Failure)) {
                        }
                    }
                    kotlin.b.b(obj2);
                    failure = obj2;
                }
                return new Result(failure);
            }
        }
        getChallengeUseCase$run$1 = new GetChallengeUseCase$run$1(d0Var, (ContinuationImpl) continuation);
        Object obj3 = getChallengeUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChallengeUseCase$run$1.label;
        Object obj22 = b0.a;
        ClientCredentials clientCredentials2 = null;
        if (i != 0) {
        }
        failure = ((Result) obj3).getValue();
        a = Result.a(failure);
        if (a != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        return new Result(failure);
    }
}
