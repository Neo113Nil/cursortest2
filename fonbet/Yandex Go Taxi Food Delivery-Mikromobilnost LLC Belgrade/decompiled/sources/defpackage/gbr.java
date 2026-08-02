package defpackage;

/* loaded from: classes12.dex */
public final class gbr {
    public final String a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public gbr(int i, Integer num, Integer num2, String str) {
        str = (i & 4) != 0 ? null : str;
        boolean z = (i & 8) == 0;
        num = (i & 32) != 0 ? Integer.valueOf(omg0.finsdk_slide_in_to_left) : num;
        num2 = (i & 64) != 0 ? Integer.valueOf(omg0.finsdk_slide_out_to_left) : num2;
        Integer valueOf = Integer.valueOf(omg0.finsdk_slide_in_to_right);
        Integer valueOf2 = Integer.valueOf(omg0.finsdk_slide_out_to_right);
        this.a = str;
        this.b = z;
        this.c = num;
        this.d = num2;
        this.e = valueOf;
        this.f = valueOf2;
    }

    public gbr() {
        this(511, null, null, null);
    }
}
