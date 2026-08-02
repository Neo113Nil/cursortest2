package xsna;

import android.widget.PopupWindow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a9m implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a9m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.b) {
            case 0:
                c9m c9mVar = (c9m) this.c;
                if (v8m.a != null) {
                    com.vk.metrics.eventtracking.b.a.n("IM.DIALOG_ACTION.CANCELED");
                    v8m.a = null;
                }
                c9mVar.c = null;
                break;
            default:
                com.vk.core.view.components.context.menu.e eVar = (com.vk.core.view.components.context.menu.e) this.c;
                gzs<s3q0> gzsVar = eVar.q;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                eVar.o = null;
                break;
        }
    }
}
