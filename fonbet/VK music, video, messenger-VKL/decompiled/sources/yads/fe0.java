package yads;

import com.monetization.ads.exo.source.dash.DashMediaSource$Factory;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class fe0 {
    public final sq0 a;
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public o30 e;
    public hd0 f;
    public ae0 g;

    public fe0(od0 od0Var) {
        this.a = od0Var;
    }

    public static yn1 a(Class cls) {
        try {
            return (yn1) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public final void b(o30 o30Var) {
        if (o30Var != this.e) {
            this.e = o30Var;
            this.b.clear();
            this.d.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c63 a(int i) {
        c63 c63Var;
        c63 c63Var2;
        if (this.b.containsKey(Integer.valueOf(i))) {
            return (c63) this.b.get(Integer.valueOf(i));
        }
        final o30 o30Var = this.e;
        o30Var.getClass();
        if (i == 0) {
            final Class asSubclass = DashMediaSource$Factory.class.asSubclass(yn1.class);
            c63Var2 = new c63() { // from class: xsna.jwy0
                @Override // yads.c63
                public final Object get() {
                    yads.yn1 a;
                    a = yads.ge0.a(asSubclass, o30Var);
                    return a;
                }
            };
        } else if (i == 1) {
            final Class<? extends U> asSubclass2 = Class.forName("com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory").asSubclass(yn1.class);
            c63Var2 = new c63() { // from class: xsna.iwy0
                @Override // yads.c63
                public final Object get() {
                    yads.yn1 a;
                    a = yads.ge0.a(asSubclass2, o30Var);
                    return a;
                }
            };
        } else if (i == 2) {
            final Class<? extends U> asSubclass3 = Class.forName("com.monetization.ads.exo.source.hls.HlsMediaSource$Factory").asSubclass(yn1.class);
            c63Var2 = new c63() { // from class: xsna.hwy0
                @Override // yads.c63
                public final Object get() {
                    yads.yn1 a;
                    a = yads.ge0.a(asSubclass3, o30Var);
                    return a;
                }
            };
        } else {
            if (i != 3) {
                if (i == 4) {
                    c63Var = new c63() { // from class: xsna.fwy0
                        @Override // yads.c63
                        public final Object get() {
                            return yads.fe0.this.a(o30Var);
                        }
                    };
                }
                c63Var = null;
            } else {
                final Class<? extends U> asSubclass4 = Class.forName("com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory").asSubclass(yn1.class);
                c63Var = new c63() { // from class: xsna.gwy0
                    @Override // yads.c63
                    public final Object get() {
                        return yads.fe0.a(asSubclass4);
                    }
                };
            }
            this.b.put(Integer.valueOf(i), c63Var);
            if (c63Var != null) {
                this.c.add(Integer.valueOf(i));
            }
            return c63Var;
        }
        c63Var = c63Var2;
        this.b.put(Integer.valueOf(i), c63Var);
        if (c63Var != null) {
        }
        return c63Var;
    }

    public final /* synthetic */ yn1 a(o30 o30Var) {
        return new hl2(o30Var, this.a);
    }
}
