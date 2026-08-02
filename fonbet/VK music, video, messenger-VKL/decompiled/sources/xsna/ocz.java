package xsna;

import android.widget.CompoundButton;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import xsna.mcz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ocz implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    public /* synthetic */ ocz(VkCheckboxItem.a aVar, VkCheckboxItem vkCheckboxItem) {
        this.c = aVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zcz) obj).e.onNext(new mcz.g(z));
                break;
            default:
                VkCheckboxItem.a aVar = (VkCheckboxItem.a) obj;
                int i2 = VkCheckboxItem.x;
                if (aVar != null) {
                    aVar.b(z);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ocz(zcz zczVar) {
        this.c = zczVar;
    }
}
