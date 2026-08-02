package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.users.User;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ye20;

/* compiled from: MessagesGetNewHistoryAttachmentsApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ef20 extends FunctionReferenceImpl implements wzs<ye20.a, ProfilesSimpleInfo, ye20.a> {
    @Override // xsna.wzs
    public final ye20.a invoke(ye20.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        ye20.a aVar2 = aVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((df20) this.receiver).getClass();
        List<HistoryAttach> list = aVar2.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (HistoryAttach historyAttach : list) {
            arrayList.add(HistoryAttach.zb(historyAttach, null, (User) profilesSimpleInfo2.b.get(Long.valueOf(historyAttach.c)), Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w04.b(((HistoryAttach) it.next()).d, profilesSimpleInfo2);
        }
        return new ye20.a(arrayList, aVar2.b, aVar2.c);
    }
}
