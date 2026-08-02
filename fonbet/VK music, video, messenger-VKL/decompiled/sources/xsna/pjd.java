package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.grid.skeleton.Skeleton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.shortvideo.ChallengeHeader;
import com.vk.dto.shortvideo.ChallengeStyle;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.e3m;
import xsna.tlo0;
import xsna.y2p0;

/* compiled from: ClipsBaseCommonToolbar.kt */
/* loaded from: classes17.dex */
public abstract class pjd extends sjd {
    public final dg9 o;
    public final View p;
    public final FrameLayout q;
    public final VkRichCell r;
    public final y2p0 s;

    /* compiled from: ClipsBaseCommonToolbar.kt */
    public static final class a implements VkCell.f {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GridImageInfoParams(placeHolderIconRes=");
            sb.append(this.a);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsBaseCommonToolbar.kt */
    public static final class b implements VkCell.d {
        public final Context a;
        public final VkPicture b;

        public b(Context context) {
            this.a = context;
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setId(R.id.clips_grid_header_image);
            vkPicture.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            this.b = vkPicture;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof a) {
                a aVar = (a) fVar;
                int i = aVar.a;
                e3m.a aVar2 = e3m.a;
                Context context = this.a;
                Drawable a = m33.a(i, context);
                if (a != null) {
                    a.setTint(e3m.f(R.attr.vk_ui_icon_accent_themed, context));
                } else {
                    a = null;
                }
                hny hnyVar = new hny(context);
                hnyVar.b(a);
                VkPicture vkPicture = this.b;
                vkPicture.setPlaceholderImage(hnyVar);
                vkPicture.o0(aVar.b, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: ClipsBaseCommonToolbar.kt */
    public static final class c implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    public pjd(fee feeVar, View view, ree reeVar) {
        super(feeVar, view, reeVar);
        this.o = new dg9(feeVar, this, view);
        View findViewById = view.findViewById(R.id.clips_common_header);
        this.p = findViewById;
        Skeleton skeleton = Skeleton.HEADER_ANOTHER;
        ViewGroup viewGroup = this.g;
        boolean z = reeVar.a;
        FrameLayout c2 = skeleton.c(viewGroup);
        skeleton.a(c2);
        if (z) {
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = 0;
                c2.setLayoutParams(marginLayoutParams);
            }
        }
        viewGroup.addView(c2, 1);
        this.q = c2;
        VkRichCell vkRichCell = (VkRichCell) view.findViewById(R.id.grid_header_info_block);
        vkRichCell.setLeftMainPictureController(new c());
        this.r = vkRichCell;
        this.s = new y2p0(feeVar, this.d, false);
        bwt0.d(findViewById, sjd.n, true, false);
    }

    @Override // xsna.d3p0
    public void b(a3p0 a3p0Var) {
        bwt0.d(this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, false);
        l().setVisibility(8);
        k().setVisibility(0);
    }

    @Override // xsna.d3p0
    public dg9 c() {
        return this.o;
    }

    @Override // xsna.sjd, xsna.d3p0
    public final void e() {
        super.e();
        y2p0 y2p0Var = this.s;
        y2p0Var.getClass();
        y2p0Var.a(Collections.singleton(y2p0.a.c.a));
    }

    @Override // xsna.d3p0
    public final boolean f() {
        return false;
    }

    @Override // xsna.d3p0
    public final abe0 i() {
        return null;
    }

    @Override // xsna.sjd
    public final View k() {
        return this.p;
    }

    @Override // xsna.sjd
    public final FrameLayout l() {
        return this.q;
    }

    public final void m(ClipsChallenge clipsChallenge) {
        ChallengeStyle challengeStyle;
        ChallengeHeader challengeHeader;
        Integer num;
        tlo0 tlo0Var;
        CharSequence a2;
        if (clipsChallenge == null || (challengeStyle = clipsChallenge.m) == null || (challengeHeader = challengeStyle.f) == null || (num = challengeHeader.b) == null) {
            return;
        }
        int intValue = num.intValue();
        VkRichCell vkRichCell = this.r;
        pgv0 middle = vkRichCell.getMiddle();
        if (middle != null) {
            vgv0 vgv0Var = middle.a;
            if (vgv0Var != null && (tlo0Var = vgv0Var.a) != null && (a2 = tlo0Var.a(this.h)) != null) {
                tlo0.a aVar = tlo0.Companion;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(a2);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue), 0, a2.length(), 33);
                SpannedString spannedString = new SpannedString(spannableStringBuilder);
                aVar.getClass();
                middle = pgv0.a(middle, vgv0.a(vgv0Var, new tlo0.h(spannedString), 0, 30), null, null, null, null, 510);
            }
        } else {
            middle = null;
        }
        vkRichCell.setMiddle(middle);
    }

    public final void n(a aVar) {
        this.r.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(aVar, VkCell.Left.Main.Size.Large)));
    }

    public final void o(ClipGridParams.Data data) {
        y2p0 y2p0Var = this.s;
        if (data != null) {
            y2p0Var.b(data);
        } else {
            y2p0Var.getClass();
            y2p0Var.a(Collections.singleton(y2p0.a.c.a));
        }
    }

    @Override // xsna.d3p0
    public final void onDestroyView() {
        c().f.dispose();
    }

    @Override // xsna.d3p0
    public void g(ClipGridParams.Data data) {
    }
}
