package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.reefton.Reef;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.j0e0;
import xsna.jd50;
import xsna.r1r0;
import xsna.tj50;
import xsna.y6u;
import xsna.yqc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class j0r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ j0r(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new Pair((SdkVideoFile) obj, PaginationKey.Initial.b);
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new utz(tf3.b(viewGroup, R.layout.vkim_folder_peer_loading_wheel_vh, viewGroup, false));
            case 2:
                long longValue = ((Long) obj).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return Peer.a.b(longValue);
            case 3:
                bq bqVar = (bq) obj;
                int i = FriendsImportFragment.a0;
                VKFromList vKFromList = new VKFromList(null);
                List<RequestUserProfile> list = bqVar.a;
                List<RequestUserProfile> list2 = bqVar.b;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    vKFromList.add(FriendsImportFragment.io((RequestUserProfile) it.next()));
                }
                if (!list2.isEmpty()) {
                    vKFromList.add(new Item(Item.Type.TITLE, R.string.friends_recommendations_title_other, null, null, 12));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        vKFromList.add(FriendsImportFragment.io((RequestUserProfile) it2.next()));
                    }
                }
                return vKFromList;
            case 4:
                List list3 = (List) yfb.x(r1r0.a.b((s1r0) yts.a.getValue(), (List) obj, Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)).u(0L);
                if (list3 == null) {
                    return EmptyList.b;
                }
                List<UsersUserFullDto> list4 = list3;
                j2r0 j2r0Var = yts.b;
                ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
                for (UsersUserFullDto usersUserFullDto : list4) {
                    j2r0Var.getClass();
                    arrayList.add(j2r0.a(usersUserFullDto));
                }
                return arrayList;
            case 5:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 6:
                return new y6u.d.c((e6u) obj);
            case 7:
                SituationalSuggest.Profile profile = (SituationalSuggest.Profile) obj;
                if (profile != null) {
                    return profile.e;
                }
                return null;
            case 8:
                return ((com.vk.im.engine.models.messages.a) obj).K0();
            case 9:
                NestedMsg nestedMsg = (NestedMsg) obj;
                return new CnvMsgId(nestedMsg.e, nestedMsg.d);
            case 10:
                qgi0.r((tgi0) obj, "HEADER_TITLE");
                return s3q0.a;
            case 11:
                return Boolean.valueOf(!(((ib50) obj).a.J instanceof DownloadingState.Downloading));
            case 12:
                MusicOfflineSyncServiceHelper.h("audio.getByMoosicId", (Throwable) obj);
                return s3q0.a;
            case 13:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 14:
                return new jd50.a.b(((id50) obj).f);
            case 15:
                qgi0.r((tgi0) obj, "order_product_title");
                return s3q0.a;
            case 16:
                return String.valueOf(erm0.x0((String) obj));
            case 17:
                View view = new View((Context) obj);
                view.setId(R.id.play_pause);
                return view;
            case 18:
                return ChannelMsgSendConfig.a((ChannelMsgSendConfig) obj, null, false, false, false, !r2.n(), null, null, null, null, false, false, false, false, null, 32751);
            case 19:
                Throwable th = (Throwable) obj;
                int i2 = PostingFragment.L0;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{ms9.b("Failed to delete temporary files copies: ", th)});
                }
                return s3q0.a;
            case 20:
                return yqc0.d.a;
            case 21:
                qgi0.r((tgi0) obj, "product_card_top_bar_actions");
                return s3q0.a;
            case 22:
                return new j0e0.a(((tj50.a) obj).a(e0e0.b, ao8.d));
            case 23:
                StoryEntry storyEntry = (StoryEntry) obj;
                return Boolean.valueOf((storyEntry.n == null || storyEntry.B) ? false : true);
            case 24:
                q55 q55Var = q55.a;
                q55.d((AuthResult) obj);
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(RetryKt.c((Throwable) obj));
            case 28:
                Boolean bool = Boolean.FALSE;
                if (epx.f(obj, bool)) {
                    return new fno0(fno0.c);
                }
                List list5 = (List) obj;
                Object obj2 = list5.get(0);
                float floatValue = (obj2 != null ? (Float) obj2 : null).floatValue();
                Object obj3 = list5.get(1);
                j2h0 j2h0Var = i2h0.y;
                epx.f(obj3, bool);
                return new fno0(l2l0.n(floatValue, (obj3 != null ? (gno0) j2h0Var.c.invoke(obj3) : null).a));
            default:
                qgi0.r((tgi0) obj, "search_filters_top_bar_title");
                return s3q0.a;
        }
    }

    public /* synthetic */ j0r(Object obj, int i) {
        this.b = i;
    }
}
