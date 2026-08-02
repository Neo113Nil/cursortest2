package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class f9t0 extends ml1 {
    public final yvf0 b;

    public f9t0(l9t0 l9t0Var) {
        this.b = l9t0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // com.yandex.go.deeplinks.typed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        ChatViewController$Mode chatViewController$Mode;
        Object obj2;
        ll1 ll1Var = (ll1) obj;
        String str = ll1Var.b;
        if (str != null) {
            Iterator<E> it = ChatViewController$Mode.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (cvu0.t(((ChatViewController$Mode) obj2).name(), str, true)) {
                    break;
                }
            }
            chatViewController$Mode = (ChatViewController$Mode) obj2;
        }
        chatViewController$Mode = ChatViewController$Mode.Go;
        ((pep0) oep0Var).f((m950) this.b.get(), new i9t0(null, chatViewController$Mode, ll1Var.a, 3), hxx.a);
        return zy11.a;
    }
}
