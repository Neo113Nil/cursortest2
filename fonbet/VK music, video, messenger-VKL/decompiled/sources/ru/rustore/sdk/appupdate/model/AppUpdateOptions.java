package ru.rustore.sdk.appupdate.model;

import xsna.zcl;

/* loaded from: classes9.dex */
public final class AppUpdateOptions {
    private final int appUpdateType;

    private AppUpdateOptions(int i) {
        this.appUpdateType = i;
    }

    public final int getAppUpdateType() {
        return this.appUpdateType;
    }

    public /* synthetic */ AppUpdateOptions(int i, zcl zclVar) {
        this(i);
    }

    public static final class Builder {
        private int appUpdateType;

        public final Builder appUpdateType(int i) {
            this.appUpdateType = i;
            return this;
        }

        public final AppUpdateOptions build() {
            return new AppUpdateOptions(this.appUpdateType, null);
        }

        private static /* synthetic */ void getAppUpdateType$annotations() {
        }
    }
}
