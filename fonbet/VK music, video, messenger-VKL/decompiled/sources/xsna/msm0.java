package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.im.mvicomponent.viewsetup.ViewSetupStubReplacementException;
import java.util.LinkedHashMap;
import xsna.hfr;
import xsna.mk50;

/* compiled from: StubReplaceViewSetup.kt */
/* loaded from: classes2.dex */
public final class msm0 {
    public static ViewStub b(int i, ViewGroup viewGroup) {
        ViewStub b;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                return null;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewStub) {
                ViewStub viewStub = (ViewStub) childAt;
                if (viewStub.getInflatedId() == i) {
                    return viewStub;
                }
            } else if ((childAt instanceof ViewGroup) && (b = b(i, (ViewGroup) childAt)) != null) {
                return b;
            }
            i2 = i3;
        }
    }

    public static void c(View view, ViewGroup viewGroup) {
        ViewStub b = b(view.getId(), viewGroup);
        if (b == null) {
            com.vk.metrics.eventtracking.b.a.a(new ViewSetupStubReplacementException("Cannot find viewstub for view " + view + " with id " + view.getContext().getResources().getResourceName(view.getId()) + ". Have you added android:inflatedId tag for your viewstub?"));
            b = (ViewStub) viewGroup.findViewById(view.getId());
        }
        ViewGroup viewGroup2 = (ViewGroup) b.getParent();
        int indexOfChild = viewGroup2.indexOfChild(b);
        viewGroup2.removeViewAt(indexOfChild);
        view.setLayoutParams(b.getLayoutParams());
        viewGroup2.addView(view, indexOfChild);
    }

    public final void a(ViewGroup viewGroup, LinkedHashMap linkedHashMap) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("StubReplaceViewSetup is available only in ViewGroup");
        }
        hfr.a aVar = new hfr.a(rli0.j(new i5g(linkedHashMap.values()), lsm0.b));
        while (aVar.hasNext()) {
            mk50.c cVar = (mk50.c) aVar.next();
            try {
                c(cVar.a, viewGroup);
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to setup view of " + cVar, th);
            }
        }
    }
}
