package xsna;

import android.content.Context;
import androidx.media3.exoplayer.audio.b;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.C5208u1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class bw4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bw4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = ((b.a) obj3).b;
                String str = y2r0.a;
                bVar.g((androidx.media3.common.a) obj2, (n8l) obj);
                break;
            case 1:
                we9 we9Var = (we9) obj3;
                gs9 gs9Var = (gs9) obj2;
                we9Var.t.remove(gs9Var);
                we9Var.s(gs9Var).addListener((hc3) obj, xo9.g());
                break;
            default:
                ((C5208u1) obj3).b((Context) obj2, (AppMetricaConfig) obj);
                break;
        }
    }
}
