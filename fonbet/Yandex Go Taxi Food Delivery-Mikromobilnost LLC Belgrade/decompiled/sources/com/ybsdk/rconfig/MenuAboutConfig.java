package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.utils.text.Text;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/rconfig/MenuAboutConfig;", "", "", "Lcom/ybsdk/rconfig/MenuAboutConfig$AboutItem;", "menuItems", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/ybsdk/rconfig/MenuAboutConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMenuItems", "AboutItem", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MenuAboutConfig {

    @Json(name = "menu")
    private final List<AboutItem> menuItems;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/MenuAboutConfig$AboutItem;", "", "action", "", "title", "Lcom/ybsdk/core/utils/text/Text;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;)V", "getAction", "()Ljava/lang/String;", "getTitle", "()Lcom/ybsdk/core/utils/text/Text;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AboutItem {

        @Json(name = "action")
        private final String action;

        @Json(name = "title")
        private final Text title;

        public AboutItem(String str, Text text) {
            this.action = str;
            this.title = text;
        }

        public static /* synthetic */ AboutItem copy$default(AboutItem aboutItem, String str, Text text, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aboutItem.action;
            }
            if ((i & 2) != 0) {
                text = aboutItem.title;
            }
            return aboutItem.copy(str, text);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final Text getTitle() {
            return this.title;
        }

        public final AboutItem copy(String action, Text title) {
            return new AboutItem(action, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AboutItem)) {
                return false;
            }
            AboutItem aboutItem = (AboutItem) other;
            return jl40.l(this.action, aboutItem.action) && jl40.l(this.title, aboutItem.title);
        }

        public final String getAction() {
            return this.action;
        }

        public final Text getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.action.hashCode() * 31);
        }

        public String toString() {
            return "AboutItem(action=" + this.action + ", title=" + this.title + Extension.C_BRAKE;
        }
    }

    public MenuAboutConfig(List<AboutItem> list) {
        this.menuItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuAboutConfig copy$default(MenuAboutConfig menuAboutConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = menuAboutConfig.menuItems;
        }
        return menuAboutConfig.copy(list);
    }

    public final List<AboutItem> component1() {
        return this.menuItems;
    }

    public final MenuAboutConfig copy(List<AboutItem> menuItems) {
        return new MenuAboutConfig(menuItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MenuAboutConfig) && jl40.l(this.menuItems, ((MenuAboutConfig) other).menuItems);
    }

    public final List<AboutItem> getMenuItems() {
        return this.menuItems;
    }

    public int hashCode() {
        return this.menuItems.hashCode();
    }

    public String toString() {
        return tse0.k("MenuAboutConfig(menuItems=", Extension.C_BRAKE, this.menuItems);
    }
}
