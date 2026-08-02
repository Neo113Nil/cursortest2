package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import com.vk.music.attach.dto.PlaylistSearchResult;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ceb0;

/* compiled from: PlaylistSearchResultsLoader.java */
/* loaded from: classes3.dex */
public final class beb0 implements hx2<VKList<Playlist>> {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ceb0 d;

    public beb0(ceb0 ceb0Var, int i, int i2) {
        this.d = ceb0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.hx2
    public final void b(VKList<Playlist> vKList) {
        VKList<Playlist> vKList2 = vKList;
        ceb0 ceb0Var = this.d;
        ceb0Var.i = null;
        PlaylistSearchResult playlistSearchResult = new PlaylistSearchResult(vKList2);
        int i = this.c;
        int i2 = this.b;
        if (i2 == 0) {
            ceb0Var.k = !vKList2.isEmpty();
            ceb0Var.j = i;
            ceb0Var.l = playlistSearchResult;
            ArrayList arrayList = ceb0Var.n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ceb0.a) it.next()).Xb();
                }
                return;
            }
            return;
        }
        boolean isEmpty = vKList2.isEmpty();
        ceb0Var.k = !isEmpty;
        if (!isEmpty) {
            ceb0Var.j = i2 + i;
            PlaylistSearchResult playlistSearchResult2 = ceb0Var.l;
            playlistSearchResult2.getClass();
            if (playlistSearchResult.b != null) {
                if (playlistSearchResult2.b == null) {
                    playlistSearchResult2.b = new ArrayList();
                }
                playlistSearchResult2.b.addAll(playlistSearchResult.b);
            }
            if (playlistSearchResult.c != null) {
                if (playlistSearchResult2.c == null) {
                    playlistSearchResult2.c = new ArrayList();
                }
                playlistSearchResult2.c.addAll(playlistSearchResult.c);
            }
        }
        ArrayList arrayList2 = ceb0Var.n;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ceb0.a) it2.next()).s4(ceb0Var, playlistSearchResult);
            }
        }
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        ceb0 ceb0Var = this.d;
        ceb0Var.i = null;
        String vKApiExecutionException2 = vKApiExecutionException.toString();
        ceb0Var.m = vKApiExecutionException2;
        L.G("vk", vKApiExecutionException2);
        if (this.b == 0) {
            ArrayList arrayList = ceb0Var.n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ceb0.a) it.next()).T6();
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = ceb0Var.n;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((ceb0.a) it2.next()).getClass();
            }
        }
    }
}
