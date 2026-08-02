package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.id.UserId;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dhr0;
import xsna.f3g0;
import xsna.uko;

/* compiled from: ReplyBarController.java */
/* loaded from: classes17.dex */
public final class f3g0 implements View.OnAttachStateChangeListener, n3g0 {

    @NonNull
    public final View b;
    public final TextView c;
    public final TextView d;
    public final i3g0 i;
    public UserId j;
    public boolean k;
    public boolean l;
    public String e = "";
    public String f = "";
    public boolean g = false;
    public boolean h = false;
    public boolean m = false;
    public int n = R.attr.vk_ui_text_link_themed;
    public boolean o = false;
    public int p = R.attr.vk_ui_text_link_themed;
    public boolean q = false;
    public final a r = new a();
    public final b s = new b();

    /* compiled from: ReplyBarController.java */
    public class a extends BroadcastReceiver {

        /* compiled from: ReplyBarController.java */
        /* renamed from: xsna.f3g0$a$a, reason: collision with other inner class name */
        public class RunnableC2846a implements Runnable {
            public RunnableC2846a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                f3g0.this.a();
            }
        }

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || intent.getBooleanExtra("noConnectivity", false)) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2846a(), 300L);
        }
    }

    /* compiled from: ReplyBarController.java */
    public class b implements dhr0.e {
        public b() {
        }

        @Override // xsna.dhr0.e
        public final void sb(@NonNull VKTheme vKTheme) {
            f3g0.this.r();
        }
    }

    public f3g0(@NonNull final View view, UserId userId, boolean z, boolean z2, i3g0 i3g0Var) {
        this.j = UserId.d;
        this.b = view;
        this.j = userId;
        this.k = z;
        this.l = z2;
        view.addOnAttachStateChangeListener(this);
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.d3g0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.post(new sd(f3g0.this, 12));
            }
        });
        this.i = i3g0Var;
        TextView textView = (TextView) view.findViewById(R.id.to);
        this.c = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.from);
        this.d = textView2;
        textView.setOnClickListener(new eh5(1, this, i3g0Var));
        textView2.setOnClickListener(new gmp(i3g0Var, 7));
        view.setVisibility(8);
        t6g0.b().S(2, new g3g0(this));
    }

    public static void o(final f3g0 f3g0Var, final boolean z) {
        i0q0.i(0L, new Runnable() { // from class: xsna.e3g0
            @Override // java.lang.Runnable
            public final void run() {
                f3g0 f3g0Var2 = f3g0.this;
                f3g0.a aVar = f3g0Var2.r;
                View view = f3g0Var2.b;
                boolean z2 = z;
                f3g0Var2.m = z2;
                if (z2) {
                    Context context = view.getContext();
                    if (context != null) {
                        try {
                            context.unregisterReceiver(aVar);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    view.setVisibility(8);
                    f3g0Var2.i.a(8);
                    Context context2 = view.getContext();
                    if (context2 != null) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        context2.registerReceiver(aVar, intentFilter);
                    }
                }
                dhr0 dhr0Var = dhr0.a;
                dhr0.f(f3g0Var2.s);
            }
        });
    }

    @Override // xsna.n3g0
    public final void a() {
        if (this.m) {
            return;
        }
        t6g0.b().S(2, new g3g0(this));
    }

    @Override // xsna.n3g0
    public final void b(@NonNull UserId userId) {
        this.j = userId;
    }

    @Override // xsna.n3g0
    public final void c() {
        if (fxc0.B().J().h0()) {
            return;
        }
        this.f = this.b.getResources().getString(R.string.community_comments_from_your_name);
        this.g = true;
        r();
    }

    @Override // xsna.n3g0
    public final void d(boolean z) {
        this.k = z;
    }

    @Override // xsna.n3g0
    public final void e(String str) {
        if (fxc0.B().J().h0()) {
            return;
        }
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.g = false;
        r();
    }

    @Override // xsna.n3g0
    public final void f(boolean z) {
        this.l = z;
    }

    @Override // xsna.n3g0
    public final boolean g() {
        return this.h;
    }

    @Override // xsna.n3g0
    public final void h() {
        this.h = false;
        l("");
    }

    @Override // xsna.n3g0
    public final void i(int i) {
        ((ViewGroup) this.c.getParent()).setBackground(new ColorDrawable(i));
    }

    @Override // xsna.n3g0
    public final void j(int i) {
        this.c.setTextColor(i);
        this.d.setTextColor(i);
    }

    @Override // xsna.n3g0
    public final void k() {
        this.n = R.attr.vk_ui_text_secondary;
        this.o = true;
    }

    @Override // xsna.n3g0
    public final void l(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        r();
    }

    @Override // xsna.n3g0
    public final void m() {
        this.h = true;
        r();
    }

    @Override // xsna.n3g0
    public final void n(int i) {
        this.p = i;
        this.q = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Context context = this.b.getContext();
        if (context != null) {
            try {
                context.unregisterReceiver(this.r);
            } catch (Exception unused) {
            }
        }
        dhr0.a.getClass();
        dhr0.X(this.s);
    }

    public final SpannableStringBuilder p(int i, int i2, String str, boolean z) {
        View view = this.b;
        String string = view.getContext().getResources().getString(i);
        int indexOf = string.indexOf("%s");
        int i3 = indexOf + 2;
        String format = String.format(string, str);
        int length = (format.length() - string.length()) + i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        Context context = view.getContext();
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i4 = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 13.0f;
        if (i4 != 1) {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(13.0f);
        }
        spannableStringBuilder.setSpan(new qup0(cqi.a(Font.Companion, fontFamily, f, context), i2), indexOf, length, 0);
        if (z) {
            spannableStringBuilder.insert(indexOf, (CharSequence) "👥 ");
            abg0 abg0Var = dhr0.t;
            Drawable a2 = abg0Var.a(R.drawable.vk_icon_users_16);
            ColorStateList valueOf = ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_vkontakte_color_icon_name));
            if (a2 != null) {
                uko.a aVar = uko.a;
                Drawable mutate = a2.mutate();
                mutate.setTintList(valueOf);
                mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                spannableStringBuilder.setSpan(new ImageSpan(mutate, 0), indexOf, i3, 0);
            }
        }
        return spannableStringBuilder;
    }

    public final void q() {
        int width;
        TextView textView = this.c;
        int maxWidth = textView.getMaxWidth();
        if (textView.getText().length() <= 0 || this.d.getText().length() <= 0) {
            if (Integer.MAX_VALUE != maxWidth) {
                textView.setMaxWidth(Integer.MAX_VALUE);
            }
        } else {
            if (this.b.getWidth() <= 0 || (width = (int) (r2.getWidth() * 0.65d)) == maxWidth) {
                return;
            }
            textView.setMaxWidth(width);
        }
    }

    public final void r() {
        boolean z = this.h;
        View view = this.b;
        TextView textView = this.c;
        if (z) {
            String string = view.getResources().getString(R.string.edit_comment_reply_bar_text);
            int indexOf = string.indexOf(" ");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), indexOf, spannableStringBuilder.length(), 0);
            textView.setText(spannableStringBuilder);
        } else if (this.e.isEmpty()) {
            textView.setText("");
        } else {
            int i = this.n;
            textView.setText(p(R.string.community_comments_reply_to_frm, (!this.o || dhr0.a == null) ? dhr0.t.c(i) : e3m.f(i, dhr0.s()), this.e, false));
        }
        boolean isEmpty = this.f.isEmpty();
        TextView textView2 = this.d;
        if (isEmpty || this.h) {
            textView2.setText("");
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            int i2 = this.p;
            textView2.setText(p(R.string.community_comments_from_frm, (!this.q || dhr0.a == null) ? dhr0.t.c(i2) : e3m.f(i2, dhr0.s()), this.f, !this.g));
            Context context = textView2.getContext();
            if (context != null && !this.f.isEmpty()) {
                if (this.g) {
                    textView2.setContentDescription(context.getString(R.string.accessibility_community_comment_from_your_name));
                } else {
                    textView2.setContentDescription(context.getString(R.string.accessibility_community_comment_from_community_name, this.f));
                }
            }
        }
        q();
        boolean z2 = TextUtils.isEmpty(textView.getText()) && TextUtils.isEmpty(textView2.getText());
        view.setVisibility(!z2 ? 0 : 8);
        this.i.a(z2 ? 8 : 0);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
