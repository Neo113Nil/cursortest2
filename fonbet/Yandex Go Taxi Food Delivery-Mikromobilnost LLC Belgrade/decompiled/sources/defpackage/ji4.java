package defpackage;

import android.graphics.Color;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.core.graphql.type.BackgroundGradientTvTypeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class ji4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.yandex.plus.core.data.common.PlusGradient$Linear] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PlusColor a(String str, List list) {
        PlusGradient.Radial radial;
        List b;
        if (str != null) {
            Integer b2 = bob1.b(str);
            PlusColor.Color color = b2 != null ? new PlusColor.Color(b2.intValue()) : null;
            if (color != null) {
                return color;
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                di4 di4Var = (di4) it.next();
                if (di4Var != null) {
                    BackgroundGradientTvTypeView backgroundGradientTvTypeView = di4Var.e;
                    fi4 fi4Var = di4Var.c;
                    gi4 gi4Var = di4Var.d;
                    ArrayList<ei4> arrayList2 = di4Var.b;
                    int i = ii4.a[backgroundGradientTvTypeView.ordinal()];
                    if (i == 1) {
                        List b3 = b(arrayList2);
                        if (b3 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (ei4 ei4Var : arrayList2) {
                                Double valueOf = ei4Var != null ? Double.valueOf(ei4Var.c) : null;
                                if (valueOf != null) {
                                    arrayList3.add(valueOf);
                                }
                            }
                            radial = new PlusGradient.Linear(b3, arrayList3, di4Var.a);
                        }
                    } else if (i == 2 && gi4Var != null && fi4Var != null && (b = b(arrayList2)) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (ei4 ei4Var2 : arrayList2) {
                            Double valueOf2 = ei4Var2 != null ? Double.valueOf(ei4Var2.c) : null;
                            if (valueOf2 != null) {
                                arrayList4.add(valueOf2);
                            }
                        }
                        radial = new PlusGradient.Radial(b, arrayList4, new Pair(Double.valueOf(gi4Var.a), Double.valueOf(gi4Var.b)), new Pair(Double.valueOf(fi4Var.a), Double.valueOf(fi4Var.b)));
                    }
                    if (radial == null) {
                        arrayList.add(radial);
                    }
                }
                radial = null;
                if (radial == null) {
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new PlusColor.Gradient(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static List b(ArrayList arrayList) {
        ?? failure;
        try {
            failure = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ei4 ei4Var = (ei4) it.next();
                Integer valueOf = ei4Var != null ? Integer.valueOf(lhc.f(Color.parseColor(ei4Var.b), ((int) (ei4Var.a * 255.0d)) & 255)) : null;
                if (valueOf != null) {
                    failure.add(valueOf);
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return failure instanceof Result.Failure ? null : failure;
    }
}
