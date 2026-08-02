package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;

/* compiled from: EditDeleteButtonsHolder.kt */
/* loaded from: classes4.dex */
public final class wzo extends rp6<xzo, Post> {
    public final c1c0 E;
    public final View F;
    public final View G;

    public wzo(ViewGroup viewGroup, c1c0 c1c0Var) {
        super(R.layout.edit_delete_buttons_holder, viewGroup);
        this.E = c1c0Var;
        View findViewById = this.itemView.findViewById(R.id.edit_delete_buttons_button_edit_post);
        this.F = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.edit_delete_buttons_button_delete_post);
        this.G = findViewById2;
        jjc.g(findViewById, new mre(this, 16));
        jjc.g(findViewById2, new frg(this, 10));
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(xzo xzoVar) {
    }
}
