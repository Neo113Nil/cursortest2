package com.yandex.go.flex.main_screen.data.widgets.plaque;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.pyp0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/plaque/PlaqueWidgetSection;", "Lpyp0;", "Companion", "com/yandex/go/flex/main_screen/data/widgets/plaque/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PlaqueWidgetSection extends pyp0 {
    public static final c Companion = new c();
    public final PlaqueWidgetData a;
    public final String b;
    public final boolean c;

    public /* synthetic */ PlaqueWidgetSection(int i, PlaqueWidgetData plaqueWidgetData, String str, boolean z) {
        this.a = (i & 1) == 0 ? null : plaqueWidgetData;
        if ((i & 2) == 0) {
            this.b = "superapp_plaque_widget";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaqueWidgetSection) && jl40.l(this.a, ((PlaqueWidgetSection) obj).a);
    }

    public final int hashCode() {
        PlaqueWidgetData plaqueWidgetData = this.a;
        if (plaqueWidgetData == null) {
            return 0;
        }
        return plaqueWidgetData.hashCode();
    }

    public final String toString() {
        return "PlaqueWidgetSection(data=" + this.a + Extension.C_BRAKE;
    }

    public PlaqueWidgetSection(int i) {
        this.a = null;
        this.b = "superapp_plaque_widget";
    }

    public PlaqueWidgetSection() {
        this(0);
    }
}
