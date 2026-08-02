package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.button.Appearance;
import com.vk.core.view.components.cell.button.VkCellButton;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: SettingsSelectFriendHolder.kt */
/* loaded from: classes7.dex */
public final class r3j0 extends vif0<a> implements UsableRecyclerView.e {

    /* compiled from: SettingsSelectFriendHolder.kt */
    public static final class a {
        public final int a;
        public final gzs<Void> b;

        public a(int i, gzs<Void> gzsVar) {
            this.a = i;
            this.b = gzsVar;
        }
    }

    public r3j0(Context context) {
        super(new VkCellButton(context, null, 6));
        ((VkCellButton) this.itemView).setAppearance(Appearance.Neutral);
    }

    @Override // xsna.vif0
    public final void i6(a aVar) {
        ((VkCellButton) this.itemView).setTitle(aVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        gzs<Void> gzsVar;
        a aVar = (a) this.m;
        if (aVar == null || (gzsVar = aVar.b) == null) {
            return;
        }
        gzsVar.invoke();
    }
}
