package xsna;

import android.content.Context;
import com.ironsource.B5;
import com.vk.api.generated.video.dto.VideoGetExternalStatsTokenEnvDto;
import com.vk.api.generated.video.dto.VideoGetStatsTokenEnvDto;

/* compiled from: OneVideoTokenProvider.kt */
/* loaded from: classes11.dex */
public final class xn80 extends hp6 {
    public final boolean g;

    public xn80(Context context, boolean z) {
        super(context);
        this.g = z;
    }

    @Override // xsna.hp6
    public final io.reactivex.rxjava3.internal.operators.single.y b() {
        String b = b6m.b(this.a);
        VideoGetExternalStatsTokenEnvDto videoGetExternalStatsTokenEnvDto = this.g ? VideoGetExternalStatsTokenEnvDto.DEVELOPMENT : VideoGetExternalStatsTokenEnvDto.PRODUCTION;
        boolean andSet = this.c.getAndSet(false);
        tfx tfxVar = new tfx("video.getExternalStatsToken", new zyk0(4), new azk0(3));
        if (b != null) {
            tfx.o(tfxVar, "external_user_id", b, 0, 0, 12);
        }
        if (videoGetExternalStatsTokenEnvDto != null) {
            tfx.o(tfxVar, B5.o, videoGetExternalStatsTokenEnvDto.i(), 0, 0, 12);
        }
        tfxVar.j("force_refresh", andSet);
        dz2 x = yfb.x(tfxVar);
        x.d = true;
        x.c = true;
        return rsg0.w0(x).l(new oq(new svz(15), 24));
    }

    @Override // xsna.hp6
    public final io.reactivex.rxjava3.internal.operators.single.y c() {
        VideoGetStatsTokenEnvDto videoGetStatsTokenEnvDto = this.g ? VideoGetStatsTokenEnvDto.DEVELOPMENT : VideoGetStatsTokenEnvDto.PRODUCTION;
        boolean andSet = this.c.getAndSet(false);
        tfx tfxVar = new tfx("video.getStatsToken", new ggj0(6), new bxj0(6));
        if (videoGetStatsTokenEnvDto != null) {
            tfx.o(tfxVar, B5.o, videoGetStatsTokenEnvDto.i(), 0, 0, 12);
        }
        tfxVar.j("force_refresh", andSet);
        return rsg0.w0(yfb.x(tfxVar)).l(new j8(new y8m(19), 21));
    }
}
