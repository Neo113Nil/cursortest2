package xsna;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: UnstableNetworkModalView.kt */
/* loaded from: classes3.dex */
public final class n6q0 extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final View b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final View i;

    /* compiled from: UnstableNetworkModalView.kt */
    public static final class a {
        public String a;
        public String b;
        public gzs<s3q0> c;
        public String d;
        public gzs<s3q0> e;
        public gzs<s3q0> f;
        public boolean g;

        public final n6q0 a(AppCompatActivity appCompatActivity) {
            n6q0 n6q0Var = new n6q0(new ContextThemeWrapper(appCompatActivity, this.g ? R.style.UnstableNetwork_Theme_Dark : R.style.UnstableNetwork_Theme_Light));
            n6q0Var.d.setVisibility(0);
            n6q0Var.setTitle(this.a);
            String str = this.b;
            gzs<s3q0> gzsVar = this.c;
            TextView textView = n6q0Var.g;
            TextView textView2 = n6q0Var.f;
            View view = n6q0Var.i;
            if (str == null) {
                textView2.setVisibility(8);
                if (textView.getVisibility() == 8) {
                    view.setVisibility(0);
                }
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
                textView2.setOnClickListener(new l6q0(0, gzsVar));
                view.setVisibility(8);
            }
            String str2 = this.d;
            gzs<s3q0> gzsVar2 = this.e;
            if (str2 == null) {
                textView.setVisibility(8);
                if (textView2.getVisibility() == 8) {
                    view.setVisibility(0);
                }
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
                textView.setOnClickListener(new l44(gzsVar2, 14));
                view.setVisibility(8);
            }
            n6q0Var.setOnDismiss(this.f);
            n6q0Var.setBottomPadding(null);
            return n6q0Var;
        }

        public final void b() {
            this.d = null;
            this.e = null;
        }

        public final void c(String str, wrl0 wrl0Var) {
            this.b = str;
            this.c = wrl0Var;
        }

        public final void d(String str, pvh0 pvh0Var) {
            this.d = str;
            this.e = pvh0Var;
        }

        public final void e(String str) {
            this.a = str;
        }

        public final b f(AppCompatActivity appCompatActivity) {
            FrameLayout frameLayout = (FrameLayout) appCompatActivity.getWindow().getDecorView().findViewById(android.R.id.content);
            n6q0 a = a(appCompatActivity);
            frameLayout.addView(a, new FrameLayout.LayoutParams(-1, -1));
            return new b(a);
        }
    }

    /* compiled from: UnstableNetworkModalView.kt */
    public static final class b {
        public final n6q0 a;

        public b(n6q0 n6q0Var) {
            this.a = n6q0Var;
        }
    }

    public n6q0(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null, 0);
        LayoutInflater.from(contextThemeWrapper).inflate(R.layout.unstable_network_modal, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.unstable_network_modal_bg);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.unstable_network_modal_card);
        this.c = findViewById2;
        this.d = (ImageView) findViewById(R.id.unstable_network_modal_image);
        this.e = (TextView) findViewById(R.id.unstable_network_modal_title);
        this.f = (TextView) findViewById(R.id.unstable_network_modal_button_1);
        this.g = (TextView) findViewById(R.id.unstable_network_modal_button_2);
        this.h = (ImageView) findViewById(R.id.unstable_network_modal_dismiss);
        this.i = findViewById(R.id.unstable_network_modal_bottom_extra_padding);
        findViewById.setOnClickListener(new m6q0());
        findViewById2.setOnClickListener(new m6q0());
        findViewById2.setVisibility(4);
        findViewById2.post(new q44(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAnimation$lambda$2(n6q0 n6q0Var) {
        float height = ((View) n6q0Var.c.getParent()).getHeight();
        View view = n6q0Var.c;
        view.setTranslationY(height);
        view.setVisibility(0);
        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(350L).start();
    }

    public final void setBottomPadding(Integer num) {
        if (num != null) {
            View view = this.c;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = num.intValue();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setOnDismiss(gzs<s3q0> gzsVar) {
        View view = this.b;
        ImageView imageView = this.h;
        if (gzsVar == null) {
            imageView.setVisibility(8);
            view.setOnClickListener(new o44(1));
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new v9b(gzsVar, 11));
            view.setOnClickListener(new s7d(1, gzsVar));
        }
    }

    public final void setTitle(String str) {
        TextView textView = this.e;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnDismiss$lambda$5(View view) {
    }
}
