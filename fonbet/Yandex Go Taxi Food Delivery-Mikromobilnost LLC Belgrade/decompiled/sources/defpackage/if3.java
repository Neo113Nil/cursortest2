package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* loaded from: classes11.dex */
public final class if3 {
    public int a;
    public boolean b;
    public boolean c;
    public AudioFocusRequest d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final Context i;
    public final n9f0 j;
    public final AudioManager k;
    public final gs6 l;
    public final zf3 m;
    public final AudioManager.OnAudioFocusChangeListener n;

    public if3(Context context, n9f0 n9f0Var, AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        gs6 gs6Var = new gs6();
        zf3 zf3Var = new zf3();
        this.i = context;
        this.j = n9f0Var;
        this.k = audioManager;
        this.l = gs6Var;
        this.m = zf3Var;
        this.n = onAudioFocusChangeListener;
        this.e = 3;
        this.f = 2;
        this.g = 2;
        this.h = 1;
    }

    public final void a(boolean z) {
        AudioManager audioManager = this.k;
        if (z) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }
}
