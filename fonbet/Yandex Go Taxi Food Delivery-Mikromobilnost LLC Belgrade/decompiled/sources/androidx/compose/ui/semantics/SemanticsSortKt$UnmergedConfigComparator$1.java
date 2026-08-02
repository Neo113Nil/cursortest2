package androidx.compose.ui.semantics;

import defpackage.cnq0;
import defpackage.sls;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/semantics/c;", "a", "b", "", "invoke", "(Landroidx/compose/ui/semantics/c;Landroidx/compose/ui/semantics/c;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class SemanticsSortKt$UnmergedConfigComparator$1 extends Lambda implements wls {
    public static final SemanticsSortKt$UnmergedConfigComparator$1 w = new SemanticsSortKt$UnmergedConfigComparator$1(2);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements sls {
        public static final AnonymousClass1 w = new AnonymousClass1(0);

        @Override // defpackage.sls
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Float.valueOf(0.0f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.SemanticsSortKt$UnmergedConfigComparator$1$2, reason: invalid class name */
    final class AnonymousClass2 extends Lambda implements sls {
        public static final AnonymousClass2 w = new AnonymousClass2(0);

        @Override // defpackage.sls
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Float.valueOf(0.0f);
        }
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        cnq0 cnq0Var = ((c) obj).d;
        g gVar = d.u;
        return Integer.valueOf(Float.compare(((Number) cnq0Var.e(gVar, AnonymousClass1.w)).floatValue(), ((Number) ((c) obj2).d.e(gVar, AnonymousClass2.w)).floatValue()));
    }
}
