package xsna;

import com.vk.log.L;
import java.util.TreeSet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.nts0;

/* compiled from: ImVideoMessageCameraBridgeImpl.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class lew extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lew(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                kew kewVar = (kew) this.receiver;
                kewVar.getClass();
                L.e("VideoMessageLog", "onCameraReady");
                boolean z = false;
                if (kewVar.d.get() != null) {
                    TreeSet<Integer> treeSet = ung0.S;
                    jhu0 jhu0Var = ((fj9) ij9.a.a.getValue()).a;
                    if (jhu0Var != null) {
                        z = jhu0Var.p();
                    }
                }
                kewVar.b = z;
                nts0.b bVar = kewVar.f;
                if (bVar != null) {
                    nts0.this.g();
                }
                break;
            case 1:
                ((duh0) this.receiver).n();
                break;
            default:
                ((c2q0) this.receiver).a();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lew(Object obj) {
        super(0, obj, duh0.class, "onActionClearClicked", "onActionClearClicked()V", 0);
        this.b = 1;
    }
}
