package ru.rustore.sdk.pushclient.u;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.json.JsonToken;
import xsna.b6l;

@b6l(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl", f = "MessagesIPCInteractorImpl.kt", l = {162, 79, JsonToken.BEGIN_ARRAY}, m = "receiveSendPushesResult")
/* loaded from: classes9.dex */
public final class h extends ContinuationImpl {
    public g a;
    public Object b;
    public Object c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return g.g(this.f, null, this);
    }
}
