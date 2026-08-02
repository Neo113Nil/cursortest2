package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.d;

/* loaded from: classes15.dex */
public final class ltn extends d {
    public final TextView R;

    public ltn(View view) {
        super(view);
        this.R = (TextView) view.findViewById(e9h0.emoji_title);
    }

    @Override // com.yandex.bricks.d
    public final boolean t(Object obj, Object obj2) {
        return ((String) obj).equals((String) obj2);
    }
}
