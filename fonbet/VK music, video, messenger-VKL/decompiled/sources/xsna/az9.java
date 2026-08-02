package xsna;

import android.content.Context;
import android.util.ArrayMap;
import android.util.SparseIntArray;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import xsna.blm;

/* compiled from: CasperDialogThemeParser.kt */
/* loaded from: classes2.dex */
public final class az9 extends blm {
    public static final List<String> f = e43.l("purple", "orange", "pink");
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CasperDialogThemeParser.kt */
    public static final class a implements blm.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACCENT;
        public static final a ATTACH_TINT;
        public static final a BUBBLE_BACKGROUND;
        public static final a BUBBLE_BACKGROUND_HIGHLIGHTED;
        public static final a BUBBLE_BUTTON;
        public static final a BUBBLE_WALLPAPER_BUTTON;
        public static final a FORWARD_LINE_TINT;
        public static final a LINK;
        public static final a MAIN_TINT;
        public static final a TEXT_PLACEHOLDER;
        public static final a TEXT_PRIMARY;
        private final String key;

        static {
            a aVar = new a("MAIN_TINT", 0, "main_tint");
            MAIN_TINT = aVar;
            a aVar2 = new a("ACCENT", 1, "accent");
            ACCENT = aVar2;
            a aVar3 = new a("ATTACH_TINT", 2, "attach_tint");
            ATTACH_TINT = aVar3;
            a aVar4 = new a("BUBBLE_BACKGROUND", 3, "bubble_background");
            BUBBLE_BACKGROUND = aVar4;
            a aVar5 = new a("TEXT_PLACEHOLDER", 4, "text_placeholder");
            TEXT_PLACEHOLDER = aVar5;
            a aVar6 = new a("BUBBLE_BUTTON", 5, "bubble_button");
            BUBBLE_BUTTON = aVar6;
            a aVar7 = new a("BUBBLE_WALLPAPER_BUTTON", 6, "bubble_wallpaper_button");
            BUBBLE_WALLPAPER_BUTTON = aVar7;
            a aVar8 = new a("BUBBLE_BACKGROUND_HIGHLIGHTED", 7, "bubble_background_highlighted");
            BUBBLE_BACKGROUND_HIGHLIGHTED = aVar8;
            a aVar9 = new a("TEXT_PRIMARY", 8, "text_primary");
            TEXT_PRIMARY = aVar9;
            a aVar10 = new a("LINK", 9, "link");
            LINK = aVar10;
            a aVar11 = new a("FORWARD_LINE_TINT", 10, "forward_line_tint");
            FORWARD_LINE_TINT = aVar11;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, String str2) {
            this.key = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // xsna.blm.a
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CasperDialogThemeParser.kt */
    public static final class b implements blm.b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b INCOMING_COLOR_1;
        public static final b INCOMING_COLOR_2;
        public static final b INCOMING_COLOR_3;
        public static final b OUTGOING;
        private final boolean isIncoming;
        private final String key;

        static {
            b bVar = new b("INCOMING_COLOR_1", 0, "incoming_color1", true);
            INCOMING_COLOR_1 = bVar;
            b bVar2 = new b("INCOMING_COLOR_2", 1, "incoming_color2", true);
            INCOMING_COLOR_2 = bVar2;
            b bVar3 = new b("INCOMING_COLOR_3", 2, "incoming_color3", true);
            INCOMING_COLOR_3 = bVar3;
            b bVar4 = new b("OUTGOING", 3, "outgoing", false);
            OUTGOING = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, String str2, boolean z) {
            this.key = str2;
            this.isIncoming = z;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // xsna.blm.b
        public final String getKey() {
            return this.key;
        }

        public final boolean h() {
            return this.isIncoming;
        }
    }

    public az9(Context context, List<VKTheme> list) {
        super(context, list);
        this.e = "im_";
    }

    @Override // xsna.blm
    public final String b() {
        return this.e;
    }

    public final SparseIntArray c(JSONObject jSONObject, com.vk.im.engine.models.dialogs.c cVar, ArrayMap arrayMap) {
        int a2 = a(jSONObject, arrayMap, a.MAIN_TINT, cVar, null);
        SparseIntArray sparseIntArray = new SparseIntArray();
        u4q0 u4q0Var = zik0.a;
        sparseIntArray.put(R.attr.vk_legacy_accent, a2);
        sparseIntArray.put(R.attr.vk_legacy_header_text, a2);
        sparseIntArray.put(R.attr.vk_legacy_header_tint, a2);
        sparseIntArray.put(R.attr.toolbar_title_textColor, a2);
        return sparseIntArray;
    }

    public final BubbleColors d(JSONObject jSONObject, com.vk.im.engine.models.dialogs.c cVar, b bVar, ArrayMap arrayMap) {
        boolean h = bVar.h();
        int a2 = a(jSONObject, arrayMap, a.ACCENT, cVar, bVar);
        int a3 = a(jSONObject, arrayMap, a.ATTACH_TINT, cVar, bVar);
        int a4 = a(jSONObject, arrayMap, a.BUBBLE_BACKGROUND, cVar, bVar);
        int a5 = a(jSONObject, arrayMap, a.TEXT_PLACEHOLDER, cVar, bVar);
        int a6 = a(jSONObject, arrayMap, a.BUBBLE_BACKGROUND_HIGHLIGHTED, cVar, bVar);
        int f2 = e3m.f(R.attr.vk_ui_accent_purple, this.a);
        return new BubbleColors(a2, a3, a2, a(jSONObject, arrayMap, a.LINK, cVar, bVar), a5, a(jSONObject, arrayMap, a.TEXT_PRIMARY, cVar, bVar), 0, a5, a5, a3, 0, 0, a2, a(jSONObject, arrayMap, a.FORWARD_LINE_TINT, cVar, bVar), a4, a6, a2, a4, a6, a2, a4, a6, 0, a4, a6, a4, f(h, a.BUBBLE_BUTTON), f(h, a.BUBBLE_WALLPAPER_BUTTON), new int[]{a4, a4}, f2, 4197440, null);
    }

    public final List e(JSONObject jSONObject, com.vk.im.engine.models.dialogs.c cVar, ArrayMap arrayMap, boolean z) {
        return z ? e43.l(d(jSONObject, cVar, b.INCOMING_COLOR_1, arrayMap), d(jSONObject, cVar, b.INCOMING_COLOR_2, arrayMap), d(jSONObject, cVar, b.INCOMING_COLOR_3, arrayMap)) : Collections.singletonList(d(jSONObject, cVar, b.OUTGOING, arrayMap));
    }

    public final int f(boolean z, a aVar) {
        a aVar2 = a.BUBBLE_BUTTON;
        Context context = this.a;
        if (aVar == aVar2) {
            return z ? e3m.f(R.attr.vk_legacy_im_bubble_button_background, context) : e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, context);
        }
        if (aVar == a.BUBBLE_WALLPAPER_BUTTON) {
            return z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_button_background, context) : e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, context);
        }
        throw new IllegalArgumentException("No fallback color for attr " + aVar);
    }
}
