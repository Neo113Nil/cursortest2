package xsna;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicPlayerAudioFocusManager.kt */
/* loaded from: classes3.dex */
public final class xv40 extends hs6 {
    public final go4 c;
    public xza0 d;
    public xza0 e;
    public boolean i;
    public boolean j;
    public final float f = 1.0f;
    public boolean g = true;
    public float h = -1.0f;
    public final ou5 k = new ou5(this, 7);
    public final Object l = msy.a(LazyThreadSafetyMode.NONE, new y3i(this, 29));

    public xv40(go4 go4Var) {
        this.c = go4Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Context context) {
        L.p(new Object[0]);
        if (!gz80.a(26)) {
            ((AudioManager) context.getSystemService("audio")).abandonAudioFocus(this);
            return;
        }
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.l.getValue();
        if (audioFocusRequest != null) {
            ((AudioManager) context.getSystemService("audio")).abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void b(int i) {
        boolean z = i == -2;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{zhy0.a("isTransientLost=", z)});
        }
        this.b.removeCallbacks(this.k);
        if (this.g) {
            xza0 xza0Var = this.e;
            this.i = (xza0Var != null && xza0Var.m(null, 3, true, z)) || this.i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r3.intValue() == 1) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context) {
        Integer valueOf;
        L.p(new Object[0]);
        if (gz80.a(26)) {
            AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.l.getValue();
            valueOf = audioFocusRequest != null ? Integer.valueOf(((AudioManager) context.getSystemService("audio")).requestAudioFocus(audioFocusRequest)) : null;
        } else {
            valueOf = Integer.valueOf(((AudioManager) context.getSystemService("audio")).requestAudioFocus(this, 3, this.c.getRequestType()));
        }
        int i = valueOf != null ? 1 : -1;
        onAudioFocusChange(i);
    }

    public final void d(xza0 xza0Var) {
        if (xza0Var == null) {
            this.d = null;
        } else if (this.d == null) {
            this.d = xza0Var;
        }
        this.e = xza0Var;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        Handler handler = this.b;
        if (i == -3) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"Audio focus loss can duck"});
            }
            handler.post(new xab(this, 6));
            return;
        }
        if (i == -2 || i == -1) {
            handler.post(new tmf(this, i, 1));
            return;
        }
        if (i != 1) {
            return;
        }
        if (this.j) {
            this.j = false;
        } else {
            handler.postDelayed(this.k, 1500L);
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.i, new Object[]{"Audio focus gain"});
    }
}
