package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.av20;
import xsna.dw20;

/* compiled from: ModalBottomSheetMenu.kt */
/* loaded from: classes17.dex */
public abstract class wx20 {
    public dw20 b;

    /* compiled from: ModalBottomSheetMenu.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            ((wx20) this.receiver).getClass();
            return s3q0.a;
        }
    }

    /* compiled from: ModalBottomSheetMenu.kt */
    public static final class b implements iz20 {
        public b() {
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            wx20.this.getClass();
        }
    }

    public static void c(wx20 wx20Var, Context context, String str, int i, int i2, int i3) {
        int f = e3m.f(R.attr.vk_ui_action_sheet_text, context);
        if ((i3 & 8) != 0) {
            i = e3m.f(R.attr.vk_ui_text_primary, context);
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        wx20Var.b(context, str, f, i, i2);
    }

    public abstract List<e520> a();

    public final dw20 b(Context context, String str, int i, int i2, int i3) {
        wja wjaVar = new wja(7, this, context);
        a aVar = new a(1, this, wx20.class, "performOnboarding", "performOnboarding(Landroid/view/View;)V", 0);
        int f = e3m.f(R.attr.vk_ui_background_negative, context);
        av20.a aVar2 = new av20.a();
        aVar2.d(R.layout.ds_internal_actions_popup_item, LayoutInflater.from(context));
        aVar2.d = new ux20(i2, context, f, i, aVar);
        aVar2.e = new vx20(wjaVar);
        av20 b2 = aVar2.b();
        b2.setItems(a());
        dw20.b Z = new dw20.b(context, null).Z(new DialogInterface.OnDismissListener() { // from class: xsna.tx20
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wx20 wx20Var = wx20.this;
                wx20Var.b = null;
                wx20Var.g();
            }
        });
        if (i3 != 0) {
            Z.u0(i3);
        }
        dw20 I0 = ((dw20.b) dw20.a.k(Z, b2, 4)).e0(new b()).I0(str);
        this.b = I0;
        return I0;
    }

    public final void d() {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        this.b = null;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(Context context, e520 e520Var);

    public void g() {
    }
}
