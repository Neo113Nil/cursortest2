package xsna;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoMessageStencilStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class kts0 implements its0, mtx0 {
    public final tgl0 b;
    public final a c;

    /* compiled from: VideoMessageStencilStorageManagerImpl.kt */
    public final class a extends dhl0<j0l0, Integer> {
    }

    public kts0(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new a(20, null, new jyq0(4), new mdk0(this, 13), new jts0(1, this, kts0.class, "putAllToDb", "putAllToDb(Ljava/util/Collection;)V", 0), tgl0Var.I0());
        if (((ArrayList) getAll()).isEmpty()) {
            e(e43.l(new j0l0(0L, 0L, 0, "M0 57.6C0 37.4381 0 27.3572 3.92377 19.6563C7.37521 12.8825 12.8825 7.37521 19.6563 3.92377C27.3572 0 37.4381 0 57.6 0H94.4C114.562 0 124.643 0 132.344 3.92377C139.117 7.37521 144.625 12.8825 148.076 19.6563C152 27.3572 152 37.4381 152 57.6V94.4C152 114.562 152 124.643 148.076 132.344C144.625 139.117 139.117 144.625 132.344 148.076C124.643 152 114.562 152 94.4 152H57.6C37.4381 152 27.3572 152 19.6563 148.076C12.8825 144.625 7.37521 139.117 3.92377 132.344C0 124.643 0 114.562 0 94.4V57.6Z"), new j0l0(0L, 0L, 1, "M216 108c0 59.647-48.353 108-108 108S0 167.647 0 108 48.353 0 108 0s108 48.353 108 108Z")));
        }
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.c();
    }

    @Override // xsna.its0
    public final List<j0l0> a(Collection<Integer> collection) {
        return j5g.O0(this.c.e(collection).values());
    }

    @Override // xsna.its0
    public final void b(long j) {
        this.b.I0().k().j("stencil_list_last_sync_time", j);
    }

    @Override // xsna.its0
    public final long c() {
        return this.b.I0().k().g("stencil_list_last_sync_time");
    }

    @Override // xsna.its0
    public final List<Integer> d() {
        ArrayList f = this.b.I0().k().f("stencil_list_sort_order_ids");
        return f == null ? EmptyList.b : f;
    }

    @Override // xsna.its0
    public final void e(Collection<j0l0> collection) {
        this.c.f(collection);
    }

    @Override // xsna.its0
    public final void f(List<Integer> list) {
        this.b.I0().k().i("stencil_list_sort_order_ids", list);
    }

    @Override // xsna.its0
    public final void g(int i) {
        this.b.I0().k().putInt("stencil_list_version", i);
    }

    @Override // xsna.its0
    public final List<j0l0> getAll() {
        Cursor d = this.b.b().d("SELECT * FROM video_message_stencil", null);
        ArrayList arrayList = new ArrayList(d.getCount());
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(new j0l0(d.getLong(2), d.getLong(3), d.getInt(0), d.getString(1)));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.its0
    public final int getVersion() {
        return this.b.I0().k().getInt("stencil_list_version", 0);
    }
}
