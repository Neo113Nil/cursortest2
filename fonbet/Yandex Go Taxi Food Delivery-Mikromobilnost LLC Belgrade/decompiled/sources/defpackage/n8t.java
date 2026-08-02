package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.yandex.messaging.domain.user.b;
import com.yandex.messaging.internal.GetLastMessagePreviewUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.n;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class n8t extends vds0 {
    public final FragmentActivity b;
    public final n c;
    public final c9t d;
    public final tmt0 e;
    public final v3k0 f;
    public final b g;
    public final String h;
    public final int i;
    public final int j;

    public n8t(FragmentActivity fragmentActivity, n nVar, c9t c9tVar, tmt0 tmt0Var, kse kseVar, v3k0 v3k0Var, b bVar) {
        super(kseVar.b);
        this.b = fragmentActivity;
        this.c = nVar;
        this.d = c9tVar;
        this.e = tmt0Var;
        this.f = v3k0Var;
        this.g = bVar;
        this.h = fragmentActivity.getString(oyh0.messenger_own_message_prefix);
        this.i = fxa1.c(jng0.messagingChatListLastMessageTextColor, fragmentActivity).data;
        this.j = fxa1.c(jng0.messagingChatListLastMessageAuthorColor, fragmentActivity).data;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        l8t l8tVar = (l8t) obj;
        return e.X(this.c.a(new o8t(l8tVar.a)), new GetLastMessagePreviewUseCase$run$$inlined$flatMapLatest$1(null, l8tVar, this));
    }
}
