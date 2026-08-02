package androidx.camera.video.internal.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import androidx.camera.video.internal.BufferProvider$State;
import defpackage.d6z;
import defpackage.dzn;
import defpackage.eh3;
import defpackage.euy;
import defpackage.fh3;
import defpackage.fq6;
import defpackage.fzn;
import defpackage.gl7;
import defpackage.hcs0;
import defpackage.hq6;
import defpackage.hsj0;
import defpackage.jg;
import defpackage.jh3;
import defpackage.m34;
import defpackage.ni91;
import defpackage.o8g0;
import defpackage.rg3;
import defpackage.sgb1;
import defpackage.x4e;
import defpackage.ymu;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class d {
    public final androidx.camera.core.impl.utils.executor.b a;
    public final hq6 d;
    public final hcs0 e;
    public final long f;
    public boolean i;
    public Executor j;
    public o8g0 k;
    public fzn l;
    public ymu m;
    public eh3 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public final int v;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public AudioSource$InternalState g = AudioSource$InternalState.CONFIGURED;
    public BufferProvider$State h = BufferProvider$State.INACTIVE;
    public long u = 0;

    public d(m34 m34Var, Executor executor, Context context) {
        final androidx.camera.core.impl.utils.executor.b bVar = new androidx.camera.core.impl.utils.executor.b(executor);
        this.a = bVar;
        this.f = 3000000000L;
        try {
            final hq6 hq6Var = new hq6(new jh3(m34Var, context), m34Var);
            this.d = hq6Var;
            final fh3 fh3Var = new fh3(this);
            d6z.y("AudioStream can not be started when setCallback.", !hq6Var.a.get());
            hq6Var.a();
            hq6Var.w.execute(new Runnable() { // from class: androidx.camera.video.internal.audio.e
                @Override // java.lang.Runnable
                public final void run() {
                    final jh3 jh3Var = hq6.this.z;
                    d6z.y("AudioStream can not be started when setCallback.", !jh3Var.w.get());
                    jh3Var.a();
                    jh3Var.A = fh3Var;
                    androidx.camera.core.impl.utils.executor.b bVar2 = bVar;
                    jh3Var.B = bVar2;
                    AudioManager.AudioRecordingCallback audioRecordingCallback = jh3Var.D;
                    if (audioRecordingCallback != null) {
                        jh3Var.a.unregisterAudioRecordingCallback(audioRecordingCallback);
                    }
                    if (jh3Var.D == null) {
                        jh3Var.D = new AudioManager.AudioRecordingCallback() { // from class: androidx.camera.video.internal.audio.AudioStreamImpl$AudioRecordingApi29Callback
                            @Override // android.media.AudioManager.AudioRecordingCallback
                            public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
                                for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                                    if (audioRecordingConfiguration.getClientAudioSessionId() == jh3.this.a.getAudioSessionId()) {
                                        jh3.this.c(audioRecordingConfiguration.isClientSilenced());
                                        return;
                                    }
                                }
                            }
                        };
                    }
                    jh3Var.a.registerAudioRecordingCallback(bVar2, jh3Var.D);
                }
            });
            this.e = new hcs0(m34Var);
            this.v = m34Var.e;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    public final void a() {
        Executor executor = this.j;
        o8g0 o8g0Var = this.k;
        if (executor == null || o8g0Var == null) {
            return;
        }
        int i = 1;
        boolean z = this.r || this.o || this.q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new rg3(o8g0Var, z, i));
    }

    public final void b(fzn fznVar) {
        fzn fznVar2 = this.l;
        BufferProvider$State bufferProvider$State = null;
        if (fznVar2 != null) {
            eh3 eh3Var = this.n;
            Objects.requireNonNull(eh3Var);
            fznVar2.a(eh3Var);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = BufferProvider$State.INACTIVE;
            f();
        }
        if (fznVar != null) {
            this.l = fznVar;
            this.n = new eh3(this, fznVar);
            this.m = new ymu((Object) this, (Object) fznVar, false, 15);
            try {
                euy c = fznVar.c();
                if (((gl7) c).b.isDone()) {
                    bufferProvider$State = (BufferProvider$State) ((gl7) c).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (bufferProvider$State != null) {
                this.h = bufferProvider$State;
                f();
            }
            this.l.b(this.a, this.n);
        }
    }

    public final void c() {
        fzn fznVar = this.l;
        Objects.requireNonNull(fznVar);
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            fznVar.d.i.execute(new dzn(fznVar, bVar, 1));
            bVar.a = "acquireBuffer";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        ymu ymuVar = this.m;
        Objects.requireNonNull(ymuVar);
        ni91.a(gl7Var, ymuVar, this.a);
    }

    public final void d(AudioSource$InternalState audioSource$InternalState) {
        Objects.toString(this.g);
        Objects.toString(audioSource$InternalState);
        sgb1.g(3, "AudioSource");
        this.g = audioSource$InternalState;
    }

    public final void e() {
        if (this.i) {
            int i = 0;
            this.i = false;
            sgb1.g(3, "AudioSource");
            hq6 hq6Var = this.d;
            hq6Var.a();
            if (hq6Var.a.getAndSet(false)) {
                hq6Var.w.execute(new fq6(hq6Var, i));
            }
        }
    }

    public final void f() {
        if (this.g != AudioSource$InternalState.STARTED) {
            e();
            return;
        }
        boolean z = this.h == BufferProvider$State.ACTIVE;
        boolean z2 = !z;
        Executor executor = this.j;
        o8g0 o8g0Var = this.k;
        if (executor != null && o8g0Var != null && this.c.getAndSet(z2) != z2) {
            executor.execute(new jg(o8g0Var, z2));
        }
        if (!z) {
            e();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            sgb1.g(3, "AudioSource");
            this.d.c();
            this.o = false;
        } catch (AudioStream$AudioStreamException unused) {
            sgb1.g(5, "AudioSource");
            this.o = true;
            hcs0 hcs0Var = this.e;
            hcs0Var.a();
            if (!((AtomicBoolean) hcs0Var.w).getAndSet(true)) {
                hcs0Var.a = System.nanoTime();
            }
            this.p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}
