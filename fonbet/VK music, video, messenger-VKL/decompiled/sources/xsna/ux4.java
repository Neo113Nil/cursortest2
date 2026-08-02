package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaybackActionMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: AudioSnippetQueueImpl.kt */
/* loaded from: classes3.dex */
public final class ux4 implements px4 {
    public final vx4 a;
    public final sf1 b;
    public final mlf0 c;
    public final LinkedHashMap<String, ock0> d = new LinkedHashMap<>();
    public m80 e = m80.i;

    /* compiled from: AudioSnippetQueueImpl.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActiveSnippetMeta(actionTrigger=");
            sb.append(this.a);
            sb.append(", flowDirection=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public ux4(vx4 vx4Var, sf1 sf1Var, mlf0 mlf0Var, com.vk.im.engine.internal.storage.delegates.messages.b bVar) {
        this.a = vx4Var;
        this.b = sf1Var;
        this.c = mlf0Var;
    }

    @Override // xsna.px4
    public final void a(dg dgVar, m7 m7Var) {
        ya yaVar = new ya(4, this, dgVar);
        vx4 vx4Var = this.a;
        io.reactivex.rxjava3.disposables.g gVar = (io.reactivex.rxjava3.disposables.g) vx4Var.b;
        if (hg1.d(gVar.a())) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.y l = ((lx4) vx4Var.a).a().l(new t7(new e60(vx4Var, 6), 1));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        gVar.b(l.q(asu0.r()).m(asu0Var.d()).subscribe(new tf1(yaVar, 2), new um0(new jy(m7Var, 6), 3)));
    }

    @Override // xsna.px4
    public final void b(MusicTrack musicTrack, MusicTrack musicTrack2, sx4 sx4Var) {
        Object obj;
        MusicTrack musicTrack3;
        for (ock0 ock0Var : this.d.values()) {
            ArrayList<String> arrayList = ock0Var.i;
            ArrayList arrayList2 = ock0Var.f;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                wbk0 wbk0Var = (wbk0) obj;
                int i = wbk0Var.c.b;
                int i2 = musicTrack.b;
                if (i == i2 || ((musicTrack3 = wbk0Var.d) != null && musicTrack3.b == i2)) {
                    break;
                }
            }
            wbk0 wbk0Var2 = (wbk0) obj;
            if (wbk0Var2 != null) {
                int indexOf = arrayList2.indexOf(wbk0Var2);
                wbk0Var2.d = musicTrack2;
                if (musicTrack2.l) {
                    musicTrack2 = wbk0Var2.c;
                }
                String Fb = musicTrack2.Fb();
                if (indexOf >= 0 && indexOf < arrayList.size()) {
                    arrayList.set(indexOf, Fb);
                }
                sx4Var.invoke(Boolean.TRUE);
                return;
            }
        }
        sx4Var.invoke(Boolean.FALSE);
    }

    @Override // xsna.px4
    public final m80 c() {
        return this.e;
    }

    @Override // xsna.px4
    public final bck0 d(bck0 bck0Var) {
        a aVar;
        kx40 kx40Var = bck0Var.a;
        String string = bck0Var.c.getString("section_id");
        if (string == null) {
            throw new IllegalStateException("section_id required to update the current snippet");
        }
        LinkedHashMap<String, ock0> linkedHashMap = this.d;
        ock0 ock0Var = linkedHashMap.get(string);
        if (ock0Var == null) {
            throw new IllegalStateException("Snippet section not found by id ".concat(string).toString());
        }
        ArrayList arrayList = ock0Var.f;
        Iterator<T> it = linkedHashMap.values().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (epx.f((ock0) next, ock0Var)) {
                break;
            }
            i++;
        }
        int i2 = kx40Var.b.b;
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            Object next2 = it2.next();
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            if (((wbk0) next2).c.b == i2) {
                break;
            }
            i3++;
        }
        Integer valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
        if (valueOf == null) {
            throw new IllegalStateException(("Snippet not found by id " + i2).toString());
        }
        int intValue = valueOf.intValue();
        wbk0 wbk0Var = (wbk0) arrayList.get(intValue);
        boolean z = intValue == arrayList.size() - 1;
        if (((ry40) this.c.invoke()).h()) {
            aVar = new a(28, i <= this.e.d ? 3 : 1);
        } else {
            m80 m80Var = this.e;
            int i4 = m80Var.d;
            if (i > i4) {
                aVar = new a(7, 1);
            } else if (i < i4) {
                aVar = new a(8, 2);
            } else {
                int i5 = m80Var.e;
                aVar = intValue > i5 ? new a(7, 3) : intValue < i5 ? new a(8, 4) : new a(-3, 0);
            }
        }
        m80 m80Var2 = new m80(string, ock0Var.h, i, intValue, aVar.b, z, wbk0Var);
        this.e = m80Var2;
        this.b.invoke(m80Var2);
        return bck0.a(bck0Var, kx40.a(kx40Var, null, null, PlaybackActionMeta.zb(kx40Var.e, aVar.a, 0L, 2), false, 495));
    }

    @Override // xsna.px4
    public final ack0 e(MusicTrack musicTrack, String str) {
        ock0 ock0Var = this.d.get(str);
        if (ock0Var == null) {
            throw new IllegalStateException("Snippet section not found by id ".concat(str).toString());
        }
        ArrayList<String> arrayList = ock0Var.i;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                if (epx.f(it.next(), musicTrack.Fb())) {
                    return new ack0(musicTrack, arrayList);
                }
            }
        }
        throw new IllegalStateException(("Snippet not found by id " + musicTrack.Fb()).toString());
    }

    @Override // xsna.px4
    public final void release() {
        this.e = m80.i;
        vx4 vx4Var = this.a;
        ((io.reactivex.rxjava3.disposables.g) vx4Var.b).b(null);
        ((io.reactivex.rxjava3.disposables.g) vx4Var.c).b(null);
    }
}
