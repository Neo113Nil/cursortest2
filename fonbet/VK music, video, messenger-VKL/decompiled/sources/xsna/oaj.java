package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.gko;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ContactVh.kt */
/* loaded from: classes2.dex */
public final class oaj extends vfz<t8j> {
    public final i8j l;
    public final boolean m;
    public final VkCell n;
    public final bpn0 o;
    public final StringBuffer p;
    public final SpannableStringBuilder q;
    public final g3a0 r;
    public t8j s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;

    /* compiled from: ContactVh.kt */
    public static final class a implements VkCell.d {
        public final Context a;
        public final VkImAvatar b;

        public a(Context context) {
            this.a = context;
            VkImAvatar vkImAvatar = new VkImAvatar(context, null, 6, 0);
            vkImAvatar.S0();
            this.b = vkImAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                VkImAvatar vkImAvatar = this.b;
                vkImAvatar.S0();
                VkImAvatar.c1(vkImAvatar, cVar.a);
                if (cVar.b) {
                    gko.b bVar = gko.Companion;
                    vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_cake_circle_fill_purple_20, this.a), true, VkAvatarBadge.Alignment.TopRight, "birthday", 8));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: ContactVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ContactVh.kt */
    public static final class c implements VkCell.f {
        public final qtd0 a;
        public final boolean b;

