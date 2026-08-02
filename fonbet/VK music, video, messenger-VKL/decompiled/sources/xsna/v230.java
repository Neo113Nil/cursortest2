package xsna;

import com.vk.contacts.AndroidContact;
import com.vk.im.engine.models.users.User;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Model.kt */
/* loaded from: classes2.dex */
public final class v230 {
    public final List<Long> a;
    public final List<AndroidContact> b;
    public final boolean c;
    public final boolean d;
    public qtd0 e;
    public List<? extends qtd0> f;
    public List<e0o> g;
    public e0o h;
    public CharSequence i;
    public String j;
    public Integer k;

    public v230(List list, List list2, boolean z, boolean z2, String str, int i) {
        List list3 = (i & 1) != 0 ? EmptyList.b : list;
        List list4 = (i & 2) != 0 ? EmptyList.b : list2;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) == 0 ? z2 : false;
        User user = new User(0L, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, null, false, false, false, 0, null, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, false, -1, 4095, null);
        EmptyList emptyList = EmptyList.b;
        String str2 = (i & 256) != 0 ? "" : str;
        Integer num = (i & 1024) != 0 ? null : 0;
        this.a = list3;
        this.b = list4;
        this.c = z3;
        this.d = z4;
        this.e = user;
        this.f = emptyList;
        this.g = emptyList;
        this.h = null;
        this.i = str2;
        this.j = "";
        this.k = num;
    }
}
