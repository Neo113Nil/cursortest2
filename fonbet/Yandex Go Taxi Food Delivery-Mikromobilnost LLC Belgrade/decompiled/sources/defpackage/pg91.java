package defpackage;

import android.os.SystemClock;
import com.google.android.play.core.splitinstall.zzo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final /* synthetic */ class pg91 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g9p b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList w;
    public final /* synthetic */ ArrayList x;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ pg91(g9p g9pVar, long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = g9pVar;
        this.c = j;
        this.w = arrayList;
        this.x = arrayList2;
        this.y = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g9p g9pVar = this.b;
                zzo zzoVar = g9pVar.i;
                if (!g9pVar.n.get()) {
                    zzoVar.getClass();
                    f691 a = zzo.a();
                    ArrayList arrayList = this.x;
                    ArrayList arrayList2 = this.y;
                    long j = this.c;
                    if (a == null) {
                        g9pVar.l.addAll(arrayList);
                        g9pVar.m.addAll(arrayList2);
                        Long valueOf = Long.valueOf(j);
                        g9pVar.k(5, 0, valueOf, valueOf, null, null, null);
                        break;
                    } else {
                        zzoVar.getClass();
                        f691 a2 = zzo.a();
                        ArrayList arrayList3 = this.w;
                        ufg ufgVar = new ufg(g9pVar, arrayList, arrayList2, j, false, arrayList3);
                        a2.getClass();
                        if (kst0.e.get() == null) {
                            ny61.r("Ingestion should only be called in SplitCompat mode.");
                            break;
                        } else {
                            a2.d.execute(new ju61(a2, arrayList3, ufgVar, false, 2));
                            break;
                        }
                    }
                } else {
                    g9pVar.k(6, -6, null, null, null, null, null);
                    break;
                }
            default:
                int i = 0;
                long j2 = 0;
                while (true) {
                    g9p g9pVar2 = this.b;
                    long j3 = this.c;
                    if (i >= 3) {
                        g9pVar2.h.execute(new pg91(g9pVar2, this.w, this.x, this.y, j3));
                        break;
                    } else {
                        j2 = Math.min(j3, (j3 / 3) + j2);
                        g9pVar2.k(2, 0, Long.valueOf(j2), Long.valueOf(j3), null, null, null);
                        SystemClock.sleep(1000L);
                        mvt0 mvt0Var = (mvt0) g9pVar2.k.get();
                        if (mvt0Var.h() != 9 && mvt0Var.h() != 7 && mvt0Var.h() != 6) {
                            i++;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ pg91(g9p g9pVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, long j) {
        this.b = g9pVar;
        this.w = arrayList;
        this.x = arrayList2;
        this.y = arrayList3;
        this.c = j;
    }
}
