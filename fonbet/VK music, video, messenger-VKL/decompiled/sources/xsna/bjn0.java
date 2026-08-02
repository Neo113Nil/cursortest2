package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewsChunkDto;
import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import io.appmetrica.analytics.impl.G0;
import io.appmetrica.analytics.impl.InterfaceC4756ce;
import io.appmetrica.analytics.impl.InterfaceC4969kl;
import io.appmetrica.analytics.impl.Td;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.visualization.MultiBoxVisualizer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class bjn0 implements InterfaceC4756ce, MultiBoxVisualizer.GestureColorer, io.reactivex.rxjava3.functions.l, b03, f03, yads.sq0, yads.iz {
    public final /* synthetic */ int b;

    public /* synthetic */ bjn0(int i) {
        this.b = i;
    }

    public static void b(String str, String str2, RTCLog rTCLog, String str3) {
        rTCLog.log(str3, str + str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4756ce
    public InterfaceC4969kl a(G0 g0) {
        return Td.b(g0);
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.pk0) obj).a();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return s3q0.a;
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.na2.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetVideoDiscoverResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersPackPreviewsChunkDto.class).getType());
        }
    }

    @Override // ru.ok.tensorflow.visualization.MultiBoxVisualizer.GestureColorer
    public int getColor(Gesture gesture) {
        return Tensorflow.getColor(gesture);
    }
}
