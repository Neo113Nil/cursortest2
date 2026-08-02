package com.yandex.go.flex.main_screen.data.widgets.plaque;

import com.yandex.go.flex.main_screen.data.widgets.layout.dto.LayoutDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/plaque/PlaqueWidgetData;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/plaque/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlaqueWidgetData {
    public static final a Companion = new a();
    public final LayoutDto a;

    public /* synthetic */ PlaqueWidgetData(int i, LayoutDto layoutDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = layoutDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlaqueWidgetData) && jl40.l(this.a, ((PlaqueWidgetData) obj).a);
    }

    public final int hashCode() {
        LayoutDto layoutDto = this.a;
        if (layoutDto == null) {
            return 0;
        }
        return layoutDto.hashCode();
    }

    public final String toString() {
        return "PlaqueWidgetData(layout=" + this.a + Extension.C_BRAKE;
    }

    public PlaqueWidgetData() {
        this.a = null;
    }
}
