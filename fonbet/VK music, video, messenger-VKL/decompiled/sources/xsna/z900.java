package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.x900;

/* compiled from: LutListItemToLutWrapperMapper.kt */
/* loaded from: classes4.dex */
public final class z900 {
    public static aa00 a(v900 v900Var) {
        x900 x900Var = v900Var.f;
        ArrayList arrayList = null;
        if (!epx.f(x900Var, x900.a.a)) {
            if (x900Var instanceof x900.b) {
                List<Bitmap> list = ((x900.b) x900Var).a;
                arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ld7((Bitmap) it.next()));
                }
            } else if (!epx.f(x900Var, x900.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new aa00(String.valueOf(v900Var.c), v900Var.d, arrayList, v900Var.e);
    }

    public static aa00 b(y900 y900Var) {
        if (y900Var instanceof v900) {
            return a((v900) y900Var);
        }
        if (y900Var instanceof w900) {
            return a((v900) j5g.Y(((w900) y900Var).f));
        }
        throw new NoWhenBranchMatchedException();
    }
}
