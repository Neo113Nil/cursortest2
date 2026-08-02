package defpackage;

import ru.yandex.video.m3.offline.ExoDownloadActionHelper;

/* loaded from: classes7.dex */
public final /* synthetic */ class dno implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ExoDownloadActionHelper b;
    public final /* synthetic */ String c;

    public /* synthetic */ dno(ExoDownloadActionHelper exoDownloadActionHelper, String str, int i) {
        this.a = i;
        this.b = exoDownloadActionHelper;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        ExoDownloadActionHelper exoDownloadActionHelper = this.b;
        switch (i) {
            case 0:
                ExoDownloadActionHelper.remove$lambda$3(exoDownloadActionHelper, str);
                break;
            case 1:
                ExoDownloadActionHelper.resume$lambda$2(exoDownloadActionHelper, str);
                break;
            default:
                ExoDownloadActionHelper.pause$lambda$1(exoDownloadActionHelper, str);
                break;
        }
    }
}
