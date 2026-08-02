package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.dialogs.DialogsGroupItemView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vkontakte.android.R;
import xsna.bsm;

/* compiled from: VhBusinessNotifyCount.kt */
/* loaded from: classes2.dex */
public final class oqr0 extends RecyclerView.e0 implements pfe0 {
    public static final /* synthetic */ int o = 0;
    public PullFromTopMode l;
    public final DialogsGroupItemView m;
    public bsm.i n;

    public oqr0(View view) {
        super(view);
        this.l = PullFromTopMode.DEFAULT;
        DialogsGroupItemView dialogsGroupItemView = (DialogsGroupItemView) view.findViewById(R.id.business_notify_count);
        this.m = dialogsGroupItemView;
        bwt0.i0(dialogsGroupItemView, new q9i0(this, 9));
    }

    @Override // xsna.pfe0
    public final View getView() {
        return this.itemView;
    }

    @Override // xsna.pfe0
    public final PullFromTopMode u() {
        return this.l;
    }
}
