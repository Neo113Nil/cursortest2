package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;

/* loaded from: classes13.dex */
public final class gcl0 extends ncl0 {
    public final /* synthetic */ int O = 1;
    public final pvn P;

    public gcl0(View view) {
        super(view);
        this.P = pvn.a;
        int i = h7h0.route_stop_header;
        WeakHashMap weakHashMap = b.a;
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(view, i));
        listItemComponent.setDividers(DividerPosition.BOTTOM, DividerType.ICON);
        listItemComponent.setTitle(kyh0.delivery_multipoints_list_header_title);
        b.q(listItemComponent, true);
    }

    private final void a0(zfu0 zfu0Var) {
    }

    private final void b0(zfu0 zfu0Var) {
    }

    private final void c0(int i, boolean z) {
    }

    private final void d0(int i, boolean z) {
    }

    @Override // defpackage.ncl0
    public final void W(zfu0 zfu0Var) {
        int i = this.O;
    }

    @Override // defpackage.ncl0
    public final void X(int i, boolean z) {
        int i2 = this.O;
    }

    @Override // defpackage.ncl0
    public final tpr Y() {
        switch (this.O) {
        }
        return this.P;
    }

    @Override // defpackage.ncl0
    public final boolean Z() {
        switch (this.O) {
        }
        return false;
    }

    public gcl0(View view, sls slsVar, String str) {
        super(view);
        this.P = pvn.a;
        int i = h7h0.route_stop_view_add_stop;
        WeakHashMap weakHashMap = b.a;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(view, i));
        buttonComponent.setOnClickListener(new fcl0(0, slsVar));
        buttonComponent.setText(str);
    }
}
