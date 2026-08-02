package xsna;

import android.os.Bundle;
import com.vk.dialogssearch.impl.DialogsSearchFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import xsna.ox30;

/* compiled from: DialogsSearchComponent.kt */
/* loaded from: classes18.dex */
public final class lvm extends yj50<nvm, tvm, qvm, rvm, svm, ovm, pvm> {
    public final DialogsSearchFragment n;
    public final mxv o;
    public final a1w p;
    public final SearchMode q;
    public final f1w r;
    public final lzv s;
    public final com.vk.im.engine.models.c t;
    public final nbb u;
    public final kvm v;
    public rw30 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvm(DialogsSearchFragment dialogsSearchFragment, mxv mxvVar, a1w a1wVar, SearchMode searchMode, f1w f1wVar, lzv lzvVar, com.vk.im.engine.models.c cVar) {
        super(dialogsSearchFragment, dialogsSearchFragment, qvm.class, false);
        nbb nbbVar = new nbb(lzvVar);
        this.n = dialogsSearchFragment;
        this.o = mxvVar;
        this.p = a1wVar;
        this.q = searchMode;
        this.r = f1wVar;
        this.s = lzvVar;
        this.t = cVar;
        this.u = nbbVar;
        this.v = new kvm(this);
    }

    public static void m(lvm lvmVar, DialogExt dialogExt, Integer num, String str, ImSearchItemLoggingInfo imSearchItemLoggingInfo, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        boolean z = (i & 8) == 0;
        ImSearchItemLoggingInfo imSearchItemLoggingInfo2 = (i & 16) != 0 ? null : imSearchItemLoggingInfo;
        MsgListOpenMode msgListOpenAtMsgMode = num2 == null ? MsgListOpenAtUnreadMode.b : new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, num2.intValue());
        o0w.x(lvmVar.o.b(), lvmVar.n.kn(), Long.valueOf(lvmVar.r.a().b), dialogExt.e, dialogExt, null, msgListOpenAtMsgMode, z, null, null, null, null, null, null, str, null, null, null, false, null, null, new ChatAnalyticsParams(null, null, null, null, false, null, null, imSearchItemLoggingInfo2, null, 383, null), null, null, 1040179088);
    }

    @Override // xsna.yj50
    public final nvm a(Bundle bundle) {
        return new nvm(this.u);
    }

    @Override // xsna.yj50
    public final pvm b() {
        return new pvm();
    }

    @Override // xsna.yj50
    public final rvm d() {
        Peer a = this.r.a();
        a.getClass();
        ox30 ox30Var = !a.Ab(Peer.Type.GROUP) ? ox30.a.b : ox30.d.b;
        g6o0 g6o0Var = new g6o0(this);
        this.o.getClass();
        DialogsSearchFragment dialogsSearchFragment = this.n;
        rw30 rw30Var = new rw30(this.p, k9u0.a, dialogsSearchFragment.requireContext(), ox30Var, g6o0Var, 80);
        rw30Var.w = this.v;
        this.w = rw30Var;
        return new rvm(dialogsSearchFragment.requireContext(), new qqe(rw30Var, 8), new vq6(11, rw30Var, this), new com.vk.movika.sdk.base.flow.binding.g(12, rw30Var, this), new fne(this, 3));
    }
}
