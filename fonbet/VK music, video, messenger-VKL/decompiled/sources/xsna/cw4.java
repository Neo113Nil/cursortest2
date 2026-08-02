package xsna;

import androidx.media3.exoplayer.audio.b;
import com.ironsource.C4459nb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class cw4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cw4(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = ((b.a) obj).b;
                String str = y2r0.a;
                bVar.onSkipSilenceEnabledChanged(z);
                break;
            default:
                C4459nb.b((C4459nb) obj, z);
                break;
        }
    }
}
