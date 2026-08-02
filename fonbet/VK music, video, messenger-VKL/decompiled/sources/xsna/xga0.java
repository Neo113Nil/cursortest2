package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetCommentsExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateVideosResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsResponseDto;
import com.vk.api.generated.wall.dto.WallGetSuggestedHashtagsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import xsna.q630;
import xsna.us2;
import xsna.vlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xga0 implements b03, f03, io.reactivex.rxjava3.core.s, vlp0.j {
    public final /* synthetic */ int b;

    public /* synthetic */ xga0(int i) {
        this.b = i;
    }

    public static us2.b b(int i, androidx.compose.runtime.a aVar) {
        aVar.K(i);
        return new us2.b();
    }

    public static boolean c(q630.a aVar, float f, androidx.compose.runtime.a aVar2, int i) {
        f9t.e(txj0.h(aVar, f), aVar2, i);
        aVar2.G();
        return androidx.compose.runtime.b.d();
    }

    @Override // xsna.vlp0.j
    public void a(vlp0.i iVar, vlp0 vlp0Var, boolean z) {
        iVar.onTransitionPause(vlp0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (PhotosGetCommentsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosGetCommentsExtendedResponseDto.class).getType())).a();
            default:
                return (ShortVideoGetTemplateVideosResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetTemplateVideosResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 3:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetCommentsResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetCommentsExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetSuggestedHashtagsResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        pod0 pod0Var = new pod0(rVar, 14);
        String a = usm0.a();
        if (a == null) {
            a = "";
        }
        rVar.onNext(a);
        usm0.b.add(pod0Var);
    }
}
