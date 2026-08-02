package xsna;

import android.view.View;
import com.vk.core.view.components.formitem.VkFormField;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z95 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ z95(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                gzsVar.invoke();
                break;
            default:
                List<Class<? extends View>> list = VkFormField.C;
                gzsVar.invoke();
                break;
        }
        return s3q0.a;
    }
}
