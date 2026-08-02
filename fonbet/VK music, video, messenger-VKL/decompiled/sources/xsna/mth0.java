package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.vk.core.view.components.search.VkSearchView;
import xsna.gth0;

/* compiled from: SearchFollowersIntegrationDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class mth0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ VkSearchView b;
    public final /* synthetic */ jth0 c;

    public mth0(VkSearchView vkSearchView, jth0 jth0Var) {
        this.b = vkSearchView;
        this.c = jth0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.b.getEditView().isFocused()) {
            this.c.g.C(gth0.d.b);
        }
        return super.onSingleTapUp(motionEvent);
    }
}
