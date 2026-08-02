package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import yads.h72;

/* loaded from: classes7.dex */
public final class mf71 {
    public static final d671 d = new d671();
    public static volatile mf71 e;
    public final z4m0 a;
    public final w071 b;
    public final lm71 c;

    public mf71(Context context) {
        int i;
        int i2;
        a081 a081Var;
        ae81 ae81Var = new ae81();
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            i = maxMemory / 8;
            int i3 = ((int) (((r3.widthPixels * r3.heightPixels) * context.getResources().getDisplayMetrics().density) / 1024.0f)) * 3;
            if (i > i3) {
                i = i3;
            }
        } catch (IllegalArgumentException unused) {
            i = 5120;
        }
        h72 h72Var = new h72(i >= 5120 ? i : 5120);
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a != null && (r1 = a.v0) != null) {
            Integer num = num.intValue() == 0 ? null : num;
            if (num != null) {
                i2 = num.intValue();
                dy61 j = a8a1.j(i2, context);
                j.a();
                i971 i971Var = new i971(0, h72Var);
                this.c = new lm71(6, h72Var);
                this.a = new z4m0(j, i971Var, ae81Var);
                this.b = new w071(j, context);
            }
        }
        i2 = 4;
        dy61 j2 = a8a1.j(i2, context);
        j2.a();
        i971 i971Var2 = new i971(0, h72Var);
        this.c = new lm71(6, h72Var);
        this.a = new z4m0(j2, i971Var2, ae81Var);
        this.b = new w071(j2, context);
    }
}
