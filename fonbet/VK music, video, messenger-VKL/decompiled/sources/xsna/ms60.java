package xsna;

import android.text.TextUtils;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.NewsfeedList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.jv60;

/* compiled from: NewsfeedListsReducer.kt */
/* loaded from: classes4.dex */
public final class ms60 implements bm50<qz60, jv60.c> {
    public final lv60 a;

    public ms60(lv60 lv60Var) {
        this.a = lv60Var;
    }

    @Override // xsna.bm50
    public final qz60 a(qz60 qz60Var, jv60.c cVar) {
        qz60 qz60Var2 = qz60Var;
        jv60.c cVar2 = cVar;
        if (!this.a.a(qz60Var2, cVar2)) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return qz60Var2;
            }
            L.u(l, L.LogType.d, new Object[]{"Skipping " + cVar2});
            return qz60Var2;
        }
        if (!(cVar2 instanceof jv60.c.a)) {
            if (cVar2 instanceof jv60.c.b) {
                return qz60.a(qz60Var2, null, 0, ((jv60.c.b) cVar2).a, null, null, null, null, null, 251);
            }
            throw new NoWhenBranchMatchedException();
        }
        NewsfeedList newsfeedList = ((jv60.c.a) cVar2).a;
        ur60 ur60Var = qz60Var2.b;
        ur60 a = ur60.a(ur60Var, sq60.a(ur60Var.b, EmptyList.b, null, d9x.a, false, false, null, null, 130), null, null, null, false, false, 58);
        int i = newsfeedList.b;
        if (TextUtils.isEmpty(newsfeedList.c)) {
            newsfeedList = null;
        }
        return qz60.a(qz60Var2, a, i, null, newsfeedList, null, null, null, null, 244);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(jv60.c cVar) {
        return true;
    }
}
