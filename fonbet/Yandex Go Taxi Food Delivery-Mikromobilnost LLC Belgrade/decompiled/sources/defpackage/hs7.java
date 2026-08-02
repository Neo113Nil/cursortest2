package defpackage;

import androidx.camera.core.CameraState;
import androidx.camera.view.PreviewView;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes10.dex */
public final /* synthetic */ class hs7 implements pq60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hs7(js7 js7Var, String str) {
        this.a = 0;
        this.b = js7Var;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        HashMap hashMap;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                js7 js7Var = (js7) obj2;
                CameraState cameraState = (CameraState) obj;
                if (!js7Var.h.get()) {
                    sgb1.g(3, "CameraPresencePrvdr");
                    return;
                }
                if ((cameraState != null ? cameraState.a() : null) == null) {
                    if ((cameraState != null ? cameraState.b() : null) != CameraState.Type.CLOSED) {
                        return;
                    }
                }
                Objects.toString(cameraState.b());
                sgb1.g(5, "CameraPresencePrvdr");
                zn7 zn7Var = js7Var.e;
                if (zn7Var != null) {
                    zn7Var.c();
                    return;
                }
                return;
            case 1:
                gdh gdhVar = (gdh) obj2;
                if (((PreviewView.StreamState) obj) == PreviewView.StreamState.STREAMING) {
                    ((ShimmeringFrameLayout) gdhVar.u.getValue()).setShimmering(false);
                    gdhVar.j().setVisibility(0);
                    return;
                }
                return;
            case 2:
                ((bas) obj2).l(obj);
                return;
            case 3:
                evy evyVar = (evy) obj2;
                dvy dvyVar = (dvy) obj;
                synchronized (evyVar.b) {
                    hashMap = new HashMap(evyVar.b);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    ((Executor) entry.getValue()).execute(new r7v(24, entry, dvyVar));
                }
                return;
            default:
                ((k200) obj2).invoke(obj);
                return;
        }
    }

    public /* synthetic */ hs7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
