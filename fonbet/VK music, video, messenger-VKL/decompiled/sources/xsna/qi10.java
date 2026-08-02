package xsna;

import android.content.DialogInterface;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import xsna.u0q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qi10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qi10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                String str = (String) obj2;
                MasksWrap masksWrap = (MasksWrap) obj;
                int i3 = MasksWrap.e0;
                if (str != null) {
                    masksWrap.getLinksBridge().getBrowser().d(masksWrap.getContext(), jeq0.g(str), true);
                    break;
                }
                break;
            default:
                DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) obj2;
                u0q0.a aVar = (u0q0.a) obj;
                if (onClickListener != null) {
                    onClickListener.onClick(dialogInterface, i);
                }
                u0q0 u0q0Var = aVar.c;
                if (u0q0Var != null) {
                    u0q0Var.b(SchemeStat$TypeDialogItem.DialogAction.CONFIRM);
                    break;
                }
                break;
        }
    }
}
