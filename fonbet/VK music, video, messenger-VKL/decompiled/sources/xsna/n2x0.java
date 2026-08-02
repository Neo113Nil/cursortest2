package xsna;

import android.view.ViewGroup;
import com.vk.core.view.components.skeleton.VkSkeleton;
import org.chromium.base.version_info.VersionConstants;

/* compiled from: VoipTextSkeletonDelegate.kt */
/* loaded from: classes7.dex */
public final class n2x0 extends p1u0<o2x0> {

    /* compiled from: VoipTextSkeletonDelegate.kt */
    public static final class a extends vfz<o2x0> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(o2x0 o2x0Var) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends o2x0> b(ViewGroup viewGroup) {
        VkSkeleton vkSkeleton = new VkSkeleton(viewGroup.getContext(), null, 0, 14, 0);
        float f = 16;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iah0.a(VersionConstants.PRODUCT_MAJOR_VERSION), iah0.a(f));
        int a2 = iah0.a(f);
        marginLayoutParams.setMargins(a2, a2, a2, a2);
        vkSkeleton.setLayoutParams(marginLayoutParams);
        return new a(vkSkeleton);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof o2x0;
    }
}
