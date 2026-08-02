package com.yandex.go.taxi.order.models.api.preorder;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.wrp0;
import defpackage.x4e;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/preorder/SelectedTariffInfo;", "", "Companion", "com/yandex/go/taxi/order/models/api/preorder/c", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SelectedTariffInfo {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(16)), null};
    public static final SelectedTariffInfo e = new SelectedTariffInfo(0);
    public final String a;
    public final Set b;
    public final boolean c;

    public /* synthetic */ SelectedTariffInfo(int i, String str, Set set, boolean z) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptySet.a;
        } else {
            this.b = set;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedTariffInfo)) {
            return false;
        }
        SelectedTariffInfo selectedTariffInfo = (SelectedTariffInfo) obj;
        return jl40.l(this.a, selectedTariffInfo.a) && jl40.l(this.b, selectedTariffInfo.b) && this.c == selectedTariffInfo.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + g8e.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedTariffInfo(tariffClassName=");
        sb.append(this.a);
        sb.append(", requiredTariffClassNames=");
        sb.append(this.b);
        sb.append(", isMulticlass=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public SelectedTariffInfo() {
        this(0);
    }

    public SelectedTariffInfo(String str, Set set, boolean z) {
        this.a = str;
        this.b = set;
        this.c = z;
    }

    public /* synthetic */ SelectedTariffInfo(int i) {
        this(null, EmptySet.a, false);
    }
}
