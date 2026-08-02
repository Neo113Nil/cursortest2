package yads;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class pe0 {
    public final Context a;
    public boolean d;
    public final ee0 b = new ee0();
    public int c = 0;
    public final pl1 e = pl1.a;

    public pe0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ro[] a(Handler handler, xn0 xn0Var, xn0 xn0Var2, xn0 xn0Var3, xn0 xn0Var4) {
        qb0 qb0Var;
        int i;
        int i2;
        Class cls;
        int i3;
        int i4;
        int i5;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        int i6 = this.c;
        arrayList.add(new cm1(context, this.b, this.e, this.d, handler, xn0Var));
        if (i6 != 0) {
            int size = arrayList.size();
            if (i6 == 2) {
                size--;
            }
            try {
                try {
                    i5 = size + 1;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating VP9 extension", e);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (ro) Class.forName("com.monetization.ads.exo.ext.vp9.LibvpxVideoRenderer").getConstructor(cls3, Handler.class, hk3.class, cls2).newInstance(5000L, handler, xn0Var, 50));
                ji1.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i5;
                i5 = size;
                arrayList.add(i5, (ro) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(cls3, Handler.class, hk3.class, cls2).newInstance(5000L, handler, xn0Var, 50));
                ji1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                Context context2 = this.a;
                qb0Var = new qb0();
                uk a = uk.a(context2);
                a.getClass();
                qb0Var.a = a;
                qb0Var.c = false;
                qb0Var.d = false;
                qb0Var.e = 0;
                if (qb0Var.b == null) {
                }
                zb0 zb0Var = new zb0(qb0Var);
                Context context3 = this.a;
                i = this.c;
                arrayList.add(new gl1(context3, this.b, this.e, this.d, handler, xn0Var2, zb0Var));
                if (i != 0) {
                }
                arrayList.add(new e73(xn0Var3, handler.getLooper()));
                arrayList.add(new zt1(xn0Var4, handler.getLooper()));
                arrayList.add(new bt());
                return (ro[]) arrayList.toArray(new ro[0]);
            }
            try {
                arrayList.add(i5, (ro) Class.forName("com.monetization.ads.exo.ext.av1.Libgav1VideoRenderer").getConstructor(cls3, Handler.class, hk3.class, cls2).newInstance(5000L, handler, xn0Var, 50));
                ji1.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        }
        Context context22 = this.a;
        qb0Var = new qb0();
        uk a2 = uk.a(context22);
        a2.getClass();
        qb0Var.a = a2;
        qb0Var.c = false;
        qb0Var.d = false;
        qb0Var.e = 0;
        if (qb0Var.b == null) {
            qb0Var.b = new sb0(new bl[0], new xz2(0), new h33());
        }
        zb0 zb0Var2 = new zb0(qb0Var);
        Context context32 = this.a;
        i = this.c;
        arrayList.add(new gl1(context32, this.b, this.e, this.d, handler, xn0Var2, zb0Var2));
        if (i != 0) {
            int size2 = arrayList.size();
            if (i == 2) {
                size2--;
            }
            try {
                try {
                    i2 = size2 + 1;
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(size2, (ro) Class.forName("com.monetization.ads.exo.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
                    ji1.c("DefaultRenderersFactory", "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused5) {
                    size2 = i2;
                    i2 = size2;
                    try {
                        cls = jl.class;
                        try {
                            i3 = i2 + 1;
                            arrayList.add(i2, (ro) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                            ji1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused6) {
                        }
                        try {
                            i4 = i3 + 1;
                        } catch (ClassNotFoundException unused7) {
                        }
                        try {
                            arrayList.add(i3, (ro) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                            ji1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused8) {
                            i3 = i4;
                            i4 = i3;
                            arrayList.add(i4, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                            ji1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                            arrayList.add(new e73(xn0Var3, handler.getLooper()));
                            arrayList.add(new zt1(xn0Var4, handler.getLooper()));
                            arrayList.add(new bt());
                            return (ro[]) arrayList.toArray(new ro[0]);
                        }
                        arrayList.add(i4, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                        ji1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new e73(xn0Var3, handler.getLooper()));
                        arrayList.add(new zt1(xn0Var4, handler.getLooper()));
                        arrayList.add(new bt());
                        return (ro[]) arrayList.toArray(new ro[0]);
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating Opus extension", e3);
                    }
                }
                try {
                    cls = jl.class;
                    i3 = i2 + 1;
                } catch (ClassNotFoundException unused9) {
                    cls = jl.class;
                }
                try {
                    try {
                        arrayList.add(i2, (ro) Class.forName("com.monetization.ads.exo.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                        ji1.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused10) {
                        i2 = i3;
                        i3 = i2;
                        i4 = i3 + 1;
                        arrayList.add(i3, (ro) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                        ji1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                        arrayList.add(i4, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                        ji1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new e73(xn0Var3, handler.getLooper()));
                        arrayList.add(new zt1(xn0Var4, handler.getLooper()));
                        arrayList.add(new bt());
                        return (ro[]) arrayList.toArray(new ro[0]);
                    }
                    i4 = i3 + 1;
                    arrayList.add(i3, (ro) Class.forName("com.monetization.ads.exo.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                    ji1.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    try {
                        arrayList.add(i4, (ro) Class.forName("com.monetization.ads.exo.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, dl.class, cls).newInstance(handler, xn0Var2, zb0Var2));
                        ji1.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused11) {
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e4);
                    }
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating FLAC extension", e5);
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating MIDI extension", e6);
            }
        }
        arrayList.add(new e73(xn0Var3, handler.getLooper()));
        arrayList.add(new zt1(xn0Var4, handler.getLooper()));
        arrayList.add(new bt());
        return (ro[]) arrayList.toArray(new ro[0]);
    }
}
