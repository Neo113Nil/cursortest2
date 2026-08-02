package xsna;

import android.content.DialogInterface;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class hrd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ hrd(Ref$ObjectRef ref$ObjectRef, int i) {
        this.b = i;
        this.c = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = this.c;
                DialogInterface dialogInterface = (DialogInterface) ref$ObjectRef.element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ref$ObjectRef.element = null;
                return s3q0.a;
            default:
                return (dw20) this.c.element;
        }
    }
}
