package defpackage;

import androidx.camera.core.CameraState;
import androidx.camera.core.a;
import androidx.camera.core.impl.CameraInternal$State;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ct7 {
    public final ht7 a;
    public final dy40 b;

    public ct7(ht7 ht7Var) {
        this.a = ht7Var;
        dy40 dy40Var = new dy40();
        this.b = dy40Var;
        dy40Var.m(new a(CameraState.Type.CLOSED, null));
    }

    public final void a(CameraInternal$State cameraInternal$State, CameraState.a aVar) {
        a aVar2;
        if (aVar == null || aVar.b() != 8) {
            switch (bt7.a[cameraInternal$State.ordinal()]) {
                case 1:
                    ht7 ht7Var = this.a;
                    synchronized (ht7Var.b) {
                        Iterator it = ht7Var.e.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                aVar2 = new a(CameraState.Type.PENDING_OPEN, null);
                            } else if (((ft7) ((Map.Entry) it.next()).getValue()).a == CameraInternal$State.CLOSING) {
                                aVar2 = new a(CameraState.Type.OPENING, null);
                            }
                        }
                    }
                    break;
                case 2:
                    aVar2 = new a(CameraState.Type.OPENING, aVar);
                    break;
                case 3:
                case 4:
                    aVar2 = new a(CameraState.Type.OPEN, aVar);
                    break;
                case 5:
                case 6:
                    aVar2 = new a(CameraState.Type.CLOSING, aVar);
                    break;
                case 7:
                case 8:
                    aVar2 = new a(CameraState.Type.CLOSED, aVar);
                    break;
                default:
                    yci0.k(cameraInternal$State, "Unknown internal camera state: ");
                    return;
            }
        } else {
            aVar2 = new a(CameraState.Type.CLOSED, aVar);
        }
        aVar2.toString();
        Objects.toString(cameraInternal$State);
        Objects.toString(aVar);
        sgb1.g(3, "CameraStateMachine");
        if (Objects.equals((CameraState) this.b.d(), aVar2)) {
            return;
        }
        aVar2.toString();
        sgb1.g(3, "CameraStateMachine");
        this.b.m(aVar2);
    }
}
