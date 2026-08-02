package defpackage;

import android.view.ViewGroup;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.adjust.sdk.ActivityHandler;
import com.yandex.go.flex.main_screen.presentation.f;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import io.appmetrica.analytics.impl.Id;

/* loaded from: classes.dex */
public final /* synthetic */ class c40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c40(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup parentRecyclerView;
        int i = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((ActivityHandler) obj).lambda$onActivityLifecycle$0(z);
                break;
            case 1:
                Id.a((Id) obj, z);
                break;
            case 2:
                f fVar = (f) obj;
                if (z) {
                    fVar.a.setVisibility(8);
                    fVar.b.setVisibility(8);
                    break;
                }
                break;
            default:
                SuperAppMainScreenOrdersView superAppMainScreenOrdersView = (SuperAppMainScreenOrdersView) obj;
                if (z) {
                    superAppMainScreenOrdersView.post(new ymp0(10, superAppMainScreenOrdersView));
                    parentRecyclerView = superAppMainScreenOrdersView.parentRecyclerView();
                    if (parentRecyclerView != null) {
                        TransitionManager.a(new ChangeBounds(), parentRecyclerView);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c40(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
