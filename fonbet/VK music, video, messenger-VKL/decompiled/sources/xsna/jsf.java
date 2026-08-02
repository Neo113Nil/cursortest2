package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.feed.controller.mvi.model.NoDecoration;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoAccessInfo;
import com.vk.dto.common.VideoEditForbiddenReason;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ksf;
import xsna.npf;
import xsna.nsf;
import xsna.rpf;
import xsna.rrf;
import xsna.ttf;
import xsna.vpf;
import xsna.wtf;

/* compiled from: ClipsWrapperMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class jsf {
    public final rpf a;
    public final xtf b;
    public final buf c;
    public final asf d;
    public final rrf e;

    public jsf(zof zofVar, boolean z, xne xneVar, boolean z2, ClipsScreenPerformanceReporter clipsScreenPerformanceReporter, xrf xrfVar, jwe jweVar, int i, iaf iafVar) {
        rpf rpfVar = new rpf(zofVar, z2);
        this.a = rpfVar;
        fuf fufVar = new fuf();
        xtf xtfVar = new xtf(xneVar, zofVar, z, jweVar);
        this.b = xtfVar;
        buf bufVar = new buf(xrfVar, xtfVar, rpfVar, fufVar, clipsScreenPerformanceReporter);
        this.c = bufVar;
        this.d = new asf(bufVar);
        this.e = new rrf(z2, i, iafVar);
    }

    public final isf a(isf isfVar) {
        ClipsWrapperHeaderMode clipsWrapperHeaderMode;
        zrf zrfVar = isfVar.b;
        if (isfVar.l instanceof vpf.a) {
            rrf rrfVar = this.e;
            if (rrfVar.a || zrfVar.m()) {
                clipsWrapperHeaderMode = ClipsWrapperHeaderMode.TABS;
            } else {
                wrf h = zrfVar.h();
                ClipFeedTab c = h != null ? h.c() : null;
                if ((c instanceof ClipFeedTab.SingleClip) || (c instanceof ClipFeedTab.SingleClipByVideoId) || (c instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (c instanceof ClipFeedTab.Profile) || (c instanceof ClipFeedTab.Search) || (c instanceof ClipFeedTab.LivesTop) || (c instanceof ClipFeedTab.LikedClips) || (c instanceof ClipFeedTab.MyClips)) {
                    clipsWrapperHeaderMode = ClipsWrapperHeaderMode.NONE;
                } else if (c instanceof ClipFeedTab.SingleClipFromBlock) {
                    int i = rrf.a.$EnumSwitchMapping$0[((ClipFeedTab.SingleClipFromBlock) c).d.ordinal()];
                    clipsWrapperHeaderMode = (i == 1 || i == 2 || i == 3) ? ClipsWrapperHeaderMode.SINGLE_TITLE : ClipsWrapperHeaderMode.NONE;
                } else {
                    clipsWrapperHeaderMode = c instanceof ClipFeedTab.ClipsFromShopsSource ? ClipsWrapperHeaderMode.SINGLE_TITLE : c instanceof ClipFeedTab.ClipsFromTrendsSource ? ClipsWrapperHeaderMode.SINGLE_TITLE : c instanceof ClipFeedTab.NewsMonotheme ? ClipsWrapperHeaderMode.SINGLE_TITLE : ((c instanceof ClipFeedTab.Hashtag) || (c instanceof ClipFeedTab.Music) || (c instanceof ClipFeedTab.Mask) || (c instanceof ClipFeedTab.Place) || (c instanceof ClipFeedTab.Compilation) || (c instanceof ClipFeedTab.MusicTemplate) || (c instanceof ClipFeedTab.CatalogClip) || (c instanceof ClipFeedTab.FavoriteFolder) || (c instanceof ClipFeedTab.Playlist) || (c instanceof ClipFeedTab.SingleAdv) || (c instanceof ClipFeedTab.ProfileLives) || (c instanceof ClipFeedTab.CoauthorInvitations) || (c instanceof ClipFeedTab.Discover) || (c instanceof ClipFeedTab.UserSubscriptions)) ? ClipsWrapperHeaderMode.NONE : rrfVar.b == 1 ? ClipsWrapperHeaderMode.SINGLE_TITLE : ClipsWrapperHeaderMode.NONE;
                }
            }
        } else {
            clipsWrapperHeaderMode = ClipsWrapperHeaderMode.NONE;
        }
        euf eufVar = isfVar.f;
        return eufVar.g != clipsWrapperHeaderMode ? isf.a(isfVar, null, null, null, null, euf.o(eufVar, null, null, false, false, null, clipsWrapperHeaderMode, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, 991), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS) : isfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x02ad, code lost:
    
        if (r2.equals(r12.b) == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final isf b(isf isfVar, ttf ttfVar) {
        hsf hsfVar;
        ezt0 ezt0Var;
        ksf ksfVar;
        ksf ksfVar2;
        Object obj;
        euf o;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean isVisible;
        boolean z5;
        wtf wtfVar;
        vpf bVar;
        jsf jsfVar;
        isf isfVar2;
        ClipsWrapperCreateButton.a aVar;
        String str;
        ClipFeedTab.Music music;
        MusicTrack musicTrack;
        int i;
        SdkClipVideoFile sdkClipVideoFile;
        ClipVideoFile z6;
        List<SdkTrendingHashtag> R0;
        SdkTrendingHashtag sdkTrendingHashtag;
        wtf wtfVar2;
        ClipsFeedDecorationPayload clipsFeedDecorationPayload;
        vpf bVar2;
        boolean z7;
        List<VideoEditForbiddenReason> list;
        isf a;
        isf a2;
        hsf hsfVar2;
        ezt0 ezt0Var2;
        ClipsFeedDecorationPayload clipsFeedDecorationPayload2;
        euf eufVar;
        int i2;
        NoDecoration noDecoration;
        ksf ksfVar3;
        a7j<ClipFeedOpenAction> a7jVar;
        xtf xtfVar;
        xne xneVar;
        rpf rpfVar;
        upf upfVar;
        int i3;
        ClipsFeedDecorationPayload clipsFeedDecorationPayload3;
        hsf hsfVar3;
        vpf vpfVar;
        NoDecoration noDecoration2;
        vob vobVar;
        xtf xtfVar2;
        boolean a3;
        wtf wtfVar3;
        hsf hsfVar4;
        vpf vpfVar2;
        ClipsDecorationKey clipsDecorationKey;
        SdkVideoFile sdkVideoFile;
        List<SdkVideoFile> list2;
        boolean z8;
        List<VideoEditForbiddenReason> list3;
        List<SdkVideoFile> list4;
        isf isfVar3 = isfVar;
        xtf xtfVar3 = this.b;
        xne xneVar2 = xtfVar3.a;
        kuf kufVar = isfVar3.g;
        ntf ntfVar = isfVar3.d;
        wtf wtfVar4 = isfVar3.j;
        hsf hsfVar5 = isfVar3.k;
        lsf lsfVar = isfVar3.c;
        upf upfVar2 = isfVar3.e;
        zrf zrfVar = isfVar3.b;
        vpf vpfVar3 = isfVar3.l;
        euf eufVar2 = isfVar3.f;
        boolean z9 = ttfVar instanceof ttf.f;
        wtf wtfVar5 = wtf.b.i;
        NoDecoration noDecoration3 = NoDecoration.b;
        rpf rpfVar2 = this.a;
        if (z9) {
            ttf.f fVar = (ttf.f) ttfVar;
            kwc kwcVar = fVar.d;
            ClipsDecorationKey clipsDecorationKey2 = fVar.l;
            int i4 = fVar.c;
            ClipsFeedDecorationPayload clipsFeedDecorationPayload4 = fVar.m;
            List<ClipFeedTab> list5 = fVar.b;
            buf bufVar = this.d.a;
            a7j<ClipFeedOpenAction> a7jVar2 = fVar.e;
            zrf zrfVar2 = new zrf(bufVar.b(kwcVar, i4, list5, a7jVar2), i4, i4, kwcVar);
            boolean z10 = fVar.i;
            boolean z11 = fVar.h;
            boolean z12 = fVar.j;
            if (epx.f(clipsFeedDecorationPayload4, noDecoration3) || clipsDecorationKey2 == null) {
                if (!z11 || z12) {
                    clipsFeedDecorationPayload2 = clipsFeedDecorationPayload4;
                    eufVar = eufVar2;
                    i2 = i4;
                    noDecoration = noDecoration3;
                    if (z12 && !z10) {
                        ksfVar3 = ksf.a.e;
                    }
                } else {
                    clipsFeedDecorationPayload2 = clipsFeedDecorationPayload4;
                    cn o2 = o25.a().o();
                    eufVar = eufVar2;
                    i2 = i4;
                    noDecoration = noDecoration3;
                    ksfVar3 = new ksf.b(new nsf.b(o2.c, o2.j));
                }
                if (!epx.f(lsfVar.b, ksfVar3) && lsfVar.e == z11 && lsfVar.d == z10 && lsfVar.f == z12) {
                    a7jVar = a7jVar2;
                    xtfVar = xtfVar3;
                    xneVar = xneVar2;
                    rpfVar = rpfVar2;
                    upfVar = upfVar2;
                    i3 = i2;
                    clipsFeedDecorationPayload3 = clipsFeedDecorationPayload2;
                    hsfVar3 = hsfVar5;
                    vpfVar = vpfVar3;
                    noDecoration2 = noDecoration;
                } else {
                    a7jVar = a7jVar2;
                    xtfVar = xtfVar3;
                    xneVar = xneVar2;
                    rpfVar = rpfVar2;
                    upfVar = upfVar2;
                    i3 = i2;
                    clipsFeedDecorationPayload3 = clipsFeedDecorationPayload2;
                    hsfVar3 = hsfVar5;
                    vpfVar = vpfVar3;
                    noDecoration2 = noDecoration;
                    lsfVar = lsf.a(lsfVar, ksfVar3, false, fVar.i, fVar.h, fVar.j, 2);
                }
                ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(i3, list5);
                if ((!epx.f(clipsFeedDecorationPayload3, noDecoration2) || clipsDecorationKey2 == null) && ((!rpfVar.a.f0().b || rpfVar.b) && !(clipFeedTab instanceof ClipFeedTab.NewsMonotheme))) {
                    g620.f().h().getClass();
                    if (list5.size() <= 1 || fxc0.B().J().N0()) {
                        vobVar = new vob(!fxc0.B().J().N0() ? npf.h.b.b : npf.h.m.b);
                        if (!epx.f(ntfVar.b, vobVar)) {
                            ntfVar = new ntf(vobVar, ntfVar.c);
                        }
                        upf c = rpfVar.c(upfVar, zrfVar2);
                        euf o3 = euf.o(!epx.f(clipsFeedDecorationPayload3, noDecoration2) ? fuf.a(eufVar) : fuf.b(eufVar, zrfVar2), null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, fVar.n, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                        lsf lsfVar2 = lsfVar;
                        usf usfVar = new usf(a7jVar);
                        kwc kwcVar2 = fVar.d;
                        xtfVar2 = xtfVar;
                        if (!xtfVar2.c) {
                            ClipFeedTab clipFeedTab2 = (ClipFeedTab) j5g.b0(i3, list5);
                            if (clipFeedTab2 == null) {
                                clipFeedTab2 = (ClipFeedTab) j5g.a0(list5);
                            }
                            a3 = xtfVar2.a(clipFeedTab2);
                        } else if (fVar.k) {
                            ClipFeedTab clipFeedTab3 = (ClipFeedTab) j5g.b0(i3, list5);
                            if (clipFeedTab3 == null) {
                                clipFeedTab3 = (ClipFeedTab) j5g.a0(list5);
                            }
                            a3 = xtfVar2.a(clipFeedTab3);
                        } else {
                            a3 = false;
                        }
                        if (a3) {
                            if (kwcVar2 == null || (list4 = kwcVar2.a) == null || (sdkVideoFile = (SdkVideoFile) j5g.b0(kwcVar2.c, list4)) == null) {
                                sdkVideoFile = (kwcVar2 == null || (list2 = kwcVar2.a) == null) ? null : (SdkVideoFile) j5g.a0(list2);
                                if (sdkVideoFile == null) {
                                    Object b0 = j5g.b0(i3, list5);
                                    ClipFeedTab.SingleClip singleClip = b0 instanceof ClipFeedTab.SingleClip ? (ClipFeedTab.SingleClip) b0 : null;
                                    sdkVideoFile = singleClip != null ? singleClip.b : null;
                                }
                            }
                            if (sdkVideoFile != null && xneVar.a(sdkVideoFile)) {
                                VideoFile A = k15.A(sdkVideoFile);
                                Long valueOf = Long.valueOf(A.L8());
                                VideoAccessInfo G9 = A.G9();
                                if (G9 != null && (list3 = G9.b) != null) {
                                    List<VideoEditForbiddenReason> list6 = list3;
                                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                                        Iterator<T> it = list6.iterator();
                                        while (it.hasNext()) {
                                            if (((VideoEditForbiddenReason) it.next()) instanceof VideoEditForbiddenReason.Ad) {
                                                z8 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                z8 = false;
                                hsfVar4 = hsfVar3;
                                wtfVar3 = new wtf.a(valueOf, z8, new npf.h.d(A), new npf.h.c(A), A.p1() != null, 32);
                                boolean z13 = hsfVar4.c;
                                boolean z14 = fVar.g;
                                hsf a4 = z13 == z14 ? hsf.a(hsfVar4, null, z14, 1) : hsfVar4;
                                if (clipsDecorationKey2 != null) {
                                    vpfVar2 = new vpf.a(vpfVar.e(), vpfVar.f());
                                } else {
                                    vpf vpfVar4 = vpfVar;
                                    if (!(vpfVar4 instanceof vpf.a) || (clipsFeedDecorationPayload3 instanceof NoDecoration)) {
                                        if (vpfVar4 instanceof vpf.b) {
                                            vpf.b bVar3 = (vpf.b) vpfVar4;
                                            if (epx.f(bVar3.c, clipsFeedDecorationPayload3)) {
                                                clipsDecorationKey = clipsDecorationKey2;
                                            }
                                        }
                                        vpfVar2 = vpfVar4;
                                    }
                                    clipsDecorationKey = clipsDecorationKey2;
                                    vpfVar2 = new vpf.b(clipsDecorationKey, clipsFeedDecorationPayload3, true);
                                }
                                return a(isf.a(isfVar, zrfVar2, lsfVar2, ntfVar, c, o3, null, null, usfVar, wtfVar3, a4, vpfVar2, 96));
                            }
                        } else {
                            wtfVar5 = wtf.d.i;
                        }
                        wtfVar3 = wtfVar5;
                        hsfVar4 = hsfVar3;
                        boolean z132 = hsfVar4.c;
                        boolean z142 = fVar.g;
                        if (z132 == z142) {
                        }
                        if (clipsDecorationKey2 != null) {
                        }
                        return a(isf.a(isfVar, zrfVar2, lsfVar2, ntfVar, c, o3, null, null, usfVar, wtfVar3, a4, vpfVar2, 96));
                    }
                }
                vobVar = null;
                if (!epx.f(ntfVar.b, vobVar)) {
                }
                upf c2 = rpfVar.c(upfVar, zrfVar2);
                euf o32 = euf.o(!epx.f(clipsFeedDecorationPayload3, noDecoration2) ? fuf.a(eufVar) : fuf.b(eufVar, zrfVar2), null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, fVar.n, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                lsf lsfVar22 = lsfVar;
                usf usfVar2 = new usf(a7jVar);
                kwc kwcVar22 = fVar.d;
                xtfVar2 = xtfVar;
                if (!xtfVar2.c) {
                }
                if (a3) {
                }
                wtfVar3 = wtfVar5;
                hsfVar4 = hsfVar3;
                boolean z1322 = hsfVar4.c;
                boolean z1422 = fVar.g;
                if (z1322 == z1422) {
                }
                if (clipsDecorationKey2 != null) {
                }
                return a(isf.a(isfVar, zrfVar2, lsfVar22, ntfVar, c2, o32, null, null, usfVar2, wtfVar3, a4, vpfVar2, 96));
            }
            clipsFeedDecorationPayload2 = clipsFeedDecorationPayload4;
            eufVar = eufVar2;
            i2 = i4;
            noDecoration = noDecoration3;
            ksfVar3 = null;
            if (!epx.f(lsfVar.b, ksfVar3)) {
            }
            a7jVar = a7jVar2;
            xtfVar = xtfVar3;
            xneVar = xneVar2;
            rpfVar = rpfVar2;
            upfVar = upfVar2;
            i3 = i2;
            clipsFeedDecorationPayload3 = clipsFeedDecorationPayload2;
            hsfVar3 = hsfVar5;
            vpfVar = vpfVar3;
            noDecoration2 = noDecoration;
            lsfVar = lsf.a(lsfVar, ksfVar3, false, fVar.i, fVar.h, fVar.j, 2);
            ClipFeedTab clipFeedTab4 = (ClipFeedTab) j5g.b0(i3, list5);
            if (!epx.f(clipsFeedDecorationPayload3, noDecoration2)) {
            }
            g620.f().h().getClass();
            if (list5.size() <= 1) {
            }
            vobVar = new vob(!fxc0.B().J().N0() ? npf.h.b.b : npf.h.m.b);
            if (!epx.f(ntfVar.b, vobVar)) {
            }
            upf c22 = rpfVar.c(upfVar, zrfVar2);
            euf o322 = euf.o(!epx.f(clipsFeedDecorationPayload3, noDecoration2) ? fuf.a(eufVar) : fuf.b(eufVar, zrfVar2), null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, fVar.n, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            lsf lsfVar222 = lsfVar;
            usf usfVar22 = new usf(a7jVar);
            kwc kwcVar222 = fVar.d;
            xtfVar2 = xtfVar;
            if (!xtfVar2.c) {
            }
            if (a3) {
            }
            wtfVar3 = wtfVar5;
            hsfVar4 = hsfVar3;
            boolean z13222 = hsfVar4.c;
            boolean z14222 = fVar.g;
            if (z13222 == z14222) {
            }
            if (clipsDecorationKey2 != null) {
            }
            return a(isf.a(isfVar, zrfVar2, lsfVar222, ntfVar, c22, o322, null, null, usfVar22, wtfVar3, a4, vpfVar2, 96));
        }
        jsf jsfVar2 = this;
        if (ttfVar instanceof ttf.i) {
            ttf.i iVar = (ttf.i) ttfVar;
            boolean z15 = iVar instanceof ttf.i.d;
            buf bufVar2 = jsfVar2.c;
            if (z15) {
                List<ClipFeedTab> list7 = ((ttf.i.d) iVar).b;
                List<wrf> list8 = zrfVar.b;
                List<wrf> list9 = list8;
                ArrayList arrayList = new ArrayList(c5g.u(list9, 10));
                Iterator<T> it2 = list9.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((wrf) it2.next()).c());
                }
                if (!arrayList.equals(list7)) {
                    int i5 = zrfVar.d;
                    wrf wrfVar = (wrf) j5g.b0(zrfVar.c, list8);
                    ClipFeedTab c3 = wrfVar != null ? wrfVar.c() : null;
                    wrf wrfVar2 = (wrf) j5g.b0(i5, list8);
                    ClipFeedTab c4 = wrfVar2 != null ? wrfVar2.c() : null;
                    int indexOf = list7.indexOf(c3);
                    Integer valueOf2 = Integer.valueOf(indexOf);
                    if (indexOf == -1) {
                        valueOf2 = null;
                    }
                    int intValue = valueOf2 != null ? valueOf2.intValue() : -1;
                    int indexOf2 = list7.indexOf(c4);
                    Integer valueOf3 = Integer.valueOf(indexOf2);
                    if (indexOf2 == -1) {
                        valueOf3 = null;
                    }
                    a2 = bufVar2.a(isfVar3, list7, valueOf3 != null ? valueOf3.intValue() : intValue != -1 ? intValue : swe0.g(i5, 0, e43.h(list7)), intValue);
                }
                a2 = isfVar3;
            } else if (iVar instanceof ttf.i.a) {
                rpf rpfVar3 = bufVar2.c;
                int i6 = ((ttf.i.a) iVar).b;
                if (zrfVar.d != i6) {
                    zrf c5 = zrf.c(zrfVar, null, 0, i6, 27);
                    euf eufVar3 = isfVar3.f;
                    euf o4 = euf.o(!(vpfVar3 instanceof vpf.a) ? fuf.a(eufVar3) : fuf.b(eufVar3, c5), null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                    upf c6 = rpfVar3.c(upfVar2, c5);
                    if (hsfVar5.c) {
                        wrf h = c5.h();
                        if ((h != null ? h.c() : null) instanceof ClipFeedTab.MyClips) {
                            wrf h2 = c5.h();
                            ezt0Var2 = new ezt0(new npf.h.j((h2 != null ? h2.c() : null) instanceof ClipFeedTab.MyClips));
                        } else {
                            ezt0Var2 = null;
                        }
                        if (!epx.f(hsfVar5.b, ezt0Var2)) {
                            hsfVar2 = hsf.a(hsfVar5, ezt0Var2, false, 2);
                            a2 = isf.a(isfVar3, c5, null, null, c6, o4, null, null, null, bufVar2.b.b(wtfVar4, c5), hsfVar2, null, 1254);
                        }
                    }
                    hsfVar2 = hsfVar5;
                    a2 = isf.a(isfVar3, c5, null, null, c6, o4, null, null, null, bufVar2.b.b(wtfVar4, c5), hsfVar2, null, 1254);
                } else {
                    isfVar3 = isfVar;
                    a2 = isfVar3;
                }
            } else if (iVar instanceof ttf.i.b) {
                a2 = isf.a(isfVar, null, null, null, null, euf.o(eufVar2, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                jsfVar2 = this;
            } else {
                isfVar3 = isfVar;
                if (!(iVar instanceof ttf.i.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<ClipFeedTab> list10 = ((ttf.i.c) iVar).b;
                List<wrf> list11 = zrfVar.b;
                ArrayList arrayList2 = new ArrayList(c5g.u(list11, 10));
                Iterator<T> it3 = list11.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((wrf) it3.next()).c());
                }
                if (!arrayList2.equals(list10)) {
                    List<wrf> list12 = zrfVar.b;
                    int i7 = zrfVar.d;
                    wrf wrfVar3 = (wrf) j5g.b0(i7, list12);
                    ClipFeedTab c7 = wrfVar3 != null ? wrfVar3.c() : null;
                    int g = swe0.g(i7, 0, e43.h(list10));
                    ArrayList arrayList3 = new ArrayList(list10);
                    if (c7 != null) {
                        arrayList3.set(g, c7);
                    }
                    a2 = bufVar2.a(isfVar3, arrayList3, g, zrfVar.c);
                }
                a2 = isfVar3;
            }
            return jsfVar2.a(a2);
        }
        if (ttfVar instanceof ttf.j) {
            ttf.j jVar = (ttf.j) ttfVar;
            if (jVar instanceof ttf.j.b) {
                ttf.j.b bVar4 = (ttf.j.b) jVar;
                if (!(vpfVar3 instanceof vpf.a)) {
                    a = isf.a(isfVar3, null, null, null, null, fuf.a(eufVar2), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                } else if (zrfVar.m() || eufVar2.g == ClipsWrapperHeaderMode.SINGLE_TITLE) {
                    euf b = fuf.b(eufVar2, zrfVar);
                    a = !eufVar2.equals(b) ? isf.a(isfVar, null, null, null, null, b, null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS) : isfVar;
                } else {
                    tlo0 tlo0Var = bVar4.b;
                    if (!epx.f(eufVar2.b, tlo0Var)) {
                        a = isf.a(isfVar3, null, null, null, null, euf.o(isfVar3.f, tlo0Var, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                    }
                }
            } else {
                if (!(jVar instanceof ttf.j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CharSequence charSequence = ((ttf.j.a) jVar).b;
                if (!epx.f(eufVar2.c, charSequence)) {
                    a = isf.a(isfVar3, null, null, null, null, euf.o(isfVar3.f, null, charSequence, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                }
            }
            return jsfVar2.a(a);
        }
        if (ttfVar instanceof ttf.k) {
            ttf.k kVar = (ttf.k) ttfVar;
            if (kVar instanceof ttf.k.b) {
                iuf iufVar = ((ttf.k.b) kVar).b;
                kufVar.getClass();
                return isf.a(isfVar, null, null, null, null, null, new kuf(iufVar), null, null, null, null, null, 2015);
            }
            if (!(kVar instanceof ttf.k.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kufVar.getClass();
            return isf.a(isfVar, null, null, null, null, null, new kuf(null), null, null, null, null, null, 2015);
        }
        if (ttfVar instanceof ttf.h) {
            ttf.h hVar = (ttf.h) ttfVar;
            if (!(hVar instanceof ttf.h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rsf rsfVar = isfVar.h;
            psf psfVar = ((ttf.h.a) hVar).b;
            rsfVar.getClass();
            return isf.a(isfVar, null, null, null, null, null, null, new rsf(psfVar), null, null, null, null, 1983);
        }
        if (ttfVar instanceof ttf.c.a) {
            ttf.c cVar = (ttf.c) ttfVar;
            if (!(cVar instanceof ttf.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            tqf tqfVar = ((ttf.c.a) cVar).b;
            hfz hfzVar = tqfVar.c;
            hfz hfzVar2 = tqfVar.c;
            FeedItem feedItem = hfzVar instanceof FeedItem ? (FeedItem) hfzVar : null;
            String r = feedItem instanceof FeedItem.d ? ((FeedItem.d) feedItem).k().r() : null;
            wrf h3 = zrfVar.h();
            int i8 = rpf.a.$EnumSwitchMapping$0[rpfVar2.a(h3 != null ? h3.c() : null).ordinal()];
            if (i8 != 1) {
                i = 2;
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = null;
            } else {
                wrf h4 = zrfVar.h();
                ClipFeedTab c8 = h4 != null ? h4.c() : null;
                ClipFeedTab.Hashtag hashtag = c8 instanceof ClipFeedTab.Hashtag ? (ClipFeedTab.Hashtag) c8 : null;
                if (hashtag != null && hashtag.c) {
                    FeedItem.d dVar = hfzVar instanceof FeedItem.d ? (FeedItem.d) hfzVar : null;
                    SdkVideoFile k = dVar != null ? dVar.k() : null;
                    SdkClipVideoFile sdkClipVideoFile2 = k instanceof SdkClipVideoFile ? (SdkClipVideoFile) k : null;
                    if (sdkClipVideoFile2 != null && (R0 = sdkClipVideoFile2.R0()) != null && (sdkTrendingHashtag = (SdkTrendingHashtag) j5g.a0(R0)) != null) {
                        str = sdkTrendingHashtag.b;
                        wrf h5 = zrfVar.h();
                        ClipFeedTab c9 = h5 == null ? h5.c() : null;
                        music = !(c9 instanceof ClipFeedTab.Music) ? (ClipFeedTab.Music) c9 : null;
                        if (music != null && music.e) {
                            FeedItem.d dVar2 = !(hfzVar instanceof FeedItem.d) ? (FeedItem.d) hfzVar : null;
                            SdkVideoFile k2 = dVar2 == null ? dVar2.k() : null;
                            sdkClipVideoFile = !(k2 instanceof SdkClipVideoFile) ? (SdkClipVideoFile) k2 : null;
                            if (sdkClipVideoFile != null && (z6 = k15.z(sdkClipVideoFile)) != null) {
                                musicTrack = z6.D1;
                                aVar = new ClipsWrapperCreateButton.a(new npf.h.e(musicTrack, r, str));
                                i = 2;
                            }
                        }
                        musicTrack = null;
                        aVar = new ClipsWrapperCreateButton.a(new npf.h.e(musicTrack, r, str));
                        i = 2;
                    }
                }
                str = null;
                wrf h52 = zrfVar.h();
                if (h52 == null) {
                }
                if (!(c9 instanceof ClipFeedTab.Music)) {
                }
                if (music != null) {
                    if (!(hfzVar instanceof FeedItem.d)) {
                    }
                    if (dVar2 == null) {
                    }
                    if (!(k2 instanceof SdkClipVideoFile)) {
                    }
                    if (sdkClipVideoFile != null) {
                        musicTrack = z6.D1;
                        aVar = new ClipsWrapperCreateButton.a(new npf.h.e(musicTrack, r, str));
                        i = 2;
                    }
                }
                musicTrack = null;
                aVar = new ClipsWrapperCreateButton.a(new npf.h.e(musicTrack, r, str));
                i = 2;
            }
            upf a5 = upf.a(upfVar2, aVar, false, i);
            if (wtfVar4.b && wtfVar4.c) {
                if ((hfzVar2 instanceof FeedItem.d) && xneVar2.a(((FeedItem.d) hfzVar2).k()) && (hfzVar2 instanceof FeedItem.f)) {
                    ClipVideoFile z16 = k15.z(((FeedItem.f) hfzVar2).e);
                    boolean z17 = !tqfVar.b;
                    Long valueOf4 = Long.valueOf(z16.s);
                    VideoAccessInfo videoAccessInfo = z16.A;
                    if (videoAccessInfo != null && (list = videoAccessInfo.b) != null) {
                        List<VideoEditForbiddenReason> list13 = list;
                        if (!(list13 instanceof Collection) || !list13.isEmpty()) {
                            Iterator<T> it4 = list13.iterator();
                            while (it4.hasNext()) {
                                if (((VideoEditForbiddenReason) it4.next()) instanceof VideoEditForbiddenReason.Ad) {
                                    z7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    z7 = false;
                    wtfVar5 = new wtf.a(valueOf4, new npf.h.d(z16), new npf.h.c(z16), z17, z7, !xtfVar3.d.b().d(), z16.d0 != null);
                }
                wtfVar2 = wtfVar5;
            } else {
                wtfVar2 = wtfVar4;
            }
            FeedItem.f fVar2 = hfzVar2 instanceof FeedItem.f ? (FeedItem.f) hfzVar2 : null;
            if (fVar2 == null) {
                bVar2 = new vpf.a(vpfVar3.e(), vpfVar3.f());
            } else {
                ClipsDecorationKey f = vpfVar3.f();
                vpf.b bVar5 = vpfVar3 instanceof vpf.b ? (vpf.b) vpfVar3 : null;
                if (bVar5 == null || (clipsFeedDecorationPayload = bVar5.c) == null) {
                    clipsFeedDecorationPayload = noDecoration3;
                }
                ClipsFeedDecorationPayload clipsFeedDecorationPayload5 = fVar2.l;
                bVar2 = (clipsFeedDecorationPayload.equals(clipsFeedDecorationPayload5) || f == null) ? vpfVar3 : new vpf.b(f, clipsFeedDecorationPayload5, vpfVar3.e());
            }
            return jsfVar2.a(isf.a(isfVar, null, null, null, a5, null, null, null, null, wtfVar2, null, bVar2, 759));
        }
        if (ttfVar instanceof ttf.a) {
            return isf.a(isfVar, null, null, null, null, null, null, null, new usf(((ttf.a) ttfVar).b), null, null, null, 1919);
        }
        if (!(ttfVar instanceof ttf.l)) {
            if (ttfVar instanceof ttf.g) {
                return isfVar;
            }
            if (!(ttfVar instanceof ttf.b)) {
                if (ttfVar instanceof ttf.d) {
                    float f2 = eufVar2.h;
                    ((ttf.d) ttfVar).getClass();
                    if (f2 != 1.0f || eufVar2.i) {
                        return isf.a(isfVar, null, null, null, null, euf.o(eufVar2, null, null, false, false, null, null, 1.0f, false, null, false, 831), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                    }
                } else {
                    if (!(ttfVar instanceof ttf.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ttf.e eVar = (ttf.e) ttfVar;
                    if (eufVar2.g == ClipsWrapperHeaderMode.TABS) {
                        int i9 = eVar.b;
                        Integer num = eufVar2.j;
                        if (num == null || i9 == num.intValue()) {
                            return isf.a(isfVar, null, null, null, null, euf.o(isfVar.f, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, Integer.valueOf(i9), false, 767), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                        }
                        int i10 = jsfVar2.e.c.b;
                        boolean z18 = i9 > num.intValue();
                        boolean z19 = i9 < num.intValue();
                        boolean z20 = eufVar2.i;
                        return (!z18 || i9 < i10 || z20) ? (z19 && z20) ? isf.a(isfVar, null, null, null, null, euf.o(eufVar2, null, null, false, false, null, null, 1.0f, false, Integer.valueOf(i9), false, 575), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS) : isf.a(isfVar, null, null, null, null, euf.o(eufVar2, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, Integer.valueOf(i9), false, 767), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS) : isf.a(isfVar, null, null, null, null, euf.o(eufVar2, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, Integer.valueOf(i9), false, 575), null, null, null, null, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
                    }
                }
                return isfVar;
            }
            ttf.b bVar6 = (ttf.b) ttfVar;
            if (!(bVar6 instanceof utf)) {
                if (!(bVar6 instanceof vtf)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z21 = ((vtf) bVar6).b;
                if ((hsfVar5.b != null) != z21) {
                    if (hsfVar5.c && z21) {
                        wrf h6 = zrfVar.h();
                        ezt0Var = new ezt0(new npf.h.j((h6 != null ? h6.c() : null) instanceof ClipFeedTab.MyClips));
                    } else {
                        ezt0Var = null;
                    }
                    hsfVar = hsf.a(hsfVar5, ezt0Var, false, 2);
                } else {
                    hsfVar = hsfVar5;
                }
                return isf.a(isfVar, null, null, null, null, null, null, null, null, null, hsfVar, null, 1535);
            }
            utf utfVar = (utf) bVar6;
            boolean z22 = utfVar.c;
            boolean z23 = utfVar.b;
            if (vpfVar3 instanceof vpf.a) {
                if (z23 && !z22 && o25.a().b()) {
                    cn o5 = o25.a().o();
                    ksfVar = new ksf.b(new nsf.b(o5.c, o5.j));
                } else if (z22 && !lsfVar.d) {
                    ksfVar = ksf.a.e;
                }
                ksfVar2 = ksfVar;
                if (epx.f(lsfVar.b, ksfVar2) || lsfVar.e != z23) {
                    lsfVar = lsf.a(lsfVar, ksfVar2, false, false, utfVar.b, false, 22);
                }
                return isf.a(isfVar, null, lsfVar, null, null, null, null, null, null, null, null, null, 2045);
            }
            ksfVar2 = null;
            if (epx.f(lsfVar.b, ksfVar2)) {
            }
            lsfVar = lsf.a(lsfVar, ksfVar2, false, false, utfVar.b, false, 22);
            return isf.a(isfVar, null, lsfVar, null, null, null, null, null, null, null, null, null, 2045);
        }
        ttf.l lVar = (ttf.l) ttfVar;
        boolean z24 = lVar.b;
        boolean z25 = vpfVar3 instanceof vpf.a;
        if (z25) {
            boolean z26 = z24 && zrfVar.m();
            boolean z27 = lVar.b;
            if (z27 != eufVar2.d || z26 != eufVar2.e) {
                boolean z28 = z27 && zrfVar.m();
                obj = vpfVar3;
                o = euf.o(eufVar2, null, null, z27, z28, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, 1011);
                boolean z29 = o == eufVar2;
                if (upfVar2.c == z24) {
                    z = true;
                    upfVar2 = upf.a(upfVar2, null, z24, 1);
                    z29 = true;
                } else {
                    z = true;
                }
                upf upfVar3 = upfVar2;
                if (ntfVar.c != z24) {
                    z29 = z;
                    ntfVar = new ntf(ntfVar.b, z24);
                }
                z2 = lsfVar.c;
                boolean z30 = z29;
                z3 = lVar.b;
                if (z2 == z3) {
                    lsfVar = lsf.a(lsfVar, null, z3, false, false, false, 29);
                    z4 = z;
                } else {
                    z4 = z30;
                }
                isVisible = wtfVar4.isVisible();
                z5 = lVar.b;
                if (isVisible == z5 && (wtfVar4 instanceof wtf.a)) {
                    wtf.a aVar2 = (wtf.a) wtfVar4;
                    z4 = z;
                    wtfVar = new wtf.a(aVar2.j, aVar2.l, aVar2.m, z5, aVar2.k, aVar2.n, aVar2.o);
                } else {
                    wtfVar = wtfVar4;
                }
                if (!z25) {
                    bVar = new vpf.a(z24, ((vpf.a) obj).c);
                } else {
                    if (!(obj instanceof vpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vpf.b bVar7 = (vpf.b) obj;
                    bVar = new vpf.b(bVar7.b, bVar7.c, z24);
                }
                if (!bVar.equals(obj)) {
                    z4 = z;
                }
                if (z4) {
                    jsfVar = this;
                    isfVar2 = isfVar;
                } else {
                    jsfVar = this;
                    isfVar2 = isf.a(isfVar, null, lsfVar, ntfVar, upfVar3, o, null, null, null, wtfVar, null, bVar, 737);
                }
                return jsfVar.a(isfVar2);
            }
            o = eufVar2;
        } else {
            o = fuf.a(eufVar2);
        }
        obj = vpfVar3;
        if (o == eufVar2) {
        }
        if (upfVar2.c == z24) {
        }
        upf upfVar32 = upfVar2;
        if (ntfVar.c != z24) {
        }
        z2 = lsfVar.c;
        boolean z302 = z29;
        z3 = lVar.b;
        if (z2 == z3) {
        }
        isVisible = wtfVar4.isVisible();
        z5 = lVar.b;
        if (isVisible == z5) {
        }
        wtfVar = wtfVar4;
        if (!z25) {
        }
        if (!bVar.equals(obj)) {
        }
        if (z4) {
        }
        return jsfVar.a(isfVar2);
    }
}
