package defpackage;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c7g0 implements b7g0, kcs {
    public final /* synthetic */ tc9 a;
    public final mfg0 b;
    public final jdg0 c;
    public final d7g0 d;
    public final j6g0 e;

    public c7g0(mfg0 mfg0Var, jdg0 jdg0Var, d7g0 d7g0Var, j6g0 j6g0Var, Map map) {
        this.a = new tc9(map, 10);
        this.b = mfg0Var;
        this.c = jdg0Var;
        this.d = d7g0Var;
        this.e = j6g0Var;
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        return this.a.a(str);
    }
}
