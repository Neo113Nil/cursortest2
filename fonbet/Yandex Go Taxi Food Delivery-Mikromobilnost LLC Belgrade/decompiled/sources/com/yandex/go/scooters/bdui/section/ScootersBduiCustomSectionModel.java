package com.yandex.go.scooters.bdui.section;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.pyp0;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/bdui/section/ScootersBduiCustomSectionModel;", "Lpyp0;", "Companion", "$serializer", "com/yandex/go/scooters/bdui/section/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ScootersBduiCustomSectionModel extends pyp0 {
    public static final a Companion = new a();
    public final String a;
    public final boolean b;

    public /* synthetic */ ScootersBduiCustomSectionModel(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ScootersBduiCustomSectionModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getF() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScootersBduiCustomSectionModel) && jl40.l(this.a, ((ScootersBduiCustomSectionModel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ScootersBduiCustomSectionModel(id=", this.a, Extension.C_BRAKE);
    }

    public ScootersBduiCustomSectionModel() {
        this.a = "scooters_bdui_loading_state_section";
    }
}
