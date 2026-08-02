package xsna;

import android.content.Context;
import android.os.SystemClock;
import androidx.room.RoomDatabase;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* compiled from: MsgWithTranscriptReporter.kt */
/* loaded from: classes.dex */
public abstract class s140 {
    public final Object a;
    public final Object b;
    public final Serializable c;

    public s140(Context context, a1w a1wVar) {
        this.a = a1wVar;
        this.b = new g5u0(context);
        this.c = new ArrayList();
    }

    public zin0 a() {
        RoomDatabase roomDatabase = (RoomDatabase) this.a;
        roomDatabase.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (zin0) ((bpn0) this.c).getValue();
        }
        String c = c();
        roomDatabase.a();
        roomDatabase.b();
        return roomDatabase.i().getWritableDatabase().compileStatement(c);
    }

    public io.reactivex.rxjava3.internal.operators.single.y b(Msg msg, AttachWithTranscription attachWithTranscription) {
        int xb = msg.xb();
        int xb2 = attachWithTranscription.xb();
        return ((a1w) this.a).E(this, new dj30(MsgIdType.LOCAL_ID, Collections.singletonList(Integer.valueOf(xb)), null, Source.CACHE, false, null, 52)).l(new tp1(new q140(xb, xb2), 18));
    }

    public abstract String c();

    public void d(zin0 zin0Var) {
        if (zin0Var == ((zin0) ((bpn0) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public abstract void e(Msg msg, AttachWithTranscription attachWithTranscription, long j, boolean z, boolean z2, int i);

    public void f(final Msg msg, final AttachWithTranscription attachWithTranscription, final boolean z) {
        pro0.a();
        if (msg.Qb() && attachWithTranscription.Ya()) {
            if (!attachWithTranscription.l3()) {
                if (attachWithTranscription.I5()) {
                    e(msg, attachWithTranscription, 0L, true, z, 0);
                    return;
                }
                return;
            }
            g5u0 g5u0Var = (g5u0) this.b;
            a1w a1wVar = (a1w) this.a;
            Pair pair = new Pair(msg, attachWithTranscription);
            if (((ArrayList) this.c).contains(pair)) {
                return;
            }
            int i = 4;
            int i2 = 29;
            io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new adz(new bl30(msg, 2), i)).x(new xl0(new yw5(this, msg, attachWithTranscription, 5), i2)).o0(b(msg, attachWithTranscription));
            d220 d220Var = new d220(i);
            int i3 = 23;
            as asVar = new as(d220Var, i3);
            o0.getClass();
            int i4 = 22;
            io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(o0, asVar).U(new op0(new v4v(18), i4));
            io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new dnz(g5u0Var, 3));
            int i5 = 1;
            io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(g5u0Var.b())), qVar);
            com.vk.movika.sdk.base.ui.p0 p0Var = new com.vk.movika.sdk.base.ui.p0(new l8k(i4), 25);
            s.getClass();
            io.reactivex.rxjava3.internal.operators.observable.o2 t0 = io.reactivex.rxjava3.core.q.X(U, new io.reactivex.rxjava3.internal.operators.observable.i0(s, p0Var).U(new h7(new com(15), 28))).t0(1L);
            LongPollType longPollType = msg instanceof MsgFromChannel ? LongPollType.CHANNELS : LongPollType.MESSAGES;
            io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a().b0(u180.class).U(new qa(new vam(this, longPollType), i2)), new k7(new gky(9), i3));
            ImBgSyncState a = a1wVar.p().a(longPollType);
            io.reactivex.rxjava3.core.q s2 = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(a == ImBgSyncState.REFRESHING || a == ImBgSyncState.REFRESHED || a == ImBgSyncState.CONNECTED)), i0Var);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.c0(io.reactivex.rxjava3.core.q.m(t0, s2, io.reactivex.rxjava3.kotlin.a.b).t0(1L).a0(asu0.a.d()), new zyu(new qt5(16, this, pair), 6), io.reactivex.rxjava3.internal.functions.a.c).C(new ugb(i5, this, pair)), null, new ept(11), new izs() { // from class: xsna.p140
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Pair pair2 = (Pair) obj;
                    Integer num = (Integer) pair2.d();
                    Boolean bool = (Boolean) pair2.g();
                    s140.this.e(msg, attachWithTranscription, SystemClock.elapsedRealtime() - elapsedRealtime, bool.booleanValue(), z, num.intValue());
                    return s3q0.a;
                }
            });
        }
    }

    public abstract void g(Msg msg, AttachWithTranscription attachWithTranscription);

    public abstract void h(Msg msg, AttachWithTranscription attachWithTranscription);

    public s140(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new AtomicBoolean(false);
        this.c = new bpn0(new bg6(this, 12));
    }
}
