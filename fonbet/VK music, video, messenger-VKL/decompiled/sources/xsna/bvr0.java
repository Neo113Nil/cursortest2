package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.dialogs.DialogsGroupItemView;
import com.vk.pullfromtopofrecycler.PullFromTopMode;
import com.vkontakte.android.R;

/* compiled from: VhRequestsCount.kt */
/* loaded from: classes2.dex */
public final class bvr0 extends RecyclerView.e0 implements pfe0 {
    public static final /* synthetic */ int n = 0;
    public final PullFromTopMode l;
    public final DialogsGroupItemView m;

    public bvr0(View view) {
        super(view);
        this.l = PullFromTopMode.ALWAYS_VISIBLE;
        this.m = (DialogsGroupItemView) view.findViewById(R.id.requests_plate);
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
