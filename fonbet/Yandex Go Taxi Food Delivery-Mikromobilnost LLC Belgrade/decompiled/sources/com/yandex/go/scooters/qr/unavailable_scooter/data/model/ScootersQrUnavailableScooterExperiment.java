package com.yandex.go.scooters.qr.unavailable_scooter.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.zqn0;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment;", "Lw96;", "Lc6z;", "Companion", "Content", "com/yandex/go/scooters/qr/unavailable_scooter/data/model/b", "AvailabilityCheckCall", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersQrUnavailableScooterExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] g;
    public static final ScootersQrUnavailableScooterExperiment h;
    public final boolean b;
    public final Map c;
    public final List d;
    public final Content e;
    public final AvailabilityCheckCall f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new zqn0(23)), kotlin.a.b(lazyThreadSafetyMode, new zqn0(24)), null, null};
        h = new ScootersQrUnavailableScooterExperiment(0);
    }

    public /* synthetic */ ScootersQrUnavailableScooterExperiment(int i, boolean z, Map map, List list, Content content, AvailabilityCheckCall availabilityCheckCall) {
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
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = new Content(0);
        } else {
            this.e = content;
        }
        if ((i & 16) == 0) {
            this.f = new AvailabilityCheckCall(0);
        } else {
            this.f = availabilityCheckCall;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getK() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall;", "", "Companion", "$serializer", "com/yandex/go/scooters/qr/unavailable_scooter/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AvailabilityCheckCall {
        public static final a Companion = new a();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(25)), null};
        public final List a;
        public final boolean b;

        public /* synthetic */ AvailabilityCheckCall(int i, boolean z, List list) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public AvailabilityCheckCall(int i) {
            this.a = EmptyList.a;
            this.b = false;
        }

        public AvailabilityCheckCall() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment$Content;", "", "Companion", "$serializer", "com/yandex/go/scooters/qr/unavailable_scooter/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Content {
        public static final c Companion = new c();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ Content(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public Content() {
            this(0);
        }

        public Content(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    public ScootersQrUnavailableScooterExperiment() {
        this(0);
    }

    public ScootersQrUnavailableScooterExperiment(int i) {
        Map f = kotlin.collections.b.f();
        Content content = new Content(0);
        AvailabilityCheckCall availabilityCheckCall = new AvailabilityCheckCall(0);
        this.b = false;
        this.c = f;
        this.d = EmptyList.a;
        this.e = content;
        this.f = availabilityCheckCall;
    }
}
