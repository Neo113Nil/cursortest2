package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoSaveAssistantAlbumResponseDto;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k2s0 implements io.reactivex.rxjava3.functions.l, f03, b03, yads.iz {
    public final /* synthetic */ int b;

    public /* synthetic */ k2s0(int i) {
        this.b = i;
    }

    public static v4s a(int i, fno0 fno0Var) {
        return u4s.a(fno0Var, new b6s(i));
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.lt2) obj).b.release();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((PageLoadingState) obj).Bb();
            default:
                return s3q0.a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (VideoSaveAssistantAlbumResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoSaveAssistantAlbumResponseDto.class).getType())).a();
            default:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetResponseDto.class).getType());
        }
    }

    public /* synthetic */ k2s0(izs izsVar, int i) {
        this.b = i;
    }
}
