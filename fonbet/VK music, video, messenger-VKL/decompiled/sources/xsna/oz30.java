package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgSendSource;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.qnv;

/* compiled from: MsgSendVcCallback.kt */
/* loaded from: classes2.dex */
public interface oz30<M extends Msg, SC extends qnv> extends vey {
    /* JADX WARN: Multi-variable type inference failed */
    static void c(oz30 oz30Var, int i, String str, MsgTextFormat msgTextFormat, String str2, List list, Integer num, MsgSendSource msgSendSource, Set set, qnv qnvVar, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            msgTextFormat = MsgTextFormat.d;
        }
        MsgTextFormat msgTextFormat2 = msgTextFormat;
        String str3 = (i2 & 8) != 0 ? "" : str2;
        if ((i2 & 16) != 0) {
            list = EmptyList.b;
        }
        oz30Var.b(i3, str, msgTextFormat2, str3, list, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? MsgSendSource.e.a : msgSendSource, (i2 & 128) != 0 ? EmptySet.b : set, (i2 & 256) != 0 ? null : qnvVar);
    }

    FragmentImpl a();

    void b(int i, String str, MsgTextFormat msgTextFormat, String str2, List<? extends Attach> list, Integer num, MsgSendSource msgSendSource, Set<CnvMsgId> set, SC sc);
}
