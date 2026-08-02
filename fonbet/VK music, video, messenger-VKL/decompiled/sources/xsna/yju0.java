package xsna;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;

/* compiled from: VkCheckEditTextCellsAccessibilityDelegate.kt */
/* loaded from: classes15.dex */
public final class yju0 extends hk {
    public final Context b;
    public final wju0 c;

    public yju0(Context context, wju0 wju0Var) {
        this.b = context;
        this.c = wju0Var;
    }

    public final String a() {
        return enj.j(R.array.vk_otp_method_selection_cells_in_which_cell, this.b)[swe0.g(this.c.a(), 1, 6) - 1];
    }

    public final String b() {
        wju0 wju0Var = this.c;
        RecyclerView.Adapter<? extends RecyclerView.e0> bindingAdapter = wju0Var.a.getBindingAdapter();
        Integer valueOf = bindingAdapter != null ? Integer.valueOf(bindingAdapter.getItemCount()) : null;
        int intValue = valueOf != null ? valueOf.intValue() : 6;
        Context context = this.b;
        String string = context.getString(R.string.vk_otp_method_selection_cells_all_cells_empty_talkback, enj.j(R.array.vk_otp_method_selection_cells_count, context)[intValue - 1], a());
        if (drm0.N(wju0Var.c())) {
            return string;
        }
        return wju0Var.c() + JwtParser.SEPARATOR_CHAR + string;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        wju0 wju0Var = this.c;
        if (wju0Var.d() && wju0Var.e()) {
            amVar.r(b());
            return;
        }
        boolean f = myc0.f(wju0Var.b());
        Context context = this.b;
        if (f) {
            amVar.A(context.getString(R.string.vk_otp_method_selection_cells_not_empty_cell_talkback, wju0Var.b(), a()));
        } else {
            amVar.r(context.getString(R.string.vk_otp_method_selection_cells_empty_cell_talkback, enj.j(R.array.vk_otp_method_selection_cells_ordinal_num, context)[swe0.g(wju0Var.a(), 1, 6) - 1]));
        }
    }

    @Override // xsna.hk
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        wju0 wju0Var = this.c;
        if (wju0Var.d() && wju0Var.e()) {
            accessibilityEvent.setContentDescription(b());
        } else {
            accessibilityEvent.setContentDescription(this.b.getString(R.string.vk_otp_method_selection_cells_gain_focus_empty_cell_talkback, a()));
        }
    }
}
