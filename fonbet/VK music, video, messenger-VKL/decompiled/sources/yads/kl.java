package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class kl extends r63 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public kl(q83 q83Var) {
        super(q83Var);
    }

    public final boolean a(kc2 kc2Var) {
        if (this.b) {
            kc2Var.e(kc2Var.b + 1);
        } else {
            int m = kc2Var.m();
            int i = (m >> 4) & 15;
            this.d = i;
            if (i == 2) {
                int i2 = e[(m >> 2) & 3];
                mx0 mx0Var = new mx0();
                mx0Var.k = MimeTypes.AUDIO_MPEG;
                mx0Var.x = 1;
                mx0Var.y = i2;
                this.a.a(new nx0(mx0Var));
                this.c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                mx0 mx0Var2 = new mx0();
                mx0Var2.k = str;
                mx0Var2.x = 1;
                mx0Var2.y = 8000;
                this.a.a(new nx0(mx0Var2));
                this.c = true;
            } else if (i != 10) {
                throw new q63("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    public final boolean a(long j, kc2 kc2Var) {
        if (this.d == 2) {
            int i = kc2Var.c - kc2Var.b;
            this.a.a(i, kc2Var);
            this.a.a(j, 1, i, 0, null);
            return true;
        }
        int m = kc2Var.m();
        if (m == 0 && !this.c) {
            int i2 = kc2Var.c - kc2Var.b;
            byte[] bArr = new byte[i2];
            kc2Var.a(bArr, 0, i2);
            a a = b.a(new jc2(i2, bArr), false);
            mx0 mx0Var = new mx0();
            mx0Var.k = "audio/mp4a-latm";
            mx0Var.h = a.c;
            mx0Var.x = a.b;
            mx0Var.y = a.a;
            mx0Var.m = Collections.singletonList(bArr);
            this.a.a(new nx0(mx0Var));
            this.c = true;
            return false;
        }
        if (this.d == 10 && m != 1) {
            return false;
        }
        int i3 = kc2Var.c - kc2Var.b;
        this.a.a(i3, kc2Var);
        this.a.a(j, 1, i3, 0, null);
        return true;
    }
}
