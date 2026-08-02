package defpackage;

import com.yandex.messenger.websdk.internal.MainWebMessengerFragment;
import com.yandex.messenger.websdk.internal.webview.ChatWebViewController$IntentPage;

/* loaded from: classes15.dex */
public final class b1b extends c1b {
    public final heb b;
    public final MainWebMessengerFragment c;
    public final /* synthetic */ d1b w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1b(d1b d1bVar, heb hebVar, MainWebMessengerFragment mainWebMessengerFragment) {
        super("foreground_only");
        this.w = d1bVar;
        this.b = hebVar;
        this.c = mainWebMessengerFragment;
    }

    @Override // defpackage.ye0
    public final ye0 b() {
        jl40.x("Cannot hide WebView");
        return this;
    }

    @Override // defpackage.ye0
    public final c1b c(MainWebMessengerFragment mainWebMessengerFragment, fc3 fc3Var, ChatWebViewController$IntentPage chatWebViewController$IntentPage) {
        if (mainWebMessengerFragment.equals(this.c)) {
            jl40.x("Attaching twice in a row without detaching");
            return this;
        }
        d1b d1bVar = this.w;
        d1bVar.a.b("wm_foreground_only_replacing");
        heb hebVar = this.b;
        hebVar.d();
        hebVar.b(mainWebMessengerFragment, fc3Var, chatWebViewController$IntentPage);
        return new b1b(d1bVar, hebVar, mainWebMessengerFragment);
    }

    @Override // defpackage.ye0
    public final ye0 d() {
        jl40.x("WebView is used in foreground, cannot detach in bg for preloading");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 e(MainWebMessengerFragment mainWebMessengerFragment) {
        if (!mainWebMessengerFragment.equals(this.c)) {
            return this;
        }
        d1b d1bVar = this.w;
        d1bVar.a.b("wm_foreground_only_detaching");
        heb hebVar = this.b;
        hebVar.d();
        hebVar.c();
        return new a1b(d1bVar);
    }

    @Override // defpackage.ye0
    public final ye0 m() {
        jl40.x("Trying to preload WebView meanwhile not preloaded WebView already shown");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 n() {
        jl40.x("Foreground WeView was not preloaded or released");
        this.w.a.b("wm_foreground_only_releasing");
        return this;
    }

    @Override // defpackage.ye0
    public final ye0 o() {
        jl40.x("Trying to unload WebView meanwhile not preloaded WebView already shown");
        return this;
    }

    @Override // defpackage.c1b
    public final heb p() {
        return this.b;
    }
}
