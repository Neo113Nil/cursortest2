package xsna;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.Lambda;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class di2 extends Lambda implements izs<lgn, kgn> {
    final /* synthetic */ SnapshotStateList<Object> $currentlyVisible;
    final /* synthetic */ mi2<Object> $rootScope;
    final /* synthetic */ Object $stateForContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di2(SnapshotStateList<Object> snapshotStateList, Object obj, mi2<Object> mi2Var) {
        super(1);
        this.$currentlyVisible = snapshotStateList;
        this.$stateForContent = obj;
        this.$rootScope = mi2Var;
    }

    @Override // xsna.izs
    public final kgn invoke(lgn lgnVar) {
        return new ci2(this.$currentlyVisible, this.$stateForContent, this.$rootScope);
    }
}
