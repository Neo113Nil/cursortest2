package com.yandex.go.telemetry.domain;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.telemetry.domain.PingInteractor$ping$2", f = "PingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes7.dex */
final class PingInteractor$ping$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $hostName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PingInteractor$ping$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$hostName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PingInteractor$ping$2(this.$hostName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PingInteractor$ping$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = this.$hostName;
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec("ping -c 5 " + str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(((Object) readLine) + "\n");
            }
            exec.destroy();
            sb.append("\nping finish");
        } catch (Exception e) {
            jst.e.k(e, "Error executing ping command");
            sb.append("\nping failed");
        }
        return sb.toString();
    }
}
