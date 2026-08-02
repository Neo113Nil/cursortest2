package xsna;

import android.content.DialogInterface;
import com.vk.method.selector.impl.MethodSelectorView;
import com.vk.video.profile.presentation.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r86 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((y440) obj).getRequirePresenter().a0();
                break;
            case 1:
                ((wlg) obj).c.invoke(a.e.b);
                break;
            default:
                gzs gzsVar = (gzs) obj;
                int i2 = MethodSelectorView.g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
