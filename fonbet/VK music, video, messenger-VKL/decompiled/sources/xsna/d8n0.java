package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;

/* compiled from: SuperAppExpandableMenuStubElementHolder.kt */
/* loaded from: classes6.dex */
public final class d8n0 extends ucn0<m8q> {
    public final View p;

    public d8n0(View view) {
        super(view, null);
        this.p = view;
        VkSkeleton vkSkeleton = (VkSkeleton) this.itemView.findViewById(R.id.stub_icon);
        VkSkeleton vkSkeleton2 = (VkSkeleton) this.itemView.findViewById(R.id.stub_text);
        int a = iah0.a(100);
        int a2 = iah0.a(20);
        Context context = e43.a;
        ThemableShimmer.a aVar = new ThemableShimmer.a(context != null ? context : null);
        ThemableShimmer themableShimmer = aVar.a;
        themableShimmer.getClass();
        themableShimmer.i = R.attr.vk_ui_skeleton_from;
        themableShimmer.j = 1.0f;
        themableShimmer.f = R.attr.vk_ui_skeleton_to;
        themableShimmer.g = 1.0f;
        aVar.c(a);
        if (a2 < 0) {
            throw new IllegalArgumentException(lhg.a(a2, "Given invalid height: ").toString());
        }
        themableShimmer.l = a2;
        ThemableShimmer a3 = aVar.a();
        vkSkeleton.setType(new VkSkeleton.a.C0862a(16.0f));
        vkSkeleton.setShimmer(a3);
        vkSkeleton2.setType(new VkSkeleton.a.C0862a(0));
        vkSkeleton2.setShimmer(a3);
        vkSkeleton2.setShimmerManagedExternally(true);
    }

    @Override // xsna.hf6
    public final /* bridge */ /* synthetic */ void W5(zif0 zif0Var) {
    }
}
