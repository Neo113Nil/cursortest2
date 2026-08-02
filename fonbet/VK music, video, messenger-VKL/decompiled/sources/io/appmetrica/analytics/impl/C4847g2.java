package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4847g2 implements ProtobufConverter {
    public final H2 a;

    public C4847g2() {
        this(new H2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4924j2 fromModel(@NonNull C4821f2 c4821f2) {
        C4924j2 c4924j2 = new C4924j2();
        c4924j2.a = new C4899i2[c4821f2.a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : c4821f2.a) {
            C4899i2[] c4899i2Arr = c4924j2.a;
            C4899i2 c4899i2 = new C4899i2();
            c4899i2.a = permissionState.name;
            c4899i2.b = permissionState.granted;
            c4899i2Arr[i2] = c4899i2;
            i2++;
        }
        J2 j2 = c4821f2.b;
        if (j2 != null) {
            c4924j2.b = this.a.fromModel(j2);
        }
        c4924j2.c = new String[c4821f2.c.size()];
        Iterator it = c4821f2.c.iterator();
        while (it.hasNext()) {
            c4924j2.c[i] = (String) it.next();
            i++;
        }
        return c4924j2;
    }

    public C4847g2(H2 h2) {
        this.a = h2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4821f2 toModel(@NonNull C4924j2 c4924j2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C4899i2[] c4899i2Arr = c4924j2.a;
            if (i2 >= c4899i2Arr.length) {
                break;
            }
            C4899i2 c4899i2 = c4899i2Arr[i2];
            arrayList.add(new PermissionState(c4899i2.a, c4899i2.b));
            i2++;
        }
        C4873h2 c4873h2 = c4924j2.b;
        J2 model = c4873h2 != null ? this.a.toModel(c4873h2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c4924j2.c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new C4821f2(arrayList, model, arrayList2);
            }
        }
    }
}
