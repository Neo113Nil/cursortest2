package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.TintTextView;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.common.posting.listfriends.ListFriendsIconDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cqc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bqc0 implements izs {
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ cqc0 f;

    public /* synthetic */ bqc0(List list, List list2, List list3, List list4, cqc0 cqc0Var) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = cqc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.vk.core.view.PhotoStackView, com.vk.imageloader.view.VKMultiImageView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r4;
        List H0;
        ?? r1;
        List H02;
        cqc0.c cVar = (cqc0.c) obj;
        int i = 0;
        bwt0.p0(cVar.c(), false);
        bwt0.p0(cVar.f(), true);
        bwt0.p0(cVar.g(), true);
        List list = this.b;
        List list2 = list;
        List list3 = this.c;
        if (list2 == null || list2.isEmpty()) {
            cVar.f().setTitle(R.string.clips_privacy_forbidden_friends);
        } else {
            List list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                cVar.f().setTitle(R.string.clips_privacy_forbidden_friends_lists);
            } else {
                cVar.f().setTitle(R.string.clips_privacy_forbidden_friends_and_friends_lists);
            }
        }
        List list5 = this.d;
        List list6 = list5;
        boolean z = (list6 == null || list6.isEmpty() || list3.isEmpty()) ? false : true;
        List list7 = this.e;
        boolean z2 = (list7 == null || list7.isEmpty() || list2.isEmpty()) ? false : true;
        bwt0.p0(cVar.g(), true);
        f4m.q(iah0.a(12), cVar.g());
        ((TintTextView) cVar.g().findViewById(R.id.posting_visibility_counter_stack_count)).setText((z && z2) ? String.format(y8g0.e(R.string.clips_privacy_modal_bottomsheet_unavailable_friends_and_lists), Arrays.copyOf(new Object[]{y8g0.c(R.plurals.friends_quantity, list3.size()), y8g0.c(R.plurals.lists_friends_quantity, list.size())}, 2)) : z ? y8g0.c(R.plurals.friends_quantity, list3.size()) : y8g0.c(R.plurals.lists_friends_quantity, list.size()));
        ?? r15 = (PhotoStackView) cVar.g().findViewById(R.id.posting_visibility_counter_stack_images);
        int size = list3.size();
        int size2 = list.size();
        int size3 = size < 3 ? list3.size() : 2;
        int i2 = (size == 0 || size == 1) ? size2 : 1;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new ListFriendsIconDrawable(size3 + i3, ListFriendsIconDrawable.IconSizes.OVERLAP_MINIATURES, 4));
        }
        if (size2 == 0) {
            if (list5 == null || (H02 = j5g.H0(list5, 3)) == null) {
                r1 = EmptyList.b;
            } else {
                r1 = new ArrayList();
                Iterator it = H02.iterator();
                while (it.hasNext()) {
                    ImageList imageList = ((ProfileFriendItem) it.next()).e;
                    int i4 = this.f.t;
                    Image Bb = imageList.Bb(i4, i4);
                    String str = Bb != null ? Bb.d : null;
                    if (str != null) {
                        r1.add(str);
                    }
                }
            }
            PhotoStackView.b bVar = PhotoStackView.M;
            r15.r(-1, r1);
        } else if (size == 0) {
            List H03 = j5g.H0(arrayList, size2);
            PhotoStackView.b bVar2 = PhotoStackView.M;
            r15.getClass();
            int size4 = H03.size();
            r15.setCount(size4);
            while (i < size4) {
                r15.j((Drawable) H03.get(i), i);
                i++;
            }
        } else {
            int min = Math.min(2, size);
            if (list5 == null || (H0 = j5g.H0(list5, min)) == null) {
                r4 = EmptyList.b;
            } else {
                r4 = new ArrayList();
                Iterator it2 = H0.iterator();
                while (it2.hasNext()) {
                    Image Bb2 = ((ProfileFriendItem) it2.next()).e.Bb(cn70.b(50), cn70.b(50));
                    String str2 = Bb2 != null ? Bb2.d : null;
                    if (str2 != null) {
                        r4.add(str2);
                    }
                }
            }
            List I0 = j5g.I0(3 - min, arrayList);
            PhotoStackView.b bVar3 = PhotoStackView.M;
            r15.getClass();
            int size5 = r4.size() + I0.size();
            r15.setCount(size5);
            int i5 = 0;
            int i6 = 0;
            while (i < size5) {
                if (i5 < r4.size()) {
                    r15.h(i, (String) r4.get(i5));
                    i5++;
                } else {
                    r15.j((Drawable) I0.get(i6), i);
                    i6++;
                }
                i++;
            }
        }
        return s3q0.a;
    }
}
