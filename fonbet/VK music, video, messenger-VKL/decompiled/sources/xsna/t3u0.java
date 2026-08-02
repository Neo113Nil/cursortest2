package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.stories.model.StoriesContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewersRepliesDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class t3u0 extends m.e<u3u0> {
    public static boolean a(u3u0 u3u0Var, u3u0 u3u0Var2) {
        ArrayList<StoriesContainer> arrayList = u3u0Var.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((StoriesContainer) it.next()).Ab());
        }
        ArrayList<StoriesContainer> arrayList3 = u3u0Var2.b;
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator<T> it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((StoriesContainer) it2.next()).Ab());
        }
        return arrayList2.equals(arrayList4);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(u3u0 u3u0Var, u3u0 u3u0Var2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(u3u0 u3u0Var, u3u0 u3u0Var2) {
        return a(u3u0Var, u3u0Var2);
    }
}
