package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.e3m;

/* compiled from: VkMePromoController.kt */
/* loaded from: classes2.dex */
public final class s3v0 {
    public final Context a;
    public final iwv b;
    public final t3v0 c;
    public final cew d;

    /* compiled from: VkMePromoController.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Drawable e;
        public final Drawable f;

        public a(String str, String str2, String str3, String str4, Drawable drawable, Drawable drawable2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = drawable;
            this.f = drawable2;
        }
    }

    /* compiled from: VkMePromoController.kt */
    public static final class b implements hz20 {
        public final /* synthetic */ a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ gzs<s3q0> e;

        public b(a aVar, String str, gzs<s3q0> gzsVar) {
            this.c = aVar;
            this.d = str;
            this.e = gzsVar;
        }

        @Override // xsna.hz20
        public final void a(int i) {
            s3v0 s3v0Var = s3v0.this;
            Context context = s3v0Var.a;
            iwv iwvVar = s3v0Var.b;
            t3v0 t3v0Var = s3v0Var.c;
            String str = this.c.a;
            t3v0Var.a(str, s3v0Var.e(), true);
            if (s3v0Var.e()) {
                iwvVar.n(context, str);
            } else {
                String str2 = this.d;
                if (str2 == null || str2.length() <= 0) {
                    iwvVar.n(context, str);
                } else {
                    iwvVar.b(context, str2);
                }
            }
            gzs<s3q0> gzsVar = this.e;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    /* compiled from: VkMePromoController.kt */
    public static final class c implements gz20 {
        public final /* synthetic */ a c;
        public final /* synthetic */ gzs<s3q0> d;

        public c(a aVar, gzs<s3q0> gzsVar) {
            this.c = aVar;
            this.d = gzsVar;
        }

        @Override // xsna.gz20
        public final void onCancel() {
            s3v0 s3v0Var = s3v0.this;
            s3v0Var.c.a(this.c.a, s3v0Var.e(), false);
            gzs<s3q0> gzsVar = this.d;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public s3v0(Context context, iwv iwvVar, t3v0 t3v0Var, cew cewVar) {
        this.a = context;
        this.b = iwvVar;
        this.c = t3v0Var;
        this.d = cewVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(s3v0 s3v0Var, a aVar, gzs gzsVar, int i) {
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        s3v0Var.f(aVar, null, gzsVar);
    }

    public final a a(Integer num, String str) {
        String d = d(num, str);
        String b2 = b(num, str);
        int i = e() ? R.string.vkim_install_vk_me_login_button_text : R.string.vkim_install_vk_me_button_text;
        Context context = this.a;
        String string = context.getString(i);
        Drawable c2 = c(str);
        e3m.a aVar = e3m.a;
        return new a(str, d, b2, string, c2, m33.a(R.drawable.vk_icon_logo_vkme_icon_28, context));
    }

    public final String b(Integer num, String str) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode == -1792003935) {
            if (str.equals("disappearing_msg")) {
                i = num.intValue() > 1 ? R.string.vkim_some_msg_is_expired_description : R.string.vkim_one_msg_is_expired_description;
            }
            i = R.string.vkim_install_vk_me_message;
        } else if (hashCode != -666001393) {
            if (hashCode == 1320168392 && str.equals("vkme_stickers")) {
                i = R.string.vkim_stickers_pack_description_default;
            }
            i = R.string.vkim_install_vk_me_message;
        } else {
            if (str.equals("casper_chat")) {
                i = R.string.vkim_casper_chat_popup_description;
            }
            i = R.string.vkim_install_vk_me_message;
        }
        return this.a.getString(i);
    }

    public final Drawable c(String str) {
        boolean equals = str.equals("casper_chat");
        Context context = this.a;
        if (!equals) {
            e3m.a aVar = e3m.a;
            return m33.a(R.drawable.vk_icon_logo_vkme_icon_28, context);
        }
        e3m.a aVar2 = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_ghost_outline_56, context);
        a2.setTint(e3m.f(R.attr.vk_ui_icon_accent, context));
        return a2;
    }

    public final String d(Integer num, String str) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode == -1792003935) {
            if (str.equals("disappearing_msg")) {
                i = num.intValue() > 1 ? R.string.vkim_some_msg_is_expired_title : R.string.vkim_one_msg_is_expired_title;
            }
            i = R.string.vkim_install_vk_me_dialog_title;
        } else if (hashCode != -666001393) {
            if (hashCode == 1320168392 && str.equals("vkme_stickers")) {
                i = R.string.vkim_stickers_pack_title;
            }
            i = R.string.vkim_install_vk_me_dialog_title;
        } else {
            if (str.equals("casper_chat")) {
                i = R.string.vkim_casper_chat_popup_title_unavailbale;
            }
            i = R.string.vkim_install_vk_me_dialog_title;
        }
        return this.a.getString(i);
    }

    public final boolean e() {
        return this.b.j(this.a);
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [T, xsna.dw20] */
    public final void f(a aVar, String str, gzs<s3q0> gzsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Context context = this.a;
        dw20.b b0 = ((dw20.b) dw20.a.k0(new dw20.b(context, null), aVar.d, new b(aVar, str, gzsVar), aVar.f, null, 8)).Y(new c(aVar, gzsVar)).b0(new byh(this, aVar, gzsVar, ref$ObjectRef, 3));
        e3m.a aVar2 = e3m.a;
        ref$ObjectRef.element = dw20.a.R(((dw20.b) b0.F(m33.a(R.drawable.ic_cancel_24_in_circle_bg_transparent, context), null)).N(aVar.e).w0(aVar.b), aVar.c, 0, 0, 6).I0(null);
    }
}
