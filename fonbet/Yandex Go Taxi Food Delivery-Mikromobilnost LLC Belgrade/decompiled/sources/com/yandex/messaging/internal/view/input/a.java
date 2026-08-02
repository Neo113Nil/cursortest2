package com.yandex.messaging.internal.view.input;

import android.os.Handler;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import defpackage.a9b;
import defpackage.act;
import defpackage.bn21;
import defpackage.cct;
import defpackage.e1k;
import defpackage.j9b;
import defpackage.kab;
import defpackage.m8g;
import defpackage.my40;
import defpackage.ny61;
import defpackage.qpo;
import defpackage.r3z;
import defpackage.s020;
import defpackage.s3z;
import defpackage.sk7;
import defpackage.tje;
import defpackage.tls;
import defpackage.xqi0;
import defpackage.yk3;
import defpackage.zy11;
import java.util.Date;

/* loaded from: classes15.dex */
public final class a implements a9b, kab, s3z {
    public tls a;
    public final ServerMessageRef b;
    public final Handler c = new Handler();
    public final /* synthetic */ cct w;

    public a(cct cctVar, tls tlsVar, ServerMessageRef serverMessageRef) {
        this.w = cctVar;
        this.a = tlsVar;
        this.b = serverMessageRef;
    }

    @Override // defpackage.a9b
    public final void B(j9b j9bVar) {
        r3z c = j9bVar.b().c(this.b);
        if (c != null) {
            c.b(this);
        }
    }

    @Override // defpackage.a9b
    public final void close() {
        tje.e();
        this.a = null;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object g(Date date, String str, UnsupportedMessageData unsupportedMessageData) {
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object k(Date date, TechBaseMessage techBaseMessage, String str, boolean z) {
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final /* bridge */ /* synthetic */ Object l(Date date) {
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final Object m(Date date, RemovedMessageData removedMessageData) {
        tls tlsVar = this.a;
        if (tlsVar != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.s3z
    public final Object o(my40 my40Var, boolean z) {
        String str = my40Var.h;
        tls tlsVar = this.a;
        if (tlsVar != null) {
            String str2 = null;
            if (z) {
                cct cctVar = this.w;
                cctVar.d.getClass();
                if (!bn21.a(str)) {
                    xqi0 xqi0Var = cctVar.c;
                    xqi0Var.getClass();
                    tje.e();
                    yk3 yk3Var = xqi0Var.p;
                    sk7 sk7Var = yk3Var != null ? yk3Var.a : null;
                    str = sk7Var != null ? sk7Var.d() : null;
                    if (str == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                }
            }
            MessageData messageData = my40Var.g;
            String str3 = my40Var.p;
            if (str3 != null && !z) {
                str2 = str3;
            }
            ((GetQuoteUseCase$run$1$1) tlsVar).invoke(new act(messageData, str, str2));
        }
        return zy11.a;
    }

    @Override // defpackage.kab
    public final void v(r3z r3zVar) {
        this.c.post(new qpo(20, r3zVar, this));
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        return ((m8g) s020Var).d().m(this, this.b);
    }
}
