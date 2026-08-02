package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/RecipientDetailsStep;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/o3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RecipientDetailsStep {
    public static final o3 Companion = new o3();
    public final OrderButtonOverride a;

    public /* synthetic */ RecipientDetailsStep(int i, OrderButtonOverride orderButtonOverride) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = orderButtonOverride;
        }
    }

    /* renamed from: a, reason: from getter */
    public final OrderButtonOverride getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecipientDetailsStep) && jl40.l(this.a, ((RecipientDetailsStep) obj).a);
    }

    public final int hashCode() {
        OrderButtonOverride orderButtonOverride = this.a;
        if (orderButtonOverride == null) {
            return 0;
        }
        return orderButtonOverride.hashCode();
    }

    public final String toString() {
        return "RecipientDetailsStep(orderButtonOverride=" + this.a + Extension.C_BRAKE;
    }

    public RecipientDetailsStep() {
        this.a = null;
    }
}
