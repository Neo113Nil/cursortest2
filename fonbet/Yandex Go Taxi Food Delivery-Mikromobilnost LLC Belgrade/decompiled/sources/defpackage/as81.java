package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import yads.ck;

/* loaded from: classes7.dex */
public final class as81 {
    public final qd81 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final lv81[] i;

    public as81(qd81 qd81Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, lv81[] lv81VarArr) {
        this.a = qd81Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = lv81VarArr;
    }

    public final AudioTrack a(boolean z, ws71 ws71Var, int i) {
        int i2 = this.c;
        try {
            AudioTrack b = b(z, ws71Var, i);
            int state = b.getState();
            if (state == 1) {
                return b;
            }
            try {
                b.release();
            } catch (Exception unused) {
            }
            throw new ck(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new ck(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final AudioTrack b(boolean z, ws71 ws71Var, int i) {
        int i2;
        AudioAttributes audioAttributes;
        AudioAttributes audioAttributes2;
        int i3 = rf71.a;
        int i4 = 0;
        int i5 = this.g;
        int i6 = this.f;
        int i7 = this.e;
        if (i3 >= 29) {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i6).setEncoding(i5).build();
            if (z) {
                audioAttributes2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (ws71Var.y == null) {
                    ws71Var.y = new se3(ws71Var);
                }
                audioAttributes2 = ws71Var.y.a;
            }
            return new AudioTrack.Builder().setAudioAttributes(audioAttributes2).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i3 >= 21) {
            if (z) {
                audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (ws71Var.y == null) {
                    ws71Var.y = new se3(ws71Var);
                }
                audioAttributes = ws71Var.y.a;
            }
            return new AudioTrack(audioAttributes, new AudioFormat.Builder().setSampleRate(i7).setChannelMask(i6).setEncoding(i5).build(), this.h, 1, i);
        }
        int i8 = ws71Var.c;
        if (i8 != 13) {
            switch (i8) {
                case 2:
                    i2 = i4;
                    break;
                case 3:
                    i4 = 8;
                    i2 = i4;
                    break;
                case 4:
                    i4 = 4;
                    i2 = i4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    i4 = 5;
                    i2 = i4;
                    break;
                case 6:
                    i4 = 2;
                    i2 = i4;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 1;
        }
        if (i == 0) {
            return new AudioTrack(i2, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(i2, this.e, this.f, this.g, this.h, 1, i);
    }
}
