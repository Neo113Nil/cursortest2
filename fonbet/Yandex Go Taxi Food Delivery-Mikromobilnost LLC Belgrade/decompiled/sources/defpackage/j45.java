package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.a;

/* loaded from: classes12.dex */
public final class j45 implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public j45(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.a = 2;
        this.b = lifecycle;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new zi(10), 500L);
                ((pey) obj).getLifecycle().d(this);
                break;
            case 1:
                ((a) obj).c();
                break;
            default:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new uj(18), 500L);
                ((Lifecycle) obj).d(this);
                break;
        }
    }

    public /* synthetic */ j45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
