package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes10.dex */
public class t83 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public int i;
    public int j;
    public boolean k;
    public final s51 l;
    public final int m;
    public final s51 n;
    public final int o;
    public final int p;
    public final int q;
    public final s51 r;
    public s51 s;
    public int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final HashMap y;
    public final HashSet z;

    public t83() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = true;
        this.l = s51.g();
        this.m = 0;
        this.n = s51.g();
        this.o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = s51.g();
        this.s = s51.g();
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public t83 a(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.k = true;
        return this;
    }

    public void b(Context context) {
        Point c = mc3.c(context);
        a(c.x, c.y);
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i = mc3.a;
        if (i >= 19) {
            if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = s51.a(mc3.a(locale));
                }
            }
        }
    }

    public t83(Context context) {
        this();
        a(context);
        b(context);
    }
}
