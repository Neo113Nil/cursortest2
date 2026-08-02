package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.api.generated.search.dto.SearchGetHintsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSaveAnonLikeResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersKeywordsResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoMusicDiscoverResponseDto;
import com.vk.api.generated.vkStart.dto.VkStartStatsListItemDto;
import com.vk.api.generated.wall.dto.WallDeleteThreadResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hub0 implements f03, b03, io.reactivex.rxjava3.functions.l, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ hub0(int i) {
        this.b = i;
    }

    public static StringBuilder a(Throwable th, com.mbridge.msdk.video.bt.component.a aVar, Object obj, String str) {
        aVar.a(obj, th.getMessage());
        return new StringBuilder(str);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return ((a.b) obj).c;
            default:
                return s3q0.a;
        }
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.dm2.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
            case 3:
            case 5:
            case 7:
            default:
                return (WallDeleteThreadResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallDeleteThreadResponseDto.class).getType())).a();
            case 4:
                return (ShortVideoSaveAnonLikeResponseDto) ((com.vk.clips.sdk.api.generated.SingleRootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.clips.sdk.api.generated.SingleRootResponseDto.class, ShortVideoSaveAnonLikeResponseDto.class).getType())).a();
            case 6:
                return (StoreGetStickersKeywordsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoreGetStickersKeywordsResponseDto.class).getType())).a();
            case 8:
                return (VideoGetVideoMusicDiscoverResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetVideoMusicDiscoverResponseDto.class).getType())).a();
            case 9:
                return (List) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, xtp0.getParameterized(List.class, VkStartStatsListItemDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PollsPollExtendedDto.class).getType());
            case 1:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SearchGetHintsResponseDto.class).getType());
        }
    }

    public /* synthetic */ hub0(izs izsVar, int i) {
        this.b = i;
    }
}
