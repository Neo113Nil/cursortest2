package xsna;

import androidx.compose.runtime.a;
import kotlin.Pair;
import xsna.psn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x9a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                break;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-292236766, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:113)");
                    }
                    v0rVar.f(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                bft bftVar = (bft) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(843348257, intValue2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogWhatInsideModalBottomSheetView.ThemedContent.<anonymous> (GamesCatalogWhatInsideModalBottomSheetView.kt:28)");
                    }
                    nkx0 nkx0Var = bftVar.h1;
                    frg frgVar = bftVar.i1;
                    boolean y = aVar2.y(bftVar);
                    Object x = aVar2.x();
                    if (y || x == a.C0011a.a) {
                        x = new cwg(bftVar, 23);
                        aVar2.R(x);
                    }
                    aft.b(nkx0Var, frgVar, (gzs) x, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                wh50 wh50Var = (wh50) this.c;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar3.J(jjVar) ? 4 : 2;
                }
                int i2 = intValue3;
                if (aVar3.t(i2 & 1, (i2 & 19) != 18)) {
                    int i3 = -1;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2003531701, i2, -1, "com.vk.design.demo.presentation.screens.MainContent.Content.<anonymous>.<anonymous>.<anonymous> (MainContent.kt:134)");
                    }
                    int size = uka.a.size();
                    int i4 = 0;
                    while (i4 < size) {
                        if (((Number) wh50Var.getValue()).intValue() == i4) {
                            i = size;
                            z = true;
                        } else {
                            i = size;
                            z = false;
                        }
                        boolean o = aVar3.o(i4);
                        Object x2 = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (o || x2 == obj4) {
                            x2 = new ld00(i4, wh50Var);
                            aVar3.R(x2);
                        }
                        gzs<s3q0> gzsVar = (gzs) x2;
                        String str = (String) ((Pair) uka.a.get(i4)).i();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1591975853, 48, i3, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                        }
                        Object x3 = aVar3.x();
                        if (x3 == obj4) {
                            x3 = new psn0.a(str);
                            aVar3.R(x3);
                        }
                        psn0.a aVar4 = (psn0.a) x3;
                        ((zak0) aVar4.b).setValue(str);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        jjVar.c(z, gzsVar, null, aVar4, null, null, null, aVar3, (i2 << 21) & 29360128, 116);
                        i4++;
                        i3 = i3;
                        size = i;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
