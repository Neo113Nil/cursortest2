package defpackage;

import android.text.TextUtils;
import com.yandex.messaging.ChatRequest;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class dhc0 extends ky4 {
    public final abz0 y;
    public final boolean z;

    public dhc0(ChatRequest chatRequest, abz0 abz0Var, boolean z) {
        super(chatRequest);
        this.y = abz0Var;
        this.z = z;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        uy10 uy10Var = (uy10) ((m8g) s020Var).d0.get();
        ty10 c = uy10Var.c(this.y);
        if (c != null) {
            boolean z = this.z;
            String str = TextUtils.join("\n", c.b(z)).toString();
            if (!evu0.J(str)) {
                uy10Var.b(str, a.X(c.a(z), "<br>", null, null, new sy10(uy10Var, 1), 30));
            }
        }
        h();
    }
}
