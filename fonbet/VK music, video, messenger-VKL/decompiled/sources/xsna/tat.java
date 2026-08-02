package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.model.SectionIdType;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.djc;
import xsna.ebt;
import xsna.ect;
import xsna.gbt;
import xsna.mat;
import xsna.q7t;
import xsna.xat;

/* compiled from: GamesCatalogDetailFeature.kt */
/* loaded from: classes17.dex */
public final class tat extends wk50<ibt, hbt, mat, xat> {
    public final GamesHeaderSectionInfo f;
    public final w9t g;
    public final wat h;
    public final lbt i;
    public final boolean j;
    public final f4z k;
    public final hpj l;
    public final dhi0 m;

    public tat(GamesHeaderSectionInfo gamesHeaderSectionInfo, w9t w9tVar, wat watVar, lbt lbtVar, boolean z) {
        super(new mat.i(gamesHeaderSectionInfo), new yat());
        this.f = gamesHeaderSectionInfo;
        this.g = w9tVar;
        this.h = watVar;
        this.i = lbtVar;
        this.j = z;
        this.k = new f4z();
        vhn0 a = whn0.a();
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        this.l = zvj.a(d.a.a(a, qu5.b(je00.b)));
        int i = ehi0.a;
        this.m = new dhi0(1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:28|29))(3:30|31|(1:33))|12|13|(2:15|(1:17)(1:18))|19|(1:(1:22)(1:23))|24|25))|36|6|7|(0)(0)|12|13|(0)|19|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(tat tatVar, int i, boolean z, ContinuationImpl continuationImpl) {
        rat ratVar;
        int i2;
        Object failure;
        Throwable a;
        if (continuationImpl instanceof rat) {
            ratVar = (rat) continuationImpl;
            int i3 = ratVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ratVar.label = i3 - Integer.MIN_VALUE;
                Object obj = ratVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ratVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    wat watVar = tatVar.h;
                    GamesHeaderSectionInfo gamesHeaderSectionInfo = tatVar.f;
                    ratVar.L$0 = tatVar;
                    ratVar.L$1 = null;
                    ratVar.I$0 = i;
                    ratVar.Z$0 = z;
                    ratVar.I$1 = 0;
                    ratVar.label = 1;
                    obj = watVar.a(gamesHeaderSectionInfo, i, ratVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = ratVar.Z$0;
                    tatVar = (tat) ratVar.L$0;
                    kotlin.a.a(obj);
                }
                failure = (uat) obj;
                if (!(failure instanceof Result.Failure)) {
                    uat uatVar = (uat) failure;
                    if (z) {
                        tatVar.T(new xat.h(fbt.a(uatVar.b, tatVar.f), uatVar.c));
                    } else {
                        tatVar.T(new xat.e(uatVar.a, fbt.a(uatVar.b, tatVar.f), uatVar.c));
                    }
                }
                a = Result.a(failure);
                if (a != null) {
                    if (z) {
                        tatVar.T(xat.d.b);
                    } else {
                        tatVar.T(new xat.c(h03.a(a)));
                    }
                }
                return s3q0.a;
            }
        }
        ratVar = new rat(continuationImpl);
        Object obj2 = ratVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ratVar.label;
        if (i2 != 0) {
        }
        failure = (uat) obj2;
        if (!(failure instanceof Result.Failure)) {
        }
        a = Result.a(failure);
        if (a != null) {
        }
        return s3q0.a;
    }

    public static void V(tat tatVar, int i, ebt ebtVar, int i2) {
        boolean z = (i2 & 1) == 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            ebtVar = ebt.c.a;
        }
        if (z) {
            tatVar.T(xat.g.b);
        } else {
            tatVar.T(new xat.f(ebtVar));
        }
        myc0.h(tatVar.l, hqu0.b(), null, new qat(tatVar, i, z, null), 2);
    }

    @Override // xsna.wk50
    public final void N(hbt hbtVar, mat matVar) {
        hbt hbtVar2 = hbtVar;
        mat matVar2 = matVar;
        boolean z = matVar2 instanceof mat.b;
        w9t w9tVar = this.g;
        if (z) {
            w9tVar.d(((mat.b) matVar2).b);
            return;
        }
        if (matVar2 instanceof mat.a) {
            w9tVar.c(((mat.a) matVar2).b);
            return;
        }
        if (matVar2 instanceof mat.i) {
            GamesHeaderSectionInfo gamesHeaderSectionInfo = ((mat.i) matVar2).b;
            T(new xat.i(gamesHeaderSectionInfo));
            this.h.a.a();
            W(gamesHeaderSectionInfo);
            myc0.h(this.l, null, null, new sat(this, null), 3);
            return;
        }
        boolean z2 = matVar2 instanceof mat.c;
        f4z f4zVar = this.k;
        if (z2) {
            f4zVar.b(gbt.a.a);
            return;
        }
        if (matVar2.equals(mat.f.b)) {
            W(this.f);
            return;
        }
        if (matVar2 instanceof mat.g) {
            V(this, (hbtVar2.f + 1) * 12, null, 4);
            return;
        }
        if (matVar2 instanceof mat.e) {
            f4zVar.b(new gbt.c(((mat.e) matVar2).b));
            return;
        }
        boolean z3 = matVar2 instanceof mat.h;
        lbt lbtVar = this.i;
        if (!z3) {
            if (!(matVar2 instanceof mat.d)) {
                throw new NoWhenBranchMatchedException();
            }
            lbtVar.a(new ect.b(((mat.d) matVar2).b));
            return;
        }
        q7t q7tVar = ((mat.h) matVar2).b;
        if (epx.f(q7tVar, q7t.a.a)) {
            lbtVar.a(ect.e.a);
            return;
        }
        if (q7tVar instanceof q7t.b) {
            lbtVar.a(new ect.a(((q7t.b) q7tVar).a));
            return;
        }
        if (!(q7tVar instanceof q7t.c)) {
            if (!epx.f(q7tVar, q7t.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        q7t.c cVar = (q7t.c) q7tVar;
        sbt sbtVar = cVar.b;
        int i = cVar.a;
        f4zVar.b(new gbt.c(new djc.b(sbtVar, cVar.c, Integer.valueOf(i), cVar.d)));
        lbtVar.a(new ect.a(i));
    }

    public final void W(GamesHeaderSectionInfo gamesHeaderSectionInfo) {
        if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Collection) {
            V(this, 0, null, 7);
            return;
        }
        if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Genre) {
            V(this, 0, null, 7);
            return;
        }
        if (gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.FriendlyUrl) {
            V(this, 0, null, 7);
            return;
        }
        if (!(gamesHeaderSectionInfo instanceof GamesHeaderSectionInfo.Section)) {
            throw new NoWhenBranchMatchedException();
        }
        SectionIdType sectionIdType = ((GamesHeaderSectionInfo.Section) gamesHeaderSectionInfo).c;
        if (epx.f(sectionIdType, SectionIdType.CategoriesScreen.c)) {
            V(this, 0, null, 7);
            return;
        }
        if (sectionIdType instanceof SectionIdType.Custom) {
            V(this, 0, null, 7);
            return;
        }
        if (epx.f(sectionIdType, SectionIdType.FriendsActivity.c)) {
            V(this, 0, ebt.b.a, 3);
            return;
        }
        if (epx.f(sectionIdType, SectionIdType.Installed.c)) {
            V(this, 0, ebt.g.a, 3);
            return;
        }
        if (epx.f(sectionIdType, SectionIdType.New.c)) {
            V(this, 0, null, 7);
        } else if (epx.f(sectionIdType, SectionIdType.Notifications.c)) {
            V(this, 0, ebt.j.a, 3);
        } else {
            if (!epx.f(sectionIdType, SectionIdType.Recommended.c)) {
                throw new NoWhenBranchMatchedException();
            }
            V(this, 0, null, 7);
        }
    }
}
