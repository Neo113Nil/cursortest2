package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.multiaccount.api.AgeGroup;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Locale;
import java.util.WeakHashMap;
import xsna.xnn0;
import xsna.yln0;

/* compiled from: BaseUserViewHolder.kt */
/* loaded from: classes6.dex */
public class bq6 extends RecyclerView.e0 {
    public final kgq0 l;
    public final View m;
    public final ps8 n;
    public final LinearLayout o;
    public kav p;
    public final View q;
    public final TextView r;
    public final k15 s;
    public final bvd0 t;
    public final Context u;
    public final a v;

    /* compiled from: BaseUserViewHolder.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a() {
            this(0, 0, 0, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LogoutButtonParams(marginTop=");
            sb.append(this.a);
            sb.append(", marginBottom=");
            sb.append(this.b);
            sb.append(", paddingTop=");
            return vu5.b(sb, this.c, ')');
        }

        public a(int i, int i2, int i3, int i4) {
            i = (i4 & 1) != 0 ? 0 : i;
            i2 = (i4 & 2) != 0 ? 0 : i2;
            i3 = (i4 & 4) != 0 ? 0 : i3;
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public bq6(ViewGroup viewGroup, int i, kgq0 kgq0Var, jzq0 jzq0Var) {
        super(new ps8(viewGroup.getContext()));
        this.l = kgq0Var;
        View b2 = tf3.b(viewGroup, i, viewGroup, false);
        this.m = b2;
        ps8 ps8Var = (ps8) this.itemView;
        this.n = ps8Var;
        this.q = b2.findViewById(R.id.user_item_layout);
        this.r = (TextView) b2.findViewById(R.id.user_sign_info);
        this.s = new k15();
        this.t = new bvd0(b2.getContext(), jzq0Var);
        Context context = this.itemView.getContext();
        this.u = context;
        this.v = new a(iah0.a(9), iah0.a(2), 0, 4);
        ps8Var.setContentView(b2);
        yln0 yln0Var = new yln0(viewGroup.getContext());
        ps8 ps8Var2 = yln0Var.c;
        if (ps8Var2 != ps8Var) {
            yln0.a aVar = yln0Var.d;
            if (ps8Var2 != null) {
                ps8Var2.h.remove(aVar);
            }
            yln0Var.c = ps8Var;
            ps8Var.h.add(aVar);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.vk_multiaccount_logout_button);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(68), -1);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackground(vjo.a(context, e3m.f(R.attr.vk_ui_background_secondary, context), 0, 0, iah0.b(16.0f), null, iah0.b(16.0f), 188));
        int f = e3m.f(R.attr.vk_ui_background_negative, context);
        TextView textView = new TextView(context);
        textView.setTextColor(f);
        textView.setTextSize(12.0f);
        bpn0 bpn0Var = enj.a;
        textView.setTypeface(dbg0.a(R.font.vk_sans_text_regular, context));
        textView.setLetterSpacing(0.02f);
        textView.setText(context.getString(R.string.vk_multiaccount_logout).toLowerCase(Locale.ROOT));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        f4m.y(W5().c, textView);
        Drawable c = enj.c(R.drawable.vk_icon_door_arrow_right_outline_24, f, context);
        View imageView = new ImageView(context);
        imageView.setBackground(c);
        float f2 = 24;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iah0.a(f2), iah0.a(f2));
        layoutParams3.gravity = 17;
        imageView.setLayoutParams(layoutParams3);
        f4m.t(W5().a, imageView);
        f4m.q(W5().b, imageView);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        this.o = linearLayout;
        ps8Var.setRightViews(Collections.singletonList(linearLayout));
    }

    public void V5(xnn0.h hVar) {
        Spannable spannableString;
        String str;
        String str2;
        com.vk.superapp.multiaccount.api.f fVar = hVar.a;
        l0r0 l0r0Var = hVar.b;
        boolean z = l0r0Var.e;
        boolean z2 = (!l0r0Var.d || z || fVar.a().d()) ? false : true;
        boolean d = fVar.a().d();
        Context context = this.u;
        k15 k15Var = this.s;
        String str3 = "";
        if (d) {
            AgeGroup ageGroup = fVar.a().l;
            k15Var.getClass();
            spannableString = k15.o(context, "", ageGroup);
        } else {
            spannableString = new SpannableString("");
        }
        Boolean bool = fVar.a().i;
        Boolean bool2 = fVar.a().h;
        k15Var.getClass();
        this.r.setText(k15.i(context, spannableString, bool, bool2, z));
        View view = this.m;
        if (view.isAttachedToWindow()) {
            this.n.setViewScrollable(z2);
        } else {
            view.addOnAttachStateChangeListener(new b(view, this, z2));
        }
        iut0.q(view, new vmk());
        bvd0 bvd0Var = this.t;
        bvd0Var.getClass();
        jzq0 jzq0Var = bvd0Var.b;
        if (fVar instanceof f.a.C1892a) {
            if (((f.a.C1892a) fVar).d.d()) {
                String str4 = fVar.a().c;
                fVar.a().l.getClass();
                jzq0Var.getClass();
                if (z) {
                    jzq0Var.getClass();
                }
            } else {
                Context context2 = bvd0Var.a;
                StringBuilder sb = new StringBuilder();
                sb.append((l0r0Var.c && l0r0Var.a) ? context2.getString(R.string.vk_auth_switcher_active_account_talkback, fVar.a().c) : fVar.a().c);
                String str5 = fVar.a().e;
                if (str5 == null || str5.length() == 0) {
                    String str6 = fVar.a().f;
                    if (str6 == null || str6.length() == 0) {
                        str = "";
                    } else {
                        String str7 = fVar.a().f;
                        if (str7 == null) {
                            str7 = "";
                        }
                        int length = str7.length();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                str2 = str7;
                                break;
                            } else {
                                if (str7.charAt(i) == 183) {
                                    str2 = str7.substring(0, i);
                                    break;
                                }
                                i++;
                            }
                        }
                        int H = drm0.H(str7);
                        while (true) {
                            if (-1 < H) {
                                if (str7.charAt(H) == 183) {
                                    str7 = str7.substring(H + 1);
                                    break;
                                }
                                H--;
                            } else {
                                break;
                            }
                        }
                        str = context2.getString(R.string.vk_auth_switcher_email_talkback, str2, str7);
                    }
                } else {
                    String str8 = fVar.a().e;
                    if (str8 == null) {
                        str8 = "";
                    }
                    str = context2.getString(R.string.vk_auth_phone_end_of_number_talkback, erm0.E0(2, str8));
                }
                sb.append(str);
                sb.append(!l0r0Var.b ? "" : fVar.a().g > 99 ? context2.getString(R.string.vk_auth_switcher_notifications_count_talkback, context2.getString(R.string.vk_auth_switcher_notifications_more_then_talkback, 99)) : context2.getString(R.string.vk_auth_switcher_notifications_count_talkback, String.valueOf(fVar.a().g)));
                if (z) {
                    jzq0Var.getClass();
                }
                sb.append("");
                sb.append(context2.getString(R.string.vk_auth_switcher_go_to_account_talkback));
                str3 = sb.toString();
            }
        }
        view.setContentDescription(str3);
        jjc.g(this.q, new nv2(2, this, hVar));
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            jjc.g(linearLayout, new gb(2, this, fVar));
        }
    }

    public a W5() {
        return this.v;
    }

    public final void h0() {
        ps8 ps8Var = this.n;
        if (ps8Var.getInitialScrollOffset() - ps8Var.getScrollX() != 0) {
            if (!this.itemView.isAttachedToWindow()) {
                ps8Var.scrollTo(ps8Var.getInitialScrollOffset(), 0);
                return;
            }
            t12 t12Var = new t12(ps8Var, 3);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            ps8Var.postOnAnimation(t12Var);
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ bq6 c;
        public final /* synthetic */ boolean d;

        public b(View view, bq6 bq6Var, boolean z) {
            this.b = view;
            this.c = bq6Var;
            this.d = z;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.n.setViewScrollable(this.d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
