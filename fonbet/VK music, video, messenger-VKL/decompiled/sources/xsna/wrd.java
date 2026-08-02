package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$addDraft$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class wrd extends SuspendLambda implements wzs<lud, spj<? super s3q0>, Object> {
    final /* synthetic */ otd $draft;
    final /* synthetic */ boolean $setActive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrd(otd otdVar, boolean z, spj<? super wrd> spjVar) {
        super(2, spjVar);
        this.$draft = otdVar;
        this.$setActive = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        wrd wrdVar = new wrd(this.$draft, this.$setActive, spjVar);
        wrdVar.L$0 = obj;
        return wrdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super s3q0> spjVar) {
        return ((wrd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        otd otdVar = this.$draft;
        final boolean z = this.$setActive;
        final gyg0 gyg0Var = ludVar.a;
        String jSONObject = q6x.D(otdVar).e5().toString();
        final String p = gyg0Var.p();
        final ContentValues contentValues = new ContentValues();
        String p2 = gyg0Var.p();
        Cursor rawQuery = gyg0Var.getReadableDatabase().rawQuery("SELECT MAX(id) FROM " + p2, null);
        try {
            rawQuery.moveToFirst();
            final int i = rawQuery.getInt(0) + 1;
            ro.e(rawQuery, null);
            contentValues.put("id", Integer.valueOf(i));
            contentValues.put("json", jSONObject);
            contentValues.put("is_active", Boolean.valueOf(z));
            contentValues.put("edit_timestamp", Long.valueOf(System.currentTimeMillis()));
            try {
                fl3.k(gyg0Var.getWritableDatabase(), new izs() { // from class: xsna.eyg0
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                        gyg0 gyg0Var2 = gyg0.this;
                        gyg0Var2.b(sQLiteDatabase);
                        sQLiteDatabase.insert(p, null, contentValues);
                        gyg0Var2.d.f(new edo(String.valueOf(i), z));
                        return s3q0.a;
                    }
                });
            } catch (Throwable th) {
                gyg0Var.b.g(th, new Object[0]);
            }
            if (z) {
                ludVar.d = otdVar;
            }
            return s3q0.a;
        } finally {
        }
    }
}
