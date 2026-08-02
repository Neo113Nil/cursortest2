package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusHistoryRecordsResponseDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsResponseDto;
import com.vk.api.generated.wall.dto.WallEditResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import xsna.vlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ajl0 implements f03, vlp0.j, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ ajl0(int i) {
        this.b = i;
    }

    public static /* synthetic */ boolean b(AtomicReference atomicReference, cj20 cj20Var) {
        while (!atomicReference.compareAndSet(null, cj20Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vlp0.j
    public void a(vlp0.i iVar, vlp0 vlp0Var, boolean z) {
        iVar.a(vlp0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoreGetStickersBonusHistoryRecordsResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoViewSegmentsResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallEditResponseDto.class).getType());
        }
    }
}
