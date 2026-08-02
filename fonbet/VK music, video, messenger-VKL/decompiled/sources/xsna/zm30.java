package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.c;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import kotlin.LazyThreadSafetyMode;
import xsna.vm30;

/* compiled from: MsgListVcEmptyPlaceholderController.kt */
/* loaded from: classes2.dex */
public final class zm30 {
    public final vm30.d a;
    public final Context b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final bpn0 f = new bpn0(new hy2(19));

    @SuppressLint({"SimpleDateFormat"})
    public final bpn0 g = new bpn0(new h1j(this, 25));
    public final bpn0 h = new bpn0(new wzh(this, 24));

    /* compiled from: MsgListVcEmptyPlaceholderController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zm30(View view, vm30.d dVar) {
        this.a = dVar;
        this.b = view.getContext();
        this.e = msy.a(LazyThreadSafetyMode.NONE, new acv(view, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ImPlaceholder a() {
        return (ImPlaceholder) this.e.getValue();
    }

    public final void b(qtd0 qtd0Var) {
        String str;
        ImPlaceholder a2 = a();
        fxj0 o = ixj0.o(qtd0Var.C8());
        if (o == null || (str = o.getUrl()) == null) {
            str = "";
        }
        com.vk.im.ui.views.avatars.b bVar = (com.vk.im.ui.views.avatars.b) this.h.getValue();
        bVar.getClass();
        a2.setTop(new ImPlaceholder.a.C1101a(new c.d(str, new eko(bVar.e(qtd0Var.name(), qtd0Var.t8()))), iah0.a(56)));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(boolean z) {
        this.d = z;
        if (this.e.isInitialized() && this.c != z) {
            this.c = z;
            if (z) {
                d3m.c(a(), (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                d3m.e(a(), (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        }
    }
}
