package xsna;

import android.content.Context;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.fave.entities.FavePage;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.rpq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zoq implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zoq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (this.b) {
            case 0:
                apq apqVar = (apq) this.c;
                if (obj instanceof FavePage) {
                    if (i == 1208) {
                        apqVar.a(new rpq.b.a((FavePage) obj));
                        break;
                    } else if (i == 1209) {
                        apqVar.a(new rpq.b.C3622b((FavePage) obj));
                        break;
                    }
                }
                break;
            case 1:
                StoryEntry storyEntry = (StoryEntry) obj;
                ListDataSet<zif0> listDataSet = ((oxl0) this.c).g;
                ListDataSet.ArrayListImpl<zif0> arrayListImpl = listDataSet.d;
                ListDataSet.ArrayListImpl<zif0> arrayListImpl2 = listDataSet.d;
                int size = arrayListImpl.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        zif0 c = listDataSet.c(i3);
                        if (c instanceof lxl0) {
                            lxl0 lxl0Var = (lxl0) c;
                            if (epx.f(lxl0Var.a, storyEntry)) {
                                lxl0 lxl0Var2 = null;
                                if (i3 < arrayListImpl2.size() - 1) {
                                    zif0 c2 = listDataSet.c(i3 + 1);
                                    if (c2 instanceof lxl0) {
                                        lxl0Var2 = (lxl0) c2;
                                    }
                                }
                                if (lxl0Var2 != null && lxl0Var.e && epx.f(lxl0Var2.c, lxl0Var.c) && epx.f(lxl0Var2.d, lxl0Var.d)) {
                                    lxl0Var2.e = true;
                                    listDataSet.d(i3 + 1);
                                }
                                listDataSet.A(i3);
                            }
                        }
                        i3++;
                    }
                }
                if (arrayListImpl2.size() == 1) {
                    listDataSet.clear();
                    break;
                }
                break;
            default:
                ebm0 ebm0Var = (ebm0) this.c;
                Pair pair = (Pair) obj;
                int i4 = ((StoryEntry) pair.i()).c;
                StoryEntry storyEntry2 = ebm0Var.e;
                if (i4 == storyEntry2.c) {
                    Throwable th = (Throwable) pair.j();
                    ebm0Var.h.g(ebm0Var.a(storyEntry2.g0), true, true);
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{th});
                    }
                    StoryBottomViewGroup storyBottomViewGroup = ebm0Var.a;
                    Context context = storyBottomViewGroup.getContext();
                    cmf0.d(context, s200.y(storyBottomViewGroup.getContext()), context.getString(R.string.error), false, iah0.a(88), true);
                    break;
                }
                break;
        }
    }
}
