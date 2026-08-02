package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.phw;
import xsna.q630;

/* compiled from: CoauthorsPickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class czf {

    /* compiled from: CoauthorsPickerEntryPointCell.kt */
    @b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CoauthorsPickerEntryPointCellKt$CoauthorsPickerEntryPointCell$1$1$1", f = "CoauthorsPickerEntryPointCell.kt", l = {57}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ yc8 $bringIntoViewRequester;
        final /* synthetic */ etv0 $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yc8 yc8Var, etv0 etv0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$bringIntoViewRequester = yc8Var;
            this.$state = etv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$bringIntoViewRequester, this.$state, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yc8 yc8Var = this.$bringIntoViewRequester;
                this.label = 1;
                if (yc8Var.a(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$state.setVisible(true);
            return s3q0.a;
        }
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, String str, List list, izs izsVar, boolean z) {
        int i2;
        yc8 yc8Var;
        String N;
        gzs gzsVar;
        Cell$Left.Main main;
        String str2;
        String F;
        androidx.compose.runtime.a M = aVar.M(1668065130);
        if ((i & 6) == 0) {
            i2 = (M.J(list != null ? new wow(list) : null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1668065130, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CoauthorsPickerEntryPointCell (CoauthorsPickerEntryPointCell.kt:37)");
            }
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new zyf(izsVar, 0);
                M.R(x);
            }
            gzs gzsVar2 = (gzs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bd8();
                M.R(x2);
            }
            yc8 yc8Var2 = (yc8) x2;
            wow wowVar = list != null ? new wow(list) : null;
            if (wowVar == null || wowVar.b.isEmpty()) {
                yc8Var = yc8Var2;
                M.K(557281270);
                N = d370.N(R.string.posting_step2_select_coauthors_button, 0, M);
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1566156062, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-UserAddOutline20> (VkIcons.kt:11126)");
                }
                lg90 b = or.b(M, -1125331008, R.drawable.vk_icon_user_add_outline_20, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                jai c = kai.c(1092904737, new azf(0, str, yc8Var), M);
                boolean z3 = i3 == 2048;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    x3 = new to0(izsVar, 2);
                    M.R(x3);
                }
                Cell$Left.Main o00Var = new o00(b, str, c, (gzs) x3);
                M.j();
                gzsVar = null;
                main = o00Var;
                str2 = null;
            } else {
                M.K(557917855);
                boolean z4 = i3 == 2048;
                Object x4 = M.x();
                if (z4 || x4 == c0012a) {
                    x4 = new m77(izsVar, 4);
                    M.R(x4);
                }
                gzs gzsVar3 = (gzs) x4;
                qyf qyfVar = (qyf) j5g.Y(list != null ? new wow(list) : null);
                String str3 = qyfVar.a;
                int i4 = i2 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1665221139, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getCoauthorsSubtitle (CoauthorsPickerEntryPointCell.kt:92)");
                }
                int size = list.size();
                if (size == 1) {
                    F = zq.a(M, -1730508245, R.string.posting_step2_coauthor_title, M, 0);
                } else {
                    M.K(-1730427521);
                    int i5 = size - 1;
                    F = d370.F(R.plurals.and_more_n_coauthors_plural, i5, new Object[]{Integer.valueOf(i5)}, M, 0);
                    M.j();
                }
                String str4 = F;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yc8Var = yc8Var2;
                Cell$Left.Main b2 = com.vk.core.compose.component.cell.content.e.b(phw.a.a(fwu0.l(null, qyfVar.b, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), 24, null, M, 100663344, 252);
                M = M;
                M.j();
                main = b2;
                str2 = str4;
                N = str3;
                gzsVar = gzsVar3;
            }
            q630 E = ahn.E(fo50.s(q630.a.a, yc8Var), "PostingOpenCoauthorsPicker");
            String N2 = d370.N(R.string.posting_step2_coauthors_accessibility_remove, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new od3(15);
                M.R(x5);
            }
            androidx.compose.runtime.a aVar2 = M;
            qoc0.b(N, E, main, str2, N2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), null, null, gzsVar2, gzsVar, 0, 0, !z, aVar2, 0, 0, 6532);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bzf(i, str, list, izsVar, z);
        }
    }
}
