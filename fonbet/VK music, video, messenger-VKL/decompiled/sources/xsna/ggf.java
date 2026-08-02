package xsna;

import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$PostingRedirectBanner;
import com.vk.clips.upload.vk.ui.impl.fragment.data.api.UploadUserInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadErrorType;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadPrivacyData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.DisableableSwitch;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupVkTicketDto;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.chd;
import xsna.lbf;
import xsna.mjf;
import xsna.oap;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadImmediateActionsActor.kt */
/* loaded from: classes17.dex */
public final class ggf extends al50<ClipsUploadState, lbf.a, Object, mjf, ugf, qef> {
    public final sj50<ClipsUploadState, Object, mjf, ugf, qef> c;
    public final rhd d;
    public final b25 e;
    public final mhd f;

    public ggf(sj50<ClipsUploadState, Object, mjf, ugf, qef> sj50Var, rhd rhdVar, b25 b25Var, mhd mhdVar) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = rhdVar;
        this.e = b25Var;
        this.f = mhdVar;
    }

    public static ugf.a.i q(ClipsUploadState.Loaded loaded) {
        oap bVar;
        UserId userId = loaded.f;
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        Group b = hif.b(loaded, userId);
        if (b != null) {
            b.m = 0;
            bVar = new oap.a(b);
        } else {
            UploadUserInfo uploadUserInfo = loaded.d;
            if (uploadUserInfo == null) {
                tv4.b("Something went wrong: selected id isn't present in state", com.vk.metrics.eventtracking.b.a);
                return null;
            }
            bVar = new oap.b(new UploadUserInfo(uploadUserInfo.b, uploadUserInfo.c, uploadUserInfo.d, uploadUserInfo.e, false));
        }
        ConditionalFeature.State b2 = kff.b(bVar, clipsUploadDataInternal.e.c.b);
        ConditionalFeature<EasyPromoteData> conditionalFeature = clipsUploadDataInternal.e.k;
        ConditionalFeature.State state = conditionalFeature.c;
        EasyPromoteData easyPromoteData = conditionalFeature.b;
        return new ugf.a.i(bVar, b2, state, easyPromoteData != null ? easyPromoteData.e : null);
    }

    @Override // xsna.al50, xsna.qj50
    public final boolean i(lj50 lj50Var) {
        boolean z = ((lbf.a) lj50Var) instanceof lbf.a.i;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        return z ? sj50Var.getCurrentState() instanceof ClipsUploadState.Error : sj50Var.getCurrentState() instanceof ClipsUploadState.Loaded;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClipsUploadAuthorRelatedData m(ClipsUploadState.Loaded loaded, UserId userId) {
        ConditionalFeature conditionalFeature;
        oap bVar;
        GroupVkTicketDto groupVkTicketDto;
        Group b = hif.b(loaded, userId);
        UploadUserInfo uploadUserInfo = loaded.d;
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        oap aVar = b != null ? new oap.a(b) : uploadUserInfo == null ? new oap.a(j5g.Y(loaded.c)) : new oap.b(uploadUserInfo);
        Group b2 = hif.b(loaded, userId);
        if (b2 != null) {
            bVar = new oap.a(b2);
        } else {
            if (uploadUserInfo == null) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Something went wrong: selected id isn't present in state"));
                conditionalFeature = new ConditionalFeature(null, ConditionalFeature.State.HIDDEN);
                EasyPromoteData easyPromoteData = (EasyPromoteData) conditionalFeature.b;
                boolean z = easyPromoteData == null && easyPromoteData.d;
                Set<Object> set = clipsUploadDataInternal.f;
                Set<Object> set2 = clipsUploadDataInternal.f;
                ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
                boolean z2 = !set.contains(ClipUploadScreenFeature$PostingRedirectBanner.b) && clipsUploadDataInternal.d.k.i;
                ConditionalFeature a = ConditionalFeature.a(clipsUploadAuthorRelatedData.c, null, !fkq0.b(userId) ? ConditionalFeature.State.HIDDEN : z ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN, 1);
                return new ClipsUploadAuthorRelatedData(clipsUploadAuthorRelatedData.b, a, new ConditionalFeature(new CoauthorsData(EmptyList.b), kff.b(aVar, clipsUploadAuthorRelatedData.c.b)), HideableFeature.a(clipsUploadAuthorRelatedData.e, null, false, 2), new HideableFeature(null, kff.d(aVar, set2)), kff.a(aVar, set2), new DisableableFeature(null, clipsUploadAuthorRelatedData.h.c), DisableableSwitch.a(clipsUploadAuthorRelatedData.i, false, kff.h(aVar, clipsUploadAuthorRelatedData.c.b), 1), ConditionalNumber.a(clipsUploadAuthorRelatedData.j, null, set2.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : z ? ConditionalNumber.State.DISABLED : ConditionalNumber.State.SHOWN, 1), conditionalFeature, z2, kff.f(this.f, aVar), false, true, kff.g(aVar), ConditionalFeature.a(clipsUploadAuthorRelatedData.q, null, kff.i(loaded, clipsUploadAuthorRelatedData.j.d(), ((ClipsUploadPrivacyData) a.b).b, aVar), 1), kff.e(aVar), b == null && (groupVkTicketDto = b.R) != null && groupVkTicketDto.d());
            }
            bVar = new oap.b(uploadUserInfo);
        }
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = clipsUploadDataInternal.e;
        ConditionalFeature<EasyPromoteData> conditionalFeature2 = clipsUploadAuthorRelatedData2.k;
        Pair c = kff.c(clipsUploadAuthorRelatedData2.c.b.b, b2, bVar, clipsUploadAuthorRelatedData2.j.d() != null, clipsUploadDataInternal.f);
        ConditionalFeature.State state = (ConditionalFeature.State) c.i();
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = (EasyPromoteUnavalabilityReason) c.j();
        EasyPromoteData easyPromoteData2 = conditionalFeature2.b;
        boolean z3 = easyPromoteData2 != null && easyPromoteData2.d && (!(b2 == null || b2.n()) || b2 == null) && state == ConditionalFeature.State.SHOWN;
        EasyPromoteData easyPromoteData3 = conditionalFeature2.b;
        conditionalFeature = new ConditionalFeature(easyPromoteData3 != null ? EasyPromoteData.a(easyPromoteData3, 0, 0, z3, easyPromoteUnavalabilityReason, 3) : null, state);
        EasyPromoteData easyPromoteData4 = (EasyPromoteData) conditionalFeature.b;
        if (easyPromoteData4 == null) {
        }
        Set<Object> set3 = clipsUploadDataInternal.f;
        Set<Object> set22 = clipsUploadDataInternal.f;
        ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = clipsUploadDataInternal.e;
        if (set3.contains(ClipUploadScreenFeature$PostingRedirectBanner.b)) {
        }
        ConditionalFeature a2 = ConditionalFeature.a(clipsUploadAuthorRelatedData3.c, null, !fkq0.b(userId) ? ConditionalFeature.State.HIDDEN : z ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN, 1);
        return new ClipsUploadAuthorRelatedData(clipsUploadAuthorRelatedData3.b, a2, new ConditionalFeature(new CoauthorsData(EmptyList.b), kff.b(aVar, clipsUploadAuthorRelatedData3.c.b)), HideableFeature.a(clipsUploadAuthorRelatedData3.e, null, false, 2), new HideableFeature(null, kff.d(aVar, set22)), kff.a(aVar, set22), new DisableableFeature(null, clipsUploadAuthorRelatedData3.h.c), DisableableSwitch.a(clipsUploadAuthorRelatedData3.i, false, kff.h(aVar, clipsUploadAuthorRelatedData3.c.b), 1), ConditionalNumber.a(clipsUploadAuthorRelatedData3.j, null, set22.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : z ? ConditionalNumber.State.DISABLED : ConditionalNumber.State.SHOWN, 1), conditionalFeature, z2, kff.f(this.f, aVar), false, true, kff.g(aVar), ConditionalFeature.a(clipsUploadAuthorRelatedData3.q, null, kff.i(loaded, clipsUploadAuthorRelatedData3.j.d(), ((ClipsUploadPrivacyData) a2.b).b, aVar), 1), kff.e(aVar), b == null && (groupVkTicketDto = b.R) != null && groupVkTicketDto.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r4.h.b == null) goto L19;
     */
    @Override // xsna.qj50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(lj50 lj50Var) {
        UserId userId;
        Group b;
        UploadUserInfo uploadUserInfo;
        ugf.a.i q;
        lbf.a aVar = (lbf.a) lj50Var;
        boolean z = aVar instanceof lbf.a.C3246a;
        rhd rhdVar = this.d;
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (z) {
            ClipsUploadState.Loaded loaded = (ClipsUploadState.Loaded) sj50Var.getCurrentState();
            UserId userId2 = loaded.f;
            ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
            lbf.a.C3246a c3246a = (lbf.a.C3246a) aVar;
            UserId userId3 = c3246a.b;
            if (epx.f(userId2, userId3)) {
                return;
            }
            if (!c3246a.c) {
                if (clipsUploadDataInternal.e.d.b.b.isEmpty()) {
                    ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal.e;
                    if (clipsUploadAuthorRelatedData.e.b == null) {
                        if (clipsUploadAuthorRelatedData.f.b == null) {
                        }
                    }
                }
                c(new qef.e0(userId3));
                return;
            }
            if (fkq0.b(userId3)) {
                Group b2 = hif.b(loaded, userId3);
                rhdVar.h(new chd.b(userId3, b2 != null ? b2.d : null), c3246a.d);
            } else {
                rhdVar.h(new chd.d(o25.a().o()), false);
            }
            e(new ugf.a.b(userId3, m(loaded, userId3)));
            a(new mjf.a.c(fkq0.b(userId3) ? userId3 : null));
            if (fkq0.b(userId3)) {
                a(new mjf.a.m(userId3));
                return;
            }
            return;
        }
        if (aVar instanceof lbf.a.c) {
            e(new ugf.a.f(((lbf.a.c) aVar).b));
            return;
        }
        if (aVar instanceof lbf.a.f) {
            lbf.a.f fVar = (lbf.a.f) aVar;
            String str = fVar.d;
            String str2 = fVar.c;
            if (str2 == null || str2.length() == 0) {
                e(new ugf.a.f(str));
                return;
            } else {
                c(new qef.f0(fVar.b, str2, str));
                return;
            }
        }
        if (aVar instanceof lbf.a.b) {
            e(new ugf.a.e(((lbf.a.b) aVar).b));
            return;
        }
        if (aVar instanceof lbf.a.i) {
            lm50 currentState = sj50Var.getCurrentState();
            ClipsUploadState.Error error = currentState instanceof ClipsUploadState.Error ? (ClipsUploadState.Error) currentState : null;
            if (error == null) {
                return;
            }
            ClipsUploadErrorType clipsUploadErrorType = error.b;
            e(new ugf.f.d(clipsUploadErrorType.A8()));
            if (clipsUploadErrorType instanceof ClipsUploadErrorType.InitialNetworkLoad) {
                ClipsUploadErrorType.InitialNetworkLoad initialNetworkLoad = (ClipsUploadErrorType.InitialNetworkLoad) clipsUploadErrorType;
                a(new mjf.a.o(initialNetworkLoad.b, initialNetworkLoad.c));
                return;
            } else if (clipsUploadErrorType instanceof ClipsUploadErrorType.InitialParamsCompactSetup) {
                ClipsUploadErrorType.InitialParamsCompactSetup initialParamsCompactSetup = (ClipsUploadErrorType.InitialParamsCompactSetup) clipsUploadErrorType;
                a(new mjf.c(initialParamsCompactSetup.b, initialParamsCompactSetup.c));
                return;
            } else {
                if (!(clipsUploadErrorType instanceof ClipsUploadErrorType.InitialParamsFullSetup)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsUploadErrorType.InitialParamsFullSetup initialParamsFullSetup = (ClipsUploadErrorType.InitialParamsFullSetup) clipsUploadErrorType;
                a(new mjf.d(initialParamsFullSetup.b, initialParamsFullSetup.c));
                return;
            }
        }
        if (aVar.equals(lbf.a.g.b)) {
            lm50 currentState2 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded2 = currentState2 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState2 : null;
            if (loaded2 == null || (q = q(loaded2)) == null) {
                return;
            }
            return;
        }
        if (aVar.equals(lbf.a.e.b)) {
            a(mjf.a.e.b);
            return;
        }
        if (aVar.equals(lbf.a.h.b)) {
            ClipsUploadState.Loaded loaded3 = (ClipsUploadState.Loaded) sj50Var.getCurrentState();
            boolean z2 = loaded3.l;
            UserId userId4 = loaded3.f;
            if (z2) {
                e(new ugf.a.g(false));
                if (fkq0.d(userId4) && (uploadUserInfo = loaded3.d) != null && uploadUserInfo.f && !this.e.d()) {
                    ugf.a.i q2 = q(loaded3);
                    if (q2 != null) {
                        return;
                    }
                    return;
                }
                if (fkq0.b(userId4) && (b = hif.b(loaded3, userId4)) != null && b.n()) {
                    a(new mjf.a.n(userId4));
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.equals(lbf.a.d.b)) {
            e(new ugf.a.g(true));
            return;
        }
        if (!(aVar instanceof lbf.a.j)) {
            throw new NoWhenBranchMatchedException();
        }
        lbf.a.j jVar = (lbf.a.j) aVar;
        lm50 currentState3 = sj50Var.getCurrentState();
        ClipsUploadState.Loaded loaded4 = currentState3 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState3 : null;
        if (loaded4 == null) {
            return;
        }
        chd f = rhdVar.f();
        if (f instanceof chd.b) {
            UserId userId5 = ((chd.b) f).c;
            if (userId5 != null) {
                userId = fkq0.e(fkq0.a(userId5));
            }
            userId = null;
        } else {
            if (f instanceof chd.d) {
                userId = ((chd.d) f).c;
            }
            userId = null;
        }
        if (userId != null && !epx.f(loaded4.f, userId)) {
            e(new ugf.a.b(userId, m(loaded4, userId)));
            a(new mjf.a.c(fkq0.b(userId) ? userId : null));
            if (fkq0.b(userId)) {
                a(new mjf.a.m(userId));
            }
        }
        if (jVar.equals(lbf.a.j.C3247a.b)) {
            a(new mjf.e.b(loaded4.b));
        } else {
            if (!(jVar instanceof lbf.a.j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e(new ugf.a.j(((lbf.a.j.b) jVar).b));
            a(new mjf.e.b(((ClipsUploadState.Loaded) sj50Var.getCurrentState()).b));
        }
    }
}
