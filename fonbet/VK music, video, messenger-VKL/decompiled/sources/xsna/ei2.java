package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class ei2 extends Lambda implements yzs<om2, androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ zzs<hi2, Object, androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ SnapshotStateList<Object> $currentlyVisible;
    final /* synthetic */ mi2<Object> $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ei2(SnapshotStateList<Object> snapshotStateList, Object obj, mi2<Object> mi2Var, zzs<? super hi2, Object, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        super(3);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = mi2Var;
        this.$content = zzsVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(om2 om2Var, androidx.compose.runtime.a aVar, Integer num) {
        om2 om2Var2 = om2Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? aVar2.J(om2Var2) : aVar2.y(om2Var2) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-143346359, intValue, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
            }
            boolean J = aVar2.J(this.$currentlyVisible) | aVar2.y(this.$stateForContent) | aVar2.y(this.$rootScope);
            SnapshotStateList<Object> snapshotStateList = this.$currentlyVisible;
            Object obj = this.$stateForContent;
            mi2<Object> mi2Var = this.$rootScope;
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new di2(snapshotStateList, obj, mi2Var);
                aVar2.R(x);
            }
            bap.c(om2Var2, (izs) x, aVar2, intValue & 14);
            this.$rootScope.e.p(this.$stateForContent, ((pm2) om2Var2).a);
            Object x2 = aVar2.x();
            if (x2 == c0012a) {
                x2 = new ii2(om2Var2);
                aVar2.R(x2);
            }
            this.$content.invoke((ii2) x2, this.$stateForContent, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
