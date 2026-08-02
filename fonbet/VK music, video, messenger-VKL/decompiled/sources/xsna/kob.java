package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import xsna.ye20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kob implements izs {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ImChatPaginationKey c;
    public final /* synthetic */ nob d;
    public final /* synthetic */ ye20.a e;
    public final /* synthetic */ LinkedHashMap f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;

    public /* synthetic */ kob(ArrayList arrayList, ImChatPaginationKey imChatPaginationKey, nob nobVar, ye20.a aVar, LinkedHashMap linkedHashMap, boolean z, int i) {
        this.b = arrayList;
        this.c = imChatPaginationKey;
        this.d = nobVar;
        this.e = aVar;
        this.f = linkedHashMap;
        this.g = z;
        this.h = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wpp wppVar = (wpp) obj;
        MsgIdType msgIdType = MsgIdType.CNV_ID;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        ImChatPaginationKey imChatPaginationKey = this.c;
        Peer b = Peer.a.b(imChatPaginationKey.c);
        Source source = Source.ACTUAL;
        ArrayList arrayList = this.b;
        nob nobVar = this.d;
        return nobVar.c.b(nobVar, new ej30(msgIdType, arrayList, b, source, true, nobVar)).l(new l8(new lob(wppVar, arrayList, nobVar, this.e, this.f, imChatPaginationKey, this.g, this.h), 13));
    }
}
