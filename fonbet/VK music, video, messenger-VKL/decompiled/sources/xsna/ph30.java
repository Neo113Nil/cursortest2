package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MsgBuildHelper.kt */
/* loaded from: classes2.dex */
public final class ph30 {
    public static final ph30 a = new ph30();

    public static MsgFromUser a(w2w w2wVar, long j, String str, MsgTextFormat msgTextFormat, String str2, List list, List list2, NestedMsg nestedMsg, String str3, String str4, ly30 ly30Var) {
        ArrayList arrayList;
        List list3 = list2;
        if (list3 != null && !list3.isEmpty() && nestedMsg != null) {
            arrayList = new ArrayList();
            arrayList.addAll(list3);
            arrayList.add(nestedMsg);
        } else if (list3 != null && !list3.isEmpty()) {
            arrayList = new ArrayList(list3);
        } else if (nestedMsg != null) {
            arrayList = new ArrayList();
            arrayList.add(nestedMsg);
        } else {
            arrayList = new ArrayList();
        }
        MsgFromUser msgFromUser = new MsgFromUser();
        msgFromUser.b = w2wVar.d1();
        msgFromUser.d = 0;
        msgFromUser.c = j;
        msgFromUser.f = w2wVar.R0();
        msgFromUser.g = w2wVar.f1();
        msgFromUser.h = mq9.a(w2wVar);
        msgFromUser.i = false;
        msgFromUser.j = false;
        msgFromUser.E = "";
        if (str == null) {
            str = "";
        }
        msgFromUser.F = str;
        if (msgTextFormat == null) {
            msgTextFormat = MsgTextFormat.d;
        }
        msgFromUser.G = msgTextFormat;
        if (str2 == null) {
            str2 = "";
        }
        msgFromUser.N = str2;
        msgFromUser.H = list != null ? new ArrayList(list) : new ArrayList();
        msgFromUser.I = arrayList;
        if (str3 == null) {
            str3 = "";
        }
        msgFromUser.O = str3;
        if (str4 == null) {
            str4 = "";
        }
        msgFromUser.P = str4;
        msgFromUser.o = MsgSyncState.SENDING;
        msgFromUser.u = cq.a(w2wVar);
        msgFromUser.v = ly30Var.d;
        msgFromUser.w = ly30Var.c;
        msgFromUser.x = ly30Var.b;
        return msgFromUser;
    }

    public static List b(List list, w2w w2wVar) {
        if (list.isEmpty()) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attach attach = (Attach) it.next();
            try {
                Attach c = l34.c(w2wVar, attach);
                c.S2(((attach instanceof AttachWithId) && ((AttachWithId) attach).M()) ? AttachSyncState.UPLOAD_REQUIRED : AttachSyncState.DONE);
                arrayList.add(c);
            } catch (Exception e) {
                Attach copy = attach.copy();
                hpt0.f(w2wVar, copy);
                copy.S2(AttachSyncState.ERROR);
                arrayList.add(copy);
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
        return arrayList;
    }
}
