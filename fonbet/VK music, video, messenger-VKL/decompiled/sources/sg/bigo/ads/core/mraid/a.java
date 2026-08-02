package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes9.dex */
final class a extends ContentObserver {
    private float a;
    private final Context b;
    private final InterfaceC2464a c;

    /* renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC2464a {
        void a(float f);
    }

    public a(Handler handler, Context context, InterfaceC2464a interfaceC2464a) {
        super(handler);
        this.a = -1.0f;
        this.b = context.getApplicationContext();
        this.c = interfaceC2464a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float streamVolume = ((AudioManager) this.b.getSystemService("audio")) != null ? 100.0f * (r4.getStreamVolume(3) / r4.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.a) {
            this.a = streamVolume;
            InterfaceC2464a interfaceC2464a = this.c;
            if (interfaceC2464a != null) {
                interfaceC2464a.a(this.a);
            }
        }
    }
}
