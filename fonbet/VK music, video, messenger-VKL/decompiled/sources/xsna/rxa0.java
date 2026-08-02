package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: PlaybackQueueCacheRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class rxa0 implements pxa0 {
    public final yxa0 b;
    public final ExecutorService c;

    public rxa0(yxa0 yxa0Var) {
        ExecutorService b;
        this.b = yxa0Var;
        b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-playback-queue-controller-thread");
        this.c = b;
    }

    @Override // xsna.txa0
    public final void a() {
        this.c.execute(new ux3(this, 7));
    }

    @Override // xsna.txa0
    public final void b(List<gza0> list) {
        this.c.execute(new z6(4, this, list));
    }

    @Override // xsna.txa0
    public final void e(Map<String, xd50> map) {
        this.c.execute(new w63(6, this, map));
    }

    @Override // xsna.txa0
    public final void f(com.vk.music.player.playback.e eVar) {
        this.c.execute(new w3t(1, this, eVar));
    }

    @Override // xsna.khz
    public final int g() {
        Cursor rawQuery = this.b.getReadableDatabase().rawQuery("SELECT COUNT(*) FROM analytics_listening_time WHERE user_id = " + yxa0.o(), null);
        try {
            rawQuery.moveToFirst();
            int i = rawQuery.getInt(0);
            rawQuery.close();
            return i;
        } finally {
        }
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<com.vk.music.player.playback.e> h() {
        final yxa0 yxa0Var = this.b;
        yxa0Var.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.xxa0
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
            
                if (xsna.epx.f(r0, com.vk.music.player.playback.PlaybackLaunchMeta.a.a()) != false) goto L37;
             */
            @Override // io.reactivex.rxjava3.functions.n
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object get() {
                com.vk.music.player.playback.e eVar;
                StartPlaySource startPlaySource;
                DataInputStream dataInputStream;
                yxa0 yxa0Var2 = yxa0.this;
                SQLiteDatabase readableDatabase = yxa0Var2.getReadableDatabase();
                readableDatabase.beginTransaction();
                try {
                    Cursor rawQuery = yxa0Var2.getReadableDatabase().rawQuery("SELECT play_source, launch_meta FROM play_source WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var2.n(), null);
                    try {
                        if (rawQuery.moveToFirst()) {
                            String string = rawQuery.getString(0);
                            if (string != null) {
                                dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(string, 0)));
                                try {
                                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                    Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(StartPlaySource.class.getClassLoader());
                                    dataInputStream.close();
                                    startPlaySource = (StartPlaySource) G;
                                } finally {
                                }
                            } else {
                                startPlaySource = null;
                            }
                            dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(rawQuery.getString(1), 0)));
                            try {
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                                Serializer.StreamParcelable G2 = new Serializer.d(dataInputStream).G(PlaybackLaunchMeta.class.getClassLoader());
                                dataInputStream.close();
                                eVar = new com.vk.music.player.playback.e(startPlaySource, (PlaybackLaunchMeta) G2);
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } else {
                            eVar = null;
                        }
                        rawQuery.close();
                        readableDatabase.setTransactionSuccessful();
                        if (eVar != null) {
                            if (eVar.a == null) {
                                PlaybackLaunchMeta playbackLaunchMeta = eVar.b;
                                Object obj = PlaybackLaunchMeta.g;
                            }
                            return io.reactivex.rxjava3.core.x.k(eVar);
                        }
                        Object obj2 = PlaybackLaunchMeta.g;
                        eVar = new com.vk.music.player.playback.e(null, PlaybackLaunchMeta.a.a());
                        return io.reactivex.rxjava3.core.x.k(eVar);
                    } finally {
                    }
                } finally {
                    readableDatabase.endTransaction();
                }
            }
        });
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<ixa0> i(final com.vk.music.player.playback.e eVar) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.qxa0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                com.vk.music.player.playback.e eVar2 = com.vk.music.player.playback.e.this;
                return eVar2 == null ? this.h() : io.reactivex.rxjava3.core.x.k(eVar2);
            }
        }), new nh40(new af50(this, 9), 7));
    }

    @Override // xsna.txa0
    public final void j(PlayerTrack playerTrack) {
        this.c.execute(new xq8(3, this, playerTrack));
    }

    @Override // xsna.txa0
    public final void k(List<String> list) {
        this.c.execute(new x8p(2, this, list));
    }

    @Override // xsna.txa0
    public final void l(List<gza0> list) {
        this.c.execute(new rm3(5, this, list));
    }

    @Override // xsna.khz
    public final List m(int i, long j) {
        Object failure;
        try {
            failure = this.b.p(i, j);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
            failure = EmptyList.b;
        }
        return (List) failure;
    }

    @Override // xsna.khz
    public final boolean n(lhz lhzVar) {
        Object failure;
        try {
            failure = Boolean.valueOf(this.b.t(lhzVar));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
            failure = Boolean.FALSE;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // xsna.khz
    public final lhz o() {
        Object failure;
        try {
            failure = this.b.r();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
            failure = null;
        }
        return (lhz) failure;
    }

    @Override // xsna.jxa0
    public final boolean p() {
        StringBuilder sb = new StringBuilder("\n            SELECT EXISTS (\n                    SELECT 1\n                    FROM current_track\n                    WHERE user_id = ");
        yxa0 yxa0Var = this.b;
        yxa0Var.getClass();
        sb.append(yxa0.o());
        sb.append(" AND COL_QUEUE_TYPE = ");
        sb.append(yxa0Var.n());
        sb.append("\n                UNION\n                    SELECT 1\n                    FROM play_source\n                    WHERE user_id = ");
        sb.append(yxa0.o());
        sb.append(" AND COL_QUEUE_TYPE = ");
        sb.append(yxa0Var.n());
        sb.append("\n                LIMIT 1\n            ) AS has_cache\n        ");
        Cursor rawQuery = yxa0Var.getReadableDatabase().rawQuery(xqm0.g(sb.toString()), null);
        try {
            rawQuery.moveToFirst();
            boolean z = rawQuery.getInt(0) > 0;
            rawQuery.close();
            return z;
        } finally {
        }
    }

    @Override // xsna.khz
    public final List q(int i, long j) {
        Object failure;
        try {
            failure = this.b.b(i, j);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            L.i(a);
            failure = EmptyList.b;
        }
        return (List) failure;
    }
}
