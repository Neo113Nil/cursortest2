package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersGetFollowersFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.contacts.ContactsList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.s1r0;

/* compiled from: ContactListForPersonalChannelCmd.kt */
/* loaded from: classes2.dex */
public final class z8j extends le6<ContactsList> {
    public final int b;
    public final Source c;

    public z8j() {
        this(0);
    }

    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        Integer j;
        Collection collection = (Collection) ((xpp) w2wVar.L0(this, new ars(this.b, 4, Source.ACTUAL))).a();
        if (collection == null) {
            collection = EmptyList.b;
        }
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo((Collection<? extends qtd0>) collection);
        tfx tfxVar = new tfx("users.getFollowers", new ful0(3), new fbj0(5));
        int i = 0;
        tfxVar.f(0, 0, 1000, "count");
        int count = ((UsersGetFollowersFieldsResponseDto) bz2.d(tfxVar)).getCount();
        List singletonList = Collections.singletonList(UsersFieldsDto.COUNTERS);
        if ((59 & 4) != 0) {
            singletonList = null;
        }
        UsersUserCountersDto R = ((UsersUserFullDto) ((List) bz2.d(s1r0.a.b(null, null, singletonList, null, null))).get(0)).R();
        if (R != null && (j = R.j()) != null) {
            i = j.intValue();
        }
        return new ContactsList(profilesSimpleInfo.Mb(), profilesSimpleInfo, new sbj(null, 0L, 0L, null, null, null, null, null, false, true, false, count, i, null, 38911), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8j)) {
            return false;
        }
        z8j z8jVar = (z8j) obj;
        return this.b == z8jVar.b && this.c == z8jVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactListForPersonalChannelCmd(limit=" + this.b + ", source=" + this.c + ')';
    }

    public z8j(int i) {
        Source source = Source.ACTUAL;
        this.b = Integer.MAX_VALUE;
        this.c = source;
    }
}
