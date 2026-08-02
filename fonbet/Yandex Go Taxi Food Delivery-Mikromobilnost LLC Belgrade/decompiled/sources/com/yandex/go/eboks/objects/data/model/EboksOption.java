package com.yandex.go.eboks.objects.data.model;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksOption;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksOption {
    public static final f Companion = new f();
    public static final i3y[] c;
    public final Trigger a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new fgn(7)), kotlin.a.b(lazyThreadSafetyMode, new fgn(8))};
    }

    public /* synthetic */ EboksOption(int i, Trigger trigger, List list) {
        this.a = (i & 1) == 0 ? Trigger.TAP : trigger;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public EboksOption() {
        this.a = Trigger.TAP;
        this.b = EmptyList.a;
    }
}
