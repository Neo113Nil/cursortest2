package defpackage;

import android.net.Uri;
import com.monetization.ads.exo.source.dash.DashMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class k191 implements hz71 {
    public final fp71 a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;

    public k191(u571 u571Var, ej71 ej71Var) {
        fp71 fp71Var = new fp71(ej71Var);
        this.a = fp71Var;
        if (u571Var != ((u571) fp71Var.x)) {
            fp71Var.x = u571Var;
            ((HashMap) fp71Var.b).clear();
            ((HashMap) fp71Var.w).clear();
        }
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    @Override // defpackage.hz71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qv81 a(op81 op81Var) {
        pg61 pg61Var;
        pg61 pg61Var2;
        op81 op81Var2 = op81Var;
        d981 d981Var = op81Var2.b;
        q581 q581Var = op81Var2.c;
        d981Var.getClass();
        Uri uri = d981Var.a;
        Uri uri2 = d981Var.a;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int c = rf71.c(uri2, null);
        final fp71 fp71Var = this.a;
        hz71 hz71Var = (hz71) ((HashMap) fp71Var.w).get(Integer.valueOf(c));
        final int i = 0;
        final int i2 = 1;
        if (hz71Var == null) {
            HashMap hashMap = (HashMap) fp71Var.b;
            if (hashMap.containsKey(Integer.valueOf(c))) {
                pg61Var2 = (pg61) hashMap.get(Integer.valueOf(c));
            } else {
                final u571 u571Var = (u571) fp71Var.x;
                u571Var.getClass();
                final int i3 = 2;
                if (c == 0) {
                    final Class asSubclass = DashMediaSource$Factory.class.asSubclass(hz71.class);
                    pg61Var = new pg61() { // from class: xu81
                        @Override // defpackage.pg61
                        public final Object get() {
                            int i4 = i3;
                            u571 u571Var2 = u571Var;
                            Object obj = asSubclass;
                            switch (i4) {
                                case 0:
                                    return k191.a((Class) obj, u571Var2);
                                case 1:
                                    return k191.a((Class) obj, u571Var2);
                                case 2:
                                    return k191.a((Class) obj, u571Var2);
                                default:
                                    return new wm71(u571Var2, (ej71) ((fp71) obj).a);
                            }
                        }
                    };
                } else if (c == 1) {
                    final GenericDeclaration asSubclass2 = Class.forName("com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory").asSubclass(hz71.class);
                    pg61Var = new pg61() { // from class: xu81
                        @Override // defpackage.pg61
                        public final Object get() {
                            int i4 = i2;
                            u571 u571Var2 = u571Var;
                            Object obj = asSubclass2;
                            switch (i4) {
                                case 0:
                                    return k191.a((Class) obj, u571Var2);
                                case 1:
                                    return k191.a((Class) obj, u571Var2);
                                case 2:
                                    return k191.a((Class) obj, u571Var2);
                                default:
                                    return new wm71(u571Var2, (ej71) ((fp71) obj).a);
                            }
                        }
                    };
                } else if (c != 2) {
                    final int i4 = 3;
                    if (c != 3) {
                        if (c == 4) {
                            pg61Var = new pg61() { // from class: xu81
                                @Override // defpackage.pg61
                                public final Object get() {
                                    int i42 = i4;
                                    u571 u571Var2 = u571Var;
                                    Object obj = fp71Var;
                                    switch (i42) {
                                        case 0:
                                            return k191.a((Class) obj, u571Var2);
                                        case 1:
                                            return k191.a((Class) obj, u571Var2);
                                        case 2:
                                            return k191.a((Class) obj, u571Var2);
                                        default:
                                            return new wm71(u571Var2, (ej71) ((fp71) obj).a);
                                    }
                                }
                            };
                        }
                        pg61Var = null;
                        hashMap.put(Integer.valueOf(c), pg61Var);
                        if (pg61Var != null) {
                            ((HashSet) fp71Var.c).add(Integer.valueOf(c));
                        }
                        pg61Var2 = pg61Var;
                    } else {
                        pg61Var = new tm61(3, Class.forName("com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory").asSubclass(hz71.class));
                    }
                } else {
                    final GenericDeclaration asSubclass3 = Class.forName("com.monetization.ads.exo.source.hls.HlsMediaSource$Factory").asSubclass(hz71.class);
                    pg61Var = new pg61() { // from class: xu81
                        @Override // defpackage.pg61
                        public final Object get() {
                            int i42 = i;
                            u571 u571Var2 = u571Var;
                            Object obj = asSubclass3;
                            switch (i42) {
                                case 0:
                                    return k191.a((Class) obj, u571Var2);
                                case 1:
                                    return k191.a((Class) obj, u571Var2);
                                case 2:
                                    return k191.a((Class) obj, u571Var2);
                                default:
                                    return new wm71(u571Var2, (ej71) ((fp71) obj).a);
                            }
                        }
                    };
                }
                hashMap.put(Integer.valueOf(c), pg61Var);
                if (pg61Var != null) {
                }
                pg61Var2 = pg61Var;
            }
            if (pg61Var2 == null) {
                hz71Var = null;
            } else {
                hz71Var = (hz71) pg61Var2.get();
                ((HashMap) fp71Var.w).put(Integer.valueOf(c), hz71Var);
            }
        }
        cha1.b(hz71Var, "No suitable media source factory found for content type: " + c);
        long j = q581Var.a;
        long j2 = q581Var.b;
        long j3 = q581Var.c;
        float f = q581Var.w;
        float f2 = q581Var.x;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        long j4 = j;
        if (f == -3.4028235E38f) {
            f = this.e;
        }
        float f3 = f;
        if (f2 == -3.4028235E38f) {
            f2 = this.f;
        }
        float f4 = f2;
        if (j2 == -9223372036854775807L) {
            j2 = this.c;
        }
        long j5 = j2;
        if (j3 == -9223372036854775807L) {
            j3 = this.d;
        }
        long j6 = j3;
        if (!new q581(f3, f4, j4, j5, j6).equals(q581Var)) {
            new dz71();
            List list = Collections.EMPTY_LIST;
            wk2 wk2Var = wk2.x;
            qf81 qf81Var = qf81.c;
            dw71 dw71Var = op81Var2.x;
            dw71Var.getClass();
            wp71 wp71Var = new wp71();
            wp71Var.a = dw71Var.a;
            wp71Var.b = dw71Var.b;
            wp71Var.c = dw71Var.c;
            wp71Var.d = dw71Var.w;
            wp71Var.e = dw71Var.x;
            String str = op81Var2.a;
            oi61 oi61Var = op81Var2.w;
            qf81 qf81Var2 = op81Var2.y;
            String str2 = d981Var.c;
            List list2 = d981Var.b;
            t31 t31Var = d981Var.d;
            p481 p481Var = t31.b;
            d981 d981Var2 = uri2 != null ? new d981(uri2, list2, str2, t31Var) : null;
            dw71 dw71Var2 = new dw71(wp71Var);
            q581 q581Var2 = new q581(f3, f4, j4, j5, j6);
            if (oi61Var == null) {
                oi61Var = oi61.b0;
            }
            op81Var2 = new op81(str, dw71Var2, d981Var2, q581Var2, oi61Var, qf81Var2);
        }
        dw71 dw71Var3 = op81Var2.x;
        d981 d981Var3 = op81Var2.b;
        qv81 a = hz71Var.a(op81Var2);
        t31 t31Var2 = d981Var3.d;
        if (!t31Var2.isEmpty()) {
            qv81[] qv81VarArr = new qv81[t31Var2.size() + 1];
            qv81VarArr[0] = a;
            if (t31Var2.size() > 0) {
                if (t31Var2.get(0) != null) {
                    ny61.u();
                    return null;
                }
                new ArrayList(1);
                new HashSet(1);
                new sc81();
                new cw71();
                p481 p481Var2 = t31.b;
                wk2 wk2Var2 = wk2.x;
                qf81 qf81Var3 = qf81.c;
                Uri uri3 = Uri.EMPTY;
                throw null;
            }
            a = new m291(qv81VarArr);
        }
        qv81 qv81Var = a;
        long j7 = dw71Var3.a;
        long j8 = dw71Var3.b;
        return (j7 == 0 && j8 == Long.MIN_VALUE && !dw71Var3.w) ? qv81Var : new vq71(qv81Var, rf71.g(j7), rf71.g(j8), !dw71Var3.x, dw71Var3.c, dw71Var3.w);
    }

    public static hz71 a(Class cls, u571 u571Var) {
        try {
            return (hz71) cls.getConstructor(u571.class).newInstance(u571Var);
        } catch (Exception e) {
            ny61.o(e);
            return null;
        }
    }
}
