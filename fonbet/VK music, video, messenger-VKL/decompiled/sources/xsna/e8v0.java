package xsna;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: VkOnboardingStat.kt */
/* loaded from: classes4.dex */
public abstract class e8v0 {
    public final String a;

    /* compiled from: VkOnboardingStat.kt */
    public static final class a extends e8v0 {
        public static final a b = new a("click");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class b extends e8v0 {
        public static final b b = new b("click_banner");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class c extends e8v0 {
        public static final c b = new c("click_cta");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class d extends e8v0 {
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class e extends e8v0 {
        public static final e b = new e("click_tooltip");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class f extends e8v0 {
        public static final f b = new f("click_tooltip_anchor");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class g extends e8v0 {
        public static final g b = new g(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class h extends e8v0 {
        public static final h b = new h("close_auto");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class i extends e8v0 {
        public static final i b = new i("close_click_outside");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class j extends e8v0 {
        public static final j b = new j("close_click_outside_nonclickable");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class k extends e8v0 {
        public static final k b = new k("close_exit");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class l extends e8v0 {
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class m extends e8v0 {
        public static final m b = new m(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class n extends e8v0 {
        public static final n b = new n("view_all_screen");
    }

    /* compiled from: VkOnboardingStat.kt */
    public static final class o extends e8v0 {
    }

    public e8v0(String str) {
        this.a = str;
    }
}
