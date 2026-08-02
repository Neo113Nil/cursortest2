package xsna;

import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.fcw;
import xsna.xx30;

/* compiled from: MsgSearchPeersInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class zx30 extends FunctionReferenceImpl implements wzs<Object, ImSearchLocalRequestLoggingInfo, io.reactivex.rxjava3.core.x<gcw>> {
    @Override // xsna.wzs
    public final io.reactivex.rxjava3.core.x<gcw> invoke(Object obj, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo2 = imSearchLocalRequestLoggingInfo;
        xx30.b bVar = ((xx30) this.receiver).c;
        List l = e43.l(bVar.c, bVar.d);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((ibw) it.next()).a(new fcw.a("", 0L, imSearchLocalRequestLoggingInfo2.c, imSearchLocalRequestLoggingInfo2.f), obj));
        }
        return xx30.a(arrayList);
    }
}
