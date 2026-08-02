package ru.ok.android.externcalls.sdk.audio.internal;

import ru.ok.android.externcalls.sdk.audio.Logger;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DeviceSwitchHelper.kt */
/* loaded from: classes9.dex */
public final class DeviceSwitchHelper<T> {
    private final izs<T, s3q0> applyDevice;
    private final boolean isEnabled;
    private final String logTag;
    private final Logger logger;
    private T ongoingAudioDevice;
    private T pendingAudioDevice;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSwitchHelper(boolean z, Logger logger, String str, izs<? super T, s3q0> izsVar) {
        this.isEnabled = z;
        this.logger = logger;
        this.logTag = str;
        this.applyDevice = izsVar;
    }

    public final void onDeviceSwitchRequested(T t) {
        if (!this.isEnabled) {
            this.applyDevice.invoke(t);
            return;
        }
        T t2 = this.pendingAudioDevice;
        if (t2 == null) {
            this.logger.d(this.logTag, "Pending device not yet present. Register " + t + " as new one");
            this.pendingAudioDevice = t;
            this.ongoingAudioDevice = null;
            this.applyDevice.invoke(t);
            return;
        }
        T t3 = this.ongoingAudioDevice;
        if (t3 == null) {
            if (t2.equals(t)) {
                this.logger.d(this.logTag, "Pending device " + t2 + " is the same with proposed one, ignore");
                return;
            }
            this.logger.d(this.logTag, "Pending device " + t2 + " is not the same as proposed one - " + t + ". Keep it as ongoing");
            this.ongoingAudioDevice = t;
            return;
        }
        if (t3.equals(t)) {
            this.logger.d(this.logTag, "Pending device " + t2 + " is not the same as proposed one, but ongoing device " + t3 + " is, ignore");
            return;
        }
        if (t2.equals(t)) {
            this.logger.d(this.logTag, "Pending device " + t2 + " is the same as proposed one, reset ongoing device " + t3 + " to null");
            this.ongoingAudioDevice = null;
            return;
        }
        this.ongoingAudioDevice = t;
        this.logger.d(this.logTag, "Pending device " + t2 + " and ongoing device " + t3 + " are both not the same as proposed one, replace ongoing device with " + t);
    }

    public final void onDeviceSwitched() {
        if (this.isEnabled) {
            this.logger.d(this.logTag, "Pending device doesn't matter anymore. Reset");
            this.pendingAudioDevice = null;
            T t = this.ongoingAudioDevice;
            this.ongoingAudioDevice = null;
            if (t == null) {
                this.logger.d(this.logTag, "Pending device reset done, no ongoing device found");
                return;
            }
            this.logger.d(this.logTag, "Pending device reset done, but ongoing device found, start flow again for " + t);
            onDeviceSwitchRequested(t);
        }
    }
}
