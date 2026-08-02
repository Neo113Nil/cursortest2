package one.video.exo.offline;

import androidx.media3.exoplayer.offline.DownloadHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import one.video.exo.offline.a;
import one.video.exo.offline.e;
import xsna.c5g;
import xsna.eoo;
import xsna.fr10;
import xsna.kao;
import xsna.ln00;
import xsna.m8o;
import xsna.rr1;
import xsna.rsk;
import xsna.s8o;
import xsna.ym00;
import xsna.zno;

/* compiled from: DownloadPipeline.kt */
/* loaded from: classes8.dex */
public final class b implements DownloadHelper.a {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void a(DownloadHelper downloadHelper, boolean z) {
        rr1 rr1Var;
        a aVar = this.a;
        a.b bVar = aVar.i;
        aVar.f.getClass();
        if (!z) {
            bVar.a(new f(new e.a(), new e.a(), new e.b()));
            return;
        }
        m8o m8oVar = aVar.e;
        if (downloadHelper.i() <= 0) {
            EmptyList emptyList = EmptyList.b;
            rr1Var = new rr1(emptyList, emptyList, emptyList);
        } else {
            ln00.a h = downloadHelper.h();
            Object g = downloadHelper.g();
            zno znoVar = null;
            rsk rskVar = g instanceof rsk ? (rsk) g : null;
            if (rskVar != null) {
                long j = rskVar.b;
                zno.a aVar2 = zno.c;
                znoVar = new zno(eoo.f(j, DurationUnit.MILLISECONDS));
            }
            ArrayList a = ym00.a(h, 2);
            ArrayList arrayList = new ArrayList(c5g.u(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                androidx.media3.common.a aVar3 = (androidx.media3.common.a) it.next();
                arrayList.add(new kao(new one.video.player.tracks.c("", fr10.d(aVar3), true), s8o.a(aVar3, znoVar)));
            }
            ArrayList a2 = ym00.a(h, 1);
            ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                androidx.media3.common.a aVar4 = (androidx.media3.common.a) it2.next();
                arrayList2.add(new kao(new one.video.player.tracks.a("", fr10.a(aVar4)), s8o.a(aVar4, znoVar)));
            }
            ArrayList a3 = ym00.a(h, 3);
            ArrayList arrayList3 = new ArrayList(c5g.u(a3, 10));
            Iterator it3 = a3.iterator();
            while (it3.hasNext()) {
                androidx.media3.common.a aVar5 = (androidx.media3.common.a) it3.next();
                arrayList3.add(new kao(new one.video.player.tracks.b("", fr10.c(aVar5)), s8o.a(aVar5, znoVar)));
            }
            rr1Var = new rr1(arrayList, arrayList2, arrayList3);
        }
        m8oVar.a(rr1Var, bVar);
    }

    @Override // androidx.media3.exoplayer.offline.DownloadHelper.a
    public final void b(IOException iOException) {
    }
}
