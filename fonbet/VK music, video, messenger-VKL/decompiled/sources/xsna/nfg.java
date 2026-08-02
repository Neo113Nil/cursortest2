package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;

/* compiled from: CommentsListThreadPaginator.kt */
/* loaded from: classes4.dex */
public abstract class nfg {
    public final ListDataSet<cbg> a;
    public final dbg b;
    public final FragmentImpl c;
    public UserId d = UserId.d;
    public int e;
    public int f;
    public String g;
    public String h;

    /* JADX WARN: Multi-variable type inference failed */
    public nfg(ListDataSet<cbg> listDataSet, dbg dbgVar, d9c0 d9c0Var) {
        this.a = listDataSet;
        this.b = dbgVar;
        this.c = (FragmentImpl) d9c0Var;
    }

    public final int a(iag iagVar) {
        if (iagVar == null) {
            return -1;
        }
        ListDataSet<cbg> listDataSet = this.a;
        int size = listDataSet.d.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            cbg c = listDataSet.c(i2);
            if (c != null) {
                if (ogg.a.contains(Integer.valueOf(c.c))) {
                    if (!epx.f(iagVar, c.b)) {
                        if (!epx.f(iagVar, c.a)) {
                            if (i != -1) {
                                break;
                            }
                        } else {
                            iag iagVar2 = c.b;
                            if (iagVar2 != null) {
                                iagVar = iagVar2;
                            }
                        }
                    }
                    i = i2;
                } else {
                    continue;
                }
            }
        }
        return i;
    }

    public final int b(NewsComment newsComment) {
        if (newsComment == null) {
            return -1;
        }
        return this.a.w(new mfg(new defpackage.h0(8, this, newsComment), 0));
    }

    public abstract void c(int i, iag iagVar);
}
