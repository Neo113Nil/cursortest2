package com.yandex.div.storage.database;

import android.database.Cursor;
import defpackage.kbs;
import defpackage.sls;
import defpackage.yvf0;
import defpackage.zy11;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/storage/database/ReadState;", "Ljava/io/Closeable;", "Lkotlin/Function0;", "Lzy11;", "onCloseState", "Lyvf0;", "Landroid/database/Cursor;", "cursorProvider", "<init>", "(Lsls;Lyvf0;)V", "close", "()V", "a", "Lsls;", "b", "Lyvf0;", "c", "Landroid/database/Cursor;", "_cursor", "()Landroid/database/Cursor;", "cursor", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ReadState implements Closeable {

    /* renamed from: a, reason: from kotlin metadata */
    private final sls onCloseState;

    /* renamed from: b, reason: from kotlin metadata */
    private final yvf0 cursorProvider;

    /* renamed from: c, reason: from kotlin metadata */
    private Cursor _cursor;

    public /* synthetic */ ReadState(sls slsVar, yvf0 yvf0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.w : slsVar, yvf0Var);
    }

    public final Cursor a() {
        if (this._cursor != null) {
            kbs.g("Cursor should be called only once");
            return null;
        }
        Cursor cursor = (Cursor) this.cursorProvider.get();
        this._cursor = cursor;
        return cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this._cursor;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        this.onCloseState.invoke();
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.yandex.div.storage.database.ReadState$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Lambda implements sls {
        public static final AnonymousClass1 w = new AnonymousClass1(0);

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.sls
        public final /* bridge */ /* synthetic */ Object invoke() {
            return zy11.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m142invoke() {
        }
    }

    public ReadState(sls slsVar, yvf0 yvf0Var) {
        this.onCloseState = slsVar;
        this.cursorProvider = yvf0Var;
    }
}
