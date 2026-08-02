package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupContentTabType;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityProfilePriorityBlockFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class ksh {
    public final UserId a;
    public final zqu b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final ynh d;
    public final l3f e;
    public final pj1 f;
    public final joh g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* compiled from: CommunityProfilePriorityBlockFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupContentTabType.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ksh(UserId userId, zqu zquVar, io.reactivex.rxjava3.disposables.b bVar, ynh ynhVar, l3f l3fVar, pj1 pj1Var, joh johVar) {
        this.a = userId;
        this.b = zquVar;
        this.c = bVar;
        this.d = ynhVar;
        this.e = l3fVar;
        this.f = pj1Var;
        this.g = johVar;
        bu1 bu1Var = new bu1(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, bu1Var);
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.h(this, 24));
        this.j = msy.a(lazyThreadSafetyMode, new tbh(this, 1));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(CommunityProfileAction.n nVar, CommunityProfileState communityProfileState) {
        jsh<?> b;
        kdh kdhVar = communityProfileState.x;
        if (nVar instanceof CommunityProfileAction.n.b) {
            CommunityProfileAction.n.b bVar = (CommunityProfileAction.n.b) nVar;
            if (bVar.b || this.d.a.mo2getContext() == null || (b = b(kdhVar)) == null) {
                return;
            }
            b.b(bVar, communityProfileState);
            return;
        }
        if (nVar instanceof CommunityProfileAction.n.d) {
            jsh<?> b2 = b(kdhVar);
            if (b2 != null) {
                b2.a(communityProfileState);
                return;
            }
            return;
        }
        boolean z = nVar instanceof CommunityProfileAction.n.c;
        ?? r2 = this.i;
        ?? r3 = this.j;
        if (!z) {
            if (nVar instanceof CommunityProfileAction.n.a) {
                ((osh) r2.getValue()).d((CommunityProfileAction.n.a) nVar, communityProfileState);
                return;
            } else {
                if (!(nVar instanceof CommunityProfileAction.n.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ush) r3.getValue()).d((CommunityProfileAction.n.e) nVar, communityProfileState);
                return;
            }
        }
        ay00 ay00Var = ((CommunityProfileAction.n.c) nVar).b;
        if (kdhVar != null) {
            int i = a.$EnumSwitchMapping$0[kdhVar.b.ordinal()];
            if (i == 1) {
                ((osh) r2.getValue()).d(new CommunityProfileAction.n.a.l(ay00Var), communityProfileState);
            } else {
                if (i != 3) {
                    return;
                }
                ((ush) r3.getValue()).d(new CommunityProfileAction.n.e.h(ay00Var), communityProfileState);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public final jsh<?> b(kdh kdhVar) {
        if (kdhVar == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[kdhVar.b.ordinal()];
        if (i == 1 || i == 2) {
            return (osh) this.i.getValue();
        }
        if (i != 3) {
            return null;
        }
        return (ush) this.j.getValue();
    }
}
