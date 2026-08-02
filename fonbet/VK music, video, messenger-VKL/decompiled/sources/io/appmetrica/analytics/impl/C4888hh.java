package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4888hh extends AbstractC4733bh {
    public final Y8 b;

    public C4888hh(@NonNull C4927j5 c4927j5) {
        this(c4927j5, c4927j5.j());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        EnumC5088pa enumC5088pa;
        if (!TextUtils.isEmpty(c4722b6.getName())) {
            Y8 y8 = this.b;
            String name = c4722b6.getName();
            if (y8.c == null) {
                y8.a();
            }
            int hashCode = name.hashCode();
            if (y8.c.b.contains(Integer.valueOf(hashCode))) {
                enumC5088pa = EnumC5088pa.NON_FIRST_OCCURENCE;
            } else {
                C4699a9 c4699a9 = y8.c;
                EnumC5088pa enumC5088pa2 = c4699a9.a ? EnumC5088pa.FIRST_OCCURRENCE : EnumC5088pa.UNKNOWN;
                if (c4699a9.d < 1000) {
                    c4699a9.b.add(Integer.valueOf(hashCode));
                    c4699a9.d++;
                } else {
                    c4699a9.a = false;
                }
                C4777d9 c4777d9 = y8.b;
                C4699a9 c4699a92 = y8.c;
                IBinaryDataHelper iBinaryDataHelper = c4777d9.c;
                C4751c9 c4751c9 = c4777d9.b;
                c4777d9.a.getClass();
                iBinaryDataHelper.insert("event_hashes", c4751c9.toByteArray((C4751c9) C4725b9.a(c4699a92)));
                enumC5088pa = enumC5088pa2;
            }
            c4722b6.k = enumC5088pa;
        }
        return false;
    }

    public C4888hh(C4927j5 c4927j5, Y8 y8) {
        super(c4927j5);
        this.b = y8;
    }
}
