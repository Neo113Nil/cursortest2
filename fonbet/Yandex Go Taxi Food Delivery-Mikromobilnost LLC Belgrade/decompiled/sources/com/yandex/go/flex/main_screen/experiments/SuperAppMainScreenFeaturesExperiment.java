package com.yandex.go.flex.main_screen.experiments;

import defpackage.gsq0;
import defpackage.wn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment;", "Lwn11;", "Companion", "Features", "Feature", "com/yandex/go/flex/main_screen/experiments/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenFeaturesExperiment extends wn11 {
    public static final g Companion = new g();
    public final boolean c;
    public final Features d;

    public /* synthetic */ SuperAppMainScreenFeaturesExperiment(int i, boolean z, Features features) {
        if ((i & 1) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 2) == 0) {
            this.d = new Features(0);
        } else {
            this.d = features;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment$Feature;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/experiments/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Feature {
        public static final h Companion = new h();
        public final boolean a;

        public /* synthetic */ Feature(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public Feature(int i) {
            this.a = false;
        }

        public Feature() {
            this(0);
        }
    }

    public SuperAppMainScreenFeaturesExperiment() {
        this(0);
    }

    public SuperAppMainScreenFeaturesExperiment(int i) {
        Features features = new Features(0);
        this.c = false;
        this.d = features;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment$Features;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/experiments/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Features {
        public static final i Companion = new i();
        public final Feature a;
        public final Feature b;
        public final Feature c;
        public final Feature d;
        public final Feature e;

        public /* synthetic */ Features(int i, Feature feature, Feature feature2, Feature feature3, Feature feature4, Feature feature5) {
            this.a = (i & 1) == 0 ? new Feature(0) : feature;
            if ((i & 2) == 0) {
                this.b = new Feature(0);
            } else {
                this.b = feature2;
            }
            if ((i & 4) == 0) {
                this.c = new Feature(0);
            } else {
                this.c = feature3;
            }
            if ((i & 8) == 0) {
                this.d = new Feature(0);
            } else {
                this.d = feature4;
            }
            if ((i & 16) == 0) {
                this.e = new Feature(0);
            } else {
                this.e = feature5;
            }
        }

        public Features() {
            this(0);
        }

        public Features(int i) {
            Feature feature = new Feature(0);
            Feature feature2 = new Feature(0);
            Feature feature3 = new Feature(0);
            Feature feature4 = new Feature(0);
            Feature feature5 = new Feature(0);
            this.a = feature;
            this.b = feature2;
            this.c = feature3;
            this.d = feature4;
            this.e = feature5;
        }
    }
}
