package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.messenger.websdk.api.WebMessenger;
import ru.yandex.taxi.messenger.fallback.FallbackChatModalView;

/* loaded from: classes12.dex */
public final class m9p extends k0p {
    public final WebMessenger H;
    public final FragmentActivity I;
    public final w030 J;

    public m9p(WebMessenger webMessenger, FragmentActivity fragmentActivity, w030 w030Var) {
        super(3);
        this.H = webMessenger;
        this.I = fragmentActivity;
        this.J = w030Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.J;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        return new FallbackChatModalView(this.I);
    }

    @Override // defpackage.k0p
    public final FragmentActivity T() {
        return this.I;
    }

    @Override // defpackage.k0p
    public final Fragment U(Object obj) {
        return WebMessenger.c(this.H, new f8b((String) obj), null, 2);
    }
}
