package defpackage;

import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.entities.ChatFlags;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ck51 {
    public final x22 a;
    public final ik51 b;
    public final MessengerEnvironment c;
    public Boolean d;
    public j3b e;

    public ck51(x22 x22Var, ik51 ik51Var, MessengerEnvironment messengerEnvironment) {
        this.a = x22Var;
        this.b = ik51Var;
        this.c = messengerEnvironment;
    }

    public final void a(o1b0 o1b0Var, int i, Integer num, at2 at2Var) {
        String str = o1b0Var.b;
        String str2 = o1b0Var.c;
        Boolean valueOf = str2 != null ? Boolean.valueOf(at2Var.a().d(str2)) : null;
        t2b a = at2Var.Y().a(str);
        Map i2 = b.i(new Pair("chatId", str), new Pair("chosenSource", Integer.valueOf(i)), new Pair("messageDataSource", num), new Pair("isStub", Boolean.valueOf(o1b0Var.k)), new Pair("isStub_new", a != null ? Boolean.valueOf(ChatFlags.a(a.j, 64L)) : null), new Pair("isChatWithSupportBot", Boolean.valueOf(o1b0Var.g)), new Pair("isChatWithSupportBot_new", valueOf), new Pair("isBusiness", Boolean.valueOf(o1b0Var.p)), new Pair("namespace", Integer.valueOf(o1b0Var.o)));
        x22 x22Var = this.a;
        x22Var.reportEvent("tech_file_sent", i2);
        if (num == null || i == num.intValue()) {
            return;
        }
        z83.i();
        x22Var.reportEvent("tech_chosen_different_file_upload_sources", i2);
    }
}
