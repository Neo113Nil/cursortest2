package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.yandex.bricks.BrickSlotView;
import com.yandex.dsl.views.d;
import com.yandex.messaging.input.ChatInputEditText;

/* loaded from: classes15.dex */
public final class j1w extends d {
    public final ImageButton A;
    public final ViewStub B;
    public final BrickSlotView C;
    public final BrickSlotView D;
    public final BrickSlotView E;
    public final ImageView w;
    public final ChatInputEditText x;
    public final ImageView y;
    public final View z;

    public j1w(Activity activity) {
        super(activity, olh0.msg_b_chat_input);
        this.w = (ImageView) this.c.a(e9h0.char_input_clear);
        this.x = (ChatInputEditText) this.c.a(e9h0.chat_text_input);
        this.y = (ImageView) this.c.a(e9h0.chat_input_emoji_button);
        this.z = this.c.a(e9h0.suggest_mentions_view_barrier);
        this.A = (ImageButton) this.c.a(e9h0.chat_content_ui_attach_file_button);
        this.B = (ViewStub) this.c.a(e9h0.chat_emoji_panel);
        this.C = (BrickSlotView) this.c.a(e9h0.chat_mesix_slot);
        this.D = (BrickSlotView) this.c.a(e9h0.dialog_input_selection_panel_slot);
        this.E = (BrickSlotView) this.c.a(e9h0.chat_input_star_button);
        this.c.a(e9h0.messaging_suggest_slot).setVisibility(8);
    }
}
