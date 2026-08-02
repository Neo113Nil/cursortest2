package xsna;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: AudioFocusManagerImplSinceApi26.kt */
@TargetApi(26)
/* loaded from: classes.dex */
public final class io4 implements AudioManager.OnAudioFocusChangeListener {
    public final Context b;
    public final boolean c;
    public AudioFocusRequest f;
    public int h;
    public final bpn0 d = new bpn0(new ho4(this, 0));
    public final LinkedHashMap e = new LinkedHashMap();
    public final CopyOnWriteArraySet<do4> g = new CopyOnWriteArraySet<>();

    /* compiled from: AudioFocusManagerImplSinceApi26.kt */
    /* loaded from: classes15.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<do4> it = io4.this.g.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Throwable th) {
                    bpn0 bpn0Var = oro0.a;
                    oro0.a(new sc2(th, 10));
                }
            }
        }
    }

    /* compiled from: AudioFocusManagerImplSinceApi26.kt */
    /* loaded from: classes15.dex */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<do4> it = io4.this.g.iterator();
            while (it.hasNext()) {
                try {
                    it.next().d();
                } catch (Throwable th) {
                    bpn0 bpn0Var = oro0.a;
                    oro0.a(new sc2(th, 10));
                }
            }
        }
    }

    /* compiled from: AudioFocusManagerImplSinceApi26.kt */
    /* loaded from: classes15.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<do4> it = io4.this.g.iterator();
            while (it.hasNext()) {
                try {
                    it.next().b();
                } catch (Throwable th) {
                    bpn0 bpn0Var = oro0.a;
                    oro0.a(new sc2(th, 10));
                }
            }
        }
    }

    /* compiled from: AudioFocusManagerImplSinceApi26.kt */
    /* loaded from: classes15.dex */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator<do4> it = io4.this.g.iterator();
            while (it.hasNext()) {
                try {
                    it.next().c();
                } catch (Throwable th) {
                    bpn0 bpn0Var = oro0.a;
                    oro0.a(new sc2(th, 10));
                }
            }
        }
    }

    public io4(Context context, boolean z) {
        this.b = context;
        this.c = z;
    }

    public final synchronized void a(int i) {
        try {
            if (this.h == i) {
                return;
            }
            this.h = i;
            if (i > 0) {
                oro0.a(new a());
            } else if (i == -2) {
                oro0.a(new b());
            } else if (i == -3) {
                oro0.a(new c());
            } else {
                oro0.a(new d());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final AudioFocusRequest b(int i) {
        AudioFocusRequest build;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.e;
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) linkedHashMap.get(valueOf);
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        if (this.c) {
            build = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build()).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(false).build();
        } else {
            build = new AudioFocusRequest.Builder(i).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).setAcceptsDelayedFocusGain(false).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(this).build();
        }
        linkedHashMap.put(Integer.valueOf(i), build);
        return build;
    }

    public final synchronized boolean c() {
        return this.h > 0;
    }

    public final synchronized boolean d(int i) {
        AudioFocusRequest audioFocusRequest;
        try {
            if (this.h <= 0 || (audioFocusRequest = this.f) == null || audioFocusRequest.getFocusGain() != i) {
                this.f = b(i);
                if (((AudioManager) this.d.getValue()).requestAudioFocus(this.f) == 1) {
                    a(2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h > 0;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        a(i);
    }
}
