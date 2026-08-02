package xsna;

import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ArtistChangeDetector.kt */
/* loaded from: classes3.dex */
public final class sq3 {
    public final u2b0 a;
    public final izs<lt3, s3q0> b;
    public final izs<Boolean, s3q0> c;
    public Integer d;
    public lt3 e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public sq3(u2b0 u2b0Var, izs<? super lt3, s3q0> izsVar, izs<? super Boolean, s3q0> izsVar2) {
        this.a = u2b0Var;
        this.b = izsVar;
        this.c = izsVar2;
    }

    public final void a(com.vk.music.player.f fVar) {
        MusicTrack b = this.a.b();
        izs<lt3, s3q0> izsVar = this.b;
        ArrayList arrayList = null;
        if (fVar == null || b == null || !b.Tb()) {
            this.d = null;
            this.e = null;
            izsVar.invoke(null);
            return;
        }
        boolean n = fVar.n();
        boolean z = !n;
        izs<Boolean, s3q0> izsVar2 = this.c;
        if (!n && !this.f) {
            izsVar2.invoke(Boolean.TRUE);
            z = true;
            this.f = true;
        } else if (n && this.f) {
            izsVar2.invoke(Boolean.FALSE);
            z = false;
            this.f = false;
        }
        if (z) {
            return;
        }
        int i = b.b;
        Integer num = this.d;
        if (num != null && i == num.intValue()) {
            return;
        }
        this.d = Integer.valueOf(b.b);
        List<Artist> list = b.t;
        List<Artist> list2 = b.u;
        if (list == null) {
            this.d = null;
            this.e = null;
            izsVar.invoke(null);
            return;
        }
        List<Artist> list3 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Artist) it.next()).b);
        }
        if (list2 != null) {
            List<Artist> list4 = list2;
            arrayList = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Artist) it2.next()).b);
            }
        }
        lt3 lt3Var = new lt3(arrayList2, arrayList);
        if (epx.f(this.e, lt3Var)) {
            return;
        }
        this.e = lt3Var;
        izsVar.invoke(lt3Var);
    }
}
