package xsna;

import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MsgSearchPeersInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class cy30 extends FunctionReferenceImpl implements zzs<String, Long, Object, ImSearchLocalRequestLoggingInfo, io.reactivex.rxjava3.core.x<gcw>> {
    @Override // xsna.zzs
    public final io.reactivex.rxjava3.core.x<gcw> invoke(String str, Long l, Object obj, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo2 = imSearchLocalRequestLoggingInfo;
        q2u q2uVar = ((xx30) this.receiver).c.i;
        String str2 = imSearchLocalRequestLoggingInfo2.c;
        SearchEntrypoint searchEntrypoint = imSearchLocalRequestLoggingInfo2.f;
        q2uVar.getClass();
        return q2uVar.a.C(obj, new tt90(str, 30, str2, searchEntrypoint)).l(new e40(new p2u(0), 15));
    }
}
