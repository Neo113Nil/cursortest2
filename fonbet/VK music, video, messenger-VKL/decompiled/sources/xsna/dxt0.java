package xsna;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.internal.Lambda;
import xsna.ae2;
import xsna.m1h0;

/* compiled from: AndroidView.android.kt */
/* loaded from: classes11.dex */
public final class dxt0<T extends View> extends xd2 {
    public final T C;
    public final e160 D;
    public final m1h0 E;
    public m1h0.a F;
    public izs<? super T, s3q0> G;
    public izs<? super T, s3q0> H;
    public izs<? super T, s3q0> I;

    /* compiled from: AndroidView.android.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ dxt0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dxt0<T> dxt0Var) {
            super(0);
            this.this$0 = dxt0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            dxt0<T> dxt0Var = this.this$0;
            dxt0Var.getReleaseBlock().invoke(dxt0Var.C);
            dxt0.h(this.this$0);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class b extends Lambda implements gzs<s3q0> {
        final /* synthetic */ dxt0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dxt0<T> dxt0Var) {
            super(0);
            this.this$0 = dxt0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            dxt0<T> dxt0Var = this.this$0;
            dxt0Var.getResetBlock().invoke(dxt0Var.C);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    public static final class c extends Lambda implements gzs<s3q0> {
        final /* synthetic */ dxt0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(dxt0<T> dxt0Var) {
            super(0);
            this.this$0 = dxt0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            dxt0<T> dxt0Var = this.this$0;
            dxt0Var.getUpdateBlock().invoke(dxt0Var.C);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dxt0(Context context, izs<? super Context, ? extends T> izsVar, cvi cviVar, m1h0 m1h0Var, int i, androidx.compose.ui.node.p pVar) {
        super(context, cviVar, i, r4, r5, pVar);
        T invoke = izsVar.invoke(context);
        e160 e160Var = new e160();
        this.C = invoke;
        this.D = e160Var;
        this.E = m1h0Var;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object e = m1h0Var != null ? m1h0Var.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e instanceof SparseArray ? (SparseArray) e : null;
        if (sparseArray != null) {
            invoke.restoreHierarchyState(sparseArray);
        }
        if (m1h0Var != null) {
            setSavableRegistryEntry(m1h0Var.b(valueOf, new cxt0(this)));
        }
        ae2.h hVar = ae2.a;
        this.G = hVar;
        this.H = hVar;
        this.I = hVar;
    }

    public static final void h(dxt0 dxt0Var) {
        dxt0Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(m1h0.a aVar) {
        m1h0.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.F = aVar;
    }

    public final e160 getDispatcher() {
        return this.D;
    }

    public final izs<T, s3q0> getReleaseBlock() {
        return this.I;
    }

    public final izs<T, s3q0> getResetBlock() {
        return this.H;
    }

    public /* bridge */ /* synthetic */ td getSubCompositionView() {
        return null;
    }

    public final izs<T, s3q0> getUpdateBlock() {
        return this.G;
    }

    public final void setReleaseBlock(izs<? super T, s3q0> izsVar) {
        this.I = izsVar;
        setRelease(new a(this));
    }

    public final void setResetBlock(izs<? super T, s3q0> izsVar) {
        this.H = izsVar;
        setReset(new b(this));
    }

    public final void setUpdateBlock(izs<? super T, s3q0> izsVar) {
        this.G = izsVar;
        setUpdate(new c(this));
    }

    public View getViewRoot() {
        return this;
    }
}
