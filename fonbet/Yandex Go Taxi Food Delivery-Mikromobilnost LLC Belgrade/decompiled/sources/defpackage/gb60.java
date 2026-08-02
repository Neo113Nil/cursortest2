package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.explorer.impl.ui.permission.NoBackgroundLocationPermissionBottomSheetModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class gb60 implements ib60 {
    public final /* synthetic */ NoBackgroundLocationPermissionBottomSheetModalView a;

    public gb60(NoBackgroundLocationPermissionBottomSheetModalView noBackgroundLocationPermissionBottomSheetModalView) {
        this.a = noBackgroundLocationPermissionBottomSheetModalView;
    }

    @Override // defpackage.ib60
    public final void J3(mb60 mb60Var) {
        huo binding;
        pav pavVar;
        NoBackgroundLocationPermissionBottomSheetModalView noBackgroundLocationPermissionBottomSheetModalView = this.a;
        binding = noBackgroundLocationPermissionBottomSheetModalView.getBinding();
        RobotoTextView robotoTextView = binding.d;
        AppCompatImageView appCompatImageView = binding.e;
        robotoTextView.setText(mb60Var.a);
        binding.b.setText(mb60Var.b);
        binding.c.setText(mb60Var.c);
        String str = mb60Var.d;
        if (str == null || evu0.J(str)) {
            appCompatImageView.setVisibility(8);
            return;
        }
        pavVar = noBackgroundLocationPermissionBottomSheetModalView.imageLoader;
        ((nac) pavVar.a(appCompatImageView)).c(str);
        appCompatImageView.setVisibility(0);
    }
}
