package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.o3z;
import defpackage.qje;
import defpackage.yvz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties;", "", "Companion", "yvz", "$serializer", "com/yandex/go/flex/common/descriptors/section/payments/loyalty/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoyaltyProgressViewProperties {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(25)), null, null};
    public final float a;
    public final String b;
    public final yvz c;
    public final int d;
    public final int e;

    public /* synthetic */ LoyaltyProgressViewProperties(int i, float f2, String str, yvz yvzVar, int i2, int i3) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, LoyaltyProgressViewProperties$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = f2;
        this.b = str;
        this.c = yvzVar;
        this.d = i2;
        this.e = i3;
    }
}
