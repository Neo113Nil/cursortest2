package com.yandex.go.universal_qr_scanner.experiments.config;

import defpackage.c6z;
import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/universal_qr_scanner/experiments/config/UniversalQrScannerConfigExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/universal_qr_scanner/experiments/config/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UniversalQrScannerConfigExperiment extends w96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] g = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(13)), null, null, null, null};
    public static final UniversalQrScannerConfigExperiment h = new UniversalQrScannerConfigExperiment(0);
    public final Map b;
    public final boolean c;
    public final ReadyToScanConfig d;
    public final QrNotSupportedConfig e;
    public final CameraUnavailableConfig f;

    public UniversalQrScannerConfigExperiment(int i, Map map, boolean z, ReadyToScanConfig readyToScanConfig, QrNotSupportedConfig qrNotSupportedConfig, CameraUnavailableConfig cameraUnavailableConfig) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            ReadyToScanConfig.Companion.getClass();
            this.d = ReadyToScanConfig.b;
        } else {
            this.d = readyToScanConfig;
        }
        if ((i & 8) == 0) {
            QrNotSupportedConfig.Companion.getClass();
            this.e = QrNotSupportedConfig.c;
        } else {
            this.e = qrNotSupportedConfig;
        }
        if ((i & 16) != 0) {
            this.f = cameraUnavailableConfig;
        } else {
            CameraUnavailableConfig.Companion.getClass();
            this.f = CameraUnavailableConfig.d;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    public UniversalQrScannerConfigExperiment() {
        this(0);
    }

    public UniversalQrScannerConfigExperiment(int i) {
        Map f = kotlin.collections.b.f();
        ReadyToScanConfig.Companion.getClass();
        QrNotSupportedConfig.Companion.getClass();
        CameraUnavailableConfig.Companion.getClass();
        this.b = f;
        this.c = false;
        this.d = ReadyToScanConfig.b;
        this.e = QrNotSupportedConfig.c;
        this.f = CameraUnavailableConfig.d;
    }
}
