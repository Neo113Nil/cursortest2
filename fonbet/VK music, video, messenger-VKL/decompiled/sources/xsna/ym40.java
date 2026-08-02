package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.fp4;
import xsna.ym40;

/* compiled from: MusicLoader.java */
/* loaded from: classes3.dex */
public final class ym40 extends Fragment {
    public io.reactivex.rxjava3.disposables.c h;
    public final aa40 i;
    public int j;
    public UserId k;
    public boolean l;
    public Integer m;
    public ArrayList<MusicTrack> n;
    public String o;
    public ArrayList p;

    /* compiled from: MusicLoader.java */
    public class a {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public a(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }
    }

    /* compiled from: MusicLoader.java */
    public interface b {
        void A6(@NonNull ym40 ym40Var);

        void si(@NonNull ym40 ym40Var, @NonNull ArrayList arrayList);

        void yb(@NonNull ym40 ym40Var);
    }

    public ym40() {
        pn40 pn40Var = k840.a;
        this.i = new aa40();
        this.k = UserId.d;
        this.l = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            this.j = bundle.getInt("MusicLoader.key.offset");
            this.l = bundle.getBoolean("MusicLoader.key.canLoadMore");
            if (bundle.containsKey("MusicLoader.key.playlistsCount")) {
                this.m = Integer.valueOf(bundle.getInt("MusicLoader.key.playlistsCount"));
            }
            Bundle bundle2 = bundle.getBundle("MusicLoader.key.musicTracks");
            this.i.getClass();
            this.n = aa40.a(MusicTrack.class, bundle2, "MusicLoader.key.musicTracks");
            this.o = bundle.getString("MusicLoader.key.reason");
            this.k = (UserId) bundle.getParcelable("MusicLoader.key.owner_id");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
            this.h = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("MusicLoader.key.offset", this.j);
        bundle.putParcelable("MusicLoader.key.owner_id", this.k);
        bundle.putBoolean("MusicLoader.key.canLoadMore", this.l);
        Integer num = this.m;
        if (num != null) {
            bundle.putInt("MusicLoader.key.playlistsCount", num.intValue());
        }
        ArrayList<MusicTrack> arrayList = this.n;
        this.i.getClass();
        bundle.putBundle("MusicLoader.key.musicTracks", aa40.b("MusicLoader.key.musicTracks", arrayList));
        bundle.putString("MusicLoader.key.reason", this.o);
    }

    public final void tn(int i, int i2, boolean z) {
        UserId c;
        if (this.h != null) {
            return;
        }
        Bundle arguments = getArguments();
        final fp4 fp4Var = new fp4(arguments);
        final a aVar = new a(z, i, i2);
        if (fp4Var.c.b == 0) {
            if (arguments == null || (c = (UserId) arguments.getParcelable("MusicLoader.key.owner_id")) == null) {
                c = o25.a().c();
            }
            fp4Var.c = c;
        }
        UserId userId = fp4Var.c;
        fp4Var.c = userId;
        this.h = new io.reactivex.rxjava3.internal.operators.single.r(rsg0.D0(yfb.x(hx4.r(fp4Var.a, userId, null, Integer.valueOf(i), Integer.valueOf(i2), null, null, 15934))), new e10(new dp4(fp4Var, z, 0), 5)).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ep4
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                fp4.a aVar2 = fp4Var.b;
                ym40.a aVar3 = ym40.a.this;
                int i3 = aVar3.c;
                int i4 = aVar3.b;
                ym40 ym40Var = ym40.this;
                ym40Var.h = null;
                if (aVar3.a) {
                    ym40Var.m = aVar2.a;
                }
                if (i4 == 0) {
                    ym40Var.l = !aVar2.b.isEmpty();
                    ym40Var.j = i3;
                    ym40Var.n = aVar2.b;
                    ArrayList arrayList = ym40Var.p;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ym40.b) it.next()).A6(ym40Var);
                        }
                        return;
                    }
                    return;
                }
                boolean isEmpty = aVar2.b.isEmpty();
                ym40Var.l = !isEmpty;
                if (!isEmpty) {
                    ym40Var.j = i4 + i3;
                    ym40Var.n.addAll(aVar2.b);
                }
                ArrayList arrayList2 = ym40Var.p;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((ym40.b) it2.next()).si(ym40Var, aVar2.b);
                    }
                }
            }
        }, new nf1(new yx0(aVar, 6), 4));
    }
}
