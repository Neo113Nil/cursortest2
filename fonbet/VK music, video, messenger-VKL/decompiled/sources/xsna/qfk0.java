package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.qr9;

/* compiled from: SoundCaptchaViewDelegate.kt */
/* loaded from: classes15.dex */
public final class qfk0 {
    public static final /* synthetic */ qcy<Object>[] t = {new MutablePropertyReference1Impl(qfk0.class, "soundCaptchaVisible", "getSoundCaptchaVisible()Z", 0), p5j.a(0, qfk0.class, "refreshEnabled", "getRefreshEnabled()Z", fpf0.a), new MutablePropertyReference1Impl(qfk0.class, "switchEnabled", "getSwitchEnabled()Z", 0), new MutablePropertyReference1Impl(qfk0.class, "refreshEnabledText", "getRefreshEnabledText()I", 0), new MutablePropertyReference1Impl(qfk0.class, "playEnabled", "getPlayEnabled()Z", 0), new MutablePropertyReference1Impl(qfk0.class, "visibleViewType", "getVisibleViewType()Lcom/vk/auth/captcha/impl/sound/VisibleViewType;", 0)};
    public final View a;
    public final jfk0 b;
    public final View c;
    public final View d;
    public final ViewGroup e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final Button j;
    public final EditText k;
    public final View l;
    public final View m;
    public final rfk0 n;
    public final sfk0 o;
    public final tfk0 p;
    public final ufk0 q;
    public final vfk0 r;
    public final com.vk.movika.tools.controls.seekbar.x s;

    /* compiled from: SoundCaptchaViewDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t5u0.values().length];
            try {
                iArr[t5u0.PROGRESS_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t5u0.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t5u0.PLAYER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qfk0(View view, ofk0 ofk0Var) {
        this.a = view;
        this.b = ofk0Var;
        this.c = view.findViewById(R.id.sound_captcha_layout);
        this.d = view.findViewById(R.id.captcha_layout);
        this.e = (ViewGroup) view.findViewById(R.id.sound_captcha_player);
        View findViewById = view.findViewById(R.id.sound_captcha_play_button);
        this.f = findViewById;
        View findViewById2 = view.findViewById(R.id.sound_captcha_retry);
        this.g = findViewById2;
        this.h = view.findViewById(R.id.sound_captcha_progress_bar);
        View findViewById3 = view.findViewById(R.id.switch_to_text_captcha);
        this.i = findViewById3;
        Button button = (Button) view.findViewById(R.id.sound_captcha_refresh);
        this.j = button;
        EditText editText = (EditText) view.findViewById(R.id.sound_captcha_code);
        this.k = editText;
        View findViewById4 = view.findViewById(R.id.sound_captcha_btn);
        this.l = findViewById4;
        View findViewById5 = view.findViewById(R.id.sound_captcha_hint);
        this.m = findViewById5;
        findViewById3.setOnClickListener(new ug(this, 5));
        findViewById2.setOnClickListener(new vg(this, 8));
        sp.t(button);
        button.setOnClickListener(new wg(this, 4));
        findViewById.setOnClickListener(new com.vk.im.video.d(this, 13));
        findViewById4.setOnClickListener(new pi6(this, 5));
        editText.addTextChangedListener(new pfk0(this));
        findViewById4.setEnabled(editText.getText().length() > 0);
        this.n = new rfk0(this);
        this.o = new sfk0(this);
        this.p = new tfk0(this);
        this.q = new ufk0(this);
        this.r = new vfk0(this);
        this.s = new com.vk.movika.tools.controls.seekbar.x(t5u0.PROGRESS_BAR, this);
        findViewById.setContentDescription(view.getContext().getString(R.string.vk_sound_captcha_new_play_content_description));
        button.setContentDescription(view.getContext().getString(R.string.vk_sound_captcha_new_refresh_content_description));
        f4m.t(0, editText);
        editText.setHint(R.string.vk_sound_captcha_new_input_hint);
        findViewById5.setVisibility(0);
        a(new qr9.b(0));
    }

    public final void a(qr9 qr9Var) {
        if (qr9Var instanceof qr9.b) {
            d(false);
            b(false);
            e(false);
            c(((qr9.b) qr9Var).b);
            f(t5u0.PROGRESS_BAR);
            return;
        }
        if (qr9Var instanceof qr9.d) {
            d(true);
            b(false);
            e(false);
            c(((qr9.d) qr9Var).b);
            f(t5u0.RETRY);
            return;
        }
        if (qr9Var instanceof qr9.c) {
            d(true);
            b(false);
            e(false);
            c(((qr9.c) qr9Var).b);
            f(t5u0.PROGRESS_BAR);
            return;
        }
        boolean z = qr9Var instanceof qr9.e;
        qcy<?>[] qcyVarArr = t;
        vfk0 vfk0Var = this.r;
        if (!z) {
            if (!(qr9Var instanceof qr9.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d(true);
            b(false);
            e(false);
            c(((qr9.a) qr9Var).c);
            f(t5u0.PLAYER);
            vfk0Var.setValue(this, qcyVarArr[4], Boolean.FALSE);
            return;
        }
        d(true);
        f(t5u0.PLAYER);
        qr9.e eVar = (qr9.e) qr9Var;
        boolean z2 = eVar.b;
        boolean z3 = !z2;
        vfk0Var.setValue(this, qcyVarArr[4], Boolean.valueOf(z3));
        this.e.setEnabled(z3);
        b(!z2 && qr9Var.a() == 0);
        e(qr9Var.a() == 0);
        c(eVar.c);
        this.k.requestFocus();
    }

    public final void b(boolean z) {
        this.o.setValue(this, t[1], Boolean.valueOf(z));
    }

    public final void c(int i) {
        this.q.setValue(this, t[3], Integer.valueOf(i));
    }

    public final void d(boolean z) {
        this.n.setValue(this, t[0], Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.p.setValue(this, t[2], Boolean.valueOf(z));
    }

    public final void f(t5u0 t5u0Var) {
        this.s.setValue(this, t[5], t5u0Var);
    }
}
