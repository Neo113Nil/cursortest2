package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import defpackage.h020;
import defpackage.tje;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class h020 extends zn50 {
    public final yvf0 b;
    public final yef0 c;
    public final i3y d = a.a(new sls() { // from class: com.yandex.messaging.internal.images.a
        @Override // defpackage.sls
        public final Object invoke() {
            h020 h020Var = h020.this;
            return (ContextThemeWrapper) tje.Y(h020Var.c.b, new MessengerAvatarUriHandler$themedContext$2$1(h020Var, null));
        }
    });
    public final Map e = b.i(new Pair("messenger://saved_messages_icon_uri", Integer.valueOf(wwg0.msg_ic_saved_messages)), new Pair("messenger://avatar_placeholder_uri", Integer.valueOf(wwg0.msg_ic_anonymous_avatar)));

    public h020(yvf0 yvf0Var, yef0 yef0Var) {
        this.b = yvf0Var;
        this.c = yef0Var;
    }

    @Override // defpackage.zn50
    public final boolean a(xn50 xn50Var) {
        return this.e.containsKey(xn50Var.b.toString());
    }

    @Override // defpackage.zn50
    public final ht10 c(xn50 xn50Var) {
        Drawable drawable = ((ContextThemeWrapper) this.d.getValue()).getDrawable(((Integer) this.e.get(xn50Var.b.toString())).intValue());
        Objects.requireNonNull(drawable);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return new ht10(createBitmap, (byte[]) null);
    }

    @Override // defpackage.zn50
    public final boolean d() {
        return true;
    }
}
