package xsna;

import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.photo.Photo;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.m68.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h68 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h68(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (this.b) {
            case 0:
                m68 m68Var = (m68) this.c;
                Photo photo = (Photo) obj;
                if (m68Var.f(photo)) {
                    AttachmentWithMedia attachmentWithMedia = m68Var.G;
                    m68.d(m68Var, photo, m68Var.new b(((PhotoAttachment) attachmentWithMedia).l, m68Var.b));
                    break;
                }
                break;
            default:
                qvl0 qvl0Var = (qvl0) this.c;
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null) {
                    u5p0 u5p0Var = qvl0Var.i;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.s.g.i.a(zjm0Var));
                    break;
                }
                break;
        }
    }
}
