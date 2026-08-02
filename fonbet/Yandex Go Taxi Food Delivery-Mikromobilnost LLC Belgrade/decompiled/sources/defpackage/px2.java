package defpackage;

import android.content.Intent;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.intentprocessor.i;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes.dex */
public final class px2 implements x7w {
    public final ox2 a;
    public final oep0 b;
    public final yvf0 c;
    public final fx60 d;
    public final i e;

    public px2(ox2 ox2Var, oep0 oep0Var, yvf0 yvf0Var, fx60 fx60Var, i iVar) {
        this.a = ox2Var;
        this.b = oep0Var;
        this.c = yvf0Var;
        this.d = fx60Var;
        this.e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        String str;
        PlaceType placeType = null;
        if (s8o.s(intent)) {
            ox2 ox2Var = this.a;
            ox2Var.getClass();
            if (s8o.s(intent)) {
                String stringExtra = intent.getStringExtra("SHORTCUT_TARGET");
                if (stringExtra != null) {
                    int hashCode = stringExtra.hashCode();
                    if (hashCode != 461046868) {
                        if (hashCode == 461493894 && stringExtra.equals("SHORTCUT_TARGET_WORK")) {
                            if (s8o.v(intent)) {
                                str = "work";
                            } else if (s8o.r(intent)) {
                                str = "add_work";
                            }
                            if (str == null) {
                                jst.e.n("AppShortcuts: attempt to resolve unexpected shortcut type");
                            } else {
                                rx2 rx2Var = ox2Var.a;
                                rx2Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("shortcut_type", str);
                                rx2Var.a.a("AppShortcutWasPressed", hashMap, 1, new HashMap());
                            }
                        }
                    } else if (stringExtra.equals("SHORTCUT_TARGET_HOME")) {
                        if (s8o.v(intent)) {
                            str = "home";
                        } else if (s8o.r(intent)) {
                            str = "add_home";
                        }
                        if (str == null) {
                        }
                    }
                }
                str = null;
                if (str == null) {
                }
            } else {
                jst.e.n("AppShortcuts: attempt to report non-shortcut Intent");
            }
        }
        if (!s8o.r(intent)) {
            if (s8o.v(intent)) {
                i iVar = this.e;
                iVar.e(intent, iVar.m);
                return new m5u(true, false);
            }
            return n5u.a;
        }
        String stringExtra2 = intent.getStringExtra("SHORTCUT_TARGET");
        if (jl40.l(stringExtra2, "SHORTCUT_TARGET_HOME")) {
            placeType = PlaceType.HOME;
        } else if (jl40.l(stringExtra2, "SHORTCUT_TARGET_WORK")) {
            placeType = PlaceType.WORK;
        } else {
            jst.e.k(new IllegalArgumentException(g8e.o("can't extract place type for target: ", stringExtra2)), "AppShortcuts error");
        }
        if (placeType != null) {
            this.d.a(Events$Zalogin$LoginContext.DEEPLINK, new ou(3, this, placeType));
            return new m5u(true, false);
        }
        return n5u.a;
    }
}
