package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.SexyCell$Align;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.VkCellSkeleton$Middle$Size;
import com.vk.core.view.components.cell.d;
import com.vk.core.view.components.cell.slot.Slot;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.k1u0;
import xsna.phw;
import xsna.poa;
import xsna.q630;
import xsna.tlo0;
import xsna.ty6;
import xsna.v5v;
import xsna.voa;
import xsna.wkj;

/* compiled from: CellScreenContent.kt */
/* loaded from: classes18.dex */
public final class noa implements yah0 {
    public final wh50 A;
    public final wh50 B;
    public final wh50 C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final wh50 k;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final wh50 x;
    public final wh50 y;
    public final wh50 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CellScreenContent.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AVATAR;
        public static final a BUTTON;
        public static final a CAPTION;
        public static final a CHECKBOX;
        public static final a CHEVRON;
        public static final a COUNTER;
        public static final a ICON;
        public static final a ICON_COUNTER_CHEVRON;
        public static final a MORE;
        public static final a NONE;
        public static final a PICTURE;
        public static final a RADIO;
        public static final a SWITCH;

        static {
            a aVar = new a("NONE", 0);
            NONE = aVar;
            a aVar2 = new a(NativeAdContent.ViewTag.AD_ICON, 1);
            ICON = aVar2;
            a aVar3 = new a("AVATAR", 2);
            AVATAR = aVar3;
            a aVar4 = new a("PICTURE", 3);
            PICTURE = aVar4;
            a aVar5 = new a("CHEVRON", 4);
            CHEVRON = aVar5;
            a aVar6 = new a("BUTTON", 5);
            BUTTON = aVar6;
            a aVar7 = new a("COUNTER", 6);
            COUNTER = aVar7;
            a aVar8 = new a("CHECKBOX", 7);
            CHECKBOX = aVar8;
            a aVar9 = new a("SWITCH", 8);
            SWITCH = aVar9;
            a aVar10 = new a("RADIO", 9);
            RADIO = aVar10;
            a aVar11 = new a("MORE", 10);
            MORE = aVar11;
            a aVar12 = new a("CAPTION", 11);
            CAPTION = aVar12;
            a aVar13 = new a("ICON_COUNTER_CHEVRON", 12);
            ICON_COUNTER_CHEVRON = aVar13;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CellScreenContent.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b AVATAR;
        public static final b ICON;
        public static final b NONE;
        public static final b PICTURE;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b(NativeAdContent.ViewTag.AD_ICON, 1);
            ICON = bVar2;
            b bVar3 = new b("AVATAR", 2);
            AVATAR = bVar3;
            b bVar4 = new b("PICTURE", 3);
            PICTURE = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class c extends FrameLayout implements ziu0, too0 {
        public final c b;
        public final VkOnboardingHighlighter c;
        public final AppCompatTextView d;

        public c(Context context) {
            super(context);
            this.b = this;
            setClipChildren(false);
            VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) LayoutInflater.from(context).inflate(R.layout.cell_highlighted_title, (ViewGroup) null, false);
            this.c = vkOnboardingHighlighter;
            addView(vkOnboardingHighlighter);
            View findViewById = findViewById(R.id.text);
            ((AppCompatTextView) findViewById).setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
            this.d = (AppCompatTextView) findViewById;
        }

        @Override // xsna.too0
        public final void Ng() {
            this.d.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
        }

        @Override // xsna.ziu0
        public final AppCompatTextView a() {
            return this.d;
        }

        @Override // xsna.ziu0
        public final View getView() {
            return this.b;
        }

        @Override // xsna.ziu0
        public final void setText(CharSequence charSequence) {
            this.c.setText(charSequence);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class d implements aju0 {
        @Override // xsna.aju0
        public final ziu0 create(Context context) {
            return new c(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class e implements VkCell.f {
        public static final e a = new e();
    }

    /* compiled from: CellScreenContent.kt */
    public static final class f implements Cell$Middle.d {
        public final wh50 a = androidx.compose.runtime.k.b("This is a <u>hightlighted</u> title");

        @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
        public final void c(q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
            q630 q630Var2;
            int i2;
            androidx.compose.runtime.a M = aVar.M(398066100);
            if ((i & 6) == 0) {
                q630Var2 = q630Var;
                i2 = (M.J(q630Var2) ? 4 : 2) | i;
            } else {
                q630Var2 = q630Var;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(size.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(398066100, i2, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.HighlightedTitle.Content (CellScreenContent.kt:846)");
                }
                Object x = M.x();
                if (x == a.C0011a.a) {
                    bpn0 bpn0Var = v5v.c;
                    x = v5v.a.a((String) ((zak0) this.a).getValue());
                    M.R(x);
                }
                final v5v v5vVar = (v5v) x;
                d8v0.a(v5vVar.b, q630Var2, null, null, false, false, false, null, kai.c(485323376, new zzs() { // from class: xsna.ooa
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        izs izsVar = (izs) obj;
                        ((Boolean) obj2).getClass();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar2.y(izsVar) ? 4 : 2;
                        }
                        if (aVar2.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(485323376, intValue, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.HighlightedTitle.Content.<anonymous> (CellScreenContent.kt:853)");
                            }
                            Cell$Middle.d.b.a(v5v.this.a, null, null, 0, null, izsVar, aVar2, ((intValue << 18) & 3670016) | 12582912, 62).c(q630.a.a, size, aVar2, 6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i2 << 3) & 112) | 805306368, IronSourceError.ERROR_CODE_INIT_FAILED);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jo7(this, q630Var, size, i, 1);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CellScreenContent.kt */
    public static final class g {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final g NONE;
        public static final g TITLE_WITH_DESCRIPTION;
        public static final g TITLE_WITH_OVERTITLE;
        public static final g TITLE_WITH_SUBTITLES;
        public static final g TITLE_WITH_SUBTITLES_AND_BUTTONS;
        public static final g TITLE_WITH_SUBTITLES_AND_ICONS;
        public static final g TITLE_WITH_SUBTITLES_AND_META;

        static {
            g gVar = new g("NONE", 0);
            NONE = gVar;
            g gVar2 = new g("TITLE_WITH_SUBTITLES", 1);
            TITLE_WITH_SUBTITLES = gVar2;
            g gVar3 = new g("TITLE_WITH_OVERTITLE", 2);
            TITLE_WITH_OVERTITLE = gVar3;
            g gVar4 = new g("TITLE_WITH_DESCRIPTION", 3);
            TITLE_WITH_DESCRIPTION = gVar4;
            g gVar5 = new g("TITLE_WITH_SUBTITLES_AND_BUTTONS", 4);
            TITLE_WITH_SUBTITLES_AND_BUTTONS = gVar5;
            g gVar6 = new g("TITLE_WITH_SUBTITLES_AND_META", 5);
            TITLE_WITH_SUBTITLES_AND_META = gVar6;
            g gVar7 = new g("TITLE_WITH_SUBTITLES_AND_ICONS", 6);
            TITLE_WITH_SUBTITLES_AND_ICONS = gVar7;
            g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
            $VALUES = gVarArr;
            $ENTRIES = new asp(gVarArr);
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class h implements VkCell.d {
        public final Context a;
        public final VkAvatar b;

        public h(Context context) {
            this.a = context;
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setRound(true);
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.b = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            r rVar = fVar instanceof r ? (r) fVar : null;
            if (rVar != null) {
                this.b.setImageDrawable(m33.a(rVar.a, this.a));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class i implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new h(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class k implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new j(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class l implements VkCell.d {
        public final Context a;
        public final VKImageView b;

        public l(Context context) {
            this.a = context;
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setCornerRadius(hbh0.b(8, vKImageView.getContext()));
            vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.b = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            r rVar = fVar instanceof r ? (r) fVar : null;
            if (rVar != null) {
                this.b.setImageDrawable(m33.a(rVar.a, this.a));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class m implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new l(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class o implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new n(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class q implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new p(context);
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class r implements VkCell.f {
        public final int a;

        public r(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TestViewParams(drawableResId="), this.a, ')');
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class s implements VkCell.f {
    }

    /* compiled from: CellScreenContent.kt */
    public static final class t implements VkCell.f {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public noa() {
        Pair pair = new Pair("none", null);
        Pair pair2 = new Pair("text", new VkCell.Middle.d(oq.d(tlo0.Companion, "Subtitle"), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62));
        Object[] objArr = null == true ? 1 : 0;
        Pair pair3 = new Pair("text multiline", new VkCell.Middle.d((tlo0) new tlo0.h("This is a long long long text that for several lines to check how padding works"), (gzs) (null == true ? 1 : 0), 3, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 58));
        Pair pair4 = new Pair("before icon", new VkCell.Middle.d((tlo0) new tlo0.h("Subtitle"), (gzs) (null == true ? 1 : 0), 0, (TextUtils.TruncateAt) (null == true ? 1 : 0), new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_fire_12), null, 6), (VkCell.Middle.d.b.C0815b) null, 46));
        int i2 = 0;
        Pair pair5 = new Pair("after icon", new VkCell.Middle.d((tlo0) new tlo0.h("Subtitle"), (gzs) (null == true ? 1 : 0), i2, (TextUtils.TruncateAt) (null == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_fire_12), null, 6), 30));
        tlo0.h hVar = new tlo0.h("Subtitle");
        Pair pair6 = new Pair("two icons", new VkCell.Middle.d((tlo0) hVar, (gzs) (null == true ? 1 : 0), i2, (TextUtils.TruncateAt) (null == true ? 1 : 0), new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_fire_12), null, 6), new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_fire_12), null, 6), 14));
        tlo0.h hVar2 = new tlo0.h("This is a long long long title that should be truncated, This is a long long long title that should be truncated");
        VkCell.Middle.d.b.C0815b c0815b = new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_fire_12), null, 6);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        this.b = pn00.k(pair, pair2, pair3, pair4, pair5, pair6, new Pair("after icon long txt", new VkCell.Middle.d((tlo0) hVar2, (gzs) (null == true ? 1 : 0), 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, c0815b, 18)));
        this.c = pn00.k(new Pair("none", null), new Pair("text", new VkCell.Middle.c(new tlo0.h("Extra Subtitle"), null, 0, 14)));
        this.d = pn00.k(new Pair("Medium", VkCell.Middle.Size.Medium), new Pair("Large", VkCell.Middle.Size.Large));
        this.e = pn00.k(new Pair("Medium", VkCellSkeleton$Middle$Size.Medium), new Pair("Large", VkCellSkeleton$Middle$Size.Large));
        VkCell.Middle.e.b bVar = null;
        int i3 = 0;
        this.f = pn00.k(new Pair("none", null), new Pair("text", new VkCell.Middle.e((tlo0) new tlo0.h("Title"), 0, (TextUtils.TruncateAt) null, bVar, (VkCell.Middle.e.b) (null == true ? 1 : 0), 62)), new Pair("text multiline", new VkCell.Middle.e((tlo0) new tlo0.h("This is a long long long text that for several lines to check how padding works"), 3, (TextUtils.TruncateAt) (null == true ? 1 : 0), bVar, (VkCell.Middle.e.b) (null == true ? 1 : 0), 58)), new Pair("before icon", new VkCell.Middle.e((tlo0) new tlo0.h("Title"), 0, (TextUtils.TruncateAt) (null == true ? 1 : 0), (VkCell.Middle.e.b) new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), (VkCell.Middle.e.b) (null == true ? 1 : 0), 46)), new Pair("after icon", new VkCell.Middle.e((tlo0) new tlo0.h("Title"), 0, (TextUtils.TruncateAt) (null == true ? 1 : 0), (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), 30)), new Pair("after view", new VkCell.Middle.e((tlo0) new tlo0.h("Title"), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) (null == true ? 1 : 0), (VkCell.Middle.e.b) new VkCell.Middle.e.b.d(new t(), new Size(0, 0)), 30)), new Pair("after icon long txt", new VkCell.Middle.e(new tlo0.h("This is a long long long title that should be truncated"), 1, truncateAt, (VkCell.Middle.e.b) null, new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), 18)), new Pair("two icons", new VkCell.Middle.e(new tlo0.h("Title"), i3, null, new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), 14)), new Pair("three icons", new VkCell.Middle.e(new tlo0.h("Title"), 0, (TextUtils.TruncateAt) null, new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), new VkCell.Middle.e.b.c(new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_check_12), (k1u0) null, (tlo0.f) null, (Size) null, 14)), 14)), new Pair("four icons", new VkCell.Middle.e(new tlo0.h("Title"), 0, (TextUtils.TruncateAt) null, new VkCell.Middle.e.b.c(new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_stars_12), (k1u0) null, (tlo0.f) null, (Size) null, 14)), new VkCell.Middle.e.b.c(new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_fire_12), (k1u0) null, (tlo0.f) null, (Size) null, 14), new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_check_12), (k1u0) null, (tlo0.f) null, (Size) null, 14)), 14)));
        Pair pair7 = new Pair("none", null);
        VkCell.Left.a aVar = VkCell.Left.Companion;
        gko gkoVar = new gko(R.drawable.vk_icon_add_circle_outline_24);
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
        Pair pair8 = new Pair("icon", VkCell.Left.a.a(aVar, new VkCell.Left.Main.c(gkoVar, size, new k1u0.a(new x7g(R.attr.vk_ui_accent_red)), 8)));
        Pair pair9 = new Pair("custom", new VkCell.Left.b(new VkCell.Left.Main.e(new s(), new Size(iah0.a(128), iah0.a(64))), null));
        Pair pair10 = new Pair("avatar", new VkCell.Left.b(new VkCell.Left.Main.a(new r(R.drawable.ds_demo_image_2), size), null));
        Pair pair11 = new Pair("image small", new VkCell.Left.b(new VkCell.Left.Main.d(new r(R.drawable.ds_demo_image_1), size), null));
        r rVar = new r(R.drawable.ds_demo_image_1);
        VkCell.Left.Main.Size size2 = VkCell.Left.Main.Size.Medium;
        this.g = pn00.k(pair7, pair8, pair9, pair10, pair11, new Pair("image medium", new VkCell.Left.b(new VkCell.Left.Main.d(rVar, size2), null)), new Pair("image large", new VkCell.Left.b(new VkCell.Left.Main.d(new r(R.drawable.ds_demo_image_1), VkCell.Left.Main.Size.Large), null)), new Pair("extra close", new VkCell.Left.b(new VkCell.Left.Main.a(new r(R.drawable.ds_demo_image_2), size2), new VkCell.Left.c.b(null, null, 7))), new Pair("extra check", new VkCell.Left.b(new VkCell.Left.Main.a(new r(R.drawable.ds_demo_image_2), size2.j()), new VkCell.Left.c.a(6, (gzs) null, true))));
        Pair pair12 = new Pair("none", null);
        VkCellSkeleton$Left$Main.Size size3 = VkCellSkeleton$Left$Main.Size.Small;
        Pair pair13 = new Pair("icon", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.d(size3), null));
        Pair pair14 = new Pair("custom", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.b(128.0f, 64.0f), null));
        Pair pair15 = new Pair("avatar", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.a(size3), null));
        Pair pair16 = new Pair("image small", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.e(size3), null));
        VkCellSkeleton$Left$Main.Size size4 = VkCellSkeleton$Left$Main.Size.Medium;
        this.h = pn00.k(pair12, pair13, pair14, pair15, pair16, new Pair("image medium", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.e(size4), null)), new Pair("image large", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.e(VkCellSkeleton$Left$Main.Size.Large), null)), new Pair("extra close", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.a(size4), new d.b())), new Pair("extra check", new com.vk.core.view.components.cell.c(new VkCellSkeleton$Left$Main.a(size4), new d.b())));
        Pair pair17 = new Pair("none", null);
        VkCell.Right.c cVar = VkCell.Right.Companion;
        Pair pair18 = new Pair("icon", VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) null, false, (gzs) null, 60), null, null, 29));
        tlo0.h hVar3 = new tlo0.h("Button");
        VkButton.Mode mode = VkButton.Mode.Primary;
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        Pair pair19 = new Pair("button", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(hVar3, new nh0(2), appearance, mode, null, null, null, null, 2032), null, null, null, 30));
        tlo0.h hVar4 = new tlo0.h("Button");
        gko gkoVar2 = new gko(R.drawable.vk_icon_add_outline_28);
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_contrast_themed);
        Pair pair20 = new Pair("button with icon", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(hVar4, new f4(6), appearance, mode, null, new VkCell.Right.a.b.c(gkoVar2, valueOf, 2), null, null, 2000), null, null, null, 30));
        Pair pair21 = new Pair("button with trailing icon", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(new tlo0.h("Button"), new com.vk.movika.sdk.base.model.props.c(8), appearance, mode, null, null, null, new VkCell.Right.a.b.c(new gko(R.drawable.vk_icon_add_outline_28), valueOf, 2), 1776), null, null, null, 30));
        tlo0.h hVar5 = new tlo0.h("Detail");
        float f2 = 24;
        Map k2 = pn00.k(pair17, pair18, pair19, pair20, pair21, new Pair("detail", VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar5, hVar5), null, null, null, 30)), new Pair("counter", VkCell.Right.c.a(cVar, new VkCell.Right.a.d(123, VkCounter.CounterAppearance.Appearance.Accent, 4), null, null, null, 30)), new Pair("badge", VkCell.Right.c.a(cVar, new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent), null, null, null, 30)), new Pair("switch", VkCell.Right.c.a(cVar, new VkCell.Right.a.f(6, (gzs) null, true), null, null, null, 30)), new Pair("dropdown", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.c(new tlo0.h("Dropdown"), new com.vk.movika.sdk.base.model.props.d(9)), null, 27)), new Pair("check", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.a(6, null, true), null, 27)), new Pair("more", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.d((gzs) null, (tlo0.f) (null == true ? 1 : 0), 7), null, 27)), new Pair("view & more", VkCell.Right.c.a(cVar, null, new VkCell.Right.e.d(e.a, new Size(iah0.a(f2), iah0.a(f2))), new VkCell.Right.ExtraAction.d((gzs) null, (tlo0.f) (null == true ? 1 : 0), 7), null, 25)), new Pair("image", VkCell.Right.c.a(cVar, null, null, new VkCell.Right.ExtraAction.e(new r(R.drawable.ds_demo_image_1), Integer.valueOf(iah0.a(40))), null, 27)), new Pair("all", VkCell.Right.c.a(cVar, new VkCell.Right.a.b(new tlo0.h("Button"), new com.vk.movika.tools.controls.seekbar.n(10), appearance, mode, null, null, null, null, 2032), new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_outline_28), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) null, 62), new VkCell.Right.ExtraAction.d((gzs) null, (tlo0.f) (null == true ? 1 : 0), 7), null, 24)));
        this.i = k2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(new bpw(k2));
        Pair pair22 = new Pair("image", new VkCell.Right.ExtraAction.e(new r(R.drawable.ds_demo_image_1), Integer.valueOf(iah0.a(36))));
        tlo0.h hVar6 = new tlo0.h("Button");
        VkButton.Appearance appearance2 = VkButton.Appearance.Neutral;
        linkedHashMap.putAll(pn00.k(pair22, new Pair("button", new VkCell.Right.a.b(hVar6, new xsna.r(5), appearance2, mode, null, null, null, null, 2032)), new Pair("badge", new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Neutral)), new Pair("counter", new VkCell.Right.a.d(123, VkCounter.CounterAppearance.Appearance.Neutral, 4)), new Pair("all", VkCell.Right.d.a((VkCell.Right.d) k2.get("all"), new VkCell.Right.a.b(new tlo0.h("Button"), new gu0(4), appearance2, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), null, null, null, null, 30))));
        this.j = pn00.k(new Pair("none", null), new Pair("reorder", new VkCell.Right.f(null)), new Pair("chevron", new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7)));
        this.k = androidx.compose.runtime.k.b("text");
        this.l = androidx.compose.runtime.k.b("none");
        this.m = androidx.compose.runtime.k.b("none");
        this.n = androidx.compose.runtime.k.b("none");
        this.o = androidx.compose.runtime.k.b("none");
        this.p = androidx.compose.runtime.k.b("none");
        this.q = androidx.compose.runtime.k.b("Medium");
        this.r = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.s = pn00.k(new Pair("none", b.NONE), new Pair("icon", b.ICON), new Pair("avatar", b.AVATAR), new Pair("picture", b.PICTURE));
        this.t = pn00.k(new Pair("title + subtitles", g.TITLE_WITH_SUBTITLES), new Pair("title + overtitle", g.TITLE_WITH_OVERTITLE), new Pair("title + description", g.TITLE_WITH_DESCRIPTION), new Pair("title + subtitles + buttons", g.TITLE_WITH_SUBTITLES_AND_BUTTONS), new Pair("title + subtitles + meta", g.TITLE_WITH_SUBTITLES_AND_META), new Pair("title + subtitles + icons", g.TITLE_WITH_SUBTITLES_AND_ICONS));
        this.u = pn00.k(qz9.g("none", a.NONE), qz9.g("icon", a.ICON), qz9.g("avatar", a.AVATAR), qz9.g("picture", a.PICTURE), qz9.g("chevron", a.CHEVRON), qz9.g("button", a.BUTTON), qz9.g("counter", a.COUNTER), qz9.g("checkbox", a.CHECKBOX), qz9.g("switch", a.SWITCH), qz9.g("radio", a.RADIO), qz9.g("more", a.MORE), qz9.g("caption", a.CAPTION), qz9.g("icon + counter + chevron", a.ICON_COUNTER_CHEVRON));
        this.v = pn00.k(qz9.g("S", Slot.Size.S), qz9.g("M", Slot.Size.M), qz9.g("L", Slot.Size.L));
        this.w = pn00.k(qz9.g("Top", Slot.Align.Top), qz9.g("Middle", Slot.Align.Middle));
        this.x = androidx.compose.runtime.k.b("none");
        this.y = androidx.compose.runtime.k.b("title + subtitles");
        this.z = androidx.compose.runtime.k.b("none");
        this.A = androidx.compose.runtime.k.b("M");
        this.B = androidx.compose.runtime.k.b("Top");
        this.C = androidx.compose.runtime.k.b("40");
        this.D = pn00.k(qz9.g("40", 40), qz9.g("44", 44), qz9.g("48", 48), qz9.g("56", 56), qz9.g("64", 64));
        this.E = pn00.k(qz9.g("S", SexyCell$Size.Small), qz9.g("M", SexyCell$Size.Medium), qz9.g("L", SexyCell$Size.Large));
        this.F = pn00.k(qz9.g("Top", SexyCell$Align.Top), qz9.g("Middle", SexyCell$Align.Middle));
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        noa noaVar;
        lg90 q1;
        androidx.compose.runtime.a M = aVar.M(128745545);
        if ((i2 & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(x5Var) ? 256 : 128;
        }
        int i4 = i2 & 24576;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i3 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (73875 & i3) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(128745545, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.Content (CellScreenContent.kt:540)");
            }
            q630 f2 = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            if (((Boolean) ((zak0) this.r).getValue()).booleanValue()) {
                M.K(244759085);
                qzu0.a.getClass();
                q1 = qzu0.p1(M);
            } else {
                M.K(244759981);
                qzu0.a.getClass();
                q1 = qzu0.q1(M);
            }
            M.j();
            boolean z = (i3 & 458752) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zg(this, 13);
                M.R(x);
            }
            jjn0.a("Cell", gzsVar, x5Var, gzsVar2, null, d.b.a.C0757a.a(q1, null, (gzs) x, null, null, null, M, 12582920, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), M, ((i3 << 3) & 112) | 6 | (i3 & 896) | ((i3 << 6) & 7168), 16);
            q630 D2 = p490.D(aVar2, p490.x(M), 14);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            int i5 = (i3 >> 15) & 14;
            noaVar = this;
            noaVar.b(i5, M);
            noaVar.c(i5, M);
            M.K(1368999053);
            M.j();
            f9t.e(txj0.h(aVar2, 36), M, 6);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            noaVar = this;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            final noa noaVar2 = noaVar;
            s2.d = new wzs() { // from class: xsna.koa
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    noa.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1223275987);
        if ((i2 & 6) == 0) {
            i3 = (M.J(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1223275987, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.CellContent (CellScreenContent.kt:649)");
            }
            q630.a aVar2 = q630.a.a;
            q630 z = txj0.z(aVar2, null, 3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, z);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            djn0.a(true, false, M, 54, 2);
            int i4 = i3 & 14;
            d(i4, M);
            float f2 = 16;
            f9t.e(txj0.h(aVar2, f2), M, 6);
            djn0.a(false, true, M, 390, 1);
            g(i4, M);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            djn0.a(true, false, M, 54, 2);
            e(i4, M);
            f9t.e(txj0.h(aVar2, f2), M, 6);
            djn0.a(false, true, M, 390, 1);
            h(i4, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ny5(this, i2, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, java.util.Map] */
    public final void c(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1582553801);
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.J(this) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1582553801, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.CellSettings (CellScreenContent.kt:567)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.i, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630 f3 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, f3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 f4 = txj0.f(aVar2, 1.0f);
            a.g gVar = androidx.compose.foundation.layout.a.h;
            ty6.b bVar2 = dt1.a.k;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode3 = Long.hashCode(n34.n(M));
            int i5 = i3;
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, f4);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            tpg0 tpg0Var = tpg0.a;
            q630 b2 = tpg0Var.b(1.0f, aVar2, true);
            String j2 = j();
            int i6 = i5 & 14;
            boolean z = i6 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                i4 = i6;
                x = new com.vk.movika.sdk.base.observable.g(this, 13);
                M.R(x);
            } else {
                i4 = i6;
            }
            int i7 = i4;
            y9i0.a("Title", this.f, j2, (izs) x, b2, M, 6, 0);
            q630 b3 = tpg0Var.b(1.0f, aVar2, true);
            String i8 = i();
            boolean z2 = i7 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new vl1(this, 15);
                M.R(x2);
            }
            y9i0.a("Subtitle", this.b, i8, (izs) x2, b3, M, 6, 0);
            M.G();
            q630 f5 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c5 = qri.c(M, f5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            q630 b4 = tpg0Var.b(1.0f, aVar2, true);
            String str = (String) ((zak0) this.n).getValue();
            boolean z3 = i7 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new lb(this, 17);
                M.R(x3);
            }
            y9i0.a("Left", this.g, str, (izs) x3, b4, M, 6, 0);
            q630 b5 = tpg0Var.b(1.0f, aVar2, true);
            String str2 = (String) ((zak0) this.o).getValue();
            boolean z4 = i7 == 4;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new com.vk.movika.sdk.base.observable.k(this, 15);
                M.R(x4);
            }
            y9i0.a("Right", this.i, str2, (izs) x4, b5, M, 6, 0);
            M.G();
            q630 f6 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c6 = qri.c(M, f6);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c6, dVar);
            q630 b6 = tpg0Var.b(1.0f, aVar2, true);
            String str3 = (String) ((zak0) this.m).getValue();
            boolean z5 = i7 == 4;
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new mb(this, 16);
                M.R(x5);
            }
            y9i0.a("Extra Subtitle", this.c, str3, (izs) x5, b6, M, 6, 0);
            q630 b7 = tpg0Var.b(1.0f, aVar2, true);
            String str4 = (String) ((zak0) this.p).getValue();
            boolean z6 = i7 == 4;
            Object x6 = M.x();
            if (z6 || x6 == c0012a) {
                x6 = new com.vk.movika.sdk.base.observable.m(this, 17);
                M.R(x6);
            }
            y9i0.a("Extra", this.j, str4, (izs) x6, b7, M, 6, 0);
            M.G();
            q630 f7 = txj0.f(aVar2, 1.0f);
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(gVar, bVar2, M, 6);
            int hashCode6 = Long.hashCode(n34.n(M));
            sy90 D6 = M.D();
            q630 c7 = qri.c(M, f7);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D6, eVar);
            ur.d(hashCode6, M, bVar, M, c2678a);
            k9q0.w(M, c7, dVar);
            q630 b8 = tpg0Var.b(1.0f, aVar2, true);
            String str5 = (String) ((zak0) this.q).getValue();
            boolean z7 = i7 == 4;
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new iz(this, 11);
                M.R(x7);
            }
            y9i0.a("Middle Size", this.d, str5, (izs) x7, b8, M, 6, 0);
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ls3(this, i2, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01c8, code lost:
    
        if (r3.equals("after view") == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0210, code lost:
    
        r8.K(532431667);
        r11 = com.vk.core.compose.component.cell.content.Cell.Middle.d.b.a("Title", null, null, 0, null, null, r8, 12582918, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        r8 = r8;
        r8.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x020c, code lost:
    
        if (r3.equals("text") == false) goto L67;
     */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [com.vk.core.compose.component.semantics.SemanticsConfiguration, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        noa noaVar;
        Object obj;
        Object obj2;
        Object obj3;
        int i4;
        q630 q630Var;
        Object obj4;
        Object obj5;
        com.vk.core.compose.component.cell.content.h1 a2;
        int i5;
        String str;
        com.vk.core.compose.component.cell.content.h1 b2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        int i6;
        Cell$Left cell$Left;
        Object obj6;
        Cell$Left cell$Left2;
        Cell$Left cell$Left3;
        ?? r15;
        int i7;
        int i8;
        Cell$Left cell$Left4;
        com.vk.core.compose.component.cell.content.z0 z0Var;
        com.vk.core.compose.component.cell.content.u0 u0Var;
        a.C0011a.C0012a c0012a;
        com.vk.core.compose.component.cell.content.z0 z0Var2;
        com.vk.core.compose.component.cell.content.u0 u0Var2;
        com.vk.core.compose.component.cell.content.y0 a3;
        a.C0011a.C0012a c0012a2;
        int i9;
        androidx.compose.runtime.a M = aVar.M(-480417065);
        if ((i2 & 6) == 0) {
            i3 = i2 | (M.J(this) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-480417065, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ComposeCellContent (CellScreenContent.kt:666)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(s200.E(aVar2, 0, 16), 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (((Boolean) ((zak0) this.r).getValue()).booleanValue()) {
                M.K(-1750628804);
                f(i3 & 14, M);
                M.j();
                noaVar = this;
            } else {
                M.K(-1750543678);
                q630 m2 = hr80.m(aVar2, wlb0.h(M).getBackground().g, androidx.compose.ui.graphics.e.a);
                String j2 = j();
                int i10 = (i3 << 3) & 112;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1743568837, i10, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.getTitleCompose (CellScreenContent.kt:956)");
                }
                com.vk.core.compose.component.cell.content.x a4 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(fko.a(new gko(R.drawable.vk_icon_fire_12), M), wlb0.h(M).getIcon().a, null, null, M, 24584, 12);
                com.vk.core.compose.component.cell.content.x a5 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(fko.a(new gko(R.drawable.vk_icon_check_12), M), wlb0.h(M).getIcon().a, null, null, M, 24584, 12);
                com.vk.core.compose.component.cell.content.x a6 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(fko.a(new gko(R.drawable.vk_icon_stars_12), M), wlb0.h(M).getIcon().a, null, null, M, 24584, 12);
                switch (j2.hashCode()) {
                    case -1525465018:
                        obj = "two icons";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        q630Var = m2;
                        obj4 = "before icon";
                        obj5 = "text multiline";
                        if (j2.equals(obj)) {
                            M.K(532452304);
                            a2 = Cell$Middle.d.b.a("Title", a4, a4, 0, null, null, M, 12582918, 120);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case -1153383302:
                        obj = "two icons";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        q630Var = m2;
                        obj4 = "before icon";
                        obj5 = "text multiline";
                        if (j2.equals(obj4)) {
                            M.K(532439714);
                            a2 = Cell$Middle.d.b.a("Title", a4, null, 0, null, null, M, 12582918, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case -966797958:
                        q630Var = m2;
                        obj = "two icons";
                        obj4 = "before icon";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        obj5 = "text multiline";
                        if (j2.equals(obj5)) {
                            M.K(532433721);
                            a2 = Cell$Middle.d.b.a("This is a long long long text that for several lines to check how padding works", null, null, 3, null, null, M, 12585990, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case -751968744:
                        obj = "two icons";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        q630Var = m2;
                        obj4 = "before icon";
                        obj5 = "text multiline";
                        if (j2.equals("three icons")) {
                            M.K(532455135);
                            a2 = Cell$Middle.d.b.a("Title", a4, com.vk.core.compose.component.cell.content.i.a(a4, a5, M), 0, null, null, M, 12582918, 120);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case -470777952:
                        obj = "two icons";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        q630Var = m2;
                        obj4 = "before icon";
                        obj5 = "text multiline";
                        if (j2.equals("four icons")) {
                            M.K(532461448);
                            a2 = Cell$Middle.d.b.a("Title", com.vk.core.compose.component.cell.content.i.a(a4, a6, M), com.vk.core.compose.component.cell.content.i.a(a4, a5, M), 0, null, null, M, 12582918, 120);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case 3556653:
                        q630Var = m2;
                        obj = "two icons";
                        obj4 = "before icon";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        obj5 = "text multiline";
                        break;
                    case 1483894845:
                        obj = "two icons";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        q630Var = m2;
                        obj4 = "before icon";
                        obj5 = "text multiline";
                        if (j2.equals(obj2)) {
                            M.K(532441953);
                            a2 = Cell$Middle.d.b.a("Title", null, a4, 0, null, null, M, 12582918, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                            M = M;
                            M.j();
                            break;
                        }
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                    case 1484287593:
                        q630Var = m2;
                        obj = "two icons";
                        obj4 = "before icon";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        obj5 = "text multiline";
                        break;
                    case 1805441871:
                        if (j2.equals("after icon long txt")) {
                            M.K(-674085807);
                            obj = "two icons";
                            i4 = i3;
                            obj3 = "after icon long txt";
                            obj5 = "text multiline";
                            obj2 = "after icon";
                            q630Var = m2;
                            obj4 = "before icon";
                            a2 = Cell$Middle.d.b.a("This is a long long long title that should be truncated", null, a4, 1, null, null, M, 12610566, 98);
                            M = M;
                            M.j();
                            break;
                        }
                    default:
                        q630Var = m2;
                        obj = "two icons";
                        obj4 = "before icon";
                        obj2 = "after icon";
                        obj3 = "after icon long txt";
                        i4 = i3;
                        obj5 = "text multiline";
                        M.K(-673354952);
                        M.j();
                        a2 = null;
                        break;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String i11 = i();
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    androidx.compose.runtime.b.f(-270709543, i10, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.getSubtitleCompose (CellScreenContent.kt:1005)");
                } else {
                    i5 = -1;
                }
                lg90 a7 = fko.a(new gko(R.drawable.vk_icon_fire_12), M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.a aVar4 = M;
                com.vk.core.compose.component.cell.content.x a8 = com.vk.core.compose.component.cell.content.h.a(a7, ylu0Var.getIcon().a, aVar4, 24584, 12);
                androidx.compose.runtime.a aVar5 = aVar4;
                switch (i11.hashCode()) {
                    case -1525465018:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (i11.equals(obj)) {
                            aVar5.K(1841158570);
                            b2 = Cell$Middle.c.b.b("Subtitle", 0, a8, a8, null, aVar5, 12582918, 102);
                            aVar5.j();
                            break;
                        }
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                    case -1153383302:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (i11.equals(obj4)) {
                            aVar5.K(1841153756);
                            b2 = Cell$Middle.c.b.b("Subtitle", 0, a8, null, null, aVar5, 12582918, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                            aVar5.j();
                            break;
                        }
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                    case -966797958:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (i11.equals(obj5)) {
                            aVar5.K(1841147664);
                            b2 = Cell$Middle.c.b.b("This is a long long long text that for several lines to check how padding works", 3, null, null, null, aVar5, 12582966, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            aVar5.j();
                            break;
                        }
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                    case 3556653:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (i11.equals("text")) {
                            aVar5.K(1841145453);
                            b2 = Cell$Middle.c.b.b("Subtitle", 0, null, null, null, aVar5, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                            aVar5.j();
                            break;
                        }
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                    case 1483894845:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        if (i11.equals(obj2)) {
                            aVar5.K(1841156187);
                            b2 = Cell$Middle.c.b.b("Subtitle", 0, null, a8, null, aVar5, 12582918, 110);
                            aVar5.j();
                            break;
                        }
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                    case 1805441871:
                        if (i11.equals(obj3)) {
                            aVar5.K(1241443930);
                            str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                            b2 = Cell$Middle.c.b.b("This is a long long long title that should be truncated", 1, null, a8, null, aVar5, 12583350, 104);
                            aVar5.j();
                            break;
                        }
                    default:
                        str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        aVar5.K(1241664804);
                        aVar5.j();
                        b2 = null;
                        break;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                noaVar = this;
                if (epx.f((String) ((zak0) noaVar.m).getValue(), "text")) {
                    aVar5.K(-1164835632);
                    com.vk.core.compose.component.cell.content.h1 a9 = Cell$Middle.b.a.a("Extra Subtitle", 0, null, aVar5, 24582, 14);
                    aVar5 = aVar5;
                    aVar5.j();
                    h1Var = a9;
                } else {
                    aVar5.K(-1750099604);
                    aVar5.j();
                    h1Var = null;
                }
                androidx.compose.runtime.a aVar6 = aVar5;
                com.vk.core.compose.component.cell.content.k0 a10 = Cell$Middle.a.a(a2, b2, h1Var, null, aVar6, 196608, 24);
                androidx.compose.runtime.a aVar7 = aVar6;
                String str2 = (String) ((zak0) noaVar.n).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-202760770, i10, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.getLeftContentCompose (CellScreenContent.kt:1032)");
                }
                int hashCode2 = str2.hashCode();
                wkj.a.C3940a c3940a = wkj.a.a;
                switch (hashCode2) {
                    case -1405959847:
                        i6 = -1;
                        cell$Left = null;
                        obj6 = null;
                        if (str2.equals("avatar")) {
                            Cell$Left a11 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(zq.c(aVar7, -1579552384, R.drawable.ds_demo_image_2, aVar7), null, c3940a, null, null, aVar7, 197000, 26), Cell$Left.Main.Size.Small, null, null, null, null, null, aVar7, 100663344, 252);
                            aVar7 = aVar7;
                            aVar7.j();
                            cell$Left2 = a11;
                            cell$Left3 = cell$Left2;
                            r15 = obj6;
                            break;
                        }
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    case -1349088399:
                        i6 = -1;
                        cell$Left = null;
                        obj6 = null;
                        if (str2.equals("custom")) {
                            aVar7.K(-1579561018);
                            Cell$Left a12 = Cell$Left.Main.a.C0731a.a(kci.b, aVar7);
                            aVar7.j();
                            cell$Left2 = a12;
                            cell$Left3 = cell$Left2;
                            r15 = obj6;
                            break;
                        }
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    case -110411528:
                        i6 = -1;
                        if (!str2.equals("extra check")) {
                            cell$Left = null;
                            aVar7.K(-1719646401);
                            aVar7.j();
                            cell$Left3 = cell$Left;
                            r15 = cell$Left;
                            break;
                        } else {
                            obj6 = null;
                            com.vk.core.compose.component.cell.content.t a13 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(zq.c(aVar7, -1579505819, R.drawable.ds_demo_image_2, aVar7), null, c3940a, null, null, aVar7, 197000, 26), Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar7, 100663344, 252);
                            com.vk.core.compose.component.cell.content.b0 a14 = com.vk.core.compose.component.cell.content.b.a(true, null, false, null, aVar7, 24582, 14);
                            aVar7 = aVar7;
                            Cell$Left a15 = Cell$Left.a.a(a13, a14, aVar7, 0);
                            aVar7.j();
                            cell$Left2 = a15;
                            cell$Left3 = cell$Left2;
                            r15 = obj6;
                            break;
                        }
                    case -110282264:
                        if (!str2.equals("extra close")) {
                            i6 = -1;
                            cell$Left = null;
                            aVar7.K(-1719646401);
                            aVar7.j();
                            cell$Left3 = cell$Left;
                            r15 = cell$Left;
                            break;
                        } else {
                            i6 = -1;
                            com.vk.core.compose.component.cell.content.t a16 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(zq.c(aVar7, -1579518921, R.drawable.ds_demo_image_2, aVar7), null, c3940a, null, null, aVar7, 197000, 26), Cell$Left.Main.Size.Medium, null, null, null, null, null, aVar7, 100663344, 252);
                            aVar7 = aVar7;
                            Cell$Left a17 = Cell$Left.a.a(a16, com.vk.core.compose.component.cell.content.c.a(null, null, aVar7, 3072, 7), aVar7, 0);
                            aVar7.j();
                            cell$Left3 = a17;
                            r15 = 0;
                            break;
                        }
                    case 3226745:
                        if (str2.equals("icon")) {
                            aVar7.K(-1579567549);
                            qzu0.a.getClass();
                            if (androidx.compose.runtime.b.d()) {
                                i7 = 0;
                                androidx.compose.runtime.b.f(1212007938, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-AddCircleOutline24> (VkIcons.kt:130)");
                            } else {
                                i7 = 0;
                            }
                            lg90 b3 = or.b(aVar7, -861398882, R.drawable.vk_icon_add_circle_outline_24, aVar7, i7);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
                            if (androidx.compose.runtime.b.d()) {
                                i8 = -1;
                                androidx.compose.runtime.b.f(1040687336, i7, -1, str);
                            } else {
                                i8 = -1;
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar7.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            Cell$Left a18 = com.vk.core.compose.component.cell.content.f.a(b3, size, ylu0Var2.getIcon().h, null, null, aVar7, 196664, 24);
                            aVar7 = aVar7;
                            aVar7.j();
                            cell$Left3 = a18;
                            i6 = i8;
                            r15 = 0;
                            break;
                        }
                        i6 = -1;
                        cell$Left = null;
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    case 485892570:
                        if (str2.equals("image medium")) {
                            Cell$Left a19 = com.vk.core.compose.component.cell.content.g.a(phw.a.a(zq.c(aVar7, -1579534801, R.drawable.ds_demo_image_1, aVar7), null, null, null, null, aVar7, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, aVar7, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            aVar7.j();
                            cell$Left4 = a19;
                            cell$Left3 = cell$Left4;
                            i6 = -1;
                            r15 = 0;
                            break;
                        }
                        i6 = -1;
                        cell$Left = null;
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    case 707381302:
                        if (str2.equals("image large")) {
                            Cell$Left a20 = com.vk.core.compose.component.cell.content.g.a(phw.a.a(zq.c(aVar7, -1579526770, R.drawable.ds_demo_image_1, aVar7), null, null, null, null, aVar7, 196616, 30), Cell$Left.Main.Size.Large, null, null, null, aVar7, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            aVar7.j();
                            cell$Left4 = a20;
                            cell$Left3 = cell$Left4;
                            i6 = -1;
                            r15 = 0;
                            break;
                        }
                        i6 = -1;
                        cell$Left = null;
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    case 714187266:
                        if (str2.equals("image small")) {
                            Cell$Left a21 = com.vk.core.compose.component.cell.content.g.a(phw.a.a(zq.c(aVar7, -1579542834, R.drawable.ds_demo_image_1, aVar7), null, null, null, null, aVar7, 196616, 30), Cell$Left.Main.Size.Small, null, null, null, aVar7, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            aVar7.j();
                            cell$Left4 = a21;
                            cell$Left3 = cell$Left4;
                            i6 = -1;
                            r15 = 0;
                            break;
                        }
                        i6 = -1;
                        cell$Left = null;
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                    default:
                        i6 = -1;
                        cell$Left = null;
                        aVar7.K(-1719646401);
                        aVar7.j();
                        cell$Left3 = cell$Left;
                        r15 = cell$Left;
                        break;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String str3 = (String) ((zak0) noaVar.o).getValue();
                String str4 = (String) ((zak0) noaVar.p).getValue();
                int i12 = (i4 << 6) & 896;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1878834883, i12, i6, "com.vk.design.demo.presentation.screens.CellScreenContent.getRightContentCompose (CellScreenContent.kt:1105)");
                }
                if (epx.f(str4, "reorder")) {
                    aVar7.K(1674064876);
                    com.vk.core.compose.component.cell.content.z0 a22 = o.f.a.a(r15, aVar7, 7);
                    aVar7.j();
                    z0Var = a22;
                } else {
                    aVar7.K(356418330);
                    aVar7.j();
                    z0Var = r15;
                }
                if (epx.f(str4, "chevron")) {
                    aVar7.K(1674067596);
                    com.vk.core.compose.component.cell.content.u0 a23 = o.b.a.a(null, null, 0L, false, aVar7, 196608, 31);
                    aVar7.j();
                    u0Var = a23;
                } else {
                    aVar7.K(356502650);
                    aVar7.j();
                    u0Var = r15;
                }
                int hashCode3 = str3.hashCode();
                a.C0011a.C0012a c0012a3 = a.C0011a.a;
                switch (hashCode3) {
                    case -1377687758:
                        c0012a = c0012a3;
                        if (str3.equals("button")) {
                            aVar7.K(1674076952);
                            Object x = aVar7.x();
                            if (x == c0012a) {
                                x = new ob0(2);
                                aVar7.R(x);
                            }
                            androidx.compose.runtime.a aVar8 = aVar7;
                            aVar7 = aVar8;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Button", null, null, null, false, null, null, (gzs) x, aVar8, 3072, 1769472, 32759), null, null, u0Var2, z0Var2, aVar7, 38);
                            aVar7.j();
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case -1335224239:
                        c0012a = c0012a3;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        if (str3.equals("detail")) {
                            aVar7.K(1674100387);
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.m.a("Detail", r15, aVar7, 390, 2), null, null, u0Var2, z0Var2, aVar7, 38);
                            aVar7.j();
                            break;
                        }
                        u0Var = u0Var2;
                        z0Var = z0Var2;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case -889473228:
                        c0012a = c0012a3;
                        if (str3.equals("switch")) {
                            aVar7.K(1674120297);
                            androidx.compose.runtime.a aVar9 = aVar7;
                            aVar7 = aVar9;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.n.a(true, null, false, null, aVar9, 24582, 14), null, null, u0Var2, z0Var2, aVar7, 38);
                            aVar7.j();
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case -480216027:
                        int i13 = i6;
                        c0012a = c0012a3;
                        if (str3.equals("button with icon")) {
                            aVar7.K(1674084086);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1869183844, 0, i13, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                            }
                            lg90 b4 = or.b(aVar7, -604730424, R.drawable.vk_icon_add_outline_28, aVar7, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            Object x2 = aVar7.x();
                            if (x2 == c0012a) {
                                x2 = new vg0(3);
                                aVar7.R(x2);
                            }
                            androidx.compose.runtime.a aVar10 = aVar7;
                            aVar7 = aVar10;
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Button", b4, null, null, false, null, null, (gzs) x2, aVar10, 35840, 1769472, 32743), null, null, null, null, aVar7, 62);
                            aVar7.j();
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                    case -432061423:
                        c0012a = c0012a3;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        if (str3.equals("dropdown")) {
                            aVar7.K(1674126677);
                            Object x3 = aVar7.x();
                            if (x3 == c0012a) {
                                x3 = new bu0(3);
                                aVar7.R(x3);
                            }
                            a3 = o.c.a(null, null, com.vk.core.compose.component.cell.content.q.a("Dropdown", (gzs) x3, aVar7, 24630), u0Var2, z0Var2, aVar7, 35);
                            aVar7.j();
                            break;
                        }
                        u0Var = u0Var2;
                        z0Var = z0Var2;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 96673:
                        c0012a2 = c0012a3;
                        if (str3.equals("all")) {
                            aVar7.K(359726341);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1869183844, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                            }
                            lg90 b5 = or.b(aVar7, -604730424, R.drawable.vk_icon_add_outline_28, aVar7, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            androidx.compose.runtime.a aVar11 = aVar7;
                            com.vk.core.compose.component.cell.content.x a24 = com.vk.core.compose.component.cell.content.p.a(b5, 0L, 0L, null, null, null, aVar11, 1572872, 62);
                            com.vk.core.compose.component.cell.content.w0 a25 = com.vk.core.compose.component.cell.content.r.a(null, null, 0L, null, aVar11, 24576, 15);
                            Object x4 = aVar11.x();
                            if (x4 == c0012a2) {
                                x4 = new kr6(1);
                                aVar11.R(x4);
                            }
                            c0012a = c0012a2;
                            aVar7 = aVar11;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Button", null, null, null, false, null, null, (gzs) x4, aVar11, 3072, 1769472, 32759), a24, a25, u0Var2, z0Var2, aVar7, 32);
                            aVar7.j();
                            break;
                        }
                        c0012a = c0012a2;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 3226745:
                        if (!str3.equals("icon")) {
                            c0012a = c0012a3;
                            aVar7.K(360050042);
                            aVar7.j();
                            a3 = r15;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            break;
                        } else {
                            aVar7.K(1674070478);
                            if (androidx.compose.runtime.b.d()) {
                                i9 = 0;
                                androidx.compose.runtime.b.f(-1869183844, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                            } else {
                                i9 = 0;
                            }
                            lg90 b6 = or.b(aVar7, -604730424, R.drawable.vk_icon_add_outline_28, aVar7, i9);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            androidx.compose.runtime.a aVar12 = aVar7;
                            c0012a2 = c0012a3;
                            aVar7 = aVar12;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b6, 0L, 0L, null, null, null, aVar12, 1572872, 62), null, u0Var2, z0Var2, aVar7, 37);
                            aVar7.j();
                            c0012a = c0012a2;
                            break;
                        }
                    case 3357525:
                        c0012a = c0012a3;
                        if (str3.equals("more")) {
                            aVar7.K(1674139843);
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(null, null, com.vk.core.compose.component.cell.content.r.a(null, null, 0L, null, aVar7, 24576, 15), u0Var2, z0Var2, aVar7, 35);
                            aVar7.j();
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 93494179:
                        c0012a = c0012a3;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        if (str3.equals("badge")) {
                            aVar7.K(1674113559);
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.j.a(BadgeAppearance.Design.Accent, aVar7), null, null, u0Var2, z0Var2, aVar7, 38);
                            aVar7.j();
                            break;
                        }
                        u0Var = u0Var2;
                        z0Var = z0Var2;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 94627080:
                        c0012a = c0012a3;
                        if (str3.equals("check")) {
                            aVar7.K(1674133330);
                            androidx.compose.runtime.a aVar13 = aVar7;
                            aVar7 = aVar13;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(null, null, o.e.a.C0736a.a(true, null, false, null, aVar13, 24582, 14), u0Var2, z0Var2, aVar7, 35);
                            aVar7.j();
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 100313435:
                        c0012a = c0012a3;
                        if (str3.equals("image")) {
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(null, null, com.vk.core.compose.component.cell.content.s.a(phw.a.a(zq.c(aVar7, 1674157893, R.drawable.ds_demo_image_1, aVar7), null, null, null, null, aVar7, 196616, 30), 40, null, null, null, aVar7, 12582960, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), u0Var2, z0Var2, aVar7, 35);
                            aVar7.j();
                            break;
                        }
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                    case 671113169:
                        c0012a2 = c0012a3;
                        if (str3.equals("button with trailing icon")) {
                            aVar7.K(1674092446);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1869183844, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                            }
                            lg90 b7 = or.b(aVar7, -604730424, R.drawable.vk_icon_add_outline_28, aVar7, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            Object x5 = aVar7.x();
                            if (x5 == c0012a2) {
                                x5 = new cu1(4);
                                aVar7.R(x5);
                            }
                            gzs gzsVar = (gzs) x5;
                            androidx.compose.runtime.a aVar14 = aVar7;
                            c0012a = c0012a2;
                            aVar7 = aVar14;
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.k.a(null, null, null, "Button", null, null, b7, false, null, null, gzsVar, aVar14, 134220800, 1769472, 32503), null, null, null, null, aVar7, 62);
                            aVar7.j();
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            break;
                        }
                        c0012a = c0012a2;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                    case 957830652:
                        c0012a2 = c0012a3;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        if (!str3.equals("counter")) {
                            u0Var = u0Var2;
                            z0Var = z0Var2;
                            c0012a = c0012a2;
                            aVar7.K(360050042);
                            aVar7.j();
                            a3 = r15;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            break;
                        } else {
                            aVar7.K(1674106560);
                            a3 = o.c.a(com.vk.core.compose.component.cell.content.l.a(123, CounterAppearance.Design.Accent, aVar7, 24630), null, null, u0Var2, z0Var2, aVar7, 38);
                            aVar7.j();
                            c0012a = c0012a2;
                            break;
                        }
                    case 2076912874:
                        if (str3.equals("view & more")) {
                            aVar7.K(1674146285);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1869183844, 0, i6, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
                            }
                            lg90 b8 = or.b(aVar7, -604730424, R.drawable.vk_icon_add_outline_28, aVar7, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            float f3 = 24;
                            androidx.compose.runtime.a aVar15 = aVar7;
                            c0012a2 = c0012a3;
                            aVar7 = aVar15;
                            z0Var2 = z0Var;
                            u0Var2 = u0Var;
                            a3 = o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b8, 0L, byc0.b(f3, f3), null, null, null, aVar15, 1573256, 58), com.vk.core.compose.component.cell.content.r.a(null, null, 0L, null, aVar7, 24576, 15), u0Var2, z0Var2, aVar7, 33);
                            aVar7.j();
                            c0012a = c0012a2;
                            break;
                        }
                    default:
                        c0012a = c0012a3;
                        aVar7.K(360050042);
                        aVar7.j();
                        a3 = r15;
                        z0Var2 = z0Var;
                        u0Var2 = u0Var;
                        break;
                }
                if (a3 != null || (z0Var2 == null && u0Var2 == null)) {
                    aVar7.K(1674188488);
                    aVar7.j();
                } else {
                    aVar7.K(360150669);
                    a3 = o.c.a(null, null, null, u0Var2, z0Var2, aVar7, 39);
                    aVar7.j();
                }
                com.vk.core.compose.component.cell.content.y0 y0Var = a3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x6 = aVar7.x();
                if (x6 == c0012a) {
                    x6 = new com.vk.movika.sdk.base.model.props.a(2);
                    aVar7.R(x6);
                }
                gzs gzsVar2 = (gzs) x6;
                Object x7 = aVar7.x();
                if (x7 == c0012a) {
                    x7 = new xu0(7);
                    aVar7.R(x7);
                }
                androidx.compose.runtime.a aVar16 = aVar7;
                wiu0.b(q630Var, false, cell$Left3, a10, y0Var, gzsVar2, (gzs) x7, aVar16, 1769472, 2);
                M = aVar16;
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            noaVar = this;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ms3(noaVar, i2, 1);
        }
    }

    public final void e(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1883566676);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1883566676, i2, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ComposeCellContentWithHighlighter (CellScreenContent.kt:862)");
            }
            q630 f2 = txj0.f(s200.E(q630.a.a, 0, 16), 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            wiu0.b(null, false, null, Cell$Middle.a.a(new f(), Cell$Middle.c.b.b("This is a subtitle", 0, null, null, null, M, 12582918, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new loa(this, i2, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x008a. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        poa poaVar;
        fio0 a2;
        fio0 a3;
        fio0 fio0Var;
        poa a4;
        androidx.compose.runtime.a M = aVar.M(1848621303);
        if ((i2 & 6) == 0) {
            i3 = (M.J(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1848621303, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ComposeCellSkeleton (CellScreenContent.kt:700)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m2 = hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            String str = (String) ((zak0) this.n).getValue();
            int i4 = (i3 << 3) & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1124253198, i4, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ComposeSkeletonLeft (CellScreenContent.kt:710)");
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -1405959847:
                        if (str.equals("avatar")) {
                            M.K(-1924424074);
                            a4 = roa.a(Cell$Left.Main.Size.Small, M);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case -1349088399:
                        if (str.equals("custom")) {
                            M.K(-1924427848);
                            a4 = soa.a(128.0f, 64.0f);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case -110411528:
                        if (str.equals("extra check")) {
                            M.K(-1924406619);
                            a4 = poa.a.a(roa.a(Cell$Left.Main.Size.Medium, M), qoa.a(M), M, 0);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case -110282264:
                        if (str.equals("extra close")) {
                            M.K(-1924412731);
                            a4 = poa.a.a(roa.a(Cell$Left.Main.Size.Medium, M), qoa.a(M), M, 0);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case 3226745:
                        if (str.equals("icon")) {
                            M.K(-1924430508);
                            a4 = toa.a(Cell$Left.Main.Size.Small, M);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case 3387192:
                        if (str.equals("none")) {
                            M.K(472149711);
                            M.j();
                            poaVar = null;
                            break;
                        }
                        break;
                    case 485892570:
                        if (str.equals("image medium")) {
                            M.K(-1924418312);
                            a4 = uoa.a(Cell$Left.Main.Size.Medium, null, M, 3078, 6);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case 707381302:
                        if (str.equals("image large")) {
                            M.K(-1924415401);
                            a4 = uoa.a(Cell$Left.Main.Size.Large, null, M, 3078, 6);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                    case 714187266:
                        if (str.equals("image small")) {
                            M.K(-1924421225);
                            a4 = uoa.a(Cell$Left.Main.Size.Small, null, M, 3078, 6);
                            M.j();
                            poaVar = a4;
                            break;
                        }
                        break;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i5 = i3 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(463558011, i5, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ComposeSkeletonMiddle (CellScreenContent.kt:736)");
                }
                if (!drm0.D(j(), "multiline", false)) {
                    M.K(-1197344399);
                    a2 = woa.a(M);
                    M.j();
                } else if (epx.f(j(), "none")) {
                    M.K(1537209282);
                    M.j();
                    a2 = null;
                } else {
                    M.K(-1197336721);
                    a2 = xoa.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 3);
                    M.j();
                }
                if (!drm0.D(i(), "multiline", false)) {
                    M.K(-1197332111);
                    a3 = woa.a(M);
                    M.j();
                } else if (epx.f(i(), "none")) {
                    M.K(1537593186);
                    M.j();
                    a3 = null;
                } else {
                    M.K(-1197324337);
                    a3 = xoa.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 3);
                    M.j();
                }
                if (epx.f((String) ((zak0) this.m).getValue(), "none")) {
                    M.K(-1197319921);
                    fio0 a5 = xoa.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 384, 3);
                    M.j();
                    fio0Var = a5;
                } else {
                    M.K(1537828290);
                    M.j();
                    fio0Var = null;
                }
                ul20 a6 = voa.a.a(a2, a3, fio0Var, null, M, 196608, 24);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yiu0.a(m2, poaVar, a6, ckv0.b(null, M, 1), M, 4096, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            M.K(473100047);
            M.j();
            poaVar = null;
            if (androidx.compose.runtime.b.d()) {
            }
            int i52 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
            }
            if (!drm0.D(j(), "multiline", false)) {
            }
            if (!drm0.D(i(), "multiline", false)) {
            }
            if (epx.f((String) ((zak0) this.m).getValue(), "none")) {
            }
            ul20 a62 = voa.a.a(a2, a3, fio0Var, null, M, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
            }
            yiu0.a(m2, poaVar, a62, ckv0.b(null, M, 1), M, 4096, 0);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new joa(this, i2, 0);
        }
    }

    public final void g(int i2, androidx.compose.runtime.a aVar) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-162993208);
        if ((i2 & 6) == 0) {
            i3 = (M.J(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-162993208, i3, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ViewCellContent (CellScreenContent.kt:763)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(s200.E(aVar2, 0, 16), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m2 = hr80.m(f2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean booleanValue = ((Boolean) ((zak0) this.r).getValue()).booleanValue();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (booleanValue) {
                M.K(-758426986);
                q630 f3 = txj0.f(aVar2, 1.0f);
                Object x = M.x();
                if (x == c0012a) {
                    x = new g54(7);
                    M.R(x);
                }
                izs izsVar = (izs) x;
                boolean z = (i3 & 14) == 4;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new u8(this, 15);
                    M.R(x2);
                }
                ae2.a(54, 0, M, izsVar, (izs) x2, f3);
                M.j();
            } else {
                M.K(-756380459);
                q630 f4 = txj0.f(aVar2, 1.0f);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new p60(11);
                    M.R(x3);
                }
                izs izsVar2 = (izs) x3;
                boolean l2 = M.l(false) | ((i3 & 14) == 4);
                Object x4 = M.x();
                if (l2 || x4 == c0012a) {
                    x4 = new w8(this, 17);
                    M.R(x4);
                }
                ae2.a(54, 0, M, izsVar2, (izs) x4, f4);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new moa(this, i2);
        }
    }

    public final void h(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(850488475);
        int i3 = i2 & 1;
        if (M.t(i3, i3 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(850488475, i2, -1, "com.vk.design.demo.presentation.screens.CellScreenContent.ViewCellContentWithHighlighter (CellScreenContent.kt:914)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(s200.E(aVar2, 0, 16), 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 f3 = txj0.f(aVar2, 1.0f);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new qm0(6);
                M.R(x);
            }
            izs izsVar = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new ht(8);
                M.R(x2);
            }
            ae2.a(438, 0, M, izsVar, (izs) x2, f3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ioa(this, i2, 0);
        }
    }

    public final String i() {
        return (String) ((zak0) this.l).getValue();
    }

    public final String j() {
        return (String) ((zak0) this.k).getValue();
    }

    /* compiled from: CellScreenContent.kt */
    public static final class j implements VkCell.d {
        public final View a;

        public j(Context context) {
            View view = new View(context);
            view.setBackgroundColor(-65536);
            this.a = view;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class n implements VkCell.d {
        public final View a;

        public n(Context context) {
            View view = new View(context);
            bwt0.d(view, iah0.a(12), (r4 & 2) != 0, (r4 & 4) != 0);
            view.setBackgroundColor(-65281);
            this.a = view;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }

    /* compiled from: CellScreenContent.kt */
    public static final class p implements VkCell.d {
        public final LinearLayout a;

        public p(Context context) {
            LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
            for (int i = 0; i < 3; i++) {
                VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
                vkImageSimple.setImageDrawable(m33.a(R.drawable.vk_icon_fire_12, context));
                a.addView(vkImageSimple);
            }
            this.a = a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
