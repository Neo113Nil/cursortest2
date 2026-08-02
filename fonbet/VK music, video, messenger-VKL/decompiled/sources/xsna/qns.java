package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FriendsCleanupRepository.kt */
/* loaded from: classes15.dex */
public final class qns {
    public final String a;
    public final Object b;
    public final Object c;
    public final Serializable d;

    public qns(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public io.reactivex.rxjava3.internal.operators.single.y a() {
        ots otsVar = (ots) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        otsVar.getClass();
        tfx tfxVar = new tfx("friends.getFriendsDeletionSuggestions", new kr(21), new lr(16));
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        tfx.o(tfxVar, "ref", this.a, 0, 0, 12);
        return rsg0.w0(yfb.x(tfxVar)).l(new y34(new sc(26), 17));
    }

    public qns(ots otsVar, b25 b25Var, String str) {
        this.b = otsVar;
        this.c = b25Var;
        this.a = str;
        List l = e43.l(UsersFieldsDto.VERIFIED, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.IS_NFT, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.LAST_NAME_ACC, UsersFieldsDto.MUTUAL, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.EDUCATION, UsersFieldsDto.OCCUPATION, UsersFieldsDto.CAREER, UsersFieldsDto.UNIVERSITIES, UsersFieldsDto.SEX, UsersFieldsDto.SOCIAL_BUTTON_TYPE, UsersFieldsDto.DESCRIPTIONS, UsersFieldsDto.PHOTO_BASE);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((UsersFieldsDto) it.next()).i());
        }
        this.d = arrayList;
    }
}
