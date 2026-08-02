package com.yandex.messaging.input.bricks.writing;

import android.widget.Toast;
import defpackage.j3b;
import defpackage.oyh0;
import defpackage.sls;
import defpackage.x22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class InputWritingBrick$onBrickAttach$5$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        long j = dVar.m0;
        if (j > 0) {
            x22 x22Var = dVar.K;
            j3b j3bVar = dVar.j0;
            x22Var.f("rate limiter toast shown", "chat_id", j3bVar != null ? j3bVar.b : null, "wait_for", Long.valueOf(j));
            Toast.makeText(dVar.getView().getContext(), oyh0.messaging_sending_messages_temporary_blocked, 0).show();
        }
        return zy11.a;
    }
}
