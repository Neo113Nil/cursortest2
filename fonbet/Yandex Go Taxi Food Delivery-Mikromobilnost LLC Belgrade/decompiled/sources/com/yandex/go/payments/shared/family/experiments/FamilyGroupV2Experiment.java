package com.yandex.go.payments.shared.family.experiments;

import defpackage.c6z;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.yandex.taxi.communications.model.CommunicationItem;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/shared/family/experiments/FamilyGroupV2Experiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/payments/shared/family/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FamilyGroupV2Experiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(19)), null, null};
    public static final FamilyGroupV2Experiment g = new FamilyGroupV2Experiment(0);
    public final boolean b;
    public final Map c;
    public final CommunicationItem d;
    public final String e;

    public /* synthetic */ FamilyGroupV2Experiment(int i, boolean z, Map map, CommunicationItem communicationItem, String str) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = new CommunicationItem(null, null, null, null, null, 2047);
        } else {
            this.d = communicationItem;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public FamilyGroupV2Experiment() {
        this(0);
    }

    public FamilyGroupV2Experiment(int i) {
        Map f2 = b.f();
        CommunicationItem communicationItem = new CommunicationItem(null, null, null, null, null, 2047);
        this.b = false;
        this.c = f2;
        this.d = communicationItem;
        this.e = "";
    }
}
