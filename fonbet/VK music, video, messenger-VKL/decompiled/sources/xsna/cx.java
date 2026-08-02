package xsna;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketGetCommentsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.ar20;
import xsna.b78;
import xsna.br20;
import xsna.cri;
import xsna.dt1;
import xsna.iwj0;
import xsna.jte;
import xsna.q630;
import xsna.te4;
import xsna.xn60;
import xsna.yo60;
import xsna.zq20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cx implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cx(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x079c  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        UIBlockList uIBlockList;
        Integer num;
        CatalogViewType catalogViewType;
        Object remove;
        View inflate;
        androidx.compose.runtime.a aVar;
        lg90 B1;
        br20 br20Var;
        int i = this.b;
        q630.a aVar2 = q630.a.a;
        int i2 = 4;
        int i3 = 5;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i4 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((kx) obj4).k((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(65));
                return s3q0.a;
            case 1:
                te4 te4Var = (te4) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1574219898, intValue, -1, "com.vk.music.bottomsheets.audiobook.chapter.presentation.compose.AudioBookChapterScreen.<anonymous> (AudioBookChapterMviComposeComponent.kt:74)");
                    }
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar2);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, F);
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
                    if (!(te4Var instanceof te4.a)) {
                        throw alb0.c(-2094427367, aVar3);
                    }
                    aVar3.K(-2094424343);
                    oe4.a((te4.a) te4Var, izsVar, aVar3, 0);
                    aVar3.j();
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                c1a c1aVar = (c1a) obj3;
                UIBlockList uIBlockList2 = (UIBlockList) obj;
                if (((Boolean) obj4).booleanValue()) {
                    ArrayList<UIBlock> arrayList = uIBlockList2.y;
                    Iterator<UIBlock> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i4 = -1;
                        } else if (it.next().e != CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES) {
                            i4++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    if (i4 == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue2 = valueOf.intValue() + 1;
                        while (true) {
                            Object b0 = j5g.b0(intValue2, arrayList);
                            if ((b0 != null ? ((UIBlock) b0).e : null) == CatalogDataType.DATA_TYPE_NONE) {
                                UIBlock uIBlock = (UIBlock) b0;
                                if (uIBlock.d.l() || (catalogViewType = uIBlock.d) == CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT || catalogViewType == CatalogViewType.SYNTHETIC_SEPARATOR_THIN || catalogViewType == CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND || catalogViewType == CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND_TRANSPARENT || catalogViewType == CatalogViewType.SYNTHETIC_SEPARATOR_OVERLAP) {
                                    intValue2++;
                                }
                            }
                        }
                        if (intValue2 >= 0 && intValue2 < arrayList.size() && arrayList.get(intValue2).e != CatalogDataType.DATA_TYPE_CATALOG_BANNERS) {
                            num = Integer.valueOf(intValue2);
                            if (num != null) {
                                bn40.h("Can't find index for autodownloads banner in UiBlockList");
                                return uIBlockList2;
                            }
                            ArrayList arrayList2 = new ArrayList(uIBlockList2.y);
                            arrayList2.add(num.intValue(), (UIBlockPlaceholder) c1aVar.g.getValue());
                            uIBlockList = new UIBlockList(uIBlockList2, arrayList2);
                        }
                    }
                    num = null;
                    if (num != null) {
                    }
                } else {
                    ArrayList<UIBlock> arrayList3 = uIBlockList2.y;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : arrayList3) {
                        if (!epx.f(((UIBlock) obj5).b, "synthetic_music_auto_download_banner_block")) {
                            arrayList4.add(obj5);
                        }
                    }
                    uIBlockList = new UIBlockList(uIBlockList2, arrayList4);
                }
                return uIBlockList;
            case 3:
                ((Integer) obj2).getClass();
                fbc.p((izs) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 4:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                int i5 = ((zux) obj).a;
                int i6 = ((zux) obj2).a;
                ((izs) obj4).invoke(new jte.f(i5, i6));
                if (i5 != i6 && (remove = snapshotStateList.remove(i5)) != null) {
                    snapshotStateList.add(i6, remove);
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                mzi.a(ne7.I(385), (androidx.compose.runtime.a) obj, (String) obj4, (izs) obj3);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((tsp) obj4).b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                final FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = (FirstPinnedTabLayoutVh) obj3;
                final int intValue3 = ((Integer) obj).intValue();
                ViewGroup viewGroup = (ViewGroup) obj2;
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                FirstPinnedTabLayoutVh.a aVar5 = (FirstPinnedTabLayoutVh.a) j5g.b0(intValue3, (ArrayList) obj4);
                if (aVar5 instanceof FirstPinnedTabLayoutVh.a.b) {
                    CatalogHintType catalogHintType = ((FirstPinnedTabLayoutVh.a.b) aVar5).a;
                    FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
                    if (firstPinnedTabLayout == null) {
                        firstPinnedTabLayout = null;
                    }
                    LayoutInflater from = LayoutInflater.from(firstPinnedTabLayout.getContext());
                    int i7 = FirstPinnedTabLayoutVh.b.$EnumSwitchMapping$0[catalogHintType.ordinal()];
                    if (i7 == 1) {
                        View inflate2 = from.inflate(R.layout.highlight_tab_view, viewGroup, false);
                        final VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) inflate2.findViewById(R.id.highlighter);
                        TextView textView = (TextView) inflate2.findViewById(R.id.tab_title);
                        Resources resources = viewGroup.getResources();
                        FirstPinnedTabLayout firstPinnedTabLayout2 = firstPinnedTabLayoutVh.p;
                        if (firstPinnedTabLayout2 == null) {
                            firstPinnedTabLayout2 = null;
                        }
                        TabLayout.g b = firstPinnedTabLayout2.b(intValue3);
                        vkOnboardingHighlighter.setText(resources.getString(R.string.higlighted_text, b != null ? b.c : null));
                        FirstPinnedTabLayoutVh.g(textView, true, true);
                        cmr cmrVar = new cmr(textView, firstPinnedTabLayoutVh, vkOnboardingHighlighter, intValue3);
                        textView.addOnAttachStateChangeListener(new amr(textView, cmrVar, firstPinnedTabLayoutVh, vkOnboardingHighlighter, intValue3));
                        if (textView.isAttachedToWindow()) {
                            if (textView.getWidth() <= 0 || textView.getHeight() <= 0) {
                                textView.getViewTreeObserver().addOnGlobalLayoutListener(cmrVar);
                            } else {
                                textView.post(new Runnable() { // from class: xsna.ulr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        SchemeStat$EventItem schemeStat$EventItem2 = FirstPinnedTabLayoutVh.F;
                                        FirstPinnedTabLayoutVh.this.d(vkOnboardingHighlighter, intValue3);
                                    }
                                });
                            }
                        }
                        utk0 utk0Var = firstPinnedTabLayoutVh.B;
                        Boolean bool = Boolean.TRUE;
                        utk0Var.getClass();
                        utk0Var.i(null, bool);
                        return inflate2;
                    }
                    if (i7 != 2) {
                        return firstPinnedTabLayoutVh.a(intValue3, viewGroup);
                    }
                    inflate = from.inflate(R.layout.highlight_tab_view_kids, viewGroup, false);
                    FirstPinnedTabLayout firstPinnedTabLayout3 = firstPinnedTabLayoutVh.p;
                    if (firstPinnedTabLayout3 == null) {
                        firstPinnedTabLayout3 = null;
                    }
                    TabLayout.g b2 = firstPinnedTabLayout3.b(intValue3);
                    inflate.setContentDescription(b2 != null ? b2.c : null);
                    bwt0.m0(iah0.a(12) + ((int) iah0.y(52)), iah0.a(16) + ((int) iah0.y(18)), inflate);
                    firstPinnedTabLayoutVh.s.k(intValue3, new hxl(inflate, i2));
                } else {
                    if (!(aVar5 instanceof FirstPinnedTabLayoutVh.a.c)) {
                        return firstPinnedTabLayoutVh.a(intValue3, viewGroup);
                    }
                    iwj0 iwj0Var = ((FirstPinnedTabLayoutVh.a.c) aVar5).a;
                    FirstPinnedTabLayout firstPinnedTabLayout4 = firstPinnedTabLayoutVh.p;
                    inflate = LayoutInflater.from((firstPinnedTabLayout4 != null ? firstPinnedTabLayout4 : null).getContext()).inflate(R.layout.single_tab_view, viewGroup, false);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.single_tab_text);
                    iwj0.b bVar = iwj0Var.a;
                    if (bVar != null) {
                        at.d(inflate, R.string.rate_recommendations, textView2);
                        textView2.setTextColor(bVar.a);
                        textView2.setVisibility(0);
                    } else {
                        f4m.j(textView2);
                    }
                    ImageView imageView = (ImageView) inflate.findViewById(R.id.single_tab_icon);
                    iwj0.a aVar6 = iwj0Var.b;
                    if (aVar6 != null) {
                        imageView.setImageResource(aVar6.a);
                        imageView.setImageTintList(ColorStateList.valueOf(aVar6.b));
                        if (bVar != null) {
                            f4m.r(iah0.a(5), imageView);
                        }
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
                return inflate;
            case 8:
                qse0 qse0Var = (qse0) obj4;
                n7u n7uVar = (n7u) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1071611679, intValue4, -1, "com.vk.ecomm.market.good.ui.holder.goodquickmessages.GoodQuickMessagesHolder.onBind.<anonymous>.<anonymous> (GoodQuickMessagesHolder.kt:105)");
                    }
                    ArrayList arrayList5 = qse0Var.b;
                    String str = qse0Var.a;
                    boolean y = aVar7.y(n7uVar);
                    Object x = aVar7.x();
                    if (y || x == c0012a) {
                        x = new srg(n7uVar, 19);
                        aVar7.R(x);
                    }
                    o7u.a(3072, aVar7, str, arrayList5, (izs) x, txj0.f(aVar2, 1.0f));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.Icon) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 10:
                jrv jrvVar = (jrv) obj4;
                q630 q630Var = (q630) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1533848037, intValue5, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.icon.IconWithOnboardingTooltip.Content.<anonymous> (IconWithOnboardingTooltip.kt:49)");
                    }
                    jrvVar.b(8, aVar8, q630Var, (lg90) ((zak0) jrvVar.a).getValue());
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 11:
                MarketGetCommentsResponseDto marketGetCommentsResponseDto = (MarketGetCommentsResponseDto) obj;
                return new b110(marketGetCommentsResponseDto.getCount(), 20, Boolean.valueOf(((MarketMarketItemFullDto) obj2).k() == BaseBoolIntDto.YES), ((h110) obj4).b.a(marketGetCommentsResponseDto, (UserId) obj3));
            case 12:
                ((Integer) obj2).getClass();
                n750.o((b78.i) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                ((wo60) obj4).a.a(new xn60.b.h(drm0.p0((CharSequence) obj2).toString(), ((yo60.e.j) obj3).a));
                ((DialogInterface) obj).dismiss();
                return s3q0.a;
            case 14:
                lkd0 lkd0Var = (lkd0) obj4;
                jkd0 jkd0Var = (jkd0) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-620181287, intValue6, -1, "com.vk.ecomm.market.good.good2.presentation.community.market.ProductCardCommunityMarketInfoHolder.onBind.<anonymous>.<anonymous> (ProductCardCommunityMarketInfoHolder.kt:50)");
                    }
                    q630.a aVar10 = q630.a.a;
                    q630 H = s200.H(aVar10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 5);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar9, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar9));
                    sy90 D2 = aVar9.D();
                    q630 c2 = qri.c(aVar9, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar11 = cri.a.b;
                    if (aVar9.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar9.H();
                    if (aVar9.L()) {
                        aVar9.I(aVar11);
                    } else {
                        aVar9.f();
                    }
                    k9q0.w(aVar9, a, cri.a.f);
                    k9q0.w(aVar9, D2, cri.a.e);
                    k9q0.w(aVar9, Integer.valueOf(hashCode2), cri.a.g);
                    k9q0.t(aVar9, cri.a.h);
                    k9q0.w(aVar9, c2, cri.a.d);
                    int i8 = lkd0Var.b;
                    int i9 = lkd0Var.c;
                    int i10 = lkd0Var.b;
                    boolean z = lkd0Var.e;
                    if (i8 > 0) {
                        aVar9.K(1097326992);
                        MiniInfoCell$Mode miniInfoCell$Mode = MiniInfoCell$Mode.Base;
                        if (z) {
                            aVar9.K(1282329625);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1336284452, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckAlt20> (VkSdkIcons.kt:338)");
                            }
                            B1 = or.b(aVar9, 801928586, R.drawable.vk_icon_check_alt_20, aVar9, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar9.K(1282330397);
                            qzu0.a.getClass();
                            B1 = qzu0.B1(aVar9);
                        }
                        aVar9.j();
                        zq20 a2 = zq20.a.a(B1, null, null, aVar9, 24584, 14);
                        aVar = aVar9;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(100143584, 0, -1, "com.vk.ecomm.market.good.good2.presentation.community.market.ProductCardCommunityMarketInfoHolder.GetSubscribersTitle (ProductCardCommunityMarketInfoHolder.kt:107)");
                        }
                        boolean l = aVar.l(z) | aVar.o(i10) | aVar.o(i9);
                        Object x2 = aVar.x();
                        if (l || x2 == c0012a) {
                            StringBuilder sb = new StringBuilder();
                            if (z) {
                                sb.append(jkd0Var.g6(R.string.community_market_you_subscribed));
                                sb.append((CharSequence) rik0.a);
                            }
                            if (i10 > 0) {
                                Pair pair = new Pair(Integer.valueOf(R.plurals.community_subscribers), Integer.valueOf(R.string.community_subscribers_formatted));
                                sb.append(uqm0.i(i10, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), true));
                                if (i9 > 0 && !z) {
                                    String i11 = uqm0.i(i9, R.plurals.community_friends, R.string.community_friends_formatted, true);
                                    sb.append((CharSequence) rik0.a);
                                    sb.append(i11);
                                }
                            }
                            x2 = sb.toString();
                            aVar.R(x2);
                        }
                        String str2 = (String) x2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        ar20 a3 = ar20.a.a(str2, false, false, false, null, aVar, 196608, 30);
                        if (z || lkd0Var.d == null) {
                            aVar.K(1098236687);
                            aVar.j();
                            br20Var = null;
                        } else {
                            aVar.K(1097835578);
                            UserStackSize userStackSize = UserStackSize.Medium;
                            boolean J = aVar.J(lkd0Var);
                            Object x3 = aVar.x();
                            if (J || x3 == c0012a) {
                                x3 = new ut30(lkd0Var, 11);
                                aVar.R(x3);
                            }
                            br20 a4 = br20.a.a(userStackSize, (izs) x3, aVar, 24582, 6);
                            aVar.j();
                            br20Var = a4;
                        }
                        boolean y2 = aVar.y(jkd0Var);
                        Object x4 = aVar.x();
                        if (y2 || x4 == c0012a) {
                            x4 = new vt30(jkd0Var, 23);
                            aVar.R(x4);
                        }
                        b4v0.a(a3, miniInfoCell$Mode, aVar10, a2, br20Var, (gzs) x4, null, aVar, Tensorflow.FRAME_WIDTH, 64);
                    } else {
                        aVar = aVar9;
                        aVar.K(1095016531);
                    }
                    aVar.j();
                    if (lkd0Var.f) {
                        aVar.K(1098637269);
                        q630 E = ahn.E(aVar10, "product_card_community_buy_conditions");
                        MiniInfoCell$Mode miniInfoCell$Mode2 = MiniInfoCell$Mode.Base;
                        qzu0.a.getClass();
                        androidx.compose.runtime.a aVar12 = aVar;
                        zq20 a5 = zq20.a.a(qzu0.d0(aVar), null, null, aVar12, 24584, 14);
                        ar20 a6 = ar20.a.a(jkd0Var.g6(R.string.community_payment_delivery_return), false, false, false, null, aVar12, 196608, 30);
                        boolean y3 = aVar12.y(jkd0Var);
                        Object x5 = aVar12.x();
                        if (y3 || x5 == c0012a) {
                            x5 = new uq50(jkd0Var, 23);
                            aVar12.R(x5);
                        }
                        b4v0.a(a6, miniInfoCell$Mode2, E, a5, null, (gzs) x5, null, aVar12, Tensorflow.FRAME_WIDTH, 80);
                        aVar = aVar12;
                    } else {
                        aVar.K(1095016531);
                    }
                    aVar.j();
                    q630 E2 = ahn.E(aVar10, "product_card_community_go_to_store");
                    MiniInfoCell$Mode miniInfoCell$Mode3 = MiniInfoCell$Mode.AddInfo;
                    qzu0.a.getClass();
                    androidx.compose.runtime.a aVar13 = aVar;
                    zq20 a7 = zq20.a.a(qzu0.J0(aVar), null, null, aVar13, 24584, 14);
                    ar20 a8 = ar20.a.a(jkd0Var.g6(R.string.market_item_open_shop_owner), false, false, false, null, aVar13, 196608, 30);
                    boolean y4 = aVar13.y(jkd0Var);
                    Object x6 = aVar13.x();
                    if (y4 || x6 == c0012a) {
                        x6 = new x850(jkd0Var, 18);
                        aVar13.R(x6);
                    }
                    b4v0.a(a8, miniInfoCell$Mode3, E2, a7, null, (gzs) x6, null, aVar13, Tensorflow.FRAME_WIDTH, 80);
                    aVar13.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.topbar.c) obj4).e((mtk0) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 16:
                ((Integer) obj2).getClass();
                ((h2o0) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                e1l e1lVar = (e1l) obj4;
                com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) obj3;
                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar14.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1003240601, intValue7, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerDialog.<anonymous>.<anonymous> (VkDateRangePicker.kt:79)");
                    }
                    boolean z2 = (e1lVar.g() == null || e1lVar.f() == null) ? false : true;
                    boolean J2 = aVar14.J(e1lVar) | aVar14.J(gVar);
                    Object x7 = aVar14.x();
                    if (J2 || x7 == c0012a) {
                        x7 = new plq0(i3, e1lVar, gVar);
                        aVar14.R(x7);
                    }
                    bqv0.d(0, 0, aVar14, (gzs) x7, z2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar14.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ cx(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
