package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class f20 {
    public static final String e = "yandex_tracking_events";
    public static final String f = "yandex_linear_creative_info";
    public final vq3 a;
    public final fg1 b;
    public final d20 c;
    public final tq3 d;

    public /* synthetic */ f20(Context context, jp2 jp2Var) {
        this(new vq3(), new fg1(context, jp2Var, new lj(context, jp2Var, null, 12)));
    }

    public static d20 a() {
        return new d20(new kr0(new vq3()), new vq3());
    }

    public static tq3 b() {
        return new tq3(new c93(), "CreativeExtension", "Tracking");
    }

    public f20(vq3 vq3Var, fg1 fg1Var) {
        this.a = vq3Var;
        this.b = fg1Var;
        this.c = a();
        this.d = b();
    }
}
