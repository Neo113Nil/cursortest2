package xsna;

import android.content.SharedPreferences;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.core.preference.Preference;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicAutoDownloadEvictorImpl.kt */
/* loaded from: classes.dex */
public final class ab40 implements wa40 {
    public final df5 a;
    public final kgp0 b;
    public final com.vk.music.offline.api.domain.download.b c;
    public final com.vk.music.player.cache.a d;
    public final bf5 e;
    public final oc40 f;
    public final g950 g;

    public ab40(df5 df5Var, kgp0 kgp0Var, fk80 fk80Var, com.vk.music.player.cache.a aVar, bf5 bf5Var, oc40 oc40Var, g950 g950Var) {
        this.a = df5Var;
        this.b = kgp0Var;
        this.c = fk80Var;
        this.d = aVar;
        this.e = bf5Var;
        this.f = oc40Var;
        this.g = g950Var;
    }

    @Override // xsna.wa40
    public final io.reactivex.rxjava3.core.a a(MusicTrack musicTrack, List<String> list) {
        long Eb = (musicTrack.Eb() / 1000) * 40960;
        int a = this.d.a();
        return new io.reactivex.rxjava3.internal.operators.single.s(this.a.o((a * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - Eb, String.valueOf(o25.a().c().b), list).l(new lh3(new bws(4), 26)).q(asu0.a.c()), new iw3(new o010(this, 9), 21));
    }

    @Override // xsna.wa40
    public final io.reactivex.rxjava3.core.a b(List<String> list) {
        int a = this.e.a();
        return new io.reactivex.rxjava3.internal.operators.single.s(this.a.q(a * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, String.valueOf(o25.a().c().b), list).l(new b630(new azt(10), 2)).q(asu0.a.c()), new ps2(new rop(this, 20), 25));
    }

    @Override // xsna.wa40
    public final void c() {
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        boolean a = com.vk.toggle.d.a(this.g.c());
        final SharedPreferences f = Preference.f("auto_download_cleanup");
        if (a) {
            bn40.b("still enabled, reset schedule");
            f.edit().remove("cleanup_scheduled_ts").putBoolean("entry_last_state", true).apply();
            return;
        }
        int i = 0;
        boolean z = f.getBoolean("entry_last_state", false);
        long j = f.getLong("cleanup_scheduled_ts", 0L);
        long a2 = qni0.a();
        if (z && j == 0) {
            bn40.b(defpackage.k0.a(a2, "just disabled, schedule cleanup at "));
            f.edit().putLong("cleanup_scheduled_ts", a2).putBoolean("entry_last_state", false).apply();
            return;
        }
        StringBuilder b = fp.b(j, "disabled, scheduledTs=", ", delayMs=");
        bf5 bf5Var = this.e;
        b.append(bf5Var.b() * 60 * 1000);
        b.append(", elapsed=");
        b.append(a2 - j);
        bn40.b(b.toString());
        if (j > 0) {
            if (qni0.a() - j > bf5Var.b() * 60 * 1000) {
                bn40.b("cleanup delay passed, evicting all auto-downloaded tracks");
                itg0.j(new io.reactivex.rxjava3.internal.operators.single.s(this.a.i(String.valueOf(o25.a().c().b)).q(asu0.a.c()), new wjr(new xa40(this, i), 2)).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.ya40
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        f.edit().remove("cleanup_scheduled_ts").apply();
                    }
                }), null, 3);
            }
        }
        tdj.b(f, "entry_last_state", false);
    }

    @Override // xsna.wa40
    public final io.reactivex.rxjava3.core.a d(List<String> list, boolean z) {
        io.reactivex.rxjava3.core.a l;
        if (list.isEmpty()) {
            return io.reactivex.rxjava3.internal.operators.completable.i.b;
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (String str : list2) {
            final String P = d370.P(str);
            if (this.b.s(o25.a().c(), str) != null) {
                bn40.b(zr.a("delete track[mid=", str, "] meta only (manually downloaded)"));
                l = this.a.b(String.valueOf(o25.a().c().b), str);
            } else {
                l = io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.za40
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        ab40.this.c.j(P);
                    }
                });
            }
            arrayList.add(l);
        }
        return io.reactivex.rxjava3.core.a.m(arrayList).g(new l66(z, this));
    }
}
