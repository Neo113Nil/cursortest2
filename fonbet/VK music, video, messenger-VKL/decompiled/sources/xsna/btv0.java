package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import kotlin.Pair;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public interface btv0 extends fxb0 {

    /* compiled from: VkTooltip.kt */
    public static final class a implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            int b = an10.b((j0t.c(this.d, this.e).j().b * this.c) / 2.0f);
            int b2 = an10.b(((int) (j2 >> 32)) / 2.0f);
            zhf0 zhf0Var = this.b;
            float f = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f) / 2) + f + l9xVar.a);
            float f2 = zhf0Var.b;
            long b4 = ((b3 - b2) << 32) | ((an10.b(wq.a(zhf0Var.d, f2, r7, f2) + l9xVar.b) - b) & 4294967295L);
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class b implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public b(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            Pair<pco, pco> c = j0t.c(this.d, this.e);
            float f = c.i().b;
            float f2 = this.c;
            int b = an10.b((f * f2) / 2.0f);
            int b2 = an10.b((c.j().b * f2) / 2.0f);
            int i = ((int) (j2 >> 32)) - b;
            zhf0 zhf0Var = this.b;
            float f3 = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f3) / 2) + f3 + l9xVar.a);
            float f4 = zhf0Var.b;
            long b4 = ((b3 - i) << 32) | ((an10.b(wq.a(zhf0Var.d, f4, r7, f4) + l9xVar.b) - b2) & 4294967295L);
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class c implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            Pair<pco, pco> c = j0t.c(this.d, this.e);
            float f = c.i().b;
            float f2 = this.c;
            int b = an10.b((f * f2) / 2.0f);
            int b2 = an10.b((c.j().b * f2) / 2.0f);
            zhf0 zhf0Var = this.b;
            float f3 = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f3) / 2) + f3 + l9xVar.a);
            float f4 = zhf0Var.b;
            long b4 = ((b3 - b) << 32) | ((an10.b(wq.a(zhf0Var.d, f4, r6, f4) + l9xVar.b) - b2) & 4294967295L);
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class d implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public d(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            int b = an10.b((j0t.c(this.d, this.e).j().b * this.c) / 2.0f);
            int b2 = an10.b(((int) (j2 >> 32)) / 2.0f);
            int i = ((int) (j2 & 4294967295L)) - b;
            zhf0 zhf0Var = this.b;
            float f = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f) / 2) + f + l9xVar.a);
            float f2 = zhf0Var.b;
            long b4 = ((b3 - b2) << 32) | (4294967295L & (an10.b(wq.a(zhf0Var.d, f2, r9, f2) + l9xVar.b) - i));
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class e implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            Pair<pco, pco> c = j0t.c(this.d, this.e);
            float f = c.i().b;
            float f2 = this.c;
            int b = ((int) (j2 >> 32)) - an10.b((f * f2) / 2.0f);
            int b2 = ((int) (j2 & 4294967295L)) - an10.b((c.j().b * f2) / 2.0f);
            zhf0 zhf0Var = this.b;
            float f3 = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f3) / 2) + f3 + l9xVar.a);
            float f4 = zhf0Var.b;
            long b4 = ((b3 - b) << 32) | ((an10.b(wq.a(zhf0Var.d, f4, r9, f4) + l9xVar.b) - b2) & 4294967295L);
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class f implements btv0 {
        public final zhf0 b;
        public final float c;
        public final VkTooltip$MarkerStyle d;
        public final VkTooltip$MarkerSize e;
        public final izs<z4p0, s3q0> f;

        /* JADX WARN: Multi-variable type inference failed */
        public f(zhf0 zhf0Var, float f, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, izs<? super z4p0, s3q0> izsVar) {
            this.b = zhf0Var;
            this.c = f;
            this.d = vkTooltip$MarkerStyle;
            this.e = vkTooltip$MarkerSize;
            this.f = izsVar;
        }

        @Override // xsna.fxb0
        public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
            Pair<pco, pco> c = j0t.c(this.d, this.e);
            float f = c.i().b;
            float f2 = this.c;
            int b = an10.b((f * f2) / 2.0f);
            int b2 = ((int) (j2 & 4294967295L)) - an10.b((c.j().b * f2) / 2.0f);
            zhf0 zhf0Var = this.b;
            float f3 = zhf0Var.a;
            int b3 = an10.b(((zhf0Var.c - f3) / 2) + f3 + l9xVar.a);
            float f4 = zhf0Var.b;
            long b4 = ((b3 - b) << 32) | ((an10.b(wq.a(zhf0Var.d, f4, r8, f4) + l9xVar.b) - b2) & 4294967295L);
            this.f.invoke(new z4p0(l9xVar, j, layoutDirection, j2, b4));
            return b4;
        }
    }
}
