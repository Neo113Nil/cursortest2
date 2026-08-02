package defpackage;

import android.view.View;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;

/* loaded from: classes11.dex */
public final /* synthetic */ class i3w0 implements w4n {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i3w0(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.w4n
    public final void a(y4n y4nVar, boolean z, float f, float f2) {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                ((SuperAppMainScreenPopupView) view).showAnimation = null;
                break;
            case 1:
                SuperAppMainScreenPopupView.animatePopupDisappearance$lambda$0((SuperAppMainScreenPopupView) view, y4nVar, z, f, f2);
                break;
            default:
                ((BaseProgressIndicator) view).lambda$new$0(y4nVar, z, f, f2);
                break;
        }
    }
}
