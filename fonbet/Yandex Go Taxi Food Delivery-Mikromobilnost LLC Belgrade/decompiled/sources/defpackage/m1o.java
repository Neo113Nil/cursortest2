package defpackage;

import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class m1o extends keo {
    public static final m1o c = new m1o("bdui_engine_error_view_config_missing", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "ErrorViewFactory равен null при включённом isEngineErrorViewEnabled"));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m1o);
    }

    public final int hashCode() {
        return -814432410;
    }

    public final String toString() {
        return "EngineErrorViewConfigMissing";
    }
}
