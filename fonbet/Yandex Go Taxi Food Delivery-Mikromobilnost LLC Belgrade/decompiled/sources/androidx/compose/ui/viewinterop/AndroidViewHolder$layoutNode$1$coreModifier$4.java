package androidx.compose.ui.viewinterop;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lzii0;", "Lzy11;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "it", "invoke", "(Ltls;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$coreModifier$4 extends Lambda implements tls {
    final /* synthetic */ AndroidViewHolder $this_run;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$coreModifier$4(AndroidViewHolder androidViewHolder) {
        super(1);
        this.$this_run = androidViewHolder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.$this_run.bringIntoViewRequester = (tls) obj;
        return zy11.a;
    }
}
