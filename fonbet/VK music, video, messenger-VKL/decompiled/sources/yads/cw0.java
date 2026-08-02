package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class cw0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final bw0 k;
    public final ut1 l;

    public cw0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, bw0 bw0Var, ut1 ut1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = bw0Var;
        this.l = ut1Var;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.a;
            j = ((((i2 != this.b || i2 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public final long b() {
        long j = this.j;
        return j == 0 ? C.TIME_UNSET : (j * 1000000) / this.e;
    }

    public final nx0 a(byte[] bArr, ut1 ut1Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        ut1 ut1Var2 = this.l;
        if (ut1Var2 != null) {
            if (ut1Var != null) {
                tt1[] tt1VarArr = ut1Var.b;
                if (tt1VarArr.length != 0) {
                    ut1Var = new ut1((tt1[]) mc3.a((Object[]) ut1Var2.b, (Object[]) tt1VarArr));
                }
            }
            ut1Var = ut1Var2;
        }
        mx0 mx0Var = new mx0();
        mx0Var.k = MimeTypes.AUDIO_FLAC;
        mx0Var.l = i;
        mx0Var.x = this.g;
        mx0Var.y = this.e;
        mx0Var.m = Collections.singletonList(bArr);
        mx0Var.i = ut1Var;
        return new nx0(mx0Var);
    }

    public cw0(int i, byte[] bArr) {
        jc2 jc2Var = new jc2(bArr);
        jc2Var.b(i * 8);
        this.a = jc2Var.a(16);
        this.b = jc2Var.a(16);
        this.c = jc2Var.a(24);
        this.d = jc2Var.a(24);
        int a = jc2Var.a(20);
        this.e = a;
        this.f = b(a);
        this.g = jc2Var.a(3) + 1;
        int a2 = jc2Var.a(5) + 1;
        this.h = a2;
        this.i = a(a2);
        this.j = jc2Var.f();
        this.k = null;
        this.l = null;
    }

    public final long a(long j) {
        long j2 = (j * this.e) / 1000000;
        long j3 = this.j - 1;
        int i = mc3.a;
        return Math.max(0L, Math.min(j2, j3));
    }
}
