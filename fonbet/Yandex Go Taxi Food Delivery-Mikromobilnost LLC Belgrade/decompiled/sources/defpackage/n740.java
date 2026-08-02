package defpackage;

import androidx.compose.foundation.gestures.i;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class n740 implements PointerInputEventHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ SnapshotStateList c;

    public n740(long j, long j2, SnapshotStateList snapshotStateList) {
        this.a = j;
        this.b = j2;
        this.c = snapshotStateList;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        long j = this.a;
        long j2 = this.b;
        SnapshotStateList snapshotStateList = this.c;
        return i.h(hwd0Var, new pa6(hwd0Var, j, j2, snapshotStateList, 2), null, new vk4(hwd0Var, j, j2, snapshotStateList), continuation, 6);
    }
}
