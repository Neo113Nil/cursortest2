package xsna;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentShortVideosDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.billing.StorePurchasesManager;
import com.vk.clips.attachments.impl.views.video.a;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stickers.KeywordsDictionaryChunk;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.imageloader.view.VKImageView;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.mvi.binder.BinderLifecycleMode;
import com.vk.newsfeed.common.presentation.model.items.MyTargetInternalNativeAdBlsUiDto;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.writebar.attach.AttachmentsEditorView;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c2r0;
import xsna.er9;
import xsna.f0r;
import xsna.fiy;
import xsna.hil;
import xsna.ikv0;
import xsna.lfb;
import xsna.nwb;
import xsna.o360;
import xsna.p4g;
import xsna.uv60;
import xsna.w0g;
import xsna.wk50;
import xsna.wxi0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g84 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g84(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<ShortVideoPlaylistFullDto> d0;
        String l2;
        int i;
        int i2;
        int i3;
        DownloadingState downloadingState;
        int i4 = 4;
        switch (this.b) {
            case 0:
                MarketAttachment marketAttachment = (MarketAttachment) this.c;
                VKImageView vKImageView = (VKImageView) this.d;
                int i5 = AttachmentsEditorView.C;
                Image image = marketAttachment.f.n;
                ImageSize Cb = image != null ? image.Cb(vKImageView.getWidth(), true, false) : null;
                vKImageView.load(Cb != null ? Cb.d.d : null);
                return s3q0.a;
            case 1:
                bg7 bg7Var = (bg7) this.c;
                Context context = (Context) this.d;
                List list = (List) obj;
                p4g.a aVar = p4g.a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        bg7Var.b.k(context, (c2r0.b) it.next());
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                }
                int size = list.size();
                if (bg7Var.f.compareAndSet(false, true)) {
                    SchemeStatSak$TypeRegistrationItem.EventType eventType = SchemeStatSak$TypeRegistrationItem.EventType.BLOCKSTORE_RELOAD;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.COUNT, new String(), new String(), String.valueOf(size)));
                    frf0.a(eventType, arrayList2, null, null, null, null, RegistrationStatParamsFactory.b, 176);
                }
                return s3q0.a;
            case 2:
                bi9 bi9Var = (bi9) this.c;
                bi9Var.d = false;
                bi9Var.c((StoryMusicInfo) this.d, (Throwable) obj);
                return s3q0.a;
            case 3:
                lfb.b bVar = (lfb.b) this.c;
                ProfilesSimpleInfo profilesSimpleInfo = bVar.c;
                w2w w2wVar = (w2w) this.d;
                List<eeb> list2 = bVar.a;
                Iterable iterable = (Iterable) new ChannelsInfoMergeTask(list2, null, false, null, null, 30).o(w2wVar);
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Long.valueOf(((bdb) it2.next()).b));
                }
                if (profilesSimpleInfo.Gb()) {
                    new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    if (arrayList3.contains(Long.valueOf(((eeb) obj2).a.a))) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    eeb eebVar = (eeb) it3.next();
                    Msg msg = eebVar.b;
                    List singletonList = msg == null ? EmptyList.b : Collections.singletonList(msg);
                    int i6 = msg != null ? msg.d : Integer.MAX_VALUE;
                    boolean z = msg == null;
                    long j = eebVar.a.a;
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    new ChannelMsgHistoryFromServerMergeTask(Peer.a.b(j), i6, singletonList, ChannelMsgHistoryFromServerMergeTask.HistorySource.API, false, z, true, 400).o(w2wVar);
                }
                return s3q0.a;
            case 4:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                gmf gmfVar = (gmf) this.d;
                VKList vKList = (VKList) obj;
                int k = cVar2.k() + cVar2.i();
                cVar2.q(k);
                cVar2.r(k < gmfVar.f);
                gmfVar.b.invoke(new a.d(vKList));
                return s3q0.a;
            case 5:
                n3g n3gVar = (n3g) this.c;
                n2k0 n2k0Var = (n2k0) this.d;
                e4p e4pVar = (e4p) obj;
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                if (dVar == null) {
                    dVar = null;
                }
                bc0 i7 = n3g.i(dVar);
                if (i7 != null) {
                    g2g g2gVar = i7.g;
                    w0g.a aVar2 = i7.b.a().get(n2k0Var);
                    c2g c2gVar = new c2g(aVar2.b, aVar2.c, aVar2.d, aVar2.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e4pVar);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g2gVar.a);
                    linkedHashMap.put(n2k0Var, c2gVar);
                    g2g g2gVar2 = new g2g(linkedHashMap);
                    com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
                    if (dVar2 == null) {
                        dVar2 = null;
                    }
                    dVar2.a(new EditorMessage.i(w1g.a(i7, null, null, null, null, null, g2gVar2, null, 191), null, 6));
                    c5p c5pVar = n3gVar.f;
                    (c5pVar == null ? null : c5pVar).b(CollageStatEvent.l.a);
                }
                n3gVar.g = false;
                return s3q0.a;
            case 6:
                leg legVar = (leg) this.c;
                c2y0 c2y0Var = (c2y0) this.d;
                legVar.g.j("", e43.a((StickerAttachment) obj), false);
                c2y0Var.t();
                return s3q0.a;
            case 7:
                Clips clips = (Clips) this.c;
                dgh dghVar = (dgh) this.d;
                GroupsTabContentShortVideosDto C = ((GroupsGetContentForTabsResponseDto) obj).C();
                ArrayList arrayList5 = new ArrayList();
                if (C == null || (d0 = C.d0()) == null) {
                    arrayList = null;
                } else {
                    List<ShortVideoPlaylistFullDto> list3 = d0;
                    arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(dghVar.x((ShortVideoPlaylistFullDto) it4.next()));
                    }
                }
                if (arrayList != null) {
                    arrayList5.addAll(arrayList);
                }
                return Clips.i(clips, null, arrayList5.isEmpty() ? null : arrayList5, null, C != null ? C.f() : null, false, myc0.f(C != null ? C.f() : null) && arrayList != null && (arrayList.isEmpty() ^ true), null, null, CommunityProfileContentItem.State.LOADED, null, null, null, false, 523733);
            case 8:
                swj swjVar = (swj) this.c;
                String str = (String) this.d;
                swjVar.c.remove(str);
                swjVar.d.remove(str);
                return s3q0.a;
            case 9:
                ((hv10) obj).m((bgk0) this.c, (ur4) this.d);
                return s3q0.a;
            case 10:
                ((cfm) this.c).D((MenuItem) this.d);
                return s3q0.a;
            case 11:
                String str2 = (String) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                dnm d = ((xgl0) obj).b().d();
                InfoBar b = d.b();
                if (epx.f(b != null ? b.b : null, str2)) {
                    d.e(true);
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 12:
                ((com.vk.music.playlist.display.domain.b) this.c).k.a0(xx1.k(((yfn) this.d).c));
                return s3q0.a;
            case 13:
                nwb.f fVar = (nwb.f) this.c;
                q6p q6pVar = (q6p) this.d;
                ((Long) obj).getClass();
                if (!fVar.c) {
                    throw null;
                }
                com.vk.im.ui.components.chat_profile.a aVar3 = q6pVar.l;
                aVar3.getClass();
                aVar3.t(zxd0.j.a);
                return s3q0.a;
            case 14:
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT * \n        FROM episode\n        INNER JOIN podcast_to_episodes \n        ON episode.mid = podcast_to_episodes.mid \n        AND episode.uid = podcast_to_episodes.uid\n        WHERE podcast_to_episodes.uid = ? \n        AND podcast_to_episodes.podcast_owner_id = ?\n    ");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    int k2 = egi.k(V0, "id");
                    int k3 = egi.k(V0, "uid");
                    int k4 = egi.k(V0, "mid");
                    int k5 = egi.k(V0, "track_code");
                    int k6 = egi.k(V0, "title");
                    int k7 = egi.k(V0, "artist");
                    int k8 = egi.k(V0, "url");
                    int k9 = egi.k(V0, "duration");
                    int k10 = egi.k(V0, "date");
                    int k11 = egi.k(V0, "is_explicit");
                    int k12 = egi.k(V0, "is_focus_track");
                    int k13 = egi.k(V0, "plays");
                    int k14 = egi.k(V0, "is_favorite");
                    int k15 = egi.k(V0, X3.i.L);
                    int k16 = egi.k(V0, "description");
                    int k17 = egi.k(V0, "cover");
                    int k18 = egi.k(V0, "post_id");
                    int k19 = egi.k(V0, "is_donut");
                    int k20 = egi.k(V0, "downloading_state");
                    int k21 = egi.k(V0, X3.a.k);
                    int k22 = egi.k(V0, "manifest_url");
                    int k23 = egi.k(V0, "json_raw");
                    ArrayList arrayList6 = new ArrayList();
                    while (V0.step()) {
                        int i8 = k14;
                        ArrayList arrayList7 = arrayList6;
                        int i9 = (int) V0.getLong(k2);
                        UserId b2 = fwx0.b(V0.l2(k3));
                        String l22 = V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        String l24 = V0.isNull(k6) ? null : V0.l2(k6);
                        String l25 = V0.isNull(k7) ? null : V0.l2(k7);
                        String l26 = V0.isNull(k8) ? null : V0.l2(k8);
                        Long valueOf = V0.isNull(k9) ? null : Long.valueOf(V0.getLong(k9));
                        Long valueOf2 = V0.isNull(k10) ? null : Long.valueOf(V0.getLong(k10));
                        boolean z2 = ((int) V0.getLong(k11)) != 0;
                        Integer valueOf3 = V0.isNull(k12) ? null : Integer.valueOf((int) V0.getLong(k12));
                        Boolean valueOf4 = valueOf3 != null ? Boolean.valueOf(valueOf3.intValue() != 0) : null;
                        int i10 = (int) V0.getLong(k13);
                        int i11 = k13;
                        int i12 = k2;
                        boolean z3 = ((int) V0.getLong(i8)) != 0;
                        long j2 = V0.getLong(k15);
                        int i13 = k16;
                        String l27 = V0.isNull(i13) ? null : V0.l2(i13);
                        int i14 = k17;
                        Image g = yfb.g(V0.isNull(i14) ? null : V0.l2(i14));
                        int i15 = k18;
                        if (V0.isNull(i15)) {
                            l2 = null;
                            k18 = i15;
                            i3 = i8;
                            i = i13;
                            i2 = k19;
                        } else {
                            l2 = V0.l2(i15);
                            k18 = i15;
                            i = i13;
                            i2 = k19;
                            i3 = i8;
                        }
                        boolean z4 = ((int) V0.getLong(i2)) != 0;
                        int i16 = k20;
                        int i17 = (int) V0.getLong(i16);
                        if (i17 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i17 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i17 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i17 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i17 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i18 = k21;
                        int i19 = k22;
                        int i20 = i2;
                        int i21 = k23;
                        k23 = i21;
                        arrayList6 = arrayList7;
                        arrayList6.add(new xsp(i9, b2, l22, l23, l24, l25, l26, valueOf, valueOf2, z2, valueOf4, i10, z3, j2, l27, g, l2, z4, downloadingState2, uh.a(V0.isNull(i18) ? null : V0.l2(i18)), V0.isNull(i19) ? null : V0.l2(i19), V0.l2(i21)));
                        k22 = i19;
                        k14 = i3;
                        k16 = i;
                        k17 = i14;
                        k19 = i20;
                        k20 = i16;
                        k13 = i11;
                        k21 = i18;
                        k2 = i12;
                    }
                    V0.close();
                    return arrayList6;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 15:
                ((f0r.p) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 16:
                b5v b5vVar = (b5v) this.c;
                ProgressDialog progressDialog = (ProgressDialog) this.d;
                Throwable th2 = (Throwable) obj;
                Integer num = (Integer) j5g.a0(b5vVar.m);
                b5vVar.R4(num != null ? num.intValue() : 0, null);
                h03.b(th2);
                progressDialog.cancel();
                return s3q0.a;
            case 17:
                fiy fiyVar = (fiy) this.c;
                KeywordsDictionaryChunk keywordsDictionaryChunk = (KeywordsDictionaryChunk) obj;
                String str5 = (String) ((Ref$ObjectRef) this.d).element;
                fiyVar.getClass();
                return keywordsDictionaryChunk == null ? io.reactivex.rxjava3.core.q.H(new fiy.c("Keywords chunk must not be null")) : !epx.f(keywordsDictionaryChunk.d, str5) ? io.reactivex.rxjava3.core.q.H(new fiy.a("Keywords chunk hash must be equal to first chunk hash")) : io.reactivex.rxjava3.core.q.T(keywordsDictionaryChunk.b);
            case 18:
                gdj0 gdj0Var = (gdj0) this.c;
                gzs gzsVar = (gzs) this.d;
                if (!gdj0Var.d()) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 19:
                m340 m340Var = (m340) this.c;
                wxi0 wxi0Var = (wxi0) this.d;
                BaseSharingExternalActivity baseSharingExternalActivity = (BaseSharingExternalActivity) obj;
                if (baseSharingExternalActivity.getLifecycle().getCurrentState().a(Lifecycle.State.RESUMED)) {
                    baseSharingExternalActivity.J = null;
                    baseSharingExternalActivity.K.dispose();
                    UserId userId = ((wxi0.d) wxi0Var).b.c().a;
                    if (!m340Var.b) {
                        m340Var.b = true;
                        io.reactivex.rxjava3.disposables.c cVar3 = m340Var.e;
                        if (cVar3 != null) {
                            cVar3.dispose();
                        }
                        m340Var.e = new io.reactivex.rxjava3.internal.operators.observable.i0(i2w.a().l.a().b0(p680.class), new l340(new v74(20, m340Var, userId), r6)).t0(1L).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eiy(new ekh(m340Var, 21), i4), new ubq(new d0w(m340Var, 8), 14));
                        i0q0.e(m340Var.f);
                    }
                } else {
                    baseSharingExternalActivity.finish();
                }
                return s3q0.a;
            case 20:
                b950 b950Var = (b950) this.c;
                MusicSubscriptionControlFragment musicSubscriptionControlFragment = b950Var.b;
                Subscription subscription = (Subscription) this.d;
                StorePurchasesManager.BillingAvailabilityStatus billingAvailabilityStatus = (StorePurchasesManager.BillingAvailabilityStatus) obj;
                if (billingAvailabilityStatus != StorePurchasesManager.BillingAvailabilityStatus.READY) {
                    musicSubscriptionControlFragment.jo(null, null, billingAvailabilityStatus == StorePurchasesManager.BillingAvailabilityStatus.NOT_AUTHORIZED);
                } else if (subscription.w) {
                    ht8 ht8Var = (ht8) musicSubscriptionControlFragment.Y.getValue();
                    ht8Var.c = ht8Var.b.f(musicSubscriptionControlFragment.getActivity(), musicSubscriptionControlFragment.Z, subscription);
                    b950Var.c.h(on00.f(new Pair(subscription.b, subscription)), new a950(b950Var, subscription));
                } else {
                    musicSubscriptionControlFragment.jo(subscription, null, false);
                }
                return s3q0.a;
            case 21:
                ((fr50) this.c).D.sa(new NewsfeedExternalAction.c.InterfaceC1439c.C1440c(((MyTargetInternalNativeAdBlsUiDto) this.d).i));
                return s3q0.a;
            case 22:
                qv10 qv10Var = (qv10) this.c;
                o360 o360Var = (o360) this.d;
                ((lkw) obj).a = qv10Var;
                List<o360.b> d2 = o360Var.c.d(qv10Var.a);
                if (d2 != null) {
                    Iterator<T> it5 = d2.iterator();
                    while (it5.hasNext()) {
                        ((o360.b) it5.next()).b(qv10Var);
                    }
                }
                return s3q0.a;
            case 23:
                uv60 uv60Var = (uv60) this.c;
                og60 og60Var = (og60) this.d;
                uv60.a aVar4 = (uv60.a) obj;
                return uv60Var.a.c(new vg60(og60Var.a, og60Var.b, og60Var.c, og60Var.d, og60Var.e, og60Var.f, aVar4.a, aVar4.b, aVar4.c, aVar4.d, og60Var.g, og60Var.h, og60Var.i));
            case 24:
                cyn0 cyn0Var = (cyn0) this.c;
                jsn0 jsn0Var = (jsn0) this.d;
                t680 t680Var = cyn0Var.c;
                if (t680Var != null) {
                    t680Var.f(jsn0Var.getAdapterPosition());
                }
                return s3q0.a;
            case 25:
                wl90 wl90Var = (wl90) this.c;
                PasskeyCheckInfo passkeyCheckInfo = (PasskeyCheckInfo) this.d;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                SignUpDataHolder signUpDataHolder = wl90Var.p;
                SignUpDataHolder signUpDataHolder2 = signUpDataHolder != null ? signUpDataHolder : null;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder2.I = VkAuthMetaInfo.zb(signUpDataHolder.I, SilentAuthSource.BY_PHONE, null, null, 55);
                wl90Var.A.a(passkeyCheckInfo.b, false, wl90Var.x.g, vkAuthValidatePhoneResult);
                return s3q0.a;
            case 26:
                ((l6e0) this.c).b.g((hyg0) obj, (ArrayList) this.d);
                return s3q0.a;
            case 27:
                zhf0 zhf0Var = (zhf0) this.c;
                ggj ggjVar = (ggj) this.d;
                oio oioVar = (oio) obj;
                float f = -zhf0Var.a;
                float f2 = -zhf0Var.b;
                oioVar.a0().a.l(f, f2);
                try {
                    float f3 = zhf0Var.a;
                    float f4 = zhf0Var.b;
                    float f5 = zhf0Var.c;
                    float f6 = zhf0Var.d;
                    er9.b a0 = oioVar.a0();
                    long d3 = a0.d();
                    a0.a().e();
                    try {
                        a0.a.c(f3, f4, f5, f6, 1);
                        ggjVar.s1();
                        oioVar.a0().a.l(-f, -f2);
                        return s3q0.a;
                    } finally {
                        a0.a().a();
                        a0.h(d3);
                    }
                } catch (Throwable th3) {
                    oioVar.a0().a.l(-f, -f2);
                    throw th3;
                }
            case 28:
                ((BinderLifecycleMode) this.c).a(new fk(16, (s210) this.d, (pk50) obj));
                return s3q0.a;
            default:
                ((h7k0) this.c).J.invoke(((ikv0.f) this.d).b());
                return s3q0.a;
        }
    }

    public /* synthetic */ g84(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ g84(hil.b bVar, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 9;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
