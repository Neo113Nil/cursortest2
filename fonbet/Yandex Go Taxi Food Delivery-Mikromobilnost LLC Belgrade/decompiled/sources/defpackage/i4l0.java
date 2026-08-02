package defpackage;

import com.yandex.go.intentprocessor.i;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class i4l0 extends d2l0 {
    public final i b;

    public i4l0(i iVar) {
        this.b = iVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        r7z r7zVar = new r7z((c2l0) obj);
        i iVar = this.b;
        iVar.d(r7zVar, iVar.m);
        return zy11.a;
    }
}
