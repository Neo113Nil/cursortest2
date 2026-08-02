package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes15.dex */
public final class jas {
    public final TextView a;
    public final int b;

    public jas(View view, int i) {
        switch (i) {
            case 1:
                this.a = (TextView) view.findViewById(e9h0.channel_message_views_text);
                this.b = kjs0.b(14);
                break;
            default:
                this.a = (TextView) view.findViewById(e9h0.channel_message_forwards_text);
                this.b = kjs0.b(14);
                break;
        }
    }
}
