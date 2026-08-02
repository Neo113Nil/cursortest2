package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: LiveLikesViewHolder.kt */
/* loaded from: classes3.dex */
public final class sjz extends vfz<rjz> {
    public final VkUserStack l;
    public final VkText m;

    public sjz(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.l = (VkUserStack) constraintLayout.findViewById(R.id.avatar_box);
        this.m = (VkText) constraintLayout.findViewById(R.id.tv_likes);
    }

    @Override // xsna.vfz
    public final void W5(rjz rjzVar) {
        String string;
        rjz rjzVar2 = rjzVar;
        ArrayList arrayList = rjzVar2.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) j5g.a0(((Image) it.next()).b);
            String str = imageSize != null ? imageSize.d.d : null;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            itj0.d((String) it2.next(), arrayList3);
        }
        this.l.setAvatars(arrayList3);
        ArrayList arrayList4 = rjzVar2.d;
        int i = rjzVar2.c;
        int size = arrayList4.size();
        int size2 = i - arrayList4.size();
        if (size == 1) {
            string = i == size ? this.itemView.getContext().getString(R.string.live_liked_one, arrayList4.get(0)) : this.itemView.getContext().getString(R.string.live_liked_one_more, arrayList4.get(0), this.itemView.getContext().getResources().getQuantityString(R.plurals.live_people_dat, size2, Integer.valueOf(size2)));
        } else if (size != 2) {
            string = this.itemView.getContext().getString(R.string.live_liked_many, this.itemView.getContext().getResources().getQuantityString(R.plurals.live_people_dat_many, size2, Integer.valueOf(size2)));
        } else {
            String str2 = (String) j5g.Y(drm0.c0((CharSequence) arrayList4.get(0), new String[]{" "}, 0, 6));
            String str3 = (String) j5g.Y(drm0.c0((CharSequence) arrayList4.get(1), new String[]{" "}, 0, 6));
            string = i == size ? this.itemView.getContext().getString(R.string.live_liked_two, str2, str3) : this.itemView.getContext().getString(R.string.live_liked_two_more, str2, str3, this.itemView.getContext().getResources().getQuantityString(R.plurals.live_people_dat, size2, Integer.valueOf(size2)));
        }
        this.m.setText(string);
    }
}
