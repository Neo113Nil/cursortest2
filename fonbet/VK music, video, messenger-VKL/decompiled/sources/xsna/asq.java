package xsna;

import android.view.View;
import android.widget.CheckBox;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import xsna.go30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class asq implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ asq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        omo0 omo0Var;
        switch (this.b) {
            case 0:
                bsq bsqVar = (bsq) this.c;
                bsqVar.G6(bsqVar.C);
                break;
            case 1:
                ((gzs) this.c).invoke();
                break;
            case 2:
                go30.a aVar = ((ip30) this.c).c;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 3:
                hs50 hs50Var = (hs50) this.c;
                MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) hs50Var.C;
                if (myTargetNativeAdSinglePartUiDto != null) {
                    bp50 bp50Var = myTargetNativeAdSinglePartUiDto.r;
                    if (bp50Var != null) {
                        bp50Var.a();
                    }
                    myTargetNativeAdSinglePartUiDto.u = AdVkFeedItemState.AD_SHOWING;
                    hs50Var.h7(myTargetNativeAdSinglePartUiDto);
                    break;
                }
                break;
            case 4:
                ((dw20) this.c).hide();
                break;
            case 5:
                CheckBox checkBox = ((wif0) this.c).p;
                if (!checkBox.isChecked()) {
                    checkBox.setChecked(true);
                    break;
                }
                break;
            case 6:
                qmo0 qmo0Var = (qmo0) this.c;
                int bindingAdapterPosition = qmo0Var.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1 && (omo0Var = qmo0Var.q) != null) {
                    qmo0Var.l.invoke(omo0Var, Integer.valueOf(bindingAdapterPosition));
                    break;
                }
                break;
            default:
                yads.t1.a((yads.t1) this.c, view);
                break;
        }
    }
}
