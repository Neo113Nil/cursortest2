package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.datepicker.DateSelector;
import com.yandex.go.superapp.order.multi.old.view.OrderStackViewsController;
import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import ru.yandex.taxi.eatskit.ContentView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ce0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ce0(OrderStackViewsController orderStackViewsController, View view) {
        this.a = 17;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.setVisibility(8);
                break;
            case 1:
                if (Math.abs(view.getAlpha()) < 1.0E-4f) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (Math.abs(view.getAlpha()) < 1.0E-4f) {
                    view.setVisibility(4);
                    break;
                }
                break;
            case 3:
                if (Math.abs(view.getAlpha()) < 1.0E-4f) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 4:
                if (Math.abs(view.getAlpha()) < 1.0E-4f) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 5:
                view.requestLayout();
                break;
            case 6:
                view.performAccessibilityAction(64, null);
                view.sendAccessibilityEvent(32768);
                break;
            case 7:
                ContentView.updateState$lambda$0$0(view);
                break;
            case 8:
                view.requestFocus();
                break;
            case 9:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$1(view);
                break;
            case 10:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
            case 11:
                view.setVisibility(8);
                break;
            case 12:
                view.setTranslationX(0.0f);
                break;
            case 13:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
            case 14:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
            case 15:
                if (view != null) {
                    Object systemService = view.getContext().getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        break;
                    }
                }
                break;
            case 16:
                view.sendAccessibilityEvent(32768);
                break;
            case 17:
                if (!(view instanceof OrderViewContainer)) {
                    view.setVisibility(8);
                    break;
                } else {
                    ((OrderViewContainer) view).setVisibility(4);
                    break;
                }
            case 18:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 19:
                view.requestFocus();
                break;
            case 20:
                view.setVisibility(8);
                break;
            case 21:
                view.performAccessibilityAction(64, null);
                break;
            case 22:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
                break;
            case 23:
                view.setVisibility(8);
                break;
            case 24:
                view.setVisibility(0);
                break;
            case 25:
                view.setVisibility(8);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                break;
            case 26:
                if (view.isAttachedToWindow()) {
                    view.requestLayout();
                    break;
                }
                break;
            case 27:
                view.requestLayout();
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }

    public /* synthetic */ ce0(View view, int i) {
        this.a = i;
        this.b = view;
    }
}
