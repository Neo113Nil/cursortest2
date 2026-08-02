package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import com.vk.ads.core.NewsFeedWatcher;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.channels.impl.channel_screen.send_msg.e;
import com.vk.channels.impl.comments.g;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.tool.view.newsfeed.mytarget.ClipEndOverlayAdWrapperView;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.preference.Preference;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.pushes.NotificationUtils;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.b;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Error;
import com.vk.superapp.common.js.bridge.api.events.OpenApp$Parameters;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vkworkout.types.SyncWorkoutReason;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.q;
import io.reactivex.rxjava3.subjects.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.aa70;
import xsna.aha0;
import xsna.aue;
import xsna.b520;
import xsna.bp50;
import xsna.bpn0;
import xsna.bqh0;
import xsna.bug;
import xsna.bzd;
import xsna.bzw;
import xsna.c40;
import xsna.c5g;
import xsna.c63;
import xsna.cbg;
import xsna.cug0;
import xsna.cvk;
import xsna.cwm;
import xsna.d1v;
import xsna.d20;
import xsna.d3m;
import xsna.dbg;
import xsna.dpd;
import xsna.drm0;
import xsna.dt20;
import xsna.e2e;
import xsna.e43;
import xsna.epx;
import xsna.f2w0;
import xsna.f4z;
import xsna.f5u;
import xsna.fbr;
import xsna.fco0;
import xsna.fxc0;
import xsna.fyr0;
import xsna.g5g;
import xsna.gaa0;
import xsna.gjh;
import xsna.gm50;
import xsna.gmq;
import xsna.gtl;
import xsna.hnd;
import xsna.i5b;
import xsna.i9b;
import xsna.iag;
import xsna.ikv0;
import xsna.ind;
import xsna.itg0;
import xsna.iwy;
import xsna.izs;
import xsna.j1z;
import xsna.j3i;
import xsna.j41;
import xsna.j500;
import xsna.j5g;
import xsna.j7k0;
import xsna.jgz;
import xsna.jhr;
import xsna.jpl0;
import xsna.jwy;
import xsna.mi3;
import xsna.n3e;
import xsna.nn4;
import xsna.o25;
import xsna.on4;
import xsna.p4g;
import xsna.p9w;
import xsna.pgg;
import xsna.ph;
import xsna.pk30;
import xsna.po1;
import xsna.puj;
import xsna.pwr0;
import xsna.qcy;
import xsna.qko0;
import xsna.rh3;
import xsna.rn4;
import xsna.rsg0;
import xsna.s2u0;
import xsna.s3q0;
import xsna.sio0;
import xsna.ste;
import xsna.t1;
import xsna.tcr;
import xsna.tho0;
import xsna.tlo0;
import xsna.tny;
import xsna.ton0;
import xsna.tq;
import xsna.u1c0;
import xsna.u3e;
import xsna.uj5;
import xsna.us2;
import xsna.vqt;
import xsna.vre0;
import xsna.vte;
import xsna.vw4;
import xsna.w4p0;
import xsna.wjs0;
import xsna.wpc0;
import xsna.wq1;
import xsna.wzs;
import xsna.xg5;
import xsna.y0x;
import xsna.y8;
import xsna.yc1;
import xsna.yfb;
import xsna.yg5;
import xsna.yh;
import xsna.yzt0;
import xsna.zga0;
import xsna.zi3;
import xsna.zkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, xsna.kte$b] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer valueOf;
        Integer b;
        int i;
        int i2;
        NotificationUtils.Type type;
        ActionLinkSnippet actionLinkSnippet;
        Good good;
        int i3 = this.b;
        int i4 = 4;
        int i5 = 2;
        int i6 = 3;
        boolean z = false;
        int i7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                l0 l0Var = (l0) obj3;
                OpenApp$Parameters openApp$Parameters = (OpenApp$Parameters) obj2;
                Throwable th = (Throwable) obj;
                if (fco0.d(th)) {
                    l0Var.w0().k(fco0.h(openApp$Parameters.i(), th));
                } else {
                    b.o(l0Var.w0().a, new JsMethod("VKWebAppOpenApp"), new OpenApp$Error(null, new OpenApp$Error.Data(OpenApp$Error.Data.Type.API_ERROR, openApp$Parameters.i(), null, fco0.g(th), 4, null), i7, null == true ? 1 : 0), null, null, 12);
                }
                return s3q0.a;
            case 1:
                ph phVar = (ph) obj3;
                qcy<Object>[] qcyVarArr = ph.n1;
                yzt0<String> yzt0Var = ((b.a.e) obj).a;
                ph.e eVar = new ph.e(1, (bqh0) obj2, bqh0.class, "setQueryText", "setQueryText(Ljava/lang/String;)V", 0);
                phVar.getClass();
                gm50.a.a(phVar, yzt0Var, eVar);
                return s3q0.a;
            case 2:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj3).invoke(new yc1.b(((wq1) obj2).b, s2u0Var.b(), s2u0Var.a()));
                return s3q0.a;
            case 3:
                rh3 rh3Var = (rh3) obj3;
                Set set = (Set) obj2;
                Integer num = (Integer) obj;
                Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_icon_positive);
                valueOf = Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28);
                if (num != null && num.intValue() == 0) {
                    return s3q0.a;
                }
                rh3Var.T(new mi3.a(false));
                f4z f4zVar = rh3Var.o;
                Set set2 = set;
                ArrayList arrayList = new ArrayList(c5g.u(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((Photo) it.next()).c));
                }
                rh3Var.T(new mi3.d(j5g.S0(arrayList)));
                int size = set.size();
                if (num != null && num.intValue() == size) {
                    f4zVar.b(new zi3.g(new j7k0(tq.h(tlo0.Companion, R.string.selected_photos_deleted), valueOf, valueOf2, null, null, null, 32)));
                } else {
                    f4zVar.b(new zi3.g(new j7k0(tq.h(tlo0.Companion, R.string.selected_photos_deleted_partial), valueOf, valueOf2, null, null, null, 32)));
                }
                return s3q0.a;
            case 4:
                final on4 on4Var = (on4) obj3;
                Context context = on4Var.a;
                Uri uri = (Uri) obj2;
                fbr.a aVar = (fbr.a) obj;
                if (aVar.e <= 0) {
                    throw new IllegalStateException("Invalid media file duration");
                }
                int i8 = ClipsEditorMusicTrack.m;
                ClipsEditorMusicTrack clipsEditorMusicTrack = new ClipsEditorMusicTrack((int) UUID.randomUUID().getLeastSignificantBits(), null, context.getString(R.string.clips_original_sound_title), aVar.e, "", uri.getPath(), null, null, false, null, false, 1986, null);
                int i9 = aVar.e;
                final String str = clipsEditorMusicTrack.g;
                if (str != null) {
                    final long j = clipsEditorMusicTrack.e;
                    q qVar = new q(new s() { // from class: xsna.mn4
                        @Override // io.reactivex.rxjava3.core.s
                        public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                            long j2 = j;
                            File file = new File(str);
                            cbr cbrVar = cbr.a;
                            File b2 = on4Var.c.j.b();
                            String str2 = System.currentTimeMillis() + "_audio";
                            cbrVar.getClass();
                            File e = cbr.e(b2, str2, "aac");
                            if (e.exists() && e.length() > 0) {
                                rVar.onNext(new rn4.b(e));
                                rVar.onComplete();
                                return;
                            }
                            try {
                                new pn4(new qn4(file, e, j2), new mz(rVar, 5)).a();
                            } catch (Exception e2) {
                                lyd.a.a("AudioExtractionEditorController", e2);
                                vhk0.b(e);
                                rVar.onError(e2);
                            }
                            rVar.onNext(new rn4.b(e));
                            rVar.onComplete();
                        }
                    });
                    e2e e2eVar = on4Var.c;
                    int i10 = 5;
                    m1 a0 = qVar.r0(e2eVar.i.e().b()).F(new n(new y8(i6), i10)).a0(e2eVar.i.e().d());
                    f fVar = new f();
                    on4Var.d = cug0.a(a0, context, new gtl(3), fVar, new yh(on4Var, i4)).subscribe(new c40(new nn4(on4Var, new ClipsEditorMusicInfo(clipsEditorMusicTrack, str, 0, i9, 0, null, 0, false, true, null, false, 1760, null), fVar, 0), i10), new j41(new po1(on4Var, i4), i5));
                }
                return s3q0.a;
            case 5:
                ((uj5) obj3).x0((StickerItem) obj2, (StickerStockItem) obj);
                return s3q0.a;
            case 6:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) obj3;
                Integer num2 = (Integer) obj2;
                g gVar = (g) obj;
                g.b bVar2 = bVar.g().c;
                return ((num2 != null && ((bVar2 == null || (b = bVar2.b()) == null) ? -1 : b.intValue()) == num2.intValue()) || !bVar.n.remove(num2)) ? gVar : g.a(gVar, com.vk.channels.impl.comments.b.s(bVar, bVar.k.a(), false, 3), null, null, false, 14);
            case 7:
                ((i5b) obj3).Z0((String) obj2);
                return s3q0.a;
            case 8:
                xg5.a().s(((i9b) obj3).f, (UserId) obj2, (r13 & 4) != 0 ? null : "open_page", (r13 & 8) != 0 ? null : "info", (r13 & 16) == 0 ? "co_owners" : null);
                ((ikv0) obj).a();
                return s3q0.a;
            case 9:
                ClipEndOverlayAdWrapperView clipEndOverlayAdWrapperView = (ClipEndOverlayAdWrapperView) obj3;
                bp50 bp50Var = (bp50) obj2;
                ClipEndOverlayAdWrapperView.e(clipEndOverlayAdWrapperView, R.string.ads_snackbar_was_hidden);
                String str2 = ((b520) obj).c;
                if (str2 != null) {
                    bp50Var.c(str2);
                }
                d3m.e(clipEndOverlayAdWrapperView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                ClipEndOverlayView.b bVar3 = clipEndOverlayAdWrapperView.i;
                if (bVar3 != null) {
                    bVar3.a();
                }
                return s3q0.a;
            case 10:
                dpd dpdVar = (dpd) obj3;
                dbg dbgVar = dpdVar.b;
                NewsComment newsComment = (NewsComment) obj2;
                vqt vqtVar = (vqt) obj;
                ListDataSet<cbg> listDataSet = dpdVar.a;
                String str3 = vqtVar.e;
                WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder = vqtVar.j;
                VKList<NewsComment> vKList = vqtVar.a;
                if (str3 == null) {
                    str3 = vqtVar.i;
                }
                CommentThread commentThread = newsComment.L;
                if (commentThread != null) {
                    commentThread.h = str3;
                }
                if (vKList.isEmpty()) {
                    i = -1;
                } else {
                    g5g.D(vKList, true, new vw4(newsComment, 3));
                    CommentThread commentThread2 = newsComment.L;
                    CommentThread commentThread3 = commentThread2 != null ? new CommentThread(commentThread2.b, commentThread2.c, commentThread2.d, commentThread2.e, new ArrayList(commentThread2.f), commentThread2.g, commentThread2.h, commentThread2.i, commentThread2.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                    commentThread3.f.addAll(vKList);
                    newsComment.L = commentThread3;
                    ArrayList c = dbg.c(dbgVar, newsComment, vKList);
                    cbg cbgVar = (cbg) j5g.a0(c);
                    if (cbgVar != null) {
                        int a = dpdVar.a(cbgVar.b);
                        if (a != -1) {
                            cbg c2 = listDataSet.c(a);
                            iag iagVar = c2 != null ? c2.b : null;
                            int size2 = c.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                cbg cbgVar2 = (cbg) j5g.b0(i11, c);
                                if (cbgVar2 != null) {
                                    cbgVar2.b = iagVar;
                                }
                            }
                            listDataSet.y(a + 1, c);
                            i2 = a + c.size();
                        } else {
                            listDataSet.n0(c);
                            i2 = listDataSet.d.size();
                        }
                    } else {
                        i2 = -1;
                    }
                    i = i2 + 1;
                }
                int b2 = dpdVar.b(newsComment);
                if (b2 > 0) {
                    listDataSet.A(b2);
                    i = b2;
                }
                CommentThread commentThread4 = newsComment.L;
                CommentThread commentThread5 = commentThread4 != null ? new CommentThread(commentThread4.b, commentThread4.c, commentThread4.d, commentThread4.e, new ArrayList(commentThread4.f), commentThread4.g, commentThread4.h, commentThread4.i, commentThread4.j) : new CommentThread(0, false, false, false, new ArrayList(), null, null, false, null);
                commentThread5.g = wallNegativeRepliesPlaceholder;
                newsComment.L = commentThread5;
                String str4 = vqtVar.e;
                if ((str4 != null && str4.length() != 0) || wallNegativeRepliesPlaceholder != null) {
                    ArrayList arrayList2 = new ArrayList();
                    dbg.f(dbgVar, newsComment, wallNegativeRepliesPlaceholder, arrayList2);
                    if (i >= 0) {
                        listDataSet.y(i, arrayList2);
                    } else {
                        listDataSet.n0(arrayList2);
                    }
                }
                return s3q0.a;
            case 11:
                File file = (File) obj2;
                ((bzd) obj3).d.getClass();
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                com.vk.core.files.b.c(new com.vk.core.files.b(context2), file, null, 6).subscribe();
                return s3q0.a;
            case 12:
                ((n3e) obj3).l.invoke(((u3e) obj2).b);
                return s3q0.a;
            case 13:
                L.i((Throwable) obj);
                ((ste) obj3).T(new vte.d(((aue.b) obj2).e.a));
                return s3q0.a;
            case 14:
                CoauthorsInviteDialog coauthorsInviteDialog = (CoauthorsInviteDialog) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                if (((ShortVideoSetCoOwnerStatusResponseDto) j5g.Y((List) obj)).d()) {
                    ClipVideoFile clipVideoFile = coauthorsInviteDialog.b;
                    wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile, false, null, null, j5g.s0(clipVideoFile.N1, j5g.Y(arrayList3)), null, null, null, 8355839)));
                    wjs0.a(pwr0.a);
                    ((ind) coauthorsInviteDialog.d.getValue()).c(new hnd.b(false, 1, 1), true);
                }
                return s3q0.a;
            case 15:
                j3i j3iVar = (j3i) obj2;
                ((bug) obj3).l.invoke(j3iVar.b, j3iVar.c);
                return s3q0.a;
            case 16:
                ((gjh) obj3).c.invoke(new d.t.b.a((f5u) obj2, ((gmq) obj).X()));
                return s3q0.a;
            case 17:
                puj pujVar = (puj) obj3;
                us2 us2Var = (us2) obj;
                if (!pujVar.u && pujVar.v) {
                    sio0 sio0Var = pujVar.t.e;
                    if (sio0Var != null) {
                        List l = e43.l(new jhr(), new pgg(us2Var, 1));
                        j1z j1zVar = pujVar.t;
                        cwm cwmVar = j1zVar.d;
                        bzw bzwVar = j1zVar.v;
                        tho0 c3 = cwmVar.c(l);
                        sio0Var.a(null, c3);
                        bzwVar.invoke(c3);
                    } else {
                        tho0 tho0Var = pujVar.s;
                        String str5 = tho0Var.a.c;
                        long j2 = tho0Var.b;
                        int i12 = qko0.c;
                        String obj4 = drm0.Y(str5, (int) (j2 >> 32), (int) (j2 & 4294967295L), us2Var).toString();
                        int length = us2Var.c.length() + ((int) (pujVar.s.b >> 32));
                        pujVar.t.v.invoke(new tho0(obj4, jgz.c(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                FiltersView filtersView = (FiltersView) obj3;
                tcr tcrVar = (tcr) obj2;
                Float f = (Float) obj;
                final float floatValue = f.floatValue();
                filtersView.t.i.H0(new zkh(tcrVar.a, 14), new izs() { // from class: xsna.dgr
                    @Override // xsna.izs
                    public final Object invoke(Object obj5) {
                        tcr tcrVar2 = (tcr) obj5;
                        int i13 = FiltersRecyclerView.j;
                        tcrVar2.f = floatValue;
                        return tcrVar2;
                    }
                });
                wzs<? super FilterType, ? super Float, s3q0> wzsVar = filtersView.w;
                if (wzsVar != null) {
                    wzsVar.invoke(tcrVar.a, f);
                }
                return s3q0.a;
            case 19:
                t1 t1Var = (t1) obj2;
                tny tnyVar = (tny) obj;
                w4p0 w4p0Var = ((jpl0.a.d) obj3).a.i;
                if ((w4p0Var != null ? w4p0Var.a : null) == HintId.MARKET_STOREFRONT_FILTERS_BUTTON) {
                    t1Var.invoke(jgz.p(tnyVar).z(tnyVar, true));
                }
                return s3q0.a;
            case 20:
                d1v d1vVar = (d1v) obj3;
                Context context3 = (Context) obj2;
                SelectedDataSource selectedDataSource = (SelectedDataSource) obj;
                if (selectedDataSource != SelectedDataSource.UNKNOWN) {
                    f2w0.b.a(d1vVar.b, context3, new ton0(SyncWorkoutReason.APP_START, false), null, null, selectedDataSource, 28);
                }
                return s3q0.a;
            case 21:
                Context context4 = (Context) obj3;
                ImMsgPushSettingsProvider.Type type2 = (ImMsgPushSettingsProvider.Type) obj2;
                if (((Boolean) obj).booleanValue()) {
                    switch (p9w.c.$EnumSwitchMapping$0[type2.ordinal()]) {
                        case 1:
                            type = NotificationUtils.Type.PrivateMessages;
                            break;
                        case 2:
                            type = NotificationUtils.Type.ChatMessages;
                            break;
                        case 3:
                            type = NotificationUtils.Type.CommunityChannelsMessages;
                            break;
                        case 4:
                            type = NotificationUtils.Type.VkAppChannels;
                            break;
                        case 5:
                        case 6:
                            type = NotificationUtils.Type.Calls;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    NotificationUtils.k(context4, type, true);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 22:
                ((View.OnClickListener) obj3).onClick((View) obj);
                ((y0x) obj2).f(!r9.e);
                return s3q0.a;
            case 23:
                jwy jwyVar = (jwy) obj3;
                jwyVar.d.j(obj2);
                return new iwy(jwyVar, obj2);
            case 24:
                j500 j500Var = (j500) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                LiveEventModel liveEventModel = (LiveEventModel) obj;
                if (liveEventModel.c == 12) {
                    ActionLink m1 = videoFile.m1();
                    videoFile.u7(liveEventModel.F);
                    wjs0.a(new fyr0(videoFile));
                    if ((fxc0.B().J().z0() || fxc0.B().J().q()) && m1 != null) {
                        ActionLink m12 = videoFile.m1();
                        if (!epx.f(m12 != null ? m12.f : null, m1.f)) {
                            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                            yg5 e = b.C1208b.a().e(videoFile, null);
                            VideoAutoPlay videoAutoPlay = e instanceof VideoAutoPlay ? (VideoAutoPlay) e : null;
                            if (videoAutoPlay != null) {
                                d20 d20Var = (d20) j500Var.b.getValue();
                                ActionLink m13 = videoFile.m1();
                                long j3 = (m13 == null || (actionLinkSnippet = m13.f) == null || (good = actionLinkSnippet.j) == null) ? 0L : good.b;
                                String str6 = videoAutoPlay.K;
                                String type3 = videoFile.getType();
                                MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype eventSubtype = fxc0.B().J().z0() ? MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype.PRODUCT_CARD : MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardClose.EventSubtype.OLD_ACTION;
                                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null);
                                long o0 = videoFile.o0();
                                long j4 = videoFile.I0().b;
                                d20Var.getClass();
                                d20.b(j3, str6, type3, schemeStat$EventItem, eventSubtype, o0, j4);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 25:
                r rVar = (r) obj3;
                dt20 dt20Var = (dt20) obj2;
                gaa0.b bVar4 = (gaa0.b) obj;
                if (bVar4 instanceof gaa0.a) {
                    rVar.onError(((gaa0.a) bVar4).a);
                } else {
                    if (!(bVar4 instanceof gaa0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gaa0.c cVar = (gaa0.c) bVar4;
                    String str7 = cVar.a;
                    if (epx.f(str7, dt20Var.b)) {
                        itg0.n(rsg0.W(yfb.x(zga0.p(new aha0(), o25.a().c(), null, Collections.singletonList(str7), 2)), 7));
                        rVar.onNext(cVar.b);
                    }
                }
                ((vre0) dt20Var.e.getValue()).f("enhancephoto_tag");
                return s3q0.a;
            case 26:
                pk30 pk30Var = (pk30) obj2;
                Msg msg = ((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.d) obj3).n;
                a aVar2 = msg instanceof a ? (a) msg : null;
                if (aVar2 != null) {
                    pk30Var.w(aVar2);
                }
                return s3q0.a;
            case 27:
                NewsFeedWatcher newsFeedWatcher = (NewsFeedWatcher) obj3;
                u1c0 u1c0Var = (u1c0) obj2;
                Integer j5 = p4g.j(u1c0Var, newsFeedWatcher.j);
                if (j5 == null) {
                    return 0;
                }
                int intValue = j5.intValue();
                int i13 = intValue + 1;
                while (e43.h(newsFeedWatcher.j) >= i13 && epx.f(newsFeedWatcher.j.get(i13).b, u1c0Var.b) && !NewsFeedWatcher.l.contains(Integer.valueOf(newsFeedWatcher.j.get(i13).c))) {
                    i13++;
                }
                return Integer.valueOf(i13 - intValue);
            case 28:
                io.reactivex.rxjava3.core.b bVar5 = (io.reactivex.rxjava3.core.b) obj2;
                aa70.a aVar3 = ((aa70) obj3).a;
                if (aVar3 != null) {
                    c63.c(aVar3);
                }
                SharedPreferences.Editor edit = Preference.f("notification_gdpr_dialog").edit();
                edit.putBoolean("dialog_already_shown", true);
                edit.apply();
                bVar5.onComplete();
                return s3q0.a;
            default:
                wpc0 wpc0Var = (wpc0) obj;
                ((izs) obj3).invoke(wpc0Var);
                ((e) obj2).invoke(wpc0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ o(Context context, p9w p9wVar, ImMsgPushSettingsProvider.Type type) {
        this.b = 21;
        this.c = context;
        this.d = type;
    }
}
