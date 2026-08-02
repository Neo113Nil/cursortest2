package xsna;

import android.widget.CompoundButton;
import com.vk.poll.views.PollSettingView;
import com.vk.superapp.core.api.models.VkGender;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class pht implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ pht(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                q60 q60Var = (q60) izsVar;
                if (z) {
                    q60Var.invoke(VkGender.FEMALE);
                    break;
                }
                break;
            default:
                int i2 = PollSettingView.d;
                izsVar.invoke(Boolean.valueOf(z));
                break;
        }
    }
}
