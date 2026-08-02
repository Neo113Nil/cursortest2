package com.yandex.go.scooters.photocontrol.data.model;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolRecognitionExperiment;", "Lw96;", "Companion", "Android", "AndroidVendorFlags", "com/yandex/go/scooters/photocontrol/data/model/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersPhotocontrolRecognitionExperiment extends w96 {
    public static final f Companion = new f();
    public static final ScootersPhotocontrolRecognitionExperiment d = new ScootersPhotocontrolRecognitionExperiment(0);
    public final boolean b;
    public final Android c;

    public /* synthetic */ ScootersPhotocontrolRecognitionExperiment(int i, boolean z, Android android2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = new Android(0);
        } else {
            this.c = android2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolRecognitionExperiment$AndroidVendorFlags;", "", "Companion", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AndroidVendorFlags {
        public static final e Companion = new e();
        public final boolean a;
        public final boolean b;

        public /* synthetic */ AndroidVendorFlags(int i, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
        }

        public AndroidVendorFlags(int i) {
            this.a = false;
            this.b = false;
        }

        public AndroidVendorFlags() {
            this(0);
        }
    }

    public ScootersPhotocontrolRecognitionExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolRecognitionExperiment$Android;", "", "Companion", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Android {
        public static final d Companion = new d();
        public final AndroidVendorFlags a;
        public final AndroidVendorFlags b;

        public /* synthetic */ Android(int i, AndroidVendorFlags androidVendorFlags, AndroidVendorFlags androidVendorFlags2) {
            this.a = (i & 1) == 0 ? new AndroidVendorFlags(0) : androidVendorFlags;
            if ((i & 2) == 0) {
                this.b = new AndroidVendorFlags(0);
            } else {
                this.b = androidVendorFlags2;
            }
        }

        public Android() {
            this(0);
        }

        public Android(int i) {
            AndroidVendorFlags androidVendorFlags = new AndroidVendorFlags(0);
            AndroidVendorFlags androidVendorFlags2 = new AndroidVendorFlags(0);
            this.a = androidVendorFlags;
            this.b = androidVendorFlags2;
        }
    }

    public ScootersPhotocontrolRecognitionExperiment(int i) {
        Android android2 = new Android(0);
        this.b = false;
        this.c = android2;
    }
}
