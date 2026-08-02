package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.List;

/* compiled from: ChatFragment.kt */
/* loaded from: classes2.dex */
public final class crb implements izs {
    public final /* synthetic */ ChatFragment b;
    public final /* synthetic */ le6 c;
    public final /* synthetic */ List<Attach> d;

    public crb(ChatFragment chatFragment, le6 le6Var, List list) {
        this.b = chatFragment;
        this.c = le6Var;
        this.d = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ChatFragment chatFragment = this.b;
        chatFragment.b0 = null;
        chatFragment.c0 = null;
        if (this.c instanceof pz30) {
            chatFragment.Q.h().d(this.d);
        }
        return s3q0.a;
    }
}
