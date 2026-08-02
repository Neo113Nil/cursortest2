package xsna;

import android.os.Handler;
import android.util.LruCache;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistOriginalFollowedDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.rlottie.RLottieDrawable;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.voip.dto.RecordType;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.attachments.MarketAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ai8;
import xsna.hh8;
import xsna.k840;
import xsna.myw0;
import xsna.nt80;
import xsna.sew0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class jz30 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ jz30(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        Object obj2;
        sew0 b;
        r1 = null;
        String str = null;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((Attachment) obj) instanceof MarketAttachment);
            case 1:
                Iterable iterable = ((OfflinePodcast) obj).b.f;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                return iterable;
            case 2:
                return j5g.y0((List) obj);
            case 3:
                AudioPlaylistOriginalFollowedDto audioPlaylistOriginalFollowedDto = (AudioPlaylistOriginalFollowedDto) obj;
                jt4.a.getClass();
                return new PlaylistLink(audioPlaylistOriginalFollowedDto.e(), audioPlaylistOriginalFollowedDto.q(), audioPlaylistOriginalFollowedDto.d());
            case 4:
                AudioBook audioBook = (AudioBook) obj;
                qh4 a = k840.a.a();
                bpn0 bpn0Var = o25.a;
                a.B(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), audioBook);
                return s3q0.a;
            case 5:
                return new a.b(((tj50.a) obj).a(oo90.b, ao8.d));
            case 6:
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) != null) {
                    str = groupsGroupFullDto.V1();
                }
                return str == null ? "" : str;
            case 7:
                List<AudioAudioDto> d2 = ((PodcastEpisodeListDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 8:
                qgi0.r((tgi0) obj, "PrivacyBestFriendsListTestTag");
                return s3q0.a;
            case 9:
                Handler handler = RLottieDrawable.r;
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 10:
                MsgReaction msgReaction = (MsgReaction) obj;
                return "Reaction{id=" + msgReaction.getId() + ", peerIds=" + msgReaction.u2() + ", count=" + msgReaction.getCount() + '}';
            case 11:
                qgi0.r((tgi0) obj, "PostingSettingsRemovePollDialogRemoveButton");
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "TEST_TAG_SUBTITLE");
                return s3q0.a;
            case 13:
                return new rsl0().a((StoriesGetV5113ResponseDto) obj);
            case 14:
                return j5g.D0(new bza0(1), (ArrayList) obj);
            case 15:
                return UserStorageModel.zb((UserStorageModel) obj, null, null, null, null, null, null, 0, -3);
            case 16:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 17:
                return Collections.singletonList((AboutVideoItem.d) obj);
            case 18:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 19:
                int i = VkFriendsPickerActivity.p;
                return drm0.p0(((pno0) obj).d()).toString();
            case 20:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_input_field");
                return s3q0.a;
            case 21:
                hh8 hh8Var = (hh8) obj;
                if (hh8Var instanceof hh8.a) {
                    hh8.a aVar = (hh8.a) hh8Var;
                    nt80<dfw0> nt80Var = aVar.f;
                    if (nt80Var instanceof nt80.d) {
                        obj2 = ai8.d.a;
                    } else if (nt80Var instanceof nt80.c) {
                        qvw0 a2 = aVar.h.a();
                        if (a2 == null || (b = a2.i()) == null) {
                            LruCache<String, fxj0> lruCache = sew0.a;
                            b = sew0.a.b("", false, false);
                        }
                        sew0 sew0Var = b;
                        long j = aVar.e;
                        dfw0 dfw0Var = (dfw0) ((nt80.c) aVar.f).a;
                        obj2 = new ai8.a(sew0Var, j, dfw0Var != null ? dfw0Var.p : 0, aVar.d == RecordType.RECORD);
                    } else {
                        obj2 = ai8.c.a;
                    }
                } else {
                    obj2 = ai8.c.a;
                }
                return new it80(obj2);
            default:
                return new myw0.a(((tj50.a) obj).a(new h7t0(4), ao8.d));
        }
    }

    public /* synthetic */ jz30(akw0 akw0Var) {
        this.b = 21;
    }
}
