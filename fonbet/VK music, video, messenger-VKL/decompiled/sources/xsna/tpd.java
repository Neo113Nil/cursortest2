package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.q630;
import xsna.uhg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tpd implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tpd(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                izs izsVar = (izs) this.c;
                wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar = (wzs) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(wzsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2007920388, intValue, -1, "com.vk.clips.upload.ui.impl.compose.views.description.createTrendingBadgeOnboardingTooltipWrapper.<anonymous> (ClipsDescriptionBlock.kt:182)");
                    }
                    if (str != null) {
                        aVar.K(1946795010);
                        boolean J = aVar.J(izsVar);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new vpd(izsVar, 0);
                            aVar.R(x);
                        }
                        ofe.a.a(str, (gzs) x, wzsVar, aVar, (intValue << 6) & 896);
                        aVar.j();
                    } else {
                        aVar.K(1947044157);
                        wzsVar.invoke(aVar, Integer.valueOf(intValue & 14));
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                Context context = ((khg0) this.d).c;
                izs izsVar2 = (izs) this.c;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-970618063, intValue2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeView.ThemedContent.<anonymous>.<anonymous> (ReviewFriendsComposeView.kt:66)");
                }
                if (fm50Var instanceof uhg0.d) {
                    aVar2.K(-1962748672);
                    jhg0.a(null, aVar2, 0);
                    aVar2.j();
                } else {
                    boolean z = fm50Var instanceof uhg0.b;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar2.K(-1962598787);
                        uhg0.b bVar = (uhg0.b) fm50Var;
                        wh50 c = jk50.c(bVar.a, aVar2);
                        wh50 c2 = jk50.c(bVar.b, aVar2);
                        String obj4 = ((tlo0) c.getValue()).a(context).toString();
                        String obj5 = ((tlo0) c2.getValue()).a(context).toString();
                        boolean J2 = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new dn7(izsVar2, 6);
                            aVar2.R(x2);
                        }
                        ihg0.a(obj4, obj5, (gzs) x2, aVar2, 0);
                        aVar2.j();
                    } else if (fm50Var instanceof uhg0.a) {
                        aVar2.K(-1962043515);
                        uhg0.a aVar3 = (uhg0.a) fm50Var;
                        boolean J3 = aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new vpd(izsVar2, 5);
                            aVar2.R(x3);
                        }
                        gzs gzsVar = (gzs) x3;
                        boolean J4 = aVar2.J(izsVar2);
                        Object x4 = aVar2.x();
                        if (J4 || x4 == c0012a) {
                            x4 = new owo(izsVar2, 3);
                            aVar2.R(x4);
                        }
                        izs izsVar3 = (izs) x4;
                        boolean J5 = aVar2.J(izsVar2);
                        Object x5 = aVar2.x();
                        if (J5 || x5 == c0012a) {
                            x5 = new nyg(izsVar2, 5);
                            aVar2.R(x5);
                        }
                        hhg0.a(aVar3, gzsVar, izsVar3, (gzs) x5, null, aVar2, 0);
                        aVar2.j();
                    } else {
                        aVar2.K(fm50Var instanceof uhg0.c ? -756010347 : -1965438511);
                        aVar2.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 2:
                o3j0 o3j0Var = (o3j0) this.d;
                izs izsVar4 = (izs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1002221326, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsQuality.<anonymous> (SettingsScreen.kt:139)");
                    }
                    zzi0 zzi0Var = o3j0Var.e;
                    boolean J6 = aVar4.J(izsVar4);
                    Object x6 = aVar4.x();
                    if (J6 || x6 == a.C0011a.a) {
                        x6 = new m9a(izsVar4, 3);
                        aVar4.R(x6);
                    }
                    yzi0.a(zzi0Var, (izs) x6, ahn.E(q630.a.a, "ScreenTags.COMPRESS"), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                ButtonSize buttonSize = (ButtonSize) this.d;
                ButtonStyle buttonStyle = (ButtonStyle) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                aVar5.K(-720674879);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-720674879, intValue4, -1, "com.vk.core.compose.component.button.buttonSkeleton.<anonymous> (VkButtonSkeleton.kt:118)");
                }
                q630 c3 = dhu0.c(q630Var, buttonSize, buttonStyle, hr80.z().x(0, aVar5), hr80.z().c(buttonSize, buttonStyle, false, aVar5, 0, 4).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return c3;
        }
    }
}
