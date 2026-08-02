package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes9.dex */
public final class lw2 {
    public static final /* synthetic */ kgx[] f = {new MutablePropertyReference1Impl("lastPromptedOrderId", 0, "getLastPromptedOrderId()Ljava/lang/String;", lw2.class), new MutablePropertyReference1Impl("completedOrderIds", 0, "getCompletedOrderIds()Ljava/util/Set;", lw2.class), new MutablePropertyReference1Impl("isCustomDialogAccepted", 0, "isCustomDialogAccepted()Z", lw2.class), new MutablePropertyReference1Impl("customDialogDeniedCount", 0, "getCustomDialogDeniedCount()I", lw2.class)};
    public final cne0 a;
    public final iid0 b;
    public final sme0 c;
    public final qme0 d;
    public final qdx e;

    public lw2(dne0 dne0Var) {
        cne0 a = dne0Var.a("prefs_rate_app");
        this.a = a;
        this.b = new iid0(a, "LAST_PROMPTED_ORDER_ID");
        this.c = new sme0(1, a, a, "COMPLETED_ORDER_IDS_SINCE_LAST_RATE_REQUEST");
        this.d = new qme0(0, a, a, "APP_REVIEW_ACCEPTED");
        this.e = bvf0.C(a, "APP_REVIEW_DENIED_COUNT");
    }
}
