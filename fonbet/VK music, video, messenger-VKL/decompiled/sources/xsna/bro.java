package xsna;

import android.media.audiofx.DynamicsProcessing;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.audioeffect.a;
import com.vk.music.player.api.helper.AudioPlayer;

/* compiled from: DynamicsProcessingWrapper.kt */
/* loaded from: classes3.dex */
public final class bro {
    public final int a;
    public final com.vk.music.audioeffect.a b;
    public float c;
    public AudioPlayer.State d;
    public boolean e;
    public int f;
    public final hpj g;
    public yok0 h;
    public DynamicsProcessing i;
    public final DynamicsProcessing.Eq j;

    public bro(int i, com.vk.music.audioeffect.a aVar) {
        this.a = i;
        this.b = aVar;
        bdn bdnVar = bdn.a;
        this.g = zvj.a(ie00.a.U().plus(whn0.a()));
        com.vk.music.audioeffect.a.a.getClass();
        this.j = new DynamicsProcessing.Eq(true, false, a.C1320a.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        DynamicsProcessing b;
        if (this.e) {
            com.vk.music.audioeffect.a aVar = this.b;
            if (((Boolean) aVar.c().b.getValue()).booleanValue() || ((Boolean) aVar.a().b.getValue()).booleanValue()) {
                z = true;
                b = b();
                if (b != null) {
                    b.setEnabled(z);
                }
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{zhy0.a("dynamicsProcessing.enabled = ", z)});
                    return;
                }
                return;
            }
        }
        z = false;
        b = b();
        if (b != null) {
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
        }
    }

    public final DynamicsProcessing b() {
        int i = this.a;
        if (this.i == null) {
            try {
                com.vk.music.audioeffect.a.a.getClass();
                DynamicsProcessing dynamicsProcessing = new DynamicsProcessing(1000, i, new DynamicsProcessing.Config.Builder(0, 2, true, a.C1320a.c, false, 0, false, 0, false).build());
                dynamicsProcessing.setEnabled(false);
                myc0.h(this.g, null, null, new zqo(this, dynamicsProcessing, null), 3);
                this.i = dynamicsProcessing;
            } catch (Throwable th) {
                d("init", th);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"DynamicsProcessingWrapper", "Failed to create DynamicsProcessing for audioSessionId=" + i + " with " + th});
                }
            }
        }
        return this.i;
    }

    public final void c(float f) {
        this.c = f;
        if (((Boolean) this.b.c().b.getValue()).booleanValue()) {
            L l = L.a;
            l.getClass();
            boolean m = L.m(LoggerOutputTarget.NONE);
            int i = this.a;
            if (!m) {
                L.u(l, L.LogType.i, new Object[]{"Loudness normalization: audioSessionId=" + i + ", " + this.c});
            }
            try {
                a();
                DynamicsProcessing b = b();
                if (b != null) {
                    b.setInputGainAllChannelsTo(this.c);
                }
            } catch (Throwable th) {
                d("loudnessCorrection", th);
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l2, L.LogType.e, new Object[]{"DynamicsProcessingWrapper", "Failed to do operation in DynamicsProcessing for audioSessionId=" + i + " with " + th});
            }
        }
    }

    public final void d(String str, Throwable th) {
        this.f++;
        float f = this.c;
        DynamicsProcessing b = b();
        new ip40(th, this.a, f, b != null && b.getEnabled(), str, this.d, this.f).q();
    }
}
