package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameValidationError;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;

/* loaded from: classes3.dex */
public final class o7m0 implements ev31 {
    public final Context a;

    public o7m0(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        h7m0 h7m0Var = (h7m0) obj;
        SavingsAccountNameValidationError savingsAccountNameValidationError = h7m0Var.e;
        String str = h7m0Var.a;
        Text i = str != null ? g8e.i(Text.Companion, str) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_account_rename_title);
        String str2 = h7m0Var.b;
        Text i2 = str2 != null ? g8e.i(Text.Companion, str2) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_account_rename_subtitle);
        YbButtonView.a aVar = new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_card_card_save_button_title), null, null, null, null, null, null, false, h7m0Var.f, null, 3070);
        g gVar = g.z;
        String str3 = h7m0Var.d;
        if (str3 == null && (str3 = h7m0Var.c) == null) {
            str3 = "";
        }
        eyy eyyVar = eyy.b;
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_savings_savings_account_rename_input_field_hint);
        boolean z = h7m0Var.f;
        LoadableInput.LoadingState loadingState = z ? LoadableInput.LoadingState.NONE : LoadableInput.LoadingState.DEFAULT;
        boolean z2 = !z;
        Drawable t = vng.t(nyg0.ybsdk_background_loadable_input_edit_text, this.a);
        boolean z3 = savingsAccountNameValidationError != null;
        SavingsAccountNameValidationError savingsAccountNameValidationError2 = SavingsAccountNameValidationError.TOO_LONG;
        return new m7m0(i, i2, aVar, g.a(gVar, str3, eyyVar, z2, loadingState, resource, null, null, z3, savingsAccountNameValidationError == savingsAccountNameValidationError2 ? new Text.Resource(dzh0.ybsdk_savings_savings_account_rename_error_max) : null, null, null, false, t, null, false, 0, savingsAccountNameValidationError == savingsAccountNameValidationError2, 0, 0, null, null, null, 33412704));
    }
}
