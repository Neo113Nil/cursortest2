package xsna;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidView.android.kt */
/* loaded from: classes11.dex */
public final class cxt0 extends Lambda implements gzs<Object> {
    final /* synthetic */ dxt0<View> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxt0(dxt0<View> dxt0Var) {
        super(0);
        this.this$0 = dxt0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.this$0.C.saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
