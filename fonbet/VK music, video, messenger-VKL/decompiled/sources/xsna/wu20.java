package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import xsna.av20;

/* compiled from: ModalActionSheet.kt */
/* loaded from: classes17.dex */
public final class wu20 implements av20.b<yu20> {
    public final /* synthetic */ x2 a;

    public wu20(x2 x2Var) {
        this.a = x2Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        yu20 yu20Var = (yu20) obj;
        if (yu20Var instanceof ModalActionSheetListItem) {
            this.a.invoke(view, yu20Var);
        }
    }
}
