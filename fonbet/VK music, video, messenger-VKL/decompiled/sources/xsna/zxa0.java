package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zxa0 implements wzs {
    public final /* synthetic */ com.vk.music.player.playback.c b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ y1b0 f;

    public /* synthetic */ zxa0(com.vk.music.player.playback.c cVar, boolean z, boolean z2, String str, y1b0 y1b0Var) {
        this.b = cVar;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = y1b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01da  */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List<xsna.gza0>] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ?? arrayList;
        String str;
        String str2;
        MusicTrack musicTrack;
        String uuid;
        MusicTrack musicTrack2;
        String Fb;
        List list = (List) obj;
        String str3 = (String) obj2;
        com.vk.music.player.playback.c cVar = this.b;
        gza0 gza0Var = (gza0) j5g.a0(cVar.n);
        String str4 = gza0Var != null ? gza0Var.a : null;
        List<gza0> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (epx.f(((gza0) it.next()).a, str4)) {
                    List<gza0> list3 = cVar.n;
                    HashMap hashMap = new HashMap();
                    for (gza0 gza0Var2 : list3) {
                        String str5 = gza0Var2.a;
                        Object obj3 = hashMap.get(str5);
                        if (obj3 == null) {
                            obj3 = new LinkedList();
                            hashMap.put(str5, obj3);
                        }
                        ((List) obj3).add(gza0Var2);
                    }
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    for (gza0 gza0Var3 : list2) {
                        List list4 = (List) hashMap.get(gza0Var3.a);
                        gza0 gza0Var4 = list4 != null ? (gza0) g5g.H(list4) : null;
                        if (gza0Var4 == null) {
                            gza0Var4 = gza0.a(gza0Var3, null, UUID.randomUUID().toString(), 29);
                        }
                        arrayList.add(gza0Var4);
                    }
                    cVar.n = arrayList;
                    if (list.isEmpty() || cVar.n.isEmpty()) {
                        cVar.c.b(cVar.n);
                    }
                    if (str3 != null) {
                        Iterator it2 = cVar.n.iterator();
                        int i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i = -1;
                                break;
                            }
                            Object next = it2.next();
                            if (i < 0) {
                                e43.t();
                                throw null;
                            }
                            if (epx.f(((gza0) next).a, str3)) {
                                break;
                            }
                            i++;
                        }
                        Integer valueOf = i == -1 ? null : Integer.valueOf(i);
                        if (valueOf != null) {
                            gza0 gza0Var5 = (gza0) j5g.b0(valueOf.intValue() + 1, cVar.n);
                            if (gza0Var5 != null) {
                                str = gza0Var5.b;
                                str2 = this.e;
                                if (str2 != null) {
                                    str = str2;
                                }
                                boolean z = this.c;
                                y1b0 y1b0Var = this.f;
                                izs n43Var = z ? new n43(y1b0Var, str, cVar, 4) : new bya0(this.d, cVar, y1b0Var, str);
                                if (cVar.n.isEmpty()) {
                                    if (!cVar.t) {
                                        PlayerTrack playerTrack = cVar.i;
                                        n43Var.invoke(playerTrack != null ? playerTrack.f : null);
                                    }
                                } else if (z) {
                                    cVar.J(str, false, new y87(n43Var, 5));
                                } else {
                                    cVar.H(str, false, new cya0(n43Var, 0));
                                }
                                return s3q0.a;
                            }
                        }
                    }
                    str = null;
                    str2 = this.e;
                    if (str2 != null) {
                    }
                    boolean z2 = this.c;
                    y1b0 y1b0Var2 = this.f;
                    if (z2) {
                    }
                    if (cVar.n.isEmpty()) {
                    }
                    return s3q0.a;
                }
            }
        }
        PlayerTrack playerTrack2 = cVar.i;
        if (playerTrack2 == null || (musicTrack = playerTrack2.b) == null || !musicTrack.Wb()) {
            List<gza0> list5 = cVar.n;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(gza0.a((gza0) it3.next(), null, UUID.randomUUID().toString(), 29));
            }
            arrayList = j5g.O0(j5g.T0(list5, arrayList2));
        } else {
            PlayerTrack playerTrack3 = cVar.i;
            String str6 = (playerTrack3 == null || (musicTrack2 = playerTrack3.b) == null || (Fb = musicTrack2.Fb()) == null) ? null : (String) drm0.c0(Fb, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6).get(1);
            List<gza0> list6 = cVar.n;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            for (gza0 gza0Var6 : list2) {
                if (str6 == null || !str6.equals(gza0Var6.a)) {
                    uuid = UUID.randomUUID().toString();
                } else {
                    PlayerTrack playerTrack4 = cVar.i;
                    if (playerTrack4 == null || (uuid = playerTrack4.f) == null) {
                        uuid = UUID.randomUUID().toString();
                    }
                }
                arrayList3.add(gza0.a(gza0Var6, null, uuid, 29));
            }
            arrayList = j5g.O0(j5g.T0(list6, arrayList3));
        }
        cVar.n = arrayList;
        if (list.isEmpty()) {
        }
        cVar.c.b(cVar.n);
        if (str3 != null) {
        }
        str = null;
        str2 = this.e;
        if (str2 != null) {
        }
        boolean z22 = this.c;
        y1b0 y1b0Var22 = this.f;
        if (z22) {
        }
        if (cVar.n.isEmpty()) {
        }
        return s3q0.a;
    }
}
