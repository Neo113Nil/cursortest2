package xsna;

import android.content.Context;
import com.vk.core.view.components.counter.VkCounter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oy5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ oy5(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VkCounter vkCounter = new VkCounter((Context) obj, null);
                vkCounter.setSize(VkCounter.Size.Medium);
                vkCounter.setMode(VkCounter.Mode.Primary);
                vkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.AccentGreen);
                vkCounter.setCounterWithoutAnimation(((Number) this.c.getValue()).intValue());
                break;
            case 1:
                ((tdu) obj).b(((Number) this.c.getValue()).floatValue());
                break;
            default:
                ((tdu) obj).b(1.0f - ((Number) this.c.getValue()).floatValue());
                break;
        }
        return s3q0.a;
    }
}
