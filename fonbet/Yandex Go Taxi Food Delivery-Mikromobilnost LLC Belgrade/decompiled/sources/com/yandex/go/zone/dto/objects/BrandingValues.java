package com.yandex.go.zone.dto.objects;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/BrandingValues;", "", "Companion", "com/yandex/go/zone/dto/objects/l", "$serializer", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BrandingValues {
    public static final l Companion = new l();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(25))};
    public static final BrandingValues c = new BrandingValues(0);
    public final Map a;

    public /* synthetic */ BrandingValues(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = kotlin.collections.b.f();
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BrandingValues) && jl40.l(this.a, ((BrandingValues) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("BrandingValues(args=", Extension.C_BRAKE, this.a);
    }

    public BrandingValues() {
        this(0);
    }

    public BrandingValues(int i) {
        this.a = kotlin.collections.b.f();
    }
}
