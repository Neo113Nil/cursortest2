package com.ryanheise.audio_session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import defpackage.dg3;
import defpackage.ny61;
import defpackage.o72;
import defpackage.oyr;
import defpackage.p72;
import defpackage.qke;
import defpackage.ryh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public final class a {
    public ArrayList a;
    public androidx.media.a b;
    public BroadcastReceiver c;
    public BroadcastReceiver d;
    public Context e;
    public AudioManager f;
    public Object g;
    public List h;

    public final boolean a() {
        Context context;
        Context context2 = this.e;
        if (context2 != null) {
            BroadcastReceiver broadcastReceiver = this.c;
            if (broadcastReceiver != null) {
                context2.unregisterReceiver(broadcastReceiver);
                this.c = null;
            }
            BroadcastReceiver broadcastReceiver2 = this.d;
            if (broadcastReceiver2 != null && (context = this.e) != null) {
                context.unregisterReceiver(broadcastReceiver2);
                this.d = null;
            }
            androidx.media.a aVar = this.b;
            if (aVar != null) {
                AudioManager audioManager = this.f;
                if (audioManager == null) {
                    ny61.g("AudioManager must not be null");
                    return false;
                }
                int a = dg3.a(audioManager, aVar.f);
                this.b = null;
                if (a == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b(Map map) {
        Object obj = map.get("downTime");
        long longValue = ((obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue())).longValue();
        Object obj2 = map.get("eventTime");
        this.f.dispatchMediaKeyEvent(new KeyEvent(longValue, ((obj2 == null || (obj2 instanceof Long)) ? (Long) obj2 : Long.valueOf(((Integer) obj2).intValue())).longValue(), ((Integer) map.get("action")).intValue(), ((Integer) map.get("keyCode")).intValue(), ((Integer) map.get("repeatCount")).intValue(), ((Integer) map.get("metaState")).intValue(), ((Integer) map.get("deviceId")).intValue(), ((Integer) map.get("scanCode")).intValue(), ((Integer) map.get("flags")).intValue(), ((Integer) map.get("source")).intValue()));
    }

    public final ArrayList c(int i) {
        p72.e(23);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : this.f.getDevices(i)) {
            arrayList.add(p72.d("id", Integer.valueOf(audioDeviceInfo.getId()), "productName", audioDeviceInfo.getProductName(), "address", audioDeviceInfo.getAddress(), "isSource", Boolean.valueOf(audioDeviceInfo.isSource()), "isSink", Boolean.valueOf(audioDeviceInfo.isSink()), "sampleRates", p72.c(audioDeviceInfo.getSampleRates()), "channelMasks", p72.c(audioDeviceInfo.getChannelMasks()), "channelIndexMasks", p72.c(audioDeviceInfo.getChannelIndexMasks()), "channelCounts", p72.c(audioDeviceInfo.getChannelCounts()), "encodings", p72.c(audioDeviceInfo.getEncodings()), "type", Integer.valueOf(audioDeviceInfo.getType())));
        }
        return arrayList;
    }

    public final ArrayList d() {
        p72.e(28);
        ArrayList arrayList = new ArrayList();
        for (MicrophoneInfo microphoneInfo : this.f.getMicrophones()) {
            ArrayList arrayList2 = new ArrayList();
            for (Pair<Float, Float> pair : microphoneInfo.getFrequencyResponse()) {
                arrayList2.add(new ArrayList(Arrays.asList(Double.valueOf(((Float) pair.first).floatValue()), Double.valueOf(((Float) pair.second).floatValue()))));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Pair<Integer, Integer> pair2 : microphoneInfo.getChannelMapping()) {
                arrayList3.add(new ArrayList(Arrays.asList((Integer) pair2.first, (Integer) pair2.second)));
            }
            arrayList.add(p72.d(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, microphoneInfo.getDescription(), "id", Integer.valueOf(microphoneInfo.getId()), "type", Integer.valueOf(microphoneInfo.getType()), "address", microphoneInfo.getAddress(), "location", Integer.valueOf(microphoneInfo.getLocation()), "group", Integer.valueOf(microphoneInfo.getGroup()), "indexInTheGroup", Integer.valueOf(microphoneInfo.getIndexInTheGroup()), "position", p72.a(microphoneInfo.getPosition()), "orientation", p72.a(microphoneInfo.getOrientation()), "frequencyResponse", arrayList2, "channelMapping", arrayList3, "sensitivity", Float.valueOf(microphoneInfo.getSensitivity()), "maxSpl", Float.valueOf(microphoneInfo.getMaxSpl()), "minSpl", Float.valueOf(microphoneInfo.getMinSpl()), "directionality", Integer.valueOf(microphoneInfo.getDirectionality())));
        }
        return arrayList;
    }

    public final void e(String str, Object... objArr) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            p72 p72Var = (p72) it.next();
            p72Var.a.a(str, new ArrayList(Arrays.asList(objArr)), null);
        }
    }

    public final boolean f(List list) {
        if (this.b != null) {
            return true;
        }
        Map map = (Map) list.get(0);
        int intValue = ((Integer) map.get("gainType")).intValue();
        AudioAttributesCompat audioAttributesCompat = androidx.media.a.g;
        if (intValue != 1 && intValue != 2 && intValue != 3 && intValue != 4) {
            ny61.g(oyr.i(intValue, "Illegal audio focus gain type "));
            return false;
        }
        o72 o72Var = new o72(0, this);
        Handler handler = new Handler(Looper.getMainLooper());
        if (map.get("audioAttributes") != null) {
            Map map2 = (Map) map.get("audioAttributes");
            AudioAttributesCompat.a aVar = new AudioAttributesCompat.a();
            Object obj = map2.get("contentType");
            ryh ryhVar = aVar.a;
            if (obj != null) {
                ((AudioAttributes.Builder) ryhVar.b).setContentType(((Integer) map2.get("contentType")).intValue());
            }
            if (map2.get("flags") != null) {
                ((AudioAttributes.Builder) ryhVar.b).setFlags(((Integer) map2.get("flags")).intValue());
            }
            if (map2.get("usage") != null) {
                ((AudioAttributes.Builder) ryhVar.b).setUsage(((Integer) map2.get("usage")).intValue());
            }
            audioAttributesCompat = aVar.a();
        }
        androidx.media.a aVar2 = new androidx.media.a(intValue, o72Var, handler, audioAttributesCompat, map.get("willPauseWhenDucked") != null ? ((Boolean) map.get("willPauseWhenDucked")).booleanValue() : false);
        this.b = aVar2;
        AudioManager audioManager = this.f;
        if (audioManager == null) {
            ny61.g("AudioManager must not be null");
            return false;
        }
        boolean z = dg3.b(audioManager, aVar2.f) == 1;
        if (z) {
            if (this.c == null) {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ryanheise.audio_session.AndroidAudioManager$Singleton$2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                            a.this.e("onBecomingNoisy", new Object[0]);
                        }
                    }
                };
                this.c = broadcastReceiver;
                qke.z(this.e, broadcastReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
            }
            if (this.d == null) {
                BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: com.ryanheise.audio_session.AndroidAudioManager$Singleton$3
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        a.this.e("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                    }
                };
                this.d = broadcastReceiver2;
                qke.z(this.e, broadcastReceiver2, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
            }
        }
        return z;
    }
}
