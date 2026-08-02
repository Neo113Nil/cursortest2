package yads;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class yk {
    public final AudioManager a;
    public final wk b;
    public xk c;
    public pk d;
    public int f;
    public AudioFocusRequest h;
    public float g = 1.0f;
    public int e = 0;

    public yk(Context context, Handler handler, xn0 xn0Var) {
        this.a = (AudioManager) ni.a(context.getApplicationContext().getSystemService("audio"));
        this.c = xn0Var;
        this.b = new wk(this, handler);
    }

    public final void a() {
        if (this.e == 0) {
            return;
        }
        if (mc3.a >= 26) {
            AudioFocusRequest audioFocusRequest = this.h;
            if (audioFocusRequest != null) {
                this.a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.a.abandonAudioFocus(this.b);
        }
        b(0);
    }

    public final void b() {
        if (mc3.a(this.d, (Object) null)) {
            return;
        }
        this.d = null;
        this.f = 0;
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        xk xkVar = this.c;
        if (xkVar != null) {
            ao0 ao0Var = ((xn0) xkVar).a;
            ao0Var.a(1, 2, Float.valueOf(ao0Var.T * ao0Var.v.g));
        }
    }

    public final void a(int i) {
        xk xkVar = this.c;
        if (xkVar != null) {
            xn0 xn0Var = (xn0) xkVar;
            ao0 ao0Var = xn0Var.a;
            ao0Var.r();
            boolean z = ao0Var.Z.l;
            ao0 ao0Var2 = xn0Var.a;
            int i2 = 1;
            if (z && i != 1) {
                i2 = 2;
            }
            ao0Var2.a(i, i2, z);
        }
    }

    public final int a(boolean z, int i) {
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        if (i == 1 || this.f != 1) {
            a();
            return z ? 1 : -1;
        }
        if (z) {
            if (this.e == 1) {
                return 1;
            }
            if (mc3.a >= 26) {
                AudioFocusRequest audioFocusRequest = this.h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        builder = new AudioFocusRequest.Builder(this.f);
                    } else {
                        builder = new AudioFocusRequest.Builder(this.h);
                    }
                    pk pkVar = this.d;
                    boolean z2 = pkVar != null && pkVar.b == 1;
                    pkVar.getClass();
                    if (pkVar.g == null) {
                        pkVar.g = new ok(pkVar);
                    }
                    this.h = builder.setAudioAttributes(pkVar.g.a).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.b).build();
                }
                requestAudioFocus = this.a.requestAudioFocus(this.h);
            } else {
                AudioManager audioManager = this.a;
                wk wkVar = this.b;
                pk pkVar2 = this.d;
                pkVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(wkVar, mc3.c(pkVar2.d), this.f);
            }
            if (requestAudioFocus == 1) {
                b(1);
                return 1;
            }
            b(0);
        }
        return -1;
    }
}
