package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.data.db.PostingDatabase;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: OldDraftsRepository.kt */
/* loaded from: classes4.dex */
public final class sz70 implements tkx {
    public final Context a;
    public final mui0 b;
    public final io.reactivex.rxjava3.core.w c;
    public final AtomicLong d;
    public final bpn0 e;

    public sz70(Context context, mui0 mui0Var) {
        io.reactivex.rxjava3.core.w c = asu0.a.c();
        this.a = context;
        this.b = mui0Var;
        this.c = c;
        this.d = new AtomicLong();
        this.e = new bpn0(new f540(this, 7));
    }

    @Override // xsna.tkx
    public final long a(UserId userId) {
        return this.d.get();
    }

    @Override // xsna.cfc0
    public final io.reactivex.rxjava3.core.x<Long> b(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new qnb(this, 2)).q(this.c);
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 c(UserId userId, final PostEditableData postEditableData) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.rz70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sz70 sz70Var = sz70.this;
                Long c = sz70Var.h().y().c(sz70Var.b.a());
                long d = sz70Var.h().y().d(sz70Var.i(postEditableData, c != null ? c.longValue() : 0L));
                if (d > 0) {
                    AtomicLong atomicLong = sz70Var.d;
                    while (!atomicLong.compareAndSet(atomicLong.get(), d)) {
                    }
                }
                return Long.valueOf(d);
            }
        }).q(this.c);
    }

    @Override // xsna.cfc0
    public final boolean d(UserId userId) {
        return this.d.get() > 0;
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 e(final long j, UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.qz70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sz70 sz70Var = sz70.this;
                mec0 y = sz70Var.h().y();
                UserId a = sz70Var.b.a();
                long j2 = j;
                kec0 b = y.b(j2, a);
                if (b != null) {
                    AtomicLong atomicLong = sz70Var.d;
                    while (!atomicLong.compareAndSet(atomicLong.get(), j2)) {
                    }
                }
                if (b == null) {
                    return PostEditableData.D;
                }
                return new PostEditableData(0, b.c, PostingTextRestriction.Invisible.b, b.i, b.j, b.k, b.l, b.d, b.f, b.e, b.m, b.n, b.g, b.h, b.o, b.q, b.p, false, b.r, null, false, new LinksParsingMetaData(null, null, null, null, 15, null), b.t, b.u, false, false, false, null, 251658240, null);
            }
        }).q(this.c);
    }

    @Override // xsna.tkx
    public final io.reactivex.rxjava3.internal.operators.single.f0 f(final long j, UserId userId, final PostEditableData postEditableData) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.pz70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sz70 sz70Var = sz70.this;
                long d = sz70Var.h().y().d(sz70Var.i(postEditableData, j));
                if (d > 0) {
                    AtomicLong atomicLong = sz70Var.d;
                    while (!atomicLong.compareAndSet(atomicLong.get(), d)) {
                    }
                }
                return Long.valueOf(d);
            }
        }).q(this.c);
    }

    @Override // xsna.cfc0
    public final io.reactivex.rxjava3.core.a g(final long j, UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.oz70
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sz70 sz70Var = sz70.this;
                sz70Var.h().y().a(j, sz70Var.b.a());
                AtomicLong atomicLong = sz70Var.d;
                while (!atomicLong.compareAndSet(atomicLong.get(), 0L)) {
                }
                return s3q0.a;
            }
        }).q(this.c);
    }

    public final PostingDatabase h() {
        return (PostingDatabase) this.e.getValue();
    }

    public final kec0 i(PostEditableData postEditableData, long j) {
        return new kec0(j, this.b.a(), postEditableData.c, postEditableData.i, postEditableData.k, postEditableData.j, postEditableData.n, postEditableData.o, postEditableData.e, postEditableData.f, postEditableData.g, postEditableData.h, postEditableData.l, postEditableData.m, postEditableData.p, postEditableData.r, postEditableData.q, postEditableData.t, null, postEditableData.x, postEditableData.y);
    }
}
