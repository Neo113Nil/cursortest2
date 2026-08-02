package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.photo.editor.features.colorgrading.ColorGradingTool;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photo.editor.views.ToolButton;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i6g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                final ColorGradingTool colorGradingTool = (ColorGradingTool) this.c;
                final HashMap hashMap = (HashMap) this.d;
                final HashMap hashMap2 = (HashMap) this.e;
                final ToolButton toolButton = (ToolButton) this.f;
                final FrameLayout frameLayout = (FrameLayout) this.g;
                l3p.a("resizingColorGrading", new izs() { // from class: xsna.j6g
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        ColorGradingTool.this.J((gzs) obj2);
                        Iterator it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            ((ToolButton) it.next()).setSelected(false);
                        }
                        Iterator it2 = hashMap2.values().iterator();
                        while (it2.hasNext()) {
                            ((View) it2.next()).setVisibility(8);
                        }
                        toolButton.setSelected(true);
                        frameLayout.setVisibility(0);
                        return s3q0.a;
                    }
                });
                colorGradingTool.n.b(b.f.a);
                break;
            default:
                dmb0 dmb0Var = (dmb0) this.c;
                uxe0 uxe0Var = (uxe0) this.d;
                izs izsVar = (izs) this.e;
                wh50 wh50Var = (wh50) this.f;
                wh50 wh50Var2 = (wh50) this.g;
                ov70 ov70Var = (ov70) obj;
                if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                    wh50Var2.setValue(Integer.valueOf(rxe0.d(Float.intBitsToFloat((int) (ov70Var.a >> 32)), dmb0Var.I0(uxe0Var.a), dmb0Var.I0(uxe0Var.c))));
                    izsVar.invoke(Integer.valueOf(((Number) wh50Var2.getValue()).intValue()));
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }
}
