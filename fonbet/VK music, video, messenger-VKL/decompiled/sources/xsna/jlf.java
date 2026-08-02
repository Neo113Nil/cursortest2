package xsna;

import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipAttachedVideoInfo;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadAuthorRelatedData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadUnmodifiableData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.CoauthorsData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteData;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavailabilityTarget;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.EasyPromoteUnavalabilityReason;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.ConditionalNumber;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.Good;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupVkTicketDto;
import com.vk.dto.hints.HintId;
import com.vk.dto.profile.Donut;
import com.vk.dto.stories.entities.OrdData;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.lbf;
import xsna.mjf;
import xsna.qef;
import xsna.ugf;

/* compiled from: ClipsUploadVkFeaturesActor.kt */
/* loaded from: classes17.dex */
public final class jlf extends al50<ClipsUploadState, lbf.c, Object, mjf, ugf, qef> {
    public final sj50<ClipsUploadState, Object, mjf, ugf, qef> c;
    public final kwo d;
    public final h7v e;
    public final q7v0 f;

    public jlf(sj50<ClipsUploadState, Object, mjf, ugf, qef> sj50Var, kwo kwoVar, h7v h7vVar, q7v0 q7v0Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = kwoVar;
        this.e = h7vVar;
        this.f = q7v0Var;
    }

