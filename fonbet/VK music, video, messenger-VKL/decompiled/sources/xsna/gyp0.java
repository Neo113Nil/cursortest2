package xsna;

import android.content.Context;
import com.vk.api.generated.video.dto.VideoGetUVStatsTokenEnvDto;
import ru.ok.android.onelog.uv.token.UVTokenProvider;

/* compiled from: UVTokenProviderImpl.kt */
/* loaded from: classes6.dex */
public final class gyp0 extends hp6 implements UVTokenProvider {
    public final boolean g;

    public gyp0(Context context, boolean z) {
        super(context);
        this.g = z;
    }

    @Override // xsna.hp6
    public final io.reactivex.rxjava3.internal.operators.single.y b() {
        dz2 x = yfb.x(this.b.F(b6m.b(this.a), this.g ? VideoGetUVStatsTokenEnvDto.DEVELOPMENT : VideoGetUVStatsTokenEnvDto.PRODUCTION, Boolean.valueOf(this.c.getAndSet(false))));
        x.d = true;
        x.c = true;
        return rsg0.w0(x).l(new pq(new eyp0(0), 23));
    }

    @Override // xsna.hp6
    public final io.reactivex.rxjava3.internal.operators.single.y c() {
        return rsg0.w0(yfb.x(this.b.F(null, this.g ? VideoGetUVStatsTokenEnvDto.DEVELOPMENT : VideoGetUVStatsTokenEnvDto.PRODUCTION, Boolean.valueOf(this.c.getAndSet(false))))).l(new fyp0(new b1o0(1)));
    }

    @Override // ru.ok.android.onelog.uv.token.UVTokenProvider
    public final String getToken() {
        String a = a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Failed to get UV stats token");
    }

    @Override // ru.ok.android.onelog.uv.token.UVTokenProvider
    public final void refreshToken() {
        this.c.set(true);
        this.f = null;
    }
}
