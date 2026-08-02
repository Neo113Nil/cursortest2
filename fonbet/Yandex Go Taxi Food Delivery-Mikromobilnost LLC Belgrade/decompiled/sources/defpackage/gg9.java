package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes14.dex */
public final class gg9 {
    public static final /* synthetic */ kgx[] e = {new MutablePropertyReference1Impl("tapsCount", 0, "getTapsCount()I", gg9.class), new MutablePropertyReference1Impl("tappedOrderIds", 0, "getTappedOrderIds()Ljava/util/List;", gg9.class), new MutablePropertyReference1Impl("showedTextOrderIdsOnSearching", 0, "getShowedTextOrderIdsOnSearching()Ljava/util/List;", gg9.class), new MutablePropertyReference1Impl("showedTextOrderIdsOnDriving", 0, "getShowedTextOrderIdsOnDriving()Ljava/util/List;", gg9.class)};
    public final qdx a;
    public final rme0 b;
    public final rme0 c;
    public final rme0 d;

    public gg9(dne0 dne0Var) {
        cne0 a = dne0Var.a("prefs_change_source_point_pin_entry");
        this.a = bvf0.C(a, "success_taps_count");
        this.b = new rme0(1, a, a, "tapped_order_ids");
        this.c = new rme0(1, a, a, "showed_text_order_ids");
        this.d = new rme0(1, a, a, "showed_text_order_ids_on_driving");
    }
}
