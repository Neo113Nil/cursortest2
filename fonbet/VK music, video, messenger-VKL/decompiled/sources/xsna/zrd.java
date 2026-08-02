package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsDraftComponentBase.kt */
@b6l(c = "com.vk.clips.sdk.drafts.impl.ClipsDraftComponentBase$getDraftsBatch$2", f = "ClipsDraftComponentBase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class zrd extends SuspendLambda implements wzs<lud, spj<? super List<? extends otd>>, Object> {
    final /* synthetic */ int $offset;
    final /* synthetic */ int $size;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrd(int i, int i2, spj<? super zrd> spjVar) {
        super(2, spjVar);
        this.$offset = i;
        this.$size = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zrd zrdVar = new zrd(this.$offset, this.$size, spjVar);
        zrdVar.L$0 = obj;
        return zrdVar;
    }

    @Override // xsna.wzs
    public final Object invoke(lud ludVar, spj<? super List<? extends otd>> spjVar) {
        return ((zrd) create(ludVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        lud ludVar = (lud) this.L$0;
        int i = this.$offset;
        int i2 = this.$size;
        gyg0 gyg0Var = ludVar.a;
        String p = gyg0Var.p();
        SQLiteDatabase readableDatabase = gyg0Var.getReadableDatabase();
        StringBuilder b = xy6.b(i2, "SELECT * FROM ", p, " WHERE deleted_at IS NULL ORDER BY edit_timestamp DESC LIMIT ", " OFFSET ");
        b.append(i);
        String sb = b.toString();
        Cursor rawQuery = readableDatabase.rawQuery(sb, new String[0]);
        try {
            rawQuery.moveToFirst();
            int count = rawQuery.getCount();
            String[] strArr = new String[count];
            for (int i3 = 0; i3 < count; i3++) {
                String string = rawQuery.getString(1);
                rawQuery.moveToNext();
                strArr[i3] = string;
            }
            ro.e(rawQuery, null);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < count; i4++) {
                ClipsDraft a = ludVar.a(strArr[i4]);
                otd D = a != null ? vua0.D(a) : null;
                if (D != null) {
                    arrayList.add(D);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                otd b2 = ludVar.b((otd) it.next());
                if (b2 != null) {
                    arrayList2.add(b2);
                }
            }
            return arrayList2;
        } finally {
        }
    }
}
