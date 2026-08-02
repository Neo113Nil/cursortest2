package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import io.appmetrica.analytics.impl.C0810w0;
import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.design.NotificationStackComponent$hideInternal$2;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes.dex */
public final /* synthetic */ class d82 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ d82(int i) {
        this.a = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                synchronized (AndroidComposeView.composeViews) {
                    try {
                        final int i = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            xy40 xy40Var = AndroidComposeView.composeViews;
                            Object[] objArr = xy40Var.a;
                            int i2 = xy40Var.b;
                            for (int i3 = 0; i3 < i2; i3++) {
                                final AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i3];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                AndroidComposeView.Companion.getClass();
                                androidComposeView.setShowLayoutBounds(f82.a());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new Runnable() { // from class: e82
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i4 = i;
                                            AndroidComposeView androidComposeView2 = androidComposeView;
                                            switch (i4) {
                                                case 0:
                                                    androidComposeView2.invalidateDescendants();
                                                    break;
                                                default:
                                                    androidComposeView2.invalidateDescendants();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                        } else {
                            xy40 xy40Var2 = AndroidComposeView.composeViews;
                            Object[] objArr2 = xy40Var2.a;
                            int i4 = xy40Var2.b;
                            while (i < i4) {
                                final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr2[i];
                                final int i5 = 1;
                                androidComposeView2.post(new Runnable() { // from class: e82
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i42 = i5;
                                        AndroidComposeView androidComposeView22 = androidComposeView2;
                                        switch (i42) {
                                            case 0:
                                                androidComposeView22.invalidateDescendants();
                                                break;
                                            default:
                                                androidComposeView22.invalidateDescendants();
                                                break;
                                        }
                                    }
                                });
                                i++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                ModalView.dismissWithAction$lambda$0();
                return;
            case 3:
                ModalView.onBackPressedListener$lambda$0();
                return;
            case 4:
                NotificationStackComponent.cancelAnimationTask$lambda$0();
                return;
            case 5:
                NotificationStackComponent$hideInternal$2.onAnimationEnd$lambda$0();
                return;
            case 6:
                ConcurrentHashMap concurrentHashMap = pwf0.a;
                return;
            case 7:
                SlideableModalView.onSlideOutListener$lambda$0();
                return;
            case 8:
                SlideableModalView.onArrowClickListener$lambda$0();
                return;
            default:
                C0810w0.e();
                return;
        }
    }
}
