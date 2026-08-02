package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4504q2;
import com.vk.api.generated.wall.dto.WallDeleteThreadResponseDto;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.ClipsUploadState;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.polls.Poll;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.analytics.api.mediascope.MusicMediaScopeAction;
import com.vk.music.player.analytics.impl.tracker.mediascope.MusicMediaScopeCommand;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import com.vk.voip.OKVoipEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import xsna.f0s;
import xsna.fh8;
import xsna.gh8;
import xsna.hil;
import xsna.l7x0;
import xsna.xfh;
import xsna.xlm;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$z] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AboutVideoItem.y yVar;
        sd90 sd90Var;
        UIBlockMusicTrack uIBlockMusicTrack;
        MusicTrack musicTrack;
        String str;
        int i = 4;
        int i2 = 2;
        int i3 = 0;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z = false;
        i3 = 0;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                t8 t8Var = (t8) this.c;
                VideoFile videoFile = (VideoFile) this.d;
                ListBuilder e = e43.e();
                List list = (List) obj;
                if (!list.isEmpty()) {
                    t8Var.getClass();
                    if (!fxc0.B().J().J1()) {
                        e.add(AboutVideoItem.k.b);
                    }
                }
                if (!list.isEmpty()) {
                    t8Var.getClass();
                    if (fxc0.B().J().J1()) {
                        String P = videoFile.P();
                        if (P == null) {
                            P = "";
                        }
                        yVar = new AboutVideoItem.z(P, true, false, false, false, false, false);
                    } else {
                        yVar = AboutVideoItem.y.b;
                    }
                    e.add(yVar);
                }
                e.addAll(list);
                return e.g();
            case 1:
                return ((vf) this.c).d((MusicMediaScopeAction) this.d, MusicMediaScopeCommand.PING);
            case 2:
                pp0 pp0Var = (pp0) this.c;
                mkl mklVar = (mkl) this.d;
                b7d0 b7d0Var = pp0Var.d;
                b7d0Var.h7(new l7x0.c(j5g.R0(pp0Var.a.a)));
                b7d0Var.i7((Throwable) obj);
                b7d0Var.b7((Poll) mklVar.b);
                return s3q0.a;
            case 3:
                sm3 sm3Var = (sm3) this.c;
                gzs gzsVar = (gzs) this.d;
                Context context = sm3Var.itemView.getContext();
                Object obj2 = sm3Var.l;
                Article article = ((ym3) (obj2 != null ? obj2 : null)).a;
                QueryParameters queryParameters = new QueryParameters();
                queryParameters.b.put("ref", "article_author_page");
                xm3.a(queryParameters, (ArticleAuthorPageSortType) gzsVar.invoke());
                bu00.s(context, article, queryParameters, 116);
                return s3q0.a;
            case 4:
                Dialog dialog = (Dialog) this.c;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.d;
                DialogExt dialogExt = new DialogExt(dialog, (ProfilesInfo) null, 2, (zcl) null);
                op0 op0Var = new op0(new com.vk.movika.sdk.base.logic.interactor.f(8), i);
                qVar.getClass();
                return new vub(dialogExt, new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, op0Var), true);
            case 5:
                gzs gzsVar2 = (gzs) this.c;
                Set set = (Set) this.d;
                ClipsUploadState clipsUploadState = (ClipsUploadState) gzsVar2.invoke();
                return clipsUploadState == null ? new ClipsUploadState.Loading(set) : clipsUploadState;
            case 6:
                mdg mdgVar = (mdg) this.c;
                iag iagVar = (iag) this.d;
                if (((WallDeleteThreadResponseDto) obj).d()) {
                    cbg t = mdgVar.K.t(new ewa(new wcg(iagVar, i3), 1));
                    if (t != null) {
                        ((NewsComment) t.a).v = true;
                        mdgVar.p3(t);
                    }
                    if (!mdgVar.x7() && (sd90Var = mdgVar.Q) != null) {
                        sd90Var.g();
                    }
                    mdgVar.c8(iagVar);
                }
                return s3q0.a;
            case 7:
                xfh.a aVar = (xfh.a) this.c;
                VkImage vkImage = (VkImage) this.d;
                int i4 = xfh.a.x;
                VideoFile videoFile2 = (VideoFile) aVar.m;
                if (videoFile2 != null) {
                    aVar.q.invoke(videoFile2, vkImage);
                }
                return s3q0.a;
            case 8:
                ((hv10) obj).e((ur4) this.c, (Uri) this.d);
                return s3q0.a;
            case 9:
                cem cemVar = (cem) this.c;
                w2w w2wVar = (w2w) this.d;
                xgl0 xgl0Var = (xgl0) obj;
                int d = xgl0Var.system().d();
                Integer P2 = xgl0Var.b().e().P(cemVar.b.b);
                if (P2 != null && d == P2.intValue()) {
                    i3 = 1;
                }
                if (i3 == 1) {
                    return (dem) w2wVar.I0().c(new t9e(cemVar, 15));
                }
                if (i3 == 0) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                w2w w2wVar2 = (w2w) this.c;
                lqm lqmVar = (lqm) this.d;
                pdm c = w2wVar2.I0().b().c();
                List<rdm> list2 = lqmVar.c;
                Map<Integer, Collection<String>> map = lqmVar.e;
                List<rdm> list3 = list2;
                Collection<rdm> a = c.i().a();
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = ((ArrayList) a).iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((rdm) it.next()).a));
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((rdm) it2.next()).a));
                }
                List t0 = j5g.t0(arrayList, arrayList2);
                if (!t0.isEmpty()) {
                    xlm d2 = c.d();
                    List list4 = t0;
                    d2.b.b().f(d2.a.a, xlm.a.FOLDER_ID.getKey() + " in " + j5g.g0(list4, null, "(", ")", 0, new yy(23), 25), null);
                    f0s l = c.l();
                    l.getClass();
                    String g0 = j5g.g0(list4, null, "(", ")", 0, new oj(25), 25);
                    l.b.b().f(l.a.a, f0s.a.FOLDER_ID.getKey() + " in " + g0, null);
                    c.d.b(list4);
                }
                ldm i5 = c.i();
                i5.b.b().f(i5.a.a, null, new Object[0]);
                ldm i6 = c.i();
                i6.getClass();
                i6.b.b().h(new eo3(list3, i6, new ArrayList(), 5));
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Integer.valueOf(((rdm) it3.next()).a));
                }
                c.q(arrayList3);
                w2wVar2.I0().b().c().r(w2wVar2.I0().system().d());
                Map<Integer, Collection<Peer>> map2 = lqmVar.d;
                if (map2 != null) {
                    pdm c2 = w2wVar2.I0().b().c();
                    c2.b.b().h(new mh4(9, c2, map2));
                }
                List<gum0> list5 = lqmVar.f;
                if (list5 != null) {
                    pdm c3 = w2wVar2.I0().b().c();
                    c3.b.b().h(new ep1(c3, list5, map == null, 1));
                }
                if (map == null) {
                    return null;
                }
                pdm c4 = w2wVar2.I0().b().c();
                c4.getClass();
                if (!map.isEmpty()) {
                    c4.b.b().h(new g22(13, c4, map));
                }
                return s3q0.a;
            case 11:
                z0o.a aVar2 = (z0o.a) this.c;
                iyn iynVar = (iyn) this.d;
                Rect c5 = f4m.c(aVar2.itemView);
                Rect rect = new Rect((Rect) obj);
                rect.offset(-c5.left, -c5.top);
                aVar2.p = rect;
                if (!aVar2.o && !aVar2.n && aVar2.q == null) {
                    aVar2.q = iynVar.k;
                    aVar2.q6();
                }
                return s3q0.a;
            case 12:
                wzs wzsVar = (wzs) this.c;
                s110 s110Var = (s110) this.d;
                Integer num = (Integer) obj;
                num.intValue();
                wzsVar.invoke(Long.valueOf(s110Var.a), num);
                return s3q0.a;
            case 13:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) this.c;
                View view = (View) this.d;
                Set<String> set2 = MusicTrackCellVh.A;
                UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackCellVh.p;
                boolean P3 = j5g.P(set2, uIBlockMusicTrack2 != null ? uIBlockMusicTrack2.f : null);
                UIBlockMusicTrack uIBlockMusicTrack3 = musicTrackCellVh.p;
                if ((uIBlockMusicTrack3 == null || (musicTrack = uIBlockMusicTrack3.z) == null || !musicTrack.Vb()) && !P3 && ((uIBlockMusicTrack = musicTrackCellVh.p) == null || !uIBlockMusicTrack.Ob() || musicTrackCellVh.j)) {
                    Context context2 = view.getContext();
                    Activity h = context2 != null ? e3m.h(context2) : null;
                    UIBlockMusicTrack uIBlockMusicTrack4 = musicTrackCellVh.p;
                    if (h != null && uIBlockMusicTrack4 != null) {
                        musicTrackCellVh.e.a(new cfp0(uIBlockMusicTrack4, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.LongTap)));
                        lyd.g().k(h, uIBlockMusicTrack4.z, MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack4.f), uIBlockMusicTrack4.c);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                Context context3 = (Context) this.c;
                NotificationAction notificationAction = (NotificationAction) this.d;
                o0w b = g2v.c().b();
                long j = ((Peer) obj).b;
                JSONObject jSONObject = notificationAction.d;
                if (jSONObject == null || (str = jSONObject.optString("entry_point")) == null) {
                    str = C4504q2.x;
                }
                o0w.x(b, context3, null, j, null, null, null, false, null, null, null, null, null, null, str, null, null, null, false, null, null, null, null, null, 1073733626);
                return s3q0.a;
            case 15:
                String str2 = (String) this.c;
                OKVoipEngine.c cVar = (OKVoipEngine.c) this.d;
                JoinByLinkParams.Builder startWithVideo = ((JoinByLinkParams.Builder) obj).setLink(str2).setMyId(ParticipantId.authorized(cVar.c)).setStartWithVideo(cVar.d);
                OKVoipEngine.d dVar = cVar.h;
                return startWithVideo.setOnPrepared(dVar.a).setOnError(dVar.b).setEventListener((ConversationEventsListener) dVar.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
            case 16:
                ax1 ax1Var = (ax1) this.c;
                com.vk.music.analytics.api.collector.strategy.b bVar = (com.vk.music.analytics.api.collector.strategy.b) this.d;
                v940 v940Var = (v940) obj;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    v940Var.b(ax1Var);
                } else {
                    ((Handler) bVar.g.getValue()).post(new x8p(z2 ? 1 : 0, v940Var, ax1Var));
                }
                return s3q0.a;
            case 17:
                ucv0 ucv0Var = (ucv0) obj;
                return Boolean.valueOf(((Set) this.c).contains(ucv0Var) || ((Set) this.d).contains(ucv0Var));
            case 18:
                irb0 irb0Var = (irb0) this.c;
                izs izsVar = (izs) this.d;
                aqb0 aqb0Var = (aqb0) irb0Var.m;
                if (aqb0Var != null) {
                    izsVar.invoke(aqb0Var);
                }
                return s3q0.a;
            case 19:
                t0k0 t0k0Var = (t0k0) this.c;
                rod0 rod0Var = (rod0) this.d;
                Float f = (Float) obj;
                f.floatValue();
                t0k0Var.f = f;
                rod0Var.l.invoke(t0k0Var);
                return s3q0.a;
            case 20:
                Object obj3 = this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Throwable th = (Throwable) obj;
                synchronized (obj3) {
                    arrayList4.add(th);
                    obj3.notify();
                }
                return s3q0.a;
            case 21:
                ((BinderLifecycleMode) this.c).a(new wx0(19, (yh1) this.d, (lm50) obj));
                return s3q0.a;
            case 22:
                return new iai0((ViewGroup) obj, (csd0) this.c, (q530) this.d);
            case 23:
                sji0 sji0Var = (sji0) this.c;
                Context context4 = (Context) this.d;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN) {
                    sji0Var.c.g(new e9q0(context4, VkStepsSyncReason.BACKGROUND_SYNC, selectedDataSource));
                    sji0.e.b(sji0Var.d);
                }
                return s3q0.a;
            case 24:
                o3j0 o3j0Var = (o3j0) this.c;
                izs izsVar2 = (izs) this.d;
                nvy nvyVar = (nvy) obj;
                boolean z3 = o3j0Var.b;
                b64 b64Var = o3j0Var.c;
                int i7 = 3;
                if (z3 || b64Var != null) {
                    nvy.g(nvyVar, null, null, wki.a, 3);
                }
                if (o3j0Var.b) {
                    nvy.g(nvyVar, null, null, new jai(-2080809302, new if80(izsVar2, i2), true), 3);
                }
                if (b64Var != null) {
                    nvy.g(nvyVar, null, null, new jai(-1378874709, new ip7(i7, o3j0Var, izsVar2), true), 3);
                }
                if (o3j0Var.d) {
                    nvy.g(nvyVar, null, null, new jai(-676940116, new sz7(izsVar2, i), true), 3);
                }
                if (o3j0Var.e != null) {
                    nvy.g(nvyVar, null, null, wki.b, 3);
                    nvy.g(nvyVar, null, null, new jai(1002221326, new tpd(i2, o3j0Var, izsVar2), true), 3);
                }
                nvy.g(nvyVar, null, null, wki.c, 3);
                if (o3j0Var.f != null) {
                    nvy.g(nvyVar, null, null, new jai(823668518, new nxt(i2, o3j0Var, izsVar2), true), 3);
                }
                if (o3j0Var.g != null) {
                    nvy.g(nvyVar, null, null, new jai(-1754868835, new en7(i7, o3j0Var, izsVar2), true), 3);
                }
                nvy.g(nvyVar, null, null, new jai(-344533758, new xhd(i7, o3j0Var, izsVar2), true), 3);
                return s3q0.a;
            case 25:
                clj0 clj0Var = (clj0) this.c;
                gh8.f.a aVar3 = (gh8.f.a) this.d;
                clj0Var.e.invoke(new fh8.m.b(aVar3.a, aVar3.b));
                return s3q0.a;
            case 26:
                nzk0 nzk0Var = (nzk0) this.c;
                dw20 dw20Var = (dw20) this.d;
                gzs<s3q0> gzsVar3 = nzk0Var.g;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                }
                StatusImagePopup statusImagePopup = nzk0Var.e;
                dw20Var.Qn(statusImagePopup != null ? statusImagePopup.j : true);
                defpackage.s sVar = nzk0Var.j;
                if (sVar != null) {
                    sVar.invoke(Boolean.TRUE);
                }
                nzk0Var.j = null;
                dw20Var.hide();
                return s3q0.a;
            case 27:
                s3l0 s3l0Var = (s3l0) this.c;
                StickerStockItem stickerStockItem = (StickerStockItem) this.d;
                Throwable th2 = (Throwable) obj;
                if (s3l0Var.d == null) {
                    s3l0Var.d = new d790(stickerStockItem);
                }
                d790 d790Var = s3l0Var.d;
                s3l0Var.z(d790Var != null ? d790Var : null, true);
                h03.b(th2);
                return s3q0.a;
            case 28:
                mol0 mol0Var = (mol0) this.c;
                gr1 gr1Var = (gr1) this.d;
                mol0 mol0Var2 = (mol0) obj;
                gr1 gr1Var2 = mol0Var.d;
                return mol0.a(mol0Var2, null, gr1Var2 == null ? gr1Var : gr1Var == null ? gr1Var2 : new gr1(j5g.u0(gr1Var.a, gr1Var2.a), gr1Var2.b, gr1Var2.c, gr1Var2.d), null, null, null, LoadingState.None, 187);
            default:
                ((fpl0) this.c).e((oml0) this.d);
                return s3q0.a;
        }
    }

    public /* synthetic */ b7(hil.b bVar, ur4 ur4Var, Uri uri) {
        this.b = 8;
        this.c = ur4Var;
        this.d = uri;
    }
}
