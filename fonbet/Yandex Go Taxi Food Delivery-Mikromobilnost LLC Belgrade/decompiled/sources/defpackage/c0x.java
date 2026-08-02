package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final /* synthetic */ class c0x implements nrh {
    public final /* synthetic */ odz0 a;

    public /* synthetic */ c0x(odz0 odz0Var) {
        this.a = odz0Var;
    }

    public final void a(ServerMessageRef[] serverMessageRefArr) {
        mrh mrhVar = this.a.c;
        ServerMessageRef[] serverMessageRefArr2 = (ServerMessageRef[]) Arrays.copyOf(serverMessageRefArr, serverMessageRefArr.length);
        mrhVar.getClass();
        for (ServerMessageRef serverMessageRef : serverMessageRefArr2) {
            z83.d(serverMessageRef, null);
            mrhVar.b.push(serverMessageRef);
        }
        if (mrhVar.isAttached()) {
            mrhVar.q();
        }
    }
}
