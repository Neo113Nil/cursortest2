package xsna;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.widget.ImageView;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import com.vungle.ads.internal.persistence.FilePreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.media.PublisherImpl;
import xsna.duy0;
import xsna.yx50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class xy4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xy4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AudioTrackAudioOutput.b bVar = (AudioTrackAudioOutput.b) this.c;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.d).getRoutedDevice();
                if (routedDevice != null) {
                    bVar.c.post(new yy4(0, bVar, routedDevice));
                    return;
                }
                return;
            case 1:
                zv6 zv6Var = (zv6) this.c;
                long[] jArr = (long[]) this.d;
                if (zv6Var.e) {
                    return;
                }
                com.vk.media.ok.b bVar2 = (com.vk.media.ok.b) zv6Var.b.c;
                bVar2.l0 = jArr;
                EffectHolder effectHolder = bVar2.H;
                EffectRegistry effectRegistry = effectHolder.getEffectRegistry();
                if (effectRegistry.inputAudioBitsRequired(effectRegistry.getEffectHandle(effectHolder.getCurrentEffectName()))) {
                    effectHolder.setMusicInfo(bVar2.l0, 0L);
                    return;
                }
                return;
            case 2:
                androidx.media3.transformer.u uVar = (androidx.media3.transformer.u) this.c;
                uVar.b.f(-1, new vj0(uVar, (androidx.media3.transformer.z) this.d));
                return;
            case 3:
                FilePreferences.a((FilePreferences) this.c, (HashMap) this.d);
                return;
            case 4:
                yx50.c cVar = (yx50.c) this.c;
                yx50.c cVar2 = (yx50.c) this.d;
                yx50 yx50Var = cVar.e;
                yx50Var.x.writeLock().lock();
                try {
                    synchronized (yx50Var.y) {
                        yx50Var.y.remove(cVar2);
                    }
                    return;
                } finally {
                    yx50Var.x.writeLock().unlock();
                }
            case 5:
                ((PublisherImpl) this.c).lambda$setUrls$5((Collection) this.d);
                return;
            case 6:
                ((ImageView) this.c).setImageDrawable((com.mbridge.msdk.video.dynview.shape.a) this.d);
                return;
            case 7:
                duy0.a aVar = (duy0.a) this.c;
                String str = (String) this.d;
                aVar.a.c.T.e(999, 999000, "onCustomEvent(): type=" + str);
                return;
            default:
                zwy0 zwy0Var = (zwy0) this.c;
                RtcCommand<?> rtcCommand = (RtcCommand) this.d;
                Iterator it = zwy0Var.b.iterator();
                while (it.hasNext()) {
                    try {
                        ((RtcCommandExecutor.Listener) it.next()).onRtcCommandRemoved(rtcCommand);
                    } catch (Throwable th) {
                        zwy0Var.a.reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th);
                    }
                }
                return;
        }
    }

    public /* synthetic */ xy4(duy0.a aVar, String str, String str2) {
        this.b = 7;
        this.c = aVar;
        this.d = str;
    }
}
