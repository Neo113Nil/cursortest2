package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.SdkOriginalSoundStatus;
import com.vk.clips.sdk.shared.api.deps.dtos.SdkGeoPlace;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.mih0;
import xsna.njh0;
import xsna.qvq;
import xsna.t0d;
import xsna.t1d;
import xsna.wk50;
import xsna.xp50;
import xsna.yed;
import xsna.z2d;

/* compiled from: BadgesActionApplier.kt */
/* loaded from: classes17.dex */
public final class hz5 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public final ClipFeedTab a;
    public final pih0 b;
    public final wj50<t0d> c;
    public final wj50<t1d> d;
    public final wj50<ClipItemTooltipEvent> e;
    public final xne f;
    public final izs<qvq, s3q0> g;
    public final vdd h;

    public hz5(ClipFeedTab clipFeedTab, pih0 pih0Var, f4z f4zVar, f4z f4zVar2, f4z f4zVar3, xne xneVar, izs izsVar, vdd vddVar) {
        this.a = clipFeedTab;
        this.b = pih0Var;
        this.c = f4zVar;
        this.d = f4zVar2;
        this.e = f4zVar3;
        this.f = xneVar;
        this.g = izsVar;
        this.h = vddVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        Pair pair;
        yed.a b;
        SdkGeoPlace sdkGeoPlace;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if ((z2dVar instanceof z2d.a) && (clipItemAction instanceof ClipItemAction.d)) {
            ClipItemAction.d dVar = (ClipItemAction.d) clipItemAction;
            boolean z = dVar instanceof ClipItemAction.d.q;
            ClipFeedTab clipFeedTab = this.a;
            vdd vddVar = this.h;
            boolean z2 = true;
            if (z) {
                z2d.a aVar2 = (z2d.a) z2dVar;
                boolean z3 = ((ClipItemAction.d.q) clipItemAction).b;
                if (!z3) {
                    if (z3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    if (aVar2.x) {
                        m0d m0dVar = aVar2.b;
                        mih0.q qVar = m0dVar.d.b;
                        if (qVar != 0) {
                            mih0.o oVar = qVar.j;
                            if (((oVar == null || (oVar instanceof mih0.o.b)) ? qVar : null) != null) {
                                vddVar.b(clipFeedTab, m0dVar.a.a1());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            if (dVar instanceof ClipItemAction.d.u) {
                z2d.a aVar3 = (z2d.a) z2dVar;
                boolean z4 = ((ClipItemAction.d.u) clipItemAction).b;
                if (!z4) {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    if (aVar3.x) {
                        m0d m0dVar2 = aVar3.b;
                        mih0.i iVar = m0dVar2.e.d;
                        if (iVar != 0) {
                            mih0.o oVar2 = iVar.l;
                            if ((((iVar.s && m0dVar2.d.b == null && oVar2 == null) || (oVar2 instanceof mih0.o.b)) ? iVar : null) != null) {
                                vddVar.b(clipFeedTab, m0dVar2.a.a1());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            boolean z5 = dVar instanceof ClipItemAction.d.r;
            wj50<t1d> wj50Var = this.d;
            if (z5) {
                m0d m0dVar3 = ((z2d.a) z2dVar).b;
                SdkClipVideoFile sdkClipVideoFile = m0dVar3.a;
                SdkClipVideoFile b2 = m0dVar3.b();
                if (sdkClipVideoFile.t0()) {
                    wj50Var.b(new t1d.s(b2));
                    return;
                }
                List<njh0> G1 = sdkClipVideoFile.G1();
                wj50<t0d> wj50Var2 = this.c;
                if (G1 != null) {
                    List<njh0> list = G1;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            t0d.k.e.a aVar4 = ((njh0) it.next()) instanceof njh0.a ? new t0d.k.e.a(b2) : null;
                            if (aVar4 != null) {
                                wj50Var2.b(aVar4);
                                return;
                            }
                        }
                    }
                }
                wj50Var2.b(t0d.k.e.b.a);
                return;
            }
            if (dVar instanceof ClipItemAction.d.C0653d) {
                mih0.c cVar = ((z2d.a) z2dVar).b.e.h;
                if (cVar == null || (sdkGeoPlace = cVar.i) == null) {
                    return;
                }
                wj50Var.b(new t1d.k(sdkGeoPlace));
                return;
            }
            boolean z6 = dVar instanceof ClipItemAction.d.b;
            pih0 pih0Var = this.b;
            if (z6) {
                pih0Var.o2(new SdkClipViewerClick.d(((z2d.a) z2dVar).b.b()));
                wj50Var.b(new t1d.i(((ClipItemAction.d.b) clipItemAction).b));
                aVar.a(ClipItemAction.Tooltip.Hide.IMMEDIATE);
                return;
            }
            if (dVar instanceof ClipItemAction.d.k) {
                wj50Var.b(new t1d.f(((z2d.a) z2dVar).b.b()));
                return;
            }
            if (dVar instanceof ClipItemAction.d.g) {
                wj50Var.b(new t1d.d(((ClipItemAction.d.g) clipItemAction).b));
                return;
            }
            if (dVar instanceof ClipItemAction.d.h) {
                wj50Var.b(new t1d.d0(((ClipItemAction.d.h) clipItemAction).b));
                return;
            }
            if (dVar instanceof ClipItemAction.d.a) {
                wj50Var.b(new t1d.d(((ClipItemAction.d.a) clipItemAction).b));
                return;
            }
            if (dVar instanceof ClipItemAction.d.c) {
                SdkDuetMeta oa = ((z2d.a) z2dVar).b.a.oa();
                if (oa == null) {
                    return;
                }
                String str = oa.d;
                String str2 = oa.e;
                if (str != null && str2 != null) {
                    r9 = zr.a(str, BundleUtil.UNDERLINE_TAG, str2);
                }
                if (r9 == null) {
                    return;
                }
                wj50Var.b(new t1d.e(r9));
                return;
            }
            if (dVar instanceof ClipItemAction.d.i) {
                wj50Var.b(new t1d.b0(((ClipItemAction.d.i) clipItemAction).b));
                aVar.a(ClipItemAction.Tooltip.Hide.IMMEDIATE);
                return;
            }
            boolean z7 = dVar instanceof ClipItemAction.d.p;
            izs<qvq, s3q0> izsVar = this.g;
            if (z7) {
                izsVar.invoke(new qvq.m.b(((ClipItemAction.d.p) clipItemAction).b, ((z2d.a) z2dVar).b.b()));
                return;
            }
            if (dVar instanceof ClipItemAction.d.o) {
                izsVar.invoke(new qvq.m.a(((ClipItemAction.d.o) clipItemAction).b, ((z2d.a) z2dVar).b.b()));
                return;
            }
            if (dVar instanceof ClipItemAction.d.e) {
                ClipItemAction.d.e eVar = (ClipItemAction.d.e) clipItemAction;
                wj50Var.b(new t1d.b0(j5g.u0(eVar.c, Collections.singletonList(eVar.b))));
                aVar.a(ClipItemAction.Tooltip.Hide.IMMEDIATE);
                return;
            }
            if (dVar instanceof ClipItemAction.d.j) {
                z2d.a aVar5 = (z2d.a) z2dVar;
                wp50 wp50Var = aVar5.B;
                m0d m0dVar4 = aVar5.b;
                if (wp50Var != null) {
                    wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.AUDIO_CLICK));
                }
                SdkClipVideoFile sdkClipVideoFile2 = m0dVar4.a;
                SdkMusicTrack V = sdkClipVideoFile2.V();
                SdkOriginalSoundStatus y8 = sdkClipVideoFile2.y8();
                boolean a = this.f.a(sdkClipVideoFile2);
                if (y8 != SdkOriginalSoundStatus.NONE && y8 != SdkOriginalSoundStatus.APPROVED) {
                    z2 = false;
                }
                if (a && !z2) {
                    wj50Var.b(new t1d.q(y8));
                    return;
                }
                if (sdkClipVideoFile2.k0() || V == null || !z2) {
                    this.e.b(ClipItemTooltipEvent.a.b);
                    return;
                } else {
                    pih0Var.o2(new SdkClipViewerClick.r(m0dVar4.b()));
                    wj50Var.b(new t1d.o(V, sdkClipVideoFile2.a5()));
                    return;
                }
            }
            if (dVar instanceof ClipItemAction.d.s) {
                aVar.b(new ClipItemPatch.n(((z2d.a) z2dVar).i.a));
                return;
            }
            if (dVar instanceof ClipItemAction.d.t) {
                z2d.a aVar6 = (z2d.a) z2dVar;
                m0d m0dVar5 = aVar6.b;
                umc umcVar = aVar6.i;
                SdkClipVideoFile sdkClipVideoFile3 = m0dVar5.a;
                ArrayList Ma = sdkClipVideoFile3.Ma();
                boolean z8 = Ma == null || Ma.isEmpty();
                boolean z9 = !z8;
                ArrayList w6 = sdkClipVideoFile3.w6();
                if (w6 != null) {
                    w6.isEmpty();
                }
                if (z8) {
                    pair = new Pair(null, null);
                } else {
                    ArrayList Ma2 = sdkClipVideoFile3.Ma();
                    oih0 oih0Var = Ma2 != null ? (oih0) j5g.a0(Ma2) : null;
                    String a2 = oih0Var != null ? oih0Var.a() : null;
                    if (oih0Var != null && (b = oih0Var.b()) != null) {
                        r9 = b.a;
                    }
                    pair = new Pair(a2, r9);
                }
                pih0Var.o2(new SdkClipViewerClick.q(m0dVar5.b(), !umcVar.a, umcVar.b, umcVar.c, z9, (String) pair.d(), (String) pair.g()));
                aVar.a(new ClipItemAction.c0.c(!umcVar.a));
                return;
            }
            if (dVar instanceof ClipItemAction.d.v) {
                z2d.a aVar7 = (z2d.a) z2dVar;
                m0d m0dVar6 = aVar7.b;
                pih0Var.o2(new SdkClipViewerClick.t(m0dVar6.b()));
                wj50Var.b(new t1d.w(m0dVar6.b(), aVar7.g.d));
                return;
            }
            if (dVar instanceof ClipItemAction.d.x) {
                pih0Var.ai(new ClipViewerAnalyticsEvent.i(((z2d.a) z2dVar).b.b()));
                return;
            }
            if (dVar instanceof ClipItemAction.d.w) {
                aVar.b(ClipItemPatch.p.b);
                return;
            }
            if (dVar instanceof ClipItemAction.d.f) {
                pih0Var.o2(new SdkClipViewerClick.k(((z2d.a) z2dVar).b.b()));
                CharSequence charSequence = ((ClipItemAction.d.f) clipItemAction).b;
                if (charSequence != null) {
                    wj50Var.b(new t1d.l(charSequence.toString()));
                    return;
                }
                return;
            }
            if (dVar instanceof ClipItemAction.d.m) {
                ClipItemAction.d.m mVar = (ClipItemAction.d.m) clipItemAction;
                pih0Var.ai(new ClipViewerAnalyticsEvent.f(((z2d.a) z2dVar).b.b()));
                wj50Var.b(new t1d.p(mVar.b, mVar.c));
            } else if (dVar instanceof ClipItemAction.d.n) {
                aVar.b(ClipItemPatch.m.b);
            } else {
                if (!(dVar instanceof ClipItemAction.d.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                pih0Var.ai(new ClipViewerAnalyticsEvent.g(((z2d.a) z2dVar).b.b()));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