        public c(qtd0 qtd0Var, boolean z) {
            this.a = qtd0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            qtd0 qtd0Var = this.a;
            return Boolean.hashCode(this.b) + ((qtd0Var == null ? 0 : qtd0Var.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarViewParams(profile=");
            sb.append(this.a);
            sb.append(", isBirthdayToday=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public oaj(View view, i8j i8jVar, boolean z) {
        super(view);
        this.l = i8jVar;
        this.m = z;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.user_cell);
        this.n = vkCell;
        this.o = new bpn0(new m1i(view, 2));
        this.p = new StringBuffer();
        this.q = new SpannableStringBuilder();
        this.r = new g3a0();
        this.t = new bpn0(new l9h(this, 4));
        this.u = new bpn0(new xm1(this, 28));
        this.v = new bpn0(new maj(this, 0));
        getContext();
        this.itemView.setOnClickListener(new naj(this, 0));
        vkCell.setLeftMainAvatarController(new b());
    }

    public static void i6(StringBuffer stringBuffer, qtd0 qtd0Var) {
        VisibleStatus zb = qtd0Var.mb().zb();
        if (zb == null) {
            return;
        }
        xuo0.a.getClass();
        xuo0.a();
        if (!zb.c && zb.b == 0) {
            return;
        }
        TimeUnit.MINUTES.toMillis(1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    @Override // xsna.vfz
    /* renamed from: W5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(t8j t8jVar) {
        String str;
        boolean z;
        t8j t8jVar2 = t8jVar;
        View view = this.itemView;
        Integer num = t8jVar2.n;
        view.setBackgroundColor(dhr0.t.c(num != null ? num.intValue() : R.attr.vk_ui_transparent));
        this.s = t8jVar2;
        qtd0 qtd0Var = t8jVar2.b;
        i8j i8jVar = this.l;
        if (!i8jVar.k(t8jVar2)) {
            str = null;
        } else if (t8jVar2.g) {
            str = (String) this.t.getValue();
        } else {
            int i = t8jVar2.c;
            CharSequence charSequence = t8jVar2.i;
            String str2 = t8jVar2.m;
            bpn0 bpn0Var = this.o;
            StringBuffer stringBuffer = this.p;
            if (i != 0) {
                if (i != 11) {
                    if (i == 2) {
                        str = (String) this.v.getValue();
                    } else if (i == 3) {
                        str = qtd0Var instanceof q2a0 ? h6((q2a0) qtd0Var, charSequence) : "";
                    } else if (i != 4) {
                        if (i == 5) {
                            str = qtd0Var instanceof q2a0 ? h6((q2a0) qtd0Var, charSequence) : (String) this.u.getValue();
                        }
                        str = stringBuffer;
                    } else {
                        if (qtd0Var instanceof q2a0) {
                            str = h6((q2a0) qtd0Var, charSequence);
                        }
                        str = stringBuffer;
                    }
                } else if (qtd0Var instanceof q2a0) {
                    str = h6((q2a0) qtd0Var, charSequence);
                } else {
                    if (str2 == null) {
                        str2 = stringBuffer;
                    }
                    str = str2;
                }
                if (str == stringBuffer) {
                    imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                    i6(stringBuffer, qtd0Var);
                    str = stringBuffer;
                }
            } else {
                if (qtd0Var.v5() != null) {
                    SpannableStringBuilder spannableStringBuilder = this.q;
                    spannableStringBuilder.clear();
                    imj0.e((gp80) bpn0Var.getValue(), qtd0Var, stringBuffer);
                    boolean z2 = this.m;
                    if (!z2) {
                        spannableStringBuilder.append(this.r.a(qtd0Var.c5()));
                    }
                    str = spannableStringBuilder;
                    if (!drm0.N(stringBuffer)) {
                        if (!drm0.N(spannableStringBuilder) && !z2) {
                            spannableStringBuilder.append(" · ");
                        }
                        i6(stringBuffer, qtd0Var);
                        spannableStringBuilder.append((CharSequence) stringBuffer);
                        str = spannableStringBuilder;
                    }
                    if (str == stringBuffer) {
                    }
                }
                str = stringBuffer;
                if (str == stringBuffer) {
                }
            }
        }
        VkCell.Middle.b a2 = VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(u11.f(tlo0.Companion, t8jVar2.d), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (i8jVar.n() || i8jVar.m(qtd0Var)) ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_education_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), (tlo0.f) null, (Size) null, 12) : null, 18), (i8jVar.k(t8jVar2) && str != null && myc0.f(str)) ? new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 1, TextUtils.TruncateAt.MARQUEE, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, null, 12);
        VkCell vkCell = this.n;
        vkCell.setMiddle(a2);
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new c(qtd0Var, t8jVar2.l), 40), i8jVar.d() ? new VkCell.Left.c.a(new wzh(this, 6), t8jVar2.e, t8jVar2.f) : null));
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, i8jVar.x(t8jVar2) ? new VkCell.Right.e.c(new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_phone_outline_28), (k1u0) null, (Size) null, (tlo0) new tlo0.f(R.string.vkim_msg_header_menu_call_with_audio), false, (gzs) new com.vk.voip.a(9, this, t8jVar2), 22), new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_videocam_outline_28), (k1u0) null, (Size) null, (tlo0) new tlo0.f(R.string.vkim_msg_header_menu_call_with_video), false, (gzs) new wx0(8, this, t8jVar2), 22)) : null, null, null, 25));
        t8j t8jVar3 = this.s;
        qtd0 qtd0Var2 = (t8jVar3 == null ? null : t8jVar3).b;
        if ((t8jVar3 == null ? null : t8jVar3).g) {
            z = false;
        } else {
            if (qtd0Var2 instanceof Contact) {
                if ((t8jVar3 != null ? t8jVar3 : null).h) {
                    z = ((Contact) qtd0Var2).n;
                }
            }
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                if (!(i2 < vkCell.getChildCount())) {
                    return;
                }
                vkCell.getChildAt(i2).setAlpha(1.0f);
                i2++;
            }
        } else {
            int i3 = 0;
            while (true) {
                if (!(i3 < vkCell.getChildCount())) {
                    return;
                }
                vkCell.getChildAt(i3).setAlpha(0.4f);
                i3++;
            }
        }
    }

    public final SpannableStringBuilder h6(q2a0 q2a0Var, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = this.q;
        spannableStringBuilder.clear();
        boolean z = this.m;
        if (!z) {
            if (drm0.N(charSequence)) {
                charSequence = this.r.a(q2a0Var.c5());
            }
            spannableStringBuilder.append(charSequence);
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
                spannableStringBuilder.append((CharSequence) " · ");
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
