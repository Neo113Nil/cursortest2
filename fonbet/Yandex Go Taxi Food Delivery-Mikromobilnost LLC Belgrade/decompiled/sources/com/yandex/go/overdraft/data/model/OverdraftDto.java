package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/OverdraftDto;", "", "Companion", "com/yandex/go/overdraft/data/model/z", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OverdraftDto {
    public static final z Companion = new z();
    public static final OverdraftDto b = new OverdraftDto(0);
    public final boolean a;

    public /* synthetic */ OverdraftDto(int i, boolean z) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
    }

    /* renamed from: a, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftDto) && this.a == ((OverdraftDto) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("OverdraftDto(isAvailable=", Extension.C_BRAKE, this.a);
    }

    public OverdraftDto(int i) {
        this.a = false;
    }

    public OverdraftDto() {
        this(0);
    }
}
