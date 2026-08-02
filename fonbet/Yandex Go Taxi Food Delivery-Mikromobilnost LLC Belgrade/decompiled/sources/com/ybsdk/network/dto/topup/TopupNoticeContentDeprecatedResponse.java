package com.ybsdk.network.dto.topup;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.n;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "image", "themedImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "button", "Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse$Button;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse$Button;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getImage$annotations", "()V", "getImage", "getThemedImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getButton", "()Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse$Button;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", PlusPayUiKitInflaterFactory.NAME_BUTTON, "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupNoticeContentDeprecatedResponse {
    private final Button button;
    private final String description;
    private final String image;
    private final Themes<String> themedImage;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupNoticeContentDeprecatedResponse$Button;", "", "text", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {
        private final String action;
        private final String text;

        public Button(@Json(name = "text") String str, @Json(name = "action") String str2) {
            this.text = str;
            this.action = str2;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.text;
            }
            if ((i & 2) != 0) {
                str2 = button.action;
            }
            return button.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final Button copy(@Json(name = "text") String text, @Json(name = "action") String action) {
            return new Button(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return jl40.l(this.text, button.text) && jl40.l(this.action, button.action);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("Button(text=", this.text, ", action=", this.action, Extension.C_BRAKE);
        }
    }

    public TopupNoticeContentDeprecatedResponse(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "image") String str3, @Json(name = "themed_image") Themes<String> themes, @Json(name = "button") Button button) {
        this.title = str;
        this.description = str2;
        this.image = str3;
        this.themedImage = themes;
        this.button = button;
    }

    public static /* synthetic */ TopupNoticeContentDeprecatedResponse copy$default(TopupNoticeContentDeprecatedResponse topupNoticeContentDeprecatedResponse, String str, String str2, String str3, Themes themes, Button button, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topupNoticeContentDeprecatedResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = topupNoticeContentDeprecatedResponse.description;
        }
        if ((i & 4) != 0) {
            str3 = topupNoticeContentDeprecatedResponse.image;
        }
        if ((i & 8) != 0) {
            themes = topupNoticeContentDeprecatedResponse.themedImage;
        }
        if ((i & 16) != 0) {
            button = topupNoticeContentDeprecatedResponse.button;
        }
        Button button2 = button;
        String str4 = str3;
        return topupNoticeContentDeprecatedResponse.copy(str, str2, str4, themes, button2);
    }

    @jxi
    public static /* synthetic */ void getImage$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final Themes<String> component4() {
        return this.themedImage;
    }

    /* renamed from: component5, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    public final TopupNoticeContentDeprecatedResponse copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "image") String image, @Json(name = "themed_image") Themes<String> themedImage, @Json(name = "button") Button button) {
        return new TopupNoticeContentDeprecatedResponse(title, description, image, themedImage, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupNoticeContentDeprecatedResponse)) {
            return false;
        }
        TopupNoticeContentDeprecatedResponse topupNoticeContentDeprecatedResponse = (TopupNoticeContentDeprecatedResponse) other;
        return jl40.l(this.title, topupNoticeContentDeprecatedResponse.title) && jl40.l(this.description, topupNoticeContentDeprecatedResponse.description) && jl40.l(this.image, topupNoticeContentDeprecatedResponse.image) && jl40.l(this.themedImage, topupNoticeContentDeprecatedResponse.themedImage) && jl40.l(this.button, topupNoticeContentDeprecatedResponse.button);
    }

    public final Button getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImage() {
        return this.image;
    }

    public final Themes<String> getThemedImage() {
        return this.themedImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.description), 31, this.image);
        Themes<String> themes = this.themedImage;
        return this.button.hashCode() + ((b + (themes == null ? 0 : themes.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.image;
        Themes<String> themes = this.themedImage;
        Button button = this.button;
        StringBuilder v = b64.v("TopupNoticeContentDeprecatedResponse(title=", str, ", description=", str2, ", image=");
        n.B(v, str3, ", themedImage=", themes, ", button=");
        v.append(button);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
