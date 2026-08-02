package defpackage;

import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;

/* loaded from: classes15.dex */
public final class a1b extends ye0 {
    public final /* synthetic */ d1b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1b(d1b d1bVar) {
        super("nothing");
        this.b = d1bVar;
    }

    @Override // defpackage.ye0
    public final ye0 b() {
        jl40.x("No background fragment was created");
        return this;
    }

    @Override // defpackage.ye0
    public final c1b c(MainWebMessengerFragment mainWebMessengerFragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        d1b d1bVar = this.b;
        d1bVar.a.b("wm_foreground_implicit");
        heb a = d1bVar.b.a();
        a.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
        return new b1b(d1bVar, a, mainWebMessengerFragment);
    }

    @Override // defpackage.ye0
    public final ye0 d() {
        jl40.x("No background fragment was created");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 m() {
        jl40.x("No background fragment was created");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 n() {
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 o() {
        jl40.x("No background fragment was created, no webview");
        return this;
    }
}
