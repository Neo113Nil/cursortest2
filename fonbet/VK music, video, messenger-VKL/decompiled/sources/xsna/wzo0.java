package xsna;

import android.text.Editable;
import android.view.View;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.im.ui.components.common.AvatarAction;
import com.vkontakte.android.R;
import xsna.t6k;
import xsna.y6k;

/* compiled from: TitleVH.kt */
/* loaded from: classes2.dex */
public final class wzo0 extends vfz<t6k.g> {
    public final nkr0 l;
    public boolean m;
    public final VkInputSelect n;
    public final VkAvatar o;
    public xzo0 p;

    /* compiled from: TitleVH.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.CHANGE_BY_GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_MINI_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wzo0(View view, y6k.b bVar) {
        super(view);
        this.l = bVar;
        this.m = true;
        VkFormField vkFormField = (VkFormField) view.findViewById(R.id.vkim_title_form_field);
        this.n = (VkInputSelect) view.findViewById(R.id.vkim_title);
        VkAvatar vkAvatar = (VkAvatar) view.findViewById(R.id.vkim_avatar);
        this.o = vkAvatar;
        vkAvatar.setPlaceholderImage(R.drawable.ic_camera_outline_placeholder);
        vkFormField.setCaption(view.getContext().getString(R.string.vkim_chat_title_hint));
        vkAvatar.o0(null, null);
    }

    @Override // xsna.vfz
    public final void W5(t6k.g gVar) {
        Editable text;
        v230 v230Var = gVar.b;
        boolean z = this.m;
        VkInputSelect vkInputSelect = this.n;
        if (z) {
            this.m = false;
            mhy.j(vkInputSelect.getEditText());
        }
        int length = v230Var.j.length();
        VkAvatar vkAvatar = this.o;
        if (length == 0) {
            vkAvatar.o0(null, null);
        } else {
            vkAvatar.o0(v230Var.j, null);
        }
        jjc.g(vkAvatar, new vqn0(this, v230Var.c, 2));
        Editable text2 = vkInputSelect.getText();
        boolean z2 = text2 == null || text2.length() == 0;
        vkInputSelect.setText(v230Var.i);
        if (z2 && (text = vkInputSelect.getText()) != null && text.length() > 0) {
            Editable text3 = vkInputSelect.getText();
            vkInputSelect.setSelection(text3 != null ? text3.length() : 0);
        }
        vkInputSelect.e(this.p);
        xzo0 xzo0Var = new xzo0(v230Var, this);
        this.p = xzo0Var;
        vkInputSelect.b(xzo0Var);
    }
}
