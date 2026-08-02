package com.yandex.go.payments.data.model.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z121;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class x1 extends y1 {
    public static final x1 INSTANCE = new x1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z121(2));

    @Override // defpackage.k2a0
    /* renamed from: a */
    public final String getA() {
        return "";
    }

    @Override // defpackage.k2a0
    /* renamed from: b */
    public final Availability getE() {
        return null;
    }

    @Override // com.yandex.go.payments.data.model.response.y1
    public final String c() {
        return "";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof x1);
    }

    public final int hashCode() {
        return -1215824666;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Unsupported";
    }
}
