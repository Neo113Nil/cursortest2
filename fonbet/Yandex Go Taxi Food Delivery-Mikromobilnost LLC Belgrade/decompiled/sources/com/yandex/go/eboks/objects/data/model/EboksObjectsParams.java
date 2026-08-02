package com.yandex.go.eboks.objects.data.model;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.uc4;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksObjectsParams;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksObjectsParams {
    public static final c Companion = new c();
    public static final i3y[] f;
    public final zzs a;
    public final uc4 b;
    public final float c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new fgn(3)), kotlin.a.b(lazyThreadSafetyMode, new fgn(4))};
    }

    public /* synthetic */ EboksObjectsParams(int i, zzs zzsVar, uc4 uc4Var, float f2, List list, List list2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, EboksObjectsParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = uc4Var;
        this.c = f2;
        this.d = list;
        this.e = list2;
    }

    public EboksObjectsParams(zzs zzsVar, uc4 uc4Var, float f2, List list) {
        this.a = zzsVar;
        this.b = uc4Var;
        this.c = f2;
        this.d = EmptyList.a;
        this.e = list;
    }
}
