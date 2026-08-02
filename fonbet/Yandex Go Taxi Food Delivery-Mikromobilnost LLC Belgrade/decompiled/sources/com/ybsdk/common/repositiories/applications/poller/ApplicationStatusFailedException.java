package com.ybsdk.common.repositiories.applications.poller;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.Deeplink;
import defpackage.jl40;
import defpackage.lao;
import defpackage.n;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/common/repositiories/applications/poller/ApplicationStatusFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/ybsdk/core/utils/text/Text;", "title", "Lcom/ybsdk/core/utils/text/Text;", "h", "()Lcom/ybsdk/core/utils/text/Text;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "c", "", "supportUrl", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "f", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "Llao;", "buttons", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "action", "Lcom/ybsdk/feature/deeplink/api/Deeplink;", "a", "()Lcom/ybsdk/feature/deeplink/api/Deeplink;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ApplicationStatusFailedException extends Exception {
    private final Deeplink action;
    private final List<lao> buttons;
    private final Text description;
    private final Themes<String> image;
    private final String supportUrl;
    private final Text title;

    public /* synthetic */ ApplicationStatusFailedException(Text text, Text text2, String str, Themes themes, List list, int i) {
        this(text, text2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : themes, (i & 16) != 0 ? null : list, (Deeplink) null);
    }

    /* renamed from: a, reason: from getter */
    public final Deeplink getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final List getButtons() {
        return this.buttons;
    }

    /* renamed from: c, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationStatusFailedException)) {
            return false;
        }
        ApplicationStatusFailedException applicationStatusFailedException = (ApplicationStatusFailedException) obj;
        return jl40.l(this.title, applicationStatusFailedException.title) && jl40.l(this.description, applicationStatusFailedException.description) && jl40.l(this.supportUrl, applicationStatusFailedException.supportUrl) && jl40.l(this.image, applicationStatusFailedException.image) && jl40.l(this.buttons, applicationStatusFailedException.buttons) && jl40.l(this.action, applicationStatusFailedException.action);
    }

    /* renamed from: f, reason: from getter */
    public final Themes getImage() {
        return this.image;
    }

    /* renamed from: g, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: h, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int c = n.c(this.description, this.title.hashCode() * 31, 31);
        String str = this.supportUrl;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Themes<String> themes = this.image;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        List<lao> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Deeplink deeplink = this.action;
        return hashCode3 + (deeplink != null ? deeplink.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        Text text = this.title;
        Text text2 = this.description;
        String str = this.supportUrl;
        Themes<String> themes = this.image;
        List<lao> list = this.buttons;
        Deeplink deeplink = this.action;
        StringBuilder p = n.p("ApplicationStatusFailedException(title=", text, ", description=", text2, ", supportUrl=");
        n.B(p, str, ", image=", themes, ", buttons=");
        p.append(list);
        p.append(", action=");
        p.append(deeplink);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }

    public ApplicationStatusFailedException(Text text, Text text2, String str, Themes themes, List list, Deeplink deeplink) {
        this.title = text;
        this.description = text2;
        this.supportUrl = str;
        this.image = themes;
        this.buttons = list;
        this.action = deeplink;
    }
}
