package defpackage;

import com.yandex.go.chargers.api.ChargersOpenReason;

/* loaded from: classes12.dex */
public final class o2a implements s2a {
    public final String a;
    public final String b;

    public o2a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.s2a
    public final ChargersOpenReason j() {
        return ChargersOpenReason.DISCOUNTS_FROM_FEEDBACK;
    }
}
