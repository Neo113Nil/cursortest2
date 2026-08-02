package defpackage;

import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class q0s0 extends s45 {
    public final /* synthetic */ r0s0 a;
    public final /* synthetic */ SourcePicker b;
    public final /* synthetic */ ShortcutsModalView c;
    public final /* synthetic */ PointType d;

    public q0s0(r0s0 r0s0Var, SourcePicker sourcePicker, ShortcutsModalView shortcutsModalView, PointType pointType) {
        this.a = r0s0Var;
        this.b = sourcePicker;
        this.c = shortcutsModalView;
        this.d = pointType;
    }

    @Override // defpackage.s45
    public final void a(int i) {
        if (this.b != SourcePicker.SHORTCUT_REQUESTED_FROM_HOME) {
            this.c.showEditAddress(this.d);
        }
    }

    @Override // defpackage.s45
    public final void b() {
        this.a.i.h(PerformanceScreenName.TaxiMain);
    }
}
