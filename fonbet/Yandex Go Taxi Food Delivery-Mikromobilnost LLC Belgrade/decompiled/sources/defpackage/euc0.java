package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetSection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class euc0 implements j4q0 {
    public final buc0 a;
    public final icc0 b;

    public euc0(buc0 buc0Var, icc0 icc0Var) {
        this.a = buc0Var;
        this.b = icc0Var;
    }

    @Override // defpackage.j4q0
    public final i4q0 create() {
        return new i4q0("superapp_plaque_widget", qoi0.a(PlaqueWidgetSection.class), PlaqueWidgetSection.Companion.serializer(), this.a, new weu(25, this.b), Collections.singletonList(qoi0.a(mtc0.class)));
    }
}
