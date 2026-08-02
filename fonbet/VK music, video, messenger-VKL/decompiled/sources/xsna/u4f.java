package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsStateBadgeController.kt */
/* loaded from: classes17.dex */
public final class u4f {
    public final ViewGroup a;
    public final gxp0 b;
    public c c = new c(0);
    public final v4f d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsStateBadgeController.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HIDE;
        public static final a SHOW;

        static {
            a aVar = new a("HIDE", 0);
            HIDE = aVar;
            a aVar2 = new a("SHOW", 1);
            SHOW = aVar2;
            a[] aVarArr = {aVar, aVar2};
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
    /* compiled from: ClipsStateBadgeController.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b HIDE;
        public static final b SHOW;

        static {
            b bVar = new b("HIDE", 0);
            HIDE = bVar;
            b bVar2 = new b("SHOW", 1);
            SHOW = bVar2;
            b[] bVarArr = {bVar, bVar2};
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

    /* compiled from: ClipsStateBadgeController.kt */
    public static final class c {
        public final a a;
        public final b b;
        public final boolean c;

        public c() {
            this(0);
        }

        public static c a(c cVar, a aVar, b bVar, boolean z, int i) {
            if ((i & 1) != 0) {
                aVar = cVar.a;
            }
            if ((i & 2) != 0) {
                bVar = cVar.b;
            }
            if ((i & 4) != 0) {
                z = cVar.c;
            }
            cVar.getClass();
            return new c(aVar, bVar, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(controllsHiddenBadgeState=");
            sb.append(this.a);
            sb.append(", fastForwardBadgeState=");
            sb.append(this.b);
            sb.append(", isSubtitlesEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public c(a aVar, b bVar, boolean z) {
            this.a = aVar;
            this.b = bVar;
            this.c = z;
        }

        public /* synthetic */ c(int i) {
            this(a.HIDE, b.HIDE, false);
        }
    }

    /* compiled from: ClipsStateBadgeController.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.HIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public u4f(FrameLayout frameLayout, gxp0 gxp0Var) {
        this.a = frameLayout;
        this.b = gxp0Var;
        v4f v4fVar = new v4f(this);
        this.d = v4fVar;
        gxp0Var.b(v4fVar);
    }

    public final void a(c cVar) {
        if (epx.f(this.c, cVar)) {
            return;
        }
        this.c = cVar;
        int i = d.$EnumSwitchMapping$1[cVar.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            VkContentBadge b2 = b();
            b2.setText(R.string.clips_fast_forward_badge_text);
            VkContentBadge.h(b2, Integer.valueOf(R.drawable.vk_icon_chevron_right_2_20));
            boolean z = this.c.c;
            ViewGroup.LayoutParams layoutParams = b2.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.bottomMargin = iah0.a(z ? 64 : 32);
            b2.setLayoutParams(layoutParams2);
            return;
        }
        int i2 = d.$EnumSwitchMapping$0[this.c.a.ordinal()];
        if (i2 == 1) {
            ViewGroup viewGroup = this.a;
            VkContentBadge vkContentBadge = (VkContentBadge) viewGroup.findViewById(R.id.clip_item_fast_forward_badge);
            if (vkContentBadge != null) {
                viewGroup.removeView(vkContentBadge);
                return;
            }
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        VkContentBadge b3 = b();
        b3.setText(R.string.clips_controls_hidden_toast);
        VkContentBadge.h(b3, null);
        b3.postDelayed(new u69(1, this, b3), 4000L);
    }

    public final VkContentBadge b() {
        ViewGroup viewGroup = this.a;
        VkContentBadge vkContentBadge = (VkContentBadge) viewGroup.findViewById(R.id.clip_item_fast_forward_badge);
        if (vkContentBadge != null) {
            return vkContentBadge;
        }
        VkContentBadge vkContentBadge2 = new VkContentBadge(viewGroup.getContext(), null, 6);
        vkContentBadge2.setId(R.id.clip_item_fast_forward_badge);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = iah0.a(32);
        vkContentBadge2.setLayoutParams(layoutParams);
        vkContentBadge2.setSize(VkContentBadge.Size.Large);
        vkContentBadge2.setMode(VkContentBadge.Mode.Primary);
        vkContentBadge2.setAppearance(VkContentBadge.Appearance.Design.Overlay);
        vkContentBadge2.setCapsule(true);
        viewGroup.addView(vkContentBadge2);
        return vkContentBadge2;
    }

    public final void c() {
        this.b.d(this.d);
    }
}
