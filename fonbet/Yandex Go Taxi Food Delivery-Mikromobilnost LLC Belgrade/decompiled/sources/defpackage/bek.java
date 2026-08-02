package defpackage;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class bek {
    public final Div2View a;
    public final LinkedHashMap b = new LinkedHashMap();

    public bek(Div2View div2View) {
        this.a = div2View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ydk a(View view, String str) {
        ydk ydkVar;
        egk d;
        if (view instanceof msk) {
            m3k div = ((msk) view).getDiv();
            List z = (div == null || (d = div.d()) == null) ? null : d.z();
            if (z != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : z) {
                    if (jl40.l(((ydk) obj).c().getId(), str)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty() && arrayList.size() <= 1) {
                    ydkVar = (ydk) a.P(arrayList);
                    if (ydkVar == null) {
                        return ydkVar;
                    }
                    Object parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        return a(view2, str);
                    }
                }
            }
            ydkVar = null;
            if (ydkVar == null) {
            }
        } else {
            if (view instanceof Div2View) {
                hi91.f(this.a, new RuntimeException(unr0.l('\'', "Unable to find animator with id '", str)));
                return null;
            }
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return a(view3, str);
            }
        }
        return null;
    }
}
