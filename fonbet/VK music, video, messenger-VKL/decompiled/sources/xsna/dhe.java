package xsna;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.j0j;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dhe implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dhe(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                fhe fheVar = (fhe) obj2;
                e2f e2fVar = (e2f) obj;
                if (fheVar.c == null) {
                    e2fVar = null;
                }
                fheVar.c = e2fVar;
                break;
            default:
                s0j s0jVar = (s0j) obj;
                if (((j0j.f) obj2).c instanceof SessionRoomId.MainCall) {
                    s0jVar.C(j0j.b.b);
                    s0jVar.g.invoke(v1j.d.b);
                    break;
                }
                break;
        }
    }
}
