package xsna;

import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.hints.Hint;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;
import xsna.m5x0;

/* compiled from: VoipVmojiView.kt */
/* loaded from: classes7.dex */
public final class f6x0 {
    public final View a;
    public final g6x0 b;
    public final va9 c;
    public final View d;
    public final io.reactivex.rxjava3.internal.operators.observable.p1 e;
    public c f;
    public final View g;
    public final TextView h;
    public final View i;
    public final View j;
    public final ImageView k;
    public final VKImageView l;
    public final io.reactivex.rxjava3.subjects.d<Boolean> m;
    public final io.reactivex.rxjava3.subjects.d<b> n;
    public final io.reactivex.rxjava3.disposables.b o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipVmojiView.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b EMPTY;
        public static final b LOADING;
        public static final b NO_VMOJI;
        public static final b VMOJI_PRESENT;

        static {
            b bVar = new b("EMPTY", 0);
            EMPTY = bVar;
            b bVar2 = new b("LOADING", 1);
            LOADING = bVar2;
            b bVar3 = new b("NO_VMOJI", 2);
            NO_VMOJI = bVar3;
            b bVar4 = new b("VMOJI_PRESENT", 3);
            VMOJI_PRESENT = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public f6x0(View view, g6x0 g6x0Var, va9 va9Var) {
        Map<String, String> map;
        String str;
        io.reactivex.rxjava3.core.x K;
        this.a = view;
        this.b = g6x0Var;
        this.c = va9Var;
        this.d = view.findViewById(R.id.vmoji_text_views);
        this.e = va9Var.i();
        View findViewById = view.findViewById(R.id.vmoji_create_vmoji);
        int i = 2;
        bwt0.i0(findViewById, new l6w0(this, i));
        this.g = findViewById;
        TextView textView = (TextView) view.findViewById(R.id.vmoji_enable_vmoji);
        bwt0.i0(textView, new svk0(this, 25));
        this.h = textView;
        View findViewById2 = view.findViewById(R.id.vmoji_edit_vmoji);
        bwt0.i0(findViewById2, new ptl0(this, 26));
        this.i = findViewById2;
        this.j = view.findViewById(R.id.vmoji_progress);
        ImageView imageView = (ImageView) view.findViewById(R.id.vmoji_avatar);
        imageView.setClipToOutline(true);
        this.k = imageView;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.vmoji_placeholder);
        this.l = vKImageView;
        io.reactivex.rxjava3.subjects.d<Boolean> O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.m = O0;
        b bVar = b.EMPTY;
        io.reactivex.rxjava3.subjects.d<b> O02 = io.reactivex.rxjava3.subjects.d.O0(bVar);
        this.n = O02;
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        this.o = bVar2;
        bpn0 bpn0Var = new bpn0(new fem0(this, 18));
        asu0 asu0Var = asu0.a;
        bVar2.b(O02.a0(asu0Var.d()).subscribe(new wbs0(new gfv0(this, 9), 6)));
        int i2 = 28;
        bVar2.b(g6x0Var.c.a0(asu0Var.d()).subscribe(new e6x0(new mdk0(this, 28), 0)));
        bwt0.i0(view.findViewById(R.id.vmoji_close_view), new kvm0(this, 21));
        vKImageView.setOnLoadCallback(new a());
        Hint p = pla.e().b().p("keyboard:stickers_vmoji");
        if (p != null && (map = p.e) != null && (str = map.get("vmoji_kb_onboarding_dark")) != null) {
            if (brm0.v(str, ".svg", false)) {
                iln0 iln0Var = (iln0) bpn0Var.getValue();
                iln0Var.getClass();
                String a2 = tb00.a(str);
                File file = iln0Var.a;
                File file2 = new File(file, a2.concat(".svg"));
                Regex regex = com.vk.core.files.a.a;
                int i3 = 12;
                if (vhk0.g(file2)) {
                    K = io.reactivex.rxjava3.core.x.k(file2);
                } else {
                    file.mkdirs();
                    io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new dug0(str, file2, false));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    K = new io.reactivex.rxjava3.internal.operators.observable.i0(qVar.i0(), new u730(new bqt(i2), i3)).U(new t3j0(new f6w(27), 4)).K();
                }
                io.reactivex.rxjava3.kotlin.c.e(K.l(new bj50(new m0m0(i), 12)).l(new x310(new hxm0(1), 11)).q(asu0Var.c()).m(asu0Var.d()), new lwp0(11), new ujm0(this, 23));
            } else {
                vKImageView.o0(str, new Size(IronSourceError.ERROR_NO_INTERNET_CONNECTION, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            }
        }
        bVar2.b(io.reactivex.rxjava3.core.q.m(O02, O0, new ie40(new kxa((byte) 0, 10), 26)).a0(asu0Var.d()).subscribe(new nvm0(new gyo0(this, 25), 14)));
        O02.onNext(bVar);
    }

    /* compiled from: VoipVmojiView.kt */
    public final class c implements io.reactivex.rxjava3.core.v<w5w0> {
        public w5w0 b;
        public io.reactivex.rxjava3.disposables.c c;

        public c() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onNext(w5w0 w5w0Var) {
            w5w0 w5w0Var2 = w5w0Var;
            f6x0 f6x0Var = f6x0.this;
            g6x0 g6x0Var = f6x0Var.b;
            w5w0 w5w0Var3 = this.b;
            if (w5w0Var3 == null) {
                this.b = w5w0Var2;
                if (!w5w0Var2.equals(va9.r)) {
                    va9 va9Var = f6x0Var.c;
                    va9Var.getClass();
                    va9.k(new zy(va9Var, 14));
                }
                g6x0Var.b.C(m5x0.g.b);
                return;
            }
            if (!w5w0Var3.equals(w5w0Var2)) {
                g6x0Var.b.C(m5x0.c.b);
            }
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
            this.c = cVar;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
        }
    }

    /* compiled from: VoipVmojiView.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            f6x0.this.m.onNext(Boolean.TRUE);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
