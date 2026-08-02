package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoDeletePlaylistsResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetInterestingBlockResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.video.ui.discovery.minimizable.motion.scene_dsl.transitions.MotionLayoutCurveFit;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s3j0 implements f03, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ s3j0(int i) {
        this.b = i;
    }

    public static int a(int i, Collection collection, int i2) {
        return (collection.hashCode() + i) * i2;
    }

    public static View b(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return e3m.b(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static void c(int i, int i2, float f, sg.bigo.ads.p.a aVar, Space space) {
        aVar.addView(space, new LinearLayout.LayoutParams(i, i2, f));
    }

    public static void d(ddy ddyVar, String str, Float f, MotionLayoutCurveFit motionLayoutCurveFit, String str2) {
        ddyVar.i(str, f);
        ddyVar.i(str2, Integer.valueOf(motionLayoutCurveFit.ordinal()));
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoDeletePlaylistsResponseDto.class).getType());
            case 2:
            case 3:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetCommentsExtendedResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesGetInterestingBlockResponseDto.class).getType());
        }
    }
}
