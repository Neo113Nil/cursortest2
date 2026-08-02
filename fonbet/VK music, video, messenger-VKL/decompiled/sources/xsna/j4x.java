package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.Editable;
import android.view.Surface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ironsource.C4504q2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioGetFeedPlaylistsBlockResponseDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.market.dto.MarketCountersFilterDto;
import com.vk.api.generated.market.dto.MarketGetCountersResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoQualitiesDownloadInfoResponseDto;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastSliderItem;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarousel;
import com.vk.dto.discover.carousel.playlist.PlaylistsCarouselItem;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.views.RichEditText;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.money.MoneyTransferPagerFragment;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.pushes.NotificationUtils;
import com.vk.pushes.dto.PushMessage;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.l;
import org.json.JSONObject;
import xsna.aop0;
import xsna.bex0;
import xsna.bfz;
import xsna.gm50;
import xsna.k65;
import xsna.lc50;
import xsna.lc80;
import xsna.mw00;
import xsna.onp0;
import xsna.q8v;
import xsna.qv4;
import xsna.sn90;
import xsna.vqm;
import xsna.wf20;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class j4x implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j4x(PlaylistsCarousel playlistsCarousel, a350 a350Var) {
        this.b = 20;
        this.c = playlistsCarousel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d2  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r19v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        h210 h210Var;
        UserId userId;
        UserId userId2;
        boolean z;
        ?? r4;
        AttachAudioMsg a7;
        Object obj3;
        Attachment b;
        int i = 12;
        int i2 = 3;
        int i3 = 2;
        int i4 = 0;
        switch (this.b) {
            case 0:
                ((k4x) this.c).p = ((k4x) ((npp0) obj)).q;
                return Boolean.FALSE;
            case 1:
                n5y n5yVar = (n5y) this.c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", ((Boolean) obj).booleanValue());
                bex0.a.b(n5yVar.a, JsApiMethodType.IS_NATIVE_PAYMENT_ENABLED, jSONObject, null, 12);
                return s3q0.a;
            case 2:
                LeadFormHolder leadFormHolder = (LeadFormHolder) this.c;
                cvk.u(R.string.lead_ads_send_error, false);
                leadFormHolder.J = false;
                return s3q0.a;
            case 3:
                dfz dfzVar = (dfz) this.c;
                sxp sxpVar = (sxp) obj;
                if (!(sxpVar instanceof m580)) {
                    if (!(sxpVar instanceof x580)) {
                        return Optional.empty();
                    }
                    x580 x580Var = (x580) sxpVar;
                    if (dfzVar.c()) {
                        x580Var.getClass();
                    }
                    x580Var.getClass();
                    return dfzVar.c instanceof bfz.a.C2608a ? Optional.of(bfz.a.b.a) : Optional.empty();
                }
                m580 m580Var = (m580) sxpVar;
                if (!(dfzVar.c instanceof bfz.a.e) && m580Var.c == null) {
                    return Optional.of(bfz.a.b.a);
                }
                InfoBar infoBar = m580Var.c;
                if (infoBar != null) {
                    obj2 = dfz.b(infoBar);
                } else {
                    dfzVar.d();
                    obj2 = bfz.a.b.a;
                }
                return Optional.of(obj2);
            case 4:
                MarketGetCountersResponseDto marketGetCountersResponseDto = (MarketGetCountersResponseDto) obj;
                int i5 = mw00.a.$EnumSwitchMapping$0[((MarketCountersFilterDto) this.c).ordinal()];
                if (i5 == 1) {
                    Integer e = marketGetCountersResponseDto.e();
                    if (e != null) {
                        i4 = e.intValue();
                    }
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer d = marketGetCountersResponseDto.d();
                    if (d != null) {
                        i4 = d.intValue();
                    }
                }
                return Integer.valueOf(i4);
            case 5:
                m210 m210Var = (m210) this.c;
                h210 h210Var2 = m210Var.q;
                if ((h210Var2 == null || (userId2 = h210Var2.d) == null || fkq0.c(userId2)) && (h210Var = m210Var.q) != null && (userId = h210Var.d) != null) {
                    m210Var.l.a(userId);
                }
                return s3q0.a;
            case 6:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                y410.b bVar = (y410.b) obj;
                NestedScrollView nestedScrollView = marketItemReviewsFragment.h0;
                if (nestedScrollView == null) {
                    nestedScrollView = null;
                }
                bwt0.p0(nestedScrollView, true);
                View view = marketItemReviewsFragment.j0;
                if (view == null) {
                    view = null;
                }
                bwt0.p0(view, true);
                SwipeRefreshLayout swipeRefreshLayout = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                bwt0.p0(swipeRefreshLayout, false);
                SwipeRefreshLayout swipeRefreshLayout2 = marketItemReviewsFragment.g0;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setRefreshing(false);
                LinearLayout linearLayout = marketItemReviewsFragment.d0;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                bwt0.p0(linearLayout, false);
                VkPlaceholder vkPlaceholder = marketItemReviewsFragment.i0;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                bwt0.p0(vkPlaceholder, false);
                VkSpinner vkSpinner = marketItemReviewsFragment.b0;
                bwt0.p0(vkSpinner != null ? vkSpinner : null, false);
                gm50.a.a(marketItemReviewsFragment, bVar.f, new zkh(marketItemReviewsFragment, 29));
                int i6 = 25;
                gm50.a.a(marketItemReviewsFragment, bVar.g, new qcl(marketItemReviewsFragment, i6));
                gm50.a.a(marketItemReviewsFragment, bVar.h, new rop(marketItemReviewsFragment, 15));
                gm50.a.a(marketItemReviewsFragment, bVar.i, new fgh(marketItemReviewsFragment, 28));
                gm50.a.a(marketItemReviewsFragment, bVar.a, new l2i(marketItemReviewsFragment, 27));
                gm50.a.a(marketItemReviewsFragment, bVar.b, new ire(marketItemReviewsFragment, 26));
                gm50.a.a(marketItemReviewsFragment, bVar.c, new cqv(marketItemReviewsFragment, i));
                gm50.a.a(marketItemReviewsFragment, bVar.d, new wpg(marketItemReviewsFragment, i6));
                gm50.a.a(marketItemReviewsFragment, bVar.e, new kdn(marketItemReviewsFragment, 17));
                return s3q0.a;
            case 7:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c).k((Throwable) obj);
                return s3q0.a;
            case 8:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new com.vk.mediapicker.impl.presentation.mvi.d((com.vk.mediapicker.impl.presentation.mvi.b) this.c, null), 3));
            case 9:
                s020 s020Var = (s020) this.c;
                Float f = (Float) obj;
                g5p g5pVar = ((EditorState) s020Var.c.d().b.b.getValue()).b.get(u020.a);
                if ((g5pVar instanceof o020 ? (o020) g5pVar : null) == null) {
                    return s3q0.a;
                }
                com.vk.photo.editor.ivm.d d2 = s020Var.c.d();
                ((Handler) d2.g.getValue()).post(new z(i3, d2, new EditorMessage.i(new o020(f), null, 2)));
                return s3q0.a;
            case 10:
                c320 c320Var = (c320) this.c;
                c320Var.b = obj;
                c320Var.c = System.currentTimeMillis();
                c320Var.d = null;
                return s3q0.a;
            case 11:
                ec20 ec20Var = (ec20) this.c;
                lc80 lc80Var = (lc80) obj;
                if (lc80Var instanceof lc80.b) {
                    lc80.b bVar2 = (lc80.b) lc80Var;
                    return new aop0.a(bVar2.e, ec20Var.b(bVar2.f), ec20Var.b(bVar2.g));
                }
                if (!(lc80Var instanceof lc80.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = ((lc80.a) lc80Var).e;
                return new aop0.b(i7 != 1 ? i7 != 2 ? onp0.d.a : onp0.b.a : onp0.c.a);
            case 12:
                vf20 vf20Var = (vf20) this.c;
                q8v q8vVar = (q8v) obj;
                io.reactivex.rxjava3.subjects.f<wf20> fVar = vf20Var.f;
                if (q8vVar instanceof q8v.c) {
                    w8v w8vVar = ((q8v.c) q8vVar).a;
                    yf20 yf20Var = vf20Var.c;
                    List<Msg> k = w8vVar.b.k();
                    if (k.isEmpty()) {
                        yf20Var.b();
                    } else {
                        yf20Var.e();
                    }
                    yf20Var.i();
                    ia20 ia20Var = vf20Var.b;
                    ReentrantReadWriteLock reentrantReadWriteLock = ia20Var.f;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i8 = 0; i8 < readHoldCount; i8++) {
                        readLock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        f1e0 m = ia20Var.a.m(k);
                        if (m.f()) {
                            while (i4 < readHoldCount) {
                                readLock.lock();
                                i4++;
                            }
                            writeLock.unlock();
                        } else {
                            ProfilesInfo a = ia20Var.b.a(ia20Var.a(m));
                            io.reactivex.rxjava3.subjects.d<ProfilesInfo> dVar = ia20Var.d;
                            ProfilesInfo P0 = dVar.P0();
                            P0.getClass();
                            ProfilesInfo profilesInfo = new ProfilesInfo(P0);
                            profilesInfo.Hb(a);
                            dVar.onNext(profilesInfo);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        yf20Var.c();
                        fVar.onNext(new wf20.b(w8vVar));
                    } finally {
                        while (i4 < readHoldCount) {
                            readLock.lock();
                            i4++;
                        }
                        writeLock.unlock();
                    }
                } else if (q8vVar instanceof q8v.b) {
                    fVar.onNext(new wf20.a(((q8v.b) q8vVar).a));
                } else {
                    if (!(q8vVar instanceof q8v.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z2 = ((q8v.a) q8vVar).a;
                    vf20Var.m.onNext(new fo1(vf20Var, i2));
                }
                return s3q0.a;
            case 13:
                ModalPostReactionsFragment.go((ModalPostReactionsFragment) this.c, false, 11);
                return s3q0.a;
            case 14:
                MoneyTransferPagerFragment moneyTransferPagerFragment = (MoneyTransferPagerFragment) this.c;
                Throwable th = (Throwable) obj;
                int i9 = MoneyTransferPagerFragment.w0;
                j03.l(th);
                L.i(th);
                moneyTransferPagerFragment.onError(th);
                return s3q0.a;
            case 15:
                ah30 ah30Var = (ah30) this.c;
                dv30 dv30Var = (dv30) obj;
                b25 b25Var = ah30Var.c;
                Dialog dialog = dv30Var.b;
                Msg msg = dv30Var.c;
                long j = dv30Var.a;
                Context context = ah30Var.a;
                int kc = dialog.kc();
                ?? r2 = (kc == 0 || kc == 1) && !z4g.d().w(com.vk.dto.common.a.b(ah30Var.b.q()), NotificationCompat.CATEGORY_MESSAGE);
                ?? r11 = !lsn.b() && NotificationUtils.c(context, com.vk.dto.common.b.c(j) ? NotificationUtils.Type.CommunityMessages : dialog.rc() ? NotificationUtils.Type.PrivateMessages : dialog.uc() ? NotificationUtils.Type.ChatMessages : NotificationUtils.Type.PrivateMessages, b25Var.c());
                if (com.vk.dto.common.b.c(j)) {
                    UserId userId3 = new UserId(-j);
                    if (BuildInfo.t()) {
                        aaw.b.getClass();
                        z = aaw.c().getBoolean("are_notifications_enabled_for_" + NotificationUtils.Type.CommunityMessages + userId3, true);
                    } else {
                        z = Preference.g(context).getBoolean(C4504q2.x + NotificationUtils.Type.CommunityMessages.key + userId3.b, true);
                    }
                } else {
                    z = true;
                }
                xuo0.a.getClass();
                ?? r22 = r2 == true && r11 == true && z && dialog.Ac(xuo0.a());
                boolean z3 = msg.i;
                boolean Fc = dialog.Fc(msg);
                boolean z4 = msg instanceof MsgFromUser;
                ?? r13 = z4 && ((MsgFromUser) msg).hc();
                List e2 = qa20.b.a.e(dialog.Sb(), Long.valueOf(j));
                if (!(e2 instanceof Collection) || !e2.isEmpty()) {
                    Iterator it = e2.iterator();
                    while (it.hasNext()) {
                        if (((PushMessage) it.next()).b == msg.d) {
                            r4 = false;
                            boolean z5 = (r22 == true || !z3 || Fc || r13 == true || msg.k || !(r4 == true || (!z4 && (a7 = ((MsgFromUser) msg).a7()) != null && a7.I5()) == true) || dv30Var.f || epx.f(msg.getFrom(), com.vk.dto.common.a.a(b25Var.c()))) ? false : true;
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{"MsgAddHandler", p2i0.c.a("[Push]: shouldShow=" + z5 + ' ' + dv30Var)});
                            }
                            return Boolean.valueOf(z5);
                        }
                    }
                }
                r4 = true;
                if (r22 == true) {
                }
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                }
                return Boolean.valueOf(z5);
            case 16:
                kz30 kz30Var = (kz30) this.c;
                vqm.a aVar = (vqm.a) obj;
                DraftMsg draftMsg = aVar.a;
                ProfilesSimpleInfo profilesSimpleInfo = aVar.c;
                if (draftMsg.d()) {
                    DraftMsg draftMsg2 = aVar.a;
                    Iterator it2 = draftMsg2.e.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (obj3 instanceof AttachAudioMsg) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (!(obj3 instanceof AttachAudioMsg)) {
                        obj3 = null;
                    }
                    AttachAudioMsg attachAudioMsg = (AttachAudioMsg) obj3;
                    if (attachAudioMsg != null) {
                        vu4 vu4Var = kz30Var.J;
                        if (vu4Var == null) {
                            vu4Var = null;
                        }
                        vu4Var.E.b("showDraft");
                        vu4Var.Y0();
                        vu4Var.D.a.onNext(new qv4.b(Uri.parse(attachAudioMsg.j), attachAudioMsg.g, attachAudioMsg.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false));
                    }
                    for (Attach attach : draftMsg2.e) {
                        if (!epx.f(attach, attachAudioMsg) && (b = wdw.b(attach, profilesSimpleInfo, false, 4)) != null) {
                            WriteBar writeBar = kz30Var.t;
                            if (writeBar == null) {
                                writeBar = null;
                            }
                            writeBar.A1(b);
                        }
                    }
                    WriteBar writeBar2 = kz30Var.t;
                    if (writeBar2 == null) {
                        writeBar2 = null;
                    }
                    writeBar2.x(draftMsg2.g);
                    CharSequence a2 = kz30Var.U.a(draftMsg2.c, draftMsg2.d);
                    WriteBar writeBar3 = kz30Var.t;
                    if (writeBar3 == null) {
                        writeBar3 = null;
                    }
                    writeBar3.setText(s420.a(a2));
                    RichEditText richEditText = kz30Var.B;
                    RichEditText richEditText2 = richEditText == null ? null : richEditText;
                    if (richEditText == null) {
                        richEditText = null;
                    }
                    Editable text = richEditText.getText();
                    richEditText2.setSelection(text != null ? text.length() : 0);
                    WriteBar writeBar4 = kz30Var.t;
                    WriteBar writeBar5 = writeBar4 != null ? writeBar4 : null;
                    MsgFromUser msgFromUser = aVar.b;
                    writeBar5.Y(msgFromUser, profilesSimpleInfo, cdi.A(kz30Var.m, msgFromUser), false);
                    kz30Var.E();
                } else {
                    WriteBar writeBar6 = kz30Var.t;
                    (writeBar6 != null ? writeBar6 : null).L();
                }
                kz30Var.r = false;
                return s3q0.a;
            case 17:
                t840 t840Var = (t840) this.c;
                tc50 tc50Var = t840Var.n;
                if (tc50Var != null) {
                    t840Var.l.invoke(tc50Var.b);
                }
                return s3q0.a;
            case 18:
                ((MusicCatalogRootVh) this.c).m.b.e.b(new t8f0(new xht(i), false), false);
                return s3q0.a;
            case 19:
                ((MusicFollowCuratorButtonVh) this.c).f = null;
                return s3q0.a;
            case 20:
                PlaylistsCarousel playlistsCarousel = (PlaylistsCarousel) this.c;
                AudioGetFeedPlaylistsBlockResponseDto audioGetFeedPlaylistsBlockResponseDto = (AudioGetFeedPlaylistsBlockResponseDto) obj;
                playlistsCarousel.e = false;
                List<AudioPlaylistDto> d3 = audioGetFeedPlaylistsBlockResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d3, 10));
                for (AudioPlaylistDto audioPlaylistDto : d3) {
                    jt4.a.getClass();
                    arrayList.add(new PlaylistsCarouselItem(jt4.a(audioPlaylistDto)));
                }
                playlistsCarousel.o = arrayList;
                playlistsCarousel.q = audioGetFeedPlaylistsBlockResponseDto.f();
                playlistsCarousel.r = audioGetFeedPlaylistsBlockResponseDto.e();
                return playlistsCarousel;
            case 21:
                ((hd50) this.c).d.invoke(lc50.b.C3261b.b);
                return s3q0.a;
            case 22:
                pr50 pr50Var = (pr50) this.c;
                NewsEntry t6 = pr50Var.t6();
                if (t6 != null) {
                    pr50Var.a0.E6(t6);
                }
                return s3q0.a;
            case 23:
                bi20 bi20Var = (bi20) this.c;
                return new UIBlockPodcastSliderItem(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (PodcastSliderItem) obj);
            case 24:
                ((m670) this.c).a.update(new k65.a("Could not get a nonce.", (Throwable) obj));
                return s3q0.a;
            case 25:
                io.reactivex.rxjava3.subjects.a aVar2 = (io.reactivex.rxjava3.subjects.a) this.c;
                aVar2.onNext(new VideoGetVideoQualitiesDownloadInfoResponseDto(EmptyList.b));
                aVar2.onComplete();
                return s3q0.a;
            case 26:
                bo90 bo90Var = (bo90) this.c;
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof fyr0) {
                    bo90Var.C(new sn90.f(((fyr0) bwr0Var).a));
                } else if (bwr0Var instanceof wxr0) {
                    bo90Var.C(new sn90.e(((wxr0) bwr0Var).a));
                }
                return s3q0.a;
            case 27:
                Object obj4 = ((v3a0) this.c).o;
                x3a0 x3a0Var = (x3a0) (obj4 != null ? obj4 : null);
                g4a0 g4a0Var = x3a0Var.A;
                g4a0Var.getClass();
                g4a0Var.a(new kun(com.vk.registration.funnels.b.a, 3));
                y3a0 y3a0Var = (y3a0) x3a0Var.a;
                if (y3a0Var != null) {
                    y3a0Var.Cg(x3a0Var.x);
                }
                return s3q0.a;
            case 28:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).T(new d.f((Set) obj));
                return s3q0.a;
            default:
                ((v020) this.c).a.j0(new l.b((Surface) obj));
                return s3q0.a;
        }
    }

    public /* synthetic */ j4x(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ j4x(w060 w060Var, bi20 bi20Var) {
        this.b = 23;
        this.c = bi20Var;
    }
}
