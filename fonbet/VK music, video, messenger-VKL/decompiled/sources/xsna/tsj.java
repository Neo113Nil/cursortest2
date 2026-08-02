package xsna;

import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Converters.kt */
/* loaded from: classes18.dex */
public final class tsj {
    public static final Owner a(Group group) {
        UserId e = fkq0.e(fkq0.a(group.c));
        String str = group.d;
        String str2 = group.e;
        VerifyInfo verifyInfo = group.y;
        boolean z = group.t;
        Image image = group.g;
        String str3 = group.w0;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = group.x0;
        Owner owner = new Owner(e, str, group.f, str2, verifyInfo, image, null, null, null, null, null, null, null, z, false, false, false, null, 0, null, str3, groupsVideoLivesDataDto != null ? groupsVideoLivesDataDto.e() : false, 1040320, null);
        owner.B(group.n0);
        owner.g(2, group.i);
        owner.g(4, group.j);
        owner.o(group.o());
        owner.n(group.m > 0);
        owner.g(64, group.E);
        owner.g(2048, group.C());
        owner.t = group.v;
        return owner;
    }

    public static Owner b(Collection collection, int i, Boolean bool, int i2) {
        String str;
        String str2;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        Boolean bool2 = (i2 & 4) != 0 ? null : bool;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            String str3 = ((Artist) it.next()).c;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        String g0 = j5g.g0(arrayList, ", ", null, null, 0, null, 62);
        Iterator it2 = collection2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            Image image = ((Artist) it2.next()).f;
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                str2 = Owner.a.a(100, image);
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
                break;
            }
        }
        Owner owner = new Owner(null, g0, null, str, null, null, null, null, null, null, null, null, null, false, false, false, false, null, i3, null, null, false, 3932149, null);
        owner.g(32, true);
        if (bool2 != null) {
            owner.g(4, bool2.booleanValue());
        }
        return owner;
    }
}
