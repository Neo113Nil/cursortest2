package xsna;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbl;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.serverEffects.dto.ServerEffectsCutVideoResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.api.generated.video.dto.VideoStopStreamingResponseDto;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a690 implements b03, f03, m6o, io.reactivex.rxjava3.functions.l, mdy0, yads.sq0, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ a690(int i) {
        this.b = i;
    }

    public static Object c(zzbl zzblVar, int i, List list, int i2) {
        com.google.android.gms.internal.measurement.zzh.zzh(zzblVar.name(), i, list);
        return list.get(i2);
    }

    public static boolean d(q630.a aVar, float f, androidx.compose.runtime.a aVar2, int i) {
        f9t.e(txj0.h(aVar, f), aVar2, i);
        return androidx.compose.runtime.b.d();
    }

    @Override // xsna.mdy0
    public DatagramSocket a() {
        return new DatagramSocket();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return (io.reactivex.rxjava3.core.p) obj;
            default:
                return ((VideoListWithTotalCount) obj).b;
        }
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.pc.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 7:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 9:
                return (VideoStopStreamingResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoStopStreamingResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.r93.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ServerEffectsCutVideoResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoPlaylistFullDto.class).getType());
        }
    }

    public /* synthetic */ a690(izs izsVar, int i) {
        this.b = i;
    }

    @Override // xsna.m6o
    public double b(double d) {
        return d;
    }
}
