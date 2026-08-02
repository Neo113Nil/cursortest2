package yads;

import kotlinx.serialization.KSerializer;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class bj2 {
    public static final aj2 Companion = new aj2();
    public static final KSerializer[] d = {ej2.Companion.serializer(), null, null};
    public final ej2 a;
    public final String b;
    public final Integer c;

    public /* synthetic */ bj2(int i, ej2 ej2Var, String str, Integer num) {
        if (7 != (i & 7)) {
            xsna.sp.x(i, 7, zi2.a.getDescriptor());
            throw null;
        }
        this.a = ej2Var;
        this.b = str;
        this.c = num;
    }

    public bj2(ej2 ej2Var, String str, Integer num) {
        this.a = ej2Var;
        this.b = str;
        this.c = num;
    }
}
