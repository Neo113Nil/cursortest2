package ru.ok.android.externcalls.analytics.config;

import xsna.gzs;
import xsna.vi0;
import xsna.zcl;

/* compiled from: EventMetaParamsConfig.kt */
/* loaded from: classes9.dex */
public final class EventMetaParamsConfig {
    private final gzs<String> appName;

    /* JADX WARN: Multi-variable type inference failed */
    public EventMetaParamsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return null;
    }

    public final gzs<String> getAppName() {
        return this.appName;
    }

    public EventMetaParamsConfig(gzs<String> gzsVar) {
        this.appName = gzsVar;
    }

    public /* synthetic */ EventMetaParamsConfig(gzs gzsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new vi0(18) : gzsVar);
    }
}
