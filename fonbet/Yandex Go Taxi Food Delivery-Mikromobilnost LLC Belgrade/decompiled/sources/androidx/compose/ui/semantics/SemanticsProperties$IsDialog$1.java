package androidx.compose.ui.semantics;

import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "<unused var>", "invoke", "(Lzy11;Lzy11;)Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class SemanticsProperties$IsDialog$1 extends Lambda implements wls {
    public static final SemanticsProperties$IsDialog$1 w = new SemanticsProperties$IsDialog$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
