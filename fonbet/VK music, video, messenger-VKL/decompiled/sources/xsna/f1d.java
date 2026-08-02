package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionValue;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.DataLoadState;
import com.vk.clips.sdk.shared.item.clip.overlay.default_impl.mappers.helpers.InlineNpsMappingHelper$RenderType;
import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsBannerCompanionConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsButtonToVideoConfig;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.a26;
import xsna.jvm0;
import xsna.lw;
import xsna.m2m;
import xsna.mih0;
import xsna.n0x;
import xsna.t80;
import xsna.ti50;
import xsna.tlo0;
import xsna.uu;
import xsna.zu;

/* compiled from: ClipItemMainOverlayMapper.kt */
/* loaded from: classes17.dex */
public final class f1d extends oy8<mf00, MainOverlayState> {
    public final njd b;
    public final jlh0 c;
    public final ClipFeedTab d;
    public final xne e;
    public final yof f;
    public final lf00 g;
    public final qnd h;
    public final yu i;
    public final c590 j;

    public f1d(njd njdVar, jlh0 jlh0Var, ClipFeedTab clipFeedTab, xne xneVar, yof yofVar, lf00 lf00Var, qnd qndVar) {
        this.b = njdVar;
        this.c = jlh0Var;
        this.d = clipFeedTab;
        this.e = xneVar;
        this.f = yofVar;
        this.g = lf00Var;
        this.h = qndVar;
        this.i = new yu(yofVar, false);
        this.j = new c590(lf00Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0802 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x083b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    @Override // xsna.oy8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MainOverlayState b(mf00 mf00Var) {
        boolean z;
        j7e j7eVar;
        String str;
        String str2;
        String str3;
        boolean z2;
        MainOverlayState.h hVar;
        String str4;
        boolean z3;
        yof yofVar;
        boolean z4;
        yof yofVar2;
        m2m m2mVar;
        String j1;
        DescriptionViewState bVar;
        DescriptionViewState descriptionViewState;
        MainOverlayState.f fVar;
        t80 t80Var;
        MainOverlayState.f fVar2;
        DescriptionViewState descriptionViewState2;
        SdkClipActivity sdkClipActivity;
        x590 x590Var;
        MainOverlayState.b bVar2;
        mih0.j jVar;
        mih0.q qVar;
        int i;
        MainOverlayState.g gVar;
        int size;
        Pair pair;
        mih0.n nVar;
        boolean z5;
        mih0.p pVar;
        mih0.k g;
        mih0.m a;
        mih0.l a2;
        mih0.i iVar;
        mih0.d<mih0.a> dVar;
        mih0.c cVar;
        mih0.d<mih0.f> dVar2;
        mih0.d<mih0.f> dVar3;
        mih0.b bVar3;
        lle W;
        ArrayList<mih0> arrayList;
        mf00 mf00Var2;
        rpp0 rpp0Var;
        int i2;
        int i3;
        boolean z6;
        SdkActionLink m1;
        zu.a aVar;
        UserId userId;
        n0x n0xVar;
        boolean z7;
        InlineNpsMappingHelper$RenderType inlineNpsMappingHelper$RenderType;
        boolean z8;
        MainOverlayState.e eVar;
        String str5;
        boolean z9;
        a26 aVar2;
        a26 bVar4;
        boolean z10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        SdkClipActivities d;
        Object obj;
        mf00 mf00Var3 = mf00Var;
        mfj0 mfj0Var = mf00Var3.d;
        umc umcVar = mf00Var3.f;
        OwnerRightState ownerRightState = mf00Var3.m;
        rpp0 rpp0Var2 = mf00Var3.q;
        m0d m0dVar = mf00Var3.b;
        if (!mf00Var3.a) {
            return new MainOverlayState.d(m0dVar.b);
        }
        String str6 = m0dVar.b;
        ArrayList arrayList7 = m0dVar.h;
        j7e j7eVar2 = m0dVar.e;
        SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
        yof yofVar3 = this.f;
        boolean a3 = yofVar3.y() ? this.e.a(sdkClipVideoFile) : true;
        ClipFeedTab clipFeedTab = this.d;
        boolean z11 = ((clipFeedTab instanceof ClipFeedTab.LikedClips) || (clipFeedTab instanceof ClipFeedTab.FavoriteFolder)) ? false : true;
        if (!arrayList7.isEmpty()) {
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                if (((SdkCoOwnerItem) it.next()).d) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        MainOverlayState.h hVar2 = new MainOverlayState.h(sdkClipVideoFile, a3, (ownerRightState.h() || !z11 || z) ? false : true);
        SdkMusicTrack V = sdkClipVideoFile.V();
        if (V == null || sdkClipVideoFile.k0()) {
            V = null;
        }
        String P = sdkClipVideoFile.P();
        CharSequence S6 = sdkClipVideoFile.S6();
        boolean z12 = (V == null || (V.j == null && epx.f(P, S6 != null ? S6.toString() : null))) ? false : true;
        SdkOwner s = sdkClipVideoFile.s();
        String P2 = sdkClipVideoFile.P();
        if (P2 == null) {
            P2 = "";
        }
        e590 e590Var = new e590(sdkClipVideoFile.M0());
        if (V != null) {
            StringBuilder sb = new StringBuilder();
            j7eVar = j7eVar2;
            sb.append((Object) sdkClipVideoFile.L5());
            sb.append(' ');
            String str7 = V.h;
            if (str7 == null) {
                str7 = "";
            }
            sb.append(str7);
            str = drm0.p0(sb.toString()).toString();
        } else {
            j7eVar = j7eVar2;
            str = null;
        }
        CharSequence S62 = sdkClipVideoFile.S6();
        if (S62 == null || (str2 = S62.toString()) == null || !z12 || drm0.N(str2)) {
            str2 = null;
        }
        if (V != null) {
            str3 = str;
            z2 = true;
            if (V.k) {
                hVar = hVar2;
                str4 = P2;
                z3 = true;
                if ((V == null ? V.i : null) == null) {
                    yofVar = yofVar3;
                    z4 = z2;
                } else {
                    yofVar = yofVar3;
                    z4 = false;
                }
                MainOverlayState.h hVar3 = hVar;
                j7e j7eVar3 = j7eVar;
                yofVar2 = yofVar;
                x590 a4 = this.j.a(new g590(arrayList7, s, str4, e590Var, false, str3, str2, z3, z4));
                boolean U = sdkClipVideoFile.U();
                boolean isEmpty = arrayList7.isEmpty();
                MainOverlayState.PublicationDateState visible = (!ownerRightState.i() || ownerRightState.h() || ownerRightState == OwnerRightState.CLIP_COOWNER) ? new MainOverlayState.PublicationDateState.Visible((String) ((izs) this.g.b).invoke(sdkClipVideoFile), isEmpty ? MainOverlayState.PublicationDateState.Visible.Alignment.Vertical : MainOverlayState.PublicationDateState.Visible.Alignment.Horizontal) : MainOverlayState.PublicationDateState.a.a;
                boolean z13 = visible instanceof MainOverlayState.PublicationDateState.Visible;
                MainOverlayState.PublicationDateState.Visible visible2 = !z13 ? (MainOverlayState.PublicationDateState.Visible) visible : null;
                MainOverlayState.PublicationDateState.Visible.Alignment alignment = visible2 == null ? visible2.b : null;
                boolean isEmpty2 = arrayList7.isEmpty();
                SdkActionLink m12 = sdkClipVideoFile.m1();
                boolean z14 = z2;
                boolean z15 = (sdkClipVideoFile.h1() || !isEmpty2 || epx.f(m12 == null ? m12.e : null, "link_community_with_subscribe") || dgd.d(sdkClipVideoFile) || z13 || dgd.e(sdkClipVideoFile)) ? false : z14;
                jvm0 bVar5 = (z15 || !U) ? (z15 || U) ? jvm0.a.a : new jvm0.b(mf00Var3.i) : jvm0.c.a;
                MainOverlayState.g gVar2 = new MainOverlayState.g(visible, bVar5, (alignment != MainOverlayState.PublicationDateState.Visible.Alignment.Horizontal || (bVar5 instanceof jvm0.c)) ? z14 : false);
                m2mVar = m0dVar.f;
                j1 = sdkClipVideoFile.j1();
                if (j1 == null) {
                    j1 = "";
                }
                boolean z16 = mf00Var3.j;
                if (!(m2mVar instanceof m2m.b)) {
                    CharSequence charSequence = ((m2m.b) m2mVar).a;
                    bVar = myc0.f(charSequence) ? new DescriptionViewState.b(charSequence, j1, DescriptionViewState.ExpansionState.STATIC) : DescriptionViewState.a.a;
                } else {
                    if (!(m2mVar instanceof m2m.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = z16 ? new DescriptionViewState.b(((m2m.a) m2mVar).b, j1, DescriptionViewState.ExpansionState.EXPANDED) : new DescriptionViewState.b(((m2m.a) m2mVar).a, j1, DescriptionViewState.ExpansionState.COLLAPSED);
                }
                descriptionViewState = bVar;
                fVar = (m0dVar.c || umcVar.a) ? MainOverlayState.f.a.a : MainOverlayState.f.b.a;
                boolean z17 = (!mf00Var3.g || sdkClipVideoFile.k0()) ? z14 : false;
                ti50.b bVar6 = new ti50.b(!z17 ? R.string.video_accessibility_sound_on : R.string.video_accessibility_sound_off, z17);
                t80Var = m0dVar.j;
                if (t80Var != null || (d = t80Var.d()) == null) {
                    fVar2 = fVar;
                    descriptionViewState2 = descriptionViewState;
                    sdkClipActivity = null;
                } else {
                    Iterator<T> it2 = d.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            fVar2 = fVar;
                            descriptionViewState2 = descriptionViewState;
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        fVar2 = fVar;
                        SdkClipActivity sdkClipActivity2 = (SdkClipActivity) obj;
                        descriptionViewState2 = descriptionViewState;
                        if (!(sdkClipActivity2 instanceof SdkClipActivity.Likes)) {
                            if ((sdkClipActivity2 instanceof SdkClipActivity.Comments) && !((SdkClipActivity.Comments) sdkClipActivity2).b.isEmpty()) {
                                break;
                            }
                            fVar = fVar2;
                            descriptionViewState = descriptionViewState2;
                        } else {
                            if (!((SdkClipActivity.Likes) sdkClipActivity2).b.isEmpty()) {
                                break;
                            }
                            fVar = fVar2;
                            descriptionViewState = descriptionViewState2;
                        }
                    }
                    sdkClipActivity = (SdkClipActivity) obj;
                }
                if (sdkClipActivity instanceof SdkClipActivity.Comments) {
                    x590Var = a4;
                    if (sdkClipActivity instanceof SdkClipActivity.Likes) {
                        ArrayList arrayList8 = new ArrayList(c5g.u(((SdkClipActivity.Likes) sdkClipActivity).b, 10));
                        for (Iterator it3 = r4.iterator(); it3.hasNext(); it3 = it3) {
                            SdkClipActivity.Likes.Like like = (SdkClipActivity.Likes.Like) it3.next();
                            arrayList8.add(new MainOverlayState.b.c.a(like.b, like.c, like.d, like.e, like.f));
                        }
                        bVar2 = new MainOverlayState.b.c(arrayList8, t80Var instanceof t80.a, !t80Var.c());
                    } else {
                        boolean z18 = sdkClipActivity instanceof SdkClipActivity.Unknown;
                        bVar2 = MainOverlayState.b.C0663b.a;
                        if (!z18 && sdkClipActivity != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    SdkClipActivity.Comments.Comment comment = (SdkClipActivity.Comments.Comment) j5g.Y(((SdkClipActivity.Comments) sdkClipActivity).b);
                    x590Var = a4;
                    bVar2 = new MainOverlayState.b.a(comment.b, comment.c, comment.d, comment.f, u11.f(tlo0.Companion, this.h.a(comment.e)), t80Var instanceof t80.a, !t80Var.c());
                }
                h7e h7eVar = m0dVar.d;
                jVar = h7eVar.a;
                qVar = h7eVar.b;
                i = h7eVar.c;
                boolean z19 = mf00Var3.o;
                boolean z20 = rpp0Var2.a;
                ArrayList arrayList9 = new ArrayList();
                if (qVar == null) {
                    mih0.o oVar = qVar.j;
                    if (oVar != null) {
                        gVar = gVar2;
                    } else if (z20) {
                        gVar = gVar2;
                        oVar = new mih0.o.b(new x7g(R.attr.vk_ui_background_contrast_secondary_alpha));
                    } else {
                        gVar = gVar2;
                        oVar = null;
                    }
                    arrayList9.add(new mih0.q(qVar.i, oVar, qVar.k, z19));
                } else {
                    gVar = gVar2;
                }
                if (jVar != null) {
                    arrayList9.add(jVar);
                }
                size = arrayList9.size();
                Collection collection = arrayList9;
                if (size > i) {
                    collection = arrayList9.subList(0, i);
                }
                Collection<mih0> collection2 = collection;
                ArrayList arrayList10 = new ArrayList(c5g.u(collection2, 10));
                for (mih0 mih0Var : collection2) {
                    mih0.d dVar4 = mih0Var instanceof mih0.d ? (mih0.d) mih0Var : null;
                    if (dVar4 != null && (arrayList6 = dVar4.j) != null && arrayList6.size() == z14) {
                        mih0Var = (mih0) j5g.Y(((mih0.d) mih0Var).j);
                    }
                    arrayList10.add(mih0Var);
                    z14 = true;
                }
                MainOverlayState.c bVar7 = arrayList10.isEmpty() ? new MainOverlayState.c.b(arrayList10) : MainOverlayState.c.a.a;
                ArrayList Ma = sdkClipVideoFile.Ma();
                boolean z21 = Ma != null || Ma.isEmpty();
                ArrayList w6 = sdkClipVideoFile.w6();
                boolean z22 = w6 != null || w6.isEmpty();
                boolean c = c(sdkClipVideoFile);
                if (umcVar.a) {
                    pair = new Pair(tq.h(tlo0.Companion, R.string.clip_feed_market_items_hide_title), Integer.valueOf(c ? R.drawable.vk_icon_chevron_up_12 : R.drawable.vk_icon_market_slash_12));
                } else {
                    int i4 = R.string.clip_feed_carousel_attaches_items_title;
                    if (z21 || (z22 && !c)) {
                        if (!z21) {
                            i4 = R.string.clip_feed_vk_ticket_items_title;
                        } else if (!c) {
                            i4 = R.string.clip_feed_market_items_title;
                        }
                    }
                    pair = new Pair(tq.h(tlo0.Companion, i4), Integer.valueOf(c ? R.drawable.vk_icon_chevron_12 : R.drawable.vk_icon_market_12));
                }
                nVar = j7eVar3.b == null ? new mih0.n((tlo0) pair.d(), Integer.valueOf(((Number) pair.g()).intValue()), umcVar.a) : null;
                z5 = mfj0Var.a;
                njd njdVar = this.b;
                if (z5) {
                    pVar = null;
                } else {
                    njdVar.g.getClass();
                    tlo0.f h = tq.h(tlo0.Companion, R.string.clip_feed_more_shops_title);
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_shops_12);
                    if ((185 & 2) != 0) {
                        tlo0.Companion.getClass();
                    }
                    pVar = new mih0.p(h, valueOf, true, mfj0Var.b);
                }
                mih0.k a5 = njdVar.h.a(sdkClipVideoFile);
                g = a5 != null ? null : mih0.k.g(a5, null, false, mf00Var3.e.a, false, 95);
                a = njdVar.a.a(sdkClipVideoFile);
                a2 = njdVar.d.a(sdkClipVideoFile);
                iVar = j7eVar3.d;
                dVar = j7eVar3.g;
                cVar = j7eVar3.h;
                MainOverlayState.c cVar2 = bVar7;
                dVar2 = j7eVar3.i;
                dVar3 = j7eVar3.j;
                bVar3 = j7eVar3.k;
                int i5 = j7eVar3.l;
                boolean z23 = mf00Var3.o;
                W = yofVar2.W();
                boolean z24 = rpp0Var2.b;
                arrayList = new ArrayList();
                if (g == null) {
                    rpp0Var = rpp0Var2;
                    mih0.o oVar2 = g.j;
                    if (oVar2 != null) {
                        mf00Var2 = mf00Var3;
                        i2 = i5;
                    } else if (g.n) {
                        mf00Var2 = mf00Var3;
                        i2 = i5;
                        oVar2 = new mih0.o.c(new x7g(R.attr.vk_ui_background_contrast));
                    } else {
                        mf00Var2 = mf00Var3;
                        i2 = i5;
                        oVar2 = null;
                    }
                    arrayList.add(mih0.k.g(g, oVar2, g.n, false, z23, 57));
                } else {
                    mf00Var2 = mf00Var3;
                    rpp0Var = rpp0Var2;
                    i2 = i5;
                }
                if (W.a && pVar != null) {
                    arrayList.add(pVar);
                }
                if (nVar != null) {
                    arrayList.add(nVar);
                }
                if (iVar != null) {
                    mih0.o oVar3 = iVar.l;
                    arrayList.add(new mih0.i(iVar.i, iVar.j, iVar.k, oVar3 == null ? z24 ? new mih0.o.b(new x7g(R.attr.vk_ui_background_contrast_secondary_alpha)) : null : oVar3, iVar.m, iVar.n, iVar.o, iVar.p, iVar.q, iVar.r, iVar.s, z23));
                }
                if (a != null) {
                    arrayList.add(a);
                }
                if (a2 != null) {
                    arrayList.add(a2);
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
                if (bVar3 != null) {
                    arrayList.add(bVar3);
                }
                if (dVar3 != null) {
                    arrayList.add(dVar3);
                }
                if (dVar2 != null) {
                    arrayList.add(dVar2);
                }
                i3 = i2;
                if (arrayList.size() > i3) {
                    Collection v0 = bVar3 != null ? j5g.v0(bVar3, arrayList.subList(0, i3 - 1)) : arrayList.subList(0, i3);
                    ArrayList arrayList11 = new ArrayList();
                    if (cVar != null) {
                        arrayList11.add(cVar);
                    }
                    if (dVar != null && (arrayList5 = dVar.j) != null && (!arrayList5.isEmpty())) {
                        arrayList11.add(dVar.i);
                        arrayList11.addAll(dVar.k);
                    }
                    if (dVar3 != null && (arrayList4 = dVar3.j) != null && (!arrayList4.isEmpty())) {
                        arrayList11.add(dVar3.i);
                        arrayList11.addAll(dVar3.k);
                    }
                    if (dVar2 != null && (arrayList3 = dVar2.j) != null && (!arrayList3.isEmpty())) {
                        arrayList11.add(dVar2.i);
                        arrayList11.addAll(dVar2.k);
                    }
                    arrayList = j5g.v0(new mih0.h(arrayList11), v0);
                }
                ArrayList arrayList12 = new ArrayList(c5g.u(arrayList, 10));
                for (mih0 mih0Var2 : arrayList) {
                    mih0.d dVar5 = mih0Var2 instanceof mih0.d ? (mih0.d) mih0Var2 : null;
                    if (dVar5 != null && (arrayList2 = dVar5.j) != null && arrayList2.size() == 1) {
                        mih0Var2 = (mih0) j5g.Y(((mih0.d) mih0Var2).j);
                    }
                    arrayList12.add(mih0Var2);
                }
                MainOverlayState.c bVar8 = arrayList12.isEmpty() ? new MainOverlayState.c.b(arrayList12) : MainOverlayState.c.a.a;
                mf00 mf00Var4 = mf00Var2;
                ny nyVar = mf00Var4.k;
                if (yofVar2.P().a()) {
                    SdkActionLink m13 = sdkClipVideoFile.m1();
                    if (epx.f(m13 != null ? m13.e : null, "video")) {
                        z6 = true;
                        SdkActionLink m14 = sdkClipVideoFile.m1();
                        boolean f = epx.f(m14 != null ? m14.e : null, "clips_trend");
                        boolean z25 = (f || (rpp0Var.c && yofVar2.c())) ? false : true;
                        boolean z26 = nyVar.b;
                        uu uuVar = nyVar.c;
                        boolean z27 = !z26 || f;
                        SdkActionLink m15 = !(!z25 || c(sdkClipVideoFile)) ? sdkClipVideoFile.m1() : null;
                        boolean U2 = sdkClipVideoFile.U();
                        m1 = sdkClipVideoFile.m1();
                        if ("clips_user_link".equals(m1 != null ? m1.e : null) || sdkClipVideoFile.j6() == SdkVideoFileModeration.UNDEFINED) {
                            aVar = zu.a.b.a;
                        } else {
                            boolean a6 = this.c.a(sdkClipVideoFile);
                            SdkActionLink m16 = sdkClipVideoFile.m1();
                            if (sdkClipVideoFile.t0()) {
                                SdkActionLink m17 = sdkClipVideoFile.m1();
                                if ("clips_user_link".equals(m17 != null ? m17.e : null)) {
                                    z10 = true;
                                    aVar = new zu.a.C4202a(a6, m16, z10, sdkClipVideoFile.j6());
                                }
                            }
                            z10 = false;
                            aVar = new zu.a.C4202a(a6, m16, z10, sdkClipVideoFile.j6());
                        }
                        zu.a aVar3 = aVar;
                        boolean z28 = nyVar.a;
                        if (z6) {
                            uu.b bVar9 = uuVar instanceof uu.b ? (uu.b) uuVar : null;
                            if (bVar9 == null) {
                                userId = null;
                                uuVar = new uu.b(R.drawable.vk_icon_play_16, null);
                            } else {
                                userId = null;
                                uuVar = bVar9;
                            }
                        } else {
                            userId = null;
                        }
                        MainOverlayState.a aVar4 = new MainOverlayState.a(this.i.a(new zu(m15, U2, aVar3, z28, z27, uuVar, nyVar.d, nyVar.e)), lw.b.a);
                        List<SubtitleRenderItem> list = mf00Var4.l;
                        List<SdkCoOwnerItem> P1 = sdkClipVideoFile.P1();
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj2 : P1) {
                            SdkCoOwnerItem sdkCoOwnerItem = (SdkCoOwnerItem) obj2;
                            if (sdkCoOwnerItem.e == SdkCoOwnerItem.Status.PENDING && sdkCoOwnerItem.d && !epx.f(sdkCoOwnerItem.c.b, UserId.d)) {
                                arrayList13.add(obj2);
                            }
                        }
                        boolean z29 = !arrayList13.isEmpty();
                        n0xVar = mf00Var4.n;
                        z7 = n0xVar instanceof n0x.b;
                        if (z7) {
                            inlineNpsMappingHelper$RenderType = ((n0x.b) n0xVar).c ? InlineNpsMappingHelper$RenderType.View : InlineNpsMappingHelper$RenderType.Overlay;
                        } else if (n0xVar instanceof n0x.c) {
                            inlineNpsMappingHelper$RenderType = ((n0x.c) n0xVar).a ? InlineNpsMappingHelper$RenderType.View : InlineNpsMappingHelper$RenderType.Overlay;
                        } else {
                            if (!(n0xVar instanceof n0x.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            inlineNpsMappingHelper$RenderType = InlineNpsMappingHelper$RenderType.None;
                        }
                        z8 = inlineNpsMappingHelper$RenderType == InlineNpsMappingHelper$RenderType.View;
                        if (z7 || !z8) {
                            eVar = ((n0xVar instanceof n0x.c) || !z8) ? MainOverlayState.e.a.a : MainOverlayState.e.b.C0664b.a;
                        } else {
                            InternalNpsQuestion internalNpsQuestion = ((n0x.b) n0xVar).b;
                            String str8 = internalNpsQuestion.d.b;
                            List<InternalNpsQuestionValue> list2 = internalNpsQuestion.e;
                            ArrayList arrayList14 = new ArrayList(c5g.u(list2, 10));
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList14.add(((InternalNpsQuestionValue) it4.next()).c);
                            }
                            eVar = new MainOverlayState.e.b.a(str8, arrayList14);
                        }
                        ClipsBannerCompanionConfig E = yofVar2.E();
                        ClipsBannerCompanionConfig m = yofVar2.m();
                        t16 t16Var = mf00Var4.p;
                        List<String> list3 = t16Var.d;
                        boolean z30 = (list3 == null && !list3.isEmpty()) || !((str5 = t16Var.e) == null || str5.length() == 0);
                        int i6 = z30 ? E.b : m.b;
                        boolean z31 = !z30 ? m.c != ClipsBannerCompanionConfig.BannerType.CTA : E.c != ClipsBannerCompanionConfig.BannerType.CTA;
                        o16 o16Var = t16Var.f;
                        z9 = t16Var.a;
                        if (z9) {
                            if (z9 && t16Var.b && o16Var != null) {
                                Object obj3 = o16Var != null ? o16Var.a : userId;
                                String str9 = obj3 == null ? "" : obj3;
                                Object obj4 = o16Var != null ? o16Var.b : userId;
                                String str10 = obj4 == null ? "" : obj4;
                                Object obj5 = o16Var != null ? o16Var.c : userId;
                                String str11 = obj5 == null ? "" : obj5;
                                Object obj6 = o16Var != null ? o16Var.d : userId;
                                String str12 = obj6 == null ? "" : obj6;
                                Object obj7 = o16Var != null ? o16Var.e : userId;
                                bVar4 = new a26.c(z31, str9, str12, str10, str11, obj7 == null ? "" : obj7, o16Var != null ? Boolean.valueOf(o16Var.f) : userId);
                            } else {
                                boolean z32 = z31;
                                if (t16Var.c == DataLoadState.POSITION_REACHED && o16Var == null) {
                                    List<String> list4 = t16Var.d;
                                    String str13 = t16Var.e;
                                    Integer valueOf2 = Integer.valueOf(sdkClipVideoFile.o0());
                                    SdkOwner s2 = sdkClipVideoFile.s();
                                    bVar4 = new a26.b(z32, i6, list4, str13, valueOf2, s2 != null ? s2.b : userId);
                                } else {
                                    aVar2 = new a26.a(z32, false);
                                }
                            }
                            return new MainOverlayState.i(str6, hVar3, x590Var, gVar, descriptionViewState2, fVar2, bVar6, bVar2, cVar2, bVar8, aVar4, list, z29, eVar, bVar4, mf00Var4.o, mfj0Var.a);
                        }
                        aVar2 = new a26.a(z31, o16Var != null);
                        bVar4 = aVar2;
                        return new MainOverlayState.i(str6, hVar3, x590Var, gVar, descriptionViewState2, fVar2, bVar6, bVar2, cVar2, bVar8, aVar4, list, z29, eVar, bVar4, mf00Var4.o, mfj0Var.a);
                    }
                }
                z6 = false;
                SdkActionLink m142 = sdkClipVideoFile.m1();
                boolean f2 = epx.f(m142 != null ? m142.e : null, "clips_trend");
                if (f2) {
                }
                boolean z262 = nyVar.b;
                uu uuVar2 = nyVar.c;
                if (z262) {
                }
                if (!(!z25 || c(sdkClipVideoFile))) {
                }
                boolean U22 = sdkClipVideoFile.U();
                m1 = sdkClipVideoFile.m1();
                if ("clips_user_link".equals(m1 != null ? m1.e : null)) {
                }
                aVar = zu.a.b.a;
                zu.a aVar32 = aVar;
                boolean z282 = nyVar.a;
                if (z6) {
                }
                MainOverlayState.a aVar42 = new MainOverlayState.a(this.i.a(new zu(m15, U22, aVar32, z282, z27, uuVar2, nyVar.d, nyVar.e)), lw.b.a);
                List<SubtitleRenderItem> list5 = mf00Var4.l;
                List<SdkCoOwnerItem> P12 = sdkClipVideoFile.P1();
                ArrayList arrayList132 = new ArrayList();
                while (r1.hasNext()) {
                }
                boolean z292 = !arrayList132.isEmpty();
                n0xVar = mf00Var4.n;
                z7 = n0xVar instanceof n0x.b;
                if (z7) {
                }
                if (inlineNpsMappingHelper$RenderType == InlineNpsMappingHelper$RenderType.View) {
                }
                if (z7) {
                }
                if (n0xVar instanceof n0x.c) {
                }
                ClipsBannerCompanionConfig E2 = yofVar2.E();
                ClipsBannerCompanionConfig m2 = yofVar2.m();
                t16 t16Var2 = mf00Var4.p;
                List<String> list32 = t16Var2.d;
                if (list32 == null) {
                }
                int i62 = z30 ? E2.b : m2.b;
                if (z30) {
                }
                o16 o16Var2 = t16Var2.f;
                z9 = t16Var2.a;
                if (z9) {
                }
                bVar4 = aVar2;
                return new MainOverlayState.i(str6, hVar3, x590Var, gVar, descriptionViewState2, fVar2, bVar6, bVar2, cVar2, bVar8, aVar42, list5, z292, eVar, bVar4, mf00Var4.o, mfj0Var.a);
            }
        } else {
            str3 = str;
            z2 = true;
        }
        hVar = hVar2;
        str4 = P2;
        z3 = false;
        if ((V == null ? V.i : null) == null) {
        }
        MainOverlayState.h hVar32 = hVar;
        j7e j7eVar32 = j7eVar;
        yofVar2 = yofVar;
        x590 a42 = this.j.a(new g590(arrayList7, s, str4, e590Var, false, str3, str2, z3, z4));
        boolean U3 = sdkClipVideoFile.U();
        boolean isEmpty3 = arrayList7.isEmpty();
        if (ownerRightState.i()) {
        }
        boolean z132 = visible instanceof MainOverlayState.PublicationDateState.Visible;
        if (!z132) {
        }
        if (visible2 == null) {
        }
        boolean isEmpty22 = arrayList7.isEmpty();
        SdkActionLink m122 = sdkClipVideoFile.m1();
        boolean z142 = z2;
        if (sdkClipVideoFile.h1()) {
        }
        if (z15) {
        }
        MainOverlayState.g gVar22 = new MainOverlayState.g(visible, bVar5, (alignment != MainOverlayState.PublicationDateState.Visible.Alignment.Horizontal || (bVar5 instanceof jvm0.c)) ? z142 : false);
        m2mVar = m0dVar.f;
        j1 = sdkClipVideoFile.j1();
        if (j1 == null) {
        }
        boolean z162 = mf00Var3.j;
        if (!(m2mVar instanceof m2m.b)) {
        }
        descriptionViewState = bVar;
        if (m0dVar.c) {
        }
        if (mf00Var3.g) {
        }
        ti50.b bVar62 = new ti50.b(!z17 ? R.string.video_accessibility_sound_on : R.string.video_accessibility_sound_off, z17);
        t80Var = m0dVar.j;
        if (t80Var != null) {
        }
        fVar2 = fVar;
        descriptionViewState2 = descriptionViewState;
        sdkClipActivity = null;
        if (sdkClipActivity instanceof SdkClipActivity.Comments) {
        }
        h7e h7eVar2 = m0dVar.d;
        jVar = h7eVar2.a;
        qVar = h7eVar2.b;
        i = h7eVar2.c;
        boolean z192 = mf00Var3.o;
        boolean z202 = rpp0Var2.a;
        ArrayList arrayList92 = new ArrayList();
        if (qVar == null) {
        }
        if (jVar != null) {
        }
        size = arrayList92.size();
        Collection collection3 = arrayList92;
        if (size > i) {
        }
        Collection<mih0> collection22 = collection3;
        ArrayList arrayList102 = new ArrayList(c5g.u(collection22, 10));
        while (r6.hasNext()) {
        }
        if (arrayList102.isEmpty()) {
        }
        ArrayList Ma2 = sdkClipVideoFile.Ma();
        if (Ma2 != null) {
        }
        ArrayList w62 = sdkClipVideoFile.w6();
        if (w62 != null) {
        }
        boolean c2 = c(sdkClipVideoFile);
        if (umcVar.a) {
        }
        if (j7eVar32.b == null) {
        }
        z5 = mfj0Var.a;
        njd njdVar2 = this.b;
        if (z5) {
        }
        mih0.k a52 = njdVar2.h.a(sdkClipVideoFile);
        if (a52 != null) {
        }
        a = njdVar2.a.a(sdkClipVideoFile);
        a2 = njdVar2.d.a(sdkClipVideoFile);
        iVar = j7eVar32.d;
        dVar = j7eVar32.g;
        cVar = j7eVar32.h;
        MainOverlayState.c cVar22 = bVar7;
        dVar2 = j7eVar32.i;
        dVar3 = j7eVar32.j;
        bVar3 = j7eVar32.k;
        int i52 = j7eVar32.l;
        boolean z232 = mf00Var3.o;
        W = yofVar2.W();
        boolean z242 = rpp0Var2.b;
        arrayList = new ArrayList();
        if (g == null) {
        }
        if (W.a) {
            arrayList.add(pVar);
        }
        if (nVar != null) {
        }
        if (iVar != null) {
        }
        if (a != null) {
        }
        if (a2 != null) {
        }
        if (cVar != null) {
        }
        if (dVar != null) {
        }
        if (bVar3 != null) {
        }
        if (dVar3 != null) {
        }
        if (dVar2 != null) {
        }
        i3 = i2;
        if (arrayList.size() > i3) {
        }
        ArrayList arrayList122 = new ArrayList(c5g.u(arrayList, 10));
        while (r1.hasNext()) {
        }
        MainOverlayState.c bVar82 = arrayList122.isEmpty() ? new MainOverlayState.c.b(arrayList122) : MainOverlayState.c.a.a;
        mf00 mf00Var42 = mf00Var2;
        ny nyVar2 = mf00Var42.k;
        if (yofVar2.P().a()) {
        }
        z6 = false;
        SdkActionLink m1422 = sdkClipVideoFile.m1();
        boolean f22 = epx.f(m1422 != null ? m1422.e : null, "clips_trend");
        if (f22) {
        }
        boolean z2622 = nyVar2.b;
        uu uuVar22 = nyVar2.c;
        if (z2622) {
        }
        if (!(!z25 || c(sdkClipVideoFile))) {
        }
        boolean U222 = sdkClipVideoFile.U();
        m1 = sdkClipVideoFile.m1();
        if ("clips_user_link".equals(m1 != null ? m1.e : null)) {
        }
        aVar = zu.a.b.a;
        zu.a aVar322 = aVar;
        boolean z2822 = nyVar2.a;
        if (z6) {
        }
        MainOverlayState.a aVar422 = new MainOverlayState.a(this.i.a(new zu(m15, U222, aVar322, z2822, z27, uuVar22, nyVar2.d, nyVar2.e)), lw.b.a);
        List<SubtitleRenderItem> list52 = mf00Var42.l;
        List<SdkCoOwnerItem> P122 = sdkClipVideoFile.P1();
        ArrayList arrayList1322 = new ArrayList();
        while (r1.hasNext()) {
        }
        boolean z2922 = !arrayList1322.isEmpty();
        n0xVar = mf00Var42.n;
        z7 = n0xVar instanceof n0x.b;
        if (z7) {
        }
        if (inlineNpsMappingHelper$RenderType == InlineNpsMappingHelper$RenderType.View) {
        }
        if (z7) {
        }
        if (n0xVar instanceof n0x.c) {
        }
        ClipsBannerCompanionConfig E22 = yofVar2.E();
        ClipsBannerCompanionConfig m22 = yofVar2.m();
        t16 t16Var22 = mf00Var42.p;
        List<String> list322 = t16Var22.d;
        if (list322 == null) {
        }
        int i622 = z30 ? E22.b : m22.b;
        if (z30) {
        }
        o16 o16Var22 = t16Var22.f;
        z9 = t16Var22.a;
        if (z9) {
        }
        bVar4 = aVar2;
        return new MainOverlayState.i(str6, hVar32, x590Var, gVar, descriptionViewState2, fVar2, bVar62, bVar2, cVar22, bVar82, aVar422, list52, z2922, eVar, bVar4, mf00Var42.o, mfj0Var.a);
    }

    public final boolean c(SdkClipVideoFile sdkClipVideoFile) {
        SdkActionLink m1;
        ActionLinkSnippet actionLinkSnippet;
        SdkActionLink m12;
        yof yofVar = this.f;
        if (yofVar.P().a == ClipsButtonToVideoConfig.Variant.NONE || yofVar.P().a()) {
            return false;
        }
        SdkActionLink m13 = sdkClipVideoFile.m1();
        if (!epx.f(m13 != null ? m13.e : null, "video")) {
            return false;
        }
        SdkActionLink m14 = sdkClipVideoFile.m1();
        return ((m14 != null ? m14.g : null) == null || (m1 = sdkClipVideoFile.m1()) == null || (actionLinkSnippet = m1.g) == null || actionLinkSnippet.b.length() <= 0 || actionLinkSnippet.h.a(300) == null || (m12 = sdkClipVideoFile.m1()) == null || m12.f.length() <= 0) ? false : true;
    }
}
