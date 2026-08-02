package xsna;

import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cp8;
import xsna.cri;
import xsna.dat0;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u0r implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lgu0 b;
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                v0r v0rVar = (v0r) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1423778793, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:138)");
                    }
                    v0rVar.n("аватар + длинное имя + бэйдж + многострочный текст + вложение", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(658139019, intValue2, -1, "com.vk.profile.community.members.impl.ui.MembersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MembersScreen.kt:155)");
                    }
                    gzsVar.invoke();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                mc90 mc90Var = (mc90) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(104252590, intValue3, -1, "com.vk.core.tool.compose.onboarding.fullscreen.PaginationWithButtonImpl.Content.<anonymous>.<anonymous> (PaginationWithButtonImpl.kt:62)");
                }
                ee90.b(mc90Var.k() + 1, mc90Var.o(), null, aVar3, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 3:
                gvm0 gvm0Var = (gvm0) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1719957329, intValue4, -1, "com.vk.newsfeed.common.views.subscribe.SubscribeButton.Content.<anonymous> (SubscribeButton.kt:45)");
                    }
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    hr80.z().getClass();
                    op8.h();
                    float f = kqu0.s;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f, dt1.a.o), dt1.a.l, aVar4, 48);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar5);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a, cri.a.f);
                    k9q0.w(aVar4, D, cri.a.e);
                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar4, cri.a.h);
                    k9q0.w(aVar4, c, cri.a.d);
                    aVar4.K(-573642801);
                    gio0 a2 = cp8.d.a.a(d370.N(gvm0Var.a, 0, aVar4), null, aVar4, 3072, 6);
                    if (gvm0Var.c) {
                        aVar4.K(-924396401);
                        aVar4.j();
                        b = gvm0Var.e;
                    } else {
                        aVar4.K(-924310562);
                        b = hr80.z().b(ButtonStyle.Secondary, ButtonAppearance.Neutral, aVar4, 54);
                        aVar4.j();
                    }
                    a2.a(b, aVar4, 390);
                    aVar4.j();
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                xvn0 xvn0Var = (xvn0) obj4;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                aVar6.K(-1306302349);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1306302349, intValue5, -1, "com.vk.tabbar.settings.impl.compose.getSemanticsOrDefault.<anonymous> (TabbarSettingsContentTable.kt:252)");
                }
                String str = xvn0Var.a;
                nvn0.o.getClass();
                boolean f2 = epx.f(str, nvn0.r);
                gzo0 gzo0Var = xvn0Var.b;
                if (f2) {
                    aVar6.K(645424688);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-392053772, 0, -1, "com.vk.tabbar.settings.impl.compose.getManagedGroupContentDescription (TabbarSettingsContentTable.kt:263)");
                    }
                    aVar6.K(1193450573);
                    StringBuilder sb = new StringBuilder();
                    Integer num = gzo0Var.a;
                    if (num == null) {
                        aVar6.K(-2012122977);
                    } else {
                        aVar6.K(-2012122976);
                        sb.append(d370.N(num.intValue(), 0, aVar6));
                        sb.append('\n');
                    }
                    aVar6.j();
                    String str2 = gzo0Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('\n');
                    }
                    Integer num2 = xvn0Var.c.c;
                    if (num2 == null) {
                        aVar6.K(-2011988654);
                    } else {
                        aVar6.K(-2011988653);
                        int intValue6 = num2.intValue() - 1;
                        if (intValue6 > 0) {
                            aVar6.K(868943285);
                            sb.append(d370.F(R.plurals.tabbar_settings_accessibility_managed_communities_available, intValue6, new Object[]{Integer.valueOf(intValue6)}, aVar6, 0));
                            sb.append('\n');
                        } else {
                            aVar6.K(1157242564);
                        }
                        aVar6.j();
                    }
                    aVar6.j();
                    String sb2 = sb.toString();
                    aVar6.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean J = aVar6.J(sb2);
                    Object x = aVar6.x();
                    if (J || x == a.C0011a.a) {
                        x = new qbl(sb2, 2);
                        aVar6.R(x);
                    }
                    q630Var = egi0.a(q630Var, (izs) x);
                    aVar6.j();
                } else {
                    aVar6.K(645584059);
                    aVar6.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return q630Var;
            case 5:
                dat0 dat0Var = (dat0) obj4;
                ((Integer) obj3).getClass();
                dat0Var.e.bk(((dat0.a) obj2).c);
                dat0Var.b((View) obj);
                return s3q0.a;
            default:
                xnt0 xnt0Var = (xnt0) obj4;
                Rect rect = (Rect) obj;
                Size size = (Size) obj2;
                Size size2 = (Size) obj3;
                xnt0Var.getClass();
                Rect rect2 = new Rect();
                View view = xnt0Var.a;
                if (iah0.s(view.getContext())) {
                    rect2.top = size2.getHeight() - size.getHeight();
                    rect2.bottom = size2.getHeight();
                    rect2.left = 0;
                    rect2.right = size2.getWidth();
                    if (!xnt0Var.e) {
                        rect2.offset(0, rect.bottom);
                    }
                } else {
                    rect2.top = 0;
                    rect2.bottom = size2.getHeight();
                    rect2.left = size2.getWidth() - size.getWidth();
                    rect2.right = size2.getWidth();
                    rect2.offset(-rect.right, 0);
                }
                if (iah0.s(view.getContext())) {
                    Rect rect3 = new Rect();
                    rect3.left = 0;
                    rect3.right = rect2.right;
                    rect3.top = xnt0Var.d ? rect.top : 0;
                    rect3.bottom = rect2.top;
                    return rect3;
                }
                Rect rect4 = new Rect();
                rect4.left = rect.left;
                rect4.right = rect2.left;
                rect4.top = 0;
                rect4.bottom = rect2.bottom;
                return rect4;
        }
    }
}
