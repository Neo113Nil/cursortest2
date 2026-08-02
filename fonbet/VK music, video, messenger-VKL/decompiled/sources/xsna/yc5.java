package xsna;

import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.phw;

/* compiled from: AuthorSelectionView.kt */
/* loaded from: classes4.dex */
public final class yc5 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final sgi0<Integer> b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(yc5.class, "listItemPosition", "getListItemPosition(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1);
        fpf0.a.getClass();
        a = new qcy[]{mutablePropertyReference1Impl};
        b = new sgi0<>("ListItemPosition");
    }

    public static final void a(PostingAuthorUiModel postingAuthorUiModel, boolean z, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        com.vk.core.compose.component.cell.content.b0 b0Var;
        androidx.compose.runtime.a M = aVar.M(251167765);
        int i2 = i | (M.J(postingAuthorUiModel) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(251167765, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.author_selection.AuthorCell (AuthorSelectionView.kt:123)");
            }
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, postingAuthorUiModel.g(), null, null, M, 0, 61), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(postingAuthorUiModel.f(), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            if (z) {
                M.K(706398187);
                b0Var = o.e.a.C0736a.a(true, null, false, null, M, 24582, 14);
                M.j();
            } else {
                M.K(706499185);
                M.j();
                b0Var = null;
            }
            wiu0.b(q630Var, false, a2, a3, b0Var, gzsVar, null, M, ((i2 >> 9) & 14) | (458752 & (i2 << 9)), 66);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rc5(postingAuthorUiModel, z, gzsVar, q630Var, i);
        }
    }
}
