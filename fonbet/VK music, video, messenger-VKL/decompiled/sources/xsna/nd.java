package xsna;

import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridUploadListFragment;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class nd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ nd(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        switch (i) {
            case 0:
                int i2 = AbstractClipsGridUploadListFragment.i0;
                bkd bkdVar = (bkd) ref$ObjectRef.element;
                if (bkdVar != null) {
                    bkdVar.dismiss();
                }
                ref$ObjectRef.element = null;
                break;
            default:
                ((dw20) ref$ObjectRef.element).hide();
                break;
        }
        return s3q0.a;
    }
}
