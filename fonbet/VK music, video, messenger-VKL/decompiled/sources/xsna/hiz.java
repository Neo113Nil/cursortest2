package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: LiveAuthorViewHolder.kt */
/* loaded from: classes3.dex */
public final class hiz extends vfz<giz> {
    public final VkAvatar l;
    public final VkText m;

    public hiz(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.l = (VkAvatar) constraintLayout.findViewById(R.id.avatar_image_view);
        this.m = (VkText) constraintLayout.findViewById(R.id.user_name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(giz gizVar) {
        String a;
        String str;
        int max = Math.max(this.itemView.getWidth(), ImageScreenSize.SIZE_48DP.h());
        oap<UserProfile, Group> oapVar = gizVar.b;
        boolean z = oapVar instanceof oap.b;
        if (z) {
            Image image = ((Group) ((oap.b) oapVar).a).g;
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                a = Owner.a.a(max, image);
            }
            a = null;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Image image2 = ((UserProfile) ((oap.a) oapVar).a).O;
            if (image2 != null) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                a = Owner.a.a(max, image2);
            }
            a = null;
        }
        this.l.o0(a, null);
        if (z) {
            str = ((Group) ((oap.b) oapVar).a).d;
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((UserProfile) ((oap.a) oapVar).a).e;
        }
        this.m.setText(str);
    }
}
