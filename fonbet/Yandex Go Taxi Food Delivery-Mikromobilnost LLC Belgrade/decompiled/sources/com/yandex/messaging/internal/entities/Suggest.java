package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/yandex/messaging/internal/entities/Suggest;", "", "text", "", "directives", "", "Lcom/yandex/messaging/core/net/entities/directives/Directive;", "errorsOnParsing", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "buttonId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getDirectives", "()Ljava/util/List;", "getErrorsOnParsing", "getButtonId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Suggest {
    private final String buttonId;
    private final List<Directive> directives;
    private final List<BotRequest.Error> errorsOnParsing;
    private final String text;

    public /* synthetic */ Suggest(String str, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Suggest copy$default(Suggest suggest, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggest.text;
        }
        if ((i & 2) != 0) {
            list = suggest.directives;
        }
        if ((i & 4) != 0) {
            list2 = suggest.errorsOnParsing;
        }
        if ((i & 8) != 0) {
            str2 = suggest.buttonId;
        }
        return suggest.copy(str, list, list2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Directive> component2() {
        return this.directives;
    }

    public final List<BotRequest.Error> component3() {
        return this.errorsOnParsing;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonId() {
        return this.buttonId;
    }

    public final Suggest copy(@Json(name = "text") String text, @Json(name = "directives") List<? extends Directive> directives, @Json(name = "errors_on_parsing") List<BotRequest.Error> errorsOnParsing, @Json(name = "button_id") String buttonId) {
        return new Suggest(text, directives, errorsOnParsing, buttonId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Suggest)) {
            return false;
        }
        Suggest suggest = (Suggest) other;
        return jl40.l(this.text, suggest.text) && jl40.l(this.directives, suggest.directives) && jl40.l(this.errorsOnParsing, suggest.errorsOnParsing) && jl40.l(this.buttonId, suggest.buttonId);
    }

    public final String getButtonId() {
        return this.buttonId;
    }

    public final List<Directive> getDirectives() {
        return this.directives;
    }

    public final List<BotRequest.Error> getErrorsOnParsing() {
        return this.errorsOnParsing;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int c = unr0.c(this.text.hashCode() * 31, 31, this.directives);
        List<BotRequest.Error> list = this.errorsOnParsing;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.buttonId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        List<Directive> list = this.directives;
        return n.l(", buttonId=", this.buttonId, Extension.C_BRAKE, xvz.r("Suggest(text=", str, ", directives=", list, ", errorsOnParsing="), this.errorsOnParsing);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Suggest(@Json(name = "text") String str, @Json(name = "directives") List<? extends Directive> list, @Json(name = "errors_on_parsing") List<BotRequest.Error> list2, @Json(name = "button_id") String str2) {
        this.text = str;
        this.directives = list;
        this.errorsOnParsing = list2;
        this.buttonId = str2;
    }
}
