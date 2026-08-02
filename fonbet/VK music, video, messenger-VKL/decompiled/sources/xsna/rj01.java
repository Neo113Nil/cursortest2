package xsna;

import android.database.Cursor;
import android.graphics.Rect;
import android.os.Trace;
import android.util.ArraySet;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.google.android.gms.common.util.VisibleForTesting;
import com.vk.catalog2.common.ui.mvp.configuration.reload.CatalogReloadTrigger;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Direction;
import com.vk.dto.common.id.UserId;
import com.vk.dto.tags.Tag;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTagRequestParam;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class rj01 implements ej2, xca, fh30 {
    public Object b;

    public /* synthetic */ rj01(Object obj) {
        this.b = obj;
    }

    @Override // xsna.fh30
    public List E(int i, long j, Long l) {
        ArrayList h = h(j, i, l, false);
        ArrayList arrayList = new ArrayList(c5g.u(h, 10));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            arrayList.add((Attach) ((Pair) it.next()).j());
        }
        return j5g.H0(arrayList, i);
    }

    @Override // xsna.fh30
    public void K0(int i, long j, boolean z) {
        ((tgl0) this.b).b().execSQL("UPDATE messages SET was_played_server = ? WHERE dialog_id = ? AND cnv_msg_id = ?", new String[]{String.valueOf(z ? 1L : 0L), String.valueOf(j), String.valueOf(i)});
    }

    @Override // xsna.fh30
    public ArrayList N(long j, int i, int i2, Long l) {
        ArrayList h = h(j, i + i2, l, true);
        ArrayList arrayList = new ArrayList();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Pair) next).i()).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((Attach) ((Pair) it2.next()).j());
        }
        List H0 = j5g.H0(arrayList2, i);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = h.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!((Boolean) ((Pair) next2).i()).booleanValue()) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add((Attach) ((Pair) it4.next()).j());
        }
        return j5g.u0(j5g.H0(arrayList4, i2), H0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fh30
    public List O(long j) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = (tgl0) this.b;
        String a = qlb0.a(j, "\n            SELECT *\n            FROM messages m INDEXED BY idx_messages_time\n            JOIN message_attaches ma INDEXED BY idx_message_attaches_attach_content_type\n            ON m.local_id = ma.msg_local_id\n            WHERE m.time > ", "\n              AND ma.content_type = 3\n              AND m.was_played_server = 0\n            LIMIT 100 \n            ");
        try {
            m = tgl0Var.b().m(a, null);
            arrayList = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a2 = Result.a(failure);
                Object obj = failure;
                if (a2 != null) {
                    try {
                        a2.getMessage();
                        Cursor n = tgl0Var.b().n(a, null);
                        ArrayList arrayList2 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                        n.moveToNext();
                                    }
                                }
                            } finally {
                                n.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    obj = failure2;
                }
                Throwable a3 = Result.a(obj);
                if (a3 != null) {
                    L.e(a3, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(obj);
                return (List) obj;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fh30
    public Collection U(long j, long j2, long j3) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = (tgl0) this.b;
        StringBuilder b = fp.b(j3, "\n            SELECT *\n            FROM messages\n            WHERE local_id IN (SELECT msg_local_id FROM message_attaches WHERE content_type = 3)\n                AND dialog_id = ", "\n                AND time >= ");
        b.append(j);
        String c = e630.c(b, "\n                AND time < ", j2, "\n            ");
        try {
            m = tgl0Var.b().m(c, null);
            arrayList = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a = Result.a(failure);
                Object obj = failure;
                if (a != null) {
                    try {
                        a.getMessage();
                        Cursor n = tgl0Var.b().n(c, null);
                        ArrayList arrayList2 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                        n.moveToNext();
                                    }
                                }
                            } finally {
                                n.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    obj = failure2;
                }
                Throwable a2 = Result.a(obj);
                if (a2 != null) {
                    L.e(a2, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(obj);
                return (Collection) obj;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    @Override // xsna.fh30
    public List Y(Class cls, UserId userId, Long l) {
        return k0(j14.b(cls), userId, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fh30
    public ArraySet Z(UserId userId, Collection collection) {
        Result.Failure failure;
        Iterable iterable;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = (tgl0) this.b;
        if (collection.isEmpty()) {
            iterable = EmptyList.b;
        } else {
            String a = zr.a("\n            SELECT *\n            FROM messages\n            WHERE local_id IN(\n                SELECT msg_local_id\n                FROM message_attaches\n                WHERE content_type IN(", j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62), "))\n            ");
            try {
                m = tgl0Var.b().m(a, null);
                arrayList = new ArrayList(m.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            try {
                try {
                    if (m.moveToFirst()) {
                        while (!m.isAfterLast()) {
                            arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                            m.moveToNext();
                        }
                    }
                    Throwable a2 = Result.a(failure);
                    Result.Failure failure2 = failure;
                    if (a2 != null) {
                        try {
                            a2.getMessage();
                            Cursor n = tgl0Var.b().n(a, null);
                            ArrayList arrayList2 = new ArrayList(n.getCount());
                            Trace.beginSection(ndp0.f("Cursor.forEach"));
                            try {
                                try {
                                    if (n.moveToFirst()) {
                                        while (!n.isAfterLast()) {
                                            arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                            n.moveToNext();
                                        }
                                    }
                                } finally {
                                    n.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            failure2 = new Result.Failure(th2);
                        }
                    }
                    Throwable a3 = Result.a(failure2);
                    if (a3 != null) {
                        L.e(a3, "rawQueryWithPossibleLargeData");
                    }
                    kotlin.a.a(failure2);
                    iterable = (Collection) failure2;
                } finally {
                }
            } finally {
                m.close();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : iterable) {
            gtx0 gtx0Var = (Msg) obj;
            if ((gtx0Var instanceof com.vk.im.engine.models.messages.a) && ((com.vk.im.engine.models.messages.a) gtx0Var).l4(new owv(userId, 0), true) != null) {
                arrayList3.add(obj);
            }
        }
        ArraySet arraySet = new ArraySet();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arraySet.add(Integer.valueOf(((Msg) it.next()).b));
        }
        return arraySet;
    }

    @Override // xsna.fh30
    public Attach b(int i) {
        Object failure;
        Object failure2;
        Cursor n;
        tgl0 tgl0Var = (tgl0) this.b;
        String b = tgw.b(i, "\n                SELECT *\n                FROM messages\n                WHERE local_id IN(SELECT msg_local_id FROM message_attaches WHERE attach_local_id = ", ")\n                ");
        try {
            Cursor m = tgl0Var.b().m(b, null);
            try {
                failure = m.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(m) : null;
                m.close();
            } catch (Throwable th) {
                m.close();
                throw th;
            }
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            try {
                a.getMessage();
                n = tgl0Var.b().n(b, null);
            } catch (Throwable th3) {
                failure2 = new Result.Failure(th3);
            }
            try {
                failure2 = n.moveToFirst() ? com.vk.im.engine.internal.storage.delegates.messages.a.b(n) : null;
                failure = failure2;
            } finally {
                n.close();
            }
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.e(a2, "rawQueryWithPossibleLargeData");
        }
        kotlin.a.a(failure);
        gtx0 gtx0Var = (Msg) failure;
        if (gtx0Var instanceof com.vk.im.engine.models.messages.a) {
            return (Attach) j5g.a0(((com.vk.im.engine.models.messages.a) gtx0Var).X9(new gh30(i, 0)));
        }
        return null;
    }

    @Override // xsna.xca
    public boolean d(CatalogReloadTrigger catalogReloadTrigger) {
        return ((Set) this.b).contains(catalogReloadTrigger);
    }

    @Override // xsna.ej2
    public dj2 e(wk2 wk2Var, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new hj2();
        }
        return new dj2(animatedFactoryV2Impl.g, wk2Var, rect, animatedFactoryV2Impl.d);
    }

    @Override // xsna.fh30
    public Integer e0(int i) {
        return fl3.J(((tgl0) this.b).b().d("SELECT msg_local_id FROM message_attaches WHERE attach_local_id = ?", new String[]{String.valueOf(i)}));
    }

    public io.reactivex.rxjava3.internal.operators.single.n0 f(List list) {
        xba0 xba0Var = (xba0) this.b;
        List<PhotoTagRequestParam> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (PhotoTagRequestParam photoTagRequestParam : list2) {
            arrayList.add(rsg0.w0(yfb.x(xba0Var.a.b(photoTagRequestParam.b, photoTagRequestParam.c, Tag.ContentType.PHOTO.h(), photoTagRequestParam.d))));
        }
        return io.reactivex.rxjava3.core.x.D(arrayList, new iu4(new cww(xba0Var, 29), 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fh30
    public List g(Collection collection) {
        Result.Failure failure;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = (tgl0) this.b;
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        String str = "\n            SELECT *\n            FROM messages\n            WHERE local_id IN(SELECT msg_local_id FROM message_attaches WHERE attach_local_id IN (" + p4g.k(collection, StringUtils.COMMA, null) + "))\n            ";
        try {
            m = tgl0Var.b().m(str, null);
            arrayList = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a = Result.a(failure);
                Object failure2 = failure;
                if (a != null) {
                    try {
                        a.getMessage();
                        Cursor n = tgl0Var.b().n(str, null);
                        ArrayList arrayList2 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                        n.moveToNext();
                                    }
                                }
                                failure2 = arrayList2;
                            } finally {
                                n.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                }
                Throwable a2 = Result.a(failure2);
                if (a2 != null) {
                    L.e(a2, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(failure2);
                return (List) failure2;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    public ArrayList h(long j, int i, Long l, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        long j2 = Long.MAX_VALUE;
        int i2 = 0;
        while (arrayList.size() < i && i2 < 5) {
            i2++;
            StringBuilder sb = new StringBuilder("\n        SELECT ma.attach_local_id, m.is_incoming, ma.msg_date\n        FROM message_attaches ma\n        INNER JOIN messages m ON ma.msg_local_id = m.local_id\n        WHERE ma.dialog_id = ?\n          AND ma.content_type = 20\n          AND ma.msg_date < ?\n          ");
            if (l == null || (str = defpackage.k0.a(l.longValue(), "AND ma.msg_date >= ")) == null) {
                str = "";
            }
            sb.append(str);
            sb.append("\n        ORDER BY ma.msg_date DESC\n        LIMIT 100\n    ");
            Cursor d = ((tgl0) this.b).b().d(xqm0.g(sb.toString()), new String[]{String.valueOf(j), String.valueOf(j2)});
            ArrayList arrayList2 = new ArrayList(d.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        Integer valueOf = Integer.valueOf(d.getInt(0));
                        boolean z2 = true;
                        if (d.getInt(1) != 1) {
                            z2 = false;
                        }
                        arrayList2.add(new Triple(valueOf, Boolean.valueOf(z2), Long.valueOf(d.getLong(2))));
                        d.moveToNext();
                    }
                }
                try {
                    Trace.endSection();
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                    arrayList.addAll(rli0.A(rli0.y(rli0.t(new i5g(arrayList2), new f58(this, z, 4)), i - arrayList.size())));
                    long longValue = ((Number) ((Triple) j5g.i0(arrayList2)).k()).longValue();
                    if (arrayList2.size() < 100) {
                        break;
                    }
                    j2 = longValue;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
            }
        }
        return arrayList;
    }

    public boolean i(nov novVar, nov novVar2) {
        if (!qjg.a(novVar).equals(qjg.a(novVar2))) {
            return false;
        }
        if ((novVar instanceof xlo0) && (novVar2 instanceof xlo0)) {
            xlo0 xlo0Var = (xlo0) novVar;
            xlo0 xlo0Var2 = (xlo0) novVar2;
            return epx.f(xlo0Var.k, xlo0Var2.k) && epx.f(xlo0Var.l, xlo0Var2.l);
        }
        if ((novVar instanceof c8m0) && (novVar2 instanceof c8m0)) {
            return ((c8m0) novVar).r == ((c8m0) novVar2).r;
        }
        if ((novVar instanceof v4l0) && (novVar2 instanceof v4l0)) {
            return epx.f(((v4l0) novVar).m(), ((v4l0) novVar2).m());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fh30
    public List k0(int i, UserId userId, Long l) {
        Result.Failure failure;
        Result.Failure failure2;
        Cursor m;
        ArrayList arrayList;
        tgl0 tgl0Var = (tgl0) this.b;
        String a = zr.a("\n            SELECT *\n            FROM messages\n            WHERE local_id IN(\n                SELECT msg_local_id\n                FROM message_attaches\n                ", "WHERE content_type = " + i + " AND content_id = " + l + " AND content_owner_id = " + userId.b, "\n            )\n            ");
        try {
            m = tgl0Var.b().m(a, null);
            arrayList = new ArrayList(m.getCount());
            Trace.beginSection(ndp0.f("Cursor.forEach"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        try {
            try {
                if (m.moveToFirst()) {
                    while (!m.isAfterLast()) {
                        arrayList.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(m));
                        m.moveToNext();
                    }
                }
                Throwable a2 = Result.a(failure);
                Object obj = failure;
                if (a2 != null) {
                    try {
                        a2.getMessage();
                        Cursor n = tgl0Var.b().n(a, null);
                        ArrayList arrayList2 = new ArrayList(n.getCount());
                        Trace.beginSection(ndp0.f("Cursor.forEach"));
                        try {
                            try {
                                if (n.moveToFirst()) {
                                    while (!n.isAfterLast()) {
                                        arrayList2.add(com.vk.im.engine.internal.storage.delegates.messages.a.b(n));
                                        n.moveToNext();
                                    }
                                }
                            } finally {
                                n.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    obj = failure2;
                }
                Throwable a3 = Result.a(obj);
                if (a3 != null) {
                    L.e(a3, "rawQueryWithPossibleLargeData");
                }
                kotlin.a.a(obj);
                return (List) obj;
            } finally {
            }
        } finally {
            m.close();
        }
    }

    @Override // xsna.fh30
    public List r(long j, int i, int i2, Direction direction, List list) {
        boolean z;
        String g0 = j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62);
        Direction direction2 = Direction.BEFORE;
        String str = direction == direction2 ? "DESC" : "ASC";
        String str2 = direction == direction2 ? "<" : ">";
        StringBuilder sb = new StringBuilder("\n            SELECT DISTINCT attach_local_id FROM message_attaches\n             WHERE (dialog_id = ");
        sb.append(j);
        sb.append(" AND mv_cnv_msg_id ");
        sb.append(str2);
        sb.append(' ');
        sb.append(i);
        sb.append(") \n             AND content_type IN (");
        sb.append(g0);
        n6j.b(sb, ")\n             ORDER BY mv_cnv_msg_id ", str, ", position ", str);
        sb.append(" \n             LIMIT ");
        sb.append(i2);
        sb.append("\n        ");
        Cursor d = ((tgl0) this.b).b().d(xqm0.g(sb.toString()), null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        Attach b = b(d.getInt(0));
                        if (b != null) {
                            arrayList.add(b);
                        }
                        d.moveToNext();
                    }
                }
                d.close();
                Trace.endSection();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Attach attach = (Attach) next;
                    boolean z2 = attach instanceof AttachImage;
                    boolean z3 = attach instanceof AttachVideo;
                    boolean z4 = z3 && ((AttachVideo) attach).b.Ia();
                    if (z3) {
                        AttachVideo attachVideo = (AttachVideo) attach;
                        if (attachVideo.b.isExternal() && myc0.f(attachVideo.b.getPlatform())) {
                            z = true;
                            boolean z5 = (z3 || ((AttachVideo) attach).b.R7() == null) ? false : true;
                            if (!z2 || (z4 && !z && !z5)) {
                                arrayList2.add(next);
                            }
                        }
                    }
                    z = false;
                    if (z3) {
                    }
                    if (!z2) {
                    }
                    arrayList2.add(next);
                }
                return direction == Direction.BEFORE ? j5g.y0(arrayList2) : arrayList2;
            } catch (Throwable th) {
                d.close();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // xsna.fh30
    public Msg v(int i) {
        return (Msg) j5g.a0(g(Collections.singletonList(Integer.valueOf(i))));
    }
}
