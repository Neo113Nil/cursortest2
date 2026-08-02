package com.yandex.plus.home.feature.webviews.internal.settings.domain;

import defpackage.ba6;
import defpackage.jl40;
import defpackage.m5r0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\b\t\n\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "HostChangeSettingError", "IllegalChangeDisabledSettingError", "UnsupportedSettingType", "UnSupportedSettingError", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$HostChangeSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$IllegalChangeDisabledSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$UnSupportedSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$UnsupportedSettingType;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ChangePlusSettingsInteractor$ChangeSettingError extends Exception {
    private final String message;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$HostChangeSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.KEY_EXCEPTION, "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "Lba6;", "settingData", "Lba6;", "a", "()Lba6;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HostChangeSettingError extends ChangePlusSettingsInteractor$ChangeSettingError {
        private final Exception exception;
        private final ba6 settingData;

        public HostChangeSettingError(RuntimeException runtimeException, ba6 ba6Var) {
            super("HostChangeSettingError(exception=" + runtimeException + ", settingData=" + ba6Var + ')');
            this.exception = runtimeException;
            this.settingData = ba6Var;
        }

        /* renamed from: a, reason: from getter */
        public final ba6 getSettingData() {
            return this.settingData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HostChangeSettingError)) {
                return false;
            }
            HostChangeSettingError hostChangeSettingError = (HostChangeSettingError) obj;
            return jl40.l(this.exception, hostChangeSettingError.exception) && jl40.l(this.settingData, hostChangeSettingError.settingData);
        }

        public final int hashCode() {
            return this.settingData.hashCode() + (this.exception.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "HostChangeSettingError(exception=" + this.exception + ", settingData=" + this.settingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$IllegalChangeDisabledSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError;", "Lba6;", "settingData", "Lba6;", "a", "()Lba6;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IllegalChangeDisabledSettingError extends ChangePlusSettingsInteractor$ChangeSettingError {
        private final ba6 settingData;

        public IllegalChangeDisabledSettingError(ba6 ba6Var) {
            super("IllegalChangeDisabledSettingError(settingData=" + ba6Var + ')');
            this.settingData = ba6Var;
        }

        /* renamed from: a, reason: from getter */
        public final ba6 getSettingData() {
            return this.settingData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IllegalChangeDisabledSettingError) && jl40.l(this.settingData, ((IllegalChangeDisabledSettingError) obj).settingData);
        }

        public final int hashCode() {
            return this.settingData.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "IllegalChangeDisabledSettingError(settingData=" + this.settingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$UnSupportedSettingError;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError;", "Lm5r0;", "settingData", "Lm5r0;", "getSettingData", "()Lm5r0;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnSupportedSettingError extends ChangePlusSettingsInteractor$ChangeSettingError {
        private final m5r0 settingData;

        public UnSupportedSettingError(ba6 ba6Var) {
            super("UnSupportedSettingError(settingData=" + ba6Var + ')');
            this.settingData = ba6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnSupportedSettingError) && jl40.l(this.settingData, ((UnSupportedSettingError) obj).settingData);
        }

        public final int hashCode() {
            return this.settingData.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnSupportedSettingError(settingData=" + this.settingData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError$UnsupportedSettingType;", "Lcom/yandex/plus/home/feature/webviews/internal/settings/domain/ChangePlusSettingsInteractor$ChangeSettingError;", "Lm5r0;", "settingData", "Lm5r0;", "getSettingData", "()Lm5r0;", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsupportedSettingType extends ChangePlusSettingsInteractor$ChangeSettingError {
        private final m5r0 settingData;

        public UnsupportedSettingType(m5r0 m5r0Var) {
            super("UnsupportedSettingType(settingData=" + m5r0Var + ')');
            this.settingData = m5r0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnsupportedSettingType) && jl40.l(this.settingData, ((UnsupportedSettingType) obj).settingData);
        }

        public final int hashCode() {
            return this.settingData.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnsupportedSettingType(settingData=" + this.settingData + ')';
        }
    }

    public ChangePlusSettingsInteractor$ChangeSettingError(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
