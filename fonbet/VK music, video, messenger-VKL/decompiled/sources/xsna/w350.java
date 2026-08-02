package xsna;

import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;
import xsna.ob00;

/* compiled from: MusicRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class w350 extends FunctionReferenceImpl implements izs<sy40, dz40.j> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00fe  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dz40.j invoke(sy40 sy40Var) {
        EmptyList emptyList;
        EmptyList emptyList2;
        Object obj;
        Iterator it;
        sy40 sy40Var2 = sy40Var;
        ((m450) this.receiver).getClass();
        da00 da00Var = sy40Var2.q;
        int i = 0;
        if (!epx.f(da00Var, ggp.a)) {
            if (da00Var instanceof cyk0) {
                cyk0 cyk0Var = (cyk0) da00Var;
                ArrayList arrayList = new ArrayList();
                List<String> list = cyk0Var.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new pa00((String) it2.next()));
                }
                arrayList.addAll(arrayList2);
                String str = cyk0Var.b;
                if (str != null) {
                    arrayList.add(new ka00(str, false));
                }
                emptyList2 = arrayList;
            } else if (da00Var instanceof yvo0) {
                yvo0 yvo0Var = (yvo0) da00Var;
                LyricsScrollMode lyricsScrollMode = sy40Var2.o;
                boolean z = !sy40Var2.h;
                ArrayList arrayList3 = new ArrayList();
                ob00.a aVar = yvo0Var.a;
                if (aVar != null) {
                    arrayList3.add(new na00(0, aVar.f, aVar.c, 0, z, 9));
                }
                ob00.b bVar = yvo0Var.c;
                ArrayList<ob00> arrayList4 = yvo0Var.b;
                ArrayList arrayList5 = new ArrayList();
                for (ob00 ob00Var : arrayList4) {
                    if (ob00Var instanceof ob00.d) {
                        ob00.d dVar = (ob00.d) ob00Var;
                        obj = new qa00(dVar.f, dVar.d, dVar.e, lyricsScrollMode == LyricsScrollMode.AUTO ? ob00Var.c : true);
                    } else if (ob00Var instanceof ob00.c) {
                        ob00.c cVar = (ob00.c) ob00Var;
                        obj = new ma00(cVar.d, cVar.e, lyricsScrollMode == LyricsScrollMode.AUTO ? ob00Var.c : true);
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        arrayList5.add(obj);
                    }
                }
                arrayList3.addAll(arrayList5);
                arrayList3.add(new ka00(bVar.e, bVar.c));
                emptyList2 = arrayList3;
            } else {
                emptyList = EmptyList.b;
            }
            LyricsScrollMode lyricsScrollMode2 = sy40Var2.o;
            TabLyricsMode tabLyricsMode = sy40Var2.p;
            it = emptyList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((ja00) it.next()).a()) {
                    break;
                }
                i++;
            }
            return new dz40.j(lyricsScrollMode2, tabLyricsMode, emptyList2, i, da00Var instanceof cyk0);
        }
        emptyList = EmptyList.b;
        emptyList2 = emptyList;
        LyricsScrollMode lyricsScrollMode22 = sy40Var2.o;
        TabLyricsMode tabLyricsMode2 = sy40Var2.p;
        it = emptyList2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
            i++;
        }
        return new dz40.j(lyricsScrollMode22, tabLyricsMode2, emptyList2, i, da00Var instanceof cyk0);
    }
}
