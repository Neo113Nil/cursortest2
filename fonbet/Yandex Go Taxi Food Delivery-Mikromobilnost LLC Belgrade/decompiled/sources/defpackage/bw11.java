package defpackage;

import android.os.Bundle;
import com.yandex.messaging.action.MessagingActionParser;

/* loaded from: classes11.dex */
public final class bw11 extends s120 {
    public final g720 a;
    public final String b;

    public bw11(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        MessagingActionParser.a(bundle);
        this.a = b;
        this.b = "Messaging.Arguments.Key.Unauthorized";
    }

    @Override // defpackage.s120
    public final String a() {
        return this.b;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }
}
