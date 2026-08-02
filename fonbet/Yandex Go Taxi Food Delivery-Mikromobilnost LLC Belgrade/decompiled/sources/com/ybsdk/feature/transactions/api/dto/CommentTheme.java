package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/CommentTheme;", "", C0553n3.g, "", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackground", "()Ljava/lang/String;", "getTextColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommentTheme {
    private final String background;
    private final String textColor;

    public CommentTheme(@Json(name = "background_color") String str, @Json(name = "text_color") String str2) {
        this.background = str;
        this.textColor = str2;
    }

    public static /* synthetic */ CommentTheme copy$default(CommentTheme commentTheme, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commentTheme.background;
        }
        if ((i & 2) != 0) {
            str2 = commentTheme.textColor;
        }
        return commentTheme.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final CommentTheme copy(@Json(name = "background_color") String background, @Json(name = "text_color") String textColor) {
        return new CommentTheme(background, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentTheme)) {
            return false;
        }
        CommentTheme commentTheme = (CommentTheme) other;
        return jl40.l(this.background, commentTheme.background) && jl40.l(this.textColor, commentTheme.textColor);
    }

    public final String getBackground() {
        return this.background;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode() + (this.background.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("CommentTheme(background=", this.background, ", textColor=", this.textColor, Extension.C_BRAKE);
    }
}
