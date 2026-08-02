package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.ClipVideoFile;
import com.vk.im.chat.clips.decoration.api.models.ImChatClipsPaginationDecorPayload;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import xsna.ye20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lob implements izs {
    public final /* synthetic */ wpp b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ nob d;
    public final /* synthetic */ ye20.a e;
    public final /* synthetic */ LinkedHashMap f;
    public final /* synthetic */ ImChatPaginationKey g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;

    public /* synthetic */ lob(wpp wppVar, ArrayList arrayList, nob nobVar, ye20.a aVar, LinkedHashMap linkedHashMap, ImChatPaginationKey imChatPaginationKey, boolean z, int i) {
        this.b = wppVar;
        this.c = arrayList;
        this.d = nobVar;
        this.e = aVar;
        this.f = linkedHashMap;
        this.g = imChatPaginationKey;
        this.h = z;
        this.i = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (r0.a.size() == r13.i) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007e, code lost:
    
        if (r11 == null) goto L19;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer num;
        ImChatClipsPaginationDecorPayload imChatClipsPaginationDecorPayload;
        ImChatClipsPaginationDecorPayload imChatClipsPaginationDecorPayload2;
        Integer num2;
        t140 t140Var = (t140) obj;
        wpp wppVar = this.b;
        LinkedHashSet j = izi0.j(wppVar.c.keySet(), wppVar.b);
        wpp<Integer, Msg> c = t140Var.a.c();
        c.q(j);
        wpp<Integer, Msg> wppVar2 = t140Var.a;
        wppVar2.q(izi0.g(j5g.S0(this.c), j));
        nob nobVar = this.d;
        nobVar.e.onNext(t140Var.b);
        s2f s2fVar = nobVar.a;
        long j2 = this.g.c;
        ye20.a aVar = this.e;
        List<HistoryAttach> list = aVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Pair pair = null;
            r8 = null;
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            HistoryAttach historyAttach = (HistoryAttach) it.next();
            HashMap hashMap = c.c;
            int i = historyAttach.b;
            Attach attach = historyAttach.d;
            boolean containsKey = hashMap.containsKey(Integer.valueOf(i));
            Msg msg = (Msg) c.c.get(Integer.valueOf(i));
            if (msg == null) {
                msg = (Msg) wppVar2.c.get(Integer.valueOf(i));
            }
            MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
            if (msgFromUser != null && (num2 = msgFromUser.R) != null) {
                str = (String) this.f.get(Integer.valueOf(num2.intValue()));
            }
            AttachVideo attachVideo = (AttachVideo) attach;
            pair = new Pair(s2fVar.e((ClipVideoFile) attachVideo.b), new ImChatClipsPaginationDecorPayload(msg, attachVideo.j, containsKey, str));
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        boolean z = this.h;
        int i2 = 0;
        Pair pair2 = (Pair) j5g.b0(z ? e43.h(arrayList) : 0, arrayList);
        if (pair2 != null && (imChatClipsPaginationDecorPayload2 = (ImChatClipsPaginationDecorPayload) pair2.j()) != null) {
            num = Integer.valueOf(imChatClipsPaginationDecorPayload2.b.d);
        }
        num = null;
        if (pair2 != null && (imChatClipsPaginationDecorPayload = (ImChatClipsPaginationDecorPayload) pair2.j()) != null) {
            i2 = imChatClipsPaginationDecorPayload.c;
        }
        return new fob(num != null ? new ImChatPaginationKey(num.intValue(), j2, Math.max(i2 + (z ? 1 : -1), 1)) : null, arrayList);
    }
}
