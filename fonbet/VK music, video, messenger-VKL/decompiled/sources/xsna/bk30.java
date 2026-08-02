package xsna;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.feature.music.holders.MusicActionSaveAsPlaylistButtonVh;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.d4g0;
import xsna.dak0;
import xsna.goh0;
import xsna.isc0;
import xsna.k840;
import xsna.loh0;
import xsna.mm70;
import xsna.o0r0;
import xsna.p060;
import xsna.qr60;
import xsna.rqc0;
import xsna.tj50;
import xsna.tra0;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bk30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bk30(com.vk.lists.c cVar, MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter) {
        this.b = 2;
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        loh0.f.d dVar;
        int i = 3;
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                Collection<yj30> collection = (Collection) this.c;
                SQLiteStatement g = ((e0w) obj).g("\n            REPLACE INTO messages_history_meta(dialog_id, server_is_empty_value, server_is_empty_phase)\n            VALUES(?,?,?)\n            ");
                try {
                    for (yj30 yj30Var : collection) {
                        g.bindLong(1, yj30Var.a);
                        rdi.i(g, 2, yj30Var.b);
                        g.bindLong(3, yj30Var.c);
                        g.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    g.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(g, th);
                        throw th2;
                    }
                }
            case 1:
                MusicActionSaveAsPlaylistButtonVh musicActionSaveAsPlaylistButtonVh = (MusicActionSaveAsPlaylistButtonVh) this.c;
                Playlist playlist = (Playlist) obj;
                bn40.g(mm4.class.getSimpleName(), "playlist", playlist);
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new i8b0(playlist));
                VkButton vkButton = musicActionSaveAsPlaylistButtonVh.e;
                VkButton vkButton2 = vkButton != null ? vkButton : null;
                if (vkButton == null) {
                    vkButton = null;
                }
                Drawable e = enj.e(R.drawable.vk_icon_done_28, R.attr.vk_ui_background_accent_themed, vkButton.getContext());
                int[] iArr = VkButton.W;
                vkButton2.Z4(e, true);
                VkButton vkButton3 = musicActionSaveAsPlaylistButtonVh.e;
                (vkButton3 != null ? vkButton3 : null).setText(R.string.music_added_button_label);
                musicActionSaveAsPlaylistButtonVh.i = playlist;
                return s3q0.a;
            case 2:
                MusicRecommendationOnboardingContract$Presenter.b((VKList) obj, (com.vk.lists.c) this.c);
                return s3q0.a;
            case 3:
                MviMembersListFragment mviMembersListFragment = (MviMembersListFragment) this.c;
                MviMembersListFragment.a aVar = MviMembersListFragment.T;
                ((BridgeComponent) mviMembersListFragment.R.getValue()).F().m(mviMembersListFragment.requireContext(), (UserId) obj, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 4:
                iq50 iq50Var = ((ep50) this.c).getDelegateProvider().l;
                iq50Var.getClass();
                iq50Var.c(MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.AD_SHOW);
                return s3q0.a;
            case 5:
                ((p060.b) ((p060) this.c).m.getValue()).a.setContent(new c.a((dko) null, (cut0) null));
                return s3q0.a;
            case 6:
                ((jq60) this.c).a((ds60) obj);
                return s3q0.a;
            case 7:
                iui iuiVar = (iui) obj;
                iuiVar.a = new wa5(iuiVar.a(new oy60(((qy60) this.c).e, new rr60())), 8);
                return s3q0.a;
            case 8:
                ((rtg0) this.c).invoke(Boolean.FALSE);
                return s3q0.a;
            case 9:
                ((km70) this.c).m(mm70.a.a);
                return s3q0.a;
            case 10:
                pw80 pw80Var = (pw80) this.c;
                T t = (T) obj;
                synchronized (pw80Var.a) {
                    pw80Var.c = t;
                }
                return s3q0.a;
            case 11:
                mc90 mc90Var = (mc90) this.c;
                b160 b160Var = (b160) obj;
                dak0 a = dak0.a.a();
                izs<Object, s3q0> e2 = a != null ? a.e() : null;
                dak0 b = dak0.a.b(a);
                try {
                    b160Var.a(mc90Var.e);
                    s3q0 s3q0Var2 = s3q0.a;
                    dak0.a.d(a, b, e2);
                    return s3q0.a;
                } catch (Throwable th3) {
                    dak0.a.d(a, b, e2);
                    throw th3;
                }
            case 12:
                ((p3h) this.c).invoke();
                return s3q0.a;
            case 13:
                View view = (View) obj;
                PhotoFlowToolbarView.b bVar = ((PhotoFlowToolbarView) this.c).y;
                if (bVar != null) {
                    bVar.onClick(view);
                }
                return s3q0.a;
            case 14:
                ((hca0) this.c).C((cca0) obj);
                return s3q0.a;
            case 15:
                ((dpa0) this.c).f((yva0) obj);
                return s3q0.a;
            case 16:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, new WeakReference(((wqs0.l.d) ((wqs0.l) this.c)).c), 0, 50331647);
            case 17:
                DialogInterface dialogInterface = (DialogInterface) ((Ref$ObjectRef) this.c).element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                return s3q0.a;
            case 18:
                xwk.d().e().a(((zac0) this.c).b.getContext(), (String) obj);
                return s3q0.a;
            case 19:
                lqc0 lqc0Var = (lqc0) this.c;
                rqc0 rqc0Var = (rqc0) obj;
                if (rqc0Var instanceof rqc0.b) {
                    y5 y5Var = lqc0Var.k1;
                    if (y5Var != null) {
                        y5Var.invoke(((rqc0.b) rqc0Var).a, lqc0Var.kn());
                    }
                } else {
                    qcy<Object>[] qcyVarArr = lqc0.q1;
                    if (rqc0Var instanceof rqc0.c) {
                        rqc0.c cVar = (rqc0.c) rqc0Var;
                        lqc0Var.bo(cVar.a, cVar.b);
                        lqc0Var.dismiss();
                    } else {
                        if (!(rqc0Var instanceof rqc0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lqc0Var.dismiss();
                        ye80 ye80Var = lqc0Var.l1;
                        if (ye80Var != null) {
                            ye80Var.invoke();
                        }
                    }
                }
                return s3q0.a;
            case 20:
                ((isc0.a) this.c).b.e(new ksc0(new qr60.a.d(true)));
                return s3q0.a;
            case 21:
                tra0.a aVar2 = (tra0.a) obj;
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    tra0.a.x(aVar2, (tra0) it.next(), 0, 0);
                }
                return s3q0.a;
            case 22:
                krd0 krd0Var = (krd0) this.c;
                krd0 krd0Var2 = (krd0) obj;
                if (krd0Var != null && krd0Var2.a == krd0Var.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                exd0 exd0Var = (exd0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    ProfileFriendsFragment profileFriendsFragment = exd0Var.c;
                    FriendsListParams.FriendListCreation friendListCreation = (FriendsListParams.FriendListCreation) exd0Var.d;
                    profileFriendsFragment.ko(friendListCreation.d, friendListCreation.b);
                }
                return s3q0.a;
            case 24:
                ((gyd0) ((kyd0) this.c).c).T2(((VKList) obj).i());
                return s3q0.a;
            case 25:
                u2f0 u2f0Var = (u2f0) this.c;
                u2f0Var.d.invoke(u2f0Var.getItem(((Integer) obj).intValue()).b);
                return s3q0.a;
            case 26:
                return ((j4f0) this.c).b.e(new l4f0((qr60.a) obj));
            case 27:
                j4g0 j4g0Var = (j4g0) this.c;
                i4g0 i4g0Var = j4g0Var.s;
                if (i4g0Var != null) {
                    j4g0Var.l.a(new d4g0.b(i4g0Var.b, i4g0Var.c, i4g0Var.d, i4g0Var.m));
                }
                return s3q0.a;
            case 28:
                eoh0 eoh0Var = (eoh0) this.c;
                ExtendedCommunityProfile extendedCommunityProfile = ((goh0.a) obj).b;
                vig0 vig0Var = eoh0Var.d;
                ExtendedCommunityProfile.d dVar2 = extendedCommunityProfile.C2;
                if (dVar2 == null) {
                    return loh0.f.b.b;
                }
                Float f = dVar2.a;
                ExtendedCommunityProfile.b bVar2 = dVar2.e;
                Integer num = dVar2.b;
                int intValue = num != null ? num.intValue() : 0;
                if (extendedCommunityProfile.a0 >= 2) {
                    if (bVar2 != null) {
                        return loh0.f.e.b;
                    }
                    if (f == null) {
                        return intValue == 0 ? loh0.f.c.b : loh0.f.b.b;
                    }
                    dVar = new loh0.f.d(vig0Var.a(f.floatValue()), intValue);
                } else {
                    if (bVar2 != null) {
                        return loh0.f.e.b;
                    }
                    if (dVar2.d) {
                        return new loh0.f.a(f != null ? vig0Var.a(f.floatValue()) : null);
                    }
                    if (f == null) {
                        return intValue == 0 ? loh0.f.c.b : loh0.f.b.b;
                    }
                    dVar = new loh0.f.d(vig0Var.a(f.floatValue()), intValue);
                }
                return dVar;
            default:
                sph0 sph0Var = (sph0) this.c;
                int i2 = 6;
                vlc0 vlc0Var = new vlc0(sph0Var, i2);
                waf0 waf0Var = new waf0(sph0Var, i);
                fda0 fda0Var = new fda0(sph0Var, i2);
                i0r i0rVar = new i0r(19);
                j5n j5nVar = new j5n(23);
                rph0 rph0Var = new rph0(5, sph0Var, sph0.class, "getItemsList", "getItemsList(Ljava/util/List;Lcom/vk/search/params/impl/presentation/modal/database/mvi/model/SearchDatabaseState$ListEnd;Ljava/lang/String;Lcom/vk/search/params/impl/presentation/modal/database/mvi/model/SearchDatabaseSelection;Ljava/util/List;)Ljava/util/List;", 0);
                ao8 ao8Var = ao8.d;
                ThreadType.a aVar3 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar3.getClass();
                ThreadType.a.a(threadTypeArr);
                return new b.a.C1766a(((tj50.a) obj).f(ao8Var, null, new izs[]{vlc0Var, waf0Var, fda0Var, i0rVar, j5nVar}, new es00(rph0Var, 9)));
        }
    }

    public /* synthetic */ bk30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
