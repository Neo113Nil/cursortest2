package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nu00 implements ru00 {
    public final /* synthetic */ Map a;

    public nu00(Map map) {
        this.a = map;
    }

    @Override // defpackage.ru00
    public final Object getHeaders(Continuation continuation) {
        return this.a;
    }
}
