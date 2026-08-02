package xsna;

import android.view.Surface;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class uzc0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ uzc0(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, android.view.Surface] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        T t;
        switch (this.b) {
            case 0:
                cuy cuyVar = ((ppp0) ((npp0) obj)).p;
                Ref$ObjectRef ref$ObjectRef = this.c;
                List list = (List) ref$ObjectRef.element;
                if (list != null) {
                    list.add(cuyVar);
                    t = list;
                } else {
                    t = e43.o(cuyVar);
                }
                ref$ObjectRef.element = t;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                this.c.element = (Surface) obj;
                return s3q0.a;
        }
    }
}
