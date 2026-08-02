package xsna;

import android.content.Context;
import com.vk.core.view.components.badge.VkContentBadge;
import java.util.List;

/* compiled from: ReactionsSelectorAnimator.kt */
/* loaded from: classes18.dex */
public final class m6f0 {
    public static final float A;
    public static final float B;
    public final m3r a;
    public final k6f0 b;
    public final VkContentBadge[] c;
    public final float d;
    public final float[] e;
    public final float[] f;
    public final float[] g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public final float m;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public int n = -1;
    public final bpn0 w = new bpn0(new vt30(this, 28));
    public final sx3 x = new sx3(this, 10);
    public final bpn0 y = new bpn0(new x850(this, 21));
    public final bpn0 z = new bpn0(new odc0(this, 8));

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        float a = hbh0.a(context, 38.0f);
        A = a;
        Context context2 = e43.a;
        B = (-hbh0.a(context2 != null ? context2 : null, 18.0f)) - a;
    }

    public m6f0(m3r m3rVar, k6f0 k6f0Var, VkContentBadge[] vkContentBadgeArr, List<? extends f2f0> list, y6f0 y6f0Var) {
        this.a = m3rVar;
        this.b = k6f0Var;
        this.c = vkContentBadgeArr;
        this.d = y6f0Var.b / y6f0Var.c;
        this.e = new float[list.size()];
        this.f = new float[list.size()];
        this.g = new float[list.size()];
        this.h = new float[list.size()];
        this.i = new float[list.size()];
        this.j = new float[list.size()];
        this.k = new float[list.size()];
        this.l = new float[list.size()];
        this.m = ((-(r2 - r1)) / 2.0f) - A;
    }

    public static float a(float f, float f2, float f3) {
        return u11.b(f2, f, f3, f);
    }
}
