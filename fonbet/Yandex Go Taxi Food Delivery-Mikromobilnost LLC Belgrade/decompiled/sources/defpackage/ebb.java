package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import java.util.Objects;
import kotlin.a;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class ebb {
    public final k020 a;
    public final at2 b;
    public final o1b0 c;
    public final ui20 d;
    public final fbb e;
    public final ecz0 f = new ecz0("GapDetector");
    public final i3y g = a.a(new l7b(4, this));

    public ebb(k020 k020Var, at2 at2Var, o1b0 o1b0Var, ui20 ui20Var, fbb fbbVar) {
        this.a = k020Var;
        this.b = at2Var;
        this.c = o1b0Var;
        this.d = ui20Var;
        this.e = fbbVar;
    }

    public final ry10 a(yab yabVar, int i, int i2) {
        this.f.getClass();
        int count = yabVar.getCount() - 2;
        if (count >= 0) {
            int i3 = 0;
            while (true) {
                this.d.getClass();
                ry10 a = ui20.a(yabVar, i3, i2);
                if (a == null) {
                    if (i3 == count) {
                        break;
                    }
                    i3++;
                } else {
                    a.toString();
                    return a;
                }
            }
        }
        int count2 = yabVar.getCount() - 1;
        if (yabVar.getCount() >= i || !yabVar.moveToPosition(count2)) {
            return null;
        }
        if (yabVar.k0() == 0) {
            return null;
        }
        long k0 = yabVar.k0();
        Long f = this.a.b.Y().f(this.c.a);
        if (k0 > (f != null ? f.longValue() : 0L)) {
            return new ry10(yabVar.k0(), 0L, MessagesRange$LoadingType.FromNewest);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #1 {all -> 0x01c3, blocks: (B:18:0x00a1, B:20:0x00a8), top: B:17:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8 A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #4 {all -> 0x01ba, blocks: (B:76:0x00c2, B:78:0x00c8), top: B:75:0x00c2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ry10 b(ServerMessageRef serverMessageRef) {
        long j;
        int e;
        ry10 ry10Var;
        ry10 a;
        long timestamp = serverMessageRef.getTimestamp();
        yab q = this.a.q(2, this.c.a, timestamp);
        try {
            try {
                try {
                    if (e(q, 0, timestamp) == -1 && ((Boolean) q.d1(new rfa(18))).booleanValue()) {
                        if (q.S0() && q.k0() < timestamp && timestamp < q.U()) {
                            timestamp = q.U();
                            q.close();
                        } else if (q.U() > timestamp && q.k0() < timestamp) {
                            timestamp = q.k0();
                            q.close();
                        } else if (q.getCount() > 1 && q.moveToPosition(q.getCount() - 2) && q.k0() < timestamp) {
                            timestamp = q.k0();
                            q.close();
                        }
                        j = timestamp;
                        ui20 ui20Var = this.d;
                        ecz0 ecz0Var = this.f;
                        wtb1.c(j);
                        ecz0Var.getClass();
                        k020 k020Var = this.a;
                        o1b0 o1b0Var = this.c;
                        yab p = k020Var.p(2, o1b0Var.a, j);
                        e = e(p, 0, j);
                        ry10 ry10Var2 = null;
                        if (e >= 0) {
                            ui20Var.getClass();
                            if (ui20.a(p, e, e) == null) {
                                p.close();
                                ry10Var = null;
                                ecz0 ecz0Var2 = this.f;
                                wtb1.c(serverMessageRef.getTimestamp());
                                Objects.toString(ry10Var);
                                ecz0Var2.getClass();
                                if (ry10Var == null) {
                                    return ry10Var;
                                }
                                ecz0 ecz0Var3 = this.f;
                                wtb1.c(j);
                                ecz0Var3.getClass();
                                q = this.a.q(this.e.a, this.c.a, j);
                                try {
                                    int e2 = e(q, q.getCount() - 1, j);
                                    if (e2 != -1) {
                                        int i = e2 - 1;
                                        while (true) {
                                            if (-1 >= i) {
                                                q.close();
                                                break;
                                            }
                                            this.d.getClass();
                                            ry10 a2 = ui20.a(q, i, e2);
                                            if (a2 != null) {
                                                ecz0 ecz0Var4 = this.f;
                                                a2.toString();
                                                ecz0Var4.getClass();
                                                q.close();
                                                ry10Var2 = a2;
                                                break;
                                            }
                                            i--;
                                        }
                                    } else {
                                        long j2 = j;
                                        ry10 ry10Var3 = new ry10(j2, j2, MessagesRange$LoadingType.FromOldest);
                                        j = j2;
                                        q.close();
                                        ry10Var2 = ry10Var3;
                                    }
                                    ecz0 ecz0Var5 = this.f;
                                    wtb1.c(serverMessageRef.getTimestamp());
                                    Objects.toString(ry10Var2);
                                    ecz0Var5.getClass();
                                    if (ry10Var2 != null) {
                                        return ry10Var2;
                                    }
                                    ecz0 ecz0Var6 = this.f;
                                    wtb1.c(j);
                                    ecz0Var6.getClass();
                                    int i2 = this.e.a;
                                    p = this.a.p(i2, this.c.a, j);
                                    try {
                                        int e3 = e(p, 0, j);
                                        if (e3 == -1) {
                                            a = new ry10(j, 0L, MessagesRange$LoadingType.FromNewest);
                                            p.close();
                                        } else {
                                            a = a(p, i2, e3);
                                            p.close();
                                        }
                                        ecz0 ecz0Var7 = this.f;
                                        wtb1.c(serverMessageRef.getTimestamp());
                                        Objects.toString(a);
                                        ecz0Var7.getClass();
                                        return a;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        }
                        p.close();
                        q = this.a.q(2, o1b0Var.a, j);
                        if (e(q, 0, j) != 0) {
                            ui20Var.getClass();
                            if (ui20.a(q, 0, 0) != null) {
                                q.close();
                                MessagesRange$LoadingType messagesRange$LoadingType = MessagesRange$LoadingType.AroundNewest;
                                z83.i();
                                wtb1.c(0L);
                                wtb1.c(j);
                                ry10Var = new ry10(j, 0L, messagesRange$LoadingType);
                                j = j;
                                ecz0 ecz0Var22 = this.f;
                                wtb1.c(serverMessageRef.getTimestamp());
                                Objects.toString(ry10Var);
                                ecz0Var22.getClass();
                                if (ry10Var == null) {
                                }
                            }
                        }
                        q.close();
                        ry10Var = null;
                        ecz0 ecz0Var222 = this.f;
                        wtb1.c(serverMessageRef.getTimestamp());
                        Objects.toString(ry10Var);
                        ecz0Var222.getClass();
                        if (ry10Var == null) {
                        }
                    }
                    if (e(q, 0, j) != 0) {
                    }
                    q.close();
                    ry10Var = null;
                    ecz0 ecz0Var2222 = this.f;
                    wtb1.c(serverMessageRef.getTimestamp());
                    Objects.toString(ry10Var);
                    ecz0Var2222.getClass();
                    if (ry10Var == null) {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
                e = e(p, 0, j);
                ry10 ry10Var22 = null;
                if (e >= 0) {
                }
                p.close();
                q = this.a.q(2, o1b0Var.a, j);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
            q.close();
            j = timestamp;
            ui20 ui20Var2 = this.d;
            ecz0 ecz0Var8 = this.f;
            wtb1.c(j);
            ecz0Var8.getClass();
            k020 k020Var2 = this.a;
            o1b0 o1b0Var2 = this.c;
            yab p2 = k020Var2.p(2, o1b0Var2.a, j);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r0.longValue() <= (r3 != null ? r3.longValue() : 0)) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ry10 c() {
        meb mebVar = (meb) this.g.getValue();
        o1b0 o1b0Var = this.c;
        Long d = mebVar.d(o1b0Var.a);
        if (d != null) {
            wtb1.c(d.longValue());
        }
        this.f.getClass();
        if (d != null) {
            long longValue = d.longValue();
            long j = o1b0Var.a;
            k020 k020Var = this.a;
            if (longValue == 0) {
                Long r = k020Var.b.B().r(j);
                d = Long.valueOf(r != null ? r.longValue() : 0L);
            } else {
                Long f = k020Var.b.Y().f(j);
            }
            ry10 b = d.longValue() > 0 ? b(new ServerMessageRef(o1b0Var.b, d.longValue())) : null;
            Objects.toString(b);
            return b;
        }
        return null;
    }

    public final ry10 d() {
        this.f.getClass();
        int i = this.e.a;
        yab p = this.a.p(i, this.c.a, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        try {
            ry10 a = a(p, i, 0);
            p.close();
            return a;
        } finally {
        }
    }

    public final int e(yab yabVar, int i, long j) {
        boolean moveToPosition = yabVar.moveToPosition(i);
        ecz0 ecz0Var = this.f;
        if (!moveToPosition) {
            ecz0Var.getClass();
            return -1;
        }
        yabVar.U();
        wtb1.c(j);
        ecz0Var.getClass();
        int i2 = i - 1;
        if (yabVar.R0()) {
            Long B = yabVar.B();
            if (B != null && B.longValue() == j) {
                return (yabVar.moveToPosition(i2) && yabVar.U() == j) ? i2 : i;
            }
        } else {
            if (yabVar.U() == j) {
                wtb1.c(j);
                return i;
            }
            if (yabVar.moveToPosition(i2) && yabVar.U() == j) {
                wtb1.c(j);
                return i2;
            }
        }
        return -1;
    }
}
