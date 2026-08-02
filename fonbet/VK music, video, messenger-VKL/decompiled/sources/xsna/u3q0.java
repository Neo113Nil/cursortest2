package xsna;

import android.health.connect.datatypes.units.Energy;
import android.health.connect.datatypes.units.Length;
import android.health.connect.datatypes.units.Mass;
import xsna.c2z;
import xsna.vi10;

/* compiled from: UnitConverters.kt */
/* loaded from: classes12.dex */
public final class u3q0 {
    public static final vi10 a(Mass mass) {
        double inGrams;
        inGrams = mass.getInGrams();
        if (inGrams == Double.MIN_VALUE) {
            mass = null;
        }
        if (mass != null) {
            return f(mass);
        }
        return null;
    }

    public static final Energy b(jlp jlpVar) {
        Energy fromCalories;
        fromCalories = Energy.fromCalories(jlpVar.a());
        return fromCalories;
    }

    public static final Length c(c2z c2zVar) {
        Length fromMeters;
        fromMeters = Length.fromMeters(c2zVar.a());
        return fromMeters;
    }

    public static final Mass d(vi10 vi10Var) {
        Mass fromGrams;
        fromGrams = Mass.fromGrams(vi10Var.a());
        return fromGrams;
    }

    public static final c2z e(Length length) {
        double inMeters;
        c2z.a aVar = c2z.d;
        inMeters = length.getInMeters();
        aVar.getClass();
        return c2z.a.a(inMeters);
    }

    public static final vi10 f(Mass mass) {
        double inGrams;
        vi10.a aVar = vi10.d;
        inGrams = mass.getInGrams();
        aVar.getClass();
        return vi10.a.a(inGrams);
    }
}
