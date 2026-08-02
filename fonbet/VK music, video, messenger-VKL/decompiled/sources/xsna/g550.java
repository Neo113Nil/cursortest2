package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.attach.dto.MusicSearchResult;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MusicSearchResultsLoader.java */
/* loaded from: classes3.dex */
public final class g550 extends Fragment {
    public final aa40 h;
    public String i;
    public io.reactivex.rxjava3.disposables.c j;
    public int k;
    public boolean l;

    @Nullable
    public MusicSearchResult m;
    public String n;
    public UserId o;
    public ArrayList p;

    /* compiled from: MusicSearchResultsLoader.java */
    public class a implements hx2<VKList<MusicTrack>> {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // xsna.hx2
        public final void b(VKList<MusicTrack> vKList) {
            VKList<MusicTrack> vKList2 = vKList;
            g550 g550Var = g550.this;
            g550Var.j = null;
            MusicSearchResult musicSearchResult = new MusicSearchResult(vKList2);
            int i = this.c;
            int i2 = this.b;
            if (i2 == 0) {
                g550Var.l = !vKList2.isEmpty();
                g550Var.k = i;
                g550Var.m = musicSearchResult;
                ArrayList arrayList = g550Var.p;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).pg();
                    }
                    return;
                }
                return;
            }
            boolean isEmpty = vKList2.isEmpty();
            g550Var.l = !isEmpty;
            if (!isEmpty) {
                g550Var.k = i2 + i;
                MusicSearchResult musicSearchResult2 = g550Var.m;
                musicSearchResult2.getClass();
                if (musicSearchResult.b != null) {
                    if (musicSearchResult2.b == null) {
                        musicSearchResult2.b = new ArrayList();
                    }
                    musicSearchResult2.b.addAll(musicSearchResult.b);
                }
                if (musicSearchResult.c != null) {
                    if (musicSearchResult2.c == null) {
                        musicSearchResult2.c = new ArrayList();
                    }
                    musicSearchResult2.c.addAll(musicSearchResult.c);
                }
            }
            ArrayList arrayList2 = g550Var.p;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).qa(g550Var, musicSearchResult);
                }
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            g550 g550Var = g550.this;
            g550Var.j = null;
            String vKApiExecutionException2 = vKApiExecutionException.toString();
            g550Var.n = vKApiExecutionException2;
            L.G("vk", vKApiExecutionException2);
            if (this.b == 0) {
                ArrayList arrayList = g550Var.p;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).u8();
                    }
                    return;
                }
                return;
            }
            ArrayList arrayList2 = g550Var.p;
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).getClass();
                }
            }
        }
    }

    /* compiled from: MusicSearchResultsLoader.java */
    public interface b {
        void pg();

        void qa(@NonNull g550 g550Var, @NonNull MusicSearchResult musicSearchResult);

        void u8();
    }

    public g550() {
        pn40 pn40Var = k840.a;
        this.h = new aa40();
        this.l = true;
        this.o = UserId.d;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.i = bundle.getString("MusicSearchResultsLoader.key.query");
            this.k = bundle.getInt("MusicSearchResultsLoader.key.offset");
            this.l = bundle.getBoolean("MusicSearchResultsLoader.key.canLoadMore");
            Bundle bundle2 = bundle.getBundle("MusicSearchResultsLoader.key.musicSearchResult");
            this.h.getClass();
            ArrayList a2 = aa40.a(MusicSearchResult.class, bundle2, "MusicSearchResultsLoader.key.musicSearchResult");
            Serializer.StreamParcelable streamParcelable = a2 != null ? (Serializer.StreamParcelable) j5g.a0(a2) : null;
            bn40.f("loadItem ", "key: ", "MusicSearchResultsLoader.key.musicSearchResult", " value_loaded: ", Boolean.valueOf(streamParcelable != null));
            this.m = (MusicSearchResult) streamParcelable;
            this.n = bundle.getString("MusicSearchResultsLoader.key.reason");
            this.o = (UserId) bundle.getParcelable("MusicSearchResultsLoader.key.ownerId");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.j;
        if (cVar != null) {
            cVar.dispose();
            this.j = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("MusicSearchResultsLoader.key.query", this.i);
        bundle.putInt("MusicSearchResultsLoader.key.offset", this.k);
        bundle.putBoolean("MusicSearchResultsLoader.key.canLoadMore", this.l);
        bundle.putString("MusicSearchResultsLoader.key.reason", this.n);
        bundle.putParcelable("MusicSearchResultsLoader.key.ownerId", this.o);
        MusicSearchResult musicSearchResult = this.m;
        if (musicSearchResult != null) {
            this.h.getClass();
            bn40.f("saved ".concat("MusicSearchResultsLoader.key.musicSearchResult"));
            bundle.putBundle("MusicSearchResultsLoader.key.musicSearchResult", aa40.b("MusicSearchResultsLoader.key.musicSearchResult", e43.a(musicSearchResult)));
        }
    }

    public final void tn(int i, int i2) {
        if (this.j != null) {
            return;
        }
        String str = this.i;
        if (str == null) {
            L.G("vk", "MusicSearchResultsLoader: query is not initialized");
            return;
        }
        UserId c = o25.a().c();
        if (fkq0.c(this.o)) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                this.o = c;
            } else {
                this.o = (UserId) arguments.getParcelable("MusicSearchResultsLoader.key.ownerId");
            }
        }
        this.j = new jx2(new dx4(i, i2, this.o, str, null), new a(i, i2)).a();
    }

    public final void un() {
        int i = this.k;
        if (i == 0) {
            i = 100;
        }
        tn(0, i);
    }
}
