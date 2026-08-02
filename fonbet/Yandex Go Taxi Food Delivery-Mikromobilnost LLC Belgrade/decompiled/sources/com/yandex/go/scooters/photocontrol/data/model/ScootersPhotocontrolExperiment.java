package com.yandex.go.scooters.photocontrol.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.zqn0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolExperiment;", "Lw96;", "Lc6z;", "Companion", "PersonalDataScreen", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersPhotocontrolExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(20)), null};
    public final boolean b;
    public final Map c;
    public final PersonalDataScreen d;

    public /* synthetic */ ScootersPhotocontrolExperiment(int i, boolean z, Map map, PersonalDataScreen personalDataScreen) {
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
            this.d = new PersonalDataScreen(0);
        } else {
            this.d = personalDataScreen;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolExperiment$PersonalDataScreen;", "", "Companion", "Legal", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PersonalDataScreen {
        public static final b Companion = new b();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final Legal e;

        public /* synthetic */ PersonalDataScreen(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, Legal legal) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = legal;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/data/model/ScootersPhotocontrolExperiment$PersonalDataScreen$Legal;", "", "Companion", "$serializer", "com/yandex/go/scooters/photocontrol/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Legal {
            public static final c Companion = new c();
            public final FormattedText a;
            public final String b;

            public /* synthetic */ Legal(int i, String str, FormattedText formattedText) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = formattedText;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str;
                }
            }

            public Legal() {
                this.a = null;
                this.b = null;
            }
        }

        public PersonalDataScreen() {
            this(0);
        }

        public PersonalDataScreen(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
            this.e = null;
        }
    }

    public ScootersPhotocontrolExperiment() {
        this(0);
    }

    public ScootersPhotocontrolExperiment(int i) {
        Map f = kotlin.collections.b.f();
        PersonalDataScreen personalDataScreen = new PersonalDataScreen(0);
        this.b = false;
        this.c = f;
        this.d = personalDataScreen;
    }
}
