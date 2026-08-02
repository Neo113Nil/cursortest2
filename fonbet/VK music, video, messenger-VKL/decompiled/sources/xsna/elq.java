package xsna;

import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.webrtc.cid.CidExtKt;
import xsna.y1d0;

/* compiled from: FastJoinPrepare.kt */
/* loaded from: classes8.dex */
public final class elq<T> implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ clq b;

    public elq(clq clqVar) {
        this.b = clqVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        String str;
        ConversationParams conversationParams = ((y1d0.b) obj).a;
        if (conversationParams == null || (str = conversationParams.id) == null) {
            return;
        }
        CidExtKt.update(this.b.i, str);
    }
}
