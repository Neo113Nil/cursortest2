package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.media.MediaBrowserServiceCompat;
import com.ironsource.X3;
import com.vk.api.generated.identity.dto.IdentityPhoneResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.audiomsg.player.Speed;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.uploader.impl.model.ClipUploadJobInternal;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.dto.articles.Article;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.GiftSuggestionConfig;
import com.vk.dto.stickers.KeywordsDictionaryChunk;
import com.vk.dto.stickers.PredictiveSearchConfig;
import com.vk.dto.stories.model.clickable.ClickableReaction;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.display.domain.e;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.e;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerItemDto;
import com.vk.stories.design.view.ReactionView;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.usersstore.blockstore.deletereceiver.BlockstoreDeleteReceiver;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c5b;
import xsna.ded;
import xsna.e5i;
import xsna.esh;
import xsna.esh.a;
import xsna.gy50;
import xsna.i0k;
import xsna.kbl0;
import xsna.kvv;
import xsna.n0s;
import xsna.p9i0;
import xsna.rye;
import xsna.zew0;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ut6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ut6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v79, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r2v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v22, types: [T, java.lang.String] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageViewer.c<Photo> g;
        qyg0 V0;
        xsp xspVar;
        DownloadingState downloadingState;
        Context context;
        Activity h;
        MusicTrack musicTrack;
        int i = this.b;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj2;
                tho0 tho0Var = (tho0) obj;
                if (!epx.f((tho0) obj3, tho0Var)) {
                    izsVar.invoke(tho0Var);
                }
                return s3q0.a;
            case 1:
                Context context2 = (Context) obj3;
                UserId userId = (UserId) obj2;
                Boolean bool = (Boolean) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"[Blockstore] delete completed = " + bool});
                }
                if (bool.booleanValue()) {
                    Intent putExtra = new Intent("com.vk.blockstore.action.delete").putExtra("userId", userId.b);
                    int i4 = BlockstoreDeleteReceiver.a;
                    context2.sendBroadcast(putExtra, BlockstoreDeleteReceiver.a.a(context2));
                }
                return s3q0.a;
            case 2:
                return new Triple((UserProfile) obj3, (List) obj2, (List) obj);
            case 3:
                zew0.a aVar = zew0.k1;
                Context context3 = ((f69) obj3).a;
                ((gy50.j) obj2).getClass();
                zew0.a.b(aVar, context3, R.drawable.ic_shield_56, 0, context3.getString(R.string.voip_your_call_is_protected_title), context3.getString(R.string.voip_your_call_is_protected_subtitle), null, new zew0.b.f(null), null, false, 420).Td((FragmentManager) obj, "");
                return s3q0.a;
            case 4:
                w2w w2wVar = (w2w) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                Peer peer = ((txa) obj3).c;
                new zd20(new c5b.a(peer, false), new h2b(w2wVar.I0(), w2wVar.getExperiments()), true, false).a(w2wVar);
                s3q0 s3q0Var = s3q0.a;
                xgl0Var.a().F(peer.b);
                frn0 system = xgl0Var.system();
                long j = peer.b;
                system.w(Collections.singletonList(Long.valueOf(j)));
                xgl0Var.system().s(Collections.singletonList(Long.valueOf(j)));
                return s3q0.a;
            case 5:
                izs izsVar2 = (izs) obj2;
                View view = (View) obj;
                if (!((hgd) obj3).b.f.m()) {
                    izsVar2.invoke(view);
                }
                return s3q0.a;
            case 6:
                ClipUploadJobInternal clipUploadJobInternal = (ClipUploadJobInternal) obj3;
                fef fefVar = (fef) obj2;
                Pair<ClipUploadJobInternal, ? extends ded> pair = new Pair<>(clipUploadJobInternal, new ded.h((ShortVideoGetResponseDto) obj));
                fefVar.a.getLogger().d("ClipsUploadControllerImpl", h5s.c(clipUploadJobInternal.b.b, " done", new StringBuilder("server processing for ")));
                fefVar.l(pair);
                return s3q0.a;
            case 7:
                ((hkg) obj3).p.invoke((zp0.a) obj2);
                return s3q0.a;
            case 8:
                Context context4 = (Context) obj3;
                esh eshVar = (esh) obj2;
                VKList vKList = (VKList) obj;
                if (vKList.size() == 0) {
                    cvk.w(context4.getString(R.string.no_photos), false);
                    return s3q0.a;
                }
                Activity h2 = e3m.h(context4);
                if (h2 == null) {
                    return s3q0.a;
                }
                esh.a aVar2 = eshVar.new a(vKList.size(), vKList.i());
                g = eshVar.c.g(0, vKList, h2, aVar2, o25.a().c());
                aVar2.d = g;
                return s3q0.a;
            case 9:
                e5i.a aVar3 = (e5i.a) obj3;
                String str = (String) obj2;
                aVar3.q6(str, "tap");
                maz.c(((e5i) aVar3.m).h.f(), aVar3.itemView.getContext(), str, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 10:
                bn50 bn50Var = (bn50) obj3;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bn50Var), ((i0k) obj2).b);
                g47Var.a(tci.k(bn50Var));
                g47Var.d(new i0k.a(bn50Var));
                return s3q0.a;
            case 11:
                ((p8k) obj3).X((Throwable) obj, (c9k) obj2);
                return s3q0.a;
            case 12:
                ((hv10) obj).c((bgk0) obj3, (Speed) obj2);
                return s3q0.a;
            case 13:
                ((com.vk.music.playlist.display.domain.b) obj3).T(new e.l(LoadPlaylistTracksRequest.a((LoadPlaylistTracksRequest) obj2, 0, LoadPlaylistTracksRequest.State.ERROR, 47)));
                return s3q0.a;
            case 14:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                V0 = ((hyg0) obj).V0("SELECT * FROM episode WHERE uid = ? AND mid = ?");
                try {
                    V0.D3(1, str2);
                    V0.D3(2, str3);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "track_code");
                    int k5 = egi.k(V0, "title");
                    int k6 = egi.k(V0, "artist");
                    int k7 = egi.k(V0, "url");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "date");
                    int k10 = egi.k(V0, "is_explicit");
                    int k11 = egi.k(V0, "is_focus_track");
                    int k12 = egi.k(V0, "plays");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, X3.i.L);
                    int k15 = egi.k(V0, "description");
                    int k16 = egi.k(V0, "cover");
                    int k17 = egi.k(V0, "post_id");
                    int k18 = egi.k(V0, "is_donut");
                    int k19 = egi.k(V0, "downloading_state");
                    int k20 = egi.k(V0, X3.a.k);
                    int k21 = egi.k(V0, "manifest_url");
                    int k22 = egi.k(V0, "json_raw");
                    if (V0.step()) {
                        int i5 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l2 = V0.l2(k3);
                        String l22 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l23 = V0.isNull(k5) ? null : V0.l2(k5);
                        String l24 = V0.isNull(k6) ? null : V0.l2(k6);
                        String l25 = V0.isNull(k7) ? null : V0.l2(k7);
                        Long valueOf = V0.isNull(k8) ? null : Long.valueOf(V0.getLong(k8));
                        Long valueOf2 = V0.isNull(k9) ? null : Long.valueOf(V0.getLong(k9));
                        boolean z = ((int) V0.getLong(k10)) != 0;
                        Integer valueOf3 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        Boolean valueOf4 = valueOf3 != null ? Boolean.valueOf(valueOf3.intValue() != 0) : null;
                        int i6 = (int) V0.getLong(k12);
                        boolean z2 = ((int) V0.getLong(k13)) != 0;
                        long j2 = V0.getLong(k14);
                        String l26 = V0.isNull(k15) ? null : V0.l2(k15);
                        Image g2 = yfb.g(V0.isNull(k16) ? null : V0.l2(k16));
                        String l27 = V0.isNull(k17) ? null : V0.l2(k17);
                        boolean z3 = ((int) V0.getLong(k18)) != 0;
                        int i7 = (int) V0.getLong(k19);
                        if (i7 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i7 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i7 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i7 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i7 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        xspVar = new xsp(i5, b, l2, l22, l23, l24, l25, valueOf, valueOf2, z, valueOf4, i6, z2, j2, l26, g2, l27, z3, downloadingState, uh.a(V0.isNull(k20) ? null : V0.l2(k20)), V0.isNull(k21) ? null : V0.l2(k21), V0.l2(k22));
                    } else {
                        xspVar = null;
                    }
                    V0.close();
                    return xspVar;
                } catch (Throwable th) {
                    throw th;
                }
            case 15:
                bpn0 bpn0Var = new bpn0(new sbg((n0s) obj2, 18));
                for (spm spmVar : (Collection) obj3) {
                    ((SQLiteStatement) bpn0Var.getValue()).clearBindings();
                    ((SQLiteStatement) bpn0Var.getValue()).bindLong(n0s.a.ID.ordinal() + 1, spmVar.a);
                    ((SQLiteStatement) bpn0Var.getValue()).bindLong(n0s.a.UNREAD_UNMUTED.ordinal() + 1, spmVar.b);
                    ((SQLiteStatement) bpn0Var.getValue()).bindLong(n0s.a.UNREAD_MUTED.ordinal() + 1, spmVar.c);
                    ((SQLiteStatement) bpn0Var.getValue()).executeInsert();
                }
                return s3q0.a;
            case 16:
                IdentityPhoneResponseDto identityPhoneResponseDto = (IdentityPhoneResponseDto) obj;
                ((mvv) ((oit) obj3).a.getValue()).getClass();
                return new WebIdentityPhone((WebIdentityLabel) obj2, identityPhoneResponseDto.d(), identityPhoneResponseDto.getId());
            case 17:
                kvv kvvVar = (kvv) obj3;
                kvvVar.f.invoke(((yuv) ((ArrayList) kvvVar.y0()).get(((kvv.c) obj2).getAdapterPosition())).b);
                return s3q0.a;
            case 18:
                KeywordsDictionaryChunk keywordsDictionaryChunk = (KeywordsDictionaryChunk) obj;
                ((Ref$ObjectRef) obj3).element = keywordsDictionaryChunk.d;
                ((fiy) obj2).getClass();
                PredictiveSearchConfig predictiveSearchConfig = keywordsDictionaryChunk.e;
                int i8 = keywordsDictionaryChunk.c;
                if (predictiveSearchConfig != null) {
                    HashMap<UserId, kbl0> hashMap = kbl0.b;
                    kbl0 b2 = kbl0.a.b();
                    b2.getClass();
                    Preference.H(b2.a, "stickers_predictive_search_config", predictiveSearchConfig.e5().toString());
                }
                GiftSuggestionConfig giftSuggestionConfig = keywordsDictionaryChunk.f;
                HashMap<UserId, kbl0> hashMap2 = kbl0.b;
                kbl0 b3 = kbl0.a.b();
                if (giftSuggestionConfig == null) {
                    giftSuggestionConfig = new GiftSuggestionConfig(null, null, null, null, 15, null);
                }
                b3.getClass();
                Preference.H(b3.a, "stickers_gift_suggest_config", giftSuggestionConfig.e5().toString());
                io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(keywordsDictionaryChunk);
                if (i8 == 1) {
                    return T;
                }
                ArrayList arrayList = new ArrayList();
                while (i3 < i8) {
                    arrayList.add(rsg0.T(yfb.x(zq70.I(new zq70(), Integer.valueOf(i3), keywordsDictionaryChunk.d, 563))).U(new rf3(new v4v(i2), 14)));
                    i3++;
                }
                io.reactivex.rxjava3.core.q r = io.reactivex.rxjava3.core.q.r(arrayList);
                Objects.requireNonNull(r, "other is null");
                return io.reactivex.rxjava3.core.q.q(T, r);
            case 19:
                a1z a1zVar = (a1z) obj3;
                bn40.c((Throwable) obj, new Object[0]);
                ((MediaBrowserServiceCompat.g) obj2).f(null);
                g0z g0zVar = a1zVar.d;
                if (g0zVar != null) {
                    g0zVar.c(a1zVar.a.getApplicationContext(), "net_error");
                }
                return s3q0.a;
            case 20:
                ((pj20) obj3).c.invoke(((MethodSelectorCodeState.MaxOtpCode) ((MethodSelectorCodeState) obj2)).f);
                return s3q0.a;
            case 21:
                gzs gzsVar = (gzs) obj2;
                if (!((gdj0) obj3).d()) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 22:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) obj3;
                View view2 = (View) obj2;
                Set<String> set = MusicTrackCellVh.A;
                if (!musicTrackCellVh.d() && (context = view2.getContext()) != null && (h = e3m.h(context)) != null) {
                    Set<String> set2 = MusicTrackCellVh.A;
                    UIBlockMusicTrack uIBlockMusicTrack = musicTrackCellVh.p;
                    boolean P = j5g.P(set2, uIBlockMusicTrack != null ? uIBlockMusicTrack.f : null);
                    UIBlockMusicTrack uIBlockMusicTrack2 = musicTrackCellVh.p;
                    if (uIBlockMusicTrack2 != null && (musicTrack = uIBlockMusicTrack2.z) != null) {
                        if (!epx.f(musicTrack.J, DownloadingState.NotLoaded.b)) {
                            musicTrackCellVh.j(uIBlockMusicTrack2, P, uIBlockMusicTrack2.f);
                        } else if (o25.a().i().C) {
                            ((ms1) musicTrackCellVh.v.getValue()).M(h, musicTrack);
                        }
                    }
                }
                return s3q0.a;
            case 23:
                Context context5 = (Context) obj3;
                yp80 yp80Var = (yp80) obj2;
                Article article = (Article) obj;
                if (article.g() || article.k()) {
                    bu00.s(context5, article, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (article.Q8()) {
                    cvk.u(R.string.article_protected, false);
                } else if (article.i()) {
                    cvk.u(R.string.article_banned, false);
                } else if (article.j()) {
                    cvk.u(R.string.article_deleted, false);
                } else {
                    cvk.u(R.string.error, false);
                }
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return s3q0.a;
            case 24:
                dra0 dra0Var = (dra0) obj3;
                PlacePickerState placePickerState = (PlacePickerState) obj2;
                dra0Var.a.a(new g.C1416g(placePickerState.e, placePickerState.j, EmptyList.b, 0, 0, !placePickerState.b()));
                dra0Var.a.a(new g.d(PlacePickerState.LoadingState.ERROR));
                return s3q0.a;
            case 25:
                ((com.vk.newsfeed.impl.posting.settings.mvi.b) obj3).T(new e.c((PostingSettingsState.CommentsGlobalState) obj2));
                return s3q0.a;
            case 26:
                List list = (List) obj2;
                V0 = ((hyg0) obj).V0((String) obj3);
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        V0.bindLong(i3, ((Number) it.next()).intValue());
                        i3++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        arrayList2.add(en00.a((StickerItemDto) psj.a.fromJson(V0.l2(0), StickerItemDto.class)));
                    }
                    V0.close();
                    return arrayList2;
                } finally {
                    V0.close();
                }
            case 27:
                e2f0 e2f0Var = (e2f0) obj3;
                ClickableReaction clickableReaction = (ClickableReaction) obj2;
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((y0f0) next).a == clickableReaction.e) {
                            r4 = next;
                        }
                    }
                }
                y0f0 y0f0Var = (y0f0) r4;
                if (y0f0Var == null) {
                    return s3q0.a;
                }
                e2f0Var.b().setReaction(y0f0Var);
                if (clickableReaction.f) {
                    e2f0Var.b().setBubbleBackground(ReactionView.Background.BLACK);
                } else {
                    e2f0Var.b().setBubbleBackground(ReactionView.Background.WHITE);
                }
                return s3q0.a;
            case 28:
                i0q0.f(new defpackage.g0((rye.b) obj3, (gtl) obj2, (io.reactivex.rxjava3.disposables.c) obj, 6));
                return s3q0.a;
            default:
                ((rvi0) obj3).l.invoke(new p9i0.d(((axi0) obj2).b.a.a));
                return s3q0.a;
        }
    }

    public /* synthetic */ ut6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ut6(String str, String str2, wsp wspVar) {
        this.b = 14;
        this.c = str;
        this.d = str2;
    }
}
