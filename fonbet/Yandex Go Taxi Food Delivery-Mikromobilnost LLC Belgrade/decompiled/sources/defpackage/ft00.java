package defpackage;

import java.util.HashMap;

/* loaded from: classes14.dex */
public final class ft00 {
    public final kf00 a;

    public ft00(kf00 kf00Var) {
        this.a = kf00Var;
    }

    public final void a(String str) {
        kf00 kf00Var = this.a;
        kf00Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        kf00Var.a.a("Map.CarPicture.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(String str, boolean z) {
        kf00 kf00Var = this.a;
        kf00Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("mode", str);
        kf00Var.a.a("Map.StartingPoint.Tapped", hashMap, 1, x4e.r(z, hashMap, "change_source_point_screen_opened"));
    }
}
