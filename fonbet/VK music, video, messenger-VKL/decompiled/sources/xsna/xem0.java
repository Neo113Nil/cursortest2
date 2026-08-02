package xsna;

import androidx.recyclerview.widget.m;
import com.vk.stories.design.view.stats.tabs.header.HeaderPayload;
import java.util.ArrayList;

/* compiled from: StoryStatisticsHeaderDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class xem0 extends m.e<zem0> {
    public static ArrayList a(zem0 zem0Var, zem0 zem0Var2) {
        ArrayList arrayList = new ArrayList();
        if (!epx.f(zem0Var.b, zem0Var2.b)) {
            arrayList.add(HeaderPayload.TITLE);
        }
        if (!epx.f(zem0Var.c, zem0Var2.c)) {
            arrayList.add(HeaderPayload.BUTTON_TEXT);
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(zem0 zem0Var, zem0 zem0Var2) {
        return zem0Var.equals(zem0Var2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(zem0 zem0Var, zem0 zem0Var2) {
        return true;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(zem0 zem0Var, zem0 zem0Var2) {
        return a(zem0Var, zem0Var2);
    }
}
