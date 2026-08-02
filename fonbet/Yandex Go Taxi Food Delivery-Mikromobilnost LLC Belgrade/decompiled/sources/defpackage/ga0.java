package defpackage;

/* loaded from: classes6.dex */
public final class ga0 {
    public String a;
    public String b;

    public ga0(String str, String str2) {
        cvw.f(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public jjg0 a() {
        if ("first_party".equals(this.b)) {
            ny61.g("Serialized doc id must be provided for first party products.");
            return null;
        }
        if (this.a == null) {
            ny61.g("Product id must be provided.");
            return null;
        }
        if (this.b != null) {
            return new jjg0(this);
        }
        ny61.g("Product type must be provided.");
        return null;
    }

    public /* synthetic */ ga0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
    }

    public ga0(zuj0 zuj0Var) {
        avj0 avj0Var = (avj0) zuj0Var;
        this.a = avj0Var.h(kyh0.summary_comment_hint);
        this.b = avj0Var.h(kyh0.summary_cost_center_item_title);
    }
}
