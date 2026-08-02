package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.x0;
import java.util.function.Consumer;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes6.dex */
public final class hkz0 extends x0 {
    public static final /* synthetic */ int R = 0;
    public final ButtonComponent N;
    public Consumer O;
    public final qg P;
    public final /* synthetic */ ikz0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkz0(ikz0 ikz0Var, View view) {
        super(view);
        this.Q = ikz0Var;
        ButtonComponent buttonComponent = (ButtonComponent) view.findViewById(agh0.button);
        this.N = buttonComponent;
        this.O = new c90(24);
        qg qgVar = new qg();
        this.P = qgVar;
        b.p(buttonComponent, qgVar);
    }
}
