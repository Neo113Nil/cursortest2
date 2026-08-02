package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.is60;

/* compiled from: NewsfeedListViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class js60 {
    public static is60.a a(ur60 ur60Var) {
        sq60 sq60Var = ur60Var.b;
        ListLoadingState listLoadingState = ur60Var.e;
        boolean z = ur60Var.f;
        boolean z2 = false;
        if (ur60Var.g) {
            List<ol60> list = sq60Var.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (on60.b.contains(fpf0.a(((ol60) it.next()).getClass()))) {
                        break;
                    }
                }
            }
            z2 = true;
        }
        return new is60.a(sq60Var, listLoadingState, z, z2);
    }
}
