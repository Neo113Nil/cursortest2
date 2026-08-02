package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class ba60 extends keo {
    public static final ba60 c;

    static {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Открытие диалогового окна для включения NFC");
        c = new ba60("nfc_show_dialog", mapBuilder.j());
    }
}
