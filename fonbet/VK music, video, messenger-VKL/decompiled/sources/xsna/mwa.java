package xsna;

import com.vk.channels.api.CommentsHistory;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.hag;

/* compiled from: ChannelCommentsInteractor.kt */
/* loaded from: classes16.dex */
public final class mwa {
    public final a1w a;
    public final long b;
    public final int c;
    public volatile a d;

    /* compiled from: ChannelCommentsInteractor.kt */
    public static final class a {
        public final MsgFromChannel a;
        public final CommentsHistory b;
        public final ProfilesSimpleInfo c;

        public a(MsgFromChannel msgFromChannel, CommentsHistory commentsHistory, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = msgFromChannel;
            this.b = commentsHistory;
            this.c = profilesSimpleInfo;
        }

        public static a a(a aVar, CommentsHistory commentsHistory, ProfilesSimpleInfo profilesSimpleInfo, int i) {
            MsgFromChannel msgFromChannel = aVar.a;
            if ((i & 4) != 0) {
                profilesSimpleInfo = aVar.c;
            }
            return new a(msgFromChannel, commentsHistory, profilesSimpleInfo);
        }

        public final a b(int i, Integer num) {
            hag.b bVar;
            Integer num2;
            CommentsHistory commentsHistory = this.b;
            List<hag> list = commentsHistory.a;
            hag a = rbg.a(list, Integer.valueOf(i), false);
            if (a != null) {
                hag.b bVar2 = a.l;
                if (num == null) {
                    if (bVar2 != null && (num2 = bVar2.c) != null) {
                        List<hag.a> list2 = bVar2.b;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        for (hag.a aVar : list2) {
                            if (aVar.a == num2.intValue()) {
                                aVar = new hag.a(aVar.a, aVar.b - 1);
                            }
                            arrayList.add(aVar);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((hag.a) next).b > 0) {
                                arrayList2.add(next);
                            }
                        }
                        int i2 = bVar2.a - 1;
                        if (i2 > 0) {
                            bVar = new hag.b(i2, arrayList2, null);
                        }
                    }
                    bVar = null;
                } else {
                    int intValue = num.intValue();
                    if (bVar2 != null) {
                        List<hag.a> list3 = bVar2.b;
                        if (!list3.isEmpty()) {
                            List<hag.a> list4 = list3;
                            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                            for (hag.a aVar2 : list4) {
                                int i3 = aVar2.a;
                                if (i3 == intValue) {
                                    aVar2 = new hag.a(i3, aVar2.b + 1);
                                }
                                arrayList3.add(aVar2);
                            }
                            bVar = new hag.b(bVar2.a + 1, arrayList3, num);
                        }
                    }
                    bVar = new hag.b(1, Collections.singletonList(new hag.a(intValue, 1)), num);
                }
                commentsHistory = CommentsHistory.a(commentsHistory, rbg.c(list, i, hag.a(a, null, false, bVar, false, 30719)), 0, 0, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            return a(this, commentsHistory, null, 5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "State(msg=" + this.a + ", commentsHistory=" + this.b + ", profiles=" + this.c + ')';
        }
    }

    public mwa(a1w a1wVar, long j, int i) {
        this.a = a1wVar;
        this.b = j;
        this.c = i;
    }

    public final a a() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Field lastState is null. Call loadComment() first");
    }

    public final io.reactivex.rxjava3.internal.operators.single.o b() {
        CommentsHistory.Order order;
        long j = this.b;
        int i = this.c;
        a aVar = this.d;
        if (aVar == null || (order = aVar.b.d) == null) {
            order = CommentsHistory.Order.ASC;
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.B(this.a.C(this, new iwa(j, i, null, null, order, 752)), this.a.C(this, new o2b(this.b, Collections.singletonList(Integer.valueOf(this.c)), MsgIdType.CNV_ID, Source.ACTUAL, false, false, this)), new pa(new nx7(this, 1), 7)).q(asu0.a.c()), new b00(new k9(this, 20), 8));
    }

    public final io.reactivex.rxjava3.core.x<a> c() {
        String str = a().b.e;
        if (str == null) {
            return sn.b("Unable to load more comment, nextFrom is null");
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(this.a.C(this, new iwa(this.b, this.c, null, str, a().b.d, 236)).l(new mj1(new v9(this, 16), 6)).q(asu0.a.c()), new w00(new tl0(this, 22), 6));
    }

    public final io.reactivex.rxjava3.internal.operators.single.o d(CommentsHistory.Order order) {
        return new io.reactivex.rxjava3.internal.operators.single.o(this.a.C(this, new iwa(this.b, this.c, null, null, order, 756)).l(new com.vk.movika.sdk.base.ui.j(new e1(this, 16), 9)).q(asu0.a.c()), new j50(new t6(this, 14), 8));
    }
}
