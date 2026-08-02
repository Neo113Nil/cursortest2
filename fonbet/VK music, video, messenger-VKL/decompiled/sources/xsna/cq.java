package xsna;

import com.vk.api.generated.account.dto.AccountGetContactListResponseDto;
import com.vk.api.generated.apps.dto.AppsGamesCatalogDto;
import com.vk.api.generated.audio.dto.AudioLyricsDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.channels.dto.ChannelsSaveCoverResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.kidsCollection.dto.KidsCollectionAddPlaylistResponseDto;
import com.vk.api.generated.market.dto.MarketGetContentAttachedItemsResponseDto;
import com.vk.api.generated.messages.dto.MessagesPinnedMessageDto;
import com.vk.api.generated.storage.dto.StorageValueDto;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.R;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.json.JSONObject;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cq implements b03, f03, vgp, io.reactivex.rxjava3.functions.l, ValueValidator, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ cq(int i) {
        this.b = i;
    }

    public static int a(w2w w2wVar) {
        return w2wVar.I0().system().d();
    }

    public static com.vk.core.compose.component.semantics.a b(String str, SemanticsConfiguration.Mode mode, int i) {
        return com.vk.core.compose.component.semantics.b.a(mode, new t62(str, 1), i);
    }

    public static String c(String str, JSONObject jSONObject) {
        return str + jSONObject;
    }

    public static String d(StringBuilder sb, SdkClipVideoFile sdkClipVideoFile, char c) {
        sb.append(sdkClipVideoFile);
        sb.append(c);
        return sb.toString();
    }

    public static wh50 f(float f) {
        return androidx.compose.runtime.k.b(new pco(f));
    }

    public static void h(int i, int i2, int i3, int i4, int i5) {
        y2r0.L(i);
        y2r0.L(i2);
        y2r0.L(i3);
        y2r0.L(i4);
        y2r0.L(i5);
    }

    public static boolean i(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jaiVar.invoke(aVar, Integer.valueOf(i));
        return androidx.compose.runtime.b.d();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((u180) obj).b;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (AccountGetContactListResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AccountGetContactListResponseDto.class).getType())).a();
            case 6:
                return (ChannelsSaveCoverResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ChannelsSaveCoverResponseDto.class).getType())).a();
            case 16:
                return (KidsCollectionAddPlaylistResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, KidsCollectionAddPlaylistResponseDto.class).getType())).a();
            case 19:
                return (MarketGetContentAttachedItemsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MarketGetContentAttachedItemsResponseDto.class).getType())).a();
            case 21:
                return (MessagesPinnedMessageDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, MessagesPinnedMessageDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 25:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsGamesCatalogDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AudioLyricsDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType());
            case 13:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, EcosystemSendOtpResponseDto.class).getType());
            case 14:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 18:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Object.class).getType());
            case 20:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, StorageValueDto.class).getType()).getType());
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        Long l = (Long) obj;
        switch (this.b) {
            case 10:
                if (l.longValue() >= 0) {
                }
                break;
            case 11:
                if (l.longValue() >= 0) {
                }
                break;
            default:
                if (l.longValue() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vgp
    public com.vk.core.view.components.paging.list.a provide() {
        int i = ClipsVideoAttachmentPickerFragment.W;
        VkPlaceholder.c.b bVar = new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_video_outline_56), new a8g(VkColorToken.IconSecondary), null, 28);
        tlo0.f h = tq.h(tlo0.Companion, R.string.clips_video_attachment_no_videos_title);
        tlo0.f fVar = new tlo0.f(R.string.clips_video_attachment_no_videos_message);
        return new com.vk.core.view.components.paging.list.a(bVar, new VkPlaceholder.b(h, fVar, (com.vk.core.compose.component.semantics.a) null, 10), 0 == true ? 1 : 0, 4);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (vqt) obj;
    }
}
