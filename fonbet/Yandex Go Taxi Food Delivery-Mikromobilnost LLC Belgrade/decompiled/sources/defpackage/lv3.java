package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lv3 implements kcs {
    public final /* synthetic */ tc9 a;
    public final c4 b;
    public final lk c;
    public final p4 d;
    public final mx3 e;
    public final tv3 f;

    public lv3(c4 c4Var, lk lkVar, p4 p4Var, mx3 mx3Var, iz3 iz3Var, tv3 tv3Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = c4Var;
        this.c = lkVar;
        this.d = p4Var;
        this.e = mx3Var;
        this.f = tv3Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }
}
