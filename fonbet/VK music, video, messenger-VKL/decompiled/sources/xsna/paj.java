package xsna;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;

/* compiled from: ContactVhOld.kt */
/* loaded from: classes2.dex */
public final class paj extends vfz<t8j> {
    public final g3a0 A;
    public t8j B;
    public final bpn0 C;
    public final bpn0 D;
    public final bpn0 E;
    public final i8j l;
    public final boolean m;
    public final ViewGroup n;
    public final ImAvatarView o;
    public final ImageView p;
    public final AppCompatTextView q;
    public final TextView r;
    public final CheckBox s;
    public final bpn0 t;
    public final View u;
    public final View v;
    public final View w;
    public final View x;
    public final StringBuffer y;
    public final StringBuilder z;

    public paj(View view, i8j i8jVar, boolean z) {
        super(view);
        this.l = i8jVar;
        this.m = z;
        this.n = (ViewGroup) this.itemView.findViewById(R.id.user_vh);
        this.o = (ImAvatarView) this.itemView.findViewById(R.id.vkim_avatar);
        this.p = (ImageView) this.itemView.findViewById(R.id.online);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.vkim_username);
        appCompatTextView.setEmojiCompatEnabled(false);
        if (i8jVar.n()) {
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -2;
            appCompatTextView.setLayoutParams(layoutParams);
            f4m.r(iah0.a(4), appCompatTextView);
        }
        this.q = appCompatTextView;
        this.r = (TextView) this.itemView.findViewById(R.id.vkim_subtitle);
        this.s = (CheckBox) this.itemView.findViewById(R.id.vkim_checkbox);
        this.t = new bpn0(new n1i(view, 1));
        this.u = this.itemView.findViewById(R.id.new_contact_dot_view);
        this.v = this.itemView.findViewById(R.id.item_contact_edu_label);
        View findViewById = this.itemView.findViewById(R.id.call_audio);
        this.w = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.call_video);
        this.x = findViewById2;
        this.y = new StringBuffer();
        this.z = new StringBuilder();
        this.A = new g3a0();
        this.C = new bpn0(new sbg(this, 11));
        this.D = new bpn0(new tbg(this, 10));
        this.E = new bpn0(new m3g(this, 5));
        this.itemView.setOnClickListener(new bg0(this, 4));
        bwt0.i0(findViewById, new jm0(this, 20));
        bwt0.i0(findViewById2, new n6f(this, 7));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t8j t8jVar) {
        boolean z;
        boolean z2;
        String str;
        CharSequence charSequence;
        t8j t8jVar2 = t8jVar;
        boolean z3 = t8jVar2.g;
        CharSequence charSequence2 = t8jVar2.d;
        View view = this.itemView;
        Integer num = t8jVar2.n;
        int intValue = num != null ? num.intValue() : R.attr.vk_ui_transparent;
        abg0 abg0Var = dhr0.t;
        view.setBackgroundColor(abg0Var.c(intValue));
        this.B = t8jVar2;
        AppCompatTextView appCompatTextView = this.q;
        appCompatTextView.setText(charSequence2);
        qtd0 qtd0Var = t8jVar2.b;
        i8j i8jVar = this.l;
        if (i8jVar.n()) {
            appCompatTextView.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
        } else {
            appCompatTextView.setTextAppearance(R.style.VkUiTypography_HeadlineMedium);
        }
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setIncludeFontPadding(false);
        View view2 = this.v;
        bwt0.p0(view2, false);
        if (i8jVar.n()) {
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            appCompatTextView.setText(charSequence2);
            bwt0.p0(view2, i8jVar.m(qtd0Var));
        } else if (i8jVar.m(qtd0Var)) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.vk_icon_education_16, 0);
            Drawable drawable = appCompatTextView.getCompoundDrawables()[2];
            if (drawable != null) {
                drawable.setTint(abg0Var.c(R.attr.vk_ui_icon_accent_themed));
            }
        } else {
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        boolean k = i8jVar.k(t8jVar2);
        TextView textView = this.r;
        if (k) {
            if (z3) {
                charSequence = (String) this.C.getValue();
            } else {
                int i = t8jVar2.c;
                CharSequence charSequence3 = t8jVar2.i;
                CharSequence charSequence4 = t8jVar2.m;
                bpn0 bpn0Var = this.t;
                StringBuffer stringBuffer = this.y;
                if (i != 0) {
                    if (i != 11) {
                        if (i == 2) {
                            str = (String) this.E.getValue();
                        } else if (i == 3) {
                            str = qtd0Var instanceof q2a0 ? h6((q2a0) qtd0Var, charSequence3) : "";
                        } else if (i != 4) {
                            if (i == 5) {
                                str = qtd0Var instanceof q2a0 ? h6((q2a0) qtd0Var, charSequence3) : (String) this.D.getValue();
                            }
                            str = stringBuffer;
                        } else {
                            if (qtd0Var instanceof q2a0) {
                                str = h6((q2a0) qtd0Var, charSequence3);
                            }
                            str = stringBuffer;
                        }
                    } else if (qtd0Var instanceof q2a0) {
                        str = h6((q2a0) qtd0Var, charSequence3);
                    } else {
                        if (charSequence4 == null) {
                            charSequence4 = stringBuffer;
                        }
                        str = charSequence4;
                    }
                    imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                    charSequence = str;
                } else {
                    if (qtd0Var.v5() != null) {
                        StringBuilder sb = this.z;
                        sb.setLength(0);
                        imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                        boolean z4 = this.m;
                        if (!z4) {
                            sb.append((CharSequence) this.A.a(qtd0Var.c5()));
                        }
                        str = sb;
                        if (!drm0.N(stringBuffer)) {
                            if (!drm0.N(sb) && !z4) {
                                sb.append(" · ");
                            }
                            sb.append(stringBuffer);
                            str = sb;
                        }
                        imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                        charSequence = str;
                    }
                    str = stringBuffer;
                    imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                    charSequence = str;
                }
            }
            bwt0.p0(textView, myc0.f(charSequence));
            textView.setText(charSequence);
        } else {
            f4m.j(textView);
        }
        ImAvatarView imAvatarView = this.o;
        imAvatarView.s1(qtd0Var);
        fp80.a(this.p, qtd0Var);
        boolean z5 = t8jVar2.e;
        CheckBox checkBox = this.s;
        checkBox.setChecked(z5);
        checkBox.setVisibility((i8jVar.d() && z3) ? 4 : i8jVar.d() ? 0 : 8);
        checkBox.setEnabled(t8jVar2.f);
        bwt0.p0(this.u, qtd0Var.k5());
        boolean x = i8jVar.x(t8jVar2);
        View view3 = this.x;
        View view4 = this.w;
        if (x) {
            z = true;
            bwt0.p0(view4, true);
            bwt0.p0(view3, true);
        } else {
            z = true;
            bwt0.p0(view4, false);
            bwt0.p0(view3, false);
        }
        t8j t8jVar3 = this.B;
        qtd0 qtd0Var2 = (t8jVar3 == null ? null : t8jVar3).b;
        if ((t8jVar3 == null ? null : t8jVar3).g) {
            z2 = false;
        } else {
            if (qtd0Var2 instanceof Contact) {
                if (t8jVar3 == null) {
                    t8jVar3 = null;
                }
                if (t8jVar3.h) {
                    z2 = ((Contact) qtd0Var2).n;
                }
            }
            z2 = z;
        }
        ViewGroup viewGroup = this.n;
        if (!z2) {
            int i2 = 0;
            while (true) {
                if (!(i2 < viewGroup.getChildCount() ? z : false)) {
                    break;
                }
                viewGroup.getChildAt(i2).setAlpha(0.4f);
                i2++;
            }
        } else {
            int i3 = 0;
            while (true) {
                if (!(i3 < viewGroup.getChildCount() ? z : false)) {
                    break;
                }
                viewGroup.getChildAt(i3).setAlpha(1.0f);
                i3++;
            }
        }
        t8j t8jVar4 = this.B;
        if (t8jVar4 == null) {
            t8jVar4 = null;
        }
        if (t8jVar4.l) {
            ImAvatarView.x1(imAvatarView, abg0Var.a(R.drawable.ic_cake_circle_fill_purple_composite_26));
        } else {
            ImAvatarView.x1(imAvatarView, null);
        }
    }

    public final StringBuilder h6(q2a0 q2a0Var, CharSequence charSequence) {
        StringBuilder sb = this.z;
        sb.setLength(0);
        boolean z = this.m;
        if (!z) {
            if (drm0.N(charSequence)) {
                charSequence = this.A.a(q2a0Var.c5());
            }
            sb.append(charSequence);
        }
        boolean z2 = q2a0Var instanceof Contact;
        String str = null;
        Contact contact = z2 ? (Contact) q2a0Var : null;
        if (contact != null) {
            v8j v8jVar = v8j.a;
            str = v8j.a(contact.m);
        }
        if (myc0.f(str) && z2 && ((Contact) q2a0Var).n) {
            if (!z) {
                sb.append(" · ");
            }
            sb.append(str);
        }
        return sb;
    }
}
