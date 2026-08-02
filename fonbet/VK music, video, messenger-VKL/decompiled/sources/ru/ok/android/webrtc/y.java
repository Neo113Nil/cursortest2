package ru.ok.android.webrtc;

import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import org.webrtc.Logging;
import ru.ok.android.external.sdk.MicSampleListener;
import ru.ok.android.processing.PCMWrapper;
import xsna.xy9;

/* loaded from: classes9.dex */
public final class y implements MicSampleListener {
    public long a = SystemClock.elapsedRealtime();
    public final ArrayList b = new ArrayList();

    @Override // ru.ok.android.external.sdk.MicSampleListener
    public final void onSample(int i, int i2, int i3, PCMWrapper pCMWrapper) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.a > 5000 && !this.b.isEmpty()) {
            StringBuilder sb = new StringBuilder("buffers[mic][");
            sb.append(elapsedRealtime - this.a);
            sb.append("]: ");
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                sb2.append((int) ((x) obj).b);
                sb2.append(StringUtils.COMMA);
            }
            sb.append((Object) sb2);
            Logging.d("SharedPeerConnectionFac", sb.toString());
            this.b.clear();
            this.a = elapsedRealtime;
        }
        int i5 = pCMWrapper.size;
        short s = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            short s2 = pCMWrapper.get16(i6);
            if (s2 > s) {
                s = s2;
            }
        }
        if (this.b.isEmpty()) {
            this.b.add(new x(s));
            return;
        }
        x xVar = (x) xy9.b(1, this.b);
        int i7 = xVar.a;
        if (i7 >= 10) {
            this.b.add(new x(s));
        } else {
            if (xVar.b < s) {
                xVar.b = s;
            }
            xVar.a = i7 + 1;
        }
    }
}
