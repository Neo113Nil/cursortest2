package xsna;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: HashtagsMentionsFormatter.kt */
/* loaded from: classes17.dex */
public final class ovu {
    public final Context a;
    public final pil b;
    public final q6x c = new q6x();
    public final Pattern d = Pattern.compile("#([a-zA-Zа-яА-ЯёЁ0-9_])+");

    public ovu(Context context) {
        this.a = context;
        this.b = new pil(context);
    }
}
