package com.yandex.go.suggest.impl.data.flex.actions;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.yew0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/flex/actions/EnableSearchSectionLoadingStateAction;", "Lyew0;", "Companion", "$serializer", "com/yandex/go/suggest/impl/data/flex/actions/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EnableSearchSectionLoadingStateAction extends yew0 {
    public static final a Companion = new a();
    public final String a;

    public EnableSearchSectionLoadingStateAction(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, EnableSearchSectionLoadingStateAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnableSearchSectionLoadingStateAction) && jl40.l(this.a, ((EnableSearchSectionLoadingStateAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("EnableSearchSectionLoadingStateAction(sectionId=", this.a, Extension.C_BRAKE);
    }
}
