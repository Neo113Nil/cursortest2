package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class p7y implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ vpr b;

    public /* synthetic */ p7y(vpr vprVar, int i) {
        this.a = i;
        this.b = vprVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                return this.b.emit((k7z) obj, continuation);
            case 1:
                return this.b.emit((k7z) obj, continuation);
            default:
                return this.b.emit(obj, continuation);
        }
    }
}
