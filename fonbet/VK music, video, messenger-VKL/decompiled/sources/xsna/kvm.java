package xsna;

import com.vk.channels.api.ChannelEntryPoint;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import xsna.qvm;
import xsna.rw30;
import xsna.xn50;

/* compiled from: DialogsSearchComponent.kt */
/* loaded from: classes18.dex */
public final class kvm implements rw30.a {
    public final SearchEntrypoint a = SearchEntrypoint.SEARCH_DIALOGS_COMPONENT;
    public final /* synthetic */ lvm b;

    public kvm(lvm lvmVar) {
        this.b = lvmVar;
    }

    @Override // xsna.rw30.a
    public final boolean a(Dialog dialog) {
        return true;
    }

    @Override // xsna.rw30.a
    public final boolean b(Dialog dialog) {
        return true;
    }

    @Override // xsna.rw30.a
    public final void c(long j, boolean z) {
        xn50.a.c(this.b, new qvm.b(j, z));
    }

    @Override // xsna.rw30.a
    public final void d(Dialog dialog, int i) {
        lvm.m(this.b, new DialogExt(dialog, new ProfilesInfo()), Integer.valueOf(i), "message_search", null, 16);
    }

    @Override // xsna.rw30.a
    public final void e(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        lvm.m(this.b, new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo)), null, "conversations_search", imSearchItemLoggingInfo, 10);
    }

    @Override // xsna.rw30.a
    public final void f(long j, boolean z) {
        qvm.a aVar = new qvm.a(j, z);
        lvm lvmVar = this.b;
        lvmVar.getClass();
        xn50.a.c(lvmVar, aVar);
    }

    @Override // xsna.rw30.a
    public final SearchEntrypoint g() {
        return this.a;
    }

    @Override // xsna.rw30.a
    public final void h(long j, boolean z) {
        lvm lvmVar = this.b;
        lvmVar.o.a().c(lvmVar.n.requireContext(), j, ChannelHistoryOpenMode.OpenAtUnread.b, z ? ChannelEntryPoint.SearchRecommendations.b : ChannelEntryPoint.Search.b);
    }

    @Override // xsna.rw30.a
    public final void i() {
        this.b.n.finish();
    }
}
