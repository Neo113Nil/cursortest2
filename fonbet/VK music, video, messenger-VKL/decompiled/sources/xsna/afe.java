package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.impl.grid.toolbar.common.trends.TrendsHeaderCellStyle;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.shortvideo.ChallengeColor;
import com.vk.dto.shortvideo.ChallengeHeader;
import com.vk.dto.shortvideo.ChallengeStyle;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a3p0;
import xsna.ngv0;
import xsna.pjd;
import xsna.tlo0;

/* compiled from: ClipsHashTagToolbar.kt */
/* loaded from: classes17.dex */
public final class afe extends pjd {
    public final View A;
    public final VkCell B;
    public final VkMiniInfoCell C;
    public final View D;
    public final aqp0 E;
    public final zpp0 F;
    public final c1u0<VkBanner> G;
    public a3p0.a H;
    public ClipGridParams.Data.Hashtag I;
    public final fce t;
    public final Object u;
    public final mx4 v;
    public final sce w;
    public final Object x;
    public final View y;
    public final View z;

    /* compiled from: ClipsHashTagToolbar.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        /* compiled from: ClipsHashTagToolbar.kt */
        /* renamed from: xsna.afe$a$a, reason: collision with other inner class name */
        public static final class C2539a implements VkCell.f {
            public final String a;

