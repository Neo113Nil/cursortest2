package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.google.gson.GsonBuilder;
import com.vk.api.generated.base.dto.BaseLinkProductCategoryDto;
import com.vk.api.generated.core.JsonStringDto;
import com.vk.api.generated.groups.dto.GroupsGroupDonutDescriptionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoFloatingAdMediaDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetSubscriptionsShortVideosFeedItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireQuestionDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoQuestionnaireTriggerDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoRecomFeedItemDto;
import com.vk.catalog2.feature.music.holders.MusicTrackVh;
import com.vk.clips.sdk.api.generated.GsonHolder;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MiniAppAttachment;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sv0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sv0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 6;
        switch (this.b) {
            case 0:
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 1:
                AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                return ye1.b;
            case 2:
                return new float[9];
            case 3:
                return Boolean.valueOf(gz80.a(26));
            case 4:
                return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            case 5:
                return new z11();
            case 6:
                float f = f2l0.a;
                int i2 = 3;
                int i3 = 5;
                return new yzs[]{new qdi(i2), new sth(i3), new fgi(i3), new sii(i2), new qmi(4), new gbi(i), new smi(i2), new pmi(i2), new rii(2)};
            case 7:
                return s3q0.a;
            case 8:
                return ums0.a;
            case 9:
                return new ucg0();
            case 10:
                return s3q0.a;
            case 11:
                return new yzw();
            case 12:
                return new k9l().b("/.*");
            case 13:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return context.getString(R.string.clip_description_expand);
            case 14:
                return new l2c0();
            case 15:
                return s3q0.a;
            case 16:
                new ykg();
                return new x19();
            case 17:
                return new omv0();
            case 18:
                return new j2y0();
            case 19:
                return new GsonBuilder().registerTypeAdapter(BaseLinkProductCategoryDto.class, new BaseLinkProductCategoryDto.Deserializer()).registerTypeAdapter(GroupsGroupDonutDescriptionDto.class, new GroupsGroupDonutDescriptionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireQuestionDto.class, new ShortVideoQuestionnaireQuestionDto.Deserializer()).registerTypeAdapter(ShortVideoQuestionnaireTriggerDto.class, new ShortVideoQuestionnaireTriggerDto.Deserializer()).registerTypeAdapter(ShortVideoGetGridShortVideosFeedItemDto.class, new ShortVideoGetGridShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoRecomFeedItemDto.class, new ShortVideoRecomFeedItemDto.Deserializer()).registerTypeAdapter(ShortVideoFloatingAdMediaDto.class, new ShortVideoFloatingAdMediaDto.Deserializer()).registerTypeAdapter(ShortVideoGetSubscriptionsShortVideosFeedItemDto.class, new ShortVideoGetSubscriptionsShortVideosFeedItemDto.Deserializer()).registerTypeAdapter(UserId.class, new UserId.GsonSerializer(false)).registerTypeAdapter(JsonStringDto.class, new JsonStringDto.Deserializer()).registerTypeAdapter(Boolean.class, new GsonHolder.BooleanGsonSerializer()).registerTypeAdapter(Boolean.TYPE, new GsonHolder.BooleanGsonSerializer()).disableHtmlEscaping().create();
            case 20:
                return UUID.randomUUID();
            case 21:
                return new p2r();
            case 22:
                return z9y.b;
            case 23:
                int i4 = LiveView.p0;
                return new kzr0(false, true, true, null, false);
            case 24:
                Serializer.c<MiniAppAttachment> cVar = MiniAppAttachment.CREATOR;
                return Integer.valueOf(iah0.a(344));
            case 25:
                return new int[]{R.string.post_reactions_modal_tab_like_description, R.string.post_reactions_modal_tab_laugh_description, R.string.post_reactions_modal_tab_wow_description, R.string.post_reactions_modal_tab_delight_description, R.string.post_reactions_modal_tab_sad_description, R.string.post_reactions_modal_tab_angry_description};
            case 26:
                return new xga();
            case 27:
                return new cy40();
            case 28:
                Set<String> set = MusicTrackVh.v;
                return lyd.g();
            default:
                return new PorterDuffColorFilter(1711276032, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
