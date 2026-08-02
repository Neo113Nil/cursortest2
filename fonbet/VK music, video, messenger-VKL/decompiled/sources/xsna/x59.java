package xsna;

import android.graphics.drawable.ColorDrawable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.imageloader.view.VKImageView;
import xsna.sew0;

/* compiled from: CallMemberAvatarHelper.kt */
/* loaded from: classes7.dex */
public final class x59 {
    public static void a(AvatarView avatarView, sew0 sew0Var) {
        if (sew0Var instanceof sew0.c) {
            sew0.c cVar = (sew0.c) sew0Var;
            avatarView.T0(null, new h2z(avatarView.getContext(), cVar.b, cVar.c));
        } else if (sew0Var instanceof sew0.b) {
            String d = d((sew0.b) sew0Var);
            avatarView.getClass();
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            avatarView.T0(ImageList.a.c(-1, -1, d), null);
        }
    }

    public static void b(VKImageView vKImageView, sew0 sew0Var) {
        if (sew0Var instanceof sew0.c) {
            sew0.c cVar = (sew0.c) sew0Var;
            vKImageView.setImageDrawable(new h2z(vKImageView.getContext(), cVar.b, cVar.c));
        } else if (sew0Var instanceof sew0.b) {
            vKImageView.load(d((sew0.b) sew0Var));
        }
    }

    public static final void c(VKImageView vKImageView, sew0 sew0Var) {
        if (!(sew0Var instanceof sew0.b)) {
            if (sew0Var instanceof sew0.c) {
                vKImageView.setImageDrawable(new ColorDrawable(l8g.c(0.7f, ((sew0.c) sew0Var).c)));
            }
        } else {
            sew0.b bVar = (sew0.b) sew0Var;
            if (bVar.d) {
                bwt0.S(vKImageView, new he3(2, sew0Var, vKImageView));
            } else {
                vKImageView.load(bVar.a());
            }
        }
    }

    public static final String d(sew0.b bVar) {
        String url;
        fxj0 fxj0Var = (fxj0) j5g.a0(bVar.b);
        return (fxj0Var == null || (url = fxj0Var.getUrl()) == null) ? "" : url;
    }
}
