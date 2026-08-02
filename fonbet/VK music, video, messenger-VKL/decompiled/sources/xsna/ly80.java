package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.orders.dto.OrdersAppSubscriptionItemDto;
import com.vk.api.generated.photos.dto.PhotosGetCommentsExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateVideosResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppWidgetPayloadTypesDto;
import com.vk.api.generated.tags.dto.TagsAddResponseDto;
import com.vk.api.generated.wall.dto.WallConvertLinkDto;
import com.vk.dto.video.VideoAlbum;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import kotlin.collections.EmptyList;
import xsna.vlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ly80 implements b03, f03, io.reactivex.rxjava3.functions.l, vlp0.j {
    public final /* synthetic */ int b;

    public /* synthetic */ ly80(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto, char c) {
        sb.append(superAppWidgetPayloadTypesDto);
        sb.append(c);
        return sb.toString();
    }

    @Override // xsna.vlp0.j
    public void a(vlp0.i iVar, vlp0 vlp0Var, boolean z) {
        iVar.onTransitionResume(vlp0Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return ((bq) obj).a;
            case 9:
                return EmptyList.b;
            default:
                return Optional.of((VideoAlbum) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (OrdersAppSubscriptionItemDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, OrdersAppSubscriptionItemDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 7:
                return (TagsAddResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, TagsAddResponseDto.class).getType())).a();
            case 11:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, Integer.class).getType()).getType())).a();
            default:
                return (List) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, xtp0.getParameterized(List.class, WallConvertLinkDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetCommentsExtendedResponseDto.class).getType());
            case 2:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetTemplateVideosResponseDto.class).getType());
            case 3:
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    public /* synthetic */ ly80(izs izsVar, int i) {
        this.b = i;
    }
}
