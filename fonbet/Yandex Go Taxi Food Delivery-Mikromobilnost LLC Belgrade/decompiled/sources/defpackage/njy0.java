package defpackage;

import android.graphics.Matrix;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class njy0 {
    public final ArrayList a;

    public njy0(zzvf zzvfVar, Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        zzvfVar.zza();
        arrayList.addAll(l.a(zzvfVar.zzb(), new p391(matrix, 0)));
    }

    public njy0(List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }
}
