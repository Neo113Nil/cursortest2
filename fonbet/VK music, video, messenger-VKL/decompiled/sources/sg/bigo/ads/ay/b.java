package sg.bigo.ads.ay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.mail.platform.libverify.sms.SmsRetrieverService;
import sg.bigo.ads.ba.e;
import sg.bigo.ads.common.utils.g;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class b implements e {
    public final CopyOnWriteArrayList<sg.bigo.ads.ay.a> a;
    public final CopyOnWriteArrayList<sg.bigo.ads.ay.a> b;
    public final CopyOnWriteArrayList<sg.bigo.ads.ay.a> c;
    public final CopyOnWriteArrayList<sg.bigo.ads.ay.a> d;
    final a e;
    private final sg.bigo.ads.az.a f;
    private final Context g;

    public interface a {
        void a(sg.bigo.ads.ay.a aVar);

        void a(sg.bigo.ads.ay.a aVar, int i, long j);

        void a(sg.bigo.ads.ay.a aVar, String str, long j, long j2);
    }

    public b(@NonNull Context context, sg.bigo.ads.az.a aVar, boolean z, @NonNull a aVar2) {
        this.g = context;
        this.e = aVar2;
        sg.bigo.ads.ba.b.a(z);
        this.f = aVar;
        this.a = new CopyOnWriteArrayList<>();
        this.b = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
    }

    public final sg.bigo.ads.ay.a a(String str, String str2) {
        if (r.a((CharSequence) str) || r.a((CharSequence) str2)) {
            return null;
        }
        sg.bigo.ads.ay.a a2 = a(this.a, str, str2);
        if (a2 == null) {
            a2 = a(this.b, str, str2);
        }
        if (a2 == null) {
            a2 = a(this.c, str, str2);
        }
        return a2 == null ? a(this.d, str, str2) : a2;
    }

    @Override // sg.bigo.ads.ba.e
    public final void b(String str) {
        final sg.bigo.ads.ay.a a2 = sg.bigo.ads.ba.b.a(str);
        if (a2 == null) {
            a("onLoading info is null.", (sg.bigo.ads.ay.a) null);
            return;
        }
        if (a2.j != 1) {
            a("onLoading", a2);
            a2.j = 1;
        }
        long j = a2.i;
        if (j > 0) {
            long j2 = a2.g;
            if ((j2 - a2.h) * 100 > j * 10) {
                a2.h = j2;
                if (a2.h()) {
                    int a3 = sg.bigo.ads.bz.c.a(this.g);
                    if (a3 == 3 || a3 == 4 || a3 == 5) {
                        final long elapsedRealtime = SystemClock.elapsedRealtime() - a2.m;
                        a("partial download callback", a2);
                        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.ay.b.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.this.e.a(a2, 2, elapsedRealtime);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.ba.e
    public final void c(String str) {
        sg.bigo.ads.ay.a a2 = sg.bigo.ads.ba.b.a(str);
        if (a2 != null) {
            a2.j = 2;
        }
    }

    @Override // sg.bigo.ads.ba.e
    public final void d(final String str) {
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.ay.b.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.ay.a a2 = sg.bigo.ads.ba.b.a(str);
                if (a2 == null) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b.a("download succeed", a2);
                a2.j = 3;
                b.this.a.remove(a2);
                b.this.b.add(a2);
                b.this.e.a(a2, 1, elapsedRealtime - a2.m);
                b.a("downloading to downloaded", a2);
                sg.bigo.ads.ba.b.a(a2.a);
                b.this.a();
            }
        });
    }

    private static sg.bigo.ads.ay.a a(List<sg.bigo.ads.ay.a> list, String str, String str2) {
        if (!r.a((CharSequence) str) && !r.a((CharSequence) str2)) {
            for (sg.bigo.ads.ay.a aVar : list) {
                if (TextUtils.equals(str, aVar.c) && TextUtils.equals(str2, aVar.d)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private boolean b() {
        return this.a.size() < this.f.a;
    }

    private static sg.bigo.ads.ay.a a(List<sg.bigo.ads.ay.a> list, sg.bigo.ads.ay.a aVar) {
        int indexOf = list.indexOf(aVar);
        if (indexOf >= 0) {
            try {
                return list.get(indexOf);
            } catch (Exception e) {
                a("getExistDownloadInfo e=" + e.getMessage(), (sg.bigo.ads.ay.a) null);
            }
        }
        return null;
    }

    private static sg.bigo.ads.ay.a a(List<sg.bigo.ads.ay.a> list, boolean z) {
        for (sg.bigo.ads.ay.a aVar : list) {
            if (!z) {
                return aVar;
            }
            int i = aVar.k >= 3 ? 1800000 : SmsRetrieverService.SMS_SAVE_STATE_TIMEOUT;
            if (aVar.l > 0 && System.currentTimeMillis() - aVar.l > i) {
                return aVar;
            }
            a("no download info execute.", aVar);
        }
        return null;
    }

    public final void a() {
        if (sg.bigo.ads.bw.a.s()) {
            return;
        }
        a("continue to execute download task", (sg.bigo.ads.ay.a) null);
        if (!b()) {
            a("no idle download thread", (sg.bigo.ads.ay.a) null);
            return;
        }
        sg.bigo.ads.ay.a a2 = a((List<sg.bigo.ads.ay.a>) this.c, false);
        if (a2 != null) {
            a("waiting to downloading", a2);
            this.c.remove(a2);
        }
        if (a2 == null && (a2 = a((List<sg.bigo.ads.ay.a>) this.d, true)) != null) {
            a("failed to downloading", a2);
            this.d.remove(a2);
        }
        if (a2 == null) {
            a("no download info execute.", (sg.bigo.ads.ay.a) null);
        } else {
            this.a.add(a2);
            a(this.g, a2);
        }
    }

    private void a(Context context, sg.bigo.ads.ay.a aVar) {
        aVar.m = SystemClock.elapsedRealtime();
        a("execute download start", aVar);
        if (g.b(aVar.c, aVar.d)) {
            a("executeDownload use local file", aVar);
            g.c(aVar.c, aVar.d);
            aVar.j = 3;
            aVar.i = g.a(aVar.a(), 1);
            this.a.remove(aVar);
            this.b.add(aVar);
            this.e.a(aVar, 0, 0L);
            a();
            return;
        }
        if (!q.c()) {
            this.a.remove(aVar);
            this.e.a(aVar, "internal storage is not enough", SystemClock.elapsedRealtime() - aVar.m, 0L);
            a();
        } else {
            sg.bigo.ads.ba.b.a(context, aVar);
            sg.bigo.ads.ba.b.a(aVar.a, this);
            a("execute downloader", aVar);
            sg.bigo.ads.ba.b.b(aVar.a);
        }
    }

    @Override // sg.bigo.ads.ba.e
    public final void a(String str) {
        final sg.bigo.ads.ay.a a2 = sg.bigo.ads.ba.b.a(str);
        if (a2 == null) {
            a("onStart info is null.", (sg.bigo.ads.ay.a) null);
        } else {
            sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.ay.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.e.a(a2);
                }
            });
        }
    }

    @Override // sg.bigo.ads.ba.e
    public final void a(final String str, final String str2, final long j) {
        sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.ay.b.4
            @Override // java.lang.Runnable
            public final void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                sg.bigo.ads.ay.a a2 = sg.bigo.ads.ba.b.a(str);
                if (a2 == null) {
                    return;
                }
                b.a("download failed", a2);
                a2.j = 4;
                if (!a2.n) {
                    a2.k++;
                }
                a2.l = System.currentTimeMillis();
                b.this.a.remove(a2);
                b.this.d.remove(a2);
                b.this.d.add(a2);
                sg.bigo.ads.ba.b.a(a2.a);
                b.this.e.a(a2, str2, elapsedRealtime - a2.m, j);
                b.a("download failed update fail count", a2);
                b.this.a();
            }
        });
    }

    public static void a(String str, sg.bigo.ads.ay.a aVar) {
        if (aVar != null) {
            aVar.toString();
        }
    }

    private void a(sg.bigo.ads.ay.a aVar) {
        if (!aVar.o) {
            this.c.add(aVar);
            return;
        }
        int i = 0;
        while (i < this.c.size() && this.c.get(i).o) {
            i++;
        }
        this.c.add(i, aVar);
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(sg.bigo.ads.ay.a aVar, boolean z) {
        a("start the download, force=".concat(String.valueOf(z)), aVar);
        if (g.c(aVar.a())) {
            a("downloaded and exist local file", aVar);
            g.c(aVar.c, aVar.d);
            this.e.a(aVar, 0, 0L);
            return;
        }
        if (a(this.a, aVar) != null) {
            a("downloading", aVar);
            return;
        }
        if (this.f.b()) {
            this.e.a(aVar, "Unable to download media file.", 0L, 0L);
            return;
        }
        sg.bigo.ads.ay.a a2 = a(this.c, aVar);
        if (a2 != null) {
            a("waiting", aVar);
            a2.b = aVar.b;
            if (aVar.o && !a2.o) {
                this.c.remove(a2);
                a2.o = true;
                a(a2);
            }
            if (!z && !b()) {
                a("waiting not executing", aVar);
                return;
            }
        }
        sg.bigo.ads.ay.a a3 = a(this.d, aVar);
        if (a3 != null) {
            a("failed", aVar);
            this.d.remove(a3);
            a3.b = aVar.b;
            a3.o = aVar.o;
            a3.j = 0;
        } else {
            a3 = aVar;
        }
        if (!b() && !z) {
            a("join download waiting queue", a3);
            a(a3);
        } else {
            a("execute download", a3);
            a3.n = z;
            this.a.add(a3);
            a(this.g, a3);
        }
    }

    public static boolean a(List<sg.bigo.ads.ay.a> list, String str) {
        if (!r.a((CharSequence) str) && !l.a((Collection) list)) {
            Iterator<sg.bigo.ads.ay.a> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
