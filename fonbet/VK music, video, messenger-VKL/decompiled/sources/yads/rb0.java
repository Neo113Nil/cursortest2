package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes10.dex */
public final class rb0 {
    public final nx0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final bl[] i;

    public rb0(nx0 nx0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, bl[] blVarArr) {
        this.a = nx0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = blVarArr;
    }

    public final AudioTrack a(boolean z, pk pkVar, int i) {
        try {
            AudioTrack b = b(z, pkVar, i);
            int state = b.getState();
            if (state == 1) {
                return b;
            }
            try {
                b.release();
            } catch (Exception unused) {
            }
            throw new fl(state, this.e, this.f, this.h, this.a, this.c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new fl(0, this.e, this.f, this.h, this.a, this.c == 1, e);
        }
    }

    public final AudioTrack b(boolean z, pk pkVar, int i) {
        AudioAttributes audioAttributes;
        AudioAttributes audioAttributes2;
        AudioTrack.Builder offloadedPlayback;
        int i2 = mc3.a;
        if (i2 >= 29) {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build();
            if (z) {
                audioAttributes2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (pkVar.g == null) {
                    pkVar.g = new ok(pkVar);
                }
                audioAttributes2 = pkVar.g.a;
            }
            offloadedPlayback = new AudioTrack.Builder().setAudioAttributes(audioAttributes2).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1);
            return offloadedPlayback.build();
        }
        if (i2 < 21) {
            int c = mc3.c(pkVar.d);
            return i == 0 ? new AudioTrack(c, this.e, this.f, this.g, this.h, 1) : new AudioTrack(c, this.e, this.f, this.g, this.h, 1, i);
        }
        if (z) {
            audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (pkVar.g == null) {
                pkVar.g = new ok(pkVar);
            }
            audioAttributes = pkVar.g.a;
        }
        return new AudioTrack(audioAttributes, new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build(), this.h, 1, i);
    }
}
