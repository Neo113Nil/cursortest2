package androidx.compose.ui.window;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.z910;
import java.util.List;

/* loaded from: classes10.dex */
public final class d implements z910 {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ LayoutDirection b;

    public d(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.a = popupLayout;
        this.b = layoutDirection;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        this.a.setParentLayoutDirection(this.b);
        w = kVar.w(0, 0, kotlin.collections.b.f(), AndroidPopup_androidKt$Popup$8$1$1.w);
        return w;
    }
}
