package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;

/* loaded from: classes13.dex */
public final class i9t0 {
    public final cm1 a;
    public final fm1 b;
    public final ChatViewController$Mode c;
    public final String d;

    public i9t0(bm1 bm1Var, ChatViewController$Mode chatViewController$Mode, String str, int i) {
        cm1 cm1Var = (i & 1) != 0 ? am1.a : bm1Var;
        fm1 fm1Var = (i & 2) != 0 ? dm1.a : em1.a;
        chatViewController$Mode = (i & 4) != 0 ? ChatViewController$Mode.Go : chatViewController$Mode;
        str = (i & 8) != 0 ? null : str;
        this.a = cm1Var;
        this.b = fm1Var;
        this.c = chatViewController$Mode;
        this.d = str;
    }

    public i9t0() {
        this(null, null, null, 15);
    }
}
