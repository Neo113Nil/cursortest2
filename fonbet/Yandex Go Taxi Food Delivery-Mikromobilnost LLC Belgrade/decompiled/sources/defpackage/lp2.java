package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.common.extensions.shortcut_shimmer.ShortcutShimmeringDrawable;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.c;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsView;
import com.yandex.go.pin.api.a;
import core.flex.ui.OrientationAwareRecyclerView;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes.dex */
public final /* synthetic */ class lp2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lp2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                c cVar = (c) obj;
                h2y h2yVar = cVar.C;
                if (h2yVar != null) {
                    RecyclerView recyclerView = cVar.D;
                    if (recyclerView == null) {
                        recyclerView = (RecyclerView) h2yVar.e.findViewById(nch0.flexsdk_recycler_view_id);
                    }
                    cVar.i(h2yVar, recyclerView);
                    break;
                }
                break;
            case 1:
                PaymentMethodChooserView.addCardContainerLayoutListener$lambda$0((PaymentMethodChooserView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                mip0 mip0Var = (mip0) obj;
                mip0Var.a(mip0Var.c);
                OrientationAwareRecyclerView orientationAwareRecyclerView = mip0Var.a;
                PaymentWidgetsView p = wwg.p(orientationAwareRecyclerView);
                if (!mip0Var.f && p != null) {
                    if (((Number) e.d(((acw0) mip0Var.b).c).a.getValue()).floatValue() <= 0.5f && p.isInitiallyCollapsed()) {
                        int paddingTop = p.bounds().bottom - orientationAwareRecyclerView.getPaddingTop();
                        if (paddingTop != 0) {
                            orientationAwareRecyclerView.scrollBy(0, paddingTop);
                            break;
                        }
                    } else {
                        orientationAwareRecyclerView.removeOnLayoutChangeListener(mip0Var.d);
                        break;
                    }
                }
                break;
            case 3:
                a aVar = (a) obj;
                if (i2 != i6) {
                    aVar.h(view, false, new bgc(12));
                    break;
                }
                break;
            case 4:
                ((ShortcutShimmeringDrawable) obj).getPaint().updateOffset(view);
                break;
            case 5:
                SlideableModalView.cardContentLayoutListener$lambda$0((SlideableModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                SuperAppMainScreenFlexModalView.initHeader$lambda$0((SuperAppMainScreenFlexModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
