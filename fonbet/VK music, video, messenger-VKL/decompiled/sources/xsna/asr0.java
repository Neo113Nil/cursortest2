package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.im.design.view.listitem.skeleton.ImChatProfileMembersSkeleton;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhLoadingV2.kt */
/* loaded from: classes2.dex */
public final class asr0 extends kqr0<yyb.e> {
    public final jj0 l;
    public final ImChatProfileMembersSkeleton m;
    public final ImChatProfileMembersSkeleton n;
    public final ImChatProfileMembersSkeleton o;
    public final ThemableShimmer p;

    public asr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(R.layout.vkim_chat_settings_loading_v2, viewGroup);
        this.l = jj0Var;
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton = (ImChatProfileMembersSkeleton) this.itemView.findViewById(R.id.skeletonFirst);
        this.m = imChatProfileMembersSkeleton;
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton2 = (ImChatProfileMembersSkeleton) this.itemView.findViewById(R.id.skeletonSecond);
        this.n = imChatProfileMembersSkeleton2;
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton3 = (ImChatProfileMembersSkeleton) this.itemView.findViewById(R.id.skeletonThird);
        this.o = imChatProfileMembersSkeleton3;
        ThemableShimmer.a aVar = new ThemableShimmer.a(this.itemView.getContext());
        aVar.a.getClass();
        aVar.b();
        aVar.e();
        ThemableShimmer a = aVar.a();
        this.p = a;
        imChatProfileMembersSkeleton.setShimmer(a);
        imChatProfileMembersSkeleton2.setShimmer(a);
        imChatProfileMembersSkeleton3.setShimmer(a);
    }

    @Override // xsna.kqr0
    /* renamed from: i6, reason: merged with bridge method [inline-methods] */
    public final void W5(yyb.e eVar) {
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton = this.m;
        imChatProfileMembersSkeleton.setArea(new a.C0863a(imChatProfileMembersSkeleton));
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton2 = this.n;
        imChatProfileMembersSkeleton2.setArea(new a.C0863a(imChatProfileMembersSkeleton2));
        ImChatProfileMembersSkeleton imChatProfileMembersSkeleton3 = this.o;
        imChatProfileMembersSkeleton3.setArea(new a.C0863a(imChatProfileMembersSkeleton3));
        this.p.b();
        if (eVar.b) {
            this.l.c();
        }
    }
}
