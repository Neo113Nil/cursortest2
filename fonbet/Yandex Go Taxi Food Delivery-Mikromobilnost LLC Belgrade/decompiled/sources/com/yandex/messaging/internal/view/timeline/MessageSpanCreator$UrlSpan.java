package com.yandex.messaging.internal.view.timeline;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.f3c;
import defpackage.lhc;
import defpackage.oyh0;
import defpackage.ulz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.XAdES.XAdESParameters;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"com/yandex/messaging/internal/view/timeline/MessageSpanCreator$UrlSpan", "Landroid/text/style/ClickableSpan;", "Lulz;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "", "canShare", "<init>", "(Lcom/yandex/messaging/internal/view/timeline/l;Landroid/net/Uri;Z)V", "Landroid/content/Context;", "context", "Lzy11;", "copy", "(Landroid/content/Context;)V", "Landroid/view/View;", "widget", "onClick", "(Landroid/view/View;)V", "onLongClick", "Landroid/text/TextPaint;", XAdESParameters.XML_SIGNATURE_PREFIX, "updateDrawState", "(Landroid/text/TextPaint;)V", "", "getHighlightColor", "()I", "Landroid/net/Uri;", "Z", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class MessageSpanCreator$UrlSpan extends ClickableSpan implements ulz {
    private final boolean canShare;
    final /* synthetic */ l this$0;
    private final Uri uri;

    public MessageSpanCreator$UrlSpan(l lVar, Uri uri, boolean z) {
        this.this$0 = lVar;
        this.uri = uri;
        this.canShare = z;
    }

    private final void copy(Context context) {
        f3c f3cVar = this.this$0.b;
        Uri uri = this.uri;
        f3cVar.getClass();
        try {
            f3cVar.b().setPrimaryClip(ClipData.newRawUri("Link", uri));
            int i = oyh0.invitelink_copied_notification;
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(context, i, 1).show();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.ulz
    public int getHighlightColor() {
        return lhc.f(this.this$0.c, 51);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        this.this$0.a.C(this.uri);
    }

    @Override // defpackage.ulz
    public void onLongClick(View widget) {
        if (this.canShare) {
            Context context = widget.getContext();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", this.uri.toString());
            intent.setType("text/plain");
            context.startActivity(Intent.createChooser(intent, this.uri.toString()));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(false);
        ds.setColor(this.this$0.c);
    }

    public /* synthetic */ MessageSpanCreator$UrlSpan(l lVar, Uri uri, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, uri, (i & 2) != 0 ? true : z);
    }
}
