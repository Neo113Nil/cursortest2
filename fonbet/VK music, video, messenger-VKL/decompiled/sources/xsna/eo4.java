package xsna;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import xsna.no4;

/* compiled from: AudioFocusManager.java */
/* loaded from: classes12.dex */
public final class eo4 {
    public final zhn0<AudioManager> a;
    public final Handler b;

    @Nullable
    public androidx.media3.exoplayer.d c;

    @Nullable
    public nc4 d;
    public int f;
    public no4 h;
    public float g = 1.0f;
    public int e = 0;

    public eo4(final Context context, Looper looper, androidx.media3.exoplayer.d dVar) {
        this.a = fin0.a(new zhn0() { // from class: xsna.co4
            @Override // xsna.zhn0
            public final Object get() {
                return hq4.a(context);
            }
        });
        this.c = dVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        androidx.media3.exoplayer.d dVar = this.c;
        if (dVar != null) {
            dVar.i.obtainMessage(33, i, 0).b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        androidx.media3.exoplayer.d dVar = this.c;
        if (dVar != null) {
            dVar.i.sendEmptyMessage(34);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [xsna.bo4] */
    public final int d(int i, boolean z) {
        int i2;
        no4.a aVar;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z) {
            int i3 = this.e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            no4 no4Var = this.h;
            if (no4Var == null) {
                if (no4Var == null) {
                    aVar = new no4.a();
                    aVar.b = nc4.c;
                    aVar.a = i2;
                } else {
                    no4.a aVar2 = new no4.a();
                    aVar2.a = no4Var.a;
                    aVar2.b = no4Var.d;
                    aVar2.c = no4Var.e;
                    aVar = aVar2;
                }
                nc4 nc4Var = this.d;
                nc4Var.getClass();
                aVar.b = nc4Var;
                aVar.c = false;
                ?? r6 = new AudioManager.OnAudioFocusChangeListener() { // from class: xsna.bo4
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        eo4 eo4Var = eo4.this;
                        eo4Var.getClass();
                        if (i4 == -3 || i4 == -2) {
                            if (i4 != -2) {
                                eo4Var.c(4);
                                return;
                            } else {
                                eo4Var.b(0);
                                eo4Var.c(3);
                                return;
                            }
                        }
                        if (i4 == -1) {
                            eo4Var.b(-1);
                            eo4Var.a();
                            eo4Var.c(1);
                        } else if (i4 != 1) {
                            sn.d(i4, "Unknown focus change type: ");
                        } else {
                            eo4Var.c(2);
                            eo4Var.b(1);
                        }
                    }
                };
                Handler handler = this.b;
                handler.getClass();
                this.h = new no4(aVar.a, r6, handler, aVar.b, aVar.c);
            }
            AudioManager audioManager = this.a.get();
            AudioFocusRequest audioFocusRequest = this.h.f;
            audioFocusRequest.getClass();
            if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
