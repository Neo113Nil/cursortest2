package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5334z2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5304xm fromModel(@NonNull C5309y2 c5309y2) {
        C5254vm c5254vm;
        C5304xm c5304xm = new C5304xm();
        c5304xm.a = new C5279wm[c5309y2.a.size()];
        for (int i = 0; i < c5309y2.a.size(); i++) {
            C5279wm c5279wm = new C5279wm();
            Pair pair = (Pair) c5309y2.a.get(i);
            c5279wm.a = (String) pair.first;
            if (pair.second != null) {
                c5279wm.b = new C5254vm();
                C5284x2 c5284x2 = (C5284x2) pair.second;
                if (c5284x2 == null) {
                    c5254vm = null;
                } else {
                    C5254vm c5254vm2 = new C5254vm();
                    c5254vm2.a = c5284x2.a;
                    c5254vm = c5254vm2;
                }
                c5279wm.b = c5254vm;
            }
            c5304xm.a[i] = c5279wm;
        }
        return c5304xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5309y2 toModel(@NonNull C5304xm c5304xm) {
        ArrayList arrayList = new ArrayList();
        for (C5279wm c5279wm : c5304xm.a) {
            String str = c5279wm.a;
            C5254vm c5254vm = c5279wm.b;
            arrayList.add(new Pair(str, c5254vm == null ? null : new C5284x2(c5254vm.a)));
        }
        return new C5309y2(arrayList);
    }
}
