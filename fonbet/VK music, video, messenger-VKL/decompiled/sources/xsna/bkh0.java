package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.serviceBooking.dto.ServiceBookingCreateRecordsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPackListsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallGetCommentOrderResponseDto;
import com.vk.clips.sdk.api.generated.GsonHolder;
import com.vk.clips.sdk.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class bkh0 implements l8x.a, f03, b03, hio0, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ bkh0(int i) {
        this.b = i;
    }

    @Override // xsna.hio0
    public boolean a(zhf0 zhf0Var, zhf0 zhf0Var2) {
        return zhf0Var2.a(zhf0Var.c());
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new ckh0(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (ShortVideoGetRecomResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, ShortVideoGetRecomResponseDto.class).getType())).a();
            case 6:
                return (List) ((com.vk.common.api.generated.SingleRootResponseDto) com.vk.common.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.common.api.generated.SingleRootResponseDto.class, xtp0.getParameterized(List.class, UsersUserFullDto.class).getType()).getType())).a();
            default:
                return (WallGetCommentOrderResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, WallGetCommentOrderResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.o43.b(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServiceBookingCreateRecordsResponseDto.class).getType());
            case 2:
            case 5:
            case 6:
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersGetUGCPackListsResponseDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
        }
    }
}
