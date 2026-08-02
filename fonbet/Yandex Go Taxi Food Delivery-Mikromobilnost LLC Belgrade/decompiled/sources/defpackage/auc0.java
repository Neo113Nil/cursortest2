package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.layout.dto.EdgeInsetsDto;
import com.yandex.go.flex.main_screen.data.widgets.layout.dto.LayoutDto;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetData;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetSection;

/* loaded from: classes12.dex */
public final class auc0 extends f0q0 {
    public final PlaqueWidgetSection g;
    public final ntc0 h = new ntc0();

    public auc0(PlaqueWidgetSection plaqueWidgetSection) {
        this.g = plaqueWidgetSection;
    }

    @Override // defpackage.f0q0
    public final void b() {
        this.h.getClass();
        PlaqueWidgetData plaqueWidgetData = this.g.a;
        hzx hzxVar = null;
        LayoutDto layoutDto = plaqueWidgetData != null ? plaqueWidgetData.a : null;
        if (layoutDto != null) {
            EdgeInsetsDto edgeInsetsDto = layoutDto.a;
            hzxVar = new hzx(edgeInsetsDto != null ? new lkn(edgeInsetsDto.getA(), edgeInsetsDto.getB(), edgeInsetsDto.getC(), edgeInsetsDto.getD()) : null);
        }
        this.f.C(new mtc0(hzxVar));
    }
}
