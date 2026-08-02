package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.vk.headset.internal.HeadsetWiredConnectedReceiver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: HeadsetDetector.kt */
/* loaded from: classes.dex */
public final class yyu {
    public final Context a;
    public final CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();
    public volatile boolean c;
    public final HeadsetWiredConnectedReceiver d;
    public final wyu e;

    /* compiled from: HeadsetDetector.kt */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: HeadsetDetector.kt */
    public static final class b implements xyu {
        public b() {
        }

        @Override // xsna.xyu
        public final void a(boolean z) {
            yyu yyuVar = yyu.this;
            boolean z2 = yyuVar.c;
            yyuVar.c = z;
            if (z2 != z) {
                Iterator<a> it = yyuVar.b.iterator();
                while (it.hasNext()) {
                    it.next().a(z);
                }
            }
        }
    }

    public yyu(Context context) {
        this.a = context;
        b bVar = new b();
        this.d = new HeadsetWiredConnectedReceiver(bVar);
        this.e = new wyu(bVar);
    }

    public final synchronized void a(a aVar) {
        int size = this.b.size();
        this.b.add(aVar);
        int size2 = this.b.size();
        if (size == 0 && size2 > 0) {
            HeadsetWiredConnectedReceiver headsetWiredConnectedReceiver = this.d;
            Context context = this.a;
            headsetWiredConnectedReceiver.getClass();
            context.registerReceiver(headsetWiredConnectedReceiver, new IntentFilter(headsetWiredConnectedReceiver.a()));
            wyu wyuVar = this.e;
            wyuVar.getClass();
            ((AudioManager) context.getSystemService("audio")).registerAudioDeviceCallback(wyuVar, null);
        }
    }

    public final synchronized void b() {
        HeadsetWiredConnectedReceiver headsetWiredConnectedReceiver = this.d;
        Context context = this.a;
        headsetWiredConnectedReceiver.getClass();
        context.unregisterReceiver(headsetWiredConnectedReceiver);
        wyu wyuVar = this.e;
        Context context2 = this.a;
        wyuVar.getClass();
        ((AudioManager) context2.getSystemService("audio")).unregisterAudioDeviceCallback(wyuVar);
    }
}
