package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetStatsV5200ResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.superapp.api.dto.menu.QueueSettings;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bzk0 implements f03, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ bzk0(int i) {
        this.b = i;
    }

    public static int a(QueueSettings queueSettings, int i, int i2) {
        return (queueSettings.hashCode() + i) * i2;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
                return (StoriesGetStatsV5200ResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetStatsV5200ResponseDto.class).getType())).a();
            case 3:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
    }
}
