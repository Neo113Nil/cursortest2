package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import java.util.List;
import java.util.Set;

/* compiled from: ChatClipsMsgSendVcCallback.kt */
/* loaded from: classes2.dex */
public abstract class tob implements oz30<MsgFromUser, ly30> {
    public static final a b = new a();

    @Override // xsna.oz30
    public final void b(int i, String str, MsgTextFormat msgTextFormat, String str2, List list, Integer num, MsgSendSource msgSendSource, Set set, ly30 ly30Var) {
        f(str, msgTextFormat, list, ly30Var);
    }

    public abstract void f(String str, MsgTextFormat msgTextFormat, List<? extends Attach> list, ly30 ly30Var);

    @Override // xsna.vey
    public void e(float f) {
    }

    /* compiled from: ChatClipsMsgSendVcCallback.kt */
    public static final class a extends tob {
        @Override // xsna.tob
        public final void f(String str, MsgTextFormat msgTextFormat, List<? extends Attach> list, ly30 ly30Var) {
        }
    }
}
