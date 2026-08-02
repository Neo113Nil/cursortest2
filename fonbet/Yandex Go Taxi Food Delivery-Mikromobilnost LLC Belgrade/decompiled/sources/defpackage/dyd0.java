package defpackage;

import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;

/* loaded from: classes15.dex */
public final class dyd0 extends zij {
    @Override // defpackage.zij
    public final boolean a(Object obj, Object obj2) {
        return ((PollInfoResponse.Vote) obj).equals((PollInfoResponse.Vote) obj2);
    }

    @Override // defpackage.zij
    public final boolean b(Object obj, Object obj2) {
        return ((PollInfoResponse.Vote) obj) == ((PollInfoResponse.Vote) obj2);
    }
}
