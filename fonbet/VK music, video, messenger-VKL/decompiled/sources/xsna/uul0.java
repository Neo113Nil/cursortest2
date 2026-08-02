package xsna;

import android.graphics.Bitmap;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetQuestionsExtendedResponseDto;
import com.vk.api.generated.vkRun.dto.VkRunSetStepsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uul0 implements f03, io.reactivex.rxjava3.functions.l, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ uul0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            default:
                return fkw.b((Bitmap) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetQuestionsExtendedResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VkRunSetStepsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }

    public /* synthetic */ uul0(kpr kprVar) {
        this.b = 1;
    }
}
