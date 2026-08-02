package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: DialogActionsVcByPopup.kt */
/* loaded from: classes2.dex */
public final class c9m implements z8m {
    public final Toolbar a;
    public final kkm b;
    public izb0 c;

    public c9m(Toolbar toolbar, kkm kkmVar) {
        this.a = toolbar;
        this.b = kkmVar;
    }

    @Override // xsna.z8m
    public final boolean a(boolean z) {
        izb0 izb0Var = this.c;
        if (izb0Var == null) {
            return true;
        }
        izb0Var.dismiss();
        return true;
    }

    @Override // xsna.z8m
    @SuppressLint({"InflateParams"})
    public final void b(List<? extends u8m> list, izs<? super u8m, s3q0> izsVar) {
        int a;
        if (isVisible()) {
            return;
        }
        Toolbar toolbar = this.a;
        Context context = toolbar.getContext();
        View rootView = toolbar.getRootView();
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_dialog_actions_vc_by_popup, (ViewGroup) null, false);
        DialogActionsListView dialogActionsListView = (DialogActionsListView) inflate.findViewById(R.id.dialog_actions_list_content);
        dialogActionsListView.setDialogActions(list);
        kkm kkmVar = this.b;
        if (kkmVar != null) {
            kkmVar.e(dialogActionsListView, new dr0(context, 6));
        }
        dialogActionsListView.setOnActionClickListener(new b9m(izsVar));
        inflate.measure(View.MeasureSpec.makeMeasureSpec(rootView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(rootView.getMeasuredHeight() - iah0.a(64), Integer.MIN_VALUE));
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        Rect e = f4m.e(toolbar);
        if (e.right > inflate.getMeasuredWidth()) {
            a = iah0.a(8) + (e.right - inflate.getMeasuredWidth());
        } else {
            a = e.left - iah0.a(8);
        }
        int a2 = e.top - iah0.a(8);
        Rect rect = new Rect(a, a2, inflate.getMeasuredWidth() + a, inflate.getMeasuredHeight() + a2);
        izb0 izb0Var = new izb0(context);
        izb0Var.setContentView(inflate);
        izb0Var.setWidth(rect.width());
        izb0Var.setHeight(rect.height());
        izb0Var.setOnDismissListener(new a9m(this, 0));
        izb0Var.showAtLocation(toolbar, 0, rect.left, rect.top);
        this.c = izb0Var;
    }

    @Override // xsna.z8m
    public final void destroy() {
        izb0 izb0Var = this.c;
        if (izb0Var != null) {
            izb0Var.b();
        }
    }

    @Override // xsna.z8m
    public final boolean isVisible() {
        return this.c != null;
    }
}
