package defpackage;

import com.yandex.go.intentprocessor.i;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class mv20 extends kv20 {
    public final i b;

    public mv20(i iVar) {
        this.b = iVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        p7z p7zVar = new p7z((jv20) obj);
        i iVar = this.b;
        iVar.d(p7zVar, iVar.m);
        return zy11.a;
    }
}
