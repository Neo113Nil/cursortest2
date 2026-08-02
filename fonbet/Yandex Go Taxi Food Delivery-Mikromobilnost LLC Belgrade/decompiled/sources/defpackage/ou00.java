package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ou00 implements ru00 {
    public static final ou00 a = new ou00();

    @Override // defpackage.ru00
    public final Object getHeaders(Continuation continuation) {
        Pair pair = new Pair("X-Flex-Version", "18.1.0");
        x4c x4cVar = hxk.b;
        return b.i(pair, new Pair("X-Divkit-Version", "32.50.3"));
    }
}
