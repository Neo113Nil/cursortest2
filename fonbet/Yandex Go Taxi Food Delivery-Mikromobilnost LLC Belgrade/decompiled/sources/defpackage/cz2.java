package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;
import com.yandex.go.superapp.order.multi.old.view.OrdersListViewImpl;
import com.yandex.messaging.internal.view.input.selection.SelectedMessagesPanel;
import com.yandex.messaging.views.ExpandedBottomSheetDialog;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import ru.cprocsp.ACSP.tools.common.AppUtils;

/* loaded from: classes15.dex */
public final /* synthetic */ class cz2 implements View.OnTouchListener {
    public final /* synthetic */ int a;

    public /* synthetic */ cz2(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$setupUI$0;
        boolean onTouchEvent;
        boolean contentInvisible$lambda$30$lambda$29;
        boolean lambda$wrapInBottomSheet$1;
        boolean updateOrders$lambda$0$0;
        boolean onViewCreated$lambda$17;
        boolean lambda$setUpRootView$0;
        boolean lambda$new$1;
        switch (this.a) {
            case 0:
                lambda$setupUI$0 = AppUtils.lambda$setupUI$0(view, motionEvent);
                return lambda$setupUI$0;
            case 2:
                kgx[] kgxVarArr = cg6.f;
            case 1:
                return true;
            case 3:
                if ((motionEvent == null || motionEvent.getAction() == 1) && view != null) {
                    view.post(new ce0(view, 15));
                }
                return false;
            case 4:
                onTouchEvent = view.onTouchEvent(motionEvent);
                return onTouchEvent;
            case 5:
                contentInvisible$lambda$30$lambda$29 = DivEducationsV2View.setContentInvisible$lambda$30$lambda$29(view, motionEvent);
                return contentInvisible$lambda$30$lambda$29;
            case 6:
                lambda$wrapInBottomSheet$1 = ExpandedBottomSheetDialog.lambda$wrapInBottomSheet$1(view, motionEvent);
                return lambda$wrapInBottomSheet$1;
            case 7:
                updateOrders$lambda$0$0 = OrdersListViewImpl.updateOrders$lambda$0$0(view, motionEvent);
                return updateOrders$lambda$0$0;
            case 8:
                onViewCreated$lambda$17 = ProductsFragment.onViewCreated$lambda$17(view, motionEvent);
                return onViewCreated$lambda$17;
            case 9:
                if ((motionEvent == null || motionEvent.getAction() == 1) && view != null) {
                    view.post(new ce0(view, 15));
                }
                return false;
            case 10:
                lambda$setUpRootView$0 = SearchView.lambda$setUpRootView$0(view, motionEvent);
                return lambda$setUpRootView$0;
            case 11:
                lambda$new$1 = SelectedMessagesPanel.lambda$new$1(view, motionEvent);
                return lambda$new$1;
            case 12:
                view.onTouchEvent(motionEvent);
                return true;
            case 13:
                return view.onTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                if (action == 0) {
                    view.setAlpha(0.5f);
                } else if (action == 1 || action == 3) {
                    view.setAlpha(1.0f);
                }
                return false;
            default:
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return view.onTouchEvent(motionEvent);
        }
    }
}
