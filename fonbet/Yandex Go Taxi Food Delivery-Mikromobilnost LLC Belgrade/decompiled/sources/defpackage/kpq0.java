package defpackage;

import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes.dex */
public final class kpq0 implements dw {
    public final i3y a;

    public kpq0(elr elrVar) {
        this.a = a.b(LazyThreadSafetyMode.NONE, new qhq0(1, elrVar));
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        Iterator it = ((SendRealtimeAnalyticsAction) krVar).a.iterator();
        while (it.hasNext()) {
            ((tei0) ((sei0) this.a.getValue())).a((SendRealtimeAnalyticsAction.Event) it.next());
        }
    }
}
