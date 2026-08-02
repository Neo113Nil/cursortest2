package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.video.dto.VideoGetAssistantVideosFromAlbumResponseDto;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.xgy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y5r0 implements f03, Optional.Action, b03, xgy.a {
    public final /* synthetic */ int b;

    public /* synthetic */ y5r0(int i) {
        this.b = i;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        VerificationController.lambda$requestNewSmsCode$19((VerificationListener) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (WallRestoreThreadResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallRestoreThreadResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UxpollsGetResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAssistantVideosFromAlbumResponseDto.class).getType());
        }
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        int i = ify.a;
        return ify.d(3, null);
    }
}
