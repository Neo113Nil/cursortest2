package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import defpackage.ye3;

/* loaded from: classes10.dex */
final class AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver extends ContentObserver {
    private final ContentResolver resolver;
    private final Uri settingUri;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCapabilitiesReceiver$ExternalSurroundSoundSettingObserver(a aVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.this$0 = aVar;
        this.resolver = contentResolver;
        this.settingUri = uri;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        a aVar = this.this$0;
        aVar.a(ye3.b(aVar.a, aVar.i, aVar.h));
    }

    public void register() {
        this.resolver.registerContentObserver(this.settingUri, false, this);
    }

    public void unregister() {
        this.resolver.unregisterContentObserver(this);
    }
}
