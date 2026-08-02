package xsna;

import com.vk.api.generated.video.dto.VideoGetByIdsResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoQualitiesDownloadInfoResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlockResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.InterfaceC4756ce;
import io.appmetrica.analytics.impl.InterfaceC4969kl;
import io.appmetrica.analytics.impl.Td;
import xsna.jhw0;
import xsna.o2z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class s7o0 implements InterfaceC4756ce, b03, io.reactivex.rxjava3.functions.l, o2z0.b, yads.iz {
    public final /* synthetic */ int b;

    public /* synthetic */ s7o0(int i) {
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4756ce
    public InterfaceC4969kl a(G0 g0) {
        return Td.a(g0);
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.pk0) obj).c();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((jhw0.b) obj).d;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (VideoGetVideoQualitiesDownloadInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetVideoQualitiesDownloadInfoResponseDto.class).getType())).a();
            case 2:
                return (VideoGetByIdsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetByIdsResponseDto.class).getType())).a();
            default:
                return (VmojiGetStickerPacksRecommendationBlockResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VmojiGetStickerPacksRecommendationBlockResponseDto.class).getType())).a();
        }
    }

    public /* synthetic */ s7o0(Object obj, int i) {
        this.b = i;
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
    }
}
