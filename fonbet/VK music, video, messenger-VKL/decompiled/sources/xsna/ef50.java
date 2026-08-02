package xsna;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ikv0;
import xsna.k840;

/* compiled from: MusicVpnSnackbarManager.kt */
/* loaded from: classes3.dex */
public final class ef50 implements w8i {
    public static final int g = iah0.a(8);
    public static final long h = TimeUnit.HOURS.toMillis(1);
    public static final int i = 10;
    public final FunctionReferenceImpl b;
    public final bpn0 c = new bpn0(new l1i(this, 16));
    public final WeakReference<ViewGroup> d;
    public ikv0 e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ef50(ViewGroup viewGroup, gzs gzsVar) {
        this.b = (FunctionReferenceImpl) gzsVar;
        this.d = new WeakReference<>(viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final void a(Context context, boolean z) {
        if (!r6m.i() || ((Boolean) this.b.invoke()).booleanValue()) {
            return;
        }
        bpn0 bpn0Var = this.c;
        if (z) {
            if (System.currentTimeMillis() - ((com.vk.music.pref.a) bpn0Var.getValue()).H0() <= h) {
                return;
            }
        } else if (this.f) {
            return;
        }
        ViewGroup viewGroup = this.d.get();
        this.f = true;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_info_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.music_vpn_alert), (String) null, (ikv0.d.a) null, 6);
        aVar.e = i * 1000;
        aVar.h = new l8k(26);
        if (viewGroup != null) {
            aVar.o = Integer.valueOf(g);
            aVar.g(80);
        }
        ikv0 b = aVar.b();
        this.e = b;
        if (viewGroup == null) {
            b.c();
        } else {
            utj utjVar = b.b;
            utjVar.l = null;
            utjVar.m = new WeakReference<>(viewGroup);
            utjVar.e();
        }
        if (z) {
            ((com.vk.music.pref.a) bpn0Var.getValue()).C(System.currentTimeMillis());
        }
        s750 s750Var = k840.a.e;
        (s750Var != null ? s750Var : null).D0();
    }
}
