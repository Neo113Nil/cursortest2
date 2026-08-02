package androidx.compose.ui.window;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "popupLayout", "Lzy11;", "invoke", "(Landroidx/compose/ui/window/PopupLayout;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
public final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends Lambda implements tls {
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 w = new PopupLayout$Companion$onCommitAffectingPopupPosition$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        PopupLayout popupLayout = (PopupLayout) obj;
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.updatePosition();
        }
        return zy11.a;
    }
}
