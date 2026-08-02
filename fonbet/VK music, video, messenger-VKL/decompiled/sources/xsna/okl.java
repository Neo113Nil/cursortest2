package xsna;

import android.media.metrics.PlaybackMetrics;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import java.util.HashMap;
import java.util.Random;
import xsna.by1;
import xsna.ewo0;

/* compiled from: DefaultPlaybackSessionManager.java */
/* loaded from: classes12.dex */
public final class okl {
    public static final nkl h = new nkl();
    public static final Random i = new Random();
    public ps10 d;

    @Nullable
    public String f;
    public final ewo0.c a = new ewo0.c();
    public final ewo0.b b = new ewo0.b();
    public final HashMap<String, a> c = new HashMap<>();
    public ewo0 e = ewo0.a;
    public long g = -1;

    /* compiled from: DefaultPlaybackSessionManager.java */
    public final class a {
        public final String a;
        public int b;
        public long c;
        public final i.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, @Nullable i.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        public final boolean a(by1.a aVar) {
            i.b bVar = aVar.d;
            ewo0 ewo0Var = aVar.b;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            i.b bVar2 = this.d;
            if (bVar2 == null) {
                return false;
            }
            int i = bVar2.b;
            int b = ewo0Var.b(bVar.a);
            int b2 = ewo0Var.b(bVar2.a);
            if (bVar.d < bVar2.d || b < b2) {
                return false;
            }
            if (b > b2) {
                return true;
            }
            if (!bVar.b()) {
                int i2 = bVar.e;
                return i2 == -1 || i2 > i;
            }
            int i3 = bVar.b;
            int i4 = bVar.c;
            if (i3 <= i) {
                return i3 == i && i4 > bVar2.c;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        
            if (r0 < r8.o()) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(ewo0 ewo0Var, ewo0 ewo0Var2) {
            i.b bVar;
            int i = this.b;
            if (i < ewo0Var.o()) {
                okl oklVar = okl.this;
                ewo0.c cVar = oklVar.a;
                ewo0Var.n(i, cVar);
                for (int i2 = cVar.n; i2 <= cVar.o; i2++) {
                    int b = ewo0Var2.b(ewo0Var.l(i2));
                    if (b != -1) {
                        i = ewo0Var2.f(b, oklVar.b, false).c;
                        break;
                    }
                }
                i = -1;
            }
            this.b = i;
            return i != -1 && ((bVar = this.d) == null || ewo0Var2.b(bVar.a) != -1);
        }
    }

    public final void a(a aVar) {
        long j = aVar.c;
        if (j != -1 && aVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a b(int i2, @Nullable i.b bVar) {
        long j;
        long j2;
        long j3;
        HashMap<String, a> hashMap = this.c;
        a aVar = null;
        long j4 = Long.MAX_VALUE;
        for (a aVar2 : hashMap.values()) {
            long j5 = aVar2.c;
            i.b bVar2 = aVar2.d;
            if (j5 == -1 && i2 == aVar2.b && bVar != null) {
                long j6 = bVar.d;
                okl oklVar = okl.this;
                j = -1;
                a aVar3 = oklVar.c.get(oklVar.f);
                if (aVar3 != null) {
                    j3 = aVar3.c;
                }
                j3 = oklVar.g + 1;
                if (j6 >= j3) {
                    aVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (bVar != null) {
                long j7 = bVar.d;
                if (j7 != j) {
                    if (bVar2 == null) {
                        if (!bVar.b() && j7 == aVar2.c) {
                            j2 = aVar2.c;
                            if (j2 == j || j2 < j4) {
                                aVar = aVar2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = y2r0.a;
                                if (aVar.d != null && bVar2 != null) {
                                    aVar = aVar2;
                                }
                            }
                        }
                    } else if (j7 == bVar2.d && bVar.b == bVar2.b && bVar.c == bVar2.c) {
                        j2 = aVar2.c;
                        if (j2 == j) {
                        }
                        aVar = aVar2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == aVar2.b) {
                j2 = aVar2.c;
                if (j2 == j) {
                }
                aVar = aVar2;
                j4 = j2;
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str2 = (String) h.get();
        a aVar4 = new a(str2, i2, bVar);
        hashMap.put(str2, aVar4);
        return aVar4;
    }

    public final synchronized String c(ewo0 ewo0Var, i.b bVar) {
        return b(ewo0Var.g(bVar.a, this.b).c, bVar).a;
    }

    public final void d(by1.a aVar) {
        i.b bVar;
        ewo0 ewo0Var = aVar.b;
        int i2 = aVar.c;
        i.b bVar2 = aVar.d;
        boolean p = ewo0Var.p();
        HashMap<String, a> hashMap = this.c;
        if (p) {
            String str = this.f;
            if (str != null) {
                a aVar2 = hashMap.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = hashMap.get(this.f);
        this.f = b(i2, bVar2).a;
        e(aVar);
        if (bVar2 != null) {
            long j = bVar2.d;
            if (bVar2.b()) {
                if (aVar3 != null && aVar3.c == j && (bVar = aVar3.d) != null && bVar.b == bVar2.b && bVar.c == bVar2.c) {
                    return;
                }
                b(i2, new i.b(bVar2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e(by1.a aVar) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j;
        this.d.getClass();
        if (aVar.b.p()) {
            return;
        }
        i.b bVar = aVar.d;
        if (bVar != null) {
            long j2 = bVar.d;
            if (j2 != -1) {
                a aVar2 = this.c.get(this.f);
                if (aVar2 != null) {
                    j = aVar2.c;
                    if (j != -1) {
                        if (j2 < j) {
                            return;
                        }
                    }
                }
                j = this.g + 1;
                if (j2 < j) {
                }
            }
            a aVar3 = this.c.get(this.f);
            if (aVar3 != null && aVar3.c == -1 && aVar3.b != aVar.c) {
                return;
            }
        }
        a b = b(aVar.c, aVar.d);
        if (this.f == null) {
            this.f = b.a;
        }
        i.b bVar2 = aVar.d;
        if (bVar2 != null && bVar2.b()) {
            i.b bVar3 = aVar.d;
            a b2 = b(aVar.c, new i.b(bVar3.a, bVar3.d, bVar3.b));
            if (!b2.e) {
                b2.e = true;
                aVar.b.g(aVar.d.a, this.b);
                this.b.d(aVar.d.b);
                Math.max(0L, y2r0.j0(0L) + y2r0.j0(this.b.e));
                this.d.getClass();
            }
        }
        if (!b.e) {
            b.e = true;
            this.d.getClass();
        }
        if (b.a.equals(this.f) && !b.f) {
            b.f = true;
            ps10 ps10Var = this.d;
            String str = b.a;
            ps10Var.getClass();
            i.b bVar4 = aVar.d;
            if (bVar4 == null || !bVar4.b()) {
                ps10Var.b();
                ps10Var.k = str;
                playerName = ls10.a().setPlayerName("AndroidXMedia3");
                playerVersion = playerName.setPlayerVersion("1.9.3");
                ps10Var.l = playerVersion;
                ps10Var.c(aVar.b, aVar.d);
            }
        }
    }
}
