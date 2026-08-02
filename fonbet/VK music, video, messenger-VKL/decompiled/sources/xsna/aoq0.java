package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.wall.dto.WallGetAttachmentsConfigResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class aoq0 implements io.reactivex.rxjava3.functions.l, b03, f03, yads.du {
    public final /* synthetic */ int b;

    public /* synthetic */ aoq0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return EmptyList.b;
            case 2:
                return ((GroupsGetByIdObjectResponseDto) obj).d();
            default:
                return Boolean.FALSE;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (VideoVideoAlbumFullDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoVideoAlbumFullDto.class).getType())).a();
            default:
                return (WallGetAttachmentsConfigResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetAttachmentsConfigResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
    }

    public /* synthetic */ aoq0(izs izsVar, int i) {
        this.b = i;
    }
}
