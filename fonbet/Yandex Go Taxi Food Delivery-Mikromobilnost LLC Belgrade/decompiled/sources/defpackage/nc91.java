package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* loaded from: classes.dex */
public abstract class nc91 {
    public static final ImmutableSet a = ImmutableSet.r("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final ImmutableList b;
    public static final ImmutableList c;
    public static final ImmutableList d;

    static {
        piv pivVar = ImmutableList.b;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        uh6.i(7, objArr);
        b = ImmutableList.k(7, objArr);
        c = ImmutableList.t("auto", "app", "am");
        d = ImmutableList.s("_r", "_dbg");
        ImmutableList.a aVar = new ImmutableList.a();
        aVar.b(bb1.d);
        aVar.b(bb1.e);
        aVar.g();
        ImmutableList.s("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
