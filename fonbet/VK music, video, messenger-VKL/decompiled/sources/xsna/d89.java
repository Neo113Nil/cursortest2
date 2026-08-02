package xsna;

import androidx.recyclerview.widget.m;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import java.util.List;

/* compiled from: CallParticipantsAdapterDiffer.kt */
/* loaded from: classes7.dex */
public final class d89 extends m.b {
    public final /* synthetic */ List<CallSettingsItem> b;
    public final /* synthetic */ List<CallSettingsItem> c;
    public final /* synthetic */ f89 d;

    /* JADX WARN: Multi-variable type inference failed */
    public d89(List<? extends CallSettingsItem> list, List<? extends CallSettingsItem> list2, f89 f89Var) {
        this.b = list;
        this.c = list2;
        this.d = f89Var;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        CallSettingsItem callSettingsItem = this.b.get(i);
        CallSettingsItem callSettingsItem2 = this.c.get(i2);
        this.d.b.getClass();
        return callSettingsItem.equals(callSettingsItem2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        CallSettingsItem callSettingsItem = this.b.get(i);
        CallSettingsItem callSettingsItem2 = this.c.get(i2);
        com.vk.voip.ui.settings.participants_view.b bVar = this.d.b;
        return com.vk.voip.ui.settings.participants_view.b.a(callSettingsItem, callSettingsItem2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final Object getChangePayload(int i, int i2) {
        CallSettingsItem callSettingsItem = this.b.get(i);
        CallSettingsItem callSettingsItem2 = this.c.get(i2);
        com.vk.voip.ui.settings.participants_view.b bVar = this.d.b;
        return com.vk.voip.ui.settings.participants_view.b.b(callSettingsItem, callSettingsItem2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
