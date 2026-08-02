package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aex0;
import xsna.mcv0;
import xsna.smu0;

/* compiled from: ScopesController.kt */
/* loaded from: classes6.dex */
public final class fah0 implements SuperappUiRouterBridge.g {
    public static final HashMap e = new HashMap();
    public final Context a;
    public final WebApiApplication b;
    public final czi c;
    public l1w0 d;

    /* compiled from: ScopesController.kt */
    public static final class a {
        public static final ArrayList a(ArrayList arrayList) {
            HashMap hashMap = fah0.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bah0) it.next()).a);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScopesController.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ADS;
        public static final b AUDIO;
        public static final a Companion;
        public static final b DOCS;
        public static final b EMAIL;
        public static final b FRIENDS;
        public static final b GROUPS;
        public static final b MARKET;
        public static final b MESSAGES;
        public static final b NOTES;
        public static final b NOTIFICATIONS;
        public static final b OFFLINE;
        public static final b PAGES;
        public static final b PHOTOS;
        public static final b SEND_NOTIFICATIONS;
        public static final b STATS;
        public static final b STATUS;
        public static final b STORIES;
        public static final b VIDEO;
        public static final b WALL;
        private final int descriptionApp;
        private final int descriptionGame;
        private final int iconRes;
        private final int scopeTitle;
        private final String type;

        /* compiled from: ScopesController.kt */
        public static final class a {
        }

        static {
            b bVar = new b(0, R.drawable.vk_icon_users_outline_56, R.string.vk_friends_scope, R.string.vk_scope_friends_description_game, R.string.vk_scope_friends_description_app, Privacy.FRIENDS, "friends");
            FRIENDS = bVar;
            b bVar2 = new b(1, R.drawable.vk_icon_notification_outline_56, R.string.vk_send_notifications_scope, R.string.vk_send_notifications_scope_description_game, R.string.vk_send_notifications_scope_description_app, "SEND_NOTIFICATIONS", "notify");
            SEND_NOTIFICATIONS = bVar2;
            b bVar3 = new b(2, R.drawable.vk_icon_gallery_outline_56, R.string.vk_photos_scope, R.string.vk_scope_photos_description_game, R.string.vk_scope_photos_description_app, "PHOTOS", "photos");
            PHOTOS = bVar3;
            b bVar4 = new b(3, R.drawable.vk_icon_music_outline_56, R.string.vk_audio_scope, R.string.vk_scope_audio_description_game, R.string.vk_scope_audio_description_app, SignalingProtocol.MEDIA_OPTION_AUDIO, "audio");
            AUDIO = bVar4;
            b bVar5 = new b(4, R.drawable.vk_icon_video_outline_56, R.string.vk_video_scope, R.string.vk_scope_video_description_game, R.string.vk_scope_video_description_app, SignalingProtocol.MEDIA_OPTION_VIDEO, "video");
            VIDEO = bVar5;
            b bVar6 = new b(5, R.drawable.vk_icon_video_outline_56, R.string.vk_stories_scope, R.string.vk_scope_stories_description_game, R.string.vk_scope_stories_description_app, "STORIES", "stories");
            STORIES = bVar6;
            b bVar7 = new b(6, R.drawable.vk_icon_article_outline_56, R.string.vk_pages_scope, R.string.vk_scope_pages_description_game, R.string.vk_scope_pages_description_app, "PAGES", "pages");
            PAGES = bVar7;
            b bVar8 = new b(7, R.drawable.vk_icon_message_outline_56, R.string.vk_stutus_scope, R.string.vk_scope_status_description_game, R.string.vk_scope_status_description_app, CommonConstant.RETKEY.STATUS, "status");
            STATUS = bVar8;
            b bVar9 = new b(8, R.drawable.vk_icon_article_outline_56, R.string.vk_notes_scope, R.string.vk_scope_notes_description_game, R.string.vk_scope_notes_description_app, "NOTES", "notes");
            NOTES = bVar9;
            b bVar10 = new b(9, R.drawable.vk_icon_message_outline_56, R.string.vk_messages_scope, R.string.vk_scope_messages_description_game, R.string.vk_scope_messages_description_app, "MESSAGES", "messages");
            MESSAGES = bVar10;
            b bVar11 = new b(10, R.drawable.vk_icon_newsfeed_outline_56, R.string.vk_wall_scope, R.string.vk_scope_wall_description_game, R.string.vk_scope_wall_description_app, "WALL", "wall");
            WALL = bVar11;
            b bVar12 = new b(11, R.drawable.vk_icon_settings_outline_56, R.string.vk_ads_scope, R.string.vk_scope_ads_description_game, R.string.vk_scope_ads_description_app, "ADS", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
            ADS = bVar12;
            b bVar13 = new b(12, R.drawable.vk_icon_settings_outline_56, R.string.vk_offline_scope, R.string.vk_scope_offline_description_game, R.string.vk_scope_offline_description_app, "OFFLINE", "offline");
            OFFLINE = bVar13;
            b bVar14 = new b(13, R.drawable.vk_icon_document_outline_56, R.string.vk_docs_scope, R.string.vk_scope_docs_description_game, R.string.vk_scope_docs_description_app, "DOCS", "docs");
            DOCS = bVar14;
            b bVar15 = new b(14, R.drawable.vk_icon_users_3_outline_56, R.string.vk_groups_scope, R.string.vk_scope_groups_description_game, R.string.vk_scope_groups_description_app, "GROUPS", "groups");
            GROUPS = bVar15;
            b bVar16 = new b(15, R.drawable.vk_icon_users_3_outline_56, R.string.vk_notifications_scope, R.string.vk_scope_notifications_description_game, R.string.vk_scope_notifications_description_app, "NOTIFICATIONS", C4504q2.x);
            NOTIFICATIONS = bVar16;
            b bVar17 = new b(16, R.drawable.vk_icon_settings_outline_56, R.string.vk_stats_scope, R.string.vk_scope_stats_description_game, R.string.vk_scope_stats_description_app, "STATS", "stats");
            STATS = bVar17;
            b bVar18 = new b(17, R.drawable.vk_icon_mail_outline_56, R.string.vk_email_scope, R.string.vk_scope_email_description_game, R.string.vk_scope_email_description_app, CommonConstant.RETKEY.EMAIL, "email");
            EMAIL = bVar18;
            b bVar19 = new b(18, R.drawable.vk_icon_mail_outline_56, R.string.vk_market_scope, R.string.vk_scope_market_description_game, R.string.vk_scope_market_description_app, "MARKET", "market");
            MARKET = bVar19;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
            Companion = new a();
        }

        public b(int i, int i2, int i3, int i4, int i5, String str, String str2) {
            this.type = str2;
            this.iconRes = i2;
            this.scopeTitle = i3;
            this.descriptionGame = i4;
            this.descriptionApp = i5;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return this.descriptionApp;
        }

        public final int i() {
            return this.descriptionGame;
        }

        public final int j() {
            return this.iconRes;
        }

        public final int k() {
            return this.scopeTitle;
        }

        public final String l() {
            return this.type;
        }
    }

    /* compiled from: ScopesController.kt */
    public static final class c implements aex0.b {
        public c() {
        }

        @Override // xsna.aex0.b
        public final void a() {
            l1w0 l1w0Var = fah0.this.d;
            if (l1w0Var == null) {
                l1w0Var = null;
            }
            l1w0Var.b();
        }
    }

    /* compiled from: ScopesController.kt */
    public static final class d implements aex0.b {
        public final /* synthetic */ ArrayList b;

        public d(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // xsna.aex0.b
        public final void a() {
            l1w0 l1w0Var = fah0.this.d;
            if (l1w0Var == null) {
                l1w0Var = null;
            }
            HashMap hashMap = fah0.e;
            l1w0Var.c(a.a(this.b));
        }
    }

    /* compiled from: ScopesController.kt */
    public static final class e implements aex0.c {
        public e() {
        }

        @Override // xsna.aex0.c
        public final void onCancel() {
            l1w0 l1w0Var = fah0.this.d;
            if (l1w0Var == null) {
                l1w0Var = null;
            }
            l1w0Var.b();
        }
    }

    /* compiled from: ScopesController.kt */
    public static final class f implements aex0.b {
        public final /* synthetic */ List<bah0> b;
        public final /* synthetic */ ArrayList c;

        public f(List list, ArrayList arrayList) {
            this.b = list;
            this.c = arrayList;
        }

        @Override // xsna.aex0.b
        public final void a() {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            superappUiRouterBridge.o0(this.b, this.c, fah0.this);
        }
    }

    /* compiled from: ScopesController.kt */
    public static final class g implements smu0.a {
        public final /* synthetic */ Context b;
        public final /* synthetic */ List<String> c;
        public final /* synthetic */ List<String> d;
        public final /* synthetic */ String e;

        public g(Context context, List<String> list, List<String> list2, String str) {
            this.b = context;
            this.c = list;
            this.d = list2;
            this.e = str;
        }

        @Override // xsna.smu0.a
        public final void a() {
            fah0.this.e(this.b, this.c, j5g.v0(this.e, this.d));
        }

        @Override // xsna.smu0.a
        public final void b() {
            fah0.this.e(this.b, this.c, this.d);
        }

        @Override // xsna.smu0.a
        public final void onCancel() {
            fah0.this.e(this.b, this.c, this.d);
        }
    }

    public fah0(Context context, WebApiApplication webApiApplication, czi cziVar) {
        this.a = context;
        this.b = webApiApplication;
        this.c = cziVar;
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.g
    public final void a(ArrayList arrayList) {
        l1w0 l1w0Var = this.d;
        if (l1w0Var == null) {
            l1w0Var = null;
        }
        l1w0Var.c(a.a(arrayList));
    }

    @Override // com.vk.superapp.bridges.SuperappUiRouterBridge.g
    public final void b(ArrayList arrayList, List list) {
        c(this.a, list, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Context context, List<bah0> list, List<bah0> list2) {
        czi cziVar;
        String string;
        SpannableString spannableString = new SpannableString(context.getString(R.string.vk_apps_request_access_subtitle));
        spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_subhead, context)), 0, spannableString.length(), 0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cziVar = this.c;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            bah0 bah0Var = (bah0) next;
            Map map = (Map) e.get(cziVar.k());
            if (map != null ? map.containsKey(bah0Var.a) : true) {
                arrayList.add(next);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.isEmpty()) {
            string = context.getString(R.string.vk_apps_request_access_main_info);
        } else {
            ytw W0 = j5g.W0(arrayList);
            ArrayList arrayList2 = new ArrayList(c5g.u(W0, 10));
            Iterator it2 = W0.iterator();
            while (true) {
                ztw ztwVar = (ztw) it2;
                if (!ztwVar.b.hasNext()) {
                    break;
                }
                xtw xtwVar = (xtw) ztwVar.next();
                int i = xtwVar.a;
                bah0 bah0Var2 = (bah0) xtwVar.b;
                arrayList2.add(i == 0 ? brm0.o(bah0Var2.b) : brm0.t(bah0Var2.b));
            }
            string = f870.B(arrayList2, ", ", null);
        }
        SpannableString spannableString2 = new SpannableString(ho8.a(sb, string, JwtParser.SEPARATOR_CHAR));
        spannableString2.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, context)), 0, spannableString2.length(), 0);
        SpannableString spannableString3 = new SpannableString("\n\n");
        spannableString3.setSpan(new AbsoluteSizeSpan(6, true), 0, spannableString3.length(), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) spannableString3).append((CharSequence) spannableString2);
        aex0.a aVar = new aex0.a();
        aVar.a = "scopesSummary";
        String str = this.b.d.a(iah0.a(72.0f)).b;
        Boolean bool = Boolean.FALSE;
        aVar.c = str;
        aVar.d = bool;
        aVar.e = cziVar.i(context);
        aVar.f = new SpannableString(spannableStringBuilder);
        aVar.b(context.getString(R.string.vk_apps_access_allow), new d(arrayList));
        aVar.j = new e();
        if (cziVar instanceof fmu) {
            aVar.h = new aex0.e(context.getString(R.string.vk_apps_access_disallow), new c());
        }
        if (!list.isEmpty()) {
            aVar.i = new aex0.e(context.getString(R.string.vk_apps_request_access_edit), new f(list, arrayList));
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        (superappUiRouterBridge != null ? superappUiRouterBridge : null).e0(aVar.a());
    }

    public final void d(Context context, Map<String, String> map, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            String str2 = map.get(str);
            bah0 bah0Var = (str2 == null || drm0.N(str2)) ? null : new bah0(str, str2);
            if (bah0Var != null) {
                arrayList.add(bah0Var);
            }
        }
        if (!arrayList.isEmpty()) {
            c(context, arrayList, arrayList);
        } else {
            List<bah0> list2 = Collections.EMPTY_LIST;
            c(context, list2, list2);
        }
    }

    public final void e(Context context, List<String> list, List<String> list2) {
        b bVar;
        boolean z;
        if (list.isEmpty()) {
            if (list2.isEmpty()) {
                l1w0 l1w0Var = this.d;
                (l1w0Var != null ? l1w0Var : null).b();
                return;
            } else {
                l1w0 l1w0Var2 = this.d;
                (l1w0Var2 != null ? l1w0Var2 : null).c(list2);
                return;
            }
        }
        List<String> subList = list.subList(1, list.size());
        String str = (String) j5g.Y(list);
        if (list2.contains(str)) {
            e(context, subList, list2);
            return;
        }
        b.Companion.getClass();
        b[] values = b.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = values[i];
            if (epx.f(bVar.l(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (bVar == null) {
            e(context, subList, list2);
            return;
        }
        String string = context.getString(bVar.k());
        WebApiApplication webApiApplication = this.b;
        Pair pair = webApiApplication.f() ? new Pair(Integer.valueOf(R.string.vk_scopes_game_require), Integer.valueOf(bVar.i())) : new Pair(Integer.valueOf(R.string.vk_scopes_app_require), Integer.valueOf(bVar.h()));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        String string2 = context.getString(intValue, string);
        String string3 = context.getString(intValue2, webApiApplication.c);
        int i2 = mcv0.o1;
        mcv0 a2 = mcv0.a.a(bVar.j(), string2, string3);
        a2.j1 = R.string.vk_scopes_allow;
        a2.k1 = R.string.vk_scopes_forbid;
        a2.f1 = new g(context, subList, list2, str);
        while (true) {
            z = context instanceof AppCompatActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) (z ? (Activity) context : null);
        if (appCompatActivity != null) {
            a2.Wn(appCompatActivity.getSupportFragmentManager(), "scopeRequest".concat(str));
        }
    }
}
