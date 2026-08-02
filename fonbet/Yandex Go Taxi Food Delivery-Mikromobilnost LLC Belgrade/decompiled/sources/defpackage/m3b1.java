package defpackage;

import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary;
import com.yandex.go.scooters.bdui.api.ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath;
import com.yandex.go.scooters.passes.ScootersPassesScreenRoute$Intention;
import com.yandex.go.scooters.passes.ScootersPassesScreenRoute$PassType;
import java.io.Closeable;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public abstract class m3b1 {
    public static leo0 a(ScootersBduiNavigationAction scootersBduiNavigationAction) {
        Map map;
        n0n0 n0n0Var = scootersBduiNavigationAction.a;
        if (!(n0n0Var instanceof ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary)) {
            if (n0n0Var instanceof ScootersBduiNavigationAction$ScreenIdentifier$DocumentPath) {
                ny61.r("Tovarich returned wrong DocumentPath id. Passes feature uses Arbitrary id. Check tovarich code.");
                return null;
            }
            w511.b();
            return null;
        }
        ScootersBduiNavigationAction scootersBduiNavigationAction2 = scootersBduiNavigationAction.c;
        if (scootersBduiNavigationAction2 != null) {
            Map map2 = ((ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary) n0n0Var).b;
            rbx rbxVar = sbx.d;
            rbxVar.getClass();
            map = b.n(map2, gw00.e(new Pair("on_back_navigation_action", gwk0.J(rbxVar, scootersBduiNavigationAction2, qke.n(ScootersBduiNavigationAction.Companion.serializer())))));
        } else {
            map = ((ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary) n0n0Var).b;
        }
        Map map3 = ((ScootersBduiNavigationAction$ScreenIdentifier$Arbitrary) n0n0Var).a;
        String str = (String) b.g("pass_type", map3);
        String str2 = (String) b.g("intention", map3);
        for (ScootersPassesScreenRoute$PassType scootersPassesScreenRoute$PassType : ScootersPassesScreenRoute$PassType.a()) {
            if (jl40.l(scootersPassesScreenRoute$PassType.getValue(), str)) {
                for (ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention : ScootersPassesScreenRoute$Intention.a()) {
                    if (jl40.l(scootersPassesScreenRoute$Intention.getValue(), str2)) {
                        return new leo0(new ggo0(scootersPassesScreenRoute$PassType, scootersPassesScreenRoute$Intention, map != null ? map : null), scootersBduiNavigationAction.b);
                    }
                }
                w511.i("Collection contains no element matching the predicate.");
                return null;
            }
        }
        w511.i("Collection contains no element matching the predicate.");
        return null;
    }

    public static IllegalArgumentException b(kvj0 kvj0Var) {
        byte[] bytes;
        int i = kvj0Var.w;
        rvj0 rvj0Var = kvj0Var.z;
        return new IllegalArgumentException(oyr.k(i, "messenger's backend error, code = ", ", body = ", (rvj0Var == null || (bytes = rvj0Var.bytes()) == null) ? null : cvu0.q(bytes)));
    }

    public static final tse c(a aVar) {
        Closeable closeable = aVar.e;
        tse tseVar = closeable instanceof tse ? (tse) closeable : null;
        if (tseVar != null) {
            return tseVar;
        }
        dop0 dop0Var = ynp0.a;
        dop0Var.getClass();
        qhw0 a = jl40.a();
        dop0Var.getClass();
        sjh sjhVar = uyj.a;
        a931 a931Var = new a931(cvw.U(a, o400.a));
        aVar.e = a931Var;
        return a931Var;
    }
}
