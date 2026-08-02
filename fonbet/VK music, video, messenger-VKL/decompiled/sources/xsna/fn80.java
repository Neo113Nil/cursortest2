package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.d;
import androidx.media3.exoplayer.video.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: OneVideoRenderersFactory.kt */
/* loaded from: classes8.dex */
public final class fn80 extends qll {
    public final ArrayList e;
    public final boolean f;

    public fn80(Context context, ArrayList arrayList, boolean z) {
        super(context);
        this.e = arrayList;
        this.f = z;
    }

    @Override // xsna.qll
    public final androidx.media3.exoplayer.audio.d c(Context context) {
        d.c cVar = new d.c(context);
        AudioProcessor[] audioProcessorArr = (AudioProcessor[]) this.e.toArray(new AudioProcessor[0]);
        cVar.c = new d.e((AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length));
        return cVar.a();
    }

    @Override // xsna.qll
    public final void d(ako0 ako0Var, Looper looper, ArrayList arrayList) {
        uko0 uko0Var = new uko0(ako0Var, looper, new sn80());
        uko0Var.M = true;
        arrayList.add(uko0Var);
    }

    @Override // xsna.qll
    public final void e(Context context, androidx.media3.exoplayer.mediacodec.e eVar, boolean z, Handler handler, androidx.media3.exoplayer.video.g gVar, ArrayList arrayList) {
        Object obj;
        super.e(context, eVar, z, handler, gVar, arrayList);
        if (this.f) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((androidx.media3.exoplayer.j) obj) instanceof androidx.media3.exoplayer.video.c) {
                        break;
                    }
                }
            }
            androidx.media3.exoplayer.j jVar = (androidx.media3.exoplayer.j) obj;
            if (jVar != null) {
                int indexOf = arrayList.indexOf(jVar);
                c.C0068c c0068c = new c.C0068c(context);
                c0068c.d = this.b;
                c0068c.c = eVar;
                c0068c.e = 5000L;
                c0068c.f = z;
                c0068c.g = handler;
                c0068c.h = gVar;
                c0068c.i = 50;
            }
        }
    }
}
