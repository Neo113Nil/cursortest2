package xsna;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockProfileClipDrafts;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicCatalogShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.ClipDraftsBlockVh;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.WaveFormView;
import com.vk.log.L;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vk.posting.presentation.articlepicker.c;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a7b;
import xsna.akv;
import xsna.ca9;
import xsna.dob;
import xsna.gm50;
import xsna.hr8;
import xsna.ij20;
import xsna.me8;
import xsna.q0e;
import xsna.qv4;
import xsna.rd8;
import xsna.tra0;
import xsna.wzd;
import xsna.y7f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class op1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ op1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v69, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ww50<?> Y;
        String str;
        int i = this.b;
        int i2 = 5;
        int i3 = 4;
        Object aVar = null;
        r5 = null;
        FragmentImpl fragmentImpl = null;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                VKList vKList = new VKList();
                vKList.addAll((VKList) obj2);
                vKList.addAll((VKList) obj);
                return new AlbumsRepository.a(vKList, true);
            case 1:
                Article article = (Article) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(article.b), "id");
                w9yVar.e(article.c, "owner_id");
                w9yVar.e(article.d, "access_key");
                w9yVar.d(Long.valueOf(article.e), "published_date");
                w9yVar.e(article.f, "title");
                w9yVar.e(article.g, "subtitle");
                w9yVar.g("owner", article.h);
                w9yVar.e(article.i, "url");
                w9yVar.e(article.j, "view_url");
                w9yVar.e(article.k, "state");
                w9yVar.g("photo", article.l);
                w9yVar.c(Integer.valueOf(article.m), "views");
                w9yVar.b(Boolean.valueOf(article.n), "is_favorite");
                w9yVar.b(Boolean.valueOf(article.o), "can_report");
                w9yVar.b(Boolean.valueOf(article.p), "no_footer");
                w9yVar.g("donut", article.q);
                w9yVar.e(article.r, "marusya_tts");
                w9yVar.e(article.s, "lead_description");
                w9yVar.c(Integer.valueOf(article.t), "time_to_read");
                w9yVar.b(Boolean.valueOf(article.u), "can_edit");
                return s3q0.a;
            case 2:
                ArticlePickerFragment articlePickerFragment = (ArticlePickerFragment) obj2;
                com.vk.posting.presentation.articlepicker.c cVar = (com.vk.posting.presentation.articlepicker.c) obj;
                int i5 = ArticlePickerFragment.V;
                LayoutInflater.Factory activity = articlePickerFragment.getActivity();
                if (activity == null) {
                    return s3q0.a;
                }
                if (cVar instanceof c.a) {
                    c.a aVar2 = (c.a) cVar;
                    articlePickerFragment.R.getClass();
                    if (!(aVar2 instanceof c.a.C1530a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.a.C1530a c1530a = (c.a.C1530a) aVar2;
                    ArticleAttachment articleAttachment = c1530a.a;
                    am50 am50Var = c1530a.b;
                    Intent intent = new Intent();
                    intent.putExtra("article_attach", articleAttachment);
                    am50Var.a(intent);
                    ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                        fragmentImpl = Y.u();
                    }
                    if (fragmentImpl != null) {
                        fragmentImpl.Mf(-1, intent);
                    }
                } else {
                    if (!(cVar instanceof c.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fp3 fp3Var = articlePickerFragment.Q;
                    fp3 fp3Var2 = fp3Var != null ? fp3Var : null;
                    ((c.b.a) cVar).a.a(fp3Var2.f, new ff90(fp3Var2.b.getString(R.string.article_list_empty), 30, 50));
                }
                return s3q0.a;
            case 3:
                pv4 pv4Var = (pv4) obj2;
                qv4.d dVar = (qv4.d) obj;
                WaveFormView waveFormView = pv4Var.k;
                if (waveFormView == null) {
                    waveFormView = null;
                }
                waveFormView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                WaveFormView waveFormView2 = pv4Var.k;
                (waveFormView2 != null ? waveFormView2 : null).c(dVar.d, dVar.c);
                return s3q0.a;
            case 4:
                cr6 cr6Var = (cr6) obj2;
                cr6Var.x.invoke(cr6Var.y ? c.s0.a.C1980c.b : c.s0.a.C1979a.b);
                return s3q0.a;
            case 5:
                g27 g27Var = (g27) obj2;
                Integer num = (Integer) obj;
                NewsEntry q6 = g27Var.q6();
                if (q6 != null) {
                    g27Var.T.a(num.intValue(), q6);
                }
                return s3q0.a;
            case 6:
                kf7 kf7Var = (kf7) obj;
                CharSequence f = kf7Var.f();
                int e = kf7Var.e();
                char c = ((com.vk.core.compose.component.datetime.a) obj2).a;
                if (e < 0) {
                    throw new IllegalArgumentException(tgw.b(e, "Desired length ", " is less than zero."));
                }
                if (e <= f.length()) {
                    return f.subSequence(0, f.length());
                }
                StringBuilder sb = new StringBuilder(e);
                sb.append(f);
                int length = e - f.length();
                if (1 <= length) {
                    while (true) {
                        sb.append(c);
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return sb;
            case 7:
                qcy<Object>[] qcyVarArr = BookingCalendarScreenFragment.U;
                wr7.a((BookingCalendarScreenFragment) obj2, (as7) obj);
                return s3q0.a;
            case 8:
                rd8 rd8Var = (rd8) obj;
                int i6 = BroadcastConfigFragment.U;
                ((BroadcastConfigFragment) obj2).Q.getClass();
                if (rd8Var instanceof rd8.d) {
                    aVar = me8.c.a;
                } else if (rd8Var instanceof rd8.b) {
                    aVar = new me8.b(((rd8.b) rd8Var).a);
                } else if (rd8Var instanceof rd8.a) {
                    rd8.a aVar3 = (rd8.a) rd8Var;
                    aVar = new me8.a(aVar3.b, aVar3.c, aVar3.d, aVar3.e, aVar3.f, aVar3.g, aVar3.h);
                }
                return new it80(aVar);
            case 9:
                ((zak0) ((hr8) obj2).e).setValue((hr8.a) obj);
                return s3q0.a;
            case 10:
                m99 m99Var = (m99) obj2;
                Map map = (Map) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, null, map, false, null, null, null, null, false, null, false, null, false, null, -2097153, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 11:
                g3a g3aVar = (g3a) obj2;
                Throwable th = (Throwable) obj;
                L.j(th, "Catalog");
                CatalogVh catalogVh = g3aVar.t;
                if (catalogVh != null) {
                    catalogVh.rg(th);
                }
                mzp0 mzp0Var = g3aVar.c.c.g;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                return s3q0.a;
            case 12:
                hda hdaVar = (hda) obj;
                return jda.a(((com.vk.catalog2.common.ui.mvp.auto.d) obj2).g, hdaVar.a, hdaVar.b, false, false, 12);
            case 13:
                kea keaVar = (kea) obj2;
                tx txVar = keaVar.K;
                if (txVar != null) {
                    txVar.invoke();
                }
                UIBlockList uIBlockList = keaVar.l;
                if (uIBlockList != null && (str = uIBlockList.M) != null) {
                    jge0 jge0Var = keaVar.P;
                    if (epx.f((String) jge0Var.c, str)) {
                        jge0Var.b = null;
                    }
                }
                return s3q0.a;
            case 14:
                ((mha) obj2).c.invoke((String) obj);
                return s3q0.a;
            case 15:
                ((Boolean) obj).booleanValue();
                ((hna) obj2).d.invoke();
                return s3q0.a;
            case 16:
                akv.a aVar4 = new akv.a();
                aVar4.a = (String) obj;
                aVar4.b(Uri.parse(((ava) obj2).b));
                aVar4.f = false;
                return new akv(aVar4);
            case 17:
                ((ij20.a) obj).l(((dcb) obj2).d);
                return s3q0.a;
            case 18:
                b7b b7bVar = ((khb) obj2).b;
                sxp sxpVar = (sxp) obj;
                if (sxpVar instanceof i280) {
                    i280 i280Var = (i280) sxpVar;
                    long j = i280Var.c;
                    Iterator<T> it = i280Var.d.iterator();
                    while (it.hasNext()) {
                        b7bVar.a.j.onNext(new a7b.a(j, ((Number) it.next()).intValue()));
                    }
                } else if (sxpVar instanceof m280) {
                    m280 m280Var = (m280) sxpVar;
                    b7bVar.b.a(m280Var.d, m280Var.c, true);
                } else if (sxpVar instanceof o280) {
                    Map<Long, Collection<Integer>> map2 = ((o280) sxpVar).c;
                    wdb wdbVar = b7bVar.c;
                    wdbVar.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.o1(io.reactivex.rxjava3.core.q.O(map2.entrySet()).L(new iw3(new wh1(7), i3), false).U(new yh1(new u8(wdbVar, 18), i2)), new dg1(new com.vk.movika.sdk.base.observable.u(10), 8)));
                    asu0.a.getClass();
                    io.reactivex.rxjava3.internal.operators.completable.y q = b1Var.q(asu0.t());
                    int i7 = kwg0.a;
                    wdbVar.e.b(io.reactivex.rxjava3.kotlin.c.d(q, new com.vk.movika.sdk.android.defaultplayer.interactive.b(6), new nu2("ChannelUpdateMessagesNotificationsHandler", 2)));
                } else if (sxpVar instanceof j280) {
                    j280 j280Var = (j280) sxpVar;
                    long j2 = j280Var.c;
                    Iterator<T> it2 = j280Var.d.iterator();
                    while (it2.hasNext()) {
                        b7bVar.b.a(((Number) it2.next()).intValue(), j2, false);
                    }
                }
                return s3q0.a;
            case 19:
                ynb ynbVar = (ynb) obj2;
                gm50.a.a(ynbVar, ((dob.b) obj).a, new sf1(ynbVar, 19));
                return s3q0.a;
            case 20:
                ClipDraftsBlockVh clipDraftsBlockVh = (ClipDraftsBlockVh) obj2;
                ((ClipsDraftPersistentStore) obj).getClass();
                egg0 m = ClipsDraftPersistentStore.m();
                UIBlockProfileClipDrafts uIBlockProfileClipDrafts = clipDraftsBlockVh.d;
                if (uIBlockProfileClipDrafts != null) {
                    clipDraftsBlockVh.b.b(new buz(12, new com.vk.movika.sdk.base.logic.interactor.d(uIBlockProfileClipDrafts, 25), new ex(uIBlockProfileClipDrafts, clipDraftsBlockVh, m, i4)), false);
                }
                return s3q0.a;
            case 21:
                hwc hwcVar = (hwc) obj2;
                SdkExternalNpsCondition sdkExternalNpsCondition = (SdkExternalNpsCondition) obj;
                sdkExternalNpsCondition.getClass();
                return Boolean.valueOf((sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_STARTED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_LIKED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_SHARED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_COMMENTED || sdkExternalNpsCondition == SdkExternalNpsCondition.CLIP_DOWNLOADED) && hwcVar.b.d(sdkExternalNpsCondition));
            case 22:
                com.vk.clips.editor.voiceover.impl.a aVar5 = (com.vk.clips.editor.voiceover.impl.a) obj2;
                long millis = TimeUnit.MICROSECONDS.toMillis(((Long) obj).longValue());
                e2e e2eVar = aVar5.e;
                q0e.e eVar = aVar5.b;
                szd szdVar = aVar5.d;
                cxd cxdVar = e2eVar.k;
                if (millis < 100) {
                    aVar5.f.a(100L);
                    aVar5.f();
                    return s3q0.a;
                }
                a1e a1eVar = aVar5.l;
                if (a1eVar == null) {
                    a1eVar = null;
                }
                long min = Math.min(a1eVar.e.longValue(), Math.min(szdVar.o.a.e(), millis));
                com.vk.clips.editor.state.model.a aVar6 = szdVar.o.a;
                a1e a1eVar2 = aVar5.l;
                if (a1eVar2 == null) {
                    a1eVar2 = null;
                }
                ClipsEditorAudioItem a = aVar6.a(String.valueOf(a1eVar2.b.b));
                if (a == null) {
                    aVar5.f();
                    return s3q0.a;
                }
                ClipsEditorMusicInfo clipsEditorMusicInfo = a.a;
                int i8 = (int) min;
                ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo.b;
                int i9 = ClipsEditorMusicTrack.m;
                ClipsEditorAudioItem a2 = ClipsEditorAudioItem.a(a, ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, ClipsEditorMusicTrack.zb(clipsEditorMusicTrack, (int) UUID.randomUUID().getLeastSignificantBits(), i8, null, 2038), null, 0, i8, 0, null, 0, 2038), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 14);
                StringBuilder b = fp.b(millis, "end record recordedFileDurationMilliseconds=", " stateController.state.durationMs=");
                b.append(szdVar.o.a.e());
                b.append(" finishMs=");
                b.append(min);
                b.append(" updatedAudioFragment=");
                b.append(com.vk.clips.editor.voiceover.impl.a.g(a2.a));
                lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorVoiceoverDelegateImpl", b.toString()}, 2));
                List<? extends wzd> singletonList = Collections.singletonList(new wzd.a(evc.a, i4));
                vzd.c(szdVar, yzd.a(szdVar.o.a.b, false, false, false, false, false, 15));
                aVar5.h(a2, a.f, singletonList);
                aVar5.e();
                eVar.b();
                eVar.a(false);
                String str2 = a2.f;
                q0e q0eVar = q0e.this;
                ClipsEditorAudioItem a3 = q0eVar.e.o.a.a(str2);
                if (a3 != null) {
                    q0eVar.P(new q0e.c.b(a3), false, true);
                }
                return s3q0.a;
            case 23:
                L.e("TemplateFlow", "ClipsGridPresenter success");
                FragmentActivity We = ((com.vk.clips.viewer.impl.grid.b) obj2).e.We();
                if (We != null) {
                    g620.f().a().i(We, fpf0.a(ClipFeedTab.TopVideo.class), null);
                }
                return s3q0.a;
            case 24:
                ClipsInterestsFragment clipsInterestsFragment = (ClipsInterestsFragment) obj2;
                int i10 = ClipsInterestsFragment.Y;
                int i11 = ClipsInterestsFragment.c.$EnumSwitchMapping$0[((ClipsInterestsViewState.d) obj).a.ordinal()];
                if (i11 == 1) {
                    clipsInterestsFragment.go().execute(new n52(clipsInterestsFragment, i2));
                } else if (i11 != 2) {
                    int i12 = 3;
                    if (i11 != 3 && i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clipsInterestsFragment.go().execute(new sx3(clipsInterestsFragment, i12));
                }
                return s3q0.a;
            case 25:
                return j5g.H0((List) obj, ((qie) obj2).a.b);
            case 26:
                ClipsMusicCatalogShowAllListVh clipsMusicCatalogShowAllListVh = (ClipsMusicCatalogShowAllListVh) obj2;
                jwp0 jwp0Var = (jwp0) obj;
                UIBlock uIBlock = clipsMusicCatalogShowAllListVh.v;
                if (uIBlock != null) {
                    jwp0Var.b.invoke(uIBlock, jwp0Var.a);
                    clipsMusicCatalogShowAllListVh.N6(uIBlock);
                }
                return s3q0.a;
            case 27:
                y7f.b bVar = ((h6f) obj2).a;
                int i13 = ((ModalActionSheetListItem) obj).a;
                if (i13 == 1) {
                    bVar.a(true);
                } else if (i13 == 2) {
                    bVar.a(false);
                }
                return s3q0.a;
            case 28:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((PhotoAttachment) obj).l.e, ((Photo) obj2).e));
        }
    }
}
