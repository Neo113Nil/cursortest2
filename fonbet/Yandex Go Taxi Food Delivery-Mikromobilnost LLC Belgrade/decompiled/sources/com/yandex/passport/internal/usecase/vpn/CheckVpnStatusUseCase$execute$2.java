package com.yandex.passport.internal.usecase.vpn;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.coroutine.f;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.util.p;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bvf0;
import defpackage.g050;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.usecase.vpn.CheckVpnStatusUseCase$execute$2", f = "CheckVpnStatusUseCase.kt", l = {65, JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CheckVpnStatusUseCase$execute$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckVpnStatusUseCase$execute$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckVpnStatusUseCase$execute$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckVpnStatusUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r8.a(r9) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (com.yandex.passport.internal.usecase.vpn.b.b(r10, r9) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        g050 g050Var;
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SharedPreferences b = this.this$0.e.a.b(Environment.PRODUCTION);
            if ((b != null ? b.getBoolean("blockVpn", false) : false) || ((Boolean) this.this$0.f.b(q.C0)).booleanValue()) {
                b bVar2 = this.this$0;
                this.label = 1;
            }
        }
        if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
            try {
                boolean z = bVar.o;
                if (!z) {
                    bVar.o = true;
                }
                g050Var.d(null);
                b bVar3 = this.this$0;
                if (!z) {
                    ((f) bVar3.b).getClass();
                    sjh sjhVar = uyj.a;
                    tje.N(bvf0.a(mdh.b.plus(p.o("io"))), ((com.yandex.passport.common.coroutine.b) bVar3.a).c, null, new CheckVpnStatusUseCase$observePropertyChanges$1(bVar3, null), 2);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "CheckVpnStatusUseCase observing started", 8);
                    }
                    b bVar4 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    return bVar4.e("main", this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (b.a(bVar3, this) == coroutineSingletons) {
                }
            } catch (Throwable th) {
                g050Var.d(null);
                throw th;
            }
        }
        bVar = this.this$0;
        g050Var = bVar.q;
        this.L$0 = g050Var;
        this.L$1 = bVar;
        this.label = 2;
    }
}
