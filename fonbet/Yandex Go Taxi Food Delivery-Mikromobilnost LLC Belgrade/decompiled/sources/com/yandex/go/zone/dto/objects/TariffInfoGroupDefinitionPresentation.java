package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xlw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TariffInfoGroupDefinitionPresentation;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/i6", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TariffInfoGroupDefinitionPresentation {
    public static final i6 Companion = new i6();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlw0(27)), null};
    public final TariffGroupDefinitionPresentationType a;
    public final TariffDefinitionPresentationModal b;

    public TariffInfoGroupDefinitionPresentation(int i, TariffGroupDefinitionPresentationType tariffGroupDefinitionPresentationType, TariffDefinitionPresentationModal tariffDefinitionPresentationModal) {
        this.a = (i & 1) == 0 ? TariffGroupDefinitionPresentationType.UNKNOWN : tariffGroupDefinitionPresentationType;
        if ((i & 2) != 0) {
            this.b = tariffDefinitionPresentationModal;
        } else {
            TariffDefinitionPresentationModal.Companion.getClass();
            this.b = TariffDefinitionPresentationModal.f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffInfoGroupDefinitionPresentation)) {
            return false;
        }
        TariffInfoGroupDefinitionPresentation tariffInfoGroupDefinitionPresentation = (TariffInfoGroupDefinitionPresentation) obj;
        return this.a == tariffInfoGroupDefinitionPresentation.a && jl40.l(this.b, tariffInfoGroupDefinitionPresentation.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TariffInfoGroupDefinitionPresentation(type=" + this.a + ", modal=" + this.b + Extension.C_BRAKE;
    }

    public TariffInfoGroupDefinitionPresentation() {
        TariffGroupDefinitionPresentationType tariffGroupDefinitionPresentationType = TariffGroupDefinitionPresentationType.UNKNOWN;
        TariffDefinitionPresentationModal.Companion.getClass();
        this.a = tariffGroupDefinitionPresentationType;
        this.b = TariffDefinitionPresentationModal.f;
    }
}
