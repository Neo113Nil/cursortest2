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
public final /* synthetic */ class ay30 extends FunctionReferenceImpl implements zzs<String, Long, Object, ImSearchLocalRequestLoggingInfo, io.reactivex.rxjava3.core.x<gcw>> {
    @Override // xsna.zzs
    public final io.reactivex.rxjava3.core.x<gcw> invoke(String str, Long l, Object obj, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
        String str2 = str;
        Long l2 = l;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo2 = imSearchLocalRequestLoggingInfo;
        xx30 xx30Var = (xx30) this.receiver;
        xx30.b bVar = xx30Var.c;
        List I = rl3.I(new fcw[]{bVar.e, ((Boolean) xx30Var.g.getValue()).booleanValue() ? bVar.f : null, bVar.g});
        ArrayList arrayList = new ArrayList(c5g.u(I, 10));
        Iterator it = I.iterator();
        while (it.hasNext()) {
            arrayList.add(((fcw) it.next()).a(new fcw.a(str2, l2, imSearchLocalRequestLoggingInfo2.c, imSearchLocalRequestLoggingInfo2.f), obj));
        }
        return xx30.a(arrayList);
    }
}
