package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public final class ci implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ ci(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                if (!view.isAccessibilityFocused()) {
                    int i2 = di.a;
                    if (!view.isAccessibilityFocused()) {
                        view.performAccessibilityAction(64, null);
                        view.sendAccessibilityEvent(32768);
                        break;
                    }
                }
                break;
            case 1:
                view.post(new ce0(view, 15));
                break;
            case 2:
                view.requestApplyInsets();
                break;
            case 3:
                view.setNestedScrollingEnabled(true);
                break;
            case 4:
                if (view != null) {
                    view.post(new ce0(view, 15));
                    break;
                }
                break;
            case 5:
                view.requestApplyInsets();
                break;
            case 6:
                view.requestApplyInsets();
                break;
            case 7:
                view.requestApplyInsets();
                break;
            default:
                view.requestApplyInsets();
                break;
        }
    }
}
