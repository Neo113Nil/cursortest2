package com.yandex.go.payments.shared.antifraud.experiments;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.m3e;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/payments/shared/antifraud/experiments/CorpAntiFraudExperiment;", "Lxn11;", "Lc6z;", "Companion", "CorpScreen", PlusPayUiKitInflaterFactory.NAME_BUTTON, "ClientInfoParams", "com/yandex/go/payments/shared/antifraud/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpAntiFraudExperiment implements xn11, c6z {
    public static final c Companion = new c();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(24)), null};
    public static final CorpAntiFraudExperiment f = new CorpAntiFraudExperiment(0);
    public final boolean b;
    public final Map c;
    public final CorpScreen d;

    public /* synthetic */ CorpAntiFraudExperiment(int i, boolean z, Map map, CorpScreen corpScreen) {
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
            this.d = new CorpScreen(0);
        } else {
            this.d = corpScreen;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/antifraud/experiments/CorpAntiFraudExperiment$Button;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/antifraud/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Button {
        public static final a Companion = new a();
        public final String a;

        public /* synthetic */ Button(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public Button(int i) {
            this.a = "";
        }

        public Button() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/antifraud/experiments/CorpAntiFraudExperiment$ClientInfoParams;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/antifraud/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ClientInfoParams {
        public static final b Companion = new b();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(25))};
        public final long a;
        public final boolean b;
        public final List c;

        public /* synthetic */ ClientInfoParams(int i, long j, List list, boolean z) {
            this.a = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public ClientInfoParams(int i) {
            this.a = 0L;
            this.b = false;
            this.c = EmptyList.a;
        }

        public ClientInfoParams() {
            this(0);
        }
    }

    public CorpAntiFraudExperiment() {
        this(0);
    }

    public CorpAntiFraudExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        CorpScreen corpScreen = new CorpScreen(0);
        this.b = false;
        this.c = f2;
        this.d = corpScreen;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/antifraud/experiments/CorpAntiFraudExperiment$CorpScreen;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/antifraud/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class CorpScreen {
        public static final d Companion = new d();
        public final String a;
        public final String b;
        public final Button c;
        public final Button d;
        public final ClientInfoParams e;

        public /* synthetic */ CorpScreen(int i, String str, String str2, Button button, Button button2, ClientInfoParams clientInfoParams) {
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
                this.c = new Button(0);
            } else {
                this.c = button;
            }
            if ((i & 8) == 0) {
                this.d = new Button(0);
            } else {
                this.d = button2;
            }
            if ((i & 16) == 0) {
                this.e = new ClientInfoParams(0);
            } else {
                this.e = clientInfoParams;
            }
        }

        public CorpScreen() {
            this(0);
        }

        public CorpScreen(int i) {
            Button button = new Button(0);
            Button button2 = new Button(0);
            ClientInfoParams clientInfoParams = new ClientInfoParams(0);
            this.a = "";
            this.b = "";
            this.c = button;
            this.d = button2;
            this.e = clientInfoParams;
        }
    }
}
