package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public abstract class jkw0 {
    public final int a;

    public jkw0(int i) {
        this.a = i;
    }

    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    public abstract void b(ufs ufsVar);

    public abstract void c(ufs ufsVar, int i, int i2);

    public abstract void d(ufs ufsVar);

    public abstract void e(hkw0 hkw0Var, int i, int i2);
}
