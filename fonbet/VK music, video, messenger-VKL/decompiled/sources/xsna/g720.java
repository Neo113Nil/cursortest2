package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g720 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ g720(ArrayList arrayList, int i) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        ArrayList<gza0> arrayList = this.c;
        switch (i) {
            case 0:
                k720 k720Var = k720.a;
                return k720.S(rdi.A(0, arrayList));
            case 1:
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it.next()));
                }
                int e = on00.e(c5g.u(arrayList, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (gza0 gza0Var : arrayList) {
                    Pair pair = new Pair(gza0Var.a, gza0Var.e);
                    linkedHashMap.put(pair.i(), pair.j());
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    MusicTrack musicTrack = (MusicTrack) it2.next();
                    Object obj2 = linkedHashMap.get(musicTrack.Fb());
                    if (obj2 == null) {
                        bn40.h("audio.getById returned an unknown audio!");
                        Object obj3 = PlaybackLaunchMeta.g;
                        obj2 = PlaybackLaunchMeta.a.a();
                    }
                    arrayList3.add(new xd50(musicTrack, (PlaybackLaunchMeta) obj2));
                }
                return arrayList3;
            default:
                tra0.a aVar = (tra0.a) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kp10 kp10Var = (kp10) arrayList.get(i2);
                    List<tra0> list2 = kp10Var.b;
                    boolean z = kp10Var.h;
                    if (kp10Var.l == Integer.MIN_VALUE) {
                        xzw.a("position() should be called first");
                    }
                    int size2 = list2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        tra0 tra0Var = list2.get(i3);
                        ArrayList arrayList4 = arrayList;
                        long d = h9x.d((r12[r13 + 1] & 4294967295L) | (kp10Var.j[i3 * 2] << 32), kp10Var.c);
                        if (z) {
                            tra0.a.L(aVar, tra0Var, d);
                        } else {
                            tra0.a.D(aVar, tra0Var, d);
                        }
                        i3++;
                        arrayList = arrayList4;
                    }
                }
                return s3q0.a;
        }
    }
}
