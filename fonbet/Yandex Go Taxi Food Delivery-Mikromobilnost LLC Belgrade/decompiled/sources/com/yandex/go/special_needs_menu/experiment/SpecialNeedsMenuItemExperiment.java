package com.yandex.go.special_needs_menu.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.s7s0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.yandex.taxi.communications.model.CommunicationItem;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/special_needs_menu/experiment/SpecialNeedsMenuItemExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/special_needs_menu/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SpecialNeedsMenuItemExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(20)), null, null};
    public static final SpecialNeedsMenuItemExperiment g = new SpecialNeedsMenuItemExperiment(0);
    public final boolean b;
    public final Map c;
    public final CommunicationItem d;
    public final String e;

    public /* synthetic */ SpecialNeedsMenuItemExperiment(int i, boolean z, Map map, CommunicationItem communicationItem, String str) {
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
    public final Map getD() {
        return this.c;
    }

    public SpecialNeedsMenuItemExperiment() {
        this(0);
    }

    public SpecialNeedsMenuItemExperiment(int i) {
        Map f2 = b.f();
        CommunicationItem communicationItem = new CommunicationItem(null, null, null, null, null, 2047);
        this.b = false;
        this.c = f2;
        this.d = communicationItem;
        this.e = "";
    }
}
