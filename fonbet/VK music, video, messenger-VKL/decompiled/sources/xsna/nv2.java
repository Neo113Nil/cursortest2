package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.articles.authorpage.ArticleAuthorPageSortType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacement;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.checkbox.VkCheckbox;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.articles.Article;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.cart.impl.cart.feature.state.ExternalOrderState;
import com.vk.ecomm.reviews.impl.allreviews.presentation.a;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.impl.name_history.e;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import org.chromium.net.NetError;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.ang;
import xsna.ang.b;
import xsna.bg7;
import xsna.cfa0;
import xsna.d3q;
import xsna.e8v0;
import xsna.f0r;
import xsna.gbr;
import xsna.gm50;
import xsna.lx9;
import xsna.px9;
import xsna.rv9;
import xsna.tls;
import xsna.vlp0;
import xsna.wk50;
import xsna.xnn0;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nv2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nv2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v70, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44, types: [T] */
    /* JADX WARN: Type inference failed for: r4v65 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.core.view.components.tabs.e eVar;
        ?? mutableBoundingBox;
        InfoBar.Payload.GiftsBirthdays.User user;
        int i = 10;
        int i2 = 1;
        r6 = null;
        Long l = null;
        switch (this.b) {
            case 0:
                mv2 mv2Var = (mv2) this.c;
                e4 e4Var = (e4) this.d;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    mv2Var.invoke();
                } else {
                    e4Var.invoke();
                }
                return s3q0.a;
            case 1:
                hn3 hn3Var = (hn3) this.c;
                gzs gzsVar = (gzs) this.d;
                Context context = hn3Var.itemView.getContext();
                Object obj2 = hn3Var.l;
                Article article = ((ym3) (obj2 != null ? obj2 : null)).a;
                QueryParameters queryParameters = new QueryParameters();
                queryParameters.b.put("ref", "article_author_page");
                xm3.a(queryParameters, (ArticleAuthorPageSortType) gzsVar.invoke());
                bu00.s(context, article, queryParameters, 116);
                return s3q0.a;
            case 2:
                bq6 bq6Var = (bq6) this.c;
                xnn0.h hVar = (xnn0.h) this.d;
                kgq0 kgq0Var = bq6Var.l;
                if (kgq0Var != null) {
                    kgq0Var.b(hVar.a);
                }
                return s3q0.a;
            case 3:
                return new g07((BigPlayerBottomSheetValue) obj, (azl) this.c, m07.b, (izs) this.d);
            case 4:
                wf7 wf7Var = (wf7) this.c;
                Executor executor = (Executor) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    return m4s.F(wf7Var.deleteBytes(new DeleteBytesRequest(new ArrayList(), true)), executor).l(new l4(new la2(2), 7));
                }
                new ArrayList();
                List singletonList = Collections.singletonList("metaInf");
                exc0.j(singletonList, "Keys cannot be set to null");
                return m4s.E(wf7Var.retrieveBytes(new RetrieveBytesRequest(singletonList, false))).l(new mm6(new d37(i2), i2));
            case 5:
                vw9 vw9Var = (vw9) this.c;
                rv9.g gVar = (rv9.g) this.d;
                vw9Var.T(px9.a.C3534a.b);
                UserId userId = gVar.b;
                vw9Var.T(new px9.j(new ExternalOrderState(false, false, null, 7, null)));
                vw9Var.g.b(new lx9.i((String) obj, userId));
                return s3q0.a;
            case 6:
                z9a z9aVar = (z9a) this.c;
                String str = (String) this.d;
                List<MusicTrack> list = (List) obj;
                nt70 nt70Var = new nt70(z9aVar.e);
                nt70Var.l = list;
                mt70 a = nt70Var.a(str);
                z9aVar.i.getClass();
                List singletonList2 = Collections.singletonList(new CatalogReplacement(e43.l("synthetic_offline_tracks_header", z9aVar.f), new td50(a.l).a(a)));
                List<MusicTrack> list2 = list;
                HashMap hashMap = new HashMap(list2.size());
                for (MusicTrack musicTrack : list2) {
                    hashMap.put(musicTrack.Fb(), musicTrack);
                }
                CatalogReplacementResponse catalogReplacementResponse = new CatalogReplacementResponse(singletonList2, new CatalogExtendedData(null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, -1, 7, null), null);
                z9aVar.f = str;
                return catalogReplacementResponse;
            case 7:
                wh50 wh50Var = (wh50) this.c;
                gzs gzsVar2 = (gzs) this.d;
                VkCheckbox.State state = (VkCheckbox.State) obj;
                if (wh50Var.getValue() != state) {
                    wh50Var.setValue(state);
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 8:
                rgd rgdVar = (rgd) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                gbr.a aVar = (gbr.a) obj;
                if (aVar.e <= 0) {
                    rgdVar.e();
                    return s3q0.a;
                }
                Serializer.c<MusicTrack> cVar = MusicTrack.CREATOR;
                rgdVar.g(new MusicTrack((int) UUID.randomUUID().getLeastSignificantBits(), null, rgdVar.a.getString(R.string.clips_original_sound_title), null, aVar.e, 0, o25.a().o().b, ((Uri) j5g.Y(arrayList)).toString(), null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, DownloadingState.Downloaded.b, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, NetError.ERR_CERTIFICATE_TRANSPARENCY_REQUIRED, 1048571, null), null);
                return s3q0.a;
            case 9:
                ((yle) this.c).a.k2((SdkClipAudioTemplate) this.d);
                return s3q0.a;
            case 10:
                ClipsEditorInputData clipsEditorInputData = (ClipsEditorInputData) this.c;
                r1f r1fVar = (r1f) this.d;
                List list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(jyd.a((ClipsProcessedItem) it.next()));
                }
                return uzd.a(ClipsEditorInputData.a(clipsEditorInputData, arrayList2, null, null, false, false, null, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), r1fVar.g, r1fVar.h);
            case 11:
                txf txfVar = (txf) this.c;
                Msg msg = (Msg) this.d;
                w2w w2wVar = txfVar.c;
                Integer valueOf = w2wVar.I0().o().y0(msg.d, msg.c) ? Integer.valueOf(((Msg) j5g.Y((List) new com.vk.im.engine.internal.merge.messages.b(txfVar.d, msg, false, false, 60).o(w2wVar))).b) : null;
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                txfVar.j = intValue;
                txfVar.l = intValue > 0;
                if (msg instanceof MsgFromUser) {
                    long j = msg.c;
                    if (q6x.w(w2wVar, j, msg)) {
                        q6x.F(w2wVar, j, (MsgFromUser) msg);
                        l = Long.valueOf(j);
                    }
                }
                txfVar.k = l != null;
                return s3q0.a;
            case 12:
                ang angVar = (ang) this.c;
                ang.b bVar = (ang.b) this.d;
                oge0 oge0Var = angVar.c;
                Activity activity = angVar.b;
                StickerStockItem stickerStockItem = bVar.b;
                oge0Var.k(activity, stickerStockItem, new ang.a(activity, angVar.new b(stickerStockItem, bVar.c)), Boolean.TRUE, (Boolean) obj);
                return s3q0.a;
            case 13:
                ((q7v0) this.c).a(((xrh.c.b) this.d).b, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 14:
                CommunityNameHistoryFragment communityNameHistoryFragment = (CommunityNameHistoryFragment) this.c;
                UsableRecyclerPaginatedView usableRecyclerPaginatedView = (UsableRecyclerPaginatedView) this.d;
                e.a aVar2 = (e.a) obj;
                int i3 = CommunityNameHistoryFragment.S;
                gm50.a.a(communityNameHistoryFragment, aVar2.a, new com.vk.libvideo.b(i, communityNameHistoryFragment, usableRecyclerPaginatedView));
                gm50.a.a(communityNameHistoryFragment, aVar2.b, new com.vk.movika.sdk.base.observable.e(usableRecyclerPaginatedView, 29));
                return s3q0.a;
            case 15:
                h4o h4oVar = (h4o) this.c;
                rg50 rg50Var = (rg50) this.d;
                s4o s4oVar = (s4o) obj;
                s4oVar.a(new wow(h4oVar.b), atv0.c);
                s4oVar.b(new iq6(rg50Var));
                return s3q0.a;
            case 16:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new d3q.a((izs) this.c, (SuspendLambda) this.d, null), 3));
            case 17:
                ((f0r.v) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 18:
                ((z0s) this.c).c.d(new x480((String) this.d, (Throwable) obj));
                return s3q0.a;
            case 19:
                vlp0 vlp0Var = (vlp0) this.c;
                jcg jcgVar = (jcg) this.d;
                qcy<Object>[] qcyVarArr = FragmentImpl.M;
                vlp0Var.removeListener((vlp0.i) obj);
                jcgVar.invoke();
                return s3q0.a;
            case 20:
                FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = (FriendsAndFollowersRootFragment) this.c;
                tls.a aVar3 = (tls.a) this.d;
                int i4 = FriendsAndFollowersRootFragment.Z;
                els c = FriendsAndFollowersRootFragment.b.c((els) obj, friendsAndFollowersRootFragment.ho());
                if (friendsAndFollowersRootFragment.ho()) {
                    FriendsAndFollowersTabType a2 = aVar3.a.a();
                    k1q0 k1q0Var = friendsAndFollowersRootFragment.R;
                    qpo qpoVar = k1q0Var instanceof qpo ? (qpo) k1q0Var : null;
                    if (qpoVar != null) {
                        friendsAndFollowersRootFragment.V = c;
                        boolean f = epx.f(qpoVar.t, c);
                        friendsAndFollowersRootFragment.U = true;
                        if (!f) {
                            try {
                                com.vk.core.view.components.tabs.e eVar2 = friendsAndFollowersRootFragment.S;
                                if (eVar2 != null) {
                                    eVar2.b();
                                }
                                VkTabs vkTabs = (VkTabs) friendsAndFollowersRootFragment.go().b;
                                int i5 = VkTabs.t;
                                vkTabs.h(true);
                            } catch (Throwable th) {
                                friendsAndFollowersRootFragment.U = false;
                                throw th;
                            }
                        }
                        qpoVar.J0(c);
                        if (a2 != null) {
                            FriendsAndFollowersTabType friendsAndFollowersTabType = c.d.isEmpty() ? null : a2;
                            if (friendsAndFollowersTabType != null) {
                                friendsAndFollowersRootFragment.ko(friendsAndFollowersTabType);
                            }
                        }
                        if (!f && (eVar = friendsAndFollowersRootFragment.S) != null) {
                            eVar.a();
                        }
                        friendsAndFollowersRootFragment.U = false;
                    }
                } else {
                    FriendsAndFollowersTabType a3 = aVar3.a.a();
                    k1q0 k1q0Var2 = friendsAndFollowersRootFragment.R;
                    nks nksVar = k1q0Var2 instanceof nks ? (nks) k1q0Var2 : null;
                    if (nksVar != null) {
                        friendsAndFollowersRootFragment.V = c;
                        if (!epx.f(nksVar.t, c)) {
                            nksVar.t = c;
                            nksVar.notifyDataSetChanged();
                        }
                        if (a3 != null) {
                            int e = FriendsAndFollowersRootFragment.b.e(a3, friendsAndFollowersRootFragment.V.d);
                            VkTabs vkTabs2 = (VkTabs) friendsAndFollowersRootFragment.go().b;
                            int i6 = VkTabs.t;
                            vkTabs2.l(e, true);
                        }
                    }
                }
                return s3q0.a;
            case 21:
                com.vk.geo.impl.presentation.b bVar2 = (com.vk.geo.impl.presentation.b) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                CameraBounds cameraBounds = (CameraBounds) obj;
                if (bVar2.w.get() == null || bVar2.t.getAndSet(false)) {
                    return s3q0.a;
                }
                xf9.d(xf9.e, cameraBounds, bVar2);
                L.d(new xk(15, cameraBounds, ref$ObjectRef));
                y98 y98Var = y98.e;
                Object obj3 = ref$ObjectRef.element;
                y98Var.getClass();
                MutableBoundingBox mutableBoundingBox2 = obj3 instanceof MutableBoundingBox ? (MutableBoundingBox) obj3 : null;
                if (mutableBoundingBox2 != null) {
                    y98Var.c(mutableBoundingBox2);
                }
                MutableBoundingBox a4 = y98Var.a();
                BoundingBox D0 = cameraBounds.D0();
                if (a4 != null) {
                    a4.g = D0.M();
                    a4.h = D0.T();
                    mutableBoundingBox = a4;
                } else {
                    mutableBoundingBox = new MutableBoundingBox(D0.M(), D0.T(), null);
                }
                ref$ObjectRef.element = mutableBoundingBox;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"bbox=" + cameraBounds + " userCoordinate=null"});
                }
                x19.v(bVar2.q, zvj.g(bVar2.n, hqu0.a()), null, new ikt(cameraBounds, bVar2, null), 6);
                return s3q0.a;
            case 22:
                InfoBar infoBar = (InfoBar) this.c;
                ovw ovwVar = (ovw) this.d;
                String str2 = infoBar.b;
                UserId userId2 = (!epx.f(str2, "gifts_birthdays") || (user = ovwVar.p) == null) ? null : user.b;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str2, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_MODAL, userId2 != null ? Long.valueOf(userId2.b) : null), 3);
                iid0Var.f = c2;
                iid0Var.g = b;
                iid0Var.q();
                InfoBar.Button button = (InfoBar.Button) j5g.a0(infoBar.j);
                pvw pvwVar = ovwVar.l;
                if (epx.f(infoBar.b, "gifts_birthdays")) {
                    pvwVar.f(infoBar);
                } else if (button != null) {
                    pvwVar.d(infoBar, button);
                }
                return s3q0.a;
            case 23:
                LeadFormHolder leadFormHolder = (LeadFormHolder) this.c;
                ShitAttachment.LeadForm leadForm = (ShitAttachment.LeadForm) this.d;
                if (((BaseBoolIntDto) obj) == BaseBoolIntDto.YES) {
                    leadFormHolder.W6(leadForm);
                } else {
                    cvk.u(R.string.lead_ads_send_error, false);
                }
                leadFormHolder.J = false;
                return s3q0.a;
            case 24:
                ft00 ft00Var = (ft00) this.c;
                a.g.C1006a c1006a = (a.g.C1006a) this.d;
                List<cf10> list4 = ft00Var.l;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                for (cf10 cf10Var : list4) {
                    if (cf10Var.a == c1006a.b) {
                        cf10Var = cf10.a(cf10Var, false, true, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                    }
                    arrayList3.add(cf10Var);
                }
                return new c.l(arrayList3);
            case 25:
                Photo photo = (Photo) this.c;
                ba10 ba10Var = (ba10) this.d;
                cfa0.a aVar4 = (cfa0.a) obj;
                photo.h = aVar4.a;
                photo.j = aVar4.b;
                photo.i = aVar4.c;
                photo.k = aVar4.d;
                photo.n = aVar4.e;
                photo.o = aVar4.f;
                photo.q = aVar4.g;
                photo.r = aVar4.h;
                photo.l = true;
                photo.I = aVar4.j;
                photo.J = aVar4.i;
                ba10Var.invoke(photo);
                return s3q0.a;
            case 26:
                MusicFollowCuratorButtonVh musicFollowCuratorButtonVh = (MusicFollowCuratorButtonVh) this.c;
                UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = (UIBlockActionCuratorSubscription) this.d;
                musicFollowCuratorButtonVh.f = null;
                uIBlockActionCuratorSubscription.A = false;
                musicFollowCuratorButtonVh.b(false);
                return s3q0.a;
            case 27:
                ((um50) this.c).c(new a94(13, (h7f0) obj, (lj50) this.d));
                return s3q0.a;
            case 28:
                wh50 wh50Var2 = (wh50) this.c;
                wh50 wh50Var3 = (wh50) this.d;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) obj;
                vkOnboardingHighlighter.setHighlighterType((VkOnboarding$HighlighterMarkerType) wh50Var2.getValue());
                vkOnboardingHighlighter.setHighlighterColor((VkOnboarding$TintColor) wh50Var3.getValue());
                return s3q0.a;
            default:
                gpd0 gpd0Var = (gpd0) this.c;
                String str3 = (String) this.d;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "order_product_amount_and_price");
                if (gpd0Var.i > 1) {
                    qgi0.h(tgi0Var, str3);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ nv2(wf7 wf7Var, Executor executor, bg7.c cVar) {
        this.b = 4;
        this.c = wf7Var;
        this.d = executor;
    }

    public /* synthetic */ nv2(azl azlVar, izs izsVar) {
        this.b = 3;
        float f = m07.a;
        this.c = azlVar;
        this.d = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nv2(izs izsVar, wzs wzsVar) {
        this.b = 16;
        this.c = izsVar;
        this.d = (SuspendLambda) wzsVar;
    }
}
