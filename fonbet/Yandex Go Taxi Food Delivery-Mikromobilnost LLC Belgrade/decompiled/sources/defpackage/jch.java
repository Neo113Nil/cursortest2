package defpackage;

import com.google.common.primitives.a;
import java.util.ArrayList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class jch {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public dlh a;
    public boolean b;
    public final boolean c;

    public jch(boolean z) {
        this.c = z;
        this.a = new dlh();
    }

    public static void a(int i, ArrayList arrayList) {
        if (a.c(d, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final androidx.media3.common.a b(androidx.media3.common.a aVar) {
        if (!this.b || !this.a.supportsFormat(aVar)) {
            return aVar;
        }
        f7s a = aVar.a();
        String str = aVar.k;
        a.m = eh20.q("application/x-media3-cues");
        a.I = this.a.a(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        a.j = sb.toString();
        a.r = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        return new androidx.media3.common.a(a);
    }

    public jch() {
        this(true);
    }
}
