package defpackage;

import ru.yandex.video.m3.player.impl.cache.StartFromCacheHelper;

/* loaded from: classes7.dex */
public final /* synthetic */ class b1u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartFromCacheHelper b;
    public final /* synthetic */ npg c;
    public final /* synthetic */ boolean w;

    public /* synthetic */ b1u0(StartFromCacheHelper startFromCacheHelper, npg npgVar, boolean z, int i) {
        this.a = i;
        this.b = startFromCacheHelper;
        this.c = npgVar;
        this.w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.w;
        npg npgVar = this.c;
        StartFromCacheHelper startFromCacheHelper = this.b;
        switch (i) {
            case 0:
                StartFromCacheHelper.onTransferEnd$lambda$10(startFromCacheHelper, npgVar, z);
                break;
            default:
                StartFromCacheHelper.onTransferInitializing$lambda$9(startFromCacheHelper, npgVar, z);
                break;
        }
    }
}
