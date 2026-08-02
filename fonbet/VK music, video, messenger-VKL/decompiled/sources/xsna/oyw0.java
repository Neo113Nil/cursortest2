package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.vk.core.apps.BuildInfo;
import com.vk.voip.api.id.CallId;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;

/* compiled from: VoipScheduledCallShareDialog.kt */
/* loaded from: classes7.dex */
public final class oyw0 {
    public final Context a;
    public final CallId b;
    public final g1x0 c;
    public final f1x0 d;
    public final mcd e;
    public final dnw0 f;

    /* compiled from: VoipScheduledCallShareDialog.kt */
    public static final class a extends dw20 {
        public String f1;
        public og0 g1;

        /* compiled from: VoipScheduledCallShareDialog.kt */
        /* renamed from: xsna.oyw0$a$a, reason: collision with other inner class name */
        public static class C3479a extends dw20.b {
            public final String e;

            public C3479a(Context context, String str) {
                super(context, null);
                this.e = str;
            }

            @Override // xsna.dw20.b, xsna.dw20.a
            public final dw20 f() {
                a aVar = new a();
                aVar.f1 = this.e;
                return aVar;
            }
        }

        /* compiled from: VoipScheduledCallShareDialog.kt */
        public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
                return s3q0.a;
            }
        }

        @Override // androidx.fragment.app.Fragment
        public final void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            String str = this.f1;
            if (str != null) {
                og0 og0Var = this.g1;
                if (og0Var == null) {
                    og0Var = null;
                }
                io.reactivex.rxjava3.kotlin.c.g((!((bsb0) og0Var.c).a() ? io.reactivex.rxjava3.core.a.k(new IllegalAccessException()) : io.reactivex.rxjava3.core.a.l(new yul(0, og0Var, str)).q(io.reactivex.rxjava3.schedulers.a.b())).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), null, 2);
            }
        }

        @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
        public final void onAttach(Context context) {
            super.onAttach(context);
            this.g1 = new og0(new qz8(context.getContentResolver()), new bsb0(context));
        }
    }

    public oyw0(Context context, CallId callId, g1x0 g1x0Var, f1x0 f1x0Var, String str, mcd mcdVar, dnw0 dnw0Var) {
        this.a = context;
        this.b = callId;
        this.c = g1x0Var;
        this.d = f1x0Var;
        this.e = mcdVar;
        this.f = dnw0Var;
    }

    public static Intent a(Context context, g1x0 g1x0Var) {
        Uri uriForFile = FileProvider.getUriForFile(context, BuildInfo.f, g1x0Var.c);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/ics");
        intent.putExtra("android.intent.extra.SUBJECT", g1x0Var.a);
        intent.putExtra("android.intent.extra.TEXT", brm0.y(g1x0Var.b, "\\n", "\n"));
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        return intent;
    }
}
