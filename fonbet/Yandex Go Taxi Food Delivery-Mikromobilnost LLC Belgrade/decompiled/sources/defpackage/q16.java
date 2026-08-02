package defpackage;

import ru.yandex.video.m3.player.baseurls.BaseUrlChecker;
import ru.yandex.video.m3.player.baseurls.BlacklistedBaseUrlsManagerImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class q16 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BlacklistedBaseUrlsManagerImpl b;
    public final /* synthetic */ BaseUrlChecker c;

    public /* synthetic */ q16(BlacklistedBaseUrlsManagerImpl blacklistedBaseUrlsManagerImpl, BaseUrlChecker baseUrlChecker, int i) {
        this.a = i;
        this.b = blacklistedBaseUrlsManagerImpl;
        this.c = baseUrlChecker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BaseUrlChecker baseUrlChecker = this.c;
        BlacklistedBaseUrlsManagerImpl blacklistedBaseUrlsManagerImpl = this.b;
        switch (i) {
            case 0:
                BlacklistedBaseUrlsManagerImpl._init_$lambda$9(blacklistedBaseUrlsManagerImpl, baseUrlChecker);
                break;
            default:
                BlacklistedBaseUrlsManagerImpl.lambda$9$lambda$8(blacklistedBaseUrlsManagerImpl, baseUrlChecker);
                break;
        }
    }
}
