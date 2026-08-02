package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.core.view.CatalogErrorViewWithIcon;
import com.vk.photo.editor.views.ToolBottomView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w4a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ w4a(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                int i2 = CatalogErrorViewWithIcon.e;
                gzsVar.invoke();
                break;
            default:
                int i3 = ToolBottomView.h;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
