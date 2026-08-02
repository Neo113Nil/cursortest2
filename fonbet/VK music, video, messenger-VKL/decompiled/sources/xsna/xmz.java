package xsna;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.music.player.PlayerTrack;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.photos.ui.attachmentspicker.PickVKPhotoFragmentNew;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.reefton.Reef;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.dn90;
import xsna.dr00;
import xsna.dz40;
import xsna.ij20;
import xsna.kr5;
import xsna.pq00;
import xsna.v9i0;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xmz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xmz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object next;
        yer yerVar;
        String string;
        String str;
        ProfileDescription profileDescription;
        ProfileDescription profileDescription2;
        MusicTrack musicTrack;
        String str2;
        String str3 = null;
        int i = 1;
        switch (this.b) {
            case 0:
                new dqu();
                return dqu.a(((GroupsGetByIdObjectResponseDto) obj).d().get(0));
            case 1:
                hr00 hr00Var = ((pq00.a) obj).b;
                ImageUrl imageUrl = hr00Var.a;
                wih0.b.a aVar = hr00Var.b;
                String str4 = imageUrl != null ? imageUrl.b : null;
                SdkImages sdkImages = aVar.i;
                if (sdkImages != null) {
                    Iterator<T> it = sdkImages.b.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i2 = ((ImageUrl) next).f;
                            do {
                                Object next2 = it.next();
                                int i3 = ((ImageUrl) next2).f;
                                if (i2 < i3) {
                                    next = next2;
                                    i2 = i3;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    ImageUrl imageUrl2 = (ImageUrl) next;
                    if (imageUrl2 != null) {
                        str3 = imageUrl2.b;
                    }
                }
                return new dr00.b(str4 == null ? str3 : str4, hr00Var.i, hr00Var.j, hr00Var.k, hr00Var.l, aVar.c != null, hr00Var.c != null);
            case 2:
                return (w6e0) obj;
            case 3:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 4:
                return qjg.a((User) obj);
            case 5:
                L.g("Can't load mention", (Throwable) obj);
                return s3q0.a;
            case 6:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 7:
                ((zak0) vn20.j).setValue(((Boolean) obj).booleanValue() ? PlaceholderMode.Overlay : PlaceholderMode.Primary);
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                qgi0.r((tgi0) obj, "vk_top_bar_title");
                return s3q0.a;
            case 11:
                return ((xhp0) ((whp0) obj)).a.b;
            case 12:
                bn40.e((a9b0) obj);
                return s3q0.a;
            case 13:
                List<t230> list = ((ti60) obj).c;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (t230 t230Var : list) {
                    if (t230Var instanceof UserProfile) {
                        UserProfile userProfile = (UserProfile) t230Var;
                        Bundle bundle = userProfile.s;
                        List<ProfileDescription> list2 = userProfile.E;
                        String str5 = (list2 == null || (profileDescription2 = list2.get(0)) == null) ? null : profileDescription2.e;
                        if (str5 == null || drm0.N(str5)) {
                            String str6 = userProfile.r;
                            if (str6 == null || drm0.N(str6)) {
                                if (bundle.containsKey("group_activity")) {
                                    string = bundle.getString("group_activity");
                                }
                                str = null;
                            } else {
                                string = userProfile.r;
                            }
                            str = string;
                        } else {
                            List<ProfileDescription> list3 = userProfile.E;
                            if (list3 != null && (profileDescription = list3.get(0)) != null) {
                                string = profileDescription.e;
                                str = string;
                            }
                            str = null;
                        }
                        UserId userId = userProfile.c;
                        kr5.a aVar2 = new kr5.a(new dqz0(userProfile));
                        aVar2.b(R.drawable.user_placeholder);
                        s3q0 s3q0Var = s3q0.a;
                        kr5 a = aVar2.a();
                        String str7 = userProfile.e;
                        boolean z = str == null || str.length() == 0;
                        VerifyInfo verifyInfo = userProfile.B;
                        yerVar = new yer(userId, a, str7, str, !z, verifyInfo, verifyInfo.Cb());
                    } else {
                        if (!(t230Var instanceof Group)) {
                            throw new IllegalArgumentException(t230Var + " is not supported");
                        }
                        Group group = (Group) t230Var;
                        UserId userId2 = group.c;
                        kr5.a aVar3 = new kr5.a(new os9(group, i));
                        aVar3.b(R.drawable.user_placeholder);
                        s3q0 s3q0Var2 = s3q0.a;
                        kr5 a2 = aVar3.a();
                        String str8 = group.d;
                        String str9 = group.z;
                        boolean z2 = str9 == null || str9.length() == 0;
                        VerifyInfo verifyInfo2 = group.y;
                        yerVar = new yer(userId2, a2, str8, str9, !z2, verifyInfo2, verifyInfo2.Cb());
                    }
                    arrayList.add(yerVar);
                }
                return arrayList;
            case 14:
                EmptyList emptyList = EmptyList.b;
                return new ixa0((com.vk.music.player.playback.e) obj, null, emptyList, emptyList, jgp.b);
            case 15:
                Object d = ((Result) obj).d();
                kotlin.a.a(d);
                return (AudioBook) d;
            case 16:
                return com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.b.a((OfflinePodcastEpisodesMviState) obj);
            case 17:
                VKList vKList = (VKList) obj;
                return new dn90.c.b(vKList.size(), vKList, vKList.i() > vKList.size());
            case 18:
                return ((View) obj).animate().setInterpolator(new j8z()).setStartDelay(350L).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L).translationY(r1.getHeight() / 10.0f);
            case 19:
                return Boolean.valueOf(((zaa0) obj).a == -9000);
            case 20:
                UsableRecyclerView usableRecyclerView = (UsableRecyclerView) obj;
                int i4 = PickVKPhotoFragmentNew.t0;
                usableRecyclerView.setPadding(0, 0, 0, iah0.a(8));
                usableRecyclerView.setNestedScrollingEnabled(false);
                return s3q0.a;
            case 21:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistsEntryPointTitle");
                return s3q0.a;
            case 22:
                PlayerTrack playerTrack = ((sy40) obj).d;
                if (playerTrack != null && (musicTrack = playerTrack.b) != null) {
                    ucp ucpVar = ucp.a;
                    StringBuilder sb = new StringBuilder();
                    List<Artist> list4 = musicTrack.t;
                    if (list4 != null) {
                        str2 = s490.i(list4);
                    } else {
                        str2 = musicTrack.h;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    sb.append(str2);
                    sb.append(' ');
                    sb.append(s490.c(musicTrack.u));
                    CharSequence i5 = ucp.i(drm0.p0(sb.toString()).toString());
                    if (i5 != null) {
                        str3 = i5.toString();
                    }
                }
                return new dz40.h.a(R.string.music_player_header_podcast, str3, true);
            case 23:
                return s3q0.a;
            case 24:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 25:
                ((Integer) obj).intValue();
                dw20 dw20Var = com.vk.qrcode.d.k;
                if (dw20Var == null) {
                    return null;
                }
                dw20Var.Pn(-2);
                return s3q0.a;
            case 26:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return Boolean.valueOf(((j5f0) obj).b.d);
            case 27:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 28:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            default:
                return ((v9i0.c) obj).c;
        }
    }

    public /* synthetic */ xmz(f330 f330Var) {
        this.b = 13;
    }
}
