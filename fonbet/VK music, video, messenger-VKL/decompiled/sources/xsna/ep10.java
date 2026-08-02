package xsna;

import java.util.Map;
import xsna.tra0;

/* compiled from: MeasureScope.kt */
/* loaded from: classes11.dex */
public interface ep10 extends apx {

    /* compiled from: MeasureScope.kt */
    public static final class a implements dp10 {
        public final int a;
        public final int b;
        public final Map<gt1, Integer> c;
        public final izs<srg0, s3q0> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ ep10 f;
        public final /* synthetic */ izs<tra0.a, s3q0> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, ep10 ep10Var, izs<? super tra0.a, s3q0> izsVar2) {
            this.e = i;
            this.f = ep10Var;
            this.g = izsVar2;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = izsVar;
        }

        @Override // xsna.dp10
        public final int getHeight() {
            return this.b;
        }

        @Override // xsna.dp10
        public final int getWidth() {
            return this.a;
        }

        @Override // xsna.dp10
        public final void j() {
            ep10 ep10Var = this.f;
            boolean z = ep10Var instanceof androidx.compose.ui.node.f;
            izs<tra0.a, s3q0> izsVar = this.g;
            if (z) {
                izsVar.invoke(((androidx.compose.ui.node.f) ep10Var).m);
                return;
            }
            izsVar.invoke(new srj0(this.e, ep10Var.getLayoutDirection(), ep10Var.getDensity(), ep10Var.getFontScale()));
        }

        @Override // xsna.dp10
        public final izs<srg0, s3q0> k() {
            return this.d;
        }

        @Override // xsna.dp10
        public final Map<gt1, Integer> q() {
            return this.c;
        }
    }

    default dp10 F1(int i, int i2, Map<gt1, Integer> map, izs<? super srg0, s3q0> izsVar, izs<? super tra0.a, s3q0> izsVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            uzw.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(i, i2, map, izsVar, this, izsVar2);
    }

    default dp10 Q(int i, int i2, Map<gt1, Integer> map, izs<? super tra0.a, s3q0> izsVar) {
        return F1(i, i2, map, null, izsVar);
    }
}
