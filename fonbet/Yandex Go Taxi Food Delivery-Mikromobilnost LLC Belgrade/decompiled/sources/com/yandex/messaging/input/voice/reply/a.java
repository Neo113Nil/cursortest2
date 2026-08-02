package com.yandex.messaging.input.voice.reply;

import android.app.Activity;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ReplyData;
import defpackage.asb1;
import defpackage.eja1;
import defpackage.fk6;
import defpackage.ike;
import defpackage.kse;
import defpackage.nv10;
import defpackage.pey;
import defpackage.s320;
import defpackage.tje;
import defpackage.tyc0;
import defpackage.ys0;

/* loaded from: classes15.dex */
public final class a {
    public final Activity a;
    public final tyc0 b;
    public final b c;
    public final s320 d;
    public fk6 e;
    public boolean f;
    public final ike g;
    public ys0 h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, tyc0 tyc0Var, kse kseVar, b bVar, s320 s320Var) {
        this.a = activity;
        this.b = tyc0Var;
        this.c = bVar;
        this.d = s320Var;
        pey peyVar = activity instanceof pey ? (pey) activity : null;
        this.g = peyVar != null ? asb1.d(eja1.s(peyVar)) : kseVar.c();
    }

    public final void a(String str, ServerMessageRef serverMessageRef, boolean z, ReplyData replyData, nv10 nv10Var) {
        ike ikeVar = this.g;
        kotlinx.coroutines.a.g(ikeVar.a, null);
        if (!this.f) {
            this.e = (fk6) nv10Var.invoke();
        }
        this.f = true;
        tje.N(ikeVar, null, null, new VoiceMessageReplyController$bind$1(this, str, replyData, serverMessageRef, z, null), 3);
    }
}
