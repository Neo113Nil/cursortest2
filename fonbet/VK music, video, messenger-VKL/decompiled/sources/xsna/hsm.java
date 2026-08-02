package xsna;

import com.vk.dialogslist.api.list.DialogsListConfigToken;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import xsna.gsm;

/* compiled from: DialogsListConfigFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class hsm implements gsm<esm> {
    public final ConcurrentHashMap<Class<? extends DialogsListConfigToken>, gsm.a<?, esm>> b = new ConcurrentHashMap<>();

    @Override // xsna.gsm
    public final esm e(DialogsListConfigToken dialogsListConfigToken) {
        gsm.a<?, esm> aVar = this.b.get(dialogsListConfigToken.getClass());
        if (aVar != null) {
            return aVar.e(dialogsListConfigToken);
        }
        throw new IllegalArgumentException("Provided token has not registered config factory");
    }

    @Override // xsna.g4z
    public final void onDestroy() {
        ConcurrentHashMap<Class<? extends DialogsListConfigToken>, gsm.a<?, esm>> concurrentHashMap = this.b;
        Iterator<T> it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            gsm.a aVar = (gsm.a) it.next();
            if (aVar instanceof g4z) {
                ((g4z) aVar).onDestroy();
            }
        }
        concurrentHashMap.clear();
    }

    @Override // xsna.gsm
    public final <Token extends DialogsListConfigToken> void t(Class<Token> cls, gsm.a<Token, esm> aVar) {
        ConcurrentHashMap<Class<? extends DialogsListConfigToken>, gsm.a<?, esm>> concurrentHashMap = this.b;
        gsm.a<?, esm> aVar2 = concurrentHashMap.get(cls);
        if (aVar2 != null) {
            aVar2.onDestroy();
        }
        concurrentHashMap.put(cls, aVar);
    }
}
