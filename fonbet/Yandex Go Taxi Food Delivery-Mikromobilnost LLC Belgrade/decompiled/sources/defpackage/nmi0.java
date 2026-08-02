package defpackage;

import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.RedirectionRuleDto$Redirect;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.c;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.d;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.f;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class nmi0 extends xqt {
    public static final nmi0 e = new nmi0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f.INSTANCE.serializer(), qoi0.a(f.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("redirect", RedirectionRuleDto$Redirect.Companion.serializer(), qoi0.a(RedirectionRuleDto$Redirect.class)), new f9("impossible_redirect", d.INSTANCE.serializer(), qoi0.a(d.class)), new f9("cancel", c.INSTANCE.serializer(), qoi0.a(c.class)));
    }
}
