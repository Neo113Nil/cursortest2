package com.cloudwebrtc.webrtc.audio;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.twilio.audioswitch.AbstractAudioSwitch$State;
import com.twilio.audioswitch.a;
import com.twilio.audioswitch.scanners.AudioDeviceScanner;
import defpackage.df3;
import defpackage.ef3;
import defpackage.ff3;
import defpackage.gf3;
import defpackage.hf3;
import defpackage.if3;
import defpackage.jf3;
import defpackage.kh3;
import defpackage.lh3;
import defpackage.mh3;
import defpackage.n9f0;
import defpackage.nh3;
import defpackage.ny61;
import defpackage.ogz;
import defpackage.tcc;
import defpackage.v6;
import defpackage.wls;
import defpackage.zbd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListSet;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public class AudioSwitchManager {
    public static final String TAG = "AudioSwitchManager";
    public static AudioSwitchManager instance;
    private final AudioManager audioManager;
    private kh3 audioSwitch;
    private final Context context;
    public boolean loggingEnabled;
    public List<Class<? extends hf3>> preferredDeviceList;
    private boolean isActive = false;
    public wls audioDeviceChangeListener = new zbd(18);
    public AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new nh3();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean manageAudioFocus = true;
    private int focusMode = 1;
    private int audioMode = 3;
    private int audioStreamType = 0;
    private int audioAttributeUsageType = 2;
    private int audioAttributeContentType = 1;
    private boolean forceHandleAudioRouting = false;

    public AudioSwitchManager(Context context) {
        this.context = context;
        this.audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        ArrayList arrayList = new ArrayList();
        this.preferredDeviceList = arrayList;
        arrayList.add(df3.class);
        this.preferredDeviceList.add(gf3.class);
        this.preferredDeviceList.add(ff3.class);
        this.preferredDeviceList.add(ef3.class);
        initAudioSwitch();
    }

    private void initAudioSwitch() {
        if (this.audioSwitch == null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new lh3(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableSpeakerphone$7() {
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        kh3Var.h(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initAudioSwitch$2() {
        Context context = this.context;
        boolean z = this.loggingEnabled;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.audioFocusChangeListener;
        List<Class<? extends hf3>> list = this.preferredDeviceList;
        n9f0 n9f0Var = new n9f0(z);
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService == null) {
            ny61.t("null cannot be cast to non-null type android.media.AudioManager");
            return;
        }
        AudioManager audioManager = (AudioManager) systemService;
        kh3 kh3Var = new kh3(context, onAudioFocusChangeListener, new AudioDeviceScanner(audioManager, new Handler(Looper.getMainLooper())), n9f0Var, list, new if3(context, n9f0Var, audioManager, onAudioFocusChangeListener));
        this.audioSwitch = kh3Var;
        kh3Var.A = this.manageAudioFocus;
        int i = this.focusMode;
        if3 if3Var = kh3Var.D;
        if3Var.f = i;
        if3Var.e = this.audioMode;
        if3Var.h = this.audioAttributeContentType;
        if3Var.g = this.audioAttributeUsageType;
        kh3Var.B = this.forceHandleAudioRouting;
        kh3Var.a = this.audioDeviceChangeListener;
        if (v6.a[kh3Var.b.ordinal()] != 1) {
            ((n9f0) kh3Var.C).getClass();
        } else {
            kh3Var.c.start(kh3Var);
            kh3Var.b = AbstractAudioSwitch$State.STARTED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zy11 lambda$new$0(List list, hf3 hf3Var) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$selectAudioOutput$5(Class cls) {
        hf3 hf3Var;
        Iterator<hf3> it = availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                hf3Var = null;
                break;
            } else {
                hf3Var = it.next();
                if (hf3Var.getClass().equals(cls)) {
                    break;
                }
            }
        }
        if (hf3Var != null) {
            kh3 kh3Var = this.audioSwitch;
            Objects.requireNonNull(kh3Var);
            kh3Var.h(hf3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$3() {
        if (this.isActive) {
            return;
        }
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        kh3Var.c();
        this.isActive = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stop$4() {
        if (this.isActive) {
            kh3 kh3Var = this.audioSwitch;
            Objects.requireNonNull(kh3Var);
            if3 if3Var = kh3Var.D;
            if (v6.c[kh3Var.b.ordinal()] == 1) {
                ((n9f0) kh3Var.C).getClass();
                if (kh3Var.y instanceof df3) {
                    if3Var.a(false);
                }
                AudioManager audioManager = if3Var.k;
                AudioManager audioManager2 = if3Var.k;
                audioManager.setMode(if3Var.a);
                audioManager2.setMicrophoneMute(if3Var.b);
                audioManager2.setSpeakerphoneOn(if3Var.c);
                if3Var.l.getClass();
                AudioFocusRequest audioFocusRequest = if3Var.d;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                if3Var.d = null;
                kh3Var.b = AbstractAudioSwitch$State.STARTED;
            }
            this.isActive = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$updatePreferredDeviceList$6() {
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        List<Class<? extends hf3>> list = this.preferredDeviceList;
        if (list.equals(kh3Var.w)) {
            return;
        }
        ConcurrentSkipListSet concurrentSkipListSet = kh3Var.z;
        kh3Var.w = a.d(list);
        ConcurrentSkipListSet concurrentSkipListSet2 = new ConcurrentSkipListSet(new jf3(kh3Var.w, 0));
        kh3Var.z = concurrentSkipListSet2;
        concurrentSkipListSet2.addAll(concurrentSkipListSet);
        ogz ogzVar = kh3Var.C;
        List list2 = kh3Var.w;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        arrayList.toString();
        ((n9f0) ogzVar).getClass();
        a.g(kh3Var, false);
    }

    private void updatePreferredDeviceList(boolean z) {
        ArrayList arrayList = new ArrayList();
        this.preferredDeviceList = arrayList;
        arrayList.add(df3.class);
        this.preferredDeviceList.add(gf3.class);
        List<Class<? extends hf3>> list = this.preferredDeviceList;
        if (z) {
            list.add(ff3.class);
            this.preferredDeviceList.add(ef3.class);
        } else {
            list.add(ef3.class);
            this.preferredDeviceList.add(ff3.class);
        }
        this.handler.post(new lh3(this, 1));
    }

    public List<hf3> availableAudioDevices() {
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        return kotlin.collections.a.J0(kh3Var.z);
    }

    public void clearCommunicationDevice() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.audioManager.clearCommunicationDevice();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void enableSpeakerButPreferBluetooth() {
        hf3 hf3Var;
        Iterator<hf3> it = availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                hf3Var = null;
                break;
            }
            hf3Var = it.next();
            if (hf3Var.getClass().equals(df3.class) || hf3Var.getClass().equals(gf3.class)) {
                break;
            }
        }
        if (hf3Var == null) {
            selectAudioOutput((Class<? extends hf3>) ff3.class);
        } else {
            selectAudioOutput((Class<? extends hf3>) hf3Var.getClass());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        selectAudioOutput((java.lang.Class<? extends defpackage.hf3>) r0.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enableSpeakerphone(boolean z) {
        hf3 hf3Var;
        updatePreferredDeviceList(z);
        if (z) {
            selectAudioOutput((Class<? extends hf3>) ff3.class);
            return;
        }
        Iterator<hf3> it = availableAudioDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                hf3Var = null;
                break;
            }
            hf3Var = it.next();
            if (hf3Var.getClass().equals(df3.class) || hf3Var.getClass().equals(gf3.class) || hf3Var.getClass().equals(ef3.class)) {
                break;
            }
        }
        this.handler.post(new lh3(this, 3));
    }

    public void selectAudioOutput(Class<? extends hf3> cls) {
        this.handler.post(new mh3(0, this, cls));
    }

    public hf3 selectedAudioDevice() {
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        return kh3Var.y;
    }

    public void setAudioAttributesContentType(String str) {
        Integer audioAttributesContentTypeFromString = AudioUtils.getAudioAttributesContentTypeFromString(str);
        if (audioAttributesContentTypeFromString == null) {
            return;
        }
        this.audioAttributeContentType = audioAttributesContentTypeFromString.intValue();
        kh3 kh3Var = this.audioSwitch;
        if (kh3Var != null) {
            Objects.requireNonNull(kh3Var);
            kh3Var.D.h = this.audioAttributeContentType;
        }
    }

    public void setAudioAttributesUsageType(String str) {
        Integer audioAttributesUsageTypeForString = AudioUtils.getAudioAttributesUsageTypeForString(str);
        if (audioAttributesUsageTypeForString == null) {
            return;
        }
        this.audioAttributeUsageType = audioAttributesUsageTypeForString.intValue();
        kh3 kh3Var = this.audioSwitch;
        if (kh3Var != null) {
            Objects.requireNonNull(kh3Var);
            kh3Var.D.g = this.audioAttributeUsageType;
        }
    }

    public void setAudioConfiguration(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        setManageAudioFocus(map.get("manageAudioFocus") instanceof Boolean ? (Boolean) map.get("manageAudioFocus") : null);
        setAudioMode(map.get("androidAudioMode") instanceof String ? (String) map.get("androidAudioMode") : null);
        setFocusMode(map.get("androidAudioFocusMode") instanceof String ? (String) map.get("androidAudioFocusMode") : null);
        setAudioStreamType(map.get("androidAudioStreamType") instanceof String ? (String) map.get("androidAudioStreamType") : null);
        setAudioAttributesUsageType(map.get("androidAudioAttributesUsageType") instanceof String ? (String) map.get("androidAudioAttributesUsageType") : null);
        setAudioAttributesContentType(map.get("androidAudioAttributesContentType") instanceof String ? (String) map.get("androidAudioAttributesContentType") : null);
        setForceHandleAudioRouting(map.get("forceHandleAudioRouting") instanceof Boolean ? (Boolean) map.get("forceHandleAudioRouting") : null);
    }

    public void setAudioMode(String str) {
        Integer audioModeForString = AudioUtils.getAudioModeForString(str);
        if (audioModeForString == null) {
            return;
        }
        this.audioMode = audioModeForString.intValue();
        kh3 kh3Var = this.audioSwitch;
        if (kh3Var != null) {
            Objects.requireNonNull(kh3Var);
            kh3Var.D.e = audioModeForString.intValue();
        }
    }

    public void setAudioStreamType(String str) {
        Integer streamTypeForString = AudioUtils.getStreamTypeForString(str);
        if (streamTypeForString == null) {
            return;
        }
        this.audioStreamType = streamTypeForString.intValue();
        kh3 kh3Var = this.audioSwitch;
        if (kh3Var != null) {
            kh3Var.D.getClass();
        }
    }

    public void setFocusMode(String str) {
        Integer focusModeForString = AudioUtils.getFocusModeForString(str);
        if (focusModeForString == null) {
            return;
        }
        this.focusMode = focusModeForString.intValue();
        kh3 kh3Var = this.audioSwitch;
        if (kh3Var != null) {
            Objects.requireNonNull(kh3Var);
            kh3Var.D.f = focusModeForString.intValue();
        }
    }

    public void setForceHandleAudioRouting(Boolean bool) {
        if (bool == null || this.audioSwitch == null) {
            return;
        }
        this.forceHandleAudioRouting = bool.booleanValue();
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        kh3Var.B = this.forceHandleAudioRouting;
    }

    public void setManageAudioFocus(Boolean bool) {
        if (bool == null || this.audioSwitch == null) {
            return;
        }
        this.manageAudioFocus = bool.booleanValue();
        kh3 kh3Var = this.audioSwitch;
        Objects.requireNonNull(kh3Var);
        kh3Var.A = this.manageAudioFocus;
    }

    public void setMicrophoneMute(boolean z) {
        this.audioManager.setMicrophoneMute(z);
    }

    public void start() {
        if (this.audioSwitch != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new lh3(this, 2));
        }
    }

    public void stop() {
        if (this.audioSwitch != null) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postAtFrontOfQueue(new lh3(this, 4));
        }
    }

    public void selectAudioOutput(AudioDeviceKind audioDeviceKind) {
        if (audioDeviceKind != null) {
            selectAudioOutput(audioDeviceKind.audioDeviceClass);
        }
    }
}
