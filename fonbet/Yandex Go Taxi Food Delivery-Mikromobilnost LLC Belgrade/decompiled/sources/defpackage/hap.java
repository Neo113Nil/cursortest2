package defpackage;

import com.yandex.go.captcha.i;
import com.yandex.go.payments.shared.family.web.c;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class hap implements dp41 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hap(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    private final void f() {
    }

    @Override // defpackage.dp41
    public final void a() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y9p y9pVar = ((c) obj).O.c;
                y9pVar.a.a("FamilyAccount.WebView.FailureScreen.DidTapCloseButton", tse0.n(y9pVar), 1, new HashMap());
                break;
            default:
                ((i) obj).d.b.a("Antirobot.Captcha.WebView.FailureScreen.DidTapCloseButton", new Pair[0]);
                break;
        }
    }

    @Override // defpackage.dp41
    public final void b() {
        switch (this.b) {
            case 0:
                y9p y9pVar = ((c) this.c).O.c;
                y9pVar.a.a("FamilyAccount.WebView.FailureScreen.DidShow", tse0.n(y9pVar), 1, new HashMap());
                break;
        }
    }

    @Override // defpackage.dp41
    public final void c() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y9p y9pVar = ((c) obj).O.c;
                y9pVar.a.a("FamilyAccount.WebView.FailureScreen.DidTapReloadButton", tse0.n(y9pVar), 1, new HashMap());
                break;
            default:
                ((j) ((i) obj).d.a).n("Antirobot.Captcha.WebView.FailureScreen.DidTapReloadButton");
                break;
        }
    }

    @Override // defpackage.dp41
    public final void d() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y9p y9pVar = ((c) obj).O.c;
                y9pVar.a.a("FamilyAccount.WebView.DidTapCloseButton", tse0.n(y9pVar), 1, new HashMap());
                break;
            default:
                ((i) obj).d.b.a("Antirobot.Captcha.WebView.FailureScreen.DidTapCloseButton", new Pair[0]);
                break;
        }
    }

    @Override // defpackage.dp41
    public final void e() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y9p y9pVar = ((c) obj).O.c;
                y9pVar.a.a("FamilyAccount.WebView.DidTapBackButton", tse0.n(y9pVar), 1, new HashMap());
                break;
            default:
                ((i) obj).d.b.a("Antirobot.Captcha.WebView.FailureScreen.DidTapCloseButton", new Pair[0]);
                break;
        }
    }
}
