package xsna;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: ImageCaptchaViewDelegate.kt */
/* loaded from: classes15.dex */
public final class ogw {
    public static final /* synthetic */ qcy<Object>[] o = {new MutablePropertyReference1Impl(ogw.class, "refreshEnabledText", "getRefreshEnabledText()I", 0), p5j.a(0, ogw.class, "refreshEnabled", "getRefreshEnabled()Z", fpf0.a), new MutablePropertyReference1Impl(ogw.class, "switchEnabled", "getSwitchEnabled()Z", 0)};
    public final View a;
    public final lgw b;
    public final mgw c;
    public final EditText d;
    public final VkLoadingButton e;
    public final Button f;
    public final View g;
    public final VKImageController<? extends View> h;
    public final View i;
    public final View j;
    public final View k;
    public final b l;
    public final c m;
    public final d n;

    /* compiled from: ImageCaptchaViewDelegate.kt */
    public static final class a extends xsj0 {
        public a() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ogw.this.e.setEnabled(charSequence.length() > 0);
        }
    }

    /* compiled from: DelegateUtils.kt */
    public static final class b extends wq70<Integer> {
        public b() {
            super(0);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Integer num, Integer num2) {
            int intValue = num2.intValue();
            num.intValue();
            ogw ogwVar = ogw.this;
            if (intValue == 0) {
                ogwVar.f.setText(ogwVar.a.getResources().getString(R.string.vk_captcha_refresh));
            } else {
                ogwVar.f.setText(ogwVar.a.getResources().getString(R.string.vk_captcha_refresh_in, Integer.valueOf(intValue)));
            }
        }

        @Override // xsna.wq70
        public final boolean beforeChange(qcy<?> qcyVar, Integer num, Integer num2) {
            return !epx.f(num, num2);
        }
    }

    /* compiled from: DelegateUtils.kt */
    public static final class c extends wq70<Boolean> {
        public final /* synthetic */ ogw b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ogw ogwVar) {
            super(r0);
            Boolean bool = Boolean.TRUE;
            this.b = ogwVar;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            qxm0.z(this.b.f, booleanValue);
        }

        @Override // xsna.wq70
        public final boolean beforeChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            return !epx.f(bool, bool2);
        }
    }

    /* compiled from: DelegateUtils.kt */
    public static final class d extends wq70<Boolean> {
        public final /* synthetic */ ogw b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(ogw ogwVar) {
            super(r0);
            Boolean bool = Boolean.TRUE;
            this.b = ogwVar;
        }

        @Override // xsna.wq70
        public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            qxm0.z(this.b.g, booleanValue);
        }

        @Override // xsna.wq70
        public final boolean beforeChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
            return !epx.f(bool, bool2);
        }
    }

    public ogw(View view, lgw lgwVar, mgw mgwVar) {
        this.a = view;
        this.b = lgwVar;
        this.c = mgwVar;
        VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.captcha_img);
        EditText editText = (EditText) view.findViewById(R.id.captcha_code);
        this.d = editText;
        VkLoadingButton vkLoadingButton = (VkLoadingButton) view.findViewById(R.id.captcha_btn);
        this.e = vkLoadingButton;
        Button button = (Button) view.findViewById(R.id.captcha_refresh);
        this.f = button;
        this.g = view.findViewById(R.id.switch_to_sound_captcha);
        View findViewById = view.findViewById(R.id.captcha_img_frame);
        this.i = findViewById;
        this.j = view.findViewById(R.id.captcha_img_progress_bar);
        View findViewById2 = view.findViewById(R.id.captcha_img_retry);
        this.k = findViewById2;
        this.l = new b();
        this.m = new c(this);
        this.n = new d(this);
        button.setVisibility(lgwVar.b ? 0 : 8);
        double d2 = lgwVar.c;
        if (d2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d(d2, true);
        } else {
            int i = lgwVar.d;
            float f = 130.0f;
            if (i != -1) {
                float f2 = i;
                if (f2 <= 130.0f) {
                    f = f2;
                }
            }
            int max = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * f);
            int i2 = lgwVar.e;
            float f3 = 50.0f;
            if (i2 != -1) {
                float f4 = i2;
                if (f4 <= 50.0f) {
                    f3 = f4;
                }
            }
            int max2 = (int) (Math.max(1.0f, Resources.getSystem().getDisplayMetrics().density) * f3);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = max;
            }
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = max2;
            }
        }
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(view.getContext());
        this.h = create;
        vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
        mgwVar.h = create;
        editText.requestFocus();
        editText.addTextChangedListener(new a());
        editText.setOnEditorActionListener(new ngw(this, 0));
        vkLoadingButton.setEnabled(editText.getText().length() > 0);
        vkLoadingButton.setOnClickListener(new vw0(this, 9));
        y01 y01Var = new y01(this, 10);
        findViewById2.setOnClickListener(y01Var);
        button.setOnClickListener(y01Var);
    }

    public final void a(boolean z) {
        this.m.setValue(this, o[1], Boolean.valueOf(z));
    }

    public final void b(int i) {
        this.l.setValue(this, o[0], Integer.valueOf(i));
    }

    public final void c(boolean z) {
        this.n.setValue(this, o[2], Boolean.valueOf(z));
    }

    public final void d(double d2, boolean z) {
        View view = this.a;
        int min = (int) (Math.min(sqe0.b(view).widthPixels, dw20.e1) - (view.getResources().getDimension(R.dimen.vk_sak_captcha_fragment_padding) + (view.getResources().getDimension(R.dimen.vk_sak_captcha_image_horizontal_padding) * 2)));
        int i = (int) (min / d2);
        View view2 = this.i;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = min;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i;
        }
        if (z) {
            mgw mgwVar = this.c;
            Uri.Builder buildUpon = Uri.parse(mgwVar.f).buildUpon();
            buildUpon.appendQueryParameter("width", String.valueOf(min));
            mgwVar.f = buildUpon.build().toString();
        }
    }
}
