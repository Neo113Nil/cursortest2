package com.ryanheise.audio_session;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import defpackage.ba20;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.p72;
import defpackage.ssr;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.x920;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public class b implements tsr, ca20 {
    public static Map c;
    public static final ArrayList w = new ArrayList();
    public ea20 a;
    public p72 b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "com.ryanheise.audio_session");
        this.a = ea20Var;
        ea20Var.b(this);
        Context context = ssrVar.a;
        p72 p72Var = new p72();
        if (p72.b == null) {
            final a aVar = new a();
            Handler handler = new Handler(Looper.getMainLooper());
            aVar.a = new ArrayList();
            aVar.h = new ArrayList();
            aVar.e = context;
            aVar.f = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: com.ryanheise.audio_session.AndroidAudioManager$Singleton$1
                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                    a aVar2 = a.this;
                    ArrayList arrayList = new ArrayList();
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        arrayList.add(p72.b(audioDeviceInfo));
                    }
                    aVar2.e("onAudioDevicesAdded", arrayList);
                }

                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                    a aVar2 = a.this;
                    ArrayList arrayList = new ArrayList();
                    for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                        arrayList.add(p72.b(audioDeviceInfo));
                    }
                    aVar2.e("onAudioDevicesRemoved", arrayList);
                }
            };
            aVar.g = audioDeviceCallback;
            aVar.f.registerAudioDeviceCallback(audioDeviceCallback, handler);
            p72.b = aVar;
        }
        p72Var.a = new ea20(tt5Var, "com.ryanheise.android_audio_manager");
        p72.b.a.add(p72Var);
        p72Var.a.b(p72Var);
        this.b = p72Var;
        w.add(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a.b(null);
        this.a = null;
        p72 p72Var = this.b;
        p72Var.a.b(null);
        p72.b.a.remove(p72Var);
        if (p72.b.a.size() == 0) {
            a aVar = p72.b;
            aVar.a();
            aVar.f.unregisterAudioDeviceCallback((AudioDeviceCallback) aVar.g);
            aVar.e = null;
            aVar.f = null;
            p72.b = null;
        }
        p72Var.a = null;
        this.b = null;
        w.remove(this);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        List list = (List) x920Var.b;
        String str = x920Var.a;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (!str.equals("getConfiguration")) {
                ((ba20) da20Var).notImplemented();
                return;
            } else {
                ((ba20) da20Var).success(c);
                return;
            }
        }
        c = (Map) list.get(0);
        ((ba20) da20Var).success(null);
        Object[] objArr = {c};
        Iterator it = w.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.a.a("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)), null);
        }
    }
}
