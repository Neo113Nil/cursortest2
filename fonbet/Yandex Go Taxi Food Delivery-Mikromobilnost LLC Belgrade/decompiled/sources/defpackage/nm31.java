package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.f;
import io.flutter.view.TextureRegistry$SurfaceProducer;

/* loaded from: classes4.dex */
public abstract class nm31 implements vm31 {
    public final eg01 a;
    public final TextureRegistry$SurfaceProducer b;
    public r3k0 c;
    public final ExoPlayer w;

    public nm31(eg01 eg01Var, fe10 fe10Var, wm31 wm31Var, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, vwc0 vwc0Var) {
        f a;
        this.a = eg01Var;
        this.b = textureRegistry$SurfaceProducer;
        switch (vwc0Var.a) {
            case 0:
                Context context = vwc0Var.b;
                ye0 ye0Var = vwc0Var.c;
                ono onoVar = new ono(context);
                onoVar.b(ye0Var.i(context));
                a = onoVar.a();
                break;
            default:
                Context context2 = vwc0Var.b;
                ye0 ye0Var2 = vwc0Var.c;
                ono onoVar2 = new ono(context2);
                onoVar2.b(ye0Var2.i(context2));
                a = onoVar2.a();
                break;
        }
        this.w = a;
        a.setMediaItem(fe10Var);
        a.prepare();
        a.m.a(a(a, textureRegistry$SurfaceProducer));
        boolean z = wm31Var.a;
        te3 te3Var = new te3();
        te3Var.a = 3;
        a.setAudioAttributes(new ue3(te3Var.a), !z);
    }

    public abstract qno a(ExoPlayer exoPlayer, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        r3k0 r3k0Var = this.c;
        if (r3k0Var != null) {
            tt5 tt5Var = (tt5) r3k0Var.b;
            String str = (String) r3k0Var.c;
            vm31.A4.getClass();
            um31.b(tt5Var, null, str);
        }
        this.w.release();
    }
}
