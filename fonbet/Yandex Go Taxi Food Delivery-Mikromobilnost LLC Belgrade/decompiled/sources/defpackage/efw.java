package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardModalView;

/* loaded from: classes14.dex */
public final class efw {
    public final /* synthetic */ IntercityDashboardModalView a;

    public efw(IntercityDashboardModalView intercityDashboardModalView) {
        this.a = intercityDashboardModalView;
    }

    public final void a(hjw hjwVar, int i) {
        View mapSectionsToContainerView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        IntercityDashboardModalView intercityDashboardModalView = this.a;
        mapSectionsToContainerView = intercityDashboardModalView.mapSectionsToContainerView(hjwVar);
        linearLayout = intercityDashboardModalView.sectionsContainer;
        if (i < linearLayout.getChildCount()) {
            linearLayout3 = intercityDashboardModalView.sectionsContainer;
            linearLayout3.addView(mapSectionsToContainerView, i);
        } else {
            linearLayout2 = intercityDashboardModalView.sectionsContainer;
            linearLayout2.addView(mapSectionsToContainerView);
        }
    }

    public final void b(hjw hjwVar) {
        View mapSectionsToContainerView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        IntercityDashboardModalView intercityDashboardModalView = this.a;
        mapSectionsToContainerView = intercityDashboardModalView.mapSectionsToContainerView(hjwVar);
        linearLayout = intercityDashboardModalView.sectionsContainer;
        if (linearLayout.indexOfChild(mapSectionsToContainerView) != -1) {
            linearLayout2 = intercityDashboardModalView.sectionsContainer;
            linearLayout2.removeView(mapSectionsToContainerView);
        }
    }
}
