package xsna;

import android.view.View;
import com.vk.navigation.NavigationDelegateActivity;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoUploadSnackBarsHolder.kt */
/* loaded from: classes.dex */
public final class rot0 {
    public final NavigationDelegateActivity a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rot0(NavigationDelegateActivity navigationDelegateActivity, boolean z) {
        this.a = navigationDelegateActivity;
        this.b = z;
        hia hiaVar = new hia(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, hiaVar);
        this.d = msy.a(lazyThreadSafetyMode, new m66(this, 9));
        this.e = msy.a(lazyThreadSafetyMode, new n66(this, 11));
        this.f = msy.a(lazyThreadSafetyMode, new o66(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View a() {
        return (View) this.c.getValue();
    }
}
