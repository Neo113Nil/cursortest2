package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.bricks.BrickSlotView;
import com.yandex.dsl.views.d;

/* loaded from: classes15.dex */
public final class i2b extends d {
    public final TextView w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2b(Activity activity, int i) {
        super(activity, olh0.msg_b_chat_dnd_warning);
        switch (i) {
            case 1:
                super(activity, olh0.msg_b_public_reaction_list);
                this.x = (BrickSlotView) this.c.a(e9h0.top_container);
                this.y = (RecyclerView) this.c.a(e9h0.reaction_recycler);
                this.w = (TextView) this.c.a(e9h0.no_reactions_state_view);
                break;
            default:
                this.x = this.c.a(e9h0.dnd_warning_container);
                this.w = (TextView) this.c.a(e9h0.dnd_warning_text);
                this.y = (ImageView) this.c.a(e9h0.dnd_warning_icon);
                break;
        }
    }
}
