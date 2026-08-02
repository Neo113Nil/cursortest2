package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetAnimationsResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hbn0 implements f03, b03, io.reactivex.rxjava3.functions.m, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ hbn0(int i) {
        this.b = i;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (VideoGetAlbumsExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetAlbumsExtendedResponseDto.class).getType())).a();
            default:
                return (VmojiPurchaseProductResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VmojiPurchaseProductResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.d6.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SuperAppGetAnimationsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof iru0;
    }
}
