package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes10.dex */
public final class kb {
    public int a;
    public int b;
    public int c;

    public kb(Context context, int i) {
        switch (i) {
            case 9:
                Resources resources = context.getResources();
                this.a = resources.getDimensionPixelSize(gvg0.chat_timeline_outer_container_offset);
                this.b = resources.getDimensionPixelSize(gvg0.timeline_message_other_message_left_margin) * 2;
                this.c = resources.getDimensionPixelSize(gvg0.timeline_message_other_message_left_margin);
                break;
            default:
                this.a = kob1.b(ing0.go_platform_primary_color, context);
                this.b = kob1.b(ing0.go_platform_text_color, context);
                this.c = kob1.b(ing0.go_platform_pin_color, context);
                break;
        }
    }

    public int a(qdz0 qdz0Var) {
        int i = this.a;
        wbz0 wbz0Var = qdz0Var.O;
        wbz0Var.getClass();
        return i + (wbz0Var instanceof tbz0 ? this.c : 0);
    }

    public int b(qdz0 qdz0Var, boolean z) {
        int i;
        int i2 = this.a;
        if (z) {
            wbz0 wbz0Var = qdz0Var.O;
            wbz0Var.getClass();
            if (wbz0Var instanceof tbz0) {
                i = this.c;
                return i2 + i;
            }
        }
        wbz0 wbz0Var2 = qdz0Var.O;
        wbz0Var2.getClass();
        i = wbz0Var2 instanceof ubz0 ? this.b : 0;
        return i2 + i;
    }

    public /* synthetic */ kb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public kb(int i, int i2) {
        this.a = i;
        this.c = i * i2;
        this.b = (int) Math.min(i2, 6 - r3);
    }
}
