package xsna;

import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xqb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xqb(long j, PinnedMsg pinnedMsg, avm avmVar) {
        this.d = avmVar;
        this.c = j;
        this.e = pinnedMsg;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) obj3;
                sqm sqmVar = (sqm) obj2;
                ChatFragment.d dVar = ChatFragment.w1;
                boolean z = ((ipm) obj).a.c.get(Long.valueOf(this.c)) != null;
                return (z ? io.reactivex.rxjava3.core.x.k(s3q0.a) : chatFragment.io().b("DialogsListReporter", new uqm(sqmVar)).m(io.reactivex.rxjava3.android.schedulers.a.b())).l(new c7(new ChatFragment.n(z), 12));
            default:
                avm avmVar = (avm) obj3;
                avmVar.b.b().h(new zum(this.c, avmVar, (PinnedMsg) obj2, 0));
                return s3q0.a;
        }
    }

    public /* synthetic */ xqb(long j, ChatFragment chatFragment, sqm sqmVar) {
        this.c = j;
        this.d = chatFragment;
        this.e = sqmVar;
    }
}
