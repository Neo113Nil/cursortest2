package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.ok.gleffects.dto.UserInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g1e implements izs {
    public final /* synthetic */ h1e b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ g1e(h1e h1eVar, boolean z) {
        this.b = h1eVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        List list = (List) obj;
        h1e h1eVar = this.b;
        h1eVar.e = true;
        int i = 0;
        if (this.c) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                jkq0 jkq0Var = (jkq0) obj2;
                Regex regex = com.vk.core.files.a.a;
                PrivateFiles privateFiles = e8r.a;
                PrivateSubdir privateSubdir = PrivateSubdir.FRIENDS_AVATARS;
                privateFiles.getClass();
                b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
                File file = new File(b.a, (i + 46) + "png");
                if (!file.exists()) {
                    file.mkdirs();
                }
                arrayList.add(new Pair(file, jkq0Var));
                i = i2;
            }
            int i3 = 9;
            ((io.reactivex.rxjava3.disposables.g) h1eVar.g.getValue()).b(io.reactivex.rxjava3.core.q.O(arrayList).w(new l7(new sa(h1eVar, 25), i3)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).E0().subscribe(new pp3(new m7(h1eVar, 29), i3), new st0(new n8(L.a, 2), 7)));
        } else {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (Object obj3 : list3) {
                int i4 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                jkq0 jkq0Var2 = (jkq0) obj3;
                UserInfo userInfo = (UserInfo) j5g.b0(i, h1eVar.c);
                arrayList2.add(new UserInfo(userInfo != null ? userInfo.userAvatarFile : null, jkq0Var2.b, jkq0Var2.c, jkq0Var2.d, jkq0Var2.e));
                i = i4;
            }
            h1eVar.c = arrayList2;
            h1eVar.a.d(arrayList2);
        }
        return s3q0.a;
    }
}
