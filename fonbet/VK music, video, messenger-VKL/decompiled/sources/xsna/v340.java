package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.ImageSizeKey;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.multiaccount.api.j;
import com.vk.superapp.multiaccount.impl.ui.MultiAccountAvatarController;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.xnn0;

/* compiled from: MultiAccountSwitcherUserViewHolder.kt */
/* loaded from: classes6.dex */
public final class v340 extends bq6 {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final TextView D;
    public final ij0 w;
    public final y140 x;
    public final jzq0 y;
    public final MultiAccountAvatarController z;

    public v340(ViewGroup viewGroup, pxo pxoVar, y140 y140Var, jzq0 jzq0Var) {
        super(viewGroup, R.layout.vk_auth_multiaccount_switcher_user_item, pxoVar, jzq0Var);
        this.w = pxoVar;
        this.x = y140Var;
        this.y = jzq0Var;
        this.z = (MultiAccountAvatarController) this.m.findViewById(R.id.user_avatar);
        this.A = (TextView) this.m.findViewById(R.id.user_name);
        this.B = (TextView) this.m.findViewById(R.id.user_info);
        this.C = this.m.findViewById(R.id.delete);
        this.D = (TextView) this.m.findViewById(R.id.counter);
    }

    @Override // xsna.bq6
    public final void V5(xnn0.h hVar) {
        super.V5(hVar);
        int i = hVar.c;
        MultiAccountAvatarController multiAccountAvatarController = this.z;
        f4m.s(i, multiAccountAvatarController);
        com.vk.superapp.multiaccount.api.f fVar = hVar.a;
        com.vk.superapp.multiaccount.api.g a = fVar.a();
        multiAccountAvatarController.d.h(a.b.b, a.d, adu0.a(6, multiAccountAvatarController.getContext()));
        String str = fVar.a().c;
        TextView textView = this.A;
        textView.setText(str);
        boolean z = fVar instanceof f.a.C1892a;
        textView.setMaxWidth(iah0.a((!z || ((f.a.C1892a) fVar).d.g <= 0) ? 224 : 176));
        int i2 = fVar.a().g;
        l0r0 l0r0Var = hVar.b;
        boolean z2 = false;
        Context context = this.u;
        TextView textView2 = this.B;
        if (!z) {
            if (fVar instanceof f.c.C1893c) {
                textView2.setText(context.getString(R.string.vk_multiaccount_user_validation_required));
                MultiAccountAvatarController.a(multiAccountAvatarController, Integer.valueOf(R.drawable.vk_icon_error_circle_24), Integer.valueOf(e3m.f(R.attr.vk_ui_accent_orange, context)), Integer.valueOf(e3m.f(R.attr.vk_ui_background_content, context)));
                multiAccountAvatarController.setSelectionVisible$impl_release(true);
                return;
            }
            boolean z3 = fVar instanceof f.c.b;
            int i3 = 21;
            View view = this.q;
            View view2 = this.C;
            j.e eVar = j.e.b;
            j.d dVar = j.d.b;
            j.c cVar = j.c.b;
            if (z3) {
                f.c.b bVar = (f.c.b) fVar;
                com.vk.superapp.multiaccount.api.j jVar = bVar.e;
                if (jVar instanceof j.b) {
                    textView2.setText(context.getString(R.string.vk_multiaccount_user_deleted, String.valueOf(((j.b) jVar).b)));
                } else if (jVar.equals(cVar)) {
                    textView2.setText(context.getString(R.string.vk_multiaccount_user_deleted_forever));
                    view2.setVisibility(0);
                    jjc.g(view, new az2(i3, this, bVar));
                } else if (jVar.equals(dVar)) {
                    textView2.setText(context.getString(R.string.vk_multiaccount_user_deleted_now));
                } else {
                    if (!jVar.equals(eVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textView2.setText(context.getString(R.string.vk_multiaccount_user_just_deleted));
                }
                a6();
                return;
            }
            if (!(fVar instanceof f.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f.c.a aVar = (f.c.a) fVar;
            com.vk.superapp.multiaccount.api.j jVar2 = aVar.e;
            if (jVar2 instanceof j.b) {
                textView2.setText(context.getString(R.string.vk_multiaccount_user_banned, String.valueOf(((j.b) jVar2).b)));
            } else if (jVar2.equals(dVar)) {
                textView2.setText(context.getString(R.string.vk_multiaccount_user_banned_now));
            } else if (jVar2.equals(cVar)) {
                textView2.setText(context.getString(R.string.vk_multiaccount_user_banned_forever));
                view2.setVisibility(0);
                jjc.g(view, new az2(i3, this, aVar));
            } else {
                if (!jVar2.equals(eVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                textView2.setText(context.getString(R.string.vk_multiaccount_user_just_banned));
            }
            a6();
            return;
        }
        com.vk.superapp.multiaccount.api.g gVar = ((f.a.C1892a) fVar).d;
        boolean z4 = l0r0Var.a;
        boolean z5 = l0r0Var.b;
        multiAccountAvatarController.setSelectionVisible$impl_release(z4);
        if (z4) {
            MultiAccountAvatarController.a(multiAccountAvatarController, Integer.valueOf(R.drawable.vk_icon_done_16), Integer.valueOf(e3m.f(R.attr.vk_ui_background_content, context)), Integer.valueOf(e3m.f(R.attr.vk_ui_icon_accent, context)));
        }
        String str2 = gVar.e;
        String replace = str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
        String str3 = gVar.f;
        String replace2 = str3 != null ? str3.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
        if (replace != null && replace.length() != 0) {
            textView2.setText(replace);
        } else if (replace2 != null && replace2.length() != 0) {
            textView2.setText(replace2);
        } else if ((replace == null || replace.length() == 0) && (replace2 == null || replace2.length() == 0)) {
            f4m.j(textView2);
        }
        String valueOf = String.valueOf(i2);
        TextView textView3 = this.D;
        textView3.setText(valueOf);
        if (i2 != 0 && z5) {
            z2 = true;
        }
        awt0.v(textView3, z2);
        if (z5) {
            boolean z6 = l0r0Var.c;
            if (i2 > 99) {
                e3m.a aVar2 = e3m.a;
                textView3.setBackground(m33.a(R.drawable.vk_auth_bg_exchange_notifications_semi_oval, context));
                f4m.x(17, textView3);
                f4m.w(17, textView3);
                textView3.setText("99+");
            }
            if (z6) {
                Drawable background = textView3.getBackground();
                e3m.a aVar3 = e3m.a;
                background.setTint(context.getColor(R.color.vk_red_nice));
            } else if (this.x.a.invoke().booleanValue()) {
                Drawable background2 = textView3.getBackground();
                e3m.a aVar4 = e3m.a;
                background2.setTint(context.getColor(R.color.vk_steel_gray_150));
            }
        }
    }

    public final void a6() {
        f4m.j(this.D);
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_clear_20);
        Context context = this.u;
        Integer valueOf2 = Integer.valueOf(e3m.f(R.attr.vk_ui_background_negative, context));
        Integer valueOf3 = Integer.valueOf(e3m.f(R.attr.vk_ui_background_content, context));
        MultiAccountAvatarController multiAccountAvatarController = this.z;
        MultiAccountAvatarController.a(multiAccountAvatarController, valueOf, valueOf2, valueOf3);
        multiAccountAvatarController.setSelectionVisible$impl_release(true);
    }
}
