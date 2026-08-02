package xsna;

/* compiled from: CommunityRepliesViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class xwh {
    public final sdz a;

    public xwh(sdz sdzVar) {
        this.a = sdzVar;
    }

    public static boolean a(xwh xwhVar, yig0 yig0Var, Integer num, Integer num2, Integer num3, int i) {
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            num3 = null;
        }
        xwhVar.getClass();
        Integer num4 = yig0Var.b;
        Integer num5 = yig0Var.a;
        if (num4 == null && num5 == null && num == null) {
            return true;
        }
        if (num2 == null && num3 == null) {
            return false;
        }
        return num3 == null ? epx.f(num2, num5) : num3.equals(num4) || num3.equals(num);
    }
}
