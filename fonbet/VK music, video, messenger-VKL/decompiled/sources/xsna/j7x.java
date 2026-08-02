package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.core.preference.Preference;
import com.vk.instantjobs.components.appstate.AppState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j7x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j7x(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                r7x r7xVar = (r7x) obj;
                int i3 = r7x.c.$EnumSwitchMapping$1[((AppState) obj2).ordinal()];
                int i4 = 2;
                int i5 = 1;
                if (i3 == 1) {
                    ArrayList c = r7xVar.c(new q6b(new t45(i5), i4), new dlc(i4));
                    ArrayList arrayList = new ArrayList(c5g.u(c, 10));
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((r7x.a) it.next()).b().d().l(r7xVar.e)));
                    }
                    Iterator it2 = j5g.S0(arrayList).iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        if (r7xVar.f(intValue)) {
                            r7xVar.h(intValue);
                        } else {
                            Handler handler = com.vk.instantjobs.services.a.a;
                            com.vk.instantjobs.services.a.a.post(new pn3(1, new xyx(r7xVar.a, intValue)));
                        }
                    }
                } else if (i3 == 2) {
                    r7xVar.n(new m3w(i5));
                } else if (i3 == 3) {
                    r7xVar.n(new l7x(i2));
                } else if (i3 == 4) {
                    r7xVar.n(new m7x());
                } else if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            default:
                return Preference.h((Context) obj2, 0, "plain_" + ((String) obj));
        }
    }
}
