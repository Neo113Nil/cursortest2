package xsna;

import android.graphics.Bitmap;
import java.util.HashMap;
import xsna.bfs;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gom(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hpm hpmVar = (hpm) this.d;
                gkx0 gkx0Var = (gkx0) this.e;
                tgl0 tgl0Var = hpmVar.b;
                tgl0Var.b().execSQL("UPDATE dialogs SET weight = ? WHERE id = ?", new Long[]{Long.valueOf(gkx0Var.b), Long.valueOf(this.c)});
                Long valueOf = Long.valueOf(gkx0Var.b);
                long j = ((com.vk.im.engine.models.dialogs.b) obj).b;
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_weight = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{valueOf, Long.valueOf(j), -1});
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_weight = ? WHERE x_dialog_id = ? AND x_folder_id != ?", new Object[]{Long.valueOf(lmm.a(gkx0Var).b), Long.valueOf(j), -1});
                return s3q0.a;
            case 1:
                bfs.a aVar = (bfs.a) this.d;
                HashMap<Long, bfs.b> hashMap = aVar.c;
                bfs bfsVar = (bfs) this.e;
                Bitmap bitmap = (Bitmap) ((it80) obj).a;
                long j2 = this.c;
                if (bitmap != null) {
                    hashMap.put(Long.valueOf(j2), new bfs.c(bitmap));
                    aVar.b.put(Long.valueOf(j2), bitmap);
                    bfsVar.a.a();
                } else {
                    hashMap.put(Long.valueOf(j2), new bfs.d(new Exception("Error loading frame")));
                }
                return s3q0.a;
            default:
                mkx mkxVar = (mkx) this.d;
                return (vx70.a) vhk0.h(mkxVar.j, "OkHttpExecutor Http Json", new fkx(this.c, mkxVar, (qob) this.e, 0), 6);
        }
    }

    public /* synthetic */ gom(bfs.a aVar, long j, bfs bfsVar) {
        this.b = 1;
        this.d = aVar;
        this.c = j;
        this.e = bfsVar;
    }
}
