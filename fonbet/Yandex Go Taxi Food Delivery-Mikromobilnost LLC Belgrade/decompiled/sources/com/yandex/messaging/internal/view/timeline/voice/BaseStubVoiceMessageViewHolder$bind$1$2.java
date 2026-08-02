package com.yandex.messaging.internal.view.timeline.voice;

import android.os.Handler;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.b00;
import defpackage.evu0;
import defpackage.jcz0;
import defpackage.k0b;
import defpackage.l1r;
import defpackage.lz;
import defpackage.mvg;
import defpackage.nu10;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.tz;
import defpackage.y2r;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.voice.BaseStubVoiceMessageViewHolder$bind$1$2", f = "BaseStubVoiceMessageViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseStubVoiceMessageViewHolder$bind$1$2 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStubVoiceMessageViewHolder$bind$1$2(a aVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BaseStubVoiceMessageViewHolder$bind$1$2(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        BaseStubVoiceMessageViewHolder$bind$1$2 baseStubVoiceMessageViewHolder$bind$1$2 = (BaseStubVoiceMessageViewHolder$bind$1$2) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        baseStubVoiceMessageViewHolder$bind$1$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        nu10 h0;
        jcz0 jcz0Var;
        String str3;
        jcz0 jcz0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        l1r l1rVar = aVar.C2;
        y2r y2rVar = aVar.b0;
        if ((y2rVar != null ? y2rVar.a : null) == null) {
            LocalMessageRef localMessageRef = aVar.g0;
            if (localMessageRef != null && aVar.e0().f != null && (jcz0Var2 = aVar.e0().f) != null) {
                jcz0Var2.w(localMessageRef);
            }
        } else if (!l1rVar.P) {
            boolean a = l1rVar.x.a(l1rVar.H);
            y2r y2rVar2 = aVar.b0;
            if (a) {
                if (y2rVar2 != null && (h0 = aVar.h0()) != null && (jcz0Var = aVar.e0().f) != null) {
                    jcz0Var.k(aVar.g0, aVar.u0, y2rVar2, h0);
                }
            } else if (y2rVar2 != null && (str = y2rVar2.a) != null) {
                l1rVar.d();
                k0b k0bVar = aVar.e0().c;
                y2r y2rVar3 = aVar.b0;
                if (y2rVar3 == null || (str2 = y2rVar3.b) == null) {
                    str2 = "";
                }
                String str4 = str2;
                k0bVar.getClass();
                tje.e();
                b00 b00Var = k0bVar.a;
                ((Handler) b00Var.a.get()).post(new tz(b00Var, k0bVar.b, str, str4, 1));
            }
        } else if (y2rVar != null && (str3 = y2rVar.a) != null) {
            String str5 = evu0.J(str3) ? null : str3;
            if (str5 != null) {
                k0b k0bVar2 = aVar.e0().c;
                k0bVar2.getClass();
                tje.e();
                b00 b00Var2 = k0bVar2.a;
                ((Handler) b00Var2.a.get()).post(new lz(0, b00Var2, k0bVar2.b, str5));
            }
        }
        return zy11.a;
    }
}
