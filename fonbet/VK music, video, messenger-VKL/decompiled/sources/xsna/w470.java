package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: NodeCoordinator.kt */
/* loaded from: classes11.dex */
public final class w470 extends Lambda implements wzs<yq9, mdu, s3q0> {
    final /* synthetic */ gzs<s3q0> $drawBlockCallToDrawModifiers;
    final /* synthetic */ androidx.compose.ui.node.o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w470(androidx.compose.ui.node.o oVar, x470 x470Var) {
        super(2);
        this.this$0 = oVar;
        this.$drawBlockCallToDrawModifiers = x470Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(yq9 yq9Var, mdu mduVar) {
        yq9 yq9Var2 = yq9Var;
        mdu mduVar2 = mduVar;
        if (this.this$0.q.g()) {
            androidx.compose.ui.node.o oVar = this.this$0;
            oVar.L = yq9Var2;
            oVar.K = mduVar2;
            t590 snapshotObserver = voy.a(oVar.q).getSnapshotObserver();
            snapshotObserver.a.d(this.this$0, androidx.compose.ui.node.o.S, this.$drawBlockCallToDrawModifiers);
            this.this$0.O = false;
        } else {
            this.this$0.O = true;
        }
        return s3q0.a;
    }
}
