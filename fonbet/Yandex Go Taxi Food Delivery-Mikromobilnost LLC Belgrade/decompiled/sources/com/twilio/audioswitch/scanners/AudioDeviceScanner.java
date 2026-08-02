package com.twilio.audioswitch.scanners;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import defpackage.amm0;
import defpackage.df3;
import defpackage.ef3;
import defpackage.ff3;
import defpackage.gf3;
import defpackage.hf3;
import defpackage.pac;
import defpackage.tls;
import defpackage.w511;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00162\u0010\u0010\u0019\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n*\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0017\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/twilio/audioswitch/scanners/AudioDeviceScanner;", "Landroid/media/AudioDeviceCallback;", "Landroid/media/AudioManager;", "audioManager", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/media/AudioManager;Landroid/os/Handler;)V", "Lhf3;", "audioDevice", "", "isDeviceActive", "(Lhf3;)Z", "Lamm0;", "listener", "start", "(Lamm0;)Z", "stop", "()Z", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Lzy11;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "isAudioDevice", "(Landroid/media/AudioDeviceInfo;Lhf3;)Z", "Lamm0;", "getListener$audioswitch_release", "()Lamm0;", "setListener$audioswitch_release", "(Lamm0;)V", "getListener$audioswitch_release$annotations", "()V", "Landroid/media/AudioManager;", "Landroid/os/Handler;", "getAudioDevice", "(Landroid/media/AudioDeviceInfo;)Lhf3;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes11.dex */
public final class AudioDeviceScanner extends AudioDeviceCallback {
    private final AudioManager audioManager;
    private final Handler handler;
    private amm0 listener;

    public AudioDeviceScanner(AudioManager audioManager, Handler handler) {
        this.audioManager = audioManager;
        this.handler = handler;
    }

    public static /* synthetic */ void getListener$audioswitch_release$annotations() {
    }

    public final hf3 getAudioDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
            return new df3(audioDeviceInfo.getProductName().toString());
        }
        if (Build.VERSION.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
            return new df3(audioDeviceInfo.getProductName().toString());
        }
        if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 22) {
            return new gf3(0);
        }
        if (audioDeviceInfo.getType() == 1) {
            return new ef3(0);
        }
        if (audioDeviceInfo.getType() == 2) {
            return new ff3(0);
        }
        return null;
    }

    /* renamed from: getListener$audioswitch_release, reason: from getter */
    public final amm0 getListener() {
        return this.listener;
    }

    public final boolean isAudioDevice(AudioDeviceInfo audioDeviceInfo, hf3 hf3Var) {
        if (hf3Var instanceof df3) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                return true;
            }
            return Build.VERSION.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27);
        }
        if (hf3Var instanceof ef3) {
            return audioDeviceInfo.getType() == 1;
        }
        if (hf3Var instanceof ff3) {
            return audioDeviceInfo.getType() == 2;
        }
        if (hf3Var instanceof gf3) {
            return audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 22;
        }
        w511.b();
        return false;
    }

    public boolean isDeviceActive(hf3 audioDevice) {
        for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(2)) {
            if (isAudioDevice(audioDeviceInfo, audioDevice)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDeviceInactive(hf3 hf3Var) {
        return !isDeviceActive(hf3Var);
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        super.onAudioDevicesAdded(addedDevices);
        if (addedDevices != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
                hf3 audioDevice = getAudioDevice(audioDeviceInfo);
                if (audioDevice != null) {
                    arrayList.add(audioDevice);
                }
            }
            for (hf3 hf3Var : a.N0(arrayList)) {
                amm0 amm0Var = this.listener;
                if (amm0Var != null) {
                    amm0Var.b(hf3Var);
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        super.onAudioDevicesRemoved(removedDevices);
        if (removedDevices != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
                hf3 audioDevice = getAudioDevice(audioDeviceInfo);
                if (audioDevice != null) {
                    arrayList.add(audioDevice);
                }
            }
            for (hf3 hf3Var : a.N0(arrayList)) {
                amm0 amm0Var = this.listener;
                if (amm0Var != null) {
                    amm0Var.a(hf3Var);
                }
            }
        }
    }

    public final void setListener$audioswitch_release(amm0 amm0Var) {
        this.listener = amm0Var;
    }

    public boolean start(amm0 listener) {
        this.listener = listener;
        this.audioManager.registerAudioDeviceCallback(this, this.handler);
        return true;
    }

    public boolean stop() {
        this.audioManager.unregisterAudioDeviceCallback(this);
        this.listener = null;
        return true;
    }

    public boolean start(tls tlsVar, tls tlsVar2) {
        return start(new pac(tlsVar, tlsVar2));
    }
}
