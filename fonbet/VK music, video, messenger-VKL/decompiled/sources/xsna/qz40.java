package xsna;

import android.content.Intent;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ironsource.C4504q2;
import com.vk.api.generated.market.dto.MarketCommunityReviewFriendDto;
import com.vk.api.generated.market.dto.MarketGetCommunityReviewFriendsResponseDto;
import com.vk.api.generated.photos.dto.PhotosSaveAudioPlaylistCoverResponseDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.newsfeed.api.posting.dto.PostingOrd;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.g;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.onboardingpromo.impl.ui.OnboardingPromoFragment;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.d4g0;
import xsna.dbe0;
import xsna.fh8;
import xsna.fhc0;
import xsna.gm50;
import xsna.hg1;
import xsna.htd0;
import xsna.ifk0;
import xsna.jw00;
import xsna.nsh0;
import xsna.pfm0;
import xsna.phg0;
import xsna.qr60;
import xsna.tj50;
import xsna.utl0;
import xsna.xh60;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qz40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [T, java.util.ArrayList, java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        int i2 = 6;
        int i3 = 10;
        int i4 = 3;
        int i5 = 7;
        int i6 = 14;
        PostingOrd postingOrd = null;
        switch (this.b) {
            case 0:
                rz40 rz40Var = (rz40) this.c;
                PhotosSaveAudioPlaylistCoverResponseDto photosSaveAudioPlaylistCoverResponseDto = (PhotosSaveAudioPlaylistCoverResponseDto) obj;
                String json = new Gson().toJson(photosSaveAudioPlaylistCoverResponseDto.e());
                String d = photosSaveAudioPlaylistCoverResponseDto.d();
                int i7 = rz40Var.n;
                UserId userId = rz40Var.m;
                tfx tfxVar = new tfx("audio.setPlaylistCoverPhoto", new io.reactivex.rxjava3.subjects.b(5), new io.reactivex.rxjava3.subjects.c(i2));
                tfx.o(tfxVar, "hash", d, 0, 0, 12);
                tfx.o(tfxVar, "photo", json, 0, 0, 12);
                if (userId != null) {
                    tfx.n(tfxVar, "playlist_owner_id", userId, 0L, 0L, 12);
                }
                tfx.l(tfxVar, "playlist_id", i7, 0, 0, 8);
                return rsg0.a0(yfb.x(tfxVar)).U(new xb20(new es00(rz40Var, i5), i4));
            case 1:
                j650 j650Var = (j650) this.c;
                RecyclerView recyclerView = j650Var.e;
                f4m.j(j650Var.f);
                j650Var.j = true;
                e650 e650Var = j650Var.g;
                if (e650Var.h.isEmpty()) {
                    rck0 rck0Var = rck0.b;
                    e650Var.setItems(e43.l(rck0Var, rck0Var));
                    recyclerView.addOnItemTouchListener(j650Var.h);
                } else if (epx.f(j5g.i0(e650Var.h), qck0.b)) {
                    e650Var.setItems(j5g.v0(rck0.b, j5g.T(1, e650Var.h)));
                }
                recyclerView.setVisibility(0);
                return s3q0.a;
            case 2:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) this.c;
                MviMembersListFragment.a aVar = MviMembersListFragment.T;
                ((BridgeComponent) mviMembersListFragment.R.getValue()).p().f().a(mviMembersListFragment.requireContext(), (String) obj, false);
                return s3q0.a;
            case 3:
                return ep50.q1((ep50) this.c, (utl0.a) obj);
            case 4:
                j170 j170Var = (j170) obj;
                ((dv60) this.c).c(new xh60.e(zp60.a));
                return new kv60(new qr60.a.g(j170Var.a, j170Var.b, j170Var.d, j170Var.e, j170Var.f, null, null, 96));
            case 5:
                xb70 xb70Var = (xb70) this.c;
                tj50.a aVar2 = (tj50.a) obj;
                qcw qcwVar = new qcw(i3);
                ao8 ao8Var = ao8.d;
                return new yb70.a(aVar2.a(qcwVar, ao8Var), aVar2.a(new es00(xb70Var, i6), ao8Var), aVar2.a(new leq(23), ao8Var));
            case 6:
                OnboardingPromoFragment onboardingPromoFragment = (OnboardingPromoFragment) this.c;
                g47 g47Var = (g47) obj;
                qcy<Object>[] qcyVarArr = OnboardingPromoFragment.Q;
                g47Var.e(tci.l(onboardingPromoFragment.fo()), gh80.b);
                g47Var.a(tci.k(onboardingPromoFragment.fo()));
                g47Var.d(new tf80(onboardingPromoFragment.fo()));
                return s3q0.a;
            case 7:
                dw20 dw20Var = ((dz80) this.c).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 8:
                m84 m84Var = (m84) this.c;
                int i8 = PhotoFlowToolbarView.B;
                m84Var.invoke();
                return s3q0.a;
            case 9:
                Photo photo = (Photo) this.c;
                Photo photo2 = ((PhotoAttachment) obj).l;
                return Boolean.valueOf(epx.f(photo2.e, photo.e) && photo2.c == photo.c);
            case 10:
                fra0 fra0Var = (fra0) this.c;
                gra0 gra0Var = fra0Var.n;
                tqa0 tqa0Var = fra0Var.l;
                if (gra0Var != null) {
                    tqa0Var.yi(new a.d.b(SystemClock.elapsedRealtime()));
                    tqa0Var.yi(new sqa0(gra0Var.a));
                }
                return s3q0.a;
            case 11:
                xfb0 xfb0Var = (xfb0) this.c;
                int intValue = ((Integer) obj).intValue();
                return xfb0Var.e[intValue] + ": " + xfb0Var.h(intValue).f();
            case 12:
                PostingSettingsFragmentMvi postingSettingsFragmentMvi = (PostingSettingsFragmentMvi) this.c;
                com.vk.newsfeed.impl.posting.settings.mvi.g gVar = (com.vk.newsfeed.impl.posting.settings.mvi.g) obj;
                int i9 = PostingSettingsFragmentMvi.Y;
                if (gVar instanceof g.c) {
                    ckc0 ckc0Var = postingSettingsFragmentMvi.R;
                    if (ckc0Var == null) {
                        ckc0Var = null;
                    }
                    ckc0.c(ckc0Var, new Date(((g.c) gVar).a), null, null, 6);
                } else if (gVar instanceof g.d) {
                    RecyclerView recyclerView2 = postingSettingsFragmentMvi.Q;
                    postingSettingsFragmentMvi.X.b(mxt0.a(((g.d) gVar).a, recyclerView2 != null ? recyclerView2 : null));
                } else if (gVar instanceof g.e) {
                    String str = ((g.e) gVar).a;
                    ptj ptjVar = postingSettingsFragmentMvi.S;
                    ptj ptjVar2 = ptjVar != null ? ptjVar : null;
                    ptjVar2.a(postingSettingsFragmentMvi.requireContext(), str);
                    TextView textView = ptjVar2.d;
                    if (textView != null) {
                        textView.setEnabled(false);
                    }
                } else if (gVar instanceof g.f) {
                    RecyclerView recyclerView3 = postingSettingsFragmentMvi.Q;
                    postingSettingsFragmentMvi.X.a(mxt0.a(((g.f) gVar).a, recyclerView3 != null ? recyclerView3 : null));
                } else if (gVar.equals(g.C1391g.a)) {
                    xwk.d().e().a(postingSettingsFragmentMvi.requireContext(), "https://" + a0a.d + "/@adminsclub-citation");
                } else if (gVar instanceof g.a) {
                    g.a aVar3 = (g.a) gVar;
                    ((fhc0.e) postingSettingsFragmentMvi.W.getValue()).b(aVar3.b);
                    maz.c(xwk.d().e(), postingSettingsFragmentMvi.requireContext(), ((String) postingSettingsFragmentMvi.T.getValue()) + aVar3.a, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_SETTINGS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
                } else if (gVar instanceof g.b) {
                    PostingSettingsState postingSettingsState = ((g.b) gVar).a;
                    Boolean bool = postingSettingsState.o.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        PostingSettingsState.a aVar4 = postingSettingsState.o;
                        postingOrd = new PostingOrd(booleanValue, aVar4.b, aVar4.d);
                    }
                    postingSettingsFragmentMvi.Mf(-1, new Intent().putExtra("commentsClosing", !postingSettingsState.i.c).putExtra(C4504q2.x, !postingSettingsState.j.b).putExtra("postponeDate", postingSettingsState.k.d).putExtra("copyrightLink", postingSettingsState.l.b).putExtra("needHideName", postingSettingsState.n.b).putExtra("token_advertising_ord", postingOrd));
                } else if (gVar.equals(g.h.a)) {
                    postingSettingsFragmentMvi.fo(R.string.posting_advertising_added, R.drawable.vk_icon_check_circle_outline_28, R.attr.vk_ui_icon_positive);
                } else if (gVar.equals(g.j.a)) {
                    postingSettingsFragmentMvi.fo(R.string.posting_advertising_removed, R.drawable.vk_icon_loudspeaker_slash_outline_28, R.attr.vk_ui_icon_negative);
                } else {
                    if (!gVar.equals(g.i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    postingSettingsFragmentMvi.fo(R.string.posting_advertising_not_allowed, R.drawable.vk_icon_error_circle_outline_28, R.attr.vk_ui_icon_negative);
                }
                return s3q0.a;
            case 13:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                int i10 = 9;
                gom0.a(gom0Var, vuc0.b, new com.vk.movika.tools.controls.seekbar.k(postsFromNotificationsFragment, i10));
                gom0.a(gom0Var, wuc0.b, new com.vk.movika.tools.controls.seekbar.l(postsFromNotificationsFragment, 11));
                gom0.a(gom0Var, xuc0.b, new om9(postsFromNotificationsFragment, i6));
                gom0.a(gom0Var, yuc0.b, new o4e(postsFromNotificationsFragment, 8));
                gom0.a(gom0Var, zuc0.b, new com.vk.movika.tools.controls.seekbar.p(postsFromNotificationsFragment, i10));
                return s3q0.a;
            case 14:
                y5d0 y5d0Var = (y5d0) this.c;
                pfm0.a aVar5 = y5d0Var.n;
                if (aVar5 != null) {
                    aVar5.e(y5d0Var.getAbsoluteAdapterPosition());
                }
                return s3q0.a;
            case 15:
                ktd0 ktd0Var = (ktd0) this.c;
                jw00 jw00Var = (jw00) ((Map) obj).get(jw00.a.c);
                if (jw00Var != null) {
                    ktd0Var.C(new htd0.i(jw00Var.a()));
                }
                return s3q0.a;
            case 16:
                PublishState publishState = (PublishState) obj;
                Date date = ((dbe0.j.c) ((dbe0.j) this.c)).b;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, (date == null || !date.after(new Date())) ? null : date, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -12289, 2047);
            case 17:
                xaf0 xaf0Var = (xaf0) this.c;
                g4l0 g4l0Var = (g4l0) obj;
                if ((g4l0Var instanceof s1l0) || (g4l0Var instanceof q1l0)) {
                    xaf0Var.k.p(false);
                }
                return s3q0.a;
            case 18:
                rdf0 rdf0Var = (rdf0) this.c;
                for (StickerPackRecommendationBlock stickerPackRecommendationBlock : (List) obj) {
                    rdf0Var.a.put(stickerPackRecommendationBlock.b, new cbf0(stickerPackRecommendationBlock.c, stickerPackRecommendationBlock.d, stickerPackRecommendationBlock.e));
                }
                return s3q0.a;
            case 19:
                j4g0 j4g0Var = (j4g0) this.c;
                i4g0 i4g0Var = j4g0Var.s;
                if (i4g0Var != null) {
                    j4g0Var.l.a(new d4g0.a(i4g0Var.b, i4g0Var.c, i4g0Var.d, i4g0Var.m));
                }
                return s3q0.a;
            case 20:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                MarketGetCommunityReviewFriendsResponseDto marketGetCommunityReviewFriendsResponseDto = (MarketGetCommunityReviewFriendsResponseDto) obj;
                List<MarketCommunityReviewFriendDto> d2 = marketGetCommunityReviewFriendsResponseDto.d();
                ?? arrayList = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    arrayList.add(bu00.a((MarketCommunityReviewFriendDto) it.next()));
                }
                ref$ObjectRef.element = arrayList;
                int g = marketGetCommunityReviewFriendsResponseDto.g();
                Boolean e = marketGetCommunityReviewFriendsResponseDto.e();
                boolean booleanValue2 = e != null ? e.booleanValue() : false;
                Integer f = marketGetCommunityReviewFriendsResponseDto.f();
                return new phg0.f(arrayList, g, booleanValue2, f != null ? f.intValue() : 0);
            case 21:
                ((rdh0) this.c).c.invoke();
                return s3q0.a;
            case 22:
                orh0 orh0Var = (orh0) this.c;
                nsh0.a aVar6 = (nsh0.a) obj;
                gm50.a.a(orh0Var, aVar6.a, new vlc0(orh0Var, i5));
                gm50.a.a(orh0Var, aVar6.b, new waf0(orh0Var, 4));
                return s3q0.a;
            case 23:
                kxi0 kxi0Var = (kxi0) this.c;
                Collection<f.a.b> collection = (Collection) obj;
                Collection<f.a.b> collection2 = collection;
                Collection<f.a.b> collection3 = collection2;
                if (collection3.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = collection2.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((f.a.b) it2.next()).c && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                boolean z2 = i > 0;
                int i11 = collection.isEmpty() ? R.string.voip_session_room_admin_create_rooms_header : R.string.voip_session_room_admin_configure_rooms_header;
                boolean z3 = !collection.isEmpty();
                if (!collection3.isEmpty()) {
                    Iterator it3 = collection2.iterator();
                    while (it3.hasNext()) {
                        if (((f.a.b) it3.next()).c) {
                            z = true;
                            kxi0Var.d.onNext(new com.vk.voip.ui.sessionrooms.f(null, z2, z2, Integer.valueOf(i11), z3, true, z, 25));
                            kxi0Var.b.onNext(collection);
                            return s3q0.a;
                        }
                    }
                }
                z = false;
                kxi0Var.d.onNext(new com.vk.voip.ui.sessionrooms.f(null, z2, z2, Integer.valueOf(i11), z3, true, z, 25));
                kxi0Var.b.onNext(collection);
                return s3q0.a;
            case 24:
                uhj0 uhj0Var = (uhj0) this.c;
                Iterator it4 = ((List) obj).iterator();
                while (it4.hasNext()) {
                    uhj0Var.Z((ActionLink) it4.next());
                }
                UserId userId2 = uhj0Var.e;
                long j = fkq0.b(userId2) ? -userId2.b : 0L;
                z20 z20Var = new z20("actionLinks.getByTag", r9);
                z20Var.K("tag", "live");
                if (j != 0) {
                    z20Var.D(j, "group_id");
                }
                return rsg0.y0(z20Var, null, null, 3);
            case 25:
                ((clj0) this.c).e.invoke(new fh8.i.a((Throwable) obj));
                return s3q0.a;
            case 26:
                ((p7k0) this.c).getClass();
                return s3q0.a;
            case 27:
                ifk0 ifk0Var = (ifk0) this.c;
                ifk0.a aVar7 = ifk0Var.o;
                izs<? super ifk0.a, s3q0> izsVar = ifk0Var.p;
                if (aVar7 != null && izsVar != null) {
                    izsVar.invoke(aVar7);
                }
                return s3q0.a;
            case 28:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) this.c;
                u0a u0aVar = (u0a) obj;
                if (u0aVar instanceof cfp0) {
                    UIBlock uIBlock = ((cfp0) u0aVar).a;
                    UIBlockActionOpenSection uIBlockActionOpenSection = uIBlock instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlock : null;
                    if (uIBlockActionOpenSection != null) {
                        y9l0.a(new u1l0(uIBlockActionOpenSection.B));
                    }
                } else if (u0aVar instanceof qc80) {
                    int i12 = stickerCatalogRootVh.p;
                    tfx tfxVar2 = new tfx("store.hideCatalogNotification", new bjl0(0), new p11(26));
                    tfx.l(tfxVar2, "notification_id", i12, 0, 0, 8);
                    tfx.o(tfxVar2, "reason", "decline", 0, 0, 12);
                    itg0.m(hg1.m(rsg0.y0(yfb.x(tfxVar2), null, null, 3), stickerCatalogRootVh.b, 0L, false, 62));
                } else if ((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("stickers_search_recent_block_id")) {
                    stickerCatalogRootVh.v.b();
                }
                return s3q0.a;
            default:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) ((arl0) this.c).C.getValue();
                hg1.u3 u3Var = new hg1.u3(crl0.b);
                qVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, u3Var).U(new hg1.t3(drl0.b)).K().r(3000L, TimeUnit.MILLISECONDS), new hi70(new t810(i6), i5));
        }
    }
}
