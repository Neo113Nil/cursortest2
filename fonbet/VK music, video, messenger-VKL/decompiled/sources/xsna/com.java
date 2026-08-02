package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.podcasts.dto.PodcastsSuccessResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.user.UserProfile;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.voip.ui.asr.ui.list.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.a9a0;
import xsna.atb0;
import xsna.mbv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class com implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ com(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -1, 2097087);
            case 1:
                return pwm.a((pwm) obj, false, 0, false, null, false, 0, null, null, false, 16383);
            case 2:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return Boolean.valueOf(((d6n) obj).c);
            case 3:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.ERROR_REFRESH, 0, false, false, 59);
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    suq suqVar = (suq) ((it80) it.next()).a;
                    if (suqVar != null) {
                        arrayList.add(suqVar);
                    }
                }
                return arrayList;
            case 5:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 6:
                ArrayList arrayList2 = new ArrayList();
                List<UsersUserFullDto> d = ((FriendsSearchResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                    arrayList3.add(ProfileFriendItem.a.b(usersUserFullDto));
                }
                return new cts(arrayList2, arrayList3);
            case 7:
                Throwable th = (Throwable) obj;
                h03.b(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 8:
                VkDiagonalUserStack vkDiagonalUserStack = new VkDiagonalUserStack((Context) obj, null, 6);
                vkDiagonalUserStack.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                vkDiagonalUserStack.setSize(VkDiagonalUserStack.Size.ExtraLarge);
                return vkDiagonalUserStack;
            case 9:
                return (mbv.c) obj;
            case 10:
                return "(w.id = ? AND w.type = ?)";
            case 11:
                int i = LocalMediaPickerFragment.d0;
                ((ikv0) obj).a();
                return s3q0.a;
            case 12:
                return Boolean.valueOf(((y810) obj).q.isEmpty());
            case 13:
                UserProfile userProfile = (UserProfile) obj;
                UserId userId = userProfile.c;
                String str = userProfile.e;
                String str2 = userProfile.h;
                String str3 = userProfile.q;
                if (str3 == null) {
                    str3 = "";
                }
                return new b420(userId, str, "", str2, str3, userProfile.Y);
            case 14:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 15:
                return 1;
            case 16:
                qgi0.r((tgi0) obj, "vk_top_bar_back_btn");
                return s3q0.a;
            case 17:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 18:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((AudioBook) obj2).u)) {
                        arrayList4.add(obj2);
                    }
                }
                return arrayList4;
            case 19:
                return new ArrayList((VKList) obj);
            case 20:
                qgi0.r((tgi0) obj, "vk_top_bar_back_btn");
                return s3q0.a;
            case 21:
                MusicOfflineSyncServiceHelper.h("audio.startStandaloneMigration", (Throwable) obj);
                return s3q0.a;
            case 22:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "musicArtist");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 23:
                r3y.a("VKWebAppDonutResult", new gvs(18));
                return s3q0.a;
            case 24:
                return a.d.a;
            case 25:
                return a9a0.c.a;
            case 26:
                int i2 = PodcastEpisodeFragment.u0;
                qgi0.r((tgi0) obj, "toolbar_add_to_favorites");
                return s3q0.a;
            case 27:
                return ((PodcastsSuccessResponseDto) obj).d() == 1 ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new VKApiException("Can`t enable notifications"));
            case 28:
                usb0 usb0Var = (usb0) obj;
                return new atb0.a.C2570a(usb0Var.k, usb0Var.l, usb0Var.m, usb0Var.j);
            default:
                j2r0 j2r0Var = qgj0.a;
                ClipVideoFile clipVideoFile = (ClipVideoFile) j5g.a0(qgj0.c((ShortVideoGetResponseDto) obj));
                return Boolean.valueOf(clipVideoFile != null ? clipVideoFile.B : false);
        }
    }

    public /* synthetic */ com(Object obj, int i) {
        this.b = i;
    }
}
