package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.xlw0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffInfoViewSection;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/j6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffInfoViewSection {
    public static final j6 Companion = new j6();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(28))};
    public final String a;
    public final List b;

    public /* synthetic */ TariffInfoViewSection(int i, String str, List list) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffInfoViewSection)) {
            return false;
        }
        TariffInfoViewSection tariffInfoViewSection = (TariffInfoViewSection) obj;
        return jl40.l(this.a, tariffInfoViewSection.a) && jl40.l(this.b, tariffInfoViewSection.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("TariffInfoViewSection(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }

    public TariffInfoViewSection() {
        this.a = null;
        this.b = EmptyList.a;
    }
}
