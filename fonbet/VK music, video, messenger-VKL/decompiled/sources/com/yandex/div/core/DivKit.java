package com.yandex.div.core;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.dagger.Yatagan$DivKitComponent;
import xsna.zcl;

/* compiled from: DivKit.kt */
/* loaded from: classes7.dex */
public final class DivKit {
    public static final Companion Companion = new Companion(null);
    private static final DivKitConfiguration DEFAULT_CONFIGURATION = new DivKitConfiguration.Builder().build();
    private static DivKitConfiguration configuration;
    private static volatile DivKit instance;
    private final DivKitComponent component;

    /* compiled from: DivKit.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final DivKit getInstance(Context context) {
            DivKit divKit = DivKit.instance;
            if (divKit != null) {
                return divKit;
            }
            synchronized (this) {
                try {
                    DivKit divKit2 = DivKit.instance;
                    if (divKit2 != null) {
                        return divKit2;
                    }
                    DivKitConfiguration divKitConfiguration = DivKit.configuration;
                    if (divKitConfiguration == null) {
                        divKitConfiguration = DivKit.DEFAULT_CONFIGURATION;
                    }
                    DivKit divKit3 = new DivKit(context, divKitConfiguration, null);
                    DivKit.instance = divKit3;
                    return divKit3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final String getVersionName() {
            return "32.18.1";
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivKit(Context context, DivKitConfiguration divKitConfiguration, zcl zclVar) {
        this(context, divKitConfiguration);
    }

    public final DivKitComponent getComponent$div_release() {
        return this.component;
    }

    private DivKit(Context context, DivKitConfiguration divKitConfiguration) {
        this.component = Yatagan$DivKitComponent.builder().applicationContext(context.getApplicationContext()).configuration(divKitConfiguration).build();
    }
}
