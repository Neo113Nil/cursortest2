package xsna;

import android.content.Intent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.im.ui.components.common.AvatarAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.wzo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vqn0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vqn0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ModalActionSheetListItem modalActionSheetListItem;
        switch (this.b) {
            case 0:
                wqn0 wqn0Var = (wqn0) this.d;
                Intent intent = (Intent) obj;
                GalleryFragmentImpl galleryFragmentImpl = wqn0Var.a;
                galleryFragmentImpl.getActivity();
                wqn0Var.b.a(wqn0Var.d.n, this.c);
                if (intent != null) {
                    intent.putExtra("SYSTEM_MEDIA_INTERACTOR_TYPE", wqn0Var.e());
                }
                galleryFragmentImpl.Mf(-1, intent);
                return s3q0.a;
            case 1:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((String) this.d);
                vkFadeText.setFade(this.c);
                return s3q0.a;
            default:
                wzo0 wzo0Var = (wzo0) this.d;
                ArrayList arrayList = new ArrayList(AvatarAction.h());
                p4g.l(arrayList, AvatarAction.REMOVE, !wzo0Var.o.c0());
                p4g.l(arrayList, AvatarAction.CHANGE_BY_MINI_APP, this.c);
                a.C0785a c0785a = new a.C0785a();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i = wzo0.a.$EnumSwitchMapping$0[((AvatarAction) it.next()).ordinal()];
                    if (i == 1) {
                        modalActionSheetListItem = new ModalActionSheetListItem(AvatarAction.CHANGE_BY_GALLERY.ordinal(), null, wzo0Var.itemView.getContext().getString(R.string.vkim_take_photo_from_gallery), null, null, R.drawable.vk_icon_picture_outline_28, null, false, false, 474);
                    } else if (i == 2) {
                        modalActionSheetListItem = new ModalActionSheetListItem(AvatarAction.CHANGE_BY_MINI_APP.ordinal(), null, wzo0Var.itemView.getContext().getString(R.string.vkim_chat_settings_avatar_generate), null, null, R.drawable.vk_icon_stars_outline_28, null, false, false, 474);
                    } else if (i == 3) {
                        modalActionSheetListItem = new ModalActionSheetListItem(AvatarAction.CHANGE_BY_CAMERA.ordinal(), null, wzo0Var.itemView.getContext().getString(R.string.vkim_take_photo_from_camera), null, null, R.drawable.vk_icon_camera_outline_28, null, false, false, 474);
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        modalActionSheetListItem = new ModalActionSheetListItem(AvatarAction.REMOVE.ordinal(), ModalActionSheetListItem.Appearance.Negative, wzo0Var.itemView.getContext().getString(R.string.vkim_chat_settings_avatar_remove), null, null, R.drawable.vk_icon_delete_outline_28, null, false, false, 472);
                    }
                    arrayList2.add(modalActionSheetListItem);
                }
                c0785a.b = arrayList2;
                c0785a.c = new gib0(wzo0Var, 16);
                c0785a.a(wzo0Var.itemView.getContext(), null);
                return s3q0.a;
        }
    }
}
