package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchFeedCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.IconButtonRippleType;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.video.growth.impl.ui.entity.TrapViewState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.idh0;
import xsna.pb60;
import xsna.q630;
import xsna.s1c0;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class iq8 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iq8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Iterable] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        List arrayList;
        float f;
        lg90 lg90Var;
        ArrayList arrayList2;
        int i2 = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i3 = 2;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                s890 s890Var = (s890) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        i = -1;
                        androidx.compose.runtime.b.f(-869936862, intValue, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:121)");
                    } else {
                        i = -1;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1630198856, 6, i, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:105)");
                    }
                    yup0 yup0Var = (yup0) aVar.r(fvp0.b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    djo0.a(yup0Var.k, kai.c(165539859, new rv7(r10 ? 1 : 0, s890Var, jaiVar), aVar), aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                boolean z = false;
                ArrayList arrayList3 = (ArrayList) obj4;
                izs izsVar = (izs) obj3;
                Integer num = (Integer) obj;
                cbg cbgVar = (cbg) obj2;
                if (ogg.a.contains(Integer.valueOf(cbgVar.c))) {
                    ArrayList<Attachment> u = cbgVar.a.u();
                    if (u != null) {
                        int size = u.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Attachment attachment = u.get(i4);
                            if ((attachment instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment)).booleanValue()) {
                                PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
                                if (photoAttachment.l.Hb()) {
                                    photoAttachment.l.L = null;
                                }
                                z = true;
                            }
                            i4++;
                            z = z;
                        }
                    } else {
                        boolean z2 = false;
                        for (Attachment attachment2 : u) {
                            if ((attachment2 instanceof PhotoAttachment) && ((Boolean) izsVar.invoke(attachment2)).booleanValue()) {
                                PhotoAttachment photoAttachment2 = (PhotoAttachment) attachment2;
                                if (photoAttachment2.l.Hb()) {
                                    photoAttachment2.l.L = null;
                                }
                                z2 = true;
                            }
                        }
                        z = z2 ? 1 : 0;
                    }
                    if (z) {
                        arrayList3.add(num);
                    }
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                bxl.e((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                r1m r1mVar = (r1m) obj4;
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = DisplayAudioBookChaptersFragment.b0;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1291616411, intValue2, -1, "com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment.showDescriptionBookBottomSheet.<anonymous>.<anonymous> (DisplayAudioBookChaptersFragment.kt:224)");
                    }
                    boolean y = aVar2.y(displayAudioBookChaptersFragment);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new pwk(displayAudioBookChaptersFragment, 5);
                        aVar2.R(x);
                    }
                    dg4.a(r1mVar, (izs) x, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ((a600) obj4).b.getBottomControlPanel().k((Throwable) obj, new h1(21, (Ref$ObjectRef) obj3, (izs) obj2));
                return s3q0.a;
            case 5:
                NewsEntry newsEntry = (NewsEntry) obj4;
                pb60.b bVar = (pb60.b) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList4 = uIBlockList.y;
                ArrayList arrayList5 = new ArrayList();
                for (UIBlock uIBlock : arrayList4) {
                    if (uIBlock.e.i()) {
                        UIBlockFeed uIBlockFeed = (UIBlockFeed) uIBlock;
                        u1c0 u1c0Var = uIBlockFeed.y;
                        CatalogViewStyle catalogViewStyle = uIBlockFeed.l;
                        SearchFeedCatalogViewStyle searchFeedCatalogViewStyle = catalogViewStyle instanceof SearchFeedCatalogViewStyle ? (SearchFeedCatalogViewStyle) catalogViewStyle : null;
                        if (searchFeedCatalogViewStyle == null) {
                            arrayList = Collections.singletonList(uIBlock);
                        } else if (searchFeedCatalogViewStyle.b != 78) {
                            arrayList = Collections.singletonList(uIBlock);
                        } else if (epx.f(u1c0Var.a, newsEntry)) {
                            NewsEntry newsEntry2 = u1c0Var.a;
                            NewsEntryWithAttachments newsEntryWithAttachments = newsEntry2 instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry2 : null;
                            if (newsEntryWithAttachments == null) {
                                arrayList = Collections.singletonList(uIBlock);
                            } else {
                                newsEntryWithAttachments.Hb().e = false;
                                s1c0 a = new s1c0.a().a();
                                i2c0 i2c0Var = bVar.f;
                                i2c0Var.getClass();
                                List d = y64.d(newsEntryWithAttachments);
                                ArrayList arrayList6 = new ArrayList();
                                i2c0Var.e(arrayList6, d, newsEntryWithAttachments, u1c0Var.b, u1c0Var.l, u1c0Var.m, a);
                                arrayList = new ArrayList(c5g.u(arrayList6, 10));
                                Iterator it = arrayList6.iterator();
                                while (it.hasNext()) {
                                    u1c0 u1c0Var2 = (u1c0) it.next();
                                    arrayList.add(uIBlockFeed.Pb(u1c0Var2, new SearchFeedCatalogViewStyle(u1c0Var2.c)));
                                }
                            }
                        } else {
                            arrayList = Collections.singletonList(uIBlock);
                        }
                    } else {
                        arrayList = Collections.singletonList(uIBlock);
                    }
                    g5g.y(arrayList, arrayList5);
                }
                return new UIBlockList(uIBlockList, arrayList5);
            case 6:
                ((Integer) obj2).getClass();
                ich0.e((idh0.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                q8o0.a((r8o0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                e6p0 e6p0Var = (e6p0) obj4;
                fuv0 fuv0Var = (fuv0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1364974673, intValue3, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipComposeButtons.<anonymous>.<anonymous>.<anonymous> (TooltipScreenContent.kt:376)");
                    }
                    if (e6p0Var.j()) {
                        aVar3.K(789924384);
                        boolean J = aVar3.J(fuv0Var);
                        Object x2 = aVar3.x();
                        if (J || x2 == c0012a) {
                            x2 = new gkc0(fuv0Var, 17);
                            aVar3.R(x2);
                        }
                        e6p0Var.c(0, aVar3, (gzs) x2, null);
                    } else {
                        aVar3.K(773862323);
                    }
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 9:
                TrapViewState trapViewState = (TrapViewState) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-812379154, intValue4, -1, "com.vk.video.growth.impl.ui.view.TrapContentView.<anonymous> (TrapContentView.kt:45)");
                    }
                    q630.a aVar5 = q630.a.a;
                    q630 m = hr80.m(rte0.d(txj0.f(sua.d(0.9f, aVar5, false), 1.0f), vog0.b(12)), wlb0.h(aVar4).getBackground().r, androidx.compose.ui.graphics.e.a);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar4));
                    sy90 D = aVar4.D();
                    q630 c = qri.c(aVar4, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar4, d2, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar4, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar4, valueOf, bVar2);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar4, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar4, c, dVar);
                    fwu0.c(txj0.d(aVar5, 1.0f), null, trapViewState.d, null, null, null, null, ami.a, aVar4, 100663302, 250);
                    ty6 ty6Var = dt1.a.d;
                    ra8 ra8Var = ra8.a;
                    q630 b = ra8Var.b(aVar5, ty6Var);
                    float f2 = 48;
                    if (androidx.compose.runtime.b.d()) {
                        f = f2;
                        androidx.compose.runtime.b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
                    } else {
                        f = f2;
                    }
                    lg90 b2 = or.b(aVar4, 1971505535, R.drawable.vk_icon_dismiss_dark_24, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    IconButtonRippleType iconButtonRippleType = IconButtonRippleType.Bounded;
                    boolean J2 = aVar4.J(izsVar2);
                    Object x3 = aVar4.x();
                    if (J2 || x3 == c0012a) {
                        x3 = new to0(izsVar2, 5);
                        aVar4.R(x3);
                    }
                    nzu0.c((gzs) x3, b2, null, b, f, 0L, false, iconButtonRippleType, false, null, null, aVar4, 12607936, 1888);
                    q630 D2 = s200.D(txj0.z(txj0.f(ra8Var.b(aVar5, dt1.a.i), 1.0f), null, 3), 16);
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar4, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                    sy90 D3 = aVar4.D();
                    q630 c2 = qri.c(aVar4, D2);
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar6);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a2, cVar);
                    k9q0.w(aVar4, D3, eVar);
                    ur.d(hashCode2, aVar4, bVar2, aVar4, c2678a);
                    k9q0.w(aVar4, c2, dVar);
                    yqv0.c(trapViewState.b, null, wlb0.h(aVar4).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).C, aVar4, 0, 0, 8122);
                    f9t.e(txj0.h(aVar5, 8), aVar4, 6);
                    yqv0.c(trapViewState.c, null, wlb0.h(aVar4).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).X, aVar4, 0, 0, 8122);
                    f9t.e(txj0.h(aVar5, 24), aVar4, 6);
                    q630 h = txj0.h(txj0.f(aVar5, 1.0f), 44);
                    String str = trapViewState.e;
                    Integer num2 = trapViewState.f;
                    if (num2 == null) {
                        aVar4.K(-300133164);
                        aVar4.j();
                        lg90Var = null;
                    } else {
                        aVar4.K(-300133163);
                        lg90 a3 = pg90.a(num2.intValue(), 0, aVar4);
                        aVar4.j();
                        lg90Var = a3;
                    }
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J3 = aVar4.J(izsVar2);
                    Object x4 = aVar4.x();
                    if (J3 || x4 == c0012a) {
                        x4 = new m77(izsVar2, 6);
                        aVar4.R(x4);
                    }
                    bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, h, null, false, false, lg90Var, null, null, str, null, null, null, null, false, null, null, null, aVar4, 1073769904, 0, 0, 4189664);
                    if (kr.f(aVar4)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 10:
                VideoFlatActionViewHolder videoFlatActionViewHolder = (VideoFlatActionViewHolder) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1929307502, intValue5, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoFlatActionViewHolder.createView.<anonymous>.<anonymous> (VideoFlatActionViewHolder.kt:79)");
                    }
                    UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) ((zak0) videoFlatActionViewHolder.e).getValue();
                    if (uIBlockActionOpenSection == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    Image image = uIBlockActionOpenSection.F;
                    rrv0.e(true, null, null, null, null, null, kai.c(2039227599, new hct(videoFlatActionViewHolder, composeView, uIBlockActionOpenSection, (image == null || (arrayList2 = image.b) == null) ? null : (ImageSize) j5g.a0(arrayList2), 1), aVar7), aVar7, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) obj4;
                m8t0 m8t0Var = (m8t0) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1868533408, intValue6, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreBottomSheetRedesign.Content.<anonymous> (VideoProfileMoreBottomSheetRedesign.kt:58)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-675090670, 6, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
                    }
                    WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                    te2 te2Var = yqx0.a.c(aVar8).f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    float d3 = ao8.h(te2Var, aVar8).d();
                    dt1.a.getClass();
                    aou0.f(true, gzsVar, null, dt1.a.d, (Float.floatToRawIntBits(-16) << 32) | (Float.floatToRawIntBits(d3 + 48) & 4294967295L), new gxb0(false, false, 30), null, kai.c(-584376982, new q3c(i3, m8t0Var, gzsVar), aVar8), aVar8, 100862982, 196);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ iq8(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
