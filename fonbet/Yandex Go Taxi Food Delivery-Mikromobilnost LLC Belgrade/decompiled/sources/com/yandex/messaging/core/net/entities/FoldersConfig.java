package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.scc;
import defpackage.unr0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@DefaultIfNull
@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fBA\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0014\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/yandex/messaging/core/net/entities/FoldersConfig;", "", "maxFoldersPerOrg", "", "maxChatsPerFolder", "filters", "", "", "Lcom/yandex/messaging/core/net/entities/FoldersConfig$Filter;", "filtersList", "", "<init>", "(IILjava/util/Map;Ljava/util/List;)V", "getMaxFoldersPerOrg", "()I", "getMaxChatsPerFolder", "getFilters", "()Ljava/util/Map;", "getFiltersList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Filter", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FoldersConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String SUPPORT_FILTER_ID = "support";
    public static final String TELEMOST_FILTER_ID = "telemost";
    private final Map<String, Filter> filters;
    private final List<String> filtersList;
    private final int maxChatsPerFolder;
    private final int maxFoldersPerOrg;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/core/net/entities/FoldersConfig$Companion;", "", "", "TELEMOST_FILTER_ID", "Ljava/lang/String;", "SUPPORT_FILTER_ID", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FoldersConfig(int i, int i2, Map map, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0, r1, r2, r3);
        Map map2;
        List list2;
        int i4 = (i3 & 1) != 0 ? 11 : i;
        int i5 = (i3 & 2) != 0 ? 50 : i2;
        if ((i3 & 4) != 0) {
            INSTANCE.getClass();
            List list3 = null;
            map2 = b.i(new Pair("private", new Filter(null, Collections.singletonList(0), "Личные чаты", "private", "user_avatar/mssngr/2370321/mssngr_folder_new_icon_personal", 1, null)), new Pair("group", new Filter(null, Collections.singletonList(1), "Групповые чаты", "group", "", 1, null)), new Pair("bot", new Filter(null, Collections.singletonList(2), "Боты", "bot", "user_avatar/mssngr/2370321/mssngr_folder_icon_bot", 1, null)), new Pair("unread", new Filter(null, Collections.singletonList(3), "Непрочитанные", "unread", "user_avatar/mssngr/2444054/mssngr_folder_icon_unread", 1, null)), new Pair("channel", new Filter(null, Collections.singletonList(4), "Каналы", "channel", "user_avatar/mssngr/2444054/mssngr_folder_icon_channels", 1, null)), new Pair("telemost", new Filter(scc.g(22, 32), list3, "Чаты Телемоста", "telemost", "user_avatar/mssngr/2355480/mssngr_folder_icon_new_telemost", 2, null)), new Pair(SUPPORT_FILTER_ID, new Filter(list3, Collections.singletonList(6), "Чаты поддержки", SUPPORT_FILTER_ID, "user_avatar/mssngr/2444054/mssngr_folder_icon_support", 1, null)));
        } else {
            map2 = map;
        }
        if ((i3 & 8) != 0) {
            INSTANCE.getClass();
            list2 = scc.g("private", "unread", "channel", "bot", "telemost", SUPPORT_FILTER_ID);
        } else {
            list2 = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FoldersConfig copy$default(FoldersConfig foldersConfig, int i, int i2, Map map, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = foldersConfig.maxFoldersPerOrg;
        }
        if ((i3 & 2) != 0) {
            i2 = foldersConfig.maxChatsPerFolder;
        }
        if ((i3 & 4) != 0) {
            map = foldersConfig.filters;
        }
        if ((i3 & 8) != 0) {
            list = foldersConfig.filtersList;
        }
        return foldersConfig.copy(i, i2, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxFoldersPerOrg() {
        return this.maxFoldersPerOrg;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxChatsPerFolder() {
        return this.maxChatsPerFolder;
    }

    public final Map<String, Filter> component3() {
        return this.filters;
    }

    public final List<String> component4() {
        return this.filtersList;
    }

    public final FoldersConfig copy(@Json(name = "max_folders_per_org") int maxFoldersPerOrg, @Json(name = "max_chats_per_folder") int maxChatsPerFolder, @Json(name = "types") Map<String, Filter> filters, @Json(name = "types_list") List<String> filtersList) {
        return new FoldersConfig(maxFoldersPerOrg, maxChatsPerFolder, filters, filtersList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FoldersConfig)) {
            return false;
        }
        FoldersConfig foldersConfig = (FoldersConfig) other;
        return this.maxFoldersPerOrg == foldersConfig.maxFoldersPerOrg && this.maxChatsPerFolder == foldersConfig.maxChatsPerFolder && jl40.l(this.filters, foldersConfig.filters) && jl40.l(this.filtersList, foldersConfig.filtersList);
    }

    public final Map<String, Filter> getFilters() {
        return this.filters;
    }

    public final List<String> getFiltersList() {
        return this.filtersList;
    }

    public final int getMaxChatsPerFolder() {
        return this.maxChatsPerFolder;
    }

    public final int getMaxFoldersPerOrg() {
        return this.maxFoldersPerOrg;
    }

    public int hashCode() {
        return this.filtersList.hashCode() + unr0.d(oyr.b(this.maxChatsPerFolder, Integer.hashCode(this.maxFoldersPerOrg) * 31, 31), 31, this.filters);
    }

    public String toString() {
        int i = this.maxFoldersPerOrg;
        int i2 = this.maxChatsPerFolder;
        Map<String, Filter> map = this.filters;
        List<String> list = this.filtersList;
        StringBuilder s = b64.s(i, i2, "FoldersConfig(maxFoldersPerOrg=", ", maxChatsPerFolder=", ", filters=");
        s.append(map);
        s.append(", filtersList=");
        s.append(list);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/core/net/entities/FoldersConfig$Filter;", "", "namespaces", "", "", "chatTypeIds", "name", "", "i18nKey", "avatarUrl", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNamespaces", "()Ljava/util/List;", "getChatTypeIds", "getName", "()Ljava/lang/String;", "getI18nKey", "getAvatarUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {
        private final String avatarUrl;
        private final List<Integer> chatTypeIds;
        private final String i18nKey;
        private final String name;
        private final List<Integer> namespaces;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Filter(List list, List list2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(r8 != 0 ? r0 : list, (i & 2) != 0 ? r0 : list2, str, str2, str3);
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
        }

        public static /* synthetic */ Filter copy$default(Filter filter, List list, List list2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = filter.namespaces;
            }
            if ((i & 2) != 0) {
                list2 = filter.chatTypeIds;
            }
            if ((i & 4) != 0) {
                str = filter.name;
            }
            if ((i & 8) != 0) {
                str2 = filter.i18nKey;
            }
            if ((i & 16) != 0) {
                str3 = filter.avatarUrl;
            }
            String str4 = str3;
            String str5 = str;
            return filter.copy(list, list2, str5, str2, str4);
        }

        public final List<Integer> component1() {
            return this.namespaces;
        }

        public final List<Integer> component2() {
            return this.chatTypeIds;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getI18nKey() {
            return this.i18nKey;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final Filter copy(@Json(name = "ns") List<Integer> namespaces, @Json(name = "chat_type") List<Integer> chatTypeIds, @Json(name = "name") String name, @Json(name = "i18n_key") String i18nKey, @Json(name = "avatar_id") String avatarUrl) {
            return new Filter(namespaces, chatTypeIds, name, i18nKey, avatarUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return jl40.l(this.namespaces, filter.namespaces) && jl40.l(this.chatTypeIds, filter.chatTypeIds) && jl40.l(this.name, filter.name) && jl40.l(this.i18nKey, filter.i18nKey) && jl40.l(this.avatarUrl, filter.avatarUrl);
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final List<Integer> getChatTypeIds() {
            return this.chatTypeIds;
        }

        public final String getI18nKey() {
            return this.i18nKey;
        }

        public final String getName() {
            return this.name;
        }

        public final List<Integer> getNamespaces() {
            return this.namespaces;
        }

        public int hashCode() {
            return this.avatarUrl.hashCode() + unr0.b(unr0.b(unr0.c(this.namespaces.hashCode() * 31, 31, this.chatTypeIds), 31, this.name), 31, this.i18nKey);
        }

        public String toString() {
            List<Integer> list = this.namespaces;
            List<Integer> list2 = this.chatTypeIds;
            String str = this.name;
            String str2 = this.i18nKey;
            String str3 = this.avatarUrl;
            StringBuilder v = qv10.v("Filter(namespaces=", list, ", chatTypeIds=", list2, ", name=");
            g8e.D(v, str, ", i18nKey=", str2, ", avatarUrl=");
            return oyr.t(v, str3, Extension.C_BRAKE);
        }

        public Filter(@Json(name = "ns") List<Integer> list, @Json(name = "chat_type") List<Integer> list2, @Json(name = "name") String str, @Json(name = "i18n_key") String str2, @Json(name = "avatar_id") String str3) {
            this.namespaces = list;
            this.chatTypeIds = list2;
            this.name = str;
            this.i18nKey = str2;
            this.avatarUrl = str3;
        }
    }

    public FoldersConfig(@Json(name = "max_folders_per_org") int i, @Json(name = "max_chats_per_folder") int i2, @Json(name = "types") Map<String, Filter> map, @Json(name = "types_list") List<String> list) {
        this.maxFoldersPerOrg = i;
        this.maxChatsPerFolder = i2;
        this.filters = map;
        this.filtersList = list;
    }

    public FoldersConfig() {
        this(0, 0, null, null, 15, null);
    }
}
