package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes10.dex */
public abstract class tk {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 8; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(mc3.a(i3)).build(), a);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    public static int[] a() {
        boolean isDirectPlaybackSupported;
        p51 p51Var = s51.c;
        o51 o51Var = new o51();
        yn2 yn2Var = uk.e;
        wn2 wn2Var = yn2Var.c;
        if (wn2Var == null) {
            wn2 wn2Var2 = new wn2(yn2Var, new xn2(yn2Var.f, 0, yn2Var.g));
            yn2Var.c = wn2Var2;
            wn2Var = wn2Var2;
        }
        nb3 it = wn2Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), a);
            if (isDirectPlaybackSupported) {
                o51Var.a(num);
            }
        }
        o51Var.a((Object) 2);
        return wd1.a(o51Var.a());
    }
}
