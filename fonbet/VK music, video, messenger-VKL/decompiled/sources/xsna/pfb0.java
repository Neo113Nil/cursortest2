package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.qfb0;

/* compiled from: PlaylistsLoader.java */
/* loaded from: classes3.dex */
public final class pfb0 implements hx2<com.vk.dto.music.a> {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qfb0 d;

    public pfb0(qfb0 qfb0Var, int i, int i2) {
        this.d = qfb0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.hx2
    public final void b(com.vk.dto.music.a aVar) {
        com.vk.dto.music.a aVar2 = aVar;
        qfb0 qfb0Var = this.d;
        qfb0Var.h = null;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 0) {
            qfb0Var.l &= !aVar2.b.isEmpty();
            qfb0Var.j = i;
            qfb0Var.m = aVar2.b;
            ArrayList arrayList = qfb0Var.o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((qfb0.a) it.next()).F7(qfb0Var);
                }
                return;
            }
            return;
        }
        VKList<Playlist> vKList = aVar2.b;
        boolean isEmpty = vKList.isEmpty();
        qfb0Var.l = !isEmpty;
        if (!isEmpty) {
            qfb0Var.j = i2 + i;
            qfb0Var.m.addAll(vKList);
        }
        ArrayList arrayList2 = qfb0Var.o;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((qfb0.a) it2.next()).mm(qfb0Var, vKList);
            }
        }
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        qfb0 qfb0Var = this.d;
        qfb0Var.h = null;
        String vKApiExecutionException2 = vKApiExecutionException.toString();
        qfb0Var.n = vKApiExecutionException2;
        L.G("vk", vKApiExecutionException2);
        if (this.b == 0) {
            ArrayList arrayList = qfb0Var.o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((qfb0.a) it.next()).Fc(qfb0Var);
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = qfb0Var.o;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((qfb0.a) it2.next()).getClass();
            }
        }
    }
}
