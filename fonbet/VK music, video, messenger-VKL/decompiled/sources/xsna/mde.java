package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: ClipsGridLikedClipsDelegate.kt */
/* loaded from: classes17.dex */
public final class mde implements sde {
    public static final /* synthetic */ qcy<Object>[] d;
    public AbstractClipsGridListFragment a;
    public VKFromList<vee> b;
    public final pgn c;

    /* compiled from: ClipsGridLikedClipsDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            mde mdeVar = (mde) this.receiver;
            qcy<Object>[] qcyVarArr = mde.d;
            mdeVar.getClass();
            L.i(th);
            AbstractClipsGridListFragment abstractClipsGridListFragment = mdeVar.a;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.g0();
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(mde.class, "paginationDisposable", "getPaginationDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    public mde() {
        com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID);
        this.c = new pgn();
    }

    @Override // xsna.sde
    public final void a() {
        d();
    }

    public final void b(String str, List list) {
        VKFromList<vee> vKFromList = new VKFromList<>(str == null ? "" : str);
        VKFromList<vee> vKFromList2 = this.b;
        if (vKFromList2 != null) {
            vKFromList.addAll(vKFromList2);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vKFromList.add(new vee((ClipVideoFile) it.next(), null, false, null, false, false));
        }
        this.b = vKFromList;
        AbstractClipsGridListFragment abstractClipsGridListFragment = this.a;
        if (abstractClipsGridListFragment != null) {
            abstractClipsGridListFragment.po(vKFromList, str == null || str.length() == 0);
        }
    }

    @Override // xsna.sde
    public final boolean c() {
        return false;
    }

    @Override // xsna.sde
    public final void d() {
        VKFromList<vee> vKFromList = this.b;
        String i = vKFromList != null ? vKFromList.i() : null;
        qcy<Object>[] qcyVarArr = d;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.c;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar == null || !hg1.d(cVar)) {
            if (i == null || i.length() != 0) {
                io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(new o8d((i == null || i.length() == 0 || i.equals("null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(i), 12)).m(asu0.a.d()), new az(new com.vk.movika.sdk.base.observable.c(this, 27), 16)).subscribe(new cz(new com.vk.movika.sdk.base.observable.e(this, 26), 15), new io1(new a(1, this, mde.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 18));
                qcy<Object> qcyVar2 = qcyVarArr[0];
                pgnVar.b(subscribe);
            }
        }
    }

    @Override // xsna.sde
    public final void e(AbstractClipsGridListFragment abstractClipsGridListFragment) {
        this.a = abstractClipsGridListFragment;
        VKFromList<vee> vKFromList = this.b;
        if (vKFromList != null && !vKFromList.isEmpty()) {
            abstractClipsGridListFragment.po(vKFromList, true);
            return;
        }
        qcy<Object> qcyVar = d[0];
        if (hg1.d((io.reactivex.rxjava3.disposables.c) this.c.b)) {
            abstractClipsGridListFragment.lb();
        } else {
            abstractClipsGridListFragment.po(EmptyList.b, true);
        }
    }

    @Override // xsna.sde
    public final ClipGridParams f() {
        return null;
    }

    @Override // xsna.sde
    public final void g() {
        this.a = null;
    }

    @Override // xsna.sde
    public final PaginationKey h() {
        VKFromList<vee> vKFromList = this.b;
        String i = vKFromList != null ? vKFromList.i() : null;
        return (i == null || i.length() == 0 || epx.f(i, "null")) ? PaginationKey.LoadedFull.b : new PaginationKey.Next(i);
    }
}
