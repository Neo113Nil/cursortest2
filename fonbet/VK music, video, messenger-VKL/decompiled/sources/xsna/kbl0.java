package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PopupStickersChatSettingsModel;
import com.vk.dto.stickers.PopupStickersSettingsFlags;
import com.vk.internal.api.GsonHolder;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import java.util.HashMap;

/* compiled from: StickersPrefs.kt */
/* loaded from: classes5.dex */
public final class kbl0 {
    public static final HashMap<UserId, kbl0> b = new HashMap<>();
    public static final io.reactivex.rxjava3.subjects.f<Integer> c = new io.reactivex.rxjava3.subjects.f<>();
    public static final io.reactivex.rxjava3.subjects.f<Integer> d = new io.reactivex.rxjava3.subjects.f<>();
    public static final io.reactivex.rxjava3.subjects.f<Boolean> e = new io.reactivex.rxjava3.subjects.f<>();
    public final String a;

    /* compiled from: StickersPrefs.kt */
    public static final class a {
        public static void a(UserId userId) {
            synchronized (kbl0.class) {
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                Preference.B("stickers-" + userId.b);
                kbl0.b.remove(userId);
            }
        }

        public static kbl0 b() {
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            UserId c = o25.a().c();
            HashMap<UserId, kbl0> hashMap2 = kbl0.b;
            if (hashMap2.get(c) == null) {
                synchronized (kbl0.class) {
                    try {
                        if (hashMap2.get(c) == null) {
                            hashMap2.put(c, new kbl0("stickers-" + c.b));
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return hashMap2.get(c);
        }
    }

    public kbl0(String str) {
        this.a = str;
        int i = BuildInfo.e;
        asu0.a.getClass();
        asu0.o().execute(new qb3(this, 12));
        long j = i;
        if (Preference.m(0L, str, "stickers_last_version_build_code") != j) {
            Preference.F(j, str, "stickers_last_version_build_code");
            a();
            Preference.C(str, "suggestions_version_hash");
            Preference.C(str, "images_config_hash");
            Preference.C(str, "stickers_last_config_version");
            Preference.C(str, "stickers_free_in_stories_promo");
        }
    }

    public final void a() {
        String str = this.a;
        Preference.C(str, "stickers_hash_last");
        Preference.C(str, "sticker_packs_count");
    }

    public final PopupStickersChatSettingsModel b() {
        String s = Preference.s(this.a, "stickers_popup_general_chat_settings", "");
        if (s.length() == 0) {
            return new PopupStickersChatSettingsModel(false, false, null, 7, null);
        }
        try {
            return (PopupStickersChatSettingsModel) GsonHolder.a().fromJson(s, PopupStickersChatSettingsModel.class);
        } catch (Throwable unused) {
            return new PopupStickersChatSettingsModel(false, false, null, 7, null);
        }
    }

    public final PopupStickersSettingsFlags c() {
        String s = Preference.s(this.a, "stickers_popup_settings_flags", "");
        if (s.length() == 0) {
            return new PopupStickersSettingsFlags(false, false, 3, null);
        }
        try {
            return (PopupStickersSettingsFlags) GsonHolder.a().fromJson(s, PopupStickersSettingsFlags.class);
        } catch (Throwable unused) {
            return new PopupStickersSettingsFlags(false, false, 3, null);
        }
    }

    public final int d() {
        return (int) Preference.m(0L, this.a, "sticker_packs_count");
    }

    public final VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig e() {
        String s = Preference.s(this.a, "stickers_vmoji_promo_in_suggests_display_config", "");
        if (s.length() == 0) {
            return new VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig(0L, 0, null, null, 15, null);
        }
        try {
            return (VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig) GsonHolder.a().fromJson(s, VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig.class);
        } catch (Throwable unused) {
            return new VmojiPromoInSuggestsRepositoryImpl.VmojiPromoInSuggestsConfig(0L, 0, null, null, 15, null);
        }
    }
}
