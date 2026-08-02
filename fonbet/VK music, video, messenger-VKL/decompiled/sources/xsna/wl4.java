package xsna;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.AudioOutputProvider;

/* compiled from: AudioCapabilitiesReceiver.java */
/* loaded from: classes12.dex */
public final class wl4 {
    public final Context a;
    public final ed b;
    public final Handler c;
    public final a d;
    public final c e;

    @Nullable
    public final b f;

    @Nullable
    public vl4 g;

    @Nullable
    public AudioDeviceInfo h;
    public nc4 i;
    public boolean j;

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class a extends AudioDeviceCallback {
        public a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            wl4 wl4Var = wl4.this;
            wl4Var.a(vl4.c(wl4Var.a, wl4Var.i, wl4Var.h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            wl4 wl4Var = wl4.this;
            if (y2r0.m(audioDeviceInfoArr, wl4Var.h)) {
                wl4Var.h = null;
            }
            wl4Var.a(vl4.c(wl4Var.a, wl4Var.i, wl4Var.h));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class b extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            wl4 wl4Var = wl4.this;
            wl4Var.a(vl4.c(wl4Var.a, wl4Var.i, wl4Var.h));
        }
    }

    /* compiled from: AudioCapabilitiesReceiver.java */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            wl4 wl4Var = wl4.this;
            wl4Var.a(vl4.b(context, intent, wl4Var.i, wl4Var.h));
        }
    }

    public wl4(Context context, ed edVar, nc4 nc4Var, @Nullable AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = edVar;
        this.i = nc4Var;
        this.h = audioDeviceInfo;
        Handler p = y2r0.p(null);
        this.c = p;
        this.d = new a();
        this.e = new c();
        vl4 vl4Var = vl4.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new b(p, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(vl4 vl4Var) {
        if (!this.j || vl4Var.equals(this.g)) {
            return;
        }
        this.g = vl4Var;
        androidx.media3.exoplayer.audio.c cVar = (androidx.media3.exoplayer.audio.c) this.b.c;
        cVar.b();
        vl4 vl4Var2 = cVar.g;
        if (vl4Var2 == null || vl4Var.equals(vl4Var2)) {
            return;
        }
        cVar.g = vl4Var;
        ihz<AudioOutputProvider.c> ihzVar = cVar.e;
        if (ihzVar != null) {
            ihzVar.f(-1, new pn(6));
        }
    }
}
