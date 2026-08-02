package defpackage;

import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.JoinThreadData;

/* loaded from: classes15.dex */
public final /* synthetic */ class g4b implements go3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4b b;

    public /* synthetic */ g4b(i4b i4bVar, int i) {
        this.a = i;
        this.b = i4bVar;
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        l020 C;
        int i = this.a;
        i4b i4bVar = this.b;
        switch (i) {
            case 0:
                JoinThreadData joinThreadData = (JoinThreadData) obj;
                String str = i4bVar.b.a.b;
                C = i4bVar.d.C();
                try {
                    C.R(str, joinThreadData.getChatMember());
                    C.s();
                    C.close();
                    i4bVar.a();
                    return;
                } finally {
                }
            default:
                ChatData chatData = (ChatData) obj;
                C = i4bVar.d.C();
                try {
                    C.I(chatData);
                    C.s();
                    C.close();
                    i4bVar.a();
                    return;
                } finally {
                }
        }
    }
}
