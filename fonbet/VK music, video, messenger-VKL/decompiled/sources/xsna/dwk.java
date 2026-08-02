package xsna;

import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.health.aacl;
import com.huawei.hms.hihealth.data.HealthKitApiInvoker;
import com.huawei.hms.hihealth.options.ReadOptions;
import com.huawei.hms.hihealth.result.ReadDetailResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.diff.MessagesGetDiffContentApiCmd;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.DownloadType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.bsj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dwk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dwk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object[], kotlin.Pair[]] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object[], xsna.kwe0[]] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        int intValue;
        int i;
        ArrayList arrayList;
        int i2;
        Collection<kwe0> collection;
        Iterator it;
        int i3;
        Pair pair;
        int i4;
        kwe0 kwe0Var;
        ?? r0;
        ArrayList<lj30> n;
        ?? r3;
        ReadDetailResult aab;
        int i5 = this.b;
        int i6 = 1;
        int i7 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i5) {
            case 0:
                SQLiteDatabase writableDatabase = ((fwk) obj2).getWritableDatabase();
                StringBuilder sb = new StringBuilder("uid=");
                sb.append((String) obj);
                return Boolean.valueOf(writableDatabase.delete("app_state_cache", sb.toString(), null) > 0);
            case 1:
                w2w w2wVar = (w2w) obj2;
                abx0 abx0Var = (abx0) obj;
                ArrayList arrayList2 = abx0Var.a;
                boolean z = abx0Var.b;
                Pair pair2 = new Pair(15, 20);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    bsj bsjVar = (bsj) it2.next();
                    ArrayList<Pair> arrayList4 = new ArrayList();
                    com.vk.im.engine.models.dialogs.a aVar = bsjVar.a;
                    if (aVar != null) {
                        intValue = aVar.d;
                    } else {
                        bsj.a aVar2 = bsjVar.b;
                        Integer num = aVar2 != null ? aVar2.c : null;
                        intValue = num != null ? num.intValue() : i7;
                    }
                    arrayList4.add(new Pair(Integer.valueOf(intValue), z ? MessageSource.DIFF_CONTENT_WARMUP_READ_PUSH : MessageSource.DIFF_CONTENT_WARMUP_READ));
                    brt.a(arrayList4, bsjVar.d(), z ? MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION_PUSH : MessageSource.DIFF_CONTENT_WARMUP_REPLY_MENTION);
                    brt.a(arrayList4, bsjVar.e(w2wVar), z ? MessageSource.DIFF_CONTENT_WARMUP_REACTION_PUSH : MessageSource.DIFF_CONTENT_WARMUP_REACTION);
                    brt.a(arrayList4, Collections.singletonList(Integer.valueOf(bsjVar.c())), z ? MessageSource.DIFF_CONTENT_WARMUP_LAST_PUSH : MessageSource.DIFF_CONTENT_WARMUP_LAST);
                    if (arrayList4.size() > i6) {
                        List D0 = j5g.D0(new drt(i7), arrayList4);
                        ?? r12 = new Pair[i6];
                        r12[i7] = j5g.Y(D0);
                        ArrayList o = e43.o(r12);
                        for (Object obj3 : D0) {
                            if (((Number) ((Pair) j5g.i0(o)).i()).intValue() + 2 < ((Number) ((Pair) obj3).i()).intValue()) {
                                o.add(obj3);
                            }
                        }
                        arrayList4 = o;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Pair pair3 : arrayList4) {
                        int intValue2 = ((Number) pair2.i()).intValue();
                        int intValue3 = ((Number) pair2.j()).intValue();
                        int i8 = -intValue3;
                        int i9 = intValue2 + intValue3;
                        d040 o2 = w2wVar.I0().o();
                        int i10 = i7;
                        boolean z2 = z;
                        long a = bsjVar.a();
                        int c = bsjVar.c();
                        int i11 = i6;
                        int intValue4 = ((Number) pair3.i()).intValue();
                        int intValue5 = ((Number) pair2.i()).intValue();
                        int intValue6 = ((Number) pair2.j()).intValue();
                        Msg t0 = o2.t0(intValue4, a);
                        if (t0 != null) {
                            gkx0 gkx0Var = t0.p;
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            it = it2;
                            i3 = i8;
                            ArrayList<lj30> n2 = o2.n(Peer.a.b(a), gkx0Var, Direction.BEFORE, intValue5 + 1);
                            if (!n2.isEmpty()) {
                                for (lj30 lj30Var : n2) {
                                    if (lj30Var.i || lj30Var.j) {
                                        r0 = i10;
                                        int i12 = intValue6 + 1;
                                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                                        n = o2.n(Peer.a.b(a), gkx0Var, Direction.AFTER, i12);
                                        if (!n.isEmpty()) {
                                            for (lj30 lj30Var2 : n) {
                                                if (lj30Var2.i || lj30Var2.j) {
                                                    r3 = i10;
                                                    if (r3 != 0 && n.size() < i12 && ((lj30) j5g.i0(n)).d != c) {
                                                        r3 = i10;
                                                    }
                                                    pair = new Pair(Boolean.valueOf((boolean) r0), Boolean.valueOf((boolean) r3));
                                                }
                                            }
                                        }
                                        r3 = i11;
                                        if (r3 != 0) {
                                            r3 = i10;
                                        }
                                        pair = new Pair(Boolean.valueOf((boolean) r0), Boolean.valueOf((boolean) r3));
                                    }
                                }
                            }
                            r0 = i11;
                            int i122 = intValue6 + 1;
                            Serializer.c<Peer> cVar22 = Peer.CREATOR;
                            n = o2.n(Peer.a.b(a), gkx0Var, Direction.AFTER, i122);
                            if (!n.isEmpty()) {
                            }
                            r3 = i11;
                            if (r3 != 0) {
                            }
                            pair = new Pair(Boolean.valueOf((boolean) r0), Boolean.valueOf((boolean) r3));
                        } else {
                            it = it2;
                            i3 = i8;
                            Boolean bool = Boolean.FALSE;
                            pair = new Pair(bool, bool);
                        }
                        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
                        boolean booleanValue2 = ((Boolean) pair.g()).booleanValue();
                        if (booleanValue && booleanValue2) {
                            kwe0Var = null;
                        } else {
                            if (booleanValue || booleanValue2) {
                                if (booleanValue) {
                                    i4 = (-i9) + 1;
                                } else if (booleanValue2) {
                                    i4 = i10;
                                }
                                kwe0Var = new kwe0(((Number) pair3.i()).intValue(), i4, i9, (MessageSource) pair3.j());
                            }
                            i4 = i3;
                            kwe0Var = new kwe0(((Number) pair3.i()).intValue(), i4, i9, (MessageSource) pair3.j());
                        }
                        if (kwe0Var != null) {
                            arrayList5.add(kwe0Var);
                        }
                        i7 = i10;
                        z = z2;
                        i6 = i11;
                        it2 = it;
                    }
                    Iterator it3 = it2;
                    int i13 = i6;
                    int i14 = i7;
                    boolean z3 = z;
                    if (arrayList5.size() <= i13) {
                        i = i13;
                        arrayList = arrayList5;
                    } else {
                        List D02 = j5g.D0(new z5m(i13), arrayList5);
                        ?? r2 = new kwe0[i13];
                        r2[i14] = j5g.Y(D02);
                        ArrayList o3 = e43.o(r2);
                        int size = D02.size();
                        for (int i15 = 1; i15 < size; i15++) {
                            kwe0 kwe0Var2 = (kwe0) j5g.i0(o3);
                            kwe0 kwe0Var3 = (kwe0) D02.get(i15);
                            if (kwe0Var2.e < kwe0Var3.f || kwe0Var3.e < kwe0Var2.f) {
                                o3.add(D02.get(i15));
                            } else {
                                kwe0 kwe0Var4 = (kwe0) xy9.b(1, o3);
                                kwe0 kwe0Var5 = (kwe0) D02.get(i15);
                                int min = Math.min(kwe0Var4.f, kwe0Var5.f);
                                int max = Math.max(kwe0Var4.e, kwe0Var5.e);
                                int min2 = Math.min(kwe0Var4.a, kwe0Var5.a);
                                kwe0 kwe0Var6 = new kwe0(min2, -(max - min2), max - min, kwe0Var4.d);
                                if (kwe0Var6.e - kwe0Var6.f < 500) {
                                    o3.set(o3.size() - 1, kwe0Var6);
                                } else {
                                    o3.add(D02.get(i15));
                                }
                            }
                        }
                        i = 1;
                        arrayList = o3;
                    }
                    if (arrayList.size() > 3) {
                        i2 = i14;
                        collection = j5g.D0(new crt(i2), arrayList).subList(i2, 3);
                    } else {
                        i2 = i14;
                        collection = arrayList;
                    }
                    for (kwe0 kwe0Var7 : collection) {
                        arrayList3.add(new Pair(new MessagesGetDiffContentApiCmd.MessagesDiffContentInput(bsjVar.a(), Integer.valueOf(kwe0Var7.a), Integer.valueOf(kwe0Var7.b), Integer.valueOf(kwe0Var7.c), null, null, null, 112, null), kwe0Var7.d));
                    }
                    i7 = i2;
                    z = z3;
                    i6 = i;
                    it2 = it3;
                }
                int i16 = i7;
                boolean z4 = z;
                if (arrayList3.isEmpty()) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"getDiffContent request", "nothing to request"});
                    }
                } else {
                    long n3 = w2wVar.getConfig().n();
                    if (n3 != 0) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"getDiffContent", qlb0.a(n3, "delay getDiffContent for ", UcumUtils.UCUM_MILLISECODS)});
                        }
                        Thread.sleep(n3);
                    }
                    Iterator it4 = arrayList3.iterator();
                    int i17 = i16;
                    while (it4.hasNext()) {
                        i17 += ((MessagesGetDiffContentApiCmd.MessagesDiffContentInput) ((Pair) it4.next()).i()).a();
                    }
                    if (i17 < 500) {
                        brt.b(w2wVar, arrayList3, z4);
                    } else {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it5 = arrayList3.iterator();
                        while (true) {
                            int i18 = i16;
                            if (it5.hasNext()) {
                                Pair pair4 = (Pair) it5.next();
                                if (((MessagesGetDiffContentApiCmd.MessagesDiffContentInput) pair4.i()).a() + i18 < 500) {
                                    arrayList6.add(pair4);
                                    i16 = ((MessagesGetDiffContentApiCmd.MessagesDiffContentInput) pair4.i()).a() + i18;
                                } else {
                                    brt.b(w2wVar, arrayList6, z4);
                                    arrayList6.clear();
                                    arrayList6.add(pair4);
                                    i16 = ((MessagesGetDiffContentApiCmd.MessagesDiffContentInput) pair4.i()).a();
                                }
                            } else if (!arrayList6.isEmpty()) {
                                brt.b(w2wVar, arrayList6, z4);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 2:
                return ((jq40) obj2).I((UserId) obj, DownloadType.DOWNLOADED);
            default:
                aab = aacl.aab((HealthKitApiInvoker) obj2, (ReadOptions) obj);
                return aab;
        }
    }
}
