package xsna;

import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.Z3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.catalog2.feature.music.holders.ComposeMusicOwnerVh;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.p;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vk.ecomm.storefrontservices.impl.presentation.ui.StorefrontServicesContentKt;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;
import xsna.zol0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e3(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String f;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                l3.b((jgh0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.b((com.vk.catalog2.common.ui.mvp.holder.video.assistant.c) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj4;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) obj3;
                List list = (List) obj2;
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((xm40) it.next()).d;
                }
                if (j > 3000) {
                    ref$LongRef.element += j;
                    long j2 = ref$LongRef2.element;
                    xm40 xm40Var = (xm40) j5g.a0(list);
                    ref$LongRef2.element = j2 + (xm40Var != null ? xm40Var.e : 0L);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                if4.c((ddn) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((f15) obj4).c((hlb) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                rja.a((String) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                esg.a((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                UIBlockMusicOwner uIBlockMusicOwner = (UIBlockMusicOwner) obj4;
                ComposeMusicOwnerVh composeMusicOwnerVh = (ComposeMusicOwnerVh) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-757792850, intValue, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicOwnerVh.bindData.<anonymous> (ComposeMusicOwnerVh.kt:80)");
                    }
                    rrv0.d(null, null, null, null, kai.c(9458963, new dsg(r7 ? 1 : 0, uIBlockMusicOwner, composeMusicOwnerVh), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 8:
                ptj ptjVar = (ptj) obj4;
                String str = (String) obj3;
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                textView.setEnabled((str != null ? str : "").length() > 0);
                ptjVar.d = textView;
                editText.addTextChangedListener(ptjVar.e);
                editText.setMinLines(1);
                if (str != null && str.length() != 0) {
                    editText.setSelection(str.length());
                }
                break;
            case 9:
                EditStorefrontAlbumError editStorefrontAlbumError = (EditStorefrontAlbumError) obj4;
                MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = (MarketEditAlbumGoodVariantsFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = MarketEditAlbumGoodVariantsFragment.M0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2124563742, intValue2, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodVariantsFragment.bindErrorView.<anonymous>.<anonymous> (MarketEditAlbumGoodVariantsFragment.kt:105)");
                    }
                    boolean y = aVar2.y(marketEditAlbumGoodVariantsFragment);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new bfm(marketEditAlbumGoodVariantsFragment, 18);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j1p.a(editStorefrontAlbumError, gzsVar, hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((fn20) obj4).c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((d8d0) obj4).u((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 12:
                final fsd0 fsd0Var = (fsd0) obj4;
                final vod0 vod0Var = (vod0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1961843969, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSpinnerHolder.bind.<anonymous>.<anonymous> (ProductFilterSpinnerHolder.kt:44)");
                    }
                    aVar3.W(158591876, fsd0Var.d());
                    Object x2 = aVar3.x();
                    if (x2 == c0012a) {
                        Integer d2 = fsd0Var.d();
                        x2 = androidx.compose.runtime.i.a(d2 != null ? d2.intValue() : 0);
                        aVar3.R(x2);
                    }
                    final rg50 rg50Var = (rg50) x2;
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar3.R(x3);
                    }
                    final wh50 wh50Var = (wh50) x3;
                    List<Integer> list2 = fsd0Var.h;
                    Integer num = list2 != null ? list2.get(rg50Var.getIntValue()) : null;
                    if (num == null) {
                        aVar3.K(621744584);
                        aVar3.j();
                        f = null;
                    } else {
                        f = l4.f(aVar3, 621744585, num, aVar3, 0);
                    }
                    String str2 = f == null ? "" : f;
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    Object x4 = aVar3.x();
                    if (x4 == c0012a) {
                        x4 = new ebx(wh50Var, 21);
                        aVar3.R(x4);
                    }
                    u2x a = g8s.b.a.a(s2x.b.a.b(str2, booleanValue, (izs) x4, null, null, 0L, 0L, null, kai.c(-884190281, new yzs() { // from class: xsna.tod0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            androidx.compose.runtime.a aVar4;
                            fsd0 fsd0Var2;
                            rg50 rg50Var2;
                            int i3;
                            lg90 lg90Var;
                            androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj6;
                            int intValue4 = ((Integer) obj7).intValue();
                            if (aVar5.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-884190281, intValue4, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterSpinnerHolder.bind.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductFilterSpinnerHolder.kt:57)");
                                }
                                a.m mVar = androidx.compose.foundation.layout.a.c;
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                                int hashCode = Long.hashCode(n34.n(aVar5));
                                sy90 D = aVar5.D();
                                q630.a aVar6 = q630.a.a;
                                q630 c = qri.c(aVar5, aVar6);
                                cri.h7.getClass();
                                LayoutNode.a aVar7 = cri.a.b;
                                if (aVar5.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar5.H();
                                if (aVar5.L()) {
                                    aVar5.I(aVar7);
                                } else {
                                    aVar5.f();
                                }
                                k9q0.w(aVar5, a2, cri.a.f);
                                k9q0.w(aVar5, D, cri.a.e);
                                k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar5, cri.a.h);
                                k9q0.w(aVar5, c, cri.a.d);
                                final fsd0 fsd0Var3 = fsd0.this;
                                List<Integer> list3 = fsd0Var3.h;
                                if (list3 == null) {
                                    aVar5.K(815277592);
                                    aVar5.j();
                                    aVar4 = aVar5;
                                } else {
                                    aVar5.K(815277593);
                                    final int i4 = 0;
                                    for (Object obj8 : list3) {
                                        int i5 = i4 + 1;
                                        if (i4 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        int intValue5 = ((Number) obj8).intValue();
                                        q630 f2 = txj0.f(aVar6, 1.0f);
                                        boolean o = aVar5.o(i4) | aVar5.y(fsd0Var3);
                                        final vod0 vod0Var2 = vod0Var;
                                        boolean y2 = o | aVar5.y(vod0Var2);
                                        Object x5 = aVar5.x();
                                        final rg50 rg50Var3 = rg50Var;
                                        if (y2 || x5 == a.C0011a.a) {
                                            final wh50 wh50Var2 = wh50Var;
                                            gzs gzsVar2 = new gzs() { // from class: xsna.uod0
                                                @Override // xsna.gzs
                                                public final Object invoke() {
                                                    rg50 rg50Var4 = rg50Var3;
                                                    rg50Var4.C(i4);
                                                    wh50Var2.setValue(Boolean.FALSE);
                                                    Integer valueOf = Integer.valueOf(rg50Var4.getIntValue());
                                                    fsd0 fsd0Var4 = fsd0Var3;
                                                    fsd0Var4.h(valueOf);
                                                    vod0Var2.l.invoke(fsd0Var4);
                                                    return s3q0.a;
                                                }
                                            };
                                            fsd0Var2 = fsd0Var3;
                                            rg50Var2 = rg50Var3;
                                            i3 = i4;
                                            aVar5.R(gzsVar2);
                                            x5 = gzsVar2;
                                        } else {
                                            fsd0Var2 = fsd0Var3;
                                            rg50Var2 = rg50Var3;
                                            i3 = i4;
                                        }
                                        q630 c2 = ojc.c(f2, false, null, null, (gzs) x5, 15);
                                        androidx.compose.runtime.a aVar8 = aVar5;
                                        com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(intValue5, 0, aVar5), null, null, 0, null, null, aVar8, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar8, 196608, 30);
                                        if (i3 == rg50Var2.getIntValue()) {
                                            aVar8.K(-1091764724);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1888582236, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done16> (VkSdkIcons.kt:694)");
                                            }
                                            lg90Var = or.b(aVar8, -1318018545, R.drawable.vk_icon_done_16, aVar8, 0);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            aVar8.j();
                                        } else {
                                            aVar8.K(-1091764334);
                                            aVar8.j();
                                            lg90Var = ugp.g;
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar8.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        wiu0.b(c2, false, null, a3, o.c.a(null, com.vk.core.compose.component.cell.content.p.a(lg90Var, ylu0Var2.getIcon().a, 0L, null, null, null, aVar8, 1572872, 60), null, null, null, aVar8, 61), null, null, aVar8, 0, 102);
                                        aVar5 = aVar8;
                                        i4 = i5;
                                        fsd0Var3 = fsd0Var2;
                                    }
                                    aVar4 = aVar5;
                                    aVar4.j();
                                }
                                aVar4.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar5.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar3), aVar3, 384, Z3.l), null, false, null, aVar3, 24576, 14);
                    tlo0 tlo0Var = fsd0Var.e;
                    nvu0.a(a, null, h8s.a.a(String.valueOf(tlo0Var != null ? tlo0Var.a(vod0Var.itemView.getContext()) : null), false, null, null, null, aVar3, 196608, 30), null, null, aVar3, 0, 26);
                    aVar3.a0();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((SkeletonScreenContent) obj4).c((SkeletonType) obj3, (androidx.compose.runtime.a) obj, ne7.I(71));
                break;
            case 14:
                ((Integer) obj2).getClass();
                StorefrontServicesContentKt.a((izs) obj3, (zol0.a.d) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 15:
                jdj0 jdj0Var = (jdj0) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1924527171, intValue4, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.WidgetSkeletonCard.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:313)");
                    }
                    ckv0.a(null, jdj0Var, kai.c(496413784, new bk9(jaiVar, 3), aVar4), aVar4, 448, 1);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj4;
                d0l d0lVar = (d0l) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1329314773, intValue5, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous> (VkDateTimePicker.kt:88)");
                    }
                    boolean J = aVar5.J(dateTimePickerState);
                    Object x5 = aVar5.x();
                    if (J || x5 == c0012a) {
                        p.a aVar6 = new p.a(0, dateTimePickerState, DateTimePickerState.class, "dismissDialog", "dismissDialog$components_release()V", 0);
                        aVar5.R(aVar6);
                        x5 = aVar6;
                    }
                    kyk.a((gzs) ((fcy) x5), kai.c(-1801637401, new jn7(13, d0lVar, dateTimePickerState), aVar5), null, kai.c(-898716823, new p0h(dateTimePickerState, 6), aVar5), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, kai.c(668214974, new rp7(d0lVar, 4), aVar5), aVar5, 100666416);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ e3(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }

    public /* synthetic */ e3(izs izsVar, zol0.a.d dVar, int i) {
        this.b = 14;
        this.c = izsVar;
        this.d = dVar;
    }
}
