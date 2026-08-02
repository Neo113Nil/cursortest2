package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ads0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ jai c;

    public /* synthetic */ ads0(int i, jai jaiVar) {
        this.b = i;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-28615601, intValue, -1, "com.vk.video.ui.share.impl.compose.VideoComposeThemeProvider.Theme.<anonymous> (VideoComposeThemeProvider.kt:26)");
                    }
                    rvi.a(c490.a.b(null), kai.c(975384463, new bfl0(1, this.c), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1790710165, intValue, -1, "com.vk.core.compose.component.cell.button.group.VkCellButtonGroup.<anonymous> (VkCellButtonGroup.kt:43)");
                    }
                    this.c.invoke(oma.a, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
