package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.tags.dto.TagsGetListResponseDto;
import com.vk.api.generated.video.dto.VideoFeedVideosForYouBlockItemsResultDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsResponseDto;
import com.vk.api.generated.wall.dto.WallGetPostingSettingsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import xsna.rq4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m2o0 implements f03, io.reactivex.rxjava3.functions.l, b03, io.reactivex.rxjava3.functions.m, yads.og1, com.vungle.ads.internal.util.m {
    public final /* synthetic */ int b;

    public /* synthetic */ m2o0(int i) {
        this.b = i;
    }

    @Override // com.vungle.ads.internal.util.m
    public ObjectInputStream a(InputStream inputStream) {
        return com.vungle.ads.internal.util.n.a(inputStream);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (Object[]) obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (VideoFeedVideosForYouBlockItemsResultDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoFeedVideosForYouBlockItemsResultDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, TagsGetListResponseDto.class).getType());
            case 1:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetPostingSettingsResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAlbumsResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof wgw0) || (obj instanceof h3x0) || (obj instanceof jrw0) || (obj instanceof chw0) || (obj instanceof rq4.a) || (obj instanceof ll20) || (obj instanceof uh9) || (obj instanceof plk) || (obj instanceof qlk) || (obj instanceof rjj0) || (obj instanceof nij0) || (obj instanceof l4u0) || (obj instanceof k4u0) || (obj instanceof ah10) || (obj instanceof zg10) || (obj instanceof fr80);
    }

    public /* synthetic */ m2o0(tdk0 tdk0Var) {
        this.b = 1;
    }

    @Override // yads.og1
    public void a(Object obj, yads.ew0 ew0Var) {
        yads.kb0.a((yads.af) obj, ew0Var);
    }
}
