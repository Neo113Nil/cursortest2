package com.yandex.go.payments.cards.nfc.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/experiments/NfcScanCardExperiment;", "Lw96;", "Lc6z;", "Companion", "NfcCardScanIcon", "com/yandex/go/payments/cards/nfc/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NfcScanCardExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j660(14)), null};
    public static final NfcScanCardExperiment f = new NfcScanCardExperiment(0);
    public final boolean b;
    public final Map c;
    public final NfcCardScanIcon d;

    public NfcScanCardExperiment(int i, boolean z, Map map, NfcCardScanIcon nfcCardScanIcon) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) != 0) {
            this.d = nfcCardScanIcon;
        } else {
            NfcCardScanIcon.Companion.getClass();
            this.d = NfcCardScanIcon.d;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/nfc/experiments/NfcScanCardExperiment$NfcCardScanIcon;", "", "Companion", "com/yandex/go/payments/cards/nfc/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NfcCardScanIcon {
        public static final b Companion = new b();
        public static final NfcCardScanIcon d = new NfcCardScanIcon(0);
        public final boolean a;
        public final String b;
        public final String c;

        public /* synthetic */ NfcCardScanIcon(String str, int i, String str2, boolean z) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        public NfcCardScanIcon(int i) {
            this.a = false;
            this.b = "";
            this.c = "";
        }

        public NfcCardScanIcon() {
            this(0);
        }
    }

    public NfcScanCardExperiment() {
        this(0);
    }

    public NfcScanCardExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        NfcCardScanIcon.Companion.getClass();
        this.b = false;
        this.c = f2;
        this.d = NfcCardScanIcon.d;
    }
}
