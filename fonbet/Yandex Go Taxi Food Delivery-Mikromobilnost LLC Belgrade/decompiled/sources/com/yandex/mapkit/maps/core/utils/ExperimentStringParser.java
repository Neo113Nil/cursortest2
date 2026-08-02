package com.yandex.mapkit.maps.core.utils;

import defpackage.avu0;
import defpackage.e2k;
import defpackage.evu0;
import defpackage.h73;
import defpackage.l0o;
import defpackage.tls;
import defpackage.uvc;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\u0004\b\u0000\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/ExperimentStringParser;", "", "<init>", "()V", "T", "", "string", "Lkotlin/Function1;", "", "", "transformation", "toPointsFromExperiment", "(Ljava/lang/String;Ltls;)Ljava/util/List;", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExperimentStringParser {
    public static final ExperimentStringParser INSTANCE = new ExperimentStringParser();

    private ExperimentStringParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List toPointsFromExperiment$lambda$0(String str) {
        List W;
        W = evu0.W(str, new String[]{"-"}, (r2 & 4) != 0 ? 0 : 2);
        return W;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List toPointsFromExperiment$lambda$1(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Float j = avu0.j((String) it.next());
            if (j != null) {
                arrayList.add(j);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toPointsFromExperiment$lambda$2(List list) {
        return list.size() == 2;
    }

    public final <T> List<T> toPointsFromExperiment(String string, tls transformation) {
        List W;
        if (string == null) {
            return null;
        }
        W = evu0.W(string, new String[]{"|"}, (r2 & 4) != 0 ? 0 : 2);
        int i = 2;
        List<T> s = b.s(new yw01(new e2k(i, b.g(new yw01(new yw01(new h73(1, W), new l0o(9)), new l0o(10)), new l0o(11)), new Comparator() { // from class: com.yandex.mapkit.maps.core.utils.ExperimentStringParser$toPointsFromExperiment$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return uvc.b((Float) ((List) t).get(0), (Float) ((List) t2).get(0));
            }
        }), transformation));
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
}
