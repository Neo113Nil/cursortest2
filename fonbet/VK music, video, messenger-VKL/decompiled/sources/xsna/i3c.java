package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.dt70;
import xsna.kdh0;
import xsna.o9c;
import xsna.q630;
import xsna.sum0;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class i3c implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i3c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lum0 lum0Var;
        int i;
        String str;
        SubnavigationButtonMode subnavigationButtonMode;
        lg90 lg90Var;
        char c;
        uum0 uum0Var;
        int i2;
        int i3;
        switch (this.b) {
            case 0:
                k3c k3cVar = (k3c) this.c;
                izs izsVar = (izs) this.d;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(951812883, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutComposeView.ThemedContent.<anonymous>.<anonymous> (CheckoutComposeView.kt:60)");
                }
                boolean z = fm50Var instanceof o9c.c;
                q630.a aVar2 = q630.a.a;
                if (z) {
                    aVar.K(83632085);
                    v8c.b(txj0.d(aVar2, 1.0f), aVar, 6);
                    aVar.j();
                } else if (fm50Var instanceof o9c.a) {
                    aVar.K(83900886);
                    boolean z2 = k3cVar.f;
                    wj50 wj50Var = k3cVar.h;
                    Object obj4 = a.C0011a.a;
                    if (z2) {
                        aVar.K(83930212);
                        o9c.a aVar3 = (o9c.a) fm50Var;
                        boolean y = aVar.y(k3cVar);
                        Object x = aVar.x();
                        if (y || x == obj4) {
                            x = new defpackage.r(k3cVar, 22);
                            aVar.R(x);
                        }
                        i4c.b(aVar3, izsVar, (gzs) x, wj50Var, txj0.d(aVar2, 1.0f), aVar, 24576);
                        aVar.j();
                    } else {
                        aVar.K(84486414);
                        o9c.a aVar4 = (o9c.a) fm50Var;
                        boolean y2 = aVar.y(k3cVar);
                        Object x2 = aVar.x();
                        if (y2 || x2 == obj4) {
                            x2 = new yh(k3cVar, 19);
                            aVar.R(x2);
                        }
                        x3c.c(aVar4, izsVar, (gzs) x2, wj50Var, txj0.d(aVar2, 1.0f), aVar, 24576);
                        aVar.j();
                    }
                    aVar.j();
                } else if (fm50Var instanceof o9c.b) {
                    aVar.K(85092681);
                    k3cVar.h((o9c.b) fm50Var, izsVar, txj0.d(aVar2, 1.0f), aVar, 4480);
                    aVar.j();
                } else {
                    if (fm50Var instanceof o9c.d) {
                        aVar.K(85445306);
                        b9c.a((o9c.d) fm50Var, izsVar, txj0.d(aVar2, 1.0f), aVar, 384);
                    } else {
                        aVar.K(81205839);
                    }
                    aVar.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                kwn kwnVar = (kwn) this.c;
                zzs<? super lg90, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar = (zzs) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar5.y(zzsVar) ? 4 : 2;
                }
                if (aVar5.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1683707044, intValue2, -1, "com.vk.community.design.compose.donut.DonutUserStackScopeImpl.avatars.<anonymous>.<anonymous> (DonutUserStack.kt:306)");
                    }
                    kwnVar.e(this.d, zzsVar, aVar5, (intValue2 << 3) & 112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 2:
                kdh0.a aVar6 = (kdh0.a) this.c;
                izs izsVar2 = (izs) this.d;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1265911020, intValue3, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.upperSettingsItems.<anonymous> (Loaded.kt:162)");
                    }
                    uzi0 uzi0Var = aVar6.i;
                    boolean J = aVar7.J(izsVar2);
                    Object x3 = aVar7.x();
                    if (J || x3 == a.C0011a.a) {
                        x3 = new zc4(izsVar2, 4);
                        aVar7.R(x3);
                    }
                    tzi0.a(uzi0Var, (gzs) x3, ahn.E(q630.a.a, "LoadedTags.DESCRIPTION"), null, aVar7, 384, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 3:
                dt70 dt70Var = (dt70) this.c;
                izs izsVar3 = (izs) this.d;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar8.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1486971003, intValue4, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersScreen.<anonymous> (OfflineAudioBookChaptersMviComposeComponent.kt:134)");
                    }
                    if (dt70Var instanceof dt70.b) {
                        aVar8.K(1244978459);
                        zs70.d((dt70.b) dt70Var, izsVar3, aVar8, 0);
                        aVar8.j();
                    } else {
                        if (!(dt70Var instanceof dt70.d)) {
                            throw alb0.c(1244976244, aVar8);
                        }
                        aVar8.K(1244982124);
                        zs70.e(0, aVar8);
                        aVar8.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            default:
                List list = (List) this.c;
                final izs izsVar4 = (izs) this.d;
                lum0 lum0Var2 = (lum0) obj;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= (intValue5 & 8) == 0 ? aVar9.J(lum0Var2) : aVar9.y(lum0Var2) ? 4 : 2;
                }
                int i4 = 0;
                if (aVar9.t(intValue5 & 1, (intValue5 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1095158638, intValue5, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.VkSubnavigationBarImplementations.<anonymous>.<anonymous> (SubnavigationBarScreenContent.kt:444)");
                    }
                    Iterator it = list.iterator();
                    final int i5 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        sum0.d dVar = (sum0.d) next;
                        zrp<SubnavigationButtonSize> h = SubnavigationButtonSize.h();
                        SubnavigationButton.Size size = dVar.a;
                        boolean z3 = dVar.k;
                        SubnavigationButtonSize subnavigationButtonSize = (SubnavigationButtonSize) h.get(size.ordinal());
                        SubnavigationButtonMode subnavigationButtonMode2 = (SubnavigationButtonMode) SubnavigationButtonMode.h().get(dVar.b.ordinal());
                        boolean z4 = dVar.k;
                        SubnavigationButtonAppearance subnavigationButtonAppearance = (SubnavigationButtonAppearance) SubnavigationButtonAppearance.h().get(dVar.c.ordinal());
                        String str2 = dVar.e;
                        if (!dVar.d) {
                            str2 = null;
                        }
                        lg90 a = pg90.a(dVar.g.h(), i4, aVar9);
                        if (!dVar.f) {
                            a = null;
                        }
                        Integer valueOf = Integer.valueOf(dVar.i);
                        Iterator it2 = it;
                        if (!dVar.h) {
                            valueOf = null;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            lum0Var = lum0Var2;
                            i = intValue5;
                            str = str2;
                            androidx.compose.runtime.b.f(-2122296830, 0, -1, "com.vk.design.demo.presentation.screens.SubnavigationBarScreenContent.composeButtonRightFromContentType (SubnavigationBarScreenContent.kt:466)");
                        } else {
                            lum0Var = lum0Var2;
                            i = intValue5;
                            str = str2;
                        }
                        int i7 = sum0.e.$EnumSwitchMapping$0[dVar.j.ordinal()];
                        Object obj5 = a.C0011a.a;
                        if (i7 != 1) {
                            subnavigationButtonMode = subnavigationButtonMode2;
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    aVar9.K(582228451);
                                    if (androidx.compose.runtime.b.d()) {
                                        i3 = 0;
                                        androidx.compose.runtime.b.f(1584423772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown24> (VkSdkIcons.kt:758)");
                                    } else {
                                        i3 = 0;
                                    }
                                    lg90 a2 = pg90.a(R.drawable.vk_icon_dropdown_24, i3, aVar9);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        lg90Var = a;
                                        androidx.compose.runtime.b.f(640428157, 221192, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.IconWithContent.Companion.invoke (SubnavigationButton.kt:110)");
                                    } else {
                                        lg90Var = a;
                                    }
                                    Object x4 = aVar9.x();
                                    if (x4 == obj5) {
                                        x4 = new uum0.c(a2, z3, oli.c);
                                        aVar9.R(x4);
                                    }
                                    uum0Var = (uum0.c) x4;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar9.j();
                                } else {
                                    if (i7 != 4) {
                                        throw alb0.c(582218302, aVar9);
                                    }
                                    aVar9.K(582243371);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-896188546, 54, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.Custom.Companion.invoke (SubnavigationButton.kt:138)");
                                    }
                                    Object x5 = aVar9.x();
                                    if (x5 == obj5) {
                                        x5 = new uum0.a(0);
                                        aVar9.R(x5);
                                    }
                                    uum0Var = (uum0.a) x5;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    aVar9.j();
                                    lg90Var = a;
                                }
                                c = 65535;
                            } else {
                                lg90Var = a;
                                aVar9.K(582221783);
                                if (androidx.compose.runtime.b.d()) {
                                    i2 = 0;
                                    androidx.compose.runtime.b.f(1584423772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Dropdown24> (VkSdkIcons.kt:758)");
                                } else {
                                    i2 = 0;
                                }
                                lg90 a3 = pg90.a(R.drawable.vk_icon_dropdown_24, i2, aVar9);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    c = 65535;
                                    androidx.compose.runtime.b.f(840877089, 24584, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.Icon.Companion.invoke (SubnavigationButton.kt:56)");
                                } else {
                                    c = 65535;
                                }
                                Object x6 = aVar9.x();
                                if (x6 == obj5) {
                                    x6 = new uum0.b(a3, z3);
                                    aVar9.R(x6);
                                }
                                uum0Var = (uum0.b) x6;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar9.j();
                            }
                        } else {
                            subnavigationButtonMode = subnavigationButtonMode2;
                            lg90Var = a;
                            c = 65535;
                            aVar9.K(868928187);
                            aVar9.j();
                            uum0Var = null;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        boolean z5 = dVar.l;
                        boolean J2 = aVar9.J(izsVar4) | aVar9.o(i5);
                        Object x7 = aVar9.x();
                        if (J2 || x7 == obj5) {
                            x7 = new gzs() { // from class: xsna.pum0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(Integer.valueOf(i5));
                                    return s3q0.a;
                                }
                            };
                            aVar9.R(x7);
                        }
                        lum0Var2 = lum0Var;
                        lum0Var2.a(subnavigationButtonSize, subnavigationButtonMode, z4, (gzs) x7, null, subnavigationButtonAppearance, str, lg90Var, uum0Var, valueOf, z5, aVar9, C.DEFAULT_MUXED_BUFFER_SIZE, (i << 3) & 112, 16);
                        i5 = i6;
                        it = it2;
                        intValue5 = i;
                        i4 = 0;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ i3c(List list, izs izsVar, sum0 sum0Var) {
        this.b = 4;
        this.c = list;
        this.d = izsVar;
    }
}
