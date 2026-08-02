package xsna;

import com.google.android.material.textfield.TextInputLayout;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.generated.utils.dto.UtilsCheckScreenNameResponseDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.log.L;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kgj0 implements f03, io.reactivex.rxjava3.functions.l, TextInputLayout.e, b03, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ kgj0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        L.i((Throwable) obj);
        return Boolean.FALSE;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 4:
                return (UtilsCheckScreenNameResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UtilsCheckScreenNameResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetGridShortVideosResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallRestoreThreadResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof nru0;
    }
}
