package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.profile.community.impl.ui.item.header.model.CommunityTrustMarkItemModel;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.ar20;
import xsna.dt70;
import xsna.k4i;
import xsna.kve;
import xsna.pnb0;
import xsna.us2;
import xsna.xpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vue implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vue(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ave.a((kve.a.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                k4i.a aVar = (k4i.a) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(117561845, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityTrustMarkItem.CommunityTrustMarkViewHolder.bindTrustMarkItem.<anonymous>.<anonymous>.<anonymous> (CommunityTrustMarkItem.kt:67)");
                    }
                    CommunityTrustMarkItemModel communityTrustMarkItemModel = ((k4i) aVar.m).g;
                    CommunityTrustMarkItemModel.Type type = communityTrustMarkItemModel.c;
                    CommunityTrustMarkItemModel.Type type2 = CommunityTrustMarkItemModel.Type.NONE;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (type == type2 && communityTrustMarkItemModel.e) {
                        aVar2.K(1886658850);
                        MiniInfoCell$Mode miniInfoCell$Mode = MiniInfoCell$Mode.AddInfo;
                        String str = ((k4i) aVar.m).g.d;
                        boolean y = aVar2.y(composeView) | aVar2.y(aVar);
                        Object x = aVar2.x();
                        if (y || x == c0012a) {
                            x = new yu1(6, composeView, aVar);
                            aVar2.R(x);
                        }
                        b4v0.a(ar20.a.a(str, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar2, 196608, 14), miniInfoCell$Mode, null, k4i.a.q6(((k4i) aVar.m).g.c, aVar2), null, ((k4i) aVar.m).h, null, aVar2, 48, 84);
                        aVar2.j();
                    } else {
                        if (type != type2) {
                            aVar2.K(1887431897);
                            MiniInfoCell$Mode miniInfoCell$Mode2 = MiniInfoCell$Mode.BaseAccent;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1832119911, 0, -1, "com.vk.profile.community.impl.ui.item.header.CommunityTrustMarkItem.CommunityTrustMarkViewHolder.buildTrustMarkTitle (CommunityTrustMarkItem.kt:100)");
                            }
                            us2.b b = xga0.b(-269353205, aVar2);
                            VkColorToken vkColorToken = VkColorToken.TextPrimary;
                            VkTypographyToken vkTypographyToken = VkTypographyToken.Paragraph;
                            int m = b.m(bkt0.c(new klv0(vkTypographyToken, vkColorToken), aVar2));
                            try {
                                b.g(((k4i) aVar.m).g.d);
                                b.g(" · ");
                                s3q0 s3q0Var = s3q0.a;
                                b.k(m);
                                aVar2.K(-269341067);
                                m = b.m(bkt0.c(new klv0(vkTypographyToken, VkColorToken.TextLink), aVar2));
                                try {
                                    b.g(d370.N(R.string.community_trust_mark_about, 0, aVar2));
                                    b.k(m);
                                    aVar2.j();
                                    us2 n = b.n();
                                    aVar2.j();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    boolean y2 = aVar2.y(composeView) | aVar2.y(aVar);
                                    Object x2 = aVar2.x();
                                    if (y2 || x2 == c0012a) {
                                        x2 = new tn0(10, composeView, aVar);
                                        aVar2.R(x2);
                                    }
                                    b4v0.a(ar20.a.b(n, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar2, 196608, 14), miniInfoCell$Mode2, null, k4i.a.q6(((k4i) aVar.m).g.c, aVar2), null, ((k4i) aVar.m).h, null, aVar2, 48, 84);
                                    aVar2 = aVar2;
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            aVar2.K(1883725165);
                        }
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                zs70.c((dt70.b) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 3:
                aob0 aob0Var = (aob0) obj4;
                xpb0 xpb0Var = (xpb0) obj3;
                qv2 qv2Var = (qv2) obj;
                String str2 = (String) obj2;
                gzs<bpw<qv2, iv2>> gzsVar = aob0Var.d;
                Map<qv2, iv2> map = gzsVar.invoke().b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(new bpw(map));
                iv2 iv2Var = (iv2) linkedHashMap.get(qv2Var);
                if (iv2Var == null) {
                    linkedHashMap.put(qv2Var, new iv2(str2, 1));
                } else {
                    linkedHashMap.put(qv2Var, new iv2(iv2Var.a, str2));
                }
                aob0Var.e.invoke(new bpw<>(linkedHashMap));
                aob0Var.a.invoke(new pnb0.a.c(aob0Var.b.invoke(), aob0Var.f.invoke().b, aob0Var.h.invoke().b, linkedHashMap));
                if (epx.f(((xpb0.a) xpb0Var).f, PollEditorMode.Edit.b)) {
                    izs<gob0, s3q0> izsVar = aob0Var.k;
                    gob0 invoke = aob0Var.j.invoke();
                    iv2 iv2Var2 = gzsVar.invoke().b.get(qv2Var);
                    long j = iv2Var2 != null ? iv2Var2.a : 0L;
                    if (j > 0) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(invoke.b);
                        linkedHashMap2.put(String.valueOf(j), str2);
                        s3q0 s3q0Var2 = s3q0.a;
                        izsVar.invoke(gob0.a(invoke, null, new bpw(linkedHashMap2), null, 5));
                    } else {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(invoke.c);
                        linkedHashMap3.put(Integer.valueOf(qv2Var.a), str2);
                        s3q0 s3q0Var3 = s3q0.a;
                        izsVar.invoke(gob0.a(invoke, null, null, new bpw(linkedHashMap3), 3));
                    }
                }
                return s3q0.a;
            case 4:
                c4p0 c4p0Var = (c4p0) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-320208151, intValue2, -1, "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.screen.Screen.<anonymous> (Screen.kt:89)");
                    }
                    j3p0.a(c4p0Var, izsVar2, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((i9p0) obj4).b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                o1t0.a((u95) obj4, (t95) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ vue(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
