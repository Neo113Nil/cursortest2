package xsna;

import android.view.ViewGroup;
import com.vk.im.ui.views.dialogs.DialogUnreadMarkerView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EduSwitchAccountViewHolder.kt */
/* loaded from: classes18.dex */
public final class p7p extends vfz<o7p> {
    public final a l;

    /* compiled from: EduSwitchAccountViewHolder.kt */
    public interface a {
        void z();
    }

    public p7p(ViewGroup viewGroup, a aVar) {
        super(R.layout.vh_edu_switch_account, viewGroup);
        this.l = aVar;
        DialogUnreadMarkerView dialogUnreadMarkerView = (DialogUnreadMarkerView) this.itemView.findViewById(R.id.counter);
        jjc.g(this.itemView, new omf(this, 12));
        dialogUnreadMarkerView.setMuted(false);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(o7p o7pVar) {
        throw new NoWhenBranchMatchedException();
    }
}
