package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.hints.Hint;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class he2 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ he2(Context context, View view, gzs gzsVar, Hint hint, izs izsVar, boolean z, View.OnClickListener onClickListener, ViewGroup viewGroup, boolean z2, x6v x6vVar, boolean z3) {
        this.g = context;
        this.h = view;
        this.c = gzsVar;
        this.i = hint;
        this.j = izsVar;
        this.d = z;
        this.k = onClickListener;
        this.l = viewGroup;
        this.e = z2;
        this.m = x6vVar;
        this.f = z3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.f;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        switch (i) {
            case 0:
                String str = (String) obj8;
                String str2 = (String) obj7;
                Drawable drawable = (Drawable) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                Integer num = (Integer) obj3;
                wh50 wh50Var = (wh50) obj2;
                String str3 = (String) obj6;
                VkFormField vkFormField = (VkFormField) obj;
                if (str == null) {
                    str = "";
                }
                vkFormField.setCaption(str);
                VkInputSelect vkInputSelect = (VkInputSelect) vkFormField.findViewById(R.id.edit_text_input);
                if (this.d) {
                    vkInputSelect.setHint(str2);
                }
                if (this.e) {
                    vkInputSelect.requestFocus();
                    wh50Var.setValue(Boolean.TRUE);
                }
                vkFormField.setAfterIconButtonVisible(z);
                vkFormField.setAfterIconButtonDrawable(drawable);
                vkFormField.setOnAfterIconButtonClickListener(new je2(0, this.c));
                vkFormField.setAfterIconButtonContentDescription(charSequence);
                if (num != null) {
                    vkFormField.b(num.intValue(), str3);
                }
                break;
            default:
                Hint hint = (Hint) obj6;
                il60 il60Var = new il60((x6v) obj2, z, hint);
                hl60 hl60Var = hl60.a;
                dcn i2 = hl60.i((Context) obj8, (View) obj7, this.c, hint, (izs) obj5, this.d, il60Var, (View.OnClickListener) obj4, (ViewGroup) obj3, this.e);
                String str4 = hint.b;
                if (i2 != null) {
                    hl60.f.remove(str4);
                    hl60.e.remove(str4);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ he2(String str, boolean z, String str2, boolean z2, boolean z3, Drawable drawable, CharSequence charSequence, Integer num, wh50 wh50Var, gzs gzsVar, String str3) {
        this.g = str;
        this.d = z;
        this.h = str2;
        this.e = z2;
        this.f = z3;
        this.j = drawable;
        this.k = charSequence;
        this.l = num;
        this.m = wh50Var;
        this.c = gzsVar;
        this.i = str3;
    }
}
