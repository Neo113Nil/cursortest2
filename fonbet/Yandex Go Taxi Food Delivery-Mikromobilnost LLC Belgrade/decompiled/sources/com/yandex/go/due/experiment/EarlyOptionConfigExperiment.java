package com.yandex.go.due.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import defpackage.n96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/due/experiment/EarlyOptionConfigExperiment;", "Ln96;", "Companion", "TariffRule", "com/yandex/go/due/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EarlyOptionConfigExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(16))};
    public static final EarlyOptionConfigExperiment e = new EarlyOptionConfigExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ EarlyOptionConfigExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public EarlyOptionConfigExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/experiment/EarlyOptionConfigExperiment$TariffRule;", "", "Companion", "$serializer", "com/yandex/go/due/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class TariffRule {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ TariffRule(int i, String str, String str2) {
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
        }

        public TariffRule() {
            this.a = "";
            this.b = "";
        }
    }

    public EarlyOptionConfigExperiment() {
        this(0);
    }
}
