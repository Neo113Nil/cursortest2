package com.ybsdk.rconfig.configs;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.domain.entities.BottomBarIcon;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import defpackage.bj11;
import defpackage.dac;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.nb6;
import defpackage.pb6;
import defpackage.qb6;
import defpackage.unr0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig;", "", "", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TabBarItem;", "items", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "tsarButton", "<init>", "(Ljava/util/List;Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "copy", "(Ljava/util/List;Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;)Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "getTsarButton", "TabBarItem", "TsarButtonConfig", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class YbMobileTabBarConfig {

    @Json(name = "items")
    private final List<TabBarItem> items;

    @Json(name = "tsar_button")
    private final TsarButtonConfig tsarButton;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "", "Lcom/ybsdk/core/utils/text/Text;", "text", "", "action", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)V", "Lbj11;", "toEntity", "()Lbj11;", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TsarButtonConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getText", "Ljava/lang/String;", "getAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TsarButtonConfig {

        @Json(name = "action")
        private final String action;

        @Json(name = "text")
        private final Text text;

        public TsarButtonConfig(Text text, String str) {
            this.text = text;
            this.action = str;
        }

        public static /* synthetic */ TsarButtonConfig copy$default(TsarButtonConfig tsarButtonConfig, Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                text = tsarButtonConfig.text;
            }
            if ((i & 2) != 0) {
                str = tsarButtonConfig.action;
            }
            return tsarButtonConfig.copy(text, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Text getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final TsarButtonConfig copy(Text text, String action) {
            return new TsarButtonConfig(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TsarButtonConfig)) {
                return false;
            }
            TsarButtonConfig tsarButtonConfig = (TsarButtonConfig) other;
            return jl40.l(this.text, tsarButtonConfig.text) && jl40.l(this.action, tsarButtonConfig.action);
        }

        public final String getAction() {
            return this.action;
        }

        public final Text getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public final bj11 toEntity() {
            return new bj11(this.text, this.action);
        }

        public String toString() {
            return "TsarButtonConfig(text=" + this.text + ", action=" + this.action + Extension.C_BRAKE;
        }
    }

    public /* synthetic */ YbMobileTabBarConfig(List list, TsarButtonConfig tsarButtonConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : tsarButtonConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbMobileTabBarConfig copy$default(YbMobileTabBarConfig ybMobileTabBarConfig, List list, TsarButtonConfig tsarButtonConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ybMobileTabBarConfig.items;
        }
        if ((i & 2) != 0) {
            tsarButtonConfig = ybMobileTabBarConfig.tsarButton;
        }
        return ybMobileTabBarConfig.copy(list, tsarButtonConfig);
    }

    public final List<TabBarItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final TsarButtonConfig getTsarButton() {
        return this.tsarButton;
    }

    public final YbMobileTabBarConfig copy(List<TabBarItem> items, TsarButtonConfig tsarButton) {
        return new YbMobileTabBarConfig(items, tsarButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbMobileTabBarConfig)) {
            return false;
        }
        YbMobileTabBarConfig ybMobileTabBarConfig = (YbMobileTabBarConfig) other;
        return jl40.l(this.items, ybMobileTabBarConfig.items) && jl40.l(this.tsarButton, ybMobileTabBarConfig.tsarButton);
    }

    public final List<TabBarItem> getItems() {
        return this.items;
    }

    public final TsarButtonConfig getTsarButton() {
        return this.tsarButton;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        TsarButtonConfig tsarButtonConfig = this.tsarButton;
        return hashCode + (tsarButtonConfig == null ? 0 : tsarButtonConfig.hashCode());
    }

    public String toString() {
        return "YbMobileTabBarConfig(items=" + this.items + ", tsarButton=" + this.tsarButton + Extension.C_BRAKE;
    }

    public YbMobileTabBarConfig(List<TabBarItem> list, TsarButtonConfig tsarButtonConfig) {
        this.items = list;
        this.tsarButton = tsarButtonConfig;
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TabBarItem;", "", "", "id", "Lcom/ybsdk/core/utils/text/Text;", "title", "imageId", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Ljava/lang/String;)V", "Lpb6;", "toEntity", "()Lpb6;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/rconfig/configs/YbMobileTabBarConfig$TabBarItem;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getImageId", "getDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TabBarItem {

        @Json(name = Constants.DEEPLINK)
        private final String deeplink;

        @Json(name = "id")
        private final String id;

        @Json(name = "image_id")
        private final String imageId;

        @Json(name = "title")
        private final Text title;

        public TabBarItem(String str, Text text, String str2, String str3) {
            this.id = str;
            this.title = text;
            this.imageId = str2;
            this.deeplink = str3;
        }

        public static /* synthetic */ TabBarItem copy$default(TabBarItem tabBarItem, String str, Text text, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tabBarItem.id;
            }
            if ((i & 2) != 0) {
                text = tabBarItem.title;
            }
            if ((i & 4) != 0) {
                str2 = tabBarItem.imageId;
            }
            if ((i & 8) != 0) {
                str3 = tabBarItem.deeplink;
            }
            return tabBarItem.copy(str, text, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Text getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImageId() {
            return this.imageId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final TabBarItem copy(String id, Text title, String imageId, String deeplink) {
            return new TabBarItem(id, title, imageId, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabBarItem)) {
                return false;
            }
            TabBarItem tabBarItem = (TabBarItem) other;
            return jl40.l(this.id, tabBarItem.id) && jl40.l(this.title, tabBarItem.title) && jl40.l(this.imageId, tabBarItem.imageId) && jl40.l(this.deeplink, tabBarItem.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getId() {
            return this.id;
        }

        public final String getImageId() {
            return this.imageId;
        }

        public final Text getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b = unr0.b(n.c(this.title, this.id.hashCode() * 31, 31), 31, this.imageId);
            String str = this.deeplink;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final pb6 toEntity() {
            qb6 qb6Var = BottomBarItemId.Companion;
            String str = this.id;
            qb6Var.getClass();
            BottomBarItemId a = qb6.a(str);
            Object obj = null;
            if (a == null) {
                dac.f(this.id, "Unknown bottom bar item: ");
                return null;
            }
            Text text = this.title;
            nb6 nb6Var = BottomBarIcon.Companion;
            String str2 = this.imageId;
            nb6Var.getClass();
            Iterator<E> it = BottomBarIcon.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((BottomBarIcon) next).getId(), str2)) {
                    obj = next;
                    break;
                }
            }
            return new pb6(a, text, (BottomBarIcon) obj, this.deeplink);
        }

        public String toString() {
            String str = this.id;
            Text text = this.title;
            String str2 = this.imageId;
            String str3 = this.deeplink;
            StringBuilder sb = new StringBuilder("TabBarItem(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(text);
            sb.append(", imageId=");
            return g8e.r(sb, str2, ", deeplink=", str3, Extension.C_BRAKE);
        }

        public /* synthetic */ TabBarItem(String str, Text text, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, text, str2, (i & 8) != 0 ? null : str3);
        }
    }
}
