package com.yandex.passport.internal.report.diary;

import android.os.Bundle;
import com.yandex.passport.internal.properties.AccountNotAuthorizedProperties;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.diary.DiaryRecorder$recordIntentData$1$1", f = "DiaryRecorder.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 70}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DiaryRecorder$recordIntentData$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ String $correction;
    final /* synthetic */ j $recordType;
    final /* synthetic */ k $this_runIf;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiaryRecorder$recordIntentData$1$1(String str, k kVar, j jVar, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.$correction = str;
        this.$this_runIf = kVar;
        this.$recordType = jVar;
        this.$bundle = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DiaryRecorder$recordIntentData$1$1 diaryRecorder$recordIntentData$1$1 = new DiaryRecorder$recordIntentData$1$1(this.$correction, this.$this_runIf, this.$recordType, this.$bundle, continuation);
        diaryRecorder$recordIntentData$1$1.L$0 = obj;
        return diaryRecorder$recordIntentData$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DiaryRecorder$recordIntentData$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        if (r10 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00de, code lost:
    
        if (r10 != r0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if (r10 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r10 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r10 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0075, code lost:
    
        if (r11 == r0) goto L60;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        Object k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            String str2 = this.$correction;
            if (str2 == null) {
                j jVar = this.$recordType;
                if (jVar instanceof i) {
                    str2 = ((i) jVar).a.getSignName();
                } else if (jVar instanceof f) {
                    str2 = "AccountNotAuthorized";
                } else if (jVar instanceof g) {
                    str2 = "Autologin";
                } else {
                    if (!(jVar instanceof h)) {
                        w511.b();
                        return null;
                    }
                    str2 = "AutologinRetry";
                }
            }
            str = str2;
            k kVar = this.$this_runIf;
            c cVar = kVar.c;
            kVar.b.getClass();
            com.yandex.passport.internal.database.diary.a aVar = new com.yandex.passport.internal.database.diary.a(str, System.currentTimeMillis(), true);
            this.L$0 = str;
            this.label = 1;
            a = cVar.a(aVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        k kVar2 = this.$this_runIf;
        j jVar2 = this.$recordType;
        Bundle bundle = this.$bundle;
        if (!(a instanceof Result.Failure)) {
            b bVar = kVar2.d;
            this.L$0 = a;
            this.label = 2;
            bVar.getClass();
            if (jVar2 instanceof f) {
                AccountNotAuthorizedProperties.Companion.getClass();
                k = bVar.c(str, "AccountNotAuthorizedProperties", com.yandex.passport.internal.properties.b.a(bundle), this);
                if (k != coroutineSingletons) {
                    k = zy11Var;
                }
            } else if (jVar2 instanceof g) {
                AutoLoginProperties.Companion.getClass();
                k = bVar.f(str, "AutoLoginProperties", com.yandex.passport.internal.properties.e.a(bundle), this);
                if (k != coroutineSingletons) {
                    k = zy11Var;
                }
            } else if (jVar2 instanceof h) {
                k = bVar.g(str, bundle, this);
            } else {
                if (!(jVar2 instanceof i)) {
                    w511.b();
                    return null;
                }
                k = bVar.k(str, ((i) jVar2).a, bundle, this);
            }
        }
        return zy11Var;
    }
}
