package defpackage;

import android.graphics.Bitmap;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;

/* loaded from: classes5.dex */
public final /* synthetic */ class fis implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullScreenBannerPage b;
    public final /* synthetic */ Bitmap c;

    public /* synthetic */ fis(FullScreenBannerPage fullScreenBannerPage, Bitmap bitmap, int i) {
        this.a = i;
        this.b = fullScreenBannerPage;
        this.c = bitmap;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 tryToSetVideoBackground$lambda$1;
        int i = this.a;
        Bitmap bitmap = this.c;
        FullScreenBannerPage fullScreenBannerPage = this.b;
        switch (i) {
            case 0:
                zy11Var = FullScreenBannerPage.setupForegroundImage$lambda$0(fullScreenBannerPage, bitmap);
                return zy11Var;
            default:
                tryToSetVideoBackground$lambda$1 = FullScreenBannerPage.tryToSetVideoBackground$lambda$1(fullScreenBannerPage, bitmap);
                return tryToSetVideoBackground$lambda$1;
        }
    }
}
