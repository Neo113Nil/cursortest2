package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import defpackage.bh3;
import defpackage.ddf;
import defpackage.ny61;
import defpackage.tw21;
import defpackage.ue3;
import defpackage.unr0;
import defpackage.v8e;
import defpackage.ye3;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class a {
    public final Context a;
    public final v8e b;
    public final Handler c;
    public final AudioCapabilitiesReceiver$AudioDeviceCallbackV23 d;
    public final BroadcastReceiver e;
    public final AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver f;
    public ye3 g;
    public ddf h;
    public ue3 i;
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, v8e v8eVar, ue3 ue3Var, ddf ddfVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = v8eVar;
        this.i = ue3Var;
        this.h = ddfVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Handler o = tw21.o(null);
        this.c = o;
        this.d = tw21.a >= 23 ? new AudioCapabilitiesReceiver$AudioDeviceCallbackV23(this) : null;
        this.e = new AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(this);
        ye3 ye3Var = ye3.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver(this, o, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(ye3 ye3Var) {
        if (!this.j || ye3Var.equals(this.g)) {
            return;
        }
        this.g = ye3Var;
        c cVar = (c) this.b.b;
        Looper myLooper = Looper.myLooper();
        Looper looper = cVar.g0;
        if (looper != myLooper) {
            ny61.r(unr0.p("Current looper (", myLooper != null ? myLooper.getThread().getName() : "null", ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), Extension.C_BRAKE));
            return;
        }
        ye3 ye3Var2 = cVar.x;
        if (ye3Var2 == null || ye3Var.equals(ye3Var2)) {
            return;
        }
        cVar.x = ye3Var;
        bh3 bh3Var = cVar.s;
        if (bh3Var != null) {
            bh3Var.t();
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        ddf ddfVar = this.h;
        if (Objects.equals(audioDeviceInfo, ddfVar == null ? null : (AudioDeviceInfo) ddfVar.b)) {
            return;
        }
        ddf ddfVar2 = audioDeviceInfo != null ? new ddf(22, audioDeviceInfo) : null;
        this.h = ddfVar2;
        a(ye3.b(this.a, this.i, ddfVar2));
    }
}
