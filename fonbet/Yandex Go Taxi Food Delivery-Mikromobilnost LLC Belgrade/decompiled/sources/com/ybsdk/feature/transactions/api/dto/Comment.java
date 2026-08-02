package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/Comment;", "", "text", "", "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/transactions/api/dto/CommentTheme;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getText", "()Ljava/lang/String;", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Comment {
    private final String text;
    private final Themes<CommentTheme> themes;

    public Comment(@Json(name = "text") String str, @Json(name = "themes") Themes<CommentTheme> themes) {
        this.text = str;
        this.themes = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Comment copy$default(Comment comment, String str, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comment.text;
        }
        if ((i & 2) != 0) {
            themes = comment.themes;
        }
        return comment.copy(str, themes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final Themes<CommentTheme> component2() {
        return this.themes;
    }

    public final Comment copy(@Json(name = "text") String text, @Json(name = "themes") Themes<CommentTheme> themes) {
        return new Comment(text, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) other;
        return jl40.l(this.text, comment.text) && jl40.l(this.themes, comment.themes);
    }

    public final String getText() {
        return this.text;
    }

    public final Themes<CommentTheme> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        return this.themes.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "Comment(text=" + this.text + ", themes=" + this.themes + Extension.C_BRAKE;
    }
}
