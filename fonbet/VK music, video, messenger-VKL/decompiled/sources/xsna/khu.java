package xsna;

import android.view.View;
import com.vk.voip.ui.groupcalls.grid.holder.video_grid.GroupCallGridView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class khu implements View.OnLongClickListener {
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = GroupCallGridView.l;
        if (!(view instanceof giu)) {
            return true;
        }
        ((giu) view).b5();
        return true;
    }
}
