package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.vk.voip.ui.call_by_link.ui.VoipCallByLinkViewState;
import com.vk.voip.ui.call_by_link.ui.a;
import kotlin.LazyThreadSafetyMode;
import xsna.tzp0;

/* compiled from: VoipCallByLinkMediaSettingView.kt */
/* loaded from: classes7.dex */
public final class hgw0 {
    public final Context a;
    public final kgw0<a.b> b;
    public final tzp0.c c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public dw20 n;

    /* compiled from: VoipCallByLinkMediaSettingView.kt */
    public final class a implements DialogInterface.OnDismissListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            hgw0.this.b.a(a.b.C2036a.a);
        }
    }

    /* compiled from: VoipCallByLinkMediaSettingView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting.values().length];
            try {
                iArr[VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting.MICROPHONES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipCallByLinkViewState.MediaSettingDialog.Visible.Setting.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hgw0(Context context, kgw0 kgw0Var) {
        tzp0.c a2 = tzp0.a(null, 3);
        this.a = context;
        this.b = kgw0Var;
        this.c = a2;
        e1s0 e1s0Var = new e1s0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, e1s0Var);
        this.e = msy.a(lazyThreadSafetyMode, new i8n0(this, 16));
        this.f = msy.a(lazyThreadSafetyMode, new prq0(this, 22));
        this.g = msy.a(lazyThreadSafetyMode, new wmd0(this, 26));
        this.h = msy.a(lazyThreadSafetyMode, new j8n0(this, 25));
        this.i = msy.a(lazyThreadSafetyMode, new cqr0(this, 13));
        this.j = msy.a(lazyThreadSafetyMode, new uho0(this, 18));
        this.k = msy.a(lazyThreadSafetyMode, new avj0(this, 26));
        this.l = msy.a(lazyThreadSafetyMode, new ksq0(this, 14));
        this.m = msy.a(lazyThreadSafetyMode, new cck0(this, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View a() {
        return (View) this.d.getValue();
    }
}
