package defpackage;

import ru.yandex.video.m3.list_player_manager.model.MediaData;
import ru.yandex.video.m3.ui.debug.ListYandexPlayerManagerDebugView;

/* loaded from: classes7.dex */
public final /* synthetic */ class buy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListYandexPlayerManagerDebugView b;
    public final /* synthetic */ MediaData c;

    public /* synthetic */ buy(ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView, MediaData mediaData, int i) {
        this.a = i;
        this.b = listYandexPlayerManagerDebugView;
        this.c = mediaData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaData mediaData = this.c;
        ListYandexPlayerManagerDebugView listYandexPlayerManagerDebugView = this.b;
        switch (i) {
            case 0:
                ListYandexPlayerManagerDebugView.onPreloadSuccess$lambda$12(listYandexPlayerManagerDebugView, mediaData);
                break;
            case 1:
                ListYandexPlayerManagerDebugView.onPreloadCanceled$lambda$13(listYandexPlayerManagerDebugView, mediaData);
                break;
            case 2:
                ListYandexPlayerManagerDebugView.onPreloadError$lambda$14(listYandexPlayerManagerDebugView, mediaData);
                break;
            default:
                ListYandexPlayerManagerDebugView.onPreloadStarted$lambda$11(listYandexPlayerManagerDebugView, mediaData);
                break;
        }
    }
}
