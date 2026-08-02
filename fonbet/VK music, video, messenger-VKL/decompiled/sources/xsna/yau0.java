package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppPolicyScreenEventType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkAppsConnectHelper.kt */
/* loaded from: classes6.dex */
public final class yau0 {
    public final View a;
    public final fvv0 b;
    public final ggu0 c;
    public boolean d;
    public final Context e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final c g;
    public final b h;
    public final VkLoadingButton i;
    public final mg6 j;
    public volatile w73 k;

    /* compiled from: VkAppsConnectHelper.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((yau0) this.receiver).b();
            return s3q0.a;
        }
    }

    /* compiled from: VkAppsConnectHelper.kt */
    public static final class c extends q1z {
        public c(Context context) {
            super(context);
        }

        @Override // xsna.q1z
        public final void b(Uri uri) {
            f(uri);
            tau0 d = yau0.this.b.d();
            if (d != null) {
                d.g("mini_app_vk_connect_launch_screen_view_service_policy", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_SERVICE_POLICY);
            }
        }

        @Override // xsna.q1z
        public final void c(Uri uri) {
            f(uri);
            tau0 d = yau0.this.b.d();
            if (d != null) {
                d.g("mini_app_vk_connect_launch_screen_view_service_terms", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_SERVICE_TERMS);
            }
        }

        @Override // xsna.q1z
        public final void d(Uri uri) {
            f(uri);
            tau0 d = yau0.this.b.d();
            if (d != null) {
                d.g("mini_app_vk_connect_launch_screen_view_connect_policy", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_POLICY);
            }
        }

        @Override // xsna.q1z
        public final void e(Uri uri) {
            f(uri);
            tau0 d = yau0.this.b.d();
            if (d != null) {
                d.g("mini_app_vk_connect_launch_screen_view_connect_terms", MiniAppPolicyScreenEventType.LAUNCH_SCREEN_VIEW_CONNECT_TERMS);
            }
        }
    }

    /* compiled from: VkAppsConnectHelper.kt */
    public static final class d implements nao0 {

        /* compiled from: VkAppsConnectHelper.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                ((yau0) this.receiver).b();
                return s3q0.a;
            }
        }

        /* compiled from: VkAppsConnectHelper.kt */
        public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Throwable th) {
                ((yau0) this.receiver).b();
                return s3q0.a;
            }
        }

        public d() {
        }

        @Override // xsna.nao0
        public final void U() {
            yau0 yau0Var = yau0.this;
            yau0Var.f.b(yau0Var.a().subscribe(new h4f0(new gqe0(yau0Var, 27), 16), new dpo0(new b(1, yau0Var, yau0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 6)));
        }

        @Override // xsna.nao0
        public final void j() {
            yau0 yau0Var = yau0.this;
            yau0Var.f.b(yau0Var.a().subscribe(new jw80(new emh0(yau0Var, 21), 24), new xvq0(new a(1, yau0Var, yau0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 6)));
        }
    }

    public yau0(View view, fvv0 fvv0Var, ggu0 ggu0Var) {
        String obj;
        this.a = view;
        this.b = fvv0Var;
        this.c = ggu0Var;
        Context context = view.getContext();
        this.e = context;
        this.f = new io.reactivex.rxjava3.disposables.b();
        d dVar = new d();
        this.g = new c(view.getContext());
        b bVar = new b();
        this.h = bVar;
        VkLoadingButton vkLoadingButton = (VkLoadingButton) view.findViewById(R.id.vk_apps_vkc_continue);
        this.i = vkLoadingButton;
        TextView textView = (TextView) view.findViewById(R.id.vk_apps_vkc_title);
        View findViewById = view.findViewById(R.id.vk_terms_more);
        TextView textView2 = (TextView) view.findViewById(R.id.vk_terms);
        textView.setText(context.getString(R.string.vk_apps_vk_connect_title, fvv0Var.t().c));
        view.setBackground(gu9.b(R.attr.vk_ui_background_contrast_themed, context));
        jjc.g(vkLoadingButton, new cim0(this, 12));
        jjc.g(findViewById, new gsq0(this, 5));
        CharSequence text = vkLoadingButton.getText();
        this.j = new mg6(dVar, textView2, (text == null || (obj = text.toString()) == null) ? "" : obj, e3m.f(R.attr.vk_ui_text_subhead, context), null, 96);
        fvv0Var.Q().add(0, bVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.a a() {
        w73 w73Var = this.k;
        if (w73Var != null) {
            return io.reactivex.rxjava3.core.q.T(w73Var).r0(io.reactivex.rxjava3.android.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        }
        io.reactivex.rxjava3.core.q<w73> c2 = this.b.T().c();
        k2y k2yVar = new k2y(new mdk0(this, 17), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return c2.E(k2yVar, lVar, kVar, kVar);
    }

    public final void b() {
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.j(this.e.getString(R.string.vk_apps_error_has_occured));
    }

    /* compiled from: VkAppsConnectHelper.kt */
    public static final class b implements k1w0 {
        public b() {
        }

        @Override // xsna.k1w0
        public final void d(long j) {
            tau0 d;
            yau0 yau0Var = yau0.this;
            if (!f4m.h(yau0Var.a) || yau0Var.d || (d = yau0Var.b.d()) == null) {
                return;
            }
            d.g("mini_app_vk_connect_start_screen_app_close", MiniAppPolicyScreenEventType.START_SCREEN_APP_CLOSE);
        }

        @Override // xsna.k1w0
        public final void a(long j) {
        }
    }
}
