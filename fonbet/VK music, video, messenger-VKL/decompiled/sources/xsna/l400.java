package xsna;

import com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl;
import com.vk.log.L;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import xsna.a500;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l400 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l400(int i, Serializable serializable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = serializable;
        this.f = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, xsna.c400] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Serializable serializable = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                LongPollLiveEventsHandlerImpl longPollLiveEventsHandlerImpl = (LongPollLiveEventsHandlerImpl) obj4;
                com.vk.im.engine.internal.longpoll.response_handler.a aVar = (com.vk.im.engine.internal.longpoll.response_handler.a) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                ArrayList arrayList = (ArrayList) obj2;
                a500.a aVar2 = longPollLiveEventsHandlerImpl.b;
                w2w w2wVar = longPollLiveEventsHandlerImpl.a;
                aVar2.b();
                if (!longPollLiveEventsHandlerImpl.b(aVar)) {
                    ?? r10 = (c400) ref$ObjectRef.element;
                    longPollLiveEventsHandlerImpl.e(aVar, arrayList, r10);
                    ref$ObjectRef.element = r10;
                    break;
                } else {
                    aVar2.b();
                    if (!((c400) ref$ObjectRef.element).a.isEmpty()) {
                        new i1r0(((c400) ref$ObjectRef.element).a, w2wVar.f1()).o(w2wVar);
                    }
                    aVar2.b();
                    if (!((c400) ref$ObjectRef.element).b.isEmpty()) {
                        new mcp(((c400) ref$ObjectRef.element).b).o(w2wVar);
                    }
                    aVar2.b();
                    if (!((c400) ref$ObjectRef.element).c.isEmpty()) {
                        new kqu(((c400) ref$ObjectRef.element).c, w2wVar.f1()).o(w2wVar);
                    }
                    oeb oebVar = ((c400) ref$ObjectRef.element).l;
                    if (oebVar != null) {
                        aVar2.b();
                        new qeb(oebVar).o(w2wVar);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e500 e500Var = (e500) it.next();
                        aVar2.b();
                        e500Var.e((c400) ref$ObjectRef.element);
                    }
                    longPollLiveEventsHandlerImpl.d(aVar);
                    break;
                }
            default:
                Throwable th = (Throwable) obj;
                L.j(th, "ModelsManager", "download failed");
                ((izs) obj4).invoke(th);
                Regex regex = com.vk.core.files.a.a;
                vhk0.b((File) obj3);
                vhk0.b((File) serializable);
                ((q330) obj2).invoke();
                break;
        }
        return s3q0.a;
    }
}
