package xsna;

import android.os.Bundle;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.internal.api.GsonHolder;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rft0 implements f03, yads.wq, yads.ng1, yads.iz {
    public final /* synthetic */ int b;

    public /* synthetic */ rft0(int i) {
        this.b = i;
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.pk0) obj).a(3);
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.fd2.b(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAlbumsExtendedResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VmojiPurchaseProductResponseDto.class).getType());
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).onRenderedFirstFrame();
    }
}
