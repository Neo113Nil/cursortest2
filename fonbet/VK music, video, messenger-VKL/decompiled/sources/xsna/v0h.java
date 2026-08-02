package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.profile.community.impl.ui.item.header.model.CommunityDescriptionItemModel;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import xsna.ar20;
import xsna.m8v0;
import xsna.q630;
import xsna.v0h;
import xsna.zq20;

/* compiled from: CommunityDescriptionItem.kt */
/* loaded from: classes5.dex */
public final class v0h extends we6 {
    public final CommunityDescriptionItemModel g;
    public final sdz h;
    public final z4f i;
    public final c5f j;
    public final r3h k;
    public final int l = NetError.ERR_CERT_AUTHORITY_INVALID;

    /* compiled from: CommunityDescriptionItem.kt */
    public static final class a extends vif0<v0h> {
        public Rect n;
        public boolean o;

        /* compiled from: CommunityDescriptionItem.kt */
        /* renamed from: xsna.v0h$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3862a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CommunityDescriptionItemModel.SectionsTooltip.values().length];
                try {
                    iArr[CommunityDescriptionItemModel.SectionsTooltip.Editor.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CommunityDescriptionItemModel.SectionsTooltip.User.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // xsna.vif0
        public final void i6(v0h v0hVar) {
            int i;
            final v0h v0hVar2 = v0hVar;
            ucp ucpVar = ucp.a;
            sdz sdzVar = v0hVar2.h;
            CommunityDescriptionItemModel communityDescriptionItemModel = v0hVar2.g;
            String str = communityDescriptionItemModel.b;
            if (str == null) {
                str = "";
            }
            final CharSequence i2 = ucp.i(sdzVar.d(brm0.y(cqm0.d(str), "\n", " "), new LinksParserData(0, (Bundle) null, 0, R.attr.vk_ui_text_accent, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16375)));
            final String str2 = communityDescriptionItemModel.d;
            final ComposeView composeView = (ComposeView) this.itemView;
            composeView.setContent(new jai(843141418, new wzs() { // from class: xsna.t0h
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(843141418, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityDescriptionItem.CommunityDescriptionViewHolder.bindRedesignDescription.<anonymous>.<anonymous> (CommunityDescriptionItem.kt:96)");
                        }
                        final CharSequence charSequence = i2;
                        final ComposeView composeView2 = composeView;
                        final String str3 = str2;
                        final v0h v0hVar3 = v0hVar2;
                        final v0h.a aVar2 = this;
                        rrv0.d(null, null, null, null, kai.c(-1467301979, new wzs() { // from class: xsna.u0h
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                String a;
                                String concat;
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1467301979, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityDescriptionItem.CommunityDescriptionViewHolder.bindRedesignDescription.<anonymous>.<anonymous>.<anonymous> (CommunityDescriptionItem.kt:97)");
                                    }
                                    CharSequence charSequence2 = charSequence;
                                    int length = charSequence2.length();
                                    ComposeView composeView3 = composeView2;
                                    String str4 = str3;
                                    v0h v0hVar4 = v0hVar3;
                                    v0h.a aVar4 = aVar2;
                                    Object obj5 = a.C0011a.a;
                                    if (length == 0) {
                                        aVar3.K(1784052057);
                                        String string = composeView3.getContext().getString(R.string.community_description_about);
                                        MiniInfoCell$Mode miniInfoCell$Mode = MiniInfoCell$Mode.BaseAccent;
                                        if (str4 != null && (concat = string.concat(str4)) != null) {
                                            string = concat;
                                        }
                                        Object x = aVar3.x();
                                        if (x == obj5) {
                                            x = new db(26);
                                            aVar3.R(x);
                                        }
                                        ar20 a2 = ar20.a.a(string, false, false, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar3, 196608, 14);
                                        aVar4.n = xa4.K((zhf0) ((zak0) a2.f).getValue());
                                        zq20 a3 = zq20.a.a(pg90.a(R.drawable.vk_icon_info_circle_outline_20, 0, aVar3), null, null, aVar3, 24584, 14);
                                        z4f z4fVar = v0hVar4.i;
                                        b4v0.a(a2, miniInfoCell$Mode, null, a3, null, z4fVar, z4fVar, aVar3, 48, 20);
                                        aVar3.j();
                                    } else {
                                        aVar3.K(1785342680);
                                        String N = d370.N(R.string.vk_expandable_linked_text_expand, 0, aVar3);
                                        q630 E = s200.E(ojc.c(q630.a.a, false, null, null, v0hVar4.i, 15), 16, 2);
                                        Object x2 = aVar3.x();
                                        if (x2 == obj5) {
                                            x2 = new ot(17);
                                            aVar3.R(x2);
                                        }
                                        q630 b = com.vk.core.compose.component.semantics.b.b(E, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3));
                                        boolean y = aVar3.y(composeView3) | aVar3.y(aVar4);
                                        Object x3 = aVar3.x();
                                        if (y || x3 == obj5) {
                                            x3 = new hl1(12, composeView3, aVar4);
                                            aVar3.R(x3);
                                        }
                                        us2 d = ws2.d(charSequence2, (izs) x3);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        long j = ylu0Var.getText().a;
                                        String str5 = (str4 == null || (a = fo8.a(N, str4)) == null) ? N : a;
                                        z4f z4fVar2 = v0hVar4.i;
                                        boolean y2 = aVar3.y(aVar4);
                                        Object x4 = aVar3.x();
                                        if (y2 || x4 == obj5) {
                                            x4 = new mmf(aVar4, 5);
                                            aVar3.R(x4);
                                        }
                                        psu0.b(d, z4fVar2, b, j, null, null, 0L, 0, 0, str5, (izs) x4, aVar3, 0, 496);
                                        aVar3.j();
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar), aVar, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar.h();
                    }
                    return s3q0.a;
                }
            }, true));
            final View view = this.itemView;
            CommunityDescriptionItemModel.SectionsTooltip sectionsTooltip = communityDescriptionItemModel.e;
            if (sectionsTooltip == null || this.o) {
                return;
            }
            String str3 = communityDescriptionItemModel.b;
            boolean z = str3 == null || str3.length() == 0;
            int i3 = C3862a.$EnumSwitchMapping$0[sectionsTooltip.ordinal()];
            if (i3 == 1) {
                i = R.string.community_sections_onboarding_editor_tooltip;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.community_sections_onboarding_tooltip;
            }
            VkTooltip$MarkerSize vkTooltip$MarkerSize = z ? VkTooltip$MarkerSize.Size72 : VkTooltip$MarkerSize.Size64;
            VkTooltip$MarkerStyle vkTooltip$MarkerStyle = z ? VkTooltip$MarkerStyle.Style6 : VkTooltip$MarkerStyle.Style1;
            final boolean z2 = z;
            final int i4 = i;
            final VkTooltip$MarkerSize vkTooltip$MarkerSize2 = vkTooltip$MarkerSize;
            final VkTooltip$MarkerStyle vkTooltip$MarkerStyle2 = vkTooltip$MarkerStyle;
            bwt0.n(view, new izs() { // from class: xsna.s0h
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
                
                    if (r5 == null) goto L16;
                 */
                @Override // xsna.izs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition;
                    int i5 = m8v0.M;
                    View view2 = view;
                    String string = view2.getContext().getString(i4);
                    v0h.a aVar = this;
                    com.vk.movika.sdk.base.logic.processor.h hVar = new com.vk.movika.sdk.base.logic.processor.h(aVar, 23);
                    VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
                    if (z2) {
                        vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.Bottom;
                    } else {
                        Rect rect = aVar.n;
                        if (rect != null) {
                            vkTooltip$BalloonPosition = rect.centerX() < view2.getWidth() / 3 ? VkTooltip$BalloonPosition.BottomRight : rect.centerX() < (view2.getWidth() * 2) / 3 ? VkTooltip$BalloonPosition.Bottom : VkTooltip$BalloonPosition.BottomLeft;
                        }
                        vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.Bottom;
                    }
                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition2 = vkTooltip$BalloonPosition;
                    VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                    e60 e60Var = new e60(19);
                    v0h v0hVar3 = v0hVar2;
                    m8v0.a.a(view2, string, hVar, vkTooltip$MarkerStyle2, vkTooltip$MarkerSize2, vkOnboarding$TintColor, vkTooltip$BalloonPosition2, vkTooltip$BalloonTilt, e60Var, null, null, null, new h6g(v0hVar3, 2), new p4f(v0hVar3, 2), null, 0, false, null, null, false, null, false, 16764416);
                    return s3q0.a;
                }
            });
            this.o = true;
        }
    }

    public v0h(CommunityDescriptionItemModel communityDescriptionItemModel, sdz sdzVar, z4f z4fVar, c5f c5fVar, r3h r3hVar) {
        this.g = communityDescriptionItemModel;
        this.h = sdzVar;
        this.i = z4fVar;
        this.j = c5fVar;
        this.k = r3hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, composeView.getContext()));
        return new a(composeView);
    }

    @Override // xsna.we6
    public final int h() {
        return this.l;
    }
}