            public C2539a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2539a) && epx.f(this.a, ((C2539a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
            }
        }

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, bwt0.t(context)));
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            C2539a c2539a = fVar instanceof C2539a ? (C2539a) fVar : null;
            if (c2539a != null) {
                this.a.setContent(new c.d(c2539a.a, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    public afe(fee feeVar, View view, ree reeVar, fce fceVar, Lazy lazy, mx4 mx4Var) {
        super(feeVar, view, reeVar);
        this.t = fceVar;
        this.u = lazy;
        this.v = mx4Var;
        this.w = new sce();
        this.x = msy.a(LazyThreadSafetyMode.NONE, new eb(this, 20));
        View findViewById = view.findViewById(R.id.clips_grid_trends_background);
        this.y = findViewById;
        View findViewById2 = view.findViewById(R.id.clips_grid_header_cell_separator);
        findViewById2.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary_alpha, findViewById2.getContext()));
        this.z = findViewById2;
        View findViewById3 = view.findViewById(R.id.clips_grid_header_author_separator);
        findViewById3.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_primary_alpha, findViewById3.getContext()));
        this.A = findViewById3;
        VkCell vkCell = (VkCell) view.findViewById(R.id.clips_grid_header_author_cell);
        vkCell.setLeftMainAvatarController(new bfe());
        this.B = vkCell;
        VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) view.findViewById(R.id.clip_grid_challenge_more_info_btn);
        vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.MoreInfo);
        vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_info_circle_outline_28), null, 6));
        vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(tq.h(tlo0.Companion, R.string.clips_grid_challenge_details), false, false, false, false, null, 62));
        vkMiniInfoCell.setDecorator(new cfe(true));
        this.C = vkMiniInfoCell;
        this.D = view.findViewById(R.id.clips_common_header);
        aqp0 aqp0Var = new aqp0(sjd.n, new e4(this, 17));
        this.E = aqp0Var;
        this.F = new zpp0(findViewById, aqp0Var, new il1(this, 22));
        this.G = new c1u0<>(R.id.clips_grid_trends_banner_stub, R.layout.clips_grid_trends_banner_layout, view, new a8(this, 29));
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.clips_grid_trends_banner_stub);
        dhr0 dhr0Var = dhr0.a;
        Context context = viewStub.getContext();
        dhr0Var.getClass();
        viewStub.setLayoutInflater(LayoutInflater.from(dhr0.t(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03db  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pjd, xsna.d3p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a3p0 a3p0Var) {
        ColorDrawable colorDrawable;
        String str;
        boolean z;
        boolean z2;
        String str2;
        NotificationImage notificationImage;
        ChallengeStyle challengeStyle;
        ChallengeHeader challengeHeader;
        ugv0 ugv0Var;
        String str3;
        String str4;
        ChallengeStyle challengeStyle2;
        ChallengeHeader challengeHeader2;
        Iterable iterable;
        ChallengeStyle challengeStyle3;
        ChallengeHeader challengeHeader3;
        if (a3p0Var instanceof a3p0.a) {
            a3p0.a aVar = (a3p0.a) a3p0Var;
            ClipGridParams.Data data = aVar.a;
            if (data instanceof ClipGridParams.Data.Hashtag) {
                ClipsChallenge clipsChallenge = aVar.d;
                String str5 = ((ClipGridParams.Data.Hashtag) data).b;
                ChallengeColor challengeColor = (clipsChallenge == null || (challengeStyle3 = clipsChallenge.m) == null || (challengeHeader3 = challengeStyle3.f) == null) ? null : challengeHeader3.c;
                mx4 mx4Var = this.v;
                View view = this.f;
                View view2 = this.D;
                View view3 = this.z;
                VkTopBar vkTopBar = this.d;
                NonBouncedAppBarLayout.d dVar = this.F;
                NonBouncedAppBarLayout nonBouncedAppBarLayout = this.e;
                this.t.getClass();
                if (challengeColor instanceof ChallengeColor.Gradient) {
                    int[] iArr = ((ChallengeColor.Gradient) challengeColor).b;
                    int length = iArr.length;
                    if (length != 0) {
                        if (length != 1) {
                            int K = rl3.K(iArr);
                            int length2 = iArr.length;
                            ArrayList arrayList = new ArrayList(length2);
                            int i = 0;
                            while (i < length2) {
                                i = tv4.a(arrayList, K, i, 1);
                                length2 = length2;
                            }
                            int length3 = iArr.length - 1;
                            if (length3 < 0) {
                                length3 = 0;
                            }
                            if (length3 < 0) {
                                throw new IllegalArgumentException(tgw.b(length3, "Requested element count ", " is less than zero.").toString());
                            }
                            if (length3 == 0) {
                                iterable = EmptyList.b;
                            } else {
                                int length4 = iArr.length;
                                if (length3 >= length4) {
                                    iterable = rl3.s0(iArr);
                                } else if (length3 == 1) {
                                    iterable = Collections.singletonList(Integer.valueOf(iArr[length4 - 1]));
                                } else {
                                    ArrayList arrayList2 = new ArrayList(length3);
                                    int i2 = length4 - length3;
                                    while (i2 < length4) {
                                        i2 = tv4.a(arrayList2, iArr[i2], i2, 1);
                                        length4 = length4;
                                        iArr = iArr;
                                    }
                                    iterable = arrayList2;
                                }
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, j5g.N0(j5g.u0(iterable, arrayList)));
                            gradientDrawable.setShape(0);
                            gradientDrawable.setGradientType(0);
                            colorDrawable = gradientDrawable;
                        } else {
                            colorDrawable = new ColorDrawable(rl3.K(iArr));
                        }
                    }
                    colorDrawable = null;
                } else {
                    if (challengeColor instanceof ChallengeColor.Solid) {
                        colorDrawable = new ColorDrawable(((ChallengeColor.Solid) challengeColor).b);
                    }
                    colorDrawable = null;
                }
                View view4 = this.y;
                bwt0.p0(view4, colorDrawable != null);
                view4.setBackground(colorDrawable);
                view4.setClipToOutline(true);
                view4.setOutlineProvider(this.E);
                vkTopBar.setInitialMode(colorDrawable != null ? com.vk.core.view.components.topbar.d.a : VkTopBar.j.a.a);
                if (colorDrawable != null) {
                    bwt0.p0(view3, true);
                    view2.setBackground(null);
                    view.setBackground(null);
                    vkTopBar.setInitialMode(com.vk.core.view.components.topbar.d.a);
                    ViewGroup.LayoutParams layoutParams = nonBouncedAppBarLayout.getLayoutParams();
                    CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                    CoordinatorLayout.c cVar = fVar != null ? fVar.a : null;
                    NonBouncedAppBarLayout.Behavior behavior = cVar instanceof NonBouncedAppBarLayout.Behavior ? (NonBouncedAppBarLayout.Behavior) cVar : null;
                    dVar.a(nonBouncedAppBarLayout, behavior != null ? behavior.D() : 0);
                    nonBouncedAppBarLayout.a(dVar);
                    mx4Var.invoke(Boolean.TRUE);
                } else {
                    bwt0.p0(view3, false);
                    int f = e3m.f(R.attr.vk_ui_background_content, this.h);
                    view2.setBackgroundColor(f);
                    view.setBackgroundColor(f);
                    vkTopBar.setInitialMode(VkTopBar.j.a.a);
                    ArrayList arrayList3 = nonBouncedAppBarLayout.h;
                    if (arrayList3 != null && dVar != null) {
                        arrayList3.remove(dVar);
                    }
                    dVar.a(nonBouncedAppBarLayout, 0);
                    mx4Var.invoke(Boolean.FALSE);
                }
                ClipGridParams.Data.Hashtag hashtag = (ClipGridParams.Data.Hashtag) aVar.a;
                String str6 = hashtag.b;
                if (hashtag.d) {
                    TrendsHeaderCellStyle.Companion.getClass();
                    TrendsHeaderCellStyle trendsHeaderCellStyle = ((clipsChallenge == null || (challengeStyle2 = clipsChallenge.m) == null || (challengeHeader2 = challengeStyle2.f) == null) ? null : challengeHeader2.c) != null ? TrendsHeaderCellStyle.COLORFUL : TrendsHeaderCellStyle.DEFAULT;
                    VkRichCell vkRichCell = this.r;
                    SpannableStringBuilder r = r(trendsHeaderCellStyle.i().a, str6);
                    tlo0.Companion.getClass();
                    tlo0.h hVar = new tlo0.h(r);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    trendsHeaderCellStyle.i().getClass();
                    vgv0 vgv0Var = new vgv0(hVar, (ngv0.a) null, (ngv0) null, 1, 6);
                    if (clipsChallenge == null || (str3 = clipsChallenge.b) == null) {
                        ugv0Var = null;
                    } else {
                        sdz a2 = ((BridgeComponent) this.u.getValue()).p().a();
                        SpannableStringBuilder r2 = r(trendsHeaderCellStyle.h().a, drm0.p0(str3).toString());
                        ucp ucpVar = ucp.a;
                        CharSequence i3 = ucp.i(r2);
                        int i4 = trendsHeaderCellStyle.h().a;
                        int i5 = trendsHeaderCellStyle.h().a;
                        ClipCameraParams clipCameraParams = clipsChallenge.d;
                        String str7 = (clipCameraParams == null || (str4 = clipCameraParams.b) == null) ? str6 : str4;
                        StringBuilder sb = new StringBuilder();
                        sb.append(((BridgeComponent) this.u.getValue()).p().d());
                        sb.append("://");
                        tlo0.h hVar2 = new tlo0.h(a2.d(i3, new LinksParserData(779, (Bundle) null, 0, i4, str7, i5s.a(sb, a0a.d, "/clips/hashtag/"), 0, i5, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16198)));
                        trendsHeaderCellStyle.h().getClass();
                        ugv0Var = new ugv0(hVar2, (ngv0.a) null, (ngv0.a) null, 3, (fy0) null, 38);
                    }
                    vkRichCell.setMiddle(new pgv0(vgv0Var, ugv0Var, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
                } else {
                    VkRichCell vkRichCell2 = this.r;
                    tlo0.h d = oq.d(tlo0.Companion, str6);
                    TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                    vkRichCell2.setMiddle(new pgv0(new vgv0(d, (ngv0.a) null, (ngv0) null, 2, 6), null, null, null, null, null, 510));
                }
                ClipsGridHeaderEntry.Author a3 = clipsChallenge != null ? ClipsGridHeaderEntry.Author.a.a(clipsChallenge.h, clipsChallenge.i, ClipsGridHeaderEntry.Author.ContentType.CHALLENGE) : null;
                ClipGridParams.Data.Hashtag hashtag2 = (ClipGridParams.Data.Hashtag) aVar.a;
                VkMiniInfoCell vkMiniInfoCell = this.C;
                if (clipsChallenge != null) {
                    bwt0.p0(vkMiniInfoCell, (hashtag2.d && !clipsChallenge.l.isEmpty()) || !(cqm0.a(clipsChallenge.k) == null || cqm0.a(clipsChallenge.j) == null));
                    ViewGroup.LayoutParams layoutParams2 = vkMiniInfoCell.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        layoutParams3.bottomMargin = a3 == null ? iah0.a(8) : 0;
                    } else {
                        layoutParams3 = null;
                    }
                    vkMiniInfoCell.setLayoutParams(layoutParams3);
                    vkMiniInfoCell.setOnClickListener(new zee(this, hashtag2, clipsChallenge, 0));
                }
                ClipGridParams.Data.Hashtag hashtag3 = (ClipGridParams.Data.Hashtag) aVar.a;
                View view5 = this.A;
                VkCell vkCell = this.B;
                if (!hashtag3.d) {
                    str = null;
                    z = false;
                } else {
                    if (a3 != null) {
                        bwt0.p0(view5, true);
                        bwt0.p0(vkCell, true);
                        TrendsHeaderCellStyle.Companion.getClass();
                        TrendsHeaderCellStyle trendsHeaderCellStyle2 = ((clipsChallenge == null || (challengeStyle = clipsChallenge.m) == null || (challengeHeader = challengeStyle.f) == null) ? null : challengeHeader.c) != null ? TrendsHeaderCellStyle.COLORFUL : TrendsHeaderCellStyle.DEFAULT;
                        vkCell.setOnClickListener(new yee(this, vkCell, a3, 0));
                        vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new a.C2539a(a3.c), VkCell.Left.Main.Size.Small)));
                        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
                        tlo0.a aVar3 = tlo0.Companion;
                        SpannableStringBuilder r3 = r(trendsHeaderCellStyle2.i().a, a3.b);
                        aVar3.getClass();
                        tlo0.h hVar3 = new tlo0.h(r3);
                        TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.MARQUEE;
                        str = null;
                        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(hVar3, 1, truncateAt3, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(r(trendsHeaderCellStyle2.h().a, vkCell.getContext().getString(R.string.clips_grid_hashtag_owner))), (gzs) null, 1, truncateAt3, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
                        p(a3);
                        z2 = ((ClipGridParams.Data.Hashtag) aVar.a).d;
                        if (z2) {
                            this.j = str5;
                            this.i = str5;
                        } else {
                            String string = this.h.getResources().getString(R.string.clip_grid_toolbar_title_trend);
                            this.j = string;
                            this.i = string;
                        }
                        int i6 = !z2 ? R.drawable.vk_icon_flash_outline_28 : R.drawable.vk_icon_hashtag_outline_32;
                        if (clipsChallenge != null || (notificationImage = clipsChallenge.e) == null) {
                            str2 = str;
                        } else {
                            int a4 = e3m.a(R.dimen.clips_grid_header_icon_size, this.b.getContext());
                            String Cb = notificationImage.Cb(a4);
                            str2 = Cb == null ? notificationImage.zb(a4, a4) : Cb;
                        }
                        n(new pjd.a(i6, str2));
                        m(clipsChallenge);
                        o(aVar.a);
                        q(aVar.e);
                        this.H = aVar;
                        this.I = (ClipGridParams.Data.Hashtag) aVar.a;
                        super.b(a3p0Var);
                    }
                    z = false;
                    str = null;
                }
                bwt0.p0(view5, z);
                bwt0.p0(vkCell, z);
                z2 = ((ClipGridParams.Data.Hashtag) aVar.a).d;
                if (z2) {
                }
                if (!z2) {
                }
                if (clipsChallenge != null) {
                }
                str2 = str;
                n(new pjd.a(i6, str2));
                m(clipsChallenge);
                o(aVar.a);
                q(aVar.e);
                this.H = aVar;
                this.I = (ClipGridParams.Data.Hashtag) aVar.a;
                super.b(a3p0Var);
            }
        }
    }

    @Override // xsna.pjd, xsna.d3p0
    public final void g(ClipGridParams.Data data) {
        if (data instanceof ClipGridParams.Data.Hashtag) {
            q(null);
            this.I = (ClipGridParams.Data.Hashtag) data;
        }
    }

    public final void p(ClipsGridHeaderEntry.Author author) {
        VkCell vkCell = this.B;
        if (author == null) {
            vkCell.setRight((VkCell.Right.d) null);
        } else {
            vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.b(tq.h(tlo0.Companion, author.d ? R.string.clips_subscribed : R.string.clips_subscribe), new cy0(5, this, author), VkButton.Appearance.Neutral, VkButton.Mode.Primary, VkButton.Size.Small, null, null, null, 2016), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        }
    }

    public final void q(a3p0.a.C2519a c2519a) {
        ImageSize Cb;
        String str;
        vlw vlwVar = null;
        if (c2519a != null && (Cb = c2519a.f.Cb(iah0.z(this.h), true, false)) != null && (str = Cb.d.d) != null) {
            vlwVar = new vlw(str, null);
        }
        c1u0<VkBanner> c1u0Var = this.G;
        if (vlwVar == null) {
            if (c1u0Var.b()) {
                bwt0.p0(c1u0Var.a(), false);
            }
        } else {
            if (c1u0Var.b()) {
                bwt0.p0(c1u0Var.a(), true);
                return;
            }
            VkBanner vkBanner = (VkBanner) c1u0Var.a();
            bwt0.p0(vkBanner, true);
            vkBanner.setBackgroundImage(vlwVar);
            jjc.g(vkBanner, new uf1(14, this, c2519a));
            vkBanner.setMiddle(new VkBanner.e(c2519a.b, c2519a.c, null, new VkBanner.c(c2519a.d, new fqd(1, this, c2519a), VkButton.Mode.Primary, VkButton.Appearance.Overlay, VkButton.Size.Small, null, null, 992), null, null, 116));
        }
    }

    public final SpannableStringBuilder r(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(i, this.h)), 0, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
