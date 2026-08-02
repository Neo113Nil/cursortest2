package com.yandex.messaging.ui.pollinfo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import defpackage.d5b0;
import defpackage.j40;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.lqo;
import defpackage.m7m;
import defpackage.ms11;
import defpackage.ny61;
import defpackage.p8b;
import defpackage.ss11;
import defpackage.tbt;
import defpackage.tje;
import defpackage.tz10;
import defpackage.ubt;
import defpackage.vqb1;
import defpackage.wwd0;
import defpackage.wwg0;
import defpackage.y4t;
import defpackage.ywd0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class c extends ss11 {
    public final y4t A;
    public final lqo B;
    public final AnimatedVectorDrawableCompat C;
    public final Drawable D;
    public final Activity a;
    public final ywd0 b;
    public final ubt c;
    public final com.yandex.messaging.domain.poll.a w;
    public final wwd0 x;
    public final a y;
    public final j40 z;

    public c(Activity activity, ywd0 ywd0Var, ubt ubtVar, com.yandex.messaging.domain.poll.a aVar, wwd0 wwd0Var, a aVar2, j40 j40Var, y4t y4tVar, lqo lqoVar) {
        this.a = activity;
        this.b = ywd0Var;
        this.c = ubtVar;
        this.w = aVar;
        this.x = wwd0Var;
        this.y = aVar2;
        this.z = j40Var;
        this.A = y4tVar;
        this.B = lqoVar;
        Context context = ywd0Var.a;
        this.C = vqb1.c(wwg0.msg_anim_poll_vote_btn_progress, context);
        this.D = vqb1.e(wwg0.msg_ic_poll_results_file, context);
        ywd0Var.y.setOnClickListener(new d5b0(14, this));
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ywd0Var.B.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.messaging.ui.pollinfo.b
            /* JADX WARN: Type inference failed for: r3v3, types: [T, pzt0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ref$ObjectRef ref$ObjectRef2 = Ref$ObjectRef.this;
                l8x l8xVar = (l8x) ref$ObjectRef2.element;
                if (l8xVar == null || !l8xVar.isActive()) {
                    l8x l8xVar2 = (l8x) ref$ObjectRef2.element;
                    if (l8xVar2 != null) {
                        l8xVar2.a(null);
                    }
                    c cVar = this;
                    ref$ObjectRef2.element = tje.N(cVar.getBrickScope(), null, null, new PollInfoBrick$2$1(cVar, null), 3);
                }
            }
        });
        RecyclerView recyclerView = ywd0Var.A;
        recyclerView.setAdapter(aVar2);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(c cVar, ContinuationImpl continuationImpl) {
        PollInfoBrick$downloadResults$1 pollInfoBrick$downloadResults$1;
        int i;
        Long l;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = cVar.C;
        wwd0 wwd0Var = cVar.x;
        if (continuationImpl instanceof PollInfoBrick$downloadResults$1) {
            pollInfoBrick$downloadResults$1 = (PollInfoBrick$downloadResults$1) continuationImpl;
            int i2 = pollInfoBrick$downloadResults$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollInfoBrick$downloadResults$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollInfoBrick$downloadResults$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollInfoBrick$downloadResults$1.label;
                MessageRef messageRef = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MessageRef a = MessageRef.a(wwd0Var.c, wwd0Var.b);
                    String str = wwd0Var.d;
                    if (str != null && (l = wwd0Var.e) != null) {
                        messageRef = MessageRef.a(l.longValue(), str);
                    }
                    m7m m7mVar = new m7m(a, messageRef);
                    animatedVectorDrawableCompat.start();
                    cVar.b.C.setImageDrawable(animatedVectorDrawableCompat);
                    com.yandex.messaging.domain.poll.a aVar = cVar.w;
                    pollInfoBrick$downloadResults$1.L$0 = cVar;
                    pollInfoBrick$downloadResults$1.label = 1;
                    if (aVar.a(m7mVar, pollInfoBrick$downloadResults$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) pollInfoBrick$downloadResults$1.L$0;
                    kotlin.b.b(obj);
                }
                cVar.b.C.setImageDrawable(cVar.D);
                cVar.C.stop();
                return zy11.a;
            }
        }
        pollInfoBrick$downloadResults$1 = new PollInfoBrick$downloadResults$1(cVar, continuationImpl);
        Object obj2 = pollInfoBrick$downloadResults$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollInfoBrick$downloadResults$1.label;
        MessageRef messageRef2 = null;
        if (i != 0) {
        }
        cVar.b.C.setImageDrawable(cVar.D);
        cVar.C.stop();
        return zy11.a;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        ywd0 ywd0Var = this.b;
        ywd0Var.C.setImageDrawable(this.D);
        this.C.stop();
        wwd0 wwd0Var = this.x;
        String str = wwd0Var.b;
        e.H(getBrickScope(), new jqr(this.c.a(new tbt(15, wwd0Var.c, wwd0Var.e, str, wwd0Var.d)), new PollInfoBrick$onBrickAttach$1(2, this, c.class, "bindPollInfo", "bindPollInfo(Lcom/yandex/messaging/domain/poll/FullPollInfo;)V", 4), 3));
        if (!this.B.a(tz10.L)) {
            ywd0Var.B.setVisibility(0);
            ywd0Var.x = true;
        } else {
            e.H(getBrickScope(), new jqr(this.A.a(p8b.a(wwd0Var.b)), new PollInfoBrick$onBrickAttach$2(this, null), 3));
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.b.A.setAdapter(null);
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.b;
    }
}
