package xsna;

import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.q5j0;

/* compiled from: CustomMenuDefaults.kt */
/* loaded from: classes6.dex */
public final class nnk {
    public static final List<Pair<CustomMenuInfo, q5j0>> a = e43.l(new Pair(b("friends", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDRQvDgcSRhYW"), a.a), new Pair(b("groups", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDBQpHhkFF0k"), a.b), new Pair(b("audios", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WChMiAgYFF0k"), a.c), new Pair(b("market", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WCAonGBofU10OAjVJFA"), a.g), new Pair(b("games", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WDAcrDhpUSA"), a.e), new Pair(b("stickers", "PUkdD0VRSVxkCBwFQVsGOS8fDBsXGEkIJwYMVA8WGBIvCAITR0dJGw"), a.d), new Pair(b("steps", "PUkAEhcOSVFzWFBGDQNJSmQfEAZQFlFEKwIHH2pVGxZkFg"), a.h), new Pair(b("vk_calls", "PUkdD0VRSVxkCAUfUFofOSsOBwMXGEkIJwYMVA8WHQ0ZCAgaWUdJGw"), a.i));
    public static final List<Pair<CustomMenuInfo, q5j0>> b = Collections.singletonList(new Pair(b("more", "PUkdD0VRSVxkCAUfUFofOSsOBwMXGEkIJwYMVA8WBgk0DksL"), a.f));

    /* compiled from: CustomMenuDefaults.kt */
    public static final class a {
        public static final q5j0 a = new q5j0(R.string.friends, R.drawable.vk_icon_users_outline_28, new q5j0.c(R.color.vk_orange_fire));
        public static final q5j0 b = new q5j0(R.string.vk_groups, R.drawable.vk_icon_users_3_outline_28, new q5j0.b(R.attr.vk_ui_accent_orange));
        public static final q5j0 c = new q5j0(R.string.music, R.drawable.vk_icon_music_outline_28, new q5j0.b(R.attr.vk_ui_accent_pink));
        public static final q5j0 d;
        public static final q5j0 e;
        public static final q5j0 f;
        public static final q5j0 g;
        public static final q5j0 h;
        public static final q5j0 i;

        static {
            new q5j0.b(R.attr.vk_ui_accent_violet);
            new q5j0.b(R.attr.vk_ui_accent_red);
            d = new q5j0(R.string.vk_stickers, R.drawable.vk_icon_smile_outline_28, new q5j0.c(R.color.vk_yellow));
            new q5j0.c(R.color.vk_pink);
            e = new q5j0(R.string.vk_games, R.drawable.vk_icon_game_outline_28, new q5j0.b(R.attr.vk_ui_accent_green));
            new q5j0.c(R.color.vk_turquoise);
            f = new q5j0(R.string.vk_apps_all_services, R.drawable.vk_icon_square_4_outline_28, null);
            new q5j0.b(R.attr.vk_ui_icon_accent_themed);
            g = new q5j0(R.string.vk_shopping, R.drawable.vk_icon_market_outline_28, new q5j0.b(R.attr.vk_ui_accent_blue));
            h = new q5j0(R.string.vk_steps, R.drawable.vk_icon_sneaker_outline_28, new q5j0.b(R.attr.vk_ui_accent_blue));
            i = new q5j0(R.string.vk_calls, R.drawable.vk_icon_phone_outline_28, new q5j0.b(R.attr.vk_ui_icon_accent_themed));
        }
    }

    public static SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem a(String str, String str2, String str3, String str4) {
        return new SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem(SuperAppShowcaseExpandableServiceMenu.Payload.ExpandableMenuItemType.DEFAULT_ITEM, str2, str, "", str3, null, str4, null, null);
    }

    public static CustomMenuInfo b(String str, String str2) {
        CustomMenuInfo.CREATOR.getClass();
        return CustomMenuInfo.a(CustomMenuInfo.m, str, str2, null, 2041);
    }
}
