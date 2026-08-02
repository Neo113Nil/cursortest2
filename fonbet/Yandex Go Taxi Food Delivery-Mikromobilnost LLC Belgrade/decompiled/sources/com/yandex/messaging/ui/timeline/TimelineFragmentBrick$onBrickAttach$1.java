package com.yandex.messaging.ui.timeline;

import android.os.Handler;
import androidx.appcompat.widget.Toolbar;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messaging.internal.view.input.edit.EditMessageDraft;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.b00;
import defpackage.fbz0;
import defpackage.fdz0;
import defpackage.fqb1;
import defpackage.gdz0;
import defpackage.hcz0;
import defpackage.idz0;
import defpackage.j3b;
import defpackage.jbz0;
import defpackage.jdz0;
import defpackage.kdz0;
import defpackage.mdz0;
import defpackage.mvg;
import defpackage.n720;
import defpackage.nmn;
import defpackage.ny61;
import defpackage.okb1;
import defpackage.oyj0;
import defpackage.oz;
import defpackage.q6b;
import defpackage.ryv;
import defpackage.s8b;
import defpackage.tz10;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loyj0;", "Lj3b;", "Lcom/yandex/messaging/internal/net/Error;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Loyj0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineFragmentBrick$onBrickAttach$1", f = "TimelineFragmentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineFragmentBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFragmentBrick$onBrickAttach$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineFragmentBrick$onBrickAttach$1 timelineFragmentBrick$onBrickAttach$1 = new TimelineFragmentBrick$onBrickAttach$1(this.this$0, continuation);
        timelineFragmentBrick$onBrickAttach$1.L$0 = obj;
        return timelineFragmentBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineFragmentBrick$onBrickAttach$1 timelineFragmentBrick$onBrickAttach$1 = (TimelineFragmentBrick$onBrickAttach$1) create((oyj0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineFragmentBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fqb1 fqb1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        oyj0 oyj0Var = (oyj0) this.L$0;
        f fVar = this.this$0;
        jbz0 jbz0Var = fVar.c;
        j3b j3bVar = (j3b) oyj0Var.b();
        if (j3bVar != null) {
            int i = j3bVar.i;
            String str = j3bVar.b;
            boolean z = j3bVar.J;
            int i2 = 0;
            boolean z2 = fVar.W == null;
            fVar.W = j3bVar;
            if (fVar.R.a(tz10.j)) {
                b00 b00Var = fVar.z;
                ((Handler) b00Var.a.get()).post(new oz(b00Var, fVar.w, i2));
            }
            if (z2 && z) {
                fVar.r(j3bVar);
                fVar.a0 = okb1.b(j3bVar);
                fVar.q();
            }
            jbz0Var.E = j3bVar;
            ryv ryvVar = fVar.N;
            EditMessageDraft a = ((nmn) ryvVar.d.get()).a();
            if (a != null) {
                ryvVar.a(new ServerMessageRef(str, a.messageTimestamp));
            } else {
                ((com.yandex.messaging.input.c) ryvVar.b.get()).c();
            }
            hcz0 hcz0Var = fVar.J;
            hcz0Var.getClass();
            if (z) {
                s8b.c.getClass();
                new s8b(i);
                TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType = TimelineMenuStrategy$ItemType.NOT_SHOW_ITEM;
                TimelineMenuStrategy$MuteNotifications timelineMenuStrategy$MuteNotifications = TimelineMenuStrategy$MuteNotifications.NOT_SHOW_ITEM;
                TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType2 = TimelineMenuStrategy$ItemType.NOT_SHOW_ITEM;
            } else {
                s8b.c.getClass();
                new s8b(i);
                TimelineMenuStrategy$ItemType timelineMenuStrategy$ItemType3 = TimelineMenuStrategy$ItemType.NOT_SHOW_ITEM;
            }
            ((jbz0) hcz0Var.a.get()).a();
            if (ChatId.Companion.d(str) == 0 && ChatId.Companion.b(str) == 9) {
                jbz0Var.c.J.a(jbz0Var.r);
            }
            fVar.s();
        }
        Error error = (Error) oyj0Var.a();
        if (error != null) {
            b bVar = fVar.I;
            q6b q6bVar = bVar.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(q6bVar.a.a());
            linkedHashMap.put("chat window", Integer.valueOf(bVar.i));
            linkedHashMap.put("chat request id", q6bVar.b.uniqueRequestId());
            linkedHashMap.put(CRLReasonCodeExtension.REASON, Integer.valueOf(error.ordinal()));
            bVar.f.a("chat_open_error", linkedHashMap);
            int i3 = fbz0.a[error.ordinal()];
            if (i3 == 1) {
                fqb1Var = mdz0.b;
            } else if (i3 == 2) {
                fqb1Var = idz0.b;
            } else if (i3 == 3) {
                fqb1Var = kdz0.b;
            } else if (i3 == 4) {
                fqb1Var = gdz0.b;
            } else {
                if (i3 != 5) {
                    w511.b();
                    return null;
                }
                fqb1Var = jdz0.b;
            }
            jbz0Var.b(fqb1Var);
            n720 n720Var = jbz0Var.B;
            if (n720Var.a()) {
                ((Toolbar) ((fdz0) jbz0Var.q.get()).w.getValue()).setOnClickListener(null);
            }
            if (n720Var.a()) {
                ((g) jbz0Var.p.get()).u(error);
            }
            jbz0Var.t.r();
        }
        return zy11.a;
    }
}
