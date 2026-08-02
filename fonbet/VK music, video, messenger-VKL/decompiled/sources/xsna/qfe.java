package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.common.VideoFile;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.eqc;
import xsna.xjd;

/* compiled from: ClipsHolderPresenterImpl.kt */
/* loaded from: classes4.dex */
public final class qfe implements c.m {
    public static final /* synthetic */ qcy<Object>[] n;
    public final ClipsHolderViewImpl b;
    public final zme c;
    public final Integer d;
    public final boolean e;
    public com.vk.lists.c i;
    public volatile String m;
    public final ListDataSet<xjd> f = new ListDataSet<>();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ums0 j = ums0.a;
    public final eqc k = new eqc();
    public final pgn l = new pgn();

    /* compiled from: ClipsHolderPresenterImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(qfe.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        n = new qcy[]{mutablePropertyReference1Impl};
    }

    public qfe(ClipsHolderViewImpl clipsHolderViewImpl, zme zmeVar, Integer num, boolean z) {
        this.b = clipsHolderViewImpl;
        this.c = zmeVar;
        this.d = num;
        this.e = z;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<eqc.a<VideoFile>> O9(String str, com.vk.lists.c cVar) {
        String str2 = this.m;
        if (str2 == null) {
            return io.reactivex.rxjava3.core.q.T(eqc.a.C2834a.a);
        }
        dz2 x = yfb.x(mgj0.a(new ngj0(), str2, str, Integer.valueOf(cVar.k()), null, 120));
        x.n = true;
        return rsg0.T(x).U(new gv(new defpackage.c(12, this, cVar), 11));
    }

    public final void a(VideoFile videoFile) {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xjd.a aVar = (xjd.a) it.next();
            if (epx.f(aVar.a.r1(), videoFile.r1())) {
                aVar = new xjd.a(videoFile);
            }
            arrayList2.add(aVar);
        }
        c(arrayList2, j5g.O0(this.h), true, j5g.i0(this.f.d) instanceof xjd.b);
    }

    public final void b(VideoFile videoFile) {
        ListDataSet<xjd> listDataSet = this.f;
        Pair i = p4g.i(listDataSet.d, new hq5(videoFile, 2));
        if (i != null) {
            int intValue = ((Number) i.d()).intValue();
            c(rdi.A(intValue, this.g), j5g.O0(this.h), true, j5g.i0(listDataSet.d) instanceof xjd.b);
        }
    }

    public final void c(ArrayList arrayList, List list, boolean z, boolean z2) {
        if (z) {
            this.h.clear();
            this.h.addAll(list);
            this.g.clear();
            this.g.addAll(arrayList);
            this.f.setItems(arrayList);
            eqc eqcVar = this.k;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((xjd.a) it.next()).a.r1());
            }
            eqcVar.a.addAll(arrayList2);
        } else {
            if (j5g.i0(this.f.d) instanceof xjd.b) {
                ListDataSet<xjd> listDataSet = this.f;
                listDataSet.A(listDataSet.d.size() - 1);
                z2 = true;
            }
            this.h.addAll(list);
            this.g.addAll(arrayList);
            this.f.n0(arrayList);
        }
        if (z2) {
            this.f.s(new xjd.b(this.m));
        }
    }

    public final void d(List<? extends VideoFile> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        int size = z ? 0 : this.f.d.size();
        Integer num = this.d;
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Iterator<? extends VideoFile> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VideoFile next = it.next();
            int size2 = arrayList.size() + size;
            if (size2 <= intValue) {
                if (size2 + 1 > intValue && this.e) {
                    z2 = true;
                    break;
                } else if (!next.v()) {
                    if (egd.c(next)) {
                        arrayList2.add(next);
                    } else {
                        arrayList.add(new xjd.a(next));
                    }
                }
            } else {
                com.vk.lists.c cVar = this.i;
                if (cVar != null) {
                    cVar.r(false);
                }
            }
        }
        c(arrayList, arrayList2, z, z2);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<eqc.a<VideoFile>> hj(com.vk.lists.c cVar, boolean z) {
        this.k.a.clear();
        this.g.clear();
        this.h.clear();
        return O9(null, cVar);
    }

    @Override // com.vk.lists.c.k
    @SuppressLint({"CheckResult"})
    public final void wd(io.reactivex.rxjava3.core.q<eqc.a<VideoFile>> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.a0(asu0.a.d()).subscribe(new iu1(new k82(3, this, cVar), 9), new bg1(new a(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 15));
    }
}
