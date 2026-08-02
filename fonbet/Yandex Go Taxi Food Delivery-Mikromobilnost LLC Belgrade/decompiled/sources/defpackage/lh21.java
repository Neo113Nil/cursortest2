package defpackage;

/* loaded from: classes15.dex */
public final class lh21 extends ye0 {
    public final String b;
    public final String c;
    public final String w;
    public final Integer x;
    public final Integer y;
    public final String z;

    public lh21(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        super(str);
        this.b = str2;
        this.c = str3;
        this.w = str4;
        this.x = num;
        this.y = num2;
        this.z = str5;
    }

    public final boolean p() {
        Integer num;
        Integer num2;
        return (this.z == null || (num = this.x) == null || (num2 = this.y) == null || num.intValue() <= 300 || num2.intValue() <= 300) ? false : true;
    }
}
