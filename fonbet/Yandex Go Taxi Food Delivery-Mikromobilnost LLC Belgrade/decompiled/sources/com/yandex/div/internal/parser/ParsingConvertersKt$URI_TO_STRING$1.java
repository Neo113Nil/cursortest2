package com.yandex.div.internal.parser;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", LaunchBrowserActivity.KEY_URI, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParsingConvertersKt$URI_TO_STRING$1 extends Lambda implements tls {
    public static final ParsingConvertersKt$URI_TO_STRING$1 w = new ParsingConvertersKt$URI_TO_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((Uri) obj).toString();
    }
}
