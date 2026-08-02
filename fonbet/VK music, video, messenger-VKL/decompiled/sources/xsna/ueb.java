package xsna;

import com.vk.stickers.settings.StickerSettingsFeature;
import com.vk.stickers.settings.c;
import xsna.el50;
import xsna.tsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ueb implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ueb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((xeb) this.c).destroy();
                break;
            case 1:
                xyb xybVar = (xyb) this.c;
                xybVar.r = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 2:
                com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b bVar = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) this.c;
                el50.a.b(bVar, new yve(bVar, 4));
                break;
            case 3:
                ((lsb0) this.c).U(tsb0.b.a);
                break;
            case 4:
                ((com.vk.im.popup.a) this.c).dismiss();
                break;
            case 5:
                ((e5d0) this.c).Y0(false);
                break;
            default:
                ((StickerSettingsFeature) this.c).T(new c.e(true));
                break;
        }
    }
}
