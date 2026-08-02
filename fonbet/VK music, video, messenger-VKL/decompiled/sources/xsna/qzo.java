package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: EditCommentApiFieldsProvider.kt */
/* loaded from: classes4.dex */
public final class qzo {
    public static final List<String> c;
    public static final ArrayList d;
    public static final ArrayList e;
    public final ArrayList a = d;
    public final ArrayList b = e;

    static {
        List<String> l = e43.l("VERIFIED", "TRENDING", "FIRST_NAME_DAT", "EMOJI_STATUS", "IMAGE_STATUS", "HAS_UNSEEN_STORIES", "IS_VERIFIED", "PHOTO_BASE");
        c = l;
        List<String> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BaseUserGroupFieldsDto.valueOf((String) it.next()));
        }
        d = arrayList;
        List<String> list2 = c;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(UsersFieldsDto.valueOf((String) it2.next()));
        }
        e = arrayList2;
    }
}
