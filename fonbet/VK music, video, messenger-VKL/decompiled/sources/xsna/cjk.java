package xsna;

import com.vk.dto.photo.ImageCropData;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cjk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ cjk(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(epx.f(((ImageCropData) obj).b(), this.c));
            default:
                return ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.COLOR, null, this.c, null, false, null, null, null, 250);
        }
    }
}
