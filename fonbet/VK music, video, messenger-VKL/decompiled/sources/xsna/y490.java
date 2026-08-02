package xsna;

import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wfu;

/* compiled from: OwnerGrid.kt */
/* loaded from: classes17.dex */
public abstract class y490 extends wfu {
    public final UserId b;
    public final z490 c;
    public final sdq0 d;
    public final pfu e;

    /* compiled from: OwnerGrid.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<nee, wfu.a.b> {
        @Override // xsna.izs
        public final wfu.a.b invoke(nee neeVar) {
            ((y490) this.receiver).getClass();
            EmptyList emptyList = EmptyList.b;
            return new wfu.a.b(neeVar, emptyList, emptyList, emptyList);
        }
    }

    /* compiled from: OwnerGrid.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<nee, List<? extends tce>, wfu.a.b> {
        @Override // xsna.wzs
        public final wfu.a.b invoke(nee neeVar, List<? extends tce> list) {
            ((y490) this.receiver).getClass();
            EmptyList emptyList = EmptyList.b;
            return new wfu.a.b(neeVar, emptyList, emptyList, list);
        }
    }

    /* compiled from: OwnerGrid.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements yzs<List<? extends Pair<? extends ClipUploadJob, ? extends ded>>, nee, List<? extends tce>, wfu.a.b> {
        @Override // xsna.yzs
        public final wfu.a.b invoke(List<? extends Pair<? extends ClipUploadJob, ? extends ded>> list, nee neeVar, List<? extends tce> list2) {
            nee neeVar2 = neeVar;
            List<? extends tce> list3 = list2;
            ((y490) this.receiver).getClass();
            List<? extends Pair<? extends ClipUploadJob, ? extends ded>> list4 = list;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i = emf.a;
                Integer num = ((ClipUploadJob) ((Pair) next).i()).f;
                if (!((num != null ? num.intValue() : 0) > 0)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                int i2 = emf.a;
                arrayList2.add(new Pair(emf.b((ClipUploadJob) pair.i()), xlf.a((ClipUploadJob) pair.i(), (ded) pair.j())));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list4) {
                int i3 = emf.a;
                Integer num2 = ((ClipUploadJob) ((Pair) obj).i()).f;
                if ((num2 != null ? num2.intValue() : 0) > 0) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Pair pair2 = (Pair) it3.next();
                int i4 = emf.a;
                arrayList4.add(new Pair(emf.b((ClipUploadJob) pair2.i()), xlf.a((ClipUploadJob) pair2.i(), (ded) pair2.j())));
            }
            return new wfu.a.b(neeVar2, arrayList2, arrayList4, list3);
        }
    }

    /* compiled from: OwnerGrid.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<List<? extends Pair<? extends ClipVideoFile, ? extends eed>>, nee, List<? extends tce>, wfu.a.b> {
        @Override // xsna.yzs
        public final wfu.a.b invoke(List<? extends Pair<? extends ClipVideoFile, ? extends eed>> list, nee neeVar, List<? extends tce> list2) {
            nee neeVar2 = neeVar;
            List<? extends tce> list3 = list2;
            ((y490) this.receiver).getClass();
            List<? extends Pair<? extends ClipVideoFile, ? extends eed>> list4 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list4) {
                Pair pair = (Pair) obj;
                int i = emf.a;
                if (!emf.a((ClipVideoFile) pair.i(), (eed) pair.j())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                arrayList2.add(new Pair(pair2.i(), xlf.b((eed) pair2.j())));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list4) {
                Pair pair3 = (Pair) obj2;
                int i2 = emf.a;
                if (emf.a((ClipVideoFile) pair3.i(), (eed) pair3.j())) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Pair pair4 = (Pair) it2.next();
                arrayList4.add(new Pair(pair4.i(), xlf.b((eed) pair4.j())));
            }
            return new wfu.a.b(neeVar2, arrayList2, arrayList4, list3);
        }
    }

    public y490(UserId userId, z490 z490Var, wee weeVar, sdq0 sdq0Var) {
        super(weeVar);
        this.b = userId;
        this.c = z490Var;
        this.d = sdq0Var;
        this.e = g620.f().u();
    }

    @Override // xsna.wfu
    public io.reactivex.rxjava3.core.x<wfu.a> b() {
        io.reactivex.rxjava3.core.x A;
        z490 z490Var = this.c;
        boolean z = z490Var.e;
        boolean z2 = z490Var.a;
        if (z2 || z) {
            if (!z2 || z) {
                sdq0 sdq0Var = this.d;
                if (sdq0Var.a.getValue().k()) {
                    A = io.reactivex.rxjava3.core.x.A(io.reactivex.rxjava3.core.x.k(sdq0Var.b.getValue().e()), c(), g620.f().j(), new s41(new c(3, this, y490.class, "remoteDataToDTONew", "remoteDataToDTONew(Ljava/util/List;Lcom/vk/api/clips/ClipsGridSourcesData;Ljava/util/List;)Lcom/vk/clips/viewer/impl/grid/repository/strategies/GridLoadStrategy$GridData$OwnerGridData;", 0), 25));
                } else {
                    A = io.reactivex.rxjava3.core.x.A(sdq0Var.c.getValue().g(), c(), g620.f().j(), new pi40(new d(3, this, y490.class, "remoteDataToDTOLegacy", "remoteDataToDTOLegacy(Ljava/util/List;Lcom/vk/api/clips/ClipsGridSourcesData;Ljava/util/List;)Lcom/vk/clips/viewer/impl/grid/repository/strategies/GridLoadStrategy$GridData$OwnerGridData;", 0), 2));
                }
            } else {
                A = io.reactivex.rxjava3.core.x.B(c(), g620.f().j(), new yzt(new b(2, this, y490.class, "remoteDataToDTO", "remoteDataToDTO(Lcom/vk/api/clips/ClipsGridSourcesData;Ljava/util/List;)Lcom/vk/clips/viewer/impl/grid/repository/strategies/GridLoadStrategy$GridData$OwnerGridData;", 0), 10));
            }
            return new io.reactivex.rxjava3.internal.operators.single.o(A, new lw30(new rxz(this, 10), 5));
        }
        A = c().l(new p5w(new a(1, this, y490.class, "remoteDataToDTO", "remoteDataToDTO(Lcom/vk/api/clips/ClipsGridSourcesData;)Lcom/vk/clips/viewer/impl/grid/repository/strategies/GridLoadStrategy$GridData$OwnerGridData;", 0), 9));
        return new io.reactivex.rxjava3.internal.operators.single.o(A, new lw30(new rxz(this, 10), 5));
    }

    public abstract io.reactivex.rxjava3.core.x<nee> c();
}
