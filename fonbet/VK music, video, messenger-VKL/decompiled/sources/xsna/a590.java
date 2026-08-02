package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.wfu;

/* compiled from: OwnerGridLoadPresenter.kt */
/* loaded from: classes17.dex */
public final class a590 implements ufu {
    public final wee a;
    public ClipGridParams b;
    public final ibr0 c;
    public final Lazy<cpu> d;
    public final sdq0 e;
    public final zof f;
    public final xde h;
    public final xde i;
    public List<ClipGridParams.Data.Profile> g = EmptyList.b;
    public final wce j = new wce();
    public final mde k = new mde();

    /* compiled from: OwnerGridLoadPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridTabData.values().length];
            try {
                iArr[ClipsGridTabData.LikedClips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridTabData.DelayedPublications.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsGridTabData.Drafts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsGridTabData.OwnerClips.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a590(ClipGridParams.OnlyId.Profile profile, jof jofVar, wee weeVar, ClipGridParams clipGridParams, ibr0 ibr0Var, Lazy<? extends cpu> lazy, sdq0 sdq0Var, zof zofVar) {
        this.a = weeVar;
        this.b = clipGridParams;
        this.c = ibr0Var;
        this.d = lazy;
        this.e = sdq0Var;
        this.f = zofVar;
        this.h = new xde(profile, true, jofVar, sdq0Var);
        this.i = new xde(profile, false, jofVar, sdq0Var);
    }

    @Override // xsna.ufu
    public final sde a(ClipsGridTabData clipsGridTabData) {
        int i = a.$EnumSwitchMapping$0[clipsGridTabData.ordinal()];
        if (i == 1) {
            return this.k;
        }
        if (i == 2) {
            return this.h;
        }
        if (i == 3) {
            return this.j;
        }
        if (i == 4) {
            return this.i;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Stub clips delegate returned from " + qjg.a(this) + " for tab type = " + clipsGridTabData));
        ane aneVar = new ane();
        rdi.F(aneVar);
        return aneVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.ufu
    public final void b(boolean z) {
        VKFromList<vee> vKFromList;
        xde xdeVar = this.i;
        pgn pgnVar = xdeVar.k;
        qcy<Object>[] qcyVarArr = xde.l;
        qcy<Object> qcyVar = qcyVarArr[2];
        pgnVar.b(null);
        if (z) {
            pgn pgnVar2 = xdeVar.j;
            qcy<Object> qcyVar2 = qcyVarArr[1];
            pgnVar2.b(null);
            xdeVar.h.e();
            pgn pgnVar3 = xdeVar.i;
            qcy<Object> qcyVar3 = qcyVarArr[0];
            pgnVar3.b(null);
            for (eoe eoeVar : xdeVar.f.values()) {
                eoeVar.getClass();
                PaginationKey.Initial initial = PaginationKey.Initial.b;
                biu biuVar = eoeVar.e;
                qcy<Object>[] qcyVarArr2 = eoe.j;
                biuVar.setValue(eoeVar, qcyVarArr2[0], initial);
                pgn pgnVar4 = eoeVar.f;
                qcy<Object> qcyVar4 = qcyVarArr2[1];
                pgnVar4.b(null);
            }
        }
        this.j.getClass();
        mde mdeVar = this.k;
        pgn pgnVar5 = mdeVar.c;
        qcy<Object> qcyVar5 = mde.d[0];
        pgnVar5.b(null);
        if (!z || (vKFromList = mdeVar.b) == null) {
            return;
        }
        vKFromList.clear();
    }

    @Override // xsna.ufu
    public final void c() {
        this.g = EmptyList.b;
    }

    @Override // xsna.ufu
    public final void d(ClipGridParams clipGridParams) {
        this.g = EmptyList.b;
        this.b = clipGridParams;
    }

    @Override // xsna.ufu
    public final void e(wfu wfuVar, wfu.a aVar) {
        nee neeVar;
        List<ClipGridParams.Data.Profile> list;
        if (!(wfuVar instanceof itf0)) {
            wfu.a.b bVar = aVar instanceof wfu.a.b ? (wfu.a.b) aVar : null;
            if (bVar != null && (neeVar = bVar.a) != null && (list = neeVar.l) != null) {
                this.g = list;
            }
        }
        wfuVar.a(aVar, this.g);
    }

    @Override // xsna.ufu
    public final wfu f() {
        Object obj;
        UserId userId;
        ClipGridParams.OnlyId zb = this.b.zb();
        ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
        UserId userId2 = profile != null ? profile.b : null;
        wee weeVar = this.a;
        if (userId2 == null) {
            weeVar.jm(null);
            return null;
        }
        Iterator<T> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((ClipGridParams.Data.Profile) obj).b.b.b, userId2)) {
                break;
            }
        }
        ClipGridParams.Data.Profile profile2 = (ClipGridParams.Data.Profile) obj;
        ClipsAuthor clipsAuthor = profile2 != null ? profile2.b : null;
        boolean isEmpty = this.g.isEmpty();
        sdq0 sdq0Var = this.e;
        if (isEmpty) {
            return new uvu(((ClipGridParams.OnlyId.Profile) this.b.zb()).b, weeVar, sdq0Var, this.f);
        }
        ClipGridParams clipGridParams = this.b;
        if (clipsAuthor == null || (userId = clipsAuthor.b.b) == null) {
            userId = ((ClipGridParams.OnlyId.Profile) clipGridParams.zb()).b;
        }
        return new itf0(this.k, this.i, this.h, this.j, clipGridParams, userId, clipsAuthor != null ? clipsAuthor.h : 0, weeVar, this.d, sdq0Var);
    }

    @Override // xsna.ufu
    public final wfu g(wfu wfuVar, wfu.a aVar) {
        if ((wfuVar instanceof yus) || (wfuVar instanceof itf0)) {
            return null;
        }
        return new yus(this.k, this.i, this.h, this.j, this.b, this.a, this.c, this.d, this.e, this.f);
    }

    @Override // xsna.ufu
    public final void G0() {
    }
}
