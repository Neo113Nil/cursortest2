package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: CreateListFriendsViewVh.kt */
/* loaded from: classes4.dex */
public final class w7k extends vfz<rhz> implements View.OnClickListener {
    public final a l;
    public rhz m;

    /* compiled from: CreateListFriendsViewVh.kt */
    public interface a {
        void d();
    }

    public w7k(ViewGroup viewGroup, a aVar) {
        super(R.layout.item_create_friend_list, viewGroup);
        this.l = aVar;
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vfz
    public final void W5(rhz rhzVar) {
        this.m = rhzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!view.equals(this.itemView) || bwt0.b() || this.m == null) {
            return;
        }
        this.l.d();
    }
}
