package xsna;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.Recomposer;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.MsgViewFragment;
import com.vk.importcontacts.impl.presentation.main.fragment.ImportContactsFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.snippet.ui.presentation.MusicSnippetsFragment;
import com.vk.onboardingpromo.impl.ui.entity.OnboardingPromoState;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.permission.PermissionHelper;
import com.vk.photos.root.presentation.i;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.toggle.features.VkcFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.aex;
import xsna.bs;
import xsna.ej90;
import xsna.gm50;
import xsna.j070;
import xsna.l310;
import xsna.mqw;
import xsna.nov;
import xsna.p810;
import xsna.rf60;
import xsna.s1r0;
import xsna.v650;
import xsna.w270;
import xsna.xn50;
import xsna.xqu;
import xsna.ykb0;
import xsna.yo60;
import xsna.zjw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class owv implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ owv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        io.reactivex.rxjava3.core.q qVar;
        io.reactivex.rxjava3.core.q U;
        int i = 14;
        int i2 = 19;
        int i3 = 25;
        int i4 = 1;
        int i5 = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(pwv.a((Attach) obj, (UserId) this.c));
            case 1:
                ImportContactsFragment importContactsFragment = (ImportContactsFragment) this.c;
                mqw mqwVar = (mqw) obj;
                int i6 = ImportContactsFragment.Q;
                if (epx.f(mqwVar, mqw.a.a)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context requireContext = importContactsFragment.requireContext();
                    permissionHelper.getClass();
                    PermissionHelper.l(permissionHelper, requireContext, PermissionHelper.y, new cnh(importContactsFragment, i), new n9w(i4), 4);
                } else {
                    if (!epx.f(mqwVar, mqw.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    importContactsFragment.Mf(0, null);
                }
                return s3q0.a;
            case 2:
                wex wexVar = (wex) this.c;
                aex.a aVar = wexVar.z0;
                pdx pdxVar = wexVar.s0;
                if (aVar != null) {
                    pdxVar.a(pdxVar.e(aVar).o(asu0.a.d()).subscribe(new uex(i5), new ir0(new lfa(6, wexVar, aVar), i2)));
                    dex.a((ImageView) wexVar.u0.getValue(), aVar.b().c0);
                }
                return s3q0.a;
            case 3:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                int i7 = MarketAllReviewsFragment.d0;
                gm50.a.a(marketAllReviewsFragment, ((e.b) obj).a, new ayo(marketAllReviewsFragment, 17));
                SwipeRefreshLayout swipeRefreshLayout = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(false);
                SwipeRefreshLayout swipeRefreshLayout2 = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setEnabled(false);
                NestedScrollView nestedScrollView = marketAllReviewsFragment.U;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, true);
                }
                VkSpinner vkSpinner = marketAllReviewsFragment.S;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, false);
                }
                RecyclerView recyclerView = marketAllReviewsFragment.R;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                bwt0.p0(recyclerView, false);
                wr00 wr00Var = marketAllReviewsFragment.V;
                (wr00Var != null ? wr00Var : null).setItems(EmptyList.b);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((b25) ((MarketItemCommentsFragment) this.c).e0.getValue()).a((UserId) obj));
            case 5:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                int i8 = MarketItemReviewsFragment.w0;
                l310.a aVar2 = l310.a.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, aVar2);
                return s3q0.a;
            case 6:
                ((f810) this.c).T(new p810.h((Throwable) obj));
                return s3q0.a;
            case 7:
                ((zak0) ((dr20) this.c).l).setValue((String) obj);
                return s3q0.a;
            case 8:
                rx30 rx30Var = (rx30) this.c;
                int i9 = rur0.m;
                return new rur0(rx30Var.i.inflate(R.layout.vkim_offline_list_item_for_msgs, (ViewGroup) obj, false), rx30Var.h);
            case 9:
                int i10 = MsgViewFragment.i0;
                ((mu1) this.c).invoke((MsgFromUser) obj);
                return s3q0.a;
            case 10:
                MusicPageInfoBlockNewVh musicPageInfoBlockNewVh = (MusicPageInfoBlockNewVh) this.c;
                musicPageInfoBlockNewVh.p = null;
                musicPageInfoBlockNewVh.j(false, true);
                return s3q0.a;
            case 11:
                MusicSnippetsFragment musicSnippetsFragment = (MusicSnippetsFragment) this.c;
                v650 v650Var = (v650) obj;
                int i11 = MusicSnippetsFragment.Y;
                if (v650Var instanceof v650.a) {
                    musicSnippetsFragment.finish();
                } else if (v650Var instanceof v650.b) {
                    maz e = xwk.d().e();
                    Context requireContext2 = musicSnippetsFragment.requireContext();
                    String str = ((v650.b) v650Var).a;
                    LaunchContext.a aVar3 = new LaunchContext.a();
                    aVar3.d = MusicPlaybackLaunchContext.N.t();
                    maz.c(e, requireContext2, str, aVar3.a(), null, null, 24);
                } else {
                    if (!v650Var.equals(v650.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bpn0 bpn0Var = lyd.d;
                    ((fl4) (bpn0Var != null ? bpn0Var : null).getValue()).N(musicSnippetsFragment.kn());
                }
                return s3q0.a;
            case 12:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                AppCompatTextView appCompatTextView = ((he50) this.c).e;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(spannableStringBuilder);
                }
                return s3q0.a;
            case 13:
                yj50 yj50Var = (yj50) this.c;
                yj50Var.c.P9(yj50Var, (kj50) obj);
                return s3q0.a;
            case 14:
                ((x660) this.c).a(((g480) obj).d());
                return s3q0.a;
            case 15:
                ((sg60) this.c).c(new rf60.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 16:
                ((com.vk.feed.settings.impl.presentation.filtered.tab.c) this.c).V(new f.d.a((Throwable) obj));
                return s3q0.a;
            case 17:
                ((j070.a) this.c).d.run();
                return s3q0.a;
            case 18:
                t270 t270Var = (t270) this.c;
                ?? r3 = t270Var.i1;
                w270 w270Var = (w270) obj;
                int i12 = t270.j1;
                if (w270Var.equals(w270.a.a)) {
                    t270Var.dismiss();
                } else {
                    if (!(w270Var instanceof w270.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t270Var.dismiss();
                    if (((w270.b) w270Var).a) {
                        i0t0 i0t0Var = (i0t0) r3.getValue();
                        t270Var.kn();
                        i0t0Var.getClass();
                    } else {
                        try {
                            t270Var.startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
                            failure = s3q0.a;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (Result.a(failure) != null) {
                            i0t0 i0t0Var2 = (i0t0) r3.getValue();
                            t270Var.kn();
                            i0t0Var2.getClass();
                        }
                    }
                }
                return s3q0.a;
            case 19:
                return OnboardingPromoState.a((OnboardingPromoState) obj, null, null, null, ((a.e) this.c).b, 7);
            case 20:
                zjw.a aVar4 = (zjw.a) this.c;
                if (((Throwable) obj) instanceof Exception) {
                    aVar4.onError();
                }
                return s3q0.a;
            case 21:
                String str2 = ((ur80) this.c).d;
                Photo photo = (Photo) j5g.a0((List) obj);
                if (photo == null) {
                    return io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }
                String str3 = photo.v;
                if ((str3 == null || str3.length() == 0) && str2 != null && str2.length() != 0) {
                    photo.v = str2;
                }
                if (!fkq0.c(photo.f)) {
                    return io.reactivex.rxjava3.core.q.T(photo);
                }
                if (fkq0.b(photo.f)) {
                    UserId userId = photo.f;
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.a(userId));
                    if (C0 != null) {
                        U = io.reactivex.rxjava3.core.q.T(C0);
                    } else {
                        dqu dquVar = new dqu();
                        List singletonList = Collections.singletonList(fkq0.a(userId));
                        List l = e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE);
                        if ((4 & 2) != 0) {
                            l = null;
                        }
                        U = rsg0.T(yfb.x(xqu.a.a(null, singletonList, l))).U(new t34(new q520(dquVar, 9), i3));
                    }
                    qVar = U.U(new qu50(new amp(18), 3));
                } else if (fkq0.d(photo.f)) {
                    VkcFeatures vkcFeatures = VkcFeatures.MIGRATION_USERS_GET_TO_ACC_GET;
                    vkcFeatures.getClass();
                    if (com.vk.toggle.b.A.a(vkcFeatures)) {
                        List singletonList2 = Collections.singletonList(photo.f);
                        List singletonList3 = Collections.singletonList("photo_base");
                        if ((12 & 1) != 0) {
                            singletonList2 = null;
                        }
                        qVar = rsg0.T(yfb.x(bs.a.a((12 & 4) == 0 ? "nom" : null, singletonList2, singletonList3))).U(new tj60(new kdw(10), i4));
                    } else {
                        j2r0 j2r0Var = new j2r0();
                        List singletonList4 = Collections.singletonList(photo.f);
                        List singletonList5 = Collections.singletonList(UsersFieldsDto.PHOTO_BASE);
                        if ((1 & 58) != 0) {
                            singletonList4 = null;
                        }
                        if ((58 & 4) != 0) {
                            singletonList5 = null;
                        }
                        qVar = rsg0.T(yfb.x(s1r0.a.b(singletonList4, null, singletonList5, null, null))).U(new com.vk.movika.sdk.base.flow.binding.c(new e420(j2r0Var), 28));
                    }
                } else {
                    qVar = io.reactivex.rxjava3.internal.operators.observable.g0.b;
                }
                return qVar.U(new oq80(new zl20(photo, i), i5));
            case 22:
                s690 s690Var = (s690) this.c;
                s690 s690Var2 = new s690(s690Var.l, s690Var.m, (i700) obj, s690Var.j, s690Var.k);
                nov.a.b(s690Var, s690Var2);
                return s690Var2;
            case 23:
                ((g15) this.c).invoke(((mru0) obj).a);
                return s3q0.a;
            case 24:
                com.vk.photos.root.presentation.h hVar = (com.vk.photos.root.presentation.h) this.c;
                i.a aVar5 = (i.a) obj;
                gm50.a.a(hVar, aVar5.a, new q130(hVar, 15));
                gm50.a.a(hVar, aVar5.c, new zb60(hVar, 8));
                gm50.a.a(hVar, aVar5.d, new uv20(hVar, i2));
                gm50.a.a(hVar, aVar5.b, new mga0(hVar, i5));
                return s3q0.a;
            case 25:
                return k15.x((bi20) this.c, (MusicTrack) obj, null, 12);
            case 26:
                sib0 sib0Var = (sib0) this.c;
                ykb0.a aVar6 = (ykb0.a) obj;
                PodcastInfo podcastInfo = aVar6.a;
                String str4 = podcastInfo != null ? podcastInfo.g : null;
                if (str4 != null && str4.length() != 0) {
                    sib0Var.j = ej90.a.a(str4, new ej90.b(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, o25.a().i().U, null, 0, 0, null, null, 503), new ej90.c(0));
                }
                return aVar6;
            case 27:
                PopupStickerView popupStickerView = (PopupStickerView) this.c;
                popupStickerView.j = (Map) obj;
                xwb0 xwb0Var = popupStickerView.d;
                if (xwb0Var != null) {
                    xwb0Var.k();
                }
                popupStickerView.a();
                return s3q0.a;
            case 28:
                return new qod0((ViewGroup) obj, ((aod0) this.c).i);
            default:
                Recomposer recomposer = (Recomposer) this.c;
                Throwable th2 = (Throwable) obj;
                CancellationException j = fsk.j("Recomposer effect job completed", th2);
                synchronized (recomposer.c) {
                    try {
                        eyx eyxVar = recomposer.d;
                        if (eyxVar != null) {
                            recomposer.u.setValue(Recomposer.State.ShuttingDown);
                            eyxVar.b(j);
                            recomposer.r = null;
                            eyxVar.E(new tn0(i3, recomposer, th2));
                        } else {
                            recomposer.e = j;
                            recomposer.u.setValue(Recomposer.State.ShutDown);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return s3q0.a;
        }
    }
}
