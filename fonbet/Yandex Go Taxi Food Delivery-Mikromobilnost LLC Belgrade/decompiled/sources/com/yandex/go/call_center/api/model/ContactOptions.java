package com.yandex.go.call_center.api.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.m3e;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/call_center/api/model/ContactOptions;", "", "Companion", "$serializer", "com/yandex/go/call_center/api/model/c", "go-client-android.features.call_center:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactOptions {
    public static final c Companion = new c();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(8))};
    public final List a;

    public /* synthetic */ ContactOptions(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ContactOptions) && jl40.l(this.a, ((ContactOptions) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ContactOptions(callCenters=", Extension.C_BRAKE, this.a);
    }

    public ContactOptions() {
        this.a = EmptyList.a;
    }
}
