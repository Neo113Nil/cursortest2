package xsna;

import com.vk.dto.attaches.AttachDoc;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uqb implements gzs {
    public final /* synthetic */ ChatFragment b;
    public final /* synthetic */ Dialog c;
    public final /* synthetic */ Msg d;
    public final /* synthetic */ AttachDoc e;

    public /* synthetic */ uqb(ChatFragment chatFragment, Dialog dialog, Msg msg, AttachDoc attachDoc) {
        this.b = chatFragment;
        this.c = dialog;
        this.d = msg;
        this.e = attachDoc;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ChatFragment.d dVar = ChatFragment.w1;
        this.b.Io(this.c, this.d, this.e);
        return s3q0.a;
    }
}
