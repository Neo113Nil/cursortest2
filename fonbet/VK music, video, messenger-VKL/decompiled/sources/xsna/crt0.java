package xsna;

import com.huawei.hms.api.ConnectionResult;
import com.vk.api.generated.video.dto.VideoViewSegmentsEndStreamReasonDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsStateEndDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsStateStartDto;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoViewSegmentsQueue.kt */
/* loaded from: classes.dex */
public final class crt0 {
    public final r2u0 a;
    public io.reactivex.rxjava3.disposables.c b;
    public final sk3<CachedVideoViewedSegments> c = new sk3<>();
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new dr6(18));

    public crt0(r2u0 r2u0Var) {
        this.a = r2u0Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto;
        VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto;
        VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto;
        CachedVideoViewedSegments l = this.c.l();
        if (l == null) {
            return;
        }
        VideoViewSegmentsStateStartDto[] values = VideoViewSegmentsStateStartDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                videoViewSegmentsStateStartDto = null;
                break;
            }
            VideoViewSegmentsStateStartDto videoViewSegmentsStateStartDto2 = values[i];
            if (epx.f(videoViewSegmentsStateStartDto2.i(), l.Hb())) {
                videoViewSegmentsStateStartDto = videoViewSegmentsStateStartDto2;
                break;
            }
            i++;
        }
        VideoViewSegmentsStateEndDto[] values2 = VideoViewSegmentsStateEndDto.values();
        int length2 = values2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                videoViewSegmentsStateEndDto = null;
                break;
            }
            VideoViewSegmentsStateEndDto videoViewSegmentsStateEndDto2 = values2[i2];
            if (epx.f(videoViewSegmentsStateEndDto2.i(), l.Gb())) {
                videoViewSegmentsStateEndDto = videoViewSegmentsStateEndDto2;
                break;
            }
            i2++;
        }
        VideoViewSegmentsEndStreamReasonDto[] values3 = VideoViewSegmentsEndStreamReasonDto.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                videoViewSegmentsEndStreamReasonDto = null;
                break;
            }
            VideoViewSegmentsEndStreamReasonDto videoViewSegmentsEndStreamReasonDto2 = values3[i3];
            if (epx.f(videoViewSegmentsEndStreamReasonDto2.i(), l.Cb())) {
                videoViewSegmentsEndStreamReasonDto = videoViewSegmentsEndStreamReasonDto2;
                break;
            }
            i3++;
        }
        tft0 tft0Var = (tft0) this.d.getValue();
        UserId q = l.q();
        int Ib = l.Ib();
        String f = l.Eb().f();
        this.b = rsg0.y0(yfb.x(tft0Var.q(Ib, q, f.substring(0, Math.min(f.length(), ConnectionResult.NETWORK_ERROR)), l.C4(), l.Bb(), l.r(), Integer.valueOf(l.Fb()), Boolean.valueOf(l.Ab() == 1), videoViewSegmentsStateStartDto, videoViewSegmentsStateEndDto, videoViewSegmentsEndStreamReasonDto, l.Db(), Boolean.valueOf(l.Kb()))), null, null, 3).subscribe(new dfr0(new m4t0(1, this, l), 4), new o7y(new x7t0(1, this, l), 29));
    }
}
