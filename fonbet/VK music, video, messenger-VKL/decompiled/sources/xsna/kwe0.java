package xsna;

import com.vk.dto.messages.MessageSource;

/* compiled from: GetDiffContentLogic.kt */
/* loaded from: classes2.dex */
public final class kwe0 {
    public final int a;
    public final int b;
    public final int c;
    public final MessageSource d;
    public final int e;
    public final int f;

    public kwe0(int i, int i2, int i3, MessageSource messageSource) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = messageSource;
        int i4 = i - i2;
        this.e = i4;
        this.f = i4 - i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Range from=");
        sb.append(this.f);
        sb.append(" anchor=");
        sb.append(this.a);
        sb.append(" to=");
        return vu5.b(sb, this.e, '}');
    }
}
