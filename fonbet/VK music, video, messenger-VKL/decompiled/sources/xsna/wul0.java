package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetCatalogTemplatesExtendedResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetAnimationsResponseDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeocodingResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetPhotoUploadUrlResponseDto;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wul0 implements b03, VkTooltip.b, f03, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ int b;

    public /* synthetic */ wul0(int i) {
        this.b = i;
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
        g620.f().e().g();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (StoriesGetCatalogTemplatesExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetCatalogTemplatesExtendedResponseDto.class).getType())).a();
            case 1:
                return (SuperAppGetAnimationsResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, SuperAppGetAnimationsResponseDto.class).getType())).a();
            case 2:
            default:
                return (VmojiGetPhotoUploadUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VmojiGetPhotoUploadUrlResponseDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VkMapsGeocodingResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        com.vk.voip.ui.c.b.getClass();
        Boolean bool = (Boolean) com.vk.voip.ui.c.s0.b.invoke();
        bool.getClass();
        rVar.onNext(bool);
    }
}
