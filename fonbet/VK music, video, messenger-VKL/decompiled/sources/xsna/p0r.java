package xsna;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import xsna.cri;
import xsna.dt1;
import xsna.k8s;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class p0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f3, code lost:
    
        if (com.vk.dto.common.restrictions.VideoRestriction.SupportedAction.a.a(r1) != false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        switch (this.b) {
            case 0:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-342213081, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:106)");
                    }
                    v0rVar.d(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                k8s.a aVar2 = (k8s.a) this.c;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.J(spg0Var) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(382307597, intValue2, -1, "com.vk.core.compose.component.form.HorizontalFormFieldGroupScopeImpl.item.<anonymous> (VkHorizontalFormFieldGroup.kt:117)");
                    }
                    q630 b = spg0Var.b(1.0f, q630.a.a, true);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    aVar2.a(aVar2, aVar3, 0);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) this.c;
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                TabLayout.g gVar = (TabLayout.g) obj3;
                CharSequence charSequence = gVar.c;
                ce40 ce40Var = new ce40(gVar.h.getContext(), musicCatalogRootVh.F);
                ce40Var.setText(charSequence);
                ce40Var.setVisibility(charSequence != null ? 0 : 8);
                return ce40Var;
            case 3:
                VideoRestriction videoRestriction = (VideoRestriction) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                RestrictionButton restrictionButton = videoRestriction.e;
                if (restrictionButton != null && booleanValue3 && (videoRestriction.f || (booleanValue2 && booleanValue))) {
                    if (booleanValue2) {
                        VideoRestriction.SupportedAction.Companion.getClass();
                        break;
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                ixi0 ixi0Var = (ixi0) this.c;
                ?? r1 = ixi0Var.g;
                ?? r2 = ixi0Var.e;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                if (((LinearLayoutManager) ixi0Var.b.getValue()).w() < ((zwi0) ixi0Var.c.getValue()).getItemCount() - 1) {
                    bwt0.p0((View) r2.getValue(), true);
                    Toolbar toolbar = (Toolbar) r1.getValue();
                    int b2 = cn70.b(16);
                    if (toolbar.u == null) {
                        toolbar.u = new ypg0();
                    }
                    toolbar.u.e(0, b2);
                } else {
                    bwt0.p0((View) r2.getValue(), false);
                    Toolbar toolbar2 = (Toolbar) r1.getValue();
                    int b3 = cn70.b(16);
                    if (toolbar2.u == null) {
                        toolbar2.u = new ypg0();
                    }
                    toolbar2.u.e(b3, 0);
                }
                return s3q0.a;
            default:
                doj dojVar = (doj) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2352411, intValue3, -1, "com.vk.core.compose.component.menu.VkContextMenu.<anonymous> (VkContextMenu.kt:229)");
                    }
                    aou0.a(dojVar, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ p0r(a390 a390Var, VideoRestriction videoRestriction) {
        this.b = 3;
        this.c = videoRestriction;
    }
}
