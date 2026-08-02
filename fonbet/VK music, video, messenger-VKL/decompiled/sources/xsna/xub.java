package xsna;

/* compiled from: ChatProfileAction.kt */
/* loaded from: classes2.dex */
public class xub {
    public final int a;
    public final CharSequence b;
    public final boolean c;
    public final Integer d;

    public /* synthetic */ xub(int i, int i2, CharSequence charSequence, Integer num) {
        this(i, charSequence, (i2 & 4) == 0, (i2 & 8) != 0 ? null : num);
    }

    public xub(int i, CharSequence charSequence, boolean z, Integer num) {
        this.a = i;
        this.b = charSequence;
        this.c = z;
        this.d = num;
    }
}
