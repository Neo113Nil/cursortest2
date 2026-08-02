package xsna;

import android.content.DialogInterface;
import androidx.recyclerview.widget.m;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yyb0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yyb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((pp00) this.c).invoke();
                break;
            default:
                com.vk.superapp.browser.internal.ui.menu.action.n nVar = (com.vk.superapp.browser.internal.ui.menu.action.n) this.c;
                nVar.i.d.e();
                com.vk.superapp.browser.internal.ui.menu.action.a aVar = nVar.j;
                EmptyList emptyList = EmptyList.b;
                m.d a = androidx.recyclerview.widget.m.a(new y30(aVar.e, emptyList), true);
                aVar.e = emptyList;
                a.b(aVar);
                nVar.d = null;
                SuperappUiRouterBridge.c cVar = nVar.g;
                if (cVar != null) {
                    cVar.dismiss();
                    break;
                }
                break;
        }
    }
}
