package androidx.emoji2.text;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import defpackage.ryr;

/* loaded from: classes10.dex */
class FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 extends ContentObserver {
    final /* synthetic */ ryr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1(ryr ryrVar, Handler handler) {
        super(handler);
        this.this$0 = ryrVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        this.this$0.c();
    }
}
