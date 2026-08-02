package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vvq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vvq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1810939289, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:105)");
                    }
                    wvqVar.h(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1180041827, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:117)");
                    }
                    v0rVar.n("аватар + длинное имя + многострочный текст + вложение", aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                q630 q630Var = (q630) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-719617394, intValue3, -1, "com.vk.games.presentation.components.MapDetailItemsToView.<anonymous> (MapDetailItemsToView.kt:28)");
                    }
                    i6t.a(q630Var, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                m8d0 m8d0Var = (m8d0) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(75486678, intValue4, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.AddItemBtn.<anonymous> (PrimaryBlockGoodsHeaderRightActionsImpl.kt:179)");
                }
                qzu0.a.getClass();
                lg90 c = qzu0.c(aVar4);
                boolean J = aVar4.J(m8d0Var);
                Object x = aVar4.x();
                if (J || x == a.C0011a.a) {
                    x = new wzb0(m8d0Var, 4);
                    aVar4.R(x);
                }
                m8d0Var.f(c, null, null, x, (SemanticsConfiguration) ((zak0) m8d0Var.g).getValue(), aVar4, 8, 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
