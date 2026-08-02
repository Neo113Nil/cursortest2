package com.yandex.messaging.internal.entities;

import android.net.Uri;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/internal/entities/MessageSpan;", "", "start", "", "end", "flags", "strUri", "", "<init>", "(IIILjava/lang/String;)V", "getStart", "()I", "getEnd", "getFlags", "getStrUri", "()Ljava/lang/String;", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessageSpan {

    @Json(name = "end")
    private final int end;

    @Json(name = "flags")
    private final int flags;

    @Json(name = "start")
    private final int start;

    @Json(name = LaunchBrowserActivity.KEY_URI)
    private final String strUri;
    private final Uri uri;

    public MessageSpan(int i, int i2, int i3, String str) {
        this.start = i;
        this.end = i2;
        this.flags = i3;
        this.strUri = str;
        this.uri = Uri.parse(str);
    }

    public static /* synthetic */ MessageSpan copy$default(MessageSpan messageSpan, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = messageSpan.start;
        }
        if ((i4 & 2) != 0) {
            i2 = messageSpan.end;
        }
        if ((i4 & 4) != 0) {
            i3 = messageSpan.flags;
        }
        if ((i4 & 8) != 0) {
            str = messageSpan.strUri;
        }
        return messageSpan.copy(i, i2, i3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStrUri() {
        return this.strUri;
    }

    public final MessageSpan copy(int start, int end, int flags, String strUri) {
        return new MessageSpan(start, end, flags, strUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSpan)) {
            return false;
        }
        MessageSpan messageSpan = (MessageSpan) other;
        return this.start == messageSpan.start && this.end == messageSpan.end && this.flags == messageSpan.flags && jl40.l(this.strUri, messageSpan.strUri);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final int getStart() {
        return this.start;
    }

    public final String getStrUri() {
        return this.strUri;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.strUri.hashCode() + oyr.b(this.flags, oyr.b(this.end, Integer.hashCode(this.start) * 31, 31), 31);
    }

    public String toString() {
        return xvz.h(this.flags, ", strUri=", this.strUri, Extension.C_BRAKE, b64.s(this.start, this.end, "MessageSpan(start=", ", end=", ", flags="));
    }
}
