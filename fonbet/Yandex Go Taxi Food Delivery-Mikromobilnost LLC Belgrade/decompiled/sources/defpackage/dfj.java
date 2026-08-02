package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;

/* loaded from: classes15.dex */
public final class dfj extends Brick {
    public static final ColorStateList z = ColorStateList.valueOf(0);
    public final View a;
    public final ImageView b;
    public final ImageView c;
    public final TextView w;
    public final TextView x;
    public final View y;

    public dfj(Activity activity) {
        View inflate = inflate(activity, olh0.msg_b_dialog_top);
        this.a = inflate;
        this.b = (ImageView) inflate.findViewById(e9h0.dialog_top_left_button);
        this.c = (ImageView) inflate.findViewById(e9h0.dialog_top_right_button);
        this.w = (TextView) inflate.findViewById(e9h0.dialog_top_title);
        this.x = (TextView) inflate.findViewById(e9h0.dialog_top_subtitle);
        this.y = inflate.findViewById(e9h0.dialog_top_divider);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.a;
    }
}
