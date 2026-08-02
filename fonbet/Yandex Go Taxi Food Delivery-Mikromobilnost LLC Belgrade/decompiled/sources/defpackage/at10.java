package defpackage;

import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.MessageData;

/* loaded from: classes15.dex */
public final class at10 {
    public final o1b0 a;
    public final k020 b;

    public at10(o1b0 o1b0Var, k020 k020Var) {
        this.a = o1b0Var;
        this.b = k020Var;
    }

    public final void a(LocalMessageRef localMessageRef, int i) {
        o1b0 o1b0Var = this.a;
        long j = o1b0Var.a;
        k020 k020Var = this.b;
        j3b k = k020Var.k(j);
        String messageId = localMessageRef.getMessageId();
        if (messageId == null) {
            ny61.g("messageId cannot be null");
            return;
        }
        l020 C = k020Var.C();
        try {
            yab y = k020Var.y(o1b0Var.a, localMessageRef);
            try {
                Boolean bool = null;
                if (!y.moveToFirst()) {
                    y.close();
                    ooc.g(C, null);
                    return;
                }
                boolean z = true;
                z83.b(null, 1, Integer.valueOf(y.getCount()));
                if (!y.a1() && (!k.I || !k.q)) {
                    z = false;
                }
                z83.h(null, z);
                if (y.z0() == -1) {
                    long j2 = o1b0Var.a;
                    ndz0 ndz0Var = C.D;
                    yab yabVar = new yab(ndz0Var.c.Y(j2, messageId), ndz0Var.h, 0L);
                    try {
                        if (yabVar.moveToFirst()) {
                            MessageData R = yabVar.R();
                            R.detentionReason = i;
                            String json2 = ndz0Var.p.toJson(R);
                            long G = yabVar.G();
                            ndz0Var.d.d(G, json2);
                            ndz0Var.k.h(j2, alb1.j(ndz0Var.c, j2, G, json2));
                            bool = Boolean.TRUE;
                        }
                        yabVar.close();
                        if (bool != null ? bool.booleanValue() : false) {
                            C.z.a(j2);
                        }
                    } finally {
                    }
                }
                y.close();
                C.s();
                C.close();
            } finally {
            }
        } finally {
        }
    }
}
