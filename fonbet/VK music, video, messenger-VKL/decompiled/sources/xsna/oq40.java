package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogButtonMusicSubscription;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.ui.mvp.util.ButtonStyle;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.k840;

/* compiled from: MusicOfflinePlaceholdersProviderImpl.kt */
/* loaded from: classes16.dex */
public final class oq40 {
    public static CatalogStateInfo d(oq40 oq40Var, String str, String str2, CatalogButtonMusicSubscription catalogButtonMusicSubscription, String str3, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        CatalogButtonMusicSubscription catalogButtonMusicSubscription2 = (i & 4) != 0 ? null : catalogButtonMusicSubscription;
        return new CatalogStateInfo((i & 8) != 0 ? "placeholder_id" : str3, str4, null, null, str, catalogButtonMusicSubscription2 != null ? Collections.singletonList(catalogButtonMusicSubscription2) : EmptyList.b, null, null, dhr0.t.c(R.attr.vk_ui_field_background), null, null, null, null, null, null, null, null, 126976, null);
    }

    public final CatalogStateInfo a(int i) {
        Pair pair;
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            String id = CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN.getId();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            CatalogButtonMusicSubscription catalogButtonMusicSubscription = new CatalogButtonMusicSubscription(id, null, context.getString(R.string.catalog_offline_subscribe), ButtonStyle.PRIMARY.h());
            Context context2 = e43.a;
            pair = new Pair(catalogButtonMusicSubscription, (context2 != null ? context2 : null).getString(i));
        } else {
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            pair = new Pair(null, context3.getString(R.string.catalog_offline_no_subscription_no_network));
        }
        return d(this, (String) pair.g(), null, (CatalogButtonMusicSubscription) pair.d(), null, 10);
    }

    public final CatalogStateInfo b(mt70 mt70Var, String str, String str2) {
        String string;
        String str3;
        if (str2.length() != 0) {
            int i = mt70Var.k;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            string = context.getString(i);
        } else if (k840.a.d().o()) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            string = context2.getString(R.string.music_offline_migration_placeholder_text);
        } else {
            int a = mt70Var.a(str);
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            string = context3.getString(a);
        }
        String str4 = string;
        if (str2.length() == 0 && k840.a.d().o()) {
            Context context4 = e43.a;
            str3 = (context4 != null ? context4 : null).getString(R.string.music_offline_migration_placeholder_title);
        } else {
            str3 = "";
        }
        return d(this, str4, str3, null, str, 4);
    }

    public final CatalogStateInfo c(Integer num) {
        Pair pair;
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            int intValue = num != null ? num.intValue() : R.string.catalog_offline_expired_subscription;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String string = context.getString(intValue);
            String id = CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN.getId();
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            pair = new Pair(string, new CatalogButtonMusicSubscription(id, null, context2.getString(R.string.catalog_offline_subscribe), ButtonStyle.PRIMARY.h()));
        } else {
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            pair = new Pair(context3.getString(R.string.catalog_offline_no_subscription_no_network), null);
        }
        return d(this, (String) pair.d(), null, (CatalogButtonMusicSubscription) pair.g(), null, 10);
    }
}
