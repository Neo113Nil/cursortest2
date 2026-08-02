package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;

/* compiled from: CallParticipantsOffsetDecoration.kt */
/* loaded from: classes7.dex */
public final class l89 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.vk.voip.ui.settings.participants_view.a aVar = adapter instanceof com.vk.voip.ui.settings.participants_view.a ? (com.vk.voip.ui.settings.participants_view.a) adapter : null;
        if (linearLayoutManager == null || aVar == null) {
            return;
        }
        f89 f89Var = aVar.e;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        CallSettingsItem callSettingsItem = (CallSettingsItem) j5g.b0(childAdapterPosition, f89Var.d);
        CallSettingsItem callSettingsItem2 = (CallSettingsItem) j5g.b0(childAdapterPosition - 1, f89Var.d);
        CallSettingsItem callSettingsItem3 = (CallSettingsItem) j5g.b0(childAdapterPosition + 1, f89Var.d);
        if (callSettingsItem == null) {
            return;
        }
        if (callSettingsItem instanceof CallSettingsItem.e) {
            rect.top = iah0.a(48);
        }
        if ((callSettingsItem2 instanceof CallSettingsItem.i) && (callSettingsItem instanceof CallSettingsItem.FillSpace) && (callSettingsItem3 instanceof CallSettingsItem.CallParticipant)) {
            rect.bottom = iah0.a(12);
        }
    }
}
