package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.video.ui.discovery.minimizable.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: TabsVisibilityTrackerDelegate.kt */
/* loaded from: classes7.dex */
public final class b0o0 {
    public final VkSubnavigationBar a;
    public final op1 b;
    public final Set<String> c;
    public List<q.a> d;

    public b0o0(VkSubnavigationBar vkSubnavigationBar, op1 op1Var, b0o0 b0o0Var) {
        Set<String> set;
        this.a = vkSubnavigationBar;
        this.b = op1Var;
        this.c = (b0o0Var == null || (set = b0o0Var.c) == null) ? new LinkedHashSet<>() : set;
        this.d = EmptyList.b;
    }

    public final void a() {
        Set<String> set;
        List<q.a> list = this.d;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            set = this.c;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (!set.contains(((q.a) next).a)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            q.a aVar = (q.a) it2.next();
            T t = ((VkSubnavigationBar.a) this.a.h.get(list.indexOf(aVar))).a;
            int visibility = t.getVisibility();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (visibility == 0 && t.getWindowVisibility() == 0 && t.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && t.isAttachedToWindow()) {
                Rect rect = new Rect();
                if (!t.getGlobalVisibleRect(rect)) {
                    rect = null;
                }
                if (rect != null) {
                    f = (rect.height() * rect.width()) / (t.getMeasuredWidth() * t.getMeasuredHeight());
                }
            }
            if (f > 0.5f) {
                set.add(aVar.a);
                this.b.invoke(aVar.a);
            }
        }
    }
}
