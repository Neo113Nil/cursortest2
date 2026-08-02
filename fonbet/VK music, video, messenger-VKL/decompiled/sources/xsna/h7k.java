package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.money.createtransfer.chat.CreateChatTransferFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;

/* compiled from: CreateChatTransferFragment.kt */
/* loaded from: classes3.dex */
public final class h7k extends z1q0 {
    public final /* synthetic */ CreateChatTransferFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7k(List<? extends MobileOfficialAppsCoreNavStat$EventScreen> list, CreateChatTransferFragment createChatTransferFragment) {
        super(list);
        this.c = createChatTransferFragment;
    }

    @Override // xsna.z1q0, com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        super.Wd(gVar);
        int i = CreateChatTransferFragment.F0;
        Object obj = this.c.m0;
        if (obj == null) {
            obj = null;
        }
        ((d7k) obj).c(gVar.e);
    }
}
