package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.dialogs.DialogsGroupItemView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vkontakte.android.R;
import xsna.bsm;

/* compiled from: VhArchivesCount.kt */
/* loaded from: classes2.dex */
public final class gqr0 extends RecyclerView.e0 implements pfe0 {
    public static final /* synthetic */ int o = 0;
    public PullFromTopMode l;
    public final DialogsGroupItemView m;
    public bsm.h n;

    public gqr0(View view) {
        super(view);
        this.l = PullFromTopMode.DEFAULT;
        DialogsGroupItemView dialogsGroupItemView = (DialogsGroupItemView) view.findViewById(R.id.archive_plate);
        this.m = dialogsGroupItemView;
        bwt0.i0(dialogsGroupItemView, new rzl0(this, 15));
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
