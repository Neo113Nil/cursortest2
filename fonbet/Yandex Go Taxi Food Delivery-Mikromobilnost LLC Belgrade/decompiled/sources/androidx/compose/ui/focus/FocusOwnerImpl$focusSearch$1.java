package androidx.compose.ui.focus;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/d;", "it", "", "invoke", "(Landroidx/compose/ui/focus/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class FocusOwnerImpl$focusSearch$1 extends Lambda implements tls {
    final /* synthetic */ tls $onFound;
    final /* synthetic */ d $source;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(d dVar, c cVar, tls tlsVar) {
        super(1);
        this.$source = dVar;
        this.this$0 = cVar;
        this.$onFound = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean booleanValue;
        d dVar = (d) obj;
        if (jl40.l(dVar, this.$source)) {
            booleanValue = false;
        } else {
            if (jl40.l(dVar, this.this$0.c)) {
                ny61.r("Focus search landed at the root.");
                return null;
            }
            booleanValue = ((Boolean) this.$onFound.invoke(dVar)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
