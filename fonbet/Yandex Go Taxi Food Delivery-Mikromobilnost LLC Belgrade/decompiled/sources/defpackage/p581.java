package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import yads.al2;
import yads.bl2;
import yads.t31;
import yads.zk2;

/* loaded from: classes7.dex */
public abstract class p581 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(rf71.a(i3)).build(), a)) {
                return i3;
            }
        }
        return 0;
    }

    public static int[] b() {
        p481 p481Var = t31.b;
        a181 a181Var = new a181();
        bl2 bl2Var = b981.e;
        zk2 zk2Var = bl2Var.b;
        if (zk2Var == null) {
            zk2 zk2Var2 = new zk2(bl2Var, new al2(0, bl2Var.y, bl2Var.x));
            bl2Var.b = zk2Var2;
            zk2Var = zk2Var2;
        }
        wr71 it = zk2Var.iterator();
        while (true) {
            p481 p481Var2 = (p481) it;
            if (!p481Var2.hasNext()) {
                a181Var.d(2);
                return aka1.f(a181Var.c());
            }
            Integer num = (Integer) p481Var2.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), a)) {
                a181Var.d(num);
            }
        }
    }
}
