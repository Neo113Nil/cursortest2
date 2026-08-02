package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.navigation.screen.c;
import kotlinx.serialization.json.b;

/* loaded from: classes11.dex */
public final class bei implements xi40, cv3, ue6, ec7, mwa, rgz, eso, gsf0, qnw, brd0, gb4, bw90, g0a0, c5c0, ueo0, ci6, qxr0, nvu0, zxx0 {
    public final /* synthetic */ int a;
    public static final bei b = new bei(0);
    public static final bei c = new bei(1);
    public static final bei w = new bei(2);
    public static final bei x = new bei(3);
    public static final bei y = new bei(4);
    public static final bei z = new bei(5);
    public static final bei A = new bei(6);
    public static final bei B = new bei(7);
    public static final bei C = new bei(8);
    public static final bei D = new bei(10);
    public static final bei E = new bei(11);
    public static final bei F = new bei(12);
    public static final bei G = new bei(14);
    public static final bei H = new bei(16);
    public static final bei I = new bei(17);
    public static final bei J = new bei(19);
    public static final bei K = new bei(20);
    public static final bei L = new bei(21);
    public static final bei M = new bei(22);
    public static final bei N = new bei(25);
    public static final bei O = new bei(26);
    public static final bei P = new bei(27);
    public static final bei Q = new bei(28);
    public static final bei R = new bei(29);

    public /* synthetic */ bei(int i) {
        this.a = i;
    }

    public static tqm h(mgv mgvVar, ldc ldcVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(38903447);
        if ((i & 4) != 0) {
            ldcVar = null;
        }
        tqm tqmVar = new tqm(ba91.c(mgvVar, btsVar), ldcVar);
        btsVar.t(false);
        return tqmVar;
    }

    public static ti80 i(String str, String str2, String str3) {
        if (str != null && l9e.f(str) && str2 != null && !evu0.J(str2)) {
            return new si80(str, str2, str3);
        }
        if (str != null && l9e.f(str)) {
            return new ri80(str, str3);
        }
        if (str2 == null || evu0.J(str2)) {
            return null;
        }
        return new qi80(str2, str3);
    }

    public static Drawable k(int i, View view) {
        Drawable t = vng.t(i, new ContextThemeWrapper(view.getContext(), a2i0.IconDefaultStyle));
        if (t != null) {
            return t;
        }
        w511.f(oyr.j(i, "Drawable resource ", " not found"));
        return null;
    }

    public static x1g0 l(c cVar) {
        return new x1g0(cVar);
    }

    public static byx m() {
        return new byx(Screen.DISCOVERY, new c430(Mode.ORGANIZATIONS, (b) null, (un0) null));
    }

    public static zwm n(axm axmVar) {
        return axmVar.f;
    }

    @Override // defpackage.gb4
    public Drawable a(Context context) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ci6
    public long b(dfq0 dfq0Var, int i) {
        return dfq0Var.f.n(i);
    }

    @Override // defpackage.brd0
    public boolean c(Object obj, Object obj2) {
        return jl40.l(((dg20) obj).b(), ((dg20) obj2).b());
    }

    @Override // defpackage.gsf0
    public boolean d() {
        return true;
    }

    @Override // defpackage.brd0
    public boolean e(Object obj, Object obj2) {
        return jl40.l((dg20) obj, (dg20) obj2);
    }

    @Override // defpackage.rgz
    public void f(Exception exc, String str, Object[] objArr) {
    }

    @Override // defpackage.xi40
    public boolean g(float f) {
        return true;
    }

    @Override // defpackage.nvu0
    public nvu0 get(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nvu0
    public void set(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "create_order";
            default:
                return super.toString();
        }
    }
}
