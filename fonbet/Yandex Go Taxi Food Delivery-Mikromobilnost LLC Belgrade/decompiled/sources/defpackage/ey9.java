package defpackage;

import android.content.Context;
import com.yandex.go.chargers.error.ChargersErrorModalView;
import com.yandex.go.chargers.error.api.ChargersErrorUiState$Icon;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.common_models.net.TextMetaStyle;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ey9 implements hy9 {
    public final /* synthetic */ ChargersErrorModalView a;

    public ey9(ChargersErrorModalView chargersErrorModalView) {
        this.a = chargersErrorModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        fy9 binding;
        pya pyaVar;
        pya pyaVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        sy9 sy9Var = (sy9) obj;
        ChargersErrorModalView chargersErrorModalView = this.a;
        binding = chargersErrorModalView.getBinding();
        RobotoTextView robotoTextView = binding.f;
        ButtonComponent buttonComponent = binding.c;
        ButtonComponent buttonComponent2 = binding.d;
        CharSequence charSequence = sy9Var.a;
        ry9 ry9Var = sy9Var.d;
        robotoTextView.setText(charSequence);
        RobotoTextView robotoTextView2 = binding.f;
        pyaVar = chargersErrorModalView.chargersTypefaceDelegate;
        Context context = chargersErrorModalView.getContext();
        pyaVar.getClass();
        TextMetaStyle textMetaStyle = TextMetaStyle.CondensedTitle4;
        robotoTextView2.setTypeface(pyaVar.a(context, textMetaStyle, 30.0f).a);
        pyaVar2 = chargersErrorModalView.chargersTypefaceDelegate;
        Context context2 = chargersErrorModalView.getContext();
        pyaVar2.getClass();
        robotoTextView2.setTextSize(pyaVar2.a(context2, textMetaStyle, 30.0f).b);
        RobotoTextView robotoTextView3 = binding.e;
        CharSequence charSequence2 = sy9Var.b;
        robotoTextView3.setVisibility(charSequence2.length() > 0 ? 0 : 8);
        robotoTextView3.setText(charSequence2);
        buttonComponent.setText(sy9Var.c.a);
        buttonComponent.setDebounceClickListener(new nm7(27, chargersErrorModalView, sy9Var));
        buttonComponent2.setVisibility(ry9Var != null ? 0 : 8);
        if (ry9Var != null) {
            buttonComponent2.setText(ry9Var.a);
            buttonComponent2.setDebounceClickListener(new nm7(28, chargersErrorModalView, ry9Var));
        }
        ChargersErrorUiState$Icon chargersErrorUiState$Icon = sy9Var.e;
        ChargersErrorUiState$Icon chargersErrorUiState$Icon2 = ChargersErrorUiState$Icon.NONE;
        GoImageView goImageView = binding.b;
        if (chargersErrorUiState$Icon == chargersErrorUiState$Icon2) {
            goImageView.setVisibility(8);
            i4 = chargersErrorModalView.margin16;
            Integer valueOf = Integer.valueOf(i4);
            i5 = chargersErrorModalView.margin16;
            Integer valueOf2 = Integer.valueOf(i5);
            i6 = chargersErrorModalView.margin16;
            xw31.F(robotoTextView2, valueOf, valueOf2, Integer.valueOf(i6), 0);
            return;
        }
        goImageView.setVisibility(0);
        i = chargersErrorModalView.margin16;
        Integer valueOf3 = Integer.valueOf(i);
        i2 = chargersErrorModalView.margin8;
        Integer valueOf4 = Integer.valueOf(i2);
        i3 = chargersErrorModalView.margin16;
        xw31.F(robotoTextView2, valueOf3, valueOf4, Integer.valueOf(i3), 0);
    }
}
