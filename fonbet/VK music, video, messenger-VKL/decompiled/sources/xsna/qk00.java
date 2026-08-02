package xsna;

import android.location.Location;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import kotlin.NoWhenBranchMatchedException;
import xsna.pk00;

/* compiled from: MapCenterReducer.kt */
/* loaded from: classes18.dex */
public final class qk00 {
    public final alt a = new alt();

    public qk00(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final tj00 a(tj00 tj00Var, pk00 pk00Var) {
        boolean z;
        if (pk00Var instanceof pk00.b) {
            pk00.b bVar = (pk00.b) pk00Var;
            return tj00.a(tj00Var, bVar.a, bVar.b, 8);
        }
        if (pk00Var instanceof pk00.c) {
            return tj00.a(tj00Var, null, false, 11);
        }
        if (!(pk00Var instanceof pk00.a)) {
            throw new NoWhenBranchMatchedException();
        }
        gk9 gk9Var = ((pk00.a) pk00Var).a;
        boolean z2 = tj00Var.d;
        boolean z3 = tj00Var.b;
        gk9 gk9Var2 = tj00Var.a;
        if (z2) {
            z = 0;
        } else {
            Coordinates coordinates = gk9Var2.a;
            Coordinates coordinates2 = gk9Var.a;
            double d = coordinates.b;
            double d2 = 2;
            z = 0;
            double a = an10.a(d * ((int) r3)) / Math.pow(10.0d, d2);
            double d3 = coordinates.c;
            Coordinates coordinates3 = new Coordinates(a, an10.a(((int) r2) * d3) / Math.pow(10.0d, d2));
            double d4 = coordinates2.b;
            double a2 = an10.a(d4 * ((int) r9)) / Math.pow(10.0d, d2);
            double d5 = coordinates2.c;
            if (!coordinates3.equals(new Coordinates(a2, an10.a(d5 * ((int) r11)) / Math.pow(10.0d, d2)))) {
                return tj00.a(tj00Var, new gk9(gk9Var2.a, new vm00(gk9Var2.b.a + 0.01f)), z3, 8);
            }
        }
        Coordinates coordinates4 = gk9Var2.a;
        Coordinates coordinates5 = gk9Var.a;
        this.a.getClass();
        float[] fArr = new float[3];
        Location.distanceBetween(coordinates4.b, coordinates4.c, coordinates5.b, coordinates5.c, fArr);
        if (an10.b(fArr[z]) > 4) {
            z3 = z;
        }
        return new tj00(gk9Var, z3, z, true);
    }
}
