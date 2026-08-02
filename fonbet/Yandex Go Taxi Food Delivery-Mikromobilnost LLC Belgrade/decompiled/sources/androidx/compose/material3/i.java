package androidx.compose.material3;

import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.fid;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractComposeView c;

    public /* synthetic */ i(AbstractComposeView abstractComposeView, int i, int i2) {
        this.a = i2;
        this.c = abstractComposeView;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 Content$lambda$0;
        zy11 Content$lambda$02;
        int i = this.a;
        int i2 = this.b;
        AbstractComposeView abstractComposeView = this.c;
        switch (i) {
            case 0:
                Content$lambda$0 = ModalBottomSheetDialogLayout.Content$lambda$0((ModalBottomSheetDialogLayout) abstractComposeView, i2, (fid) obj, ((Integer) obj2).intValue());
                return Content$lambda$0;
            default:
                Content$lambda$02 = ModalWideNavigationRailDialogLayout.Content$lambda$0((ModalWideNavigationRailDialogLayout) abstractComposeView, i2, (fid) obj, ((Integer) obj2).intValue());
                return Content$lambda$02;
        }
    }
}
