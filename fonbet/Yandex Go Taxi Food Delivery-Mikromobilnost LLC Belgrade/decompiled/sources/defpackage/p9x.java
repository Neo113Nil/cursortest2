package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class p9x extends s120 {
    public final g720 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e = "Messaging.Arguments.Key.JoinWall";

    public p9x(g720 g720Var, String str, String str2, String str3, ServerMessageRef serverMessageRef) {
        this.a = g720Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.e;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }
}
