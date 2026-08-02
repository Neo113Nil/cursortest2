package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;

/* compiled from: VideoRestoredNetworkSnackbarManager.kt */
/* loaded from: classes3.dex */
public final class edt0 {
    public final Context a;
    public final Object b;
    public final Object c;
    public ikv0 d;

    /* compiled from: VideoRestoredNetworkSnackbarManager.kt */
    public static final class a implements w8i {
    }

    public edt0(Context context) {
        this.a = context;
        o2a0 o2a0Var = new o2a0(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, o2a0Var);
        this.c = msy.a(lazyThreadSafetyMode, new wcs0(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        ((com.vk.video.kidsprofile.restricteduseractions.a) this.c.getValue()).getClass();
        if (this.d != null) {
            return;
        }
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.e = 5000L;
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_globe_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(context.getString(R.string.restored_network_title_snackbar)), new ikv0.d.b(context.getString(R.string.restored_network_subtitle_snackbar)), (ikv0.d.a) null, 4);
        aVar.s = new ikv0.e.b(new gko(R.drawable.vk_icon_chevron_right_small_outline_24), new x7g(R.attr.vk_ui_icon_primary), new Size(cn70.b(24), cn70.b(24)), (izs) null, 24);
        aVar.g = new icn0(this, 12);
        aVar.h = new j6l0(this, 20);
        aVar.l = 80;
        HashSet hashSet = iah0.a;
        if (fnj.b(context)) {
            aVar.k = 1;
            aVar.g(81);
        }
        this.d = pkv0.f(aVar);
    }
}
