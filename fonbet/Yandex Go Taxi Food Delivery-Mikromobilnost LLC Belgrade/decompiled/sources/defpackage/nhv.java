package defpackage;

import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class nhv implements x790 {
    public final ImageViewerInfo a;

    public nhv(ImageViewerInfo imageViewerInfo) {
        this.a = imageViewerInfo;
    }

    @Override // defpackage.x790
    public final void a(qgg qggVar) {
        qggVar.F(new w790(Collections.singletonList(new mhv(this.a, null, null, null)), false, false));
    }

    @Override // defpackage.x790
    public final void b() {
    }

    @Override // defpackage.x790
    public final /* bridge */ /* synthetic */ Long c(Object obj) {
        return 0L;
    }

    @Override // defpackage.x790
    public final void d(Object obj, int i, aq80 aq80Var) {
        ((Number) obj).longValue();
        aq80Var.F(new w790(EmptyList.a, false, false));
    }

    @Override // defpackage.x790
    public final void e(Object obj, int i, yj70 yj70Var) {
        ((Number) obj).longValue();
        yj70Var.F(new w790(EmptyList.a, false, false));
    }
}
