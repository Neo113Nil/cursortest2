package xsna;

import android.content.Context;
import com.vk.dto.hints.Hint;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import kotlin.Pair;
import xsna.c0s0;

/* compiled from: VideoAdsSuspendManagerImpl.kt */
/* loaded from: classes6.dex */
public final class i0s0 implements c0s0.b {
    public final /* synthetic */ l0s0 a;
    public final /* synthetic */ Hint b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ VideoGrowthVideoParams d;
    public final /* synthetic */ String e;

    public i0s0(l0s0 l0s0Var, Hint hint, Context context, VideoGrowthVideoParams videoGrowthVideoParams, String str) {
        this.a = l0s0Var;
        this.b = hint;
        this.c = context;
        this.d = videoGrowthVideoParams;
        this.e = str;
    }

    @Override // xsna.c0s0.b
    public final void c() {
        this.a.c.a(this.c, this.d, on00.f(new Pair("asd", this.e)));
    }

    @Override // xsna.c0s0.b
    public final void d() {
        this.a.g().s(this.b);
    }

    @Override // xsna.c0s0.b
    public final void b() {
    }

    @Override // xsna.c0s0.b
    public final void onClosed() {
    }
}
