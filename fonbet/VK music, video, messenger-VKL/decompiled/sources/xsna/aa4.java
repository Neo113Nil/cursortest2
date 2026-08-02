package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import com.vk.dto.common.id.UserId;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class aa4 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aa4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ha4 ha4Var = (ha4) this.c;
                String str = (String) this.d;
                long andIncrement = ha4Var.a.getAndIncrement();
                x94 x94Var = new x94(andIncrement, SystemClock.elapsedRealtime(), 0, str);
                ha4Var.b.put(Long.valueOf(andIncrement), x94Var);
                ha4Var.c.put(str, x94Var);
                ha4Var.d.onNext(x94Var);
                return Long.valueOf(andIncrement);
            case 1:
                return lzd.d((lzd) this.c, (com.vk.clips.editor.state.model.a) this.d, true, null, 12);
            default:
                Context context = (Context) this.c;
                UserId userId = (UserId) this.d;
                e2r0 e2r0Var = e2r0.b;
                String packageName = context.getPackageName();
                e2r0Var.getClass();
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("logged_in", (Integer) 0);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                return Boolean.valueOf(e2r0.d(context, packageName, userId, contentValues));
        }
    }
}
