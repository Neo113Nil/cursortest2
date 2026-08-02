package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.payments.shared.members.invitation.SharedPaymentsInvitationController$special$$inlined$safeCollectIn$1;
import com.yandex.go.payments.shared.members.invitation.a;
import com.yandex.go.payments.shared.v;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.am.h;

/* loaded from: classes8.dex */
public final class bpr0 {
    public final tse a;
    public final i6r b;
    public final v c;
    public final ffe d;
    public pzt0 e;
    public boolean f;
    public final x43 g = new x43();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ymp0 i = new ymp0(3, this);
    public final CopyOnWriteArraySet j = new CopyOnWriteArraySet();

    public bpr0(tse tseVar, i6r i6rVar, v vVar, ffe ffeVar, ney neyVar, h hVar) {
        this.a = tseVar;
        this.b = i6rVar;
        this.c = vVar;
        this.d = ffeVar;
        tje.N(tseVar, null, null, new SharedPaymentsInvitationController$special$$inlined$safeCollectIn$1(hVar.e, null, this), 3);
        neyVar.b(this, new a(this, neyVar));
    }
}
