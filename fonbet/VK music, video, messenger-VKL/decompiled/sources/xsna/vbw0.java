package xsna;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ubw0;

/* compiled from: VoiceMessageRouter.kt */
/* loaded from: classes18.dex */
public final class vbw0 implements hm50<ubw0> {
    public final Fragment a;
    public final mxv b;

    public vbw0(MultiComponentFragment multiComponentFragment, mxv mxvVar) {
        this.a = multiComponentFragment;
        this.b = mxvVar;
    }

    @Override // xsna.hm50
    public final void a(ubw0 ubw0Var) {
        MsgListOpenMode msgListOpenMode;
        ubw0 ubw0Var2 = ubw0Var;
        if (!(ubw0Var2 instanceof ubw0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        o0w b = this.b.b();
        Context requireContext = this.a.requireContext();
        ubw0.a aVar = (ubw0.a) ubw0Var2;
        long j = aVar.a;
        DialogExt dialogExt = new DialogExt(aVar.a, aVar.b);
        Integer num = aVar.c;
        if (num != null) {
            msgListOpenMode = new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, num.intValue());
        } else {
            msgListOpenMode = MsgListOpenAtUnreadMode.b;
        }
        o0w.x(b, requireContext, null, j, dialogExt, null, msgListOpenMode, false, null, null, null, null, null, null, "audio_msg_player", null, null, null, false, null, null, null, null, null, 1073733586);
    }
}
