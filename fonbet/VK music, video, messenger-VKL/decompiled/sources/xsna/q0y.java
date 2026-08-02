package xsna;

import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.webrtc.cid.CidExtKt;

/* compiled from: JoinPrepare.kt */
/* loaded from: classes8.dex */
public final class q0y<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ p0y b;

    public q0y(p0y p0yVar) {
        this.b = p0yVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        String str = ((ConversationParams) obj).id;
        if (str != null) {
            CidExtKt.update(this.b.j, str);
        }
    }
}
