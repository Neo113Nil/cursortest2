package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes.dex */
public interface plk {
    public static final olk a = new olk();

    void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar);

    View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar);

    boolean isCustomTypeSupported(String str);

    default f5l preload(clk clkVar, c5l c5lVar) {
        return ngd0.x;
    }

    void release(View view, clk clkVar);
}
