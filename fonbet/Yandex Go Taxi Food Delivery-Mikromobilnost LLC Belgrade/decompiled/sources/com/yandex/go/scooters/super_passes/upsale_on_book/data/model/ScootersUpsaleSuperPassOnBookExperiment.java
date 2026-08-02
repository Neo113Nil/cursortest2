package com.yandex.go.scooters.super_passes.upsale_on_book.data.model;

import defpackage.c6z;
import defpackage.czo0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/super_passes/upsale_on_book/data/model/ScootersUpsaleSuperPassOnBookExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/scooters/super_passes/upsale_on_book/data/model/a", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersUpsaleSuperPassOnBookExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g;
    public static final ScootersUpsaleSuperPassOnBookExperiment h;
    public final boolean b;
    public final Map c;
    public final FormattedText d;
    public final String e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new czo0(8)), null, null, kotlin.a.b(lazyThreadSafetyMode, new czo0(9))};
        h = new ScootersUpsaleSuperPassOnBookExperiment(0);
    }

    public /* synthetic */ ScootersUpsaleSuperPassOnBookExperiment(int i, boolean z, Map map, FormattedText formattedText, String str, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
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

    public ScootersUpsaleSuperPassOnBookExperiment() {
        this(0);
    }

    public ScootersUpsaleSuperPassOnBookExperiment(int i) {
        Map f = b.f();
        FormattedText formattedText = FormattedText.c;
        this.b = false;
        this.c = f;
        this.d = formattedText;
        this.e = "";
        this.f = EmptyList.a;
    }
}
