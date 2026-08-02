package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetFeedSettingsResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetAllWidgetSettingsResponseDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.api.generated.vkMaps.dto.VkMapsGeoDataByRefResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vkontakte.android.fragments.WebViewFragment;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vul0 implements f03, b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ vul0(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, Object obj) {
        return (obj.hashCode() + i) * i2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return null;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (SuperAppGetAllWidgetSettingsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, SuperAppGetAllWidgetSettingsResponseDto.class).getType())).a();
            default:
                return (VkMapsGeoDataByRefResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VkMapsGeoDataByRefResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetFeedSettingsResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetWatchTogetherVideosResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = WebViewFragment.O0;
        return ((Boolean) ((qg90) obj).a).booleanValue();
    }
}
