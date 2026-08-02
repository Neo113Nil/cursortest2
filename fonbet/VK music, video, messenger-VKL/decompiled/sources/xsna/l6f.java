package xsna;

import com.ironsource.InterfaceC4413l1;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class l6f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l6f(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        String Fb;
        switch (this.b) {
            case 0:
                z7f z7fVar = (z7f) this.c;
                o6f o6fVar = (o6f) this.d;
                List<n7f> list = (List) this.e;
                n7f n7fVar = (n7f) this.f;
                int b = z7fVar.b();
                List list2 = z7fVar.d;
                if (b == 1) {
                    k8f k8fVar = o6fVar.d;
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(n7f.a((n7f) it.next(), null, null, null, 3));
                    }
                    io.reactivex.rxjava3.internal.operators.single.x b2 = k8fVar.b(z7f.a(z7fVar, arrayList, null, null, jgp.b, InterfaceC4413l1.a.b.g));
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    o6fVar.b.b(b2.q(asu0.k()).m(asu0Var.d()).subscribe(new l50(new vs(o6fVar, 23), 13), new tp0(new zx0(o6fVar, 24), 13)));
                } else {
                    for (n7f n7fVar2 : list) {
                        int i = n7fVar2.a;
                        if (i == n7fVar.a) {
                            n7fVar2 = n7f.a(n7fVar, null, null, null, 3);
                        }
                        list2 = rdi.I(i, n7fVar2, list2);
                    }
                    io.reactivex.rxjava3.internal.operators.single.x b3 = o6fVar.d.b(z7f.a(z7fVar, list2, null, null, null, 471));
                    asu0 asu0Var2 = asu0.a;
                    asu0Var2.getClass();
                    o6fVar.b.b(b3.q(asu0.k()).m(asu0Var2.d()).subscribe(new pf1(new fm0(o6fVar, 22), 11), new np3(new n6f(o6fVar, 0), 10)));
                }
                return s3q0.a;
            default:
                qgp0 qgp0Var = (qgp0) this.c;
                UserId userId = (UserId) this.d;
                MusicTrack musicTrack = (MusicTrack) this.e;
                String str = (String) this.f;
                L.n("OfflineDbConn", new kk(userId, musicTrack, str, 6));
                if (qgp0Var.c()) {
                    hc50 b4 = qgp0Var.b(userId, musicTrack);
                    if (b4 == null || (Fb = b4.c) == null) {
                        Fb = musicTrack.Fb();
                    }
                } else {
                    Fb = musicTrack.Fb();
                }
                cb50 cb50Var = qgp0Var.b;
                String valueOf = String.valueOf(userId.b);
                if (str == null) {
                    str = "-2147483648";
                }
                return Integer.valueOf(cb50Var.B(valueOf, Fb, str));
        }
    }
}
