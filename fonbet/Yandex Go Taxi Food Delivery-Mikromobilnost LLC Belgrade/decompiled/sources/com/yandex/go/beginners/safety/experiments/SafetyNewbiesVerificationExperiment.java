package com.yandex.go.beginners.safety.experiments;

import defpackage.b64;
import defpackage.b7l0;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment;", "Ln96;", "Lc6z;", "Companion", "NameInputStep", "PhotoStep", "com/yandex/go/beginners/safety/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SafetyNewbiesVerificationExperiment extends n96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(23)), null, null};
    public static final SafetyNewbiesVerificationExperiment g = new SafetyNewbiesVerificationExperiment(0);
    public final boolean b;
    public final Map c;
    public final NameInputStep d;
    public final PhotoStep e;

    public /* synthetic */ SafetyNewbiesVerificationExperiment(int i, boolean z, Map map, NameInputStep nameInputStep, PhotoStep photoStep) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new NameInputStep(0);
        } else {
            this.d = nameInputStep;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = photoStep;
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
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep;", "", "Companion", "PhotoStepScreen", "LoadingScreen", "SuccessScreen", "NetworkErrorScreen", "ValidationFailIntermediateScreen", "ValidationFailScreen", "$serializer", "com/yandex/go/beginners/safety/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class PhotoStep {
        public static final d Companion = new d();
        public final PhotoStepScreen a;
        public final LoadingScreen b;
        public final SuccessScreen c;
        public final NetworkErrorScreen d;
        public final ValidationFailIntermediateScreen e;
        public final ValidationFailScreen f;

        public /* synthetic */ PhotoStep(int i, PhotoStepScreen photoStepScreen, LoadingScreen loadingScreen, SuccessScreen successScreen, NetworkErrorScreen networkErrorScreen, ValidationFailIntermediateScreen validationFailIntermediateScreen, ValidationFailScreen validationFailScreen) {
            this.a = (i & 1) == 0 ? new PhotoStepScreen(0) : photoStepScreen;
            if ((i & 2) == 0) {
                this.b = new LoadingScreen(0);
            } else {
                this.b = loadingScreen;
            }
            if ((i & 4) == 0) {
                this.c = new SuccessScreen(0);
            } else {
                this.c = successScreen;
            }
            if ((i & 8) == 0) {
                this.d = new NetworkErrorScreen(0);
            } else {
                this.d = networkErrorScreen;
            }
            if ((i & 16) == 0) {
                this.e = new ValidationFailIntermediateScreen(0);
            } else {
                this.e = validationFailIntermediateScreen;
            }
            if ((i & 32) == 0) {
                this.f = new ValidationFailScreen(0);
            } else {
                this.f = validationFailScreen;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$LoadingScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class LoadingScreen {
            public static final e Companion = new e();
            public final String a;

            public /* synthetic */ LoadingScreen(int i, String str) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
            }

            public LoadingScreen(int i) {
                this.a = null;
            }

            public LoadingScreen() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$NetworkErrorScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class NetworkErrorScreen {
            public static final f Companion = new f();
            public final String a;
            public final String b;

            public /* synthetic */ NetworkErrorScreen(int i, String str, String str2) {
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
            }

            public NetworkErrorScreen(int i) {
                this.a = null;
                this.b = null;
            }

            public NetworkErrorScreen() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$SuccessScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class SuccessScreen {
            public static final h Companion = new h();
            public final String a;
            public final Long b;

            public /* synthetic */ SuccessScreen(int i, String str, Long l) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = l;
                }
            }

            public SuccessScreen(int i) {
                this.a = null;
                this.b = null;
            }

            public SuccessScreen() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ValidationFailScreen {
            public static final j Companion = new j();
            public final String a;
            public final String b;

            public /* synthetic */ ValidationFailScreen(int i, String str, String str2) {
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
            }

            public ValidationFailScreen(int i) {
                this.a = null;
                this.b = null;
            }

            public ValidationFailScreen() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailIntermediateScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ValidationFailIntermediateScreen {
            public static final i Companion = new i();
            public final String a;
            public final String b;
            public final Long c;

            public /* synthetic */ ValidationFailIntermediateScreen(int i, String str, String str2, Long l) {
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
                    this.c = l;
                }
            }

            public ValidationFailIntermediateScreen(int i) {
                this.a = null;
                this.b = null;
                this.c = null;
            }

            public ValidationFailIntermediateScreen() {
                this(0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep$PhotoStepScreen;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class PhotoStepScreen {
            public static final g Companion = new g();
            public final String a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public /* synthetic */ PhotoStepScreen(String str, String str2, String str3, String str4, int i, String str5) {
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
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = str5;
                }
            }

            public PhotoStepScreen(int i) {
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
            }

            public PhotoStepScreen() {
                this(0);
            }
        }

        public PhotoStep() {
            this(0);
        }

        public PhotoStep(int i) {
            PhotoStepScreen photoStepScreen = new PhotoStepScreen(0);
            LoadingScreen loadingScreen = new LoadingScreen(0);
            SuccessScreen successScreen = new SuccessScreen(0);
            NetworkErrorScreen networkErrorScreen = new NetworkErrorScreen(0);
            ValidationFailIntermediateScreen validationFailIntermediateScreen = new ValidationFailIntermediateScreen(0);
            ValidationFailScreen validationFailScreen = new ValidationFailScreen(0);
            this.a = photoStepScreen;
            this.b = loadingScreen;
            this.c = successScreen;
            this.d = networkErrorScreen;
            this.e = validationFailIntermediateScreen;
            this.f = validationFailScreen;
        }
    }

    public SafetyNewbiesVerificationExperiment() {
        this(0);
    }

    public SafetyNewbiesVerificationExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        NameInputStep nameInputStep = new NameInputStep(0);
        this.b = false;
        this.c = f2;
        this.d = nameInputStep;
        this.e = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$NameInputStep;", "", "Companion", "$serializer", "com/yandex/go/beginners/safety/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class NameInputStep {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;

        public /* synthetic */ NameInputStep(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
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
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str6;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str7;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str8;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameInputStep)) {
                return false;
            }
            NameInputStep nameInputStep = (NameInputStep) obj;
            return jl40.l(this.a, nameInputStep.a) && jl40.l(this.b, nameInputStep.b) && jl40.l(this.c, nameInputStep.c) && jl40.l(this.d, nameInputStep.d) && jl40.l(this.e, nameInputStep.e) && jl40.l(this.f, nameInputStep.f) && jl40.l(this.g, nameInputStep.g) && jl40.l(this.h, nameInputStep.h);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("NameInputStep(title=", this.a, ", text=", this.b, ", nameInputHint=");
            g8e.D(v, this.c, ", nameValidationErrorMessage=", this.d, ", networkErrorMessage=");
            g8e.D(v, this.e, ", continueButtonText=", this.f, ", doneButtonText=");
            return g8e.r(v, this.g, ", retryButtonText=", this.h, Extension.C_BRAKE);
        }

        public NameInputStep(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }

        public NameInputStep() {
            this(0);
        }
    }
}
