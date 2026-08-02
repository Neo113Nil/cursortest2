package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.account.dto.AccountGetPrivacySettingsResponseDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingValueListDto;
import com.vk.api.generated.account.dto.AccountPrivacySettingsDto;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.go20;
import xsna.lgs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t3v implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ t3v(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DownloadingState downloadingState;
        AccountPrivacySettingValueListDto f;
        List<Long> e;
        Set set = null;
        switch (this.b) {
            case 0:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachImage) && ((AttachImage) attach).u);
            case 1:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.n);
            case 2:
                ((zak0) go20.v).setValue((go20.e) obj);
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) obj).S());
            case 4:
                List<AudioAudioDto> d = ((AudioGetResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 5:
                return j5g.y0((List) obj);
            case 6:
                qyg0 V0 = ((hyg0) obj).V0("SELECT id, uid, mid, downloading_state, json_raw FROM audio_track WHERE storage IS NULL");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        int i = (int) V0.getLong(0);
                        UserId b = fwx0.b(V0.l2(1));
                        String l2 = V0.l2(2);
                        int i2 = (int) V0.getLong(3);
                        if (i2 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i2 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i2 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i2 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        arrayList2.add(new hc50(i, downloadingState, b, l2, V0.l2(4)));
                    }
                    return arrayList2;
                } finally {
                    V0.close();
                }
            case 7:
                return new Result((lu60) obj);
            case 8:
                List<Integer> list = wk70.e;
                return Boolean.TRUE;
            case 9:
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((m1b0) obj).b);
            case 11:
                List<AudioAudioDto> d2 = ((PodcastEpisodeListDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(oc4.d((AudioAudioDto) it2.next()));
                }
                return arrayList3;
            case 12:
                qgi0.r((tgi0) obj, "trackSubtitle");
                return s3q0.a;
            case 13:
                Serializer.c<Photos> cVar = Photos.CREATOR;
                return Collections.singletonList(Photos.a.a((Photo) j5g.Y((ArrayList) obj)));
            case 14:
                PostingHints postingHints = ((PostingState.Editing) obj).o;
                return new ActionButtonHints(postingHints.d, postingHints.e, postingHints.f);
            case 15:
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    List list2 = obj2 instanceof List ? (List) obj2 : null;
                    if (list2 == null) {
                        list2 = EmptyList.b;
                    }
                    g5g.y(list2, arrayList4);
                }
                return arrayList4;
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                List<zam0> list3 = (List) obj;
                ArrayList arrayList5 = new ArrayList(c5g.u(list3, 10));
                for (zam0 zam0Var : list3) {
                    arrayList5.add(new y0f0(zam0Var.a, zam0Var.b, zam0Var.c, zam0Var.d, zam0Var.e));
                }
                return arrayList5;
            case 18:
                AccountPrivacySettingsDto accountPrivacySettingsDto = (AccountPrivacySettingsDto) j5g.a0(((AccountGetPrivacySettingsResponseDto) obj).d());
                if (accountPrivacySettingsDto == null || !epx.f(accountPrivacySettingsDto.d(), AccountSetPrivacyKeyDto.STORIES_EXCLUDE.i())) {
                    throw new IllegalStateException("Invalid server response: settings should contain " + AccountSetPrivacyKeyDto.STORIES_EXCLUDE);
                }
                AccountPrivacySettingValueDto e2 = accountPrivacySettingsDto.e();
                AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto accountPrivacySettingValueCategoryDto = e2 instanceof AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto ? (AccountPrivacySettingValueDto.AccountPrivacySettingValueCategoryDto) e2 : null;
                if (accountPrivacySettingValueCategoryDto != null && (f = accountPrivacySettingValueCategoryDto.f()) != null && (e = f.e()) != null) {
                    List<Long> list4 = e;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        dq.h(((Number) it3.next()).longValue(), arrayList6);
                    }
                    set = j5g.S0(arrayList6);
                }
                return set == null ? EmptySet.b : set;
            case 19:
                List<GroupsGroupFullDto> e3 = ((GroupsGetObjectExtendedResponseDto) obj).e();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : e3) {
                    GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj3;
                    if (groupsGroupFullDto.n() == BaseBoolIntDto.YES && groupsGroupFullDto.h3() != GroupsGroupFullDto.WallDto.DISABLED) {
                        arrayList7.add(obj3);
                    }
                }
                ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(dqu.a((GroupsGroupFullDto) it4.next()));
                }
                return arrayList8;
            case 20:
                cwr0 cwr0Var = (cwr0) obj;
                return Boolean.valueOf((cwr0Var.a == null || cwr0Var.c == null) ? false : true);
            case 21:
                return s3q0.a;
            case 22:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((lgs0) obj) instanceof lgs0.a);
            case 24:
                VideoMinifiedPlayerStateHolder.State state = (VideoMinifiedPlayerStateHolder.State) obj;
                if (state != VideoMinifiedPlayerStateHolder.State.HIDDEN && state != VideoMinifiedPlayerStateHolder.State.OPENED) {
                    r3 = false;
                }
                return Boolean.valueOf(r3);
            case 25:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, null, null, false, false, false, 4095);
            case 26:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 27:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_back_btn");
                return s3q0.a;
            case 28:
                return new rpw0(R.layout.vk_view_default_list_loading, (ViewGroup) obj);
            default:
                int i3 = otw0.i1;
                L.C("VoipParticipantSettingsAccessRightsModalDialog", (Throwable) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ t3v(Object obj, int i) {
        this.b = i;
    }
}
