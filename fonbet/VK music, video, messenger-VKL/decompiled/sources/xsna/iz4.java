package xsna;

import com.vk.media.pipeline.audio.AudioPcm;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.yl4;

/* compiled from: AudioTrackFormatConverter.kt */
/* loaded from: classes3.dex */
public final class iz4 {
    public final ArrayList<qt4> a;

    public iz4(AudioPcm audioPcm, float f, double d, AudioPcm audioPcm2) {
        int i = audioPcm.b;
        int i2 = audioPcm2.b;
        ArrayList<qt4> arrayList = new ArrayList<>();
        this.a = arrayList;
        int i3 = audioPcm.a;
        int i4 = audioPcm2.a;
        if (i3 != i4) {
            zek0 zek0Var = new zek0();
            if (i4 != Integer.MIN_VALUE && i4 <= 0) {
                throw new IllegalArgumentException(lhg.a(i4, "Wrong sampleRateHz=").toString());
            }
            zek0Var.c = i4;
            arrayList.add(zek0Var);
        }
        if (i != i2 || f != 1.0f) {
            zl4 zl4Var = new zl4();
            yl4 a = yl4.a.a(i, i2);
            float[] fArr = a.c;
            float[] fArr2 = new float[fArr.length];
            int length = fArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                fArr2[i5] = fArr[i5] * f;
            }
            int i6 = a.a;
            zl4Var.i.put(i6, new yl4(fArr2, i6, a.b));
            this.a.add(zl4Var);
        }
        if (d != 1.0d) {
            zek0 zek0Var2 = new zek0();
            float f2 = (float) d;
            if (zek0Var2.a != f2) {
                zek0Var2.h = true;
                zek0Var2.a = f2;
            }
            zek0Var2.a(audioPcm2);
            this.a.add(zek0Var2);
        }
        Iterator<qt4> it = this.a.iterator();
        while (it.hasNext()) {
            qt4 next = it.next();
            next.a(audioPcm);
            next.flush();
        }
    }
}
