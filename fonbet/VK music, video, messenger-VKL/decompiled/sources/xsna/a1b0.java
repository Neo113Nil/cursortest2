package xsna;

import android.media.audiofx.Equalizer;
import xsna.z0b0;
import xsna.ztp;

/* compiled from: PlayerEqualizerImpl.kt */
/* loaded from: classes3.dex */
public final class a1b0 implements z0b0 {
    public boolean b;
    public final Equalizer c;

    public a1b0(int i, boolean z, ztp ztpVar) {
        Equalizer equalizer;
        try {
            equalizer = new Equalizer(1000, i);
            equalizer.setEnabled(z);
        } catch (RuntimeException e) {
            bn40.c(e, new Object[0]);
            equalizer = null;
        }
        this.c = equalizer;
        i(ztpVar);
    }

    @Override // xsna.z0b0
    public final void a(short s, short s2) {
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null) {
                equalizer.setBandLevel(s, s2);
            }
        } catch (RuntimeException e) {
            release();
            bn40.c(e, new Object[0]);
        }
    }

    @Override // xsna.z0b0
    public final void b(ztp ztpVar) {
        if (c()) {
            boolean z = false;
            try {
                Equalizer equalizer = this.c;
                if (equalizer != null) {
                    z = equalizer.getEnabled();
                }
            } catch (RuntimeException e) {
                bn40.a(e, new Object[0]);
            }
            if (!z) {
                setEnabled(true);
            }
            i(ztpVar);
        }
    }

    @Override // xsna.z0b0
    public final boolean c() {
        return (this.c == null || this.b) ? false : true;
    }

    @Override // xsna.z0b0
    public final short[] d() {
        short[] bandLevelRange;
        z0b0.a aVar = z0b0.a;
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null && (bandLevelRange = equalizer.getBandLevelRange()) != null) {
                return bandLevelRange;
            }
            aVar.getClass();
            return z0b0.a.b;
        } catch (RuntimeException e) {
            release();
            bn40.c(e, new Object[0]);
            aVar.getClass();
            return z0b0.a.b;
        }
    }

    @Override // xsna.z0b0
    public final int e(short s) {
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null) {
                return equalizer.getCenterFreq(s);
            }
            return 0;
        } catch (RuntimeException e) {
            release();
            bn40.c(e, new Object[0]);
            return 0;
        }
    }

    @Override // xsna.z0b0
    public final int[] f(short s) {
        int[] bandFreqRange;
        z0b0.a aVar = z0b0.a;
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null && (bandFreqRange = equalizer.getBandFreqRange(s)) != null) {
                return bandFreqRange;
            }
            aVar.getClass();
            return z0b0.a.c;
        } catch (RuntimeException e) {
            release();
            bn40.c(e, new Object[0]);
            aVar.getClass();
            return z0b0.a.c;
        }
    }

    @Override // xsna.z0b0
    public final short g() {
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null) {
                return equalizer.getNumberOfBands();
            }
            return (short) 5;
        } catch (RuntimeException e) {
            release();
            bn40.a(e, new Object[0]);
            return (short) 5;
        }
    }

    @Override // xsna.z0b0
    public final short h(short s) {
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null) {
                return equalizer.getBandLevel(s);
            }
            return (short) 0;
        } catch (RuntimeException e) {
            release();
            bn40.c(e, new Object[0]);
            return (short) 0;
        }
    }

    public final void i(ztp ztpVar) {
        if (c()) {
            short[] d = d();
            short g = g();
            boolean z = ztpVar instanceof ztp.g;
            if (!z || ((short) ((ztp.g) ztpVar).d.size()) == g) {
                for (int i = 0; i < g; i++) {
                    if (z) {
                        a((short) i, ((ztp.g) ztpVar).d.get(i).shortValue());
                    } else {
                        short s = (short) i;
                        int[] f = f(s);
                        a(s, ztpVar.a(f[0], f[1], d[0], d[1]));
                    }
                }
            }
        }
    }

    @Override // xsna.z0b0
    public final void release() {
        this.b = true;
        Equalizer equalizer = this.c;
        if (equalizer != null) {
            equalizer.release();
        }
    }

    @Override // xsna.z0b0
    public final void setEnabled(boolean z) {
        try {
            Equalizer equalizer = this.c;
            if (equalizer != null) {
                equalizer.setEnabled(z);
            }
        } catch (RuntimeException e) {
            bn40.c(e, new Object[0]);
        }
    }
}
