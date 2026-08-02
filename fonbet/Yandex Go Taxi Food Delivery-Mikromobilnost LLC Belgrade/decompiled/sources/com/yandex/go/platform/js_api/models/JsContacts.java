package com.yandex.go.platform.js_api.models;

import com.yandex.go.platform.js_api.contact.Contact$$serializer;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qje;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsContacts;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/f", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class JsContacts {
    public static final f Companion = new f();
    public static final KSerializer[] b = {new p53(Contact$$serializer.INSTANCE, 0)};
    public final List a;

    public /* synthetic */ JsContacts(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, JsContacts$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsContacts) && jl40.l(this.a, ((JsContacts) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.t(new StringBuilder("JsContacts(contacts="), this.a, ')');
    }

    public JsContacts(List list) {
        this.a = list;
    }
}
