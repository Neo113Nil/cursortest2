package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoSearchExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lft0 implements b03, f03, ScreenModeVideoStatMapper.a, io.reactivex.rxjava3.functions.l {
    public /* synthetic */ lft0() {
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return Boolean.FALSE;
    }

    @Override // com.vk.libvideo.tracker.ScreenModeVideoStatMapper.a
    public Object d(ScreenModeVideoStatMapper.UnifiedStatScreenMode unifiedStatScreenMode) {
        return unifiedStatScreenMode.name().toLowerCase(Locale.ROOT);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (VideoGetCommentsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetCommentsExtendedResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoSearchExtendedResponseDto.class).getType());
    }

    public /* synthetic */ lft0(p9w0 p9w0Var) {
    }
}
