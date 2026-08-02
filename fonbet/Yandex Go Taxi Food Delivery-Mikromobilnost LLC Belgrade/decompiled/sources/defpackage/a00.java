package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.ServerDirective;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;

/* loaded from: classes15.dex */
public final class a00 implements Runnable {
    public final /* synthetic */ b00 a;
    public final /* synthetic */ ChatRequest b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ long x;
    public final /* synthetic */ ServerDirective y;
    public final /* synthetic */ BotRequest.Error[] z;

    public a00(b00 b00Var, ChatRequest chatRequest, String str, String str2, long j, ServerDirective serverDirective, BotRequest.Error[] errorArr) {
        this.a = b00Var;
        this.b = chatRequest;
        this.c = str;
        this.w = str2;
        this.x = j;
        this.y = serverDirective;
        this.z = errorArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b00.a(this.a).a(new fb6(this.b, this.c, this.w, this.x, this.y, this.z));
    }
}
