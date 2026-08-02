package xsna;

import androidx.media3.common.a;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreateRecordsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPackListsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetSimilarResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class zjh0 implements l8x.a, b03, f03, hio0 {
    public final /* synthetic */ int b;

    public /* synthetic */ zjh0(int i) {
        this.b = i;
    }

    public static int b(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static void d(a.C0043a c0043a, rgp0 rgp0Var) {
        rgp0Var.c(new androidx.media3.common.a(c0043a));
    }

    @Override // xsna.hio0
    public boolean a(zhf0 zhf0Var, zhf0 zhf0Var2) {
        return zhf0Var.h(zhf0Var2);
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new akh0(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (ServiceBookingCreateRecordsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ServiceBookingCreateRecordsResponseDto.class).getType())).a();
            case 2:
            default:
                return (BaseBoolIntDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 3:
                return (StickersGetUGCPackListsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersGetUGCPackListsResponseDto.class).getType())).a();
            case 4:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetThumbUploadUrlResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.common.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, UsersUserFullDto.class).getType()).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetSimilarResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetCommentResponseDto.class).getType());
        }
    }
}
