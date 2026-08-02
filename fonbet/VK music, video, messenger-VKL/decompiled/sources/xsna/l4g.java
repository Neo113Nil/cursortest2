package xsna;

import android.widget.CompoundButton;
import com.vk.superapp.core.api.models.VkGender;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l4g implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l4g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                f4g f4gVar = ((n4g) this.c).b;
                f4gVar.c = j4g.a(f4gVar.c, false, z, null, false, 13);
                f4gVar.a();
                break;
            default:
                q60 q60Var = (q60) this.c;
                if (z) {
                    q60Var.invoke(VkGender.MALE);
                    break;
                }
                break;
        }
    }
}
