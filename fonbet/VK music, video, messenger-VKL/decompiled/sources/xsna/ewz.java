package xsna;

import android.content.Context;
import android.database.Cursor;
import com.vk.dto.common.id.UserId;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.c2r0;

/* compiled from: LocalUsersStore.kt */
/* loaded from: classes6.dex */
public final class ewz implements c2r0, Closeable {
    public final bpn0 b;

    public ewz(Context context) {
        this.b = new bpn0(new xqf(context, 28));
    }

    @Override // xsna.c2r0
    public final boolean b(Context context, UserId userId) {
        Object failure;
        try {
            failure = Boolean.valueOf(((p0r0) this.b.getValue()).getWritableDatabase().delete("users", "user_id=?", new String[]{String.valueOf(userId.b)}) > 0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // xsna.c2r0
    public final io.reactivex.rxjava3.core.x<List<c2r0.b>> c(Context context, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new dwz(0, this, context));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bpn0 bpn0Var = this.b;
        if (bpn0Var.isInitialized()) {
            ((p0r0) bpn0Var.getValue()).close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.c2r0
    public final List<c2r0.b> h(Context context, boolean z) {
        Result.Failure failure;
        try {
            Cursor query = ((p0r0) this.b.getValue()).getReadableDatabase().query("users", null, null, null, null, null, "timestamp DESC");
            try {
                ArrayList arrayList = new ArrayList();
                while (query.moveToNext()) {
                    arrayList.add(f2r0.a(query));
                }
                query.close();
                failure = arrayList;
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        EmptyList emptyList = EmptyList.b;
        boolean z2 = failure instanceof Result.Failure;
        Object obj = failure;
        if (z2) {
            obj = emptyList;
        }
        return (List) obj;
    }

    @Override // xsna.c2r0
    public final boolean i(Context context, UserId userId) {
        return b(context, userId);
    }

    @Override // xsna.c2r0
    public final boolean j(Context context, c2r0.b bVar) {
        Object failure;
        try {
            failure = Boolean.valueOf(((p0r0) this.b.getValue()).getWritableDatabase().update("users", f2r0.b(bVar), "user_id=?", new String[]{String.valueOf(bVar.a.b)}) > 0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // xsna.c2r0
    public final boolean k(Context context, c2r0.b bVar) {
        Object failure;
        try {
            failure = Boolean.valueOf(((p0r0) this.b.getValue()).getWritableDatabase().insertWithOnConflict("users", null, f2r0.b(bVar), 5) > 0);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }
}
