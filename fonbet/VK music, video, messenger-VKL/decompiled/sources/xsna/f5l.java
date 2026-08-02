package xsna;

import com.vk.debug.ui.dev.DebugFileManagerFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class f5l implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ DebugFileManagerFragment c;
    public final /* synthetic */ izs d;

    public /* synthetic */ f5l(int i, DebugFileManagerFragment debugFileManagerFragment, izs izsVar) {
        this.b = i;
        this.c = debugFileManagerFragment;
        this.d = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (this.b == this.c.O.get()) {
            this.d.invoke(list);
        }
        return s3q0.a;
    }
}
