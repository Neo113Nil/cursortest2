package xsna;

import com.vk.channels.api.CommentsHistory;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: CommentHistory.kt */
/* loaded from: classes16.dex */
public final class rbg {
    public static final hag a(Collection<hag> collection, Integer num, boolean z) {
        Object obj;
        if (num != null) {
            for (hag hagVar : collection) {
                if (hagVar.a != num.intValue()) {
                    Iterator<T> it = hagVar.f.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((hag) obj).a == num.intValue()) {
                            break;
                        }
                    }
                    hag hagVar2 = (hag) obj;
                    if (hagVar2 != null) {
                        if (!z) {
                            return hagVar2;
                        }
                    }
                }
                return hagVar;
            }
        }
        return null;
    }

    public static final ArrayList b(List list, List list2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            hag hagVar = (hag) obj2;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (hagVar.a == ((hag) obj).a) {
                    break;
                }
            }
            if (obj == null) {
                arrayList.add(obj2);
            }
        }
        return j5g.u0(list2, arrayList);
    }

    public static final ArrayList c(List list, int i, hag hagVar) {
        List<hag> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hag hagVar2 : list2) {
            int i2 = hagVar2.a;
            CommentsHistory commentsHistory = hagVar2.f;
            if (i2 == i) {
                hagVar2 = hagVar;
            } else {
                if (a(commentsHistory.a, Integer.valueOf(i), false) != null) {
                    List<hag> list3 = commentsHistory.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (hag hagVar3 : list3) {
                        if (hagVar3.a == i) {
                            hagVar3 = hagVar;
                        }
                        arrayList2.add(hagVar3);
                    }
                    hagVar2 = hag.a(hagVar2, CommentsHistory.a(hagVar2.f, arrayList2, 0, 0, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), false, null, false, 32735);
                }
            }
            arrayList.add(hagVar2);
        }
        return arrayList;
    }

    public static final CommentsHistory d(CommentsHistory commentsHistory, final int i, final boolean z) {
        int i2 = commentsHistory.c;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        ArrayList arrayList = new ArrayList(commentsHistory.a);
        arrayList.replaceAll(new UnaryOperator() { // from class: xsna.qbg
            /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
            
                if (r3 != (-1)) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
            
                r6 = java.lang.Integer.valueOf(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
            
                if (r6 != null) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
            
                r2 = new java.util.ArrayList(r1.a);
                r2.set(r6.intValue(), xsna.hag.a((xsna.hag) r2.get(r6.intValue()), null, r5, null, r5, 24447));
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
            
                if (r5 == false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
            
                r11 = r11 - 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
            
                r1 = com.vk.channels.api.CommentsHistory.a(r1, r2, r11, 0, null, null, null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                r9.element = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
            
                return xsna.hag.a(r0, r1, false, null, false, 32735);
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
            
                r11 = r11 + 1;
             */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                hag hagVar = (hag) obj;
                CommentsHistory commentsHistory2 = hagVar.f;
                int i3 = hagVar.a;
                int i4 = i;
                Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef2;
                boolean z2 = z;
                int i5 = 0;
                boolean z3 = false;
                if (i3 != i4) {
                    List<hag> list = commentsHistory2.a;
                    int i6 = commentsHistory2.b;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        Integer num = null;
                        if (!it.hasNext()) {
                            i5 = -1;
                            break;
                        }
                        Object next = it.next();
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        if (((hag) next).a == i4) {
                            break;
                        }
                        i5++;
                    }
                } else {
                    ref$BooleanRef3.element = true;
                    if (!commentsHistory2.a.isEmpty()) {
                        List<hag> list2 = commentsHistory2.a;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (!((hag) it2.next()).h) {
                                    break;
                                }
                            }
                        }
                    }
                    z3 = true;
                    ref$BooleanRef.element = z3;
                    return hag.a(hagVar, null, z2, null, z2, 24447);
                }
            }
        });
        if (ref$BooleanRef2.element && ref$BooleanRef.element) {
            i2 = z ? i2 - 1 : i2 + 1;
        }
        return CommentsHistory.a(commentsHistory, arrayList, 0, i2, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
    }
}
