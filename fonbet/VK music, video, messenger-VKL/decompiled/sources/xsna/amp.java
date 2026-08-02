package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetBannedResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddAudioResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetUserSettingsResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.api.deps.clips.ShortVideoUserSettings;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.im.Image;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.goodpreview.domain.state.ProductPreviewError;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.mentions.MentionProfileVO;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.mentions.data.MentionRepository;
import com.vk.newsfeed.posting.mentions.model.PostMentionProfile;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.pushes.dto.PushMessage;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.i2y;
import xsna.is60;
import xsna.k840;
import xsna.tj50;
import xsna.w3s;
import xsna.w9i0;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class amp implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ amp(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 prefetch$lambda$3;
        switch (this.b) {
            case 0:
                ImageSize imageSize = new ImageSize(new Image(1927, 2560, "https://sun9-10.userapi.com/sun9-46/s/v1/if2/u6MP3cBPw3sFEzf0GPblOk0m1gKKgI_pq_3UDfpFgLYxRNe7G5ahSqpZtwpkWArKYanwqEeEwBGhkEX3u5Lhceek.jpg?quality=95&format=webp&as=32x43,48x64,72x96,108x143,160x213,240x319,360x478,480x638,540x717,640x850,720x957,1080x1435,1280x1700,1440x1913,1927x2560&from=bu&u=rQqkGkKRlD7D6egQS2o2Zfjg8rNtLA9vjYV7wAF4R3k", true), ImageSize.b.c(1927, 2560), false);
                VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView((Context) obj, null, 6, 0);
                vkEnhancedImageView.setMaximumWidth(400);
                vkEnhancedImageView.setMaximumHeight(400);
                vkEnhancedImageView.setPlaceholder(R.drawable.ds_demo_image_1);
                vkEnhancedImageView.setRemoteImage(imageSize);
                vkEnhancedImageView.setScaleType(ScaleType.BOTTOM_CROP);
                return vkEnhancedImageView;
            case 1:
                return s3q0.a;
            case 2:
                return new yzo0((ViewGroup) obj);
            case 3:
                return new w3s.c(((tj50.a) obj).a(m3s.b, ao8.d));
            case 4:
                int i = GalleryFragmentImpl.R0;
                ((ikv0) obj).a();
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 6:
                Throwable th = ((d7u) obj).d;
                if (th != null) {
                    return ((th instanceof VKApiExecutionException) && h03.a(th)) ? ProductPreviewError.Internet : ProductPreviewError.Server;
                }
                return null;
            case 7:
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof VKApiExecutionException) && ((VKApiExecutionException) th2).s() == 104) {
                    return io.reactivex.rxjava3.core.x.k(new GroupsGetBannedResponseDto(0, EmptyList.b, null, null, 12, null));
                }
                return io.reactivex.rxjava3.core.x.i(th2);
            case 8:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                Collection<adm> collection = ((t480) obj).b;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (adm admVar : collection) {
                        if (admVar.a == DialogsCounters.Type.REQUESTS && admVar.b == 0) {
                            return Boolean.valueOf(r2);
                        }
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 9:
                return new i2y.a((yfx0) obj, null);
            case 10:
                prefetch$lambda$3 = LocalGalleryProvider.prefetch$lambda$3((Throwable) obj);
                return prefetch$lambda$3;
            case 11:
                return new s310((ViewGroup) obj);
            case 12:
                MentionProfileVO mentionProfileVO = (MentionProfileVO) obj;
                MentionRepository.a(new PostMentionProfile(mentionProfileVO.b, mentionProfileVO.c, mentionProfileVO.d, mentionProfileVO.e, mentionProfileVO.f));
                return s3q0.a;
            case 13:
                return Long.valueOf(((PushMessage) obj).h);
            case 14:
                Integer d = ((KidsCollectionAddAudioResponseDto) obj).d();
                return Integer.valueOf(d != null ? d.intValue() : 0);
            case 15:
                return ((PeersSearchBlock.e) obj).b;
            case 16:
                qgi0.r((tgi0) obj, "AudioTrackSubTitle");
                return s3q0.a;
            case 17:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 18:
                Group group = (Group) obj;
                if (group == null) {
                    return null;
                }
                UserProfile userProfile = new UserProfile();
                userProfile.c = fkq0.e(group.c);
                userProfile.e = group.d;
                userProfile.g = group.f;
                userProfile.h = group.e;
                return userProfile;
            case 19:
                ykb0.a aVar = (ykb0.a) obj;
                PodcastInfo podcastInfo = aVar.a;
                abo c = k840.a.c();
                List<MusicTrack> list = aVar.b;
                if (list == null) {
                    list = EmptyList.b;
                }
                return new ykb0.a(podcastInfo, new VKList(c.f(list)), new VKList(k840.a.c().f(aVar.c)));
            case 20:
                qgi0.r((tgi0) obj, "PollExitDialogCancelButton");
                return s3q0.a;
            case 21:
                Post post = (Post) obj;
                ce60.b.getClass();
                p870.f().e(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, post);
                if (post != null && post.gc()) {
                    ArrayList<EntryAttachment> arrayList = post.z;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((EntryAttachment) it.next()).b);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof VideoAttachment) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        wjs0.a(new fyr0(((VideoAttachment) it3.next()).k));
                    }
                }
                cvk.u(R.string.post_added_to_archive, false);
                return s3q0.a;
            case 22:
                MsgFromUser msgFromUser = (MsgFromUser) obj;
                AttachAudioMsg a7 = msgFromUser.a7();
                if (a7 != null) {
                    return hr80.D(a7, msgFromUser, null);
                }
                return null;
            case 23:
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                ur60 ur60Var = ((ReactionsFeedMviState) obj).c;
                sq60 sq60Var = ur60Var.b;
                ListLoadingState listLoadingState = ur60Var.e;
                boolean z = ur60Var.f;
                boolean z2 = ur60Var.g;
                return new j5f0(new is60.a(sq60Var, listLoadingState, z, z2), sq60Var.a.isEmpty() && !z2 && !z && listLoadingState == ListLoadingState.IDLE);
            case 24:
                Pair pair = (Pair) obj;
                return new utk(new n5w((d5w) pair.i(), (ProfilesInfo) pair.j()), ((d5w) pair.i()).g);
            case 25:
                return s3q0.a;
            case 26:
                return ((kw8) obj).c(new ehu(27));
            case 27:
                ArrayList<UIBlock> arrayList4 = ((UIBlockList) obj).y;
                if (arrayList4 == null || !arrayList4.isEmpty()) {
                    Iterator<T> it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        if (((UIBlock) it4.next()).e == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS) {
                            return Boolean.valueOf(r2);
                        }
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 28:
                return w9i0.b.a;
            default:
                Integer g = ((ShortVideoGetUserSettingsResponseDto) obj).g();
                return g != null ? new ShortVideoUserSettings(g.intValue()) : ShortVideoUserSettings.c;
        }
    }

    public /* synthetic */ amp(Object obj, int i) {
        this.b = i;
    }
}
