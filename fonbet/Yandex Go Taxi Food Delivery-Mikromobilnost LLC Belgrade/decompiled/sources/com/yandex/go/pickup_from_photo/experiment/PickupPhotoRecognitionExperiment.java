package com.yandex.go.pickup_from_photo.experiment;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.qje;
import defpackage.z4b0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment;", "Ln96;", "Lc6z;", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "CameraButton", "CameraScreen", "Step", "FlashButton", "CameraPermissionScreen", "RecognitionErrorScreen", "PhotoRecognitionSettings", "RecognitionSuccessScreen", "Feedback", "Onboarding", "DeviceTiltHint", "DeviceRotationHint", "NightModeSettings", "com/yandex/go/pickup_from_photo/experiment/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PickupPhotoRecognitionExperiment extends n96 implements c6z {
    public static final e Companion = new e();
    public static final i3y[] o;
    public static final PickupPhotoRecognitionExperiment p;
    public final boolean b;
    public final Button c;
    public final List d;
    public final Map e;
    public final CameraScreen f;
    public final CameraPermissionScreen g;
    public final RecognitionErrorScreen h;
    public final RecognitionSuccessScreen i;
    public final PhotoRecognitionSettings j;
    public final Onboarding k;
    public final DeviceTiltHint l;
    public final DeviceRotationHint m;
    public final NightModeSettings n;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new z4b0(20)), kotlin.a.b(lazyThreadSafetyMode, new z4b0(21)), null, null, null, null, null, null, null, null, null};
        p = new PickupPhotoRecognitionExperiment(0);
    }

    public /* synthetic */ PickupPhotoRecognitionExperiment(int i, boolean z, Button button, List list, Map map, CameraScreen cameraScreen, CameraPermissionScreen cameraPermissionScreen, RecognitionErrorScreen recognitionErrorScreen, RecognitionSuccessScreen recognitionSuccessScreen, PhotoRecognitionSettings photoRecognitionSettings, Onboarding onboarding, DeviceTiltHint deviceTiltHint, DeviceRotationHint deviceRotationHint, NightModeSettings nightModeSettings) {
        if (511 != (i & 511)) {
            qje.Z(i, 511, PickupPhotoRecognitionExperiment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.b = z;
        this.c = button;
        this.d = list;
        this.e = map;
        this.f = cameraScreen;
        this.g = cameraPermissionScreen;
        this.h = recognitionErrorScreen;
        this.i = recognitionSuccessScreen;
        this.j = photoRecognitionSettings;
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = onboarding;
        }
        if ((i & 1024) == 0) {
            this.l = new DeviceTiltHint(0);
        } else {
            this.l = deviceTiltHint;
        }
        this.m = (i & 2048) == 0 ? new DeviceRotationHint(0) : deviceRotationHint;
        if ((i & 4096) == 0) {
            this.n = null;
        } else {
            this.n = nightModeSettings;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.e;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$Onboarding;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Onboarding {
        public static final k Companion = new k();
        public final String a;
        public final String b;

        public /* synthetic */ Onboarding(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public Onboarding() {
            this.a = null;
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Button {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public /* synthetic */ Button(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, PickupPhotoRecognitionExperiment$Button$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public Button(int i) {
            this.a = "";
            this.b = "";
        }

        public Button() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraPermissionScreen;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class CameraPermissionScreen {
        public static final c Companion = new c();
        public final String a;
        public final String b;

        public /* synthetic */ CameraPermissionScreen(int i, String str, String str2) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, PickupPhotoRecognitionExperiment$CameraPermissionScreen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public CameraPermissionScreen(int i) {
            this.a = "";
            this.b = "";
        }

        public CameraPermissionScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$NightModeSettings;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class NightModeSettings {
        public static final j Companion = new j();
        public final double a;
        public final double b;

        public /* synthetic */ NightModeSettings(double d, double d2, int i) {
            if ((i & 1) == 0) {
                this.a = 0.0d;
            } else {
                this.a = d;
            }
            if ((i & 2) == 0) {
                this.b = 0.0d;
            } else {
                this.b = d2;
            }
        }

        public NightModeSettings() {
            this.a = 0.0d;
            this.b = 0.0d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraButton;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class CameraButton {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ CameraButton(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, PickupPhotoRecognitionExperiment$CameraButton$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public CameraButton(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
        }

        public CameraButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$PhotoRecognitionSettings;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class PhotoRecognitionSettings {
        public static final l Companion = new l();
        public final int a;
        public final int b;
        public final int c;

        public /* synthetic */ PhotoRecognitionSettings(int i, int i2, int i3, int i4) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, PickupPhotoRecognitionExperiment$PhotoRecognitionSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = i3;
            this.c = i4;
        }

        public PhotoRecognitionSettings(int i) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public PhotoRecognitionSettings() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$FlashButton;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class FlashButton {
        public static final i Companion = new i();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ FlashButton(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, PickupPhotoRecognitionExperiment$FlashButton$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public FlashButton(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = "";
        }

        public FlashButton() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$Step;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Step {
        public static final o Companion = new o();
        public final String a;
        public final String b;

        public /* synthetic */ Step(int i, String str, String str2) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, PickupPhotoRecognitionExperiment$Step$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public Step() {
            this.a = "";
            this.b = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$DeviceRotationHint;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class DeviceRotationHint {
        public static final f Companion = new f();
        public final String a;
        public final String b;
        public final int c;

        public /* synthetic */ DeviceRotationHint(int i, int i2, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
        }

        public DeviceRotationHint(int i) {
            this.a = "";
            this.b = "";
            this.c = 0;
        }

        public DeviceRotationHint() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$DeviceTiltHint;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class DeviceTiltHint {
        public static final g Companion = new g();
        public final String a;
        public final String b;
        public final int c;

        public /* synthetic */ DeviceTiltHint(int i, int i2, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
        }

        public DeviceTiltHint(int i) {
            this.a = "";
            this.b = "";
            this.c = 0;
        }

        public DeviceTiltHint() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$RecognitionErrorScreen;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class RecognitionErrorScreen {
        public static final m Companion = new m();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ RecognitionErrorScreen(int i, String str, String str2, String str3, String str4) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, PickupPhotoRecognitionExperiment$RecognitionErrorScreen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public RecognitionErrorScreen(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
        }

        public RecognitionErrorScreen() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraScreen;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class CameraScreen {
        public static final d Companion = new d();
        public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z4b0(22)), null, null};
        public final String a;
        public final List b;
        public final CameraButton c;
        public final FlashButton d;

        public /* synthetic */ CameraScreen(int i, String str, List list, CameraButton cameraButton, FlashButton flashButton) {
            if (14 != (i & 14)) {
                qje.Z(i, 14, PickupPhotoRecognitionExperiment$CameraScreen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            this.b = list;
            this.c = cameraButton;
            this.d = flashButton;
        }

        public CameraScreen() {
            this(0);
        }

        public CameraScreen(int i) {
            CameraButton cameraButton = new CameraButton(0);
            FlashButton flashButton = new FlashButton(0);
            this.a = "";
            this.b = EmptyList.a;
            this.c = cameraButton;
            this.d = flashButton;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$Feedback;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Feedback {
        public static final h Companion = new h();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ Feedback(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: d, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public Feedback(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public Feedback() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$RecognitionSuccessScreen;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/experiment/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class RecognitionSuccessScreen {
        public static final n Companion = new n();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Feedback e;

        public /* synthetic */ RecognitionSuccessScreen(int i, String str, String str2, String str3, String str4, Feedback feedback) {
            if (13 != (i & 13)) {
                qje.Z(i, 13, PickupPhotoRecognitionExperiment$RecognitionSuccessScreen$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            this.c = str3;
            this.d = str4;
            if ((i & 16) == 0) {
                this.e = new Feedback(0);
            } else {
                this.e = feedback;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final Feedback getE() {
            return this.e;
        }

        /* renamed from: c, reason: from getter */
        public final String getD() {
            return this.d;
        }

        /* renamed from: d, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public RecognitionSuccessScreen() {
            this(0);
        }

        public RecognitionSuccessScreen(int i) {
            Feedback feedback = new Feedback(0);
            this.a = "";
            this.b = null;
            this.c = "";
            this.d = "";
            this.e = feedback;
        }
    }

    public PickupPhotoRecognitionExperiment() {
        this(0);
    }

    public PickupPhotoRecognitionExperiment(int i) {
        Button button = new Button(0);
        Map f = kotlin.collections.b.f();
        CameraScreen cameraScreen = new CameraScreen(0);
        CameraPermissionScreen cameraPermissionScreen = new CameraPermissionScreen(0);
        RecognitionErrorScreen recognitionErrorScreen = new RecognitionErrorScreen(0);
        RecognitionSuccessScreen recognitionSuccessScreen = new RecognitionSuccessScreen(0);
        PhotoRecognitionSettings photoRecognitionSettings = new PhotoRecognitionSettings(0);
        DeviceTiltHint deviceTiltHint = new DeviceTiltHint(0);
        DeviceRotationHint deviceRotationHint = new DeviceRotationHint(0);
        this.b = false;
        this.c = button;
        this.d = EmptyList.a;
        this.e = f;
        this.f = cameraScreen;
        this.g = cameraPermissionScreen;
        this.h = recognitionErrorScreen;
        this.i = recognitionSuccessScreen;
        this.j = photoRecognitionSettings;
        this.k = null;
        this.l = deviceTiltHint;
        this.m = deviceRotationHint;
        this.n = null;
    }
}