    @Override // xsna.al50, xsna.qj50
    public final boolean i(lj50 lj50Var) {
        return this.b.getCurrentState() instanceof ClipsUploadState.Loaded;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107, types: [xsna.ugf$i$e] */
    /* JADX WARN: Type inference failed for: r1v108, types: [xsna.ugf$i$c] */
    /* JADX WARN: Type inference failed for: r1v109, types: [xsna.ugf$i$b] */
    /* JADX WARN: Type inference failed for: r1v111, types: [xsna.ugf$i$a] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.lang.Object] */
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        ugf.i.j jVar;
        GroupVkTicketDto groupVkTicketDto;
        String url;
        Donut donut;
        lbf.c cVar = (lbf.c) lj50Var;
        sj50 sj50Var = this.b;
        lm50 currentState = sj50Var.getCurrentState();
        GeoLocation geoLocation = null;
        r5 = null;
        r5 = null;
        ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = null;
        ClipsUploadState.Loaded loaded = currentState instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState : null;
        if (loaded == null) {
            return;
        }
        UserId userId = loaded.f;
        ClipsUploadDataInternal clipsUploadDataInternal = loaded.b;
        if (cVar instanceof lbf.c.u) {
            e(ugf.i.C3805i.a);
            return;
        }
        if (cVar instanceof lbf.c.i) {
            lbf.c.i iVar = (lbf.c.i) cVar;
            if (iVar instanceof lbf.c.i.a) {
                e(new ugf.d.b(((lbf.c.i.a) iVar).b));
                return;
            }
            boolean f = epx.f(iVar, lbf.c.i.b.b);
            qef.q qVar = qef.q.a;
            if (f) {
                c(qVar);
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            if (epx.f(iVar, lbf.c.i.C3253c.b)) {
                e(ugf.d.a.a);
                return;
            }
            if (!(iVar instanceof lbf.c.i.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator it = ((ClipsUploadState.Loaded) sj50Var.getCurrentState()).g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ?? next = it.next();
                if (((GeoLocation) next).b == ((lbf.c.i.d) iVar).b) {
                    geoLocation = next;
                    break;
                }
            }
            GeoLocation geoLocation2 = geoLocation;
            if (geoLocation2 != null) {
                e(new ugf.d.b(geoLocation2));
                return;
            } else {
                c(qVar);
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
        }
        if (cVar instanceof lbf.c.s) {
            lbf.c.s sVar = (lbf.c.s) cVar;
            lm50 currentState2 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded2 = currentState2 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState2 : null;
            if (loaded2 == null) {
                return;
            }
            ClipsUploadDataInternal clipsUploadDataInternal2 = loaded2.b;
            if (!(sVar instanceof lbf.c.s.a)) {
                if (!(sVar instanceof lbf.c.s.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a(new mjf.a.p(((lbf.c.s.b) sVar).b));
                return;
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData = clipsUploadDataInternal2.e;
            EasyPromoteData easyPromoteData = clipsUploadAuthorRelatedData.k.b;
            if (easyPromoteData != null && easyPromoteData.d) {
                c(new qef.a0(EasyPromoteUnavalabilityReason.PRIVACY, EasyPromoteUnavailabilityTarget.EXTERNAL));
                return;
            } else if (((lbf.c.s.a) sVar).b || clipsUploadAuthorRelatedData.d.b.b.isEmpty()) {
                c(new qef.v(clipsUploadDataInternal2.e.c.b.b));
                return;
            } else {
                c(qef.y.a);
                return;
            }
        }
        if (cVar instanceof lbf.c.k) {
            lbf.c.k kVar = (lbf.c.k) cVar;
            lm50 currentState3 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded3 = currentState3 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState3 : null;
            if (loaded3 == null) {
                return;
            }
            boolean f2 = epx.f(kVar, lbf.c.k.a.b);
            qef.b0 b0Var = qef.b0.a;
            if (f2) {
                ConditionalFeature<ClipsLinkAttachment> conditionalFeature = loaded3.b.e.b;
                if (conditionalFeature.c == ConditionalFeature.State.SHOWN) {
                    c(new qef.r(conditionalFeature.b));
                    return;
                } else {
                    c(b0Var);
                    return;
                }
            }
            if (epx.f(kVar, lbf.c.k.b.b)) {
                c(b0Var);
                return;
            } else if (epx.f(kVar, lbf.c.k.d.b)) {
                e(new ugf.e.a(null));
                return;
            } else {
                if (!(kVar instanceof lbf.c.k.C3254c)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(new ugf.e.a(((lbf.c.k.C3254c) kVar).b));
                return;
            }
        }
        if (cVar instanceof lbf.c.e) {
            lbf.c.e eVar = (lbf.c.e) cVar;
            lm50 currentState4 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded4 = currentState4 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState4 : null;
            if (loaded4 == null) {
                return;
            }
            UserId userId2 = loaded4.f;
            if (!epx.f(eVar, lbf.c.e.a.b)) {
                if (epx.f(eVar, lbf.c.e.b.b)) {
                    e(new ugf.b.a(EmptyList.b));
                    return;
                } else if (eVar instanceof lbf.c.e.C3252c) {
                    e(new ugf.b.a(((lbf.c.e.C3252c) eVar).b));
                    return;
                } else {
                    if (!epx.f(eVar, lbf.c.e.d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e(ugf.i.d.a);
                    return;
                }
            }
            ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData2 = loaded4.b.e;
            ConditionalFeature<CoauthorsData> conditionalFeature2 = clipsUploadAuthorRelatedData2.d;
            if (conditionalFeature2.c == ConditionalFeature.State.SHOWN) {
                CoauthorsData coauthorsData = conditionalFeature2.b;
                List list = coauthorsData != null ? coauthorsData.b : null;
                if (list == null) {
                    list = EmptyList.b;
                }
                c(new qef.p(list, userId2));
            } else {
                c(new qef.z(userId2, clipsUploadAuthorRelatedData2.c.b));
            }
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (cVar instanceof lbf.c.o) {
            lbf.c.o oVar = (lbf.c.o) cVar;
            lm50 currentState5 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded5 = currentState5 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState5 : null;
            if (loaded5 == null) {
                return;
            }
            if (epx.f(oVar, lbf.c.o.a.b)) {
                ClipsDraftablePlaylist clipsDraftablePlaylist = loaded5.b.e.e.b;
                c(new qef.u(loaded5.f, clipsDraftablePlaylist != null ? Integer.valueOf(clipsDraftablePlaylist.b) : null));
                s3q0 s3q0Var4 = s3q0.a;
                return;
            } else if (epx.f(oVar, lbf.c.o.b.b)) {
                e(new ugf.h.f(null));
                return;
            } else {
                if (!(oVar instanceof lbf.c.o.C3256c)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(new ugf.h.f(((lbf.c.o.C3256c) oVar).b));
                return;
            }
        }
        boolean z = cVar instanceof lbf.c.a;
        int i = 7;
        q7v0 q7v0Var = this.f;
        if (z) {
            lbf.c.a aVar = (lbf.c.a) cVar;
            lm50 currentState6 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded6 = currentState6 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState6 : null;
            if (loaded6 == null) {
                return;
            }
            ClipsUploadDataInternal clipsUploadDataInternal3 = loaded6.b;
            if (epx.f(aVar, lbf.c.a.C3249a.b)) {
                Group b = hif.b(loaded6, loaded6.f);
                UserId userId3 = loaded6.f;
                ClipInvolvementActionButton<?> clipInvolvementActionButton = clipsUploadDataInternal3.e.f.b;
                boolean z2 = clipsUploadDataInternal3.d.n;
                ClipsUploadUnmodifiableData clipsUploadUnmodifiableData = clipsUploadDataInternal3.c;
                int i2 = clipsUploadUnmodifiableData.b;
                String str = clipsUploadUnmodifiableData.c;
                boolean z3 = b != null && b.r0;
                boolean z4 = b != null && b.q0;
                boolean z5 = b != null && b.b0;
                boolean z6 = (b == null || (donut = b.Q) == null || !donut.d()) ? false : true;
                if (b != null && (groupVkTicketDto = b.R) != null && (url = groupVkTicketDto.getUrl()) != null) {
                    vkTicketActionState = new ClipsInvolvementAttachesState.VkTicketActionState(url);
                }
                c(new qef.f(userId3, clipInvolvementActionButton, z2, new ClipsInvolvementAttachesState(z3, z4, z5, z6, vkTicketActionState), str, i2));
                s3q0 s3q0Var5 = s3q0.a;
                return;
            }
            if (epx.f(aVar, lbf.c.a.f.b)) {
                ClipsUploadAuthorRelatedData clipsUploadAuthorRelatedData3 = clipsUploadDataInternal3.e;
                e(new ugf.h.a(clipsUploadAuthorRelatedData3.f.b == null ? clipsUploadAuthorRelatedData3.g : null));
                return;
            }
            if (epx.f(aVar, lbf.c.a.d.b)) {
                e(new ugf.h.a(null));
                return;
            }
            if (epx.f(aVar, lbf.c.a.b.b)) {
                q7v0Var.c(new zv(6, q7v0Var, this));
                s3q0 s3q0Var6 = s3q0.a;
                return;
            }
            if (epx.f(aVar, lbf.c.a.C3250c.b)) {
                e(ugf.h.c.a);
                return;
            }
            if (aVar instanceof lbf.c.a.e) {
                e(new ugf.h.a(((lbf.c.a.e) aVar).b));
                return;
            }
            if (!epx.f(aVar, lbf.c.a.h.b)) {
                if (epx.f(aVar, lbf.c.a.g.b)) {
                    q7v0Var.c(new p5(8, q7v0Var, this));
                    s3q0 s3q0Var7 = s3q0.a;
                    return;
                } else {
                    if (!epx.f(aVar, lbf.c.a.i.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q7v0Var.c(new defpackage.u(i, q7v0Var, this));
                    s3q0 s3q0Var8 = s3q0.a;
                    return;
                }
            }
            ClipInvolvementActionButton<?> clipInvolvementActionButton2 = clipsUploadDataInternal3.e.f.b;
            if (clipInvolvementActionButton2 == null) {
                return;
            }
            if (clipInvolvementActionButton2.equals(ClipInvolvementActionButton.MessageToBusinessCommunity.e)) {
                jVar = ugf.i.a.a;
            } else if (clipInvolvementActionButton2.equals(ClipInvolvementActionButton.OnlineBooking.e)) {
                jVar = ugf.i.b.a;
            } else if (clipInvolvementActionButton2.equals(ClipInvolvementActionButton.OpenChannel.e)) {
                jVar = ugf.i.c.a;
            } else if (clipInvolvementActionButton2 instanceof ClipInvolvementActionButton.DonutLevel) {
                jVar = ugf.i.e.a;
            } else {
                if (!(clipInvolvementActionButton2 instanceof ClipInvolvementActionButton.VkTicket)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar = ugf.i.j.a;
            }
            e(jVar);
            return;
        }
        if (cVar.equals(lbf.c.p.b)) {
            if (clipsUploadDataInternal.e.i.c) {
                e(new ugf.g.h(!r1.b));
                return;
            }
            return;
        }
        boolean z7 = cVar instanceof lbf.c.r;
        h7v h7vVar = this.e;
        if (z7) {
            h7vVar.b(((lbf.c.r) cVar).b ? HintId.USER_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId() : HintId.COMMUNITY_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId());
            return;
        }
        if (cVar instanceof lbf.c.q) {
            e(new ugf.g.i(h7vVar.p(HintId.COMMUNITY_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId()) == null, h7vVar.p(HintId.USER_PROFILE_MAIN_WALL_CLIP_POSTING_ON_MAIN_OPTION_ONBOARDING.getId()) == null));
            return;
        }
        if (cVar.equals(lbf.c.h.b)) {
            e(new ugf.g.e(!clipsUploadDataInternal.d.d));
            return;
        }
        if (cVar.equals(lbf.c.d.b)) {
            e(new ugf.g.d(!clipsUploadDataInternal.d.e));
            return;
        }
        if (cVar.equals(kbf.b)) {
            e(new ugf.g.m(!clipsUploadDataInternal.d.g.b));
            return;
        }
        if (cVar instanceof jbf) {
            c(new qef.g(((jbf) cVar).b));
            return;
        }
        if (cVar instanceof lbf.c.l) {
            lbf.c.l lVar = (lbf.c.l) cVar;
            lm50 currentState7 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded7 = currentState7 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState7 : null;
            if (loaded7 == null) {
                return;
            }
            UserId userId4 = loaded7.f;
            ClipsUploadDataInternal clipsUploadDataInternal4 = loaded7.b;
            if (!lVar.equals(lbf.c.l.a.b)) {
                if (lVar instanceof lbf.c.l.b) {
                    e(new ugf.h.b(((lbf.c.l.b) lVar).b));
                    return;
                } else {
                    if (!(lVar instanceof lbf.c.l.C3255c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q7v0Var.c(new ig1(i, q7v0Var, this));
                    return;
                }
            }
            List<Good> list2 = clipsUploadDataInternal4.d.l.b.b;
            if (list2.isEmpty()) {
                if (!fkq0.b(userId4)) {
                    userId4 = null;
                }
                c(new qef.i(userId4 != null ? fkq0.a(userId4) : null, Integer.valueOf(clipsUploadDataInternal4.c.b)));
                return;
            } else {
                if (!fkq0.b(userId4)) {
                    userId4 = null;
                }
                c(new qef.h(list2, userId4 != null ? fkq0.a(userId4) : null));
                return;
            }
        }
        if (cVar instanceof lbf.c.g) {
            lbf.c.g gVar = (lbf.c.g) cVar;
            lm50 currentState8 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded8 = currentState8 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState8 : null;
            if (loaded8 == null) {
                return;
            }
            if (gVar instanceof lbf.c.g.b) {
                e(new ugf.h.g(((lbf.c.g.b) gVar).b));
                return;
            }
            if (!gVar.equals(lbf.c.g.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            EasyPromoteData easyPromoteData2 = loaded8.b.e.k.b;
            if (easyPromoteData2 == null || !easyPromoteData2.d) {
                return;
            }
            c(new qef.a0(EasyPromoteUnavalabilityReason.PUBLICATION_DATE, EasyPromoteUnavailabilityTarget.EXTERNAL));
            return;
        }
        if (cVar instanceof lbf.c.n) {
            lbf.c.n nVar = (lbf.c.n) cVar;
            lm50 currentState9 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded9 = currentState9 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState9 : null;
            if (loaded9 == null) {
                return;
            }
            ClipsUploadDataInternal clipsUploadDataInternal5 = loaded9.b;
            if (nVar.equals(lbf.c.n.a.b)) {
                c(new qef.t(clipsUploadDataInternal5.d.i));
                return;
            } else {
                if (!(nVar instanceof lbf.c.n.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrdData ordData = clipsUploadDataInternal5.d.i;
                OrdData ordData2 = ((lbf.c.n.b) nVar).b;
                c(new qef.d0((ordData == null && ordData2.b) || !(ordData == null || ordData.b || !ordData2.b), (ordData == null || ordData2.b) ? false : true));
                e(new ugf.h.e(ordData2.b ? ordData2 : null));
                return;
            }
        }
        if (cVar instanceof lbf.c.v) {
            lbf.c.v vVar = (lbf.c.v) cVar;
            lm50 currentState10 = sj50Var.getCurrentState();
            ClipsUploadState.Loaded loaded10 = currentState10 instanceof ClipsUploadState.Loaded ? (ClipsUploadState.Loaded) currentState10 : null;
            if (loaded10 == null) {
                return;
            }
            if (vVar.equals(lbf.c.v.a.b)) {
                c(new qef.w(loaded10.b.e.h.b, loaded10.f));
                s3q0 s3q0Var9 = s3q0.a;
                return;
            }
            if (vVar.equals(lbf.c.v.b.b)) {
                e(new ugf.h.i(null));
                return;
            }
            if (!(vVar instanceof lbf.c.v.C3257c)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsVideoAttachmentData clipsVideoAttachmentData = ((lbf.c.v.C3257c) vVar).b;
            String str2 = clipsVideoAttachmentData.g;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = clipsVideoAttachmentData.f;
            e(new ugf.h.i(new ClipAttachedVideoInfo(str2, str3 != null ? str3 : "", clipsVideoAttachmentData.e, clipsVideoAttachmentData.h)));
            return;
        }
        if (cVar instanceof lbf.c.j) {
            c(new qef.g(((lbf.c.j) cVar).b));
            return;
        }
        if (cVar.equals(lbf.c.m.b)) {
            c(new qef.k(userId));
            return;
        }
        if (cVar instanceof hbf) {
            EasyPromoteData easyPromoteData3 = clipsUploadDataInternal.e.k.b;
            EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = easyPromoteData3 != null ? easyPromoteData3.e : null;
            if (easyPromoteUnavalabilityReason != null) {
                c(new qef.a0(easyPromoteUnavalabilityReason, EasyPromoteUnavailabilityTarget.EASY_PROMOTE));
                return;
            }
            boolean z8 = (easyPromoteData3 == null || easyPromoteData3.d) ? false : true;
            e(new ugf.c.a(z8, fkq0.b(userId) ? ConditionalFeature.State.HIDDEN : z8 ? ConditionalFeature.State.DISABLED : ConditionalFeature.State.SHOWN, !clipsUploadDataInternal.f.contains(ClipUploadScreenFeature$DelayedPublication.b) ? ConditionalNumber.State.HIDDEN : z8 ? ConditionalNumber.State.DISABLED : ConditionalNumber.State.SHOWN));
            kwo kwoVar = this.d;
            EasyPromoteSettings b2 = kwoVar.b();
            kwoVar.a(new EasyPromoteSettings(b2.b, b2.c, b2.d, z8));
            return;
        }
        if (cVar instanceof gbf) {
            c(qef.d.a);
            return;
        }
        if (cVar instanceof fbf) {
            fbf fbfVar = (fbf) cVar;
            e(new ugf.c.b(fbfVar.b, fbfVar.c));
            return;
        }
        if (cVar instanceof ibf) {
            e(ugf.i.f.a);
            return;
        }
        if (cVar instanceof lbf.c.t) {
            e(ugf.i.h.a);
            return;
        }
        if (cVar.equals(lbf.c.b.b)) {
            e(new ugf.g.a(!clipsUploadDataInternal.e.q.b.b));
            return;
        }
        if (cVar.equals(lbf.c.C3251c.b)) {
            q7v0Var.c(new qc(q7v0Var, 22));
            return;
        }
        if (!(cVar instanceof lbf.c.f)) {
            throw new NoWhenBranchMatchedException();
        }
        lbf.c.f fVar = (lbf.c.f) cVar;
        if (fVar.equals(lbf.c.f.b.b)) {
            c(qef.c.a);
        } else {
            if (!(fVar instanceof lbf.c.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(new mjf.a.C3346a(null));
        }
    }
}
