package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes11.dex */
public final class kjy0 extends n15 {
    public final AbstractList x;

    public kjy0(zzuz zzuzVar, Matrix matrix) {
        super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
        this.x = l.a(zzuzVar.zze(), new lm71(22, matrix));
    }

    public kjy0(String str, Rect rect, List list, String str2, Matrix matrix, AbstractList abstractList) {
        super(str, rect, list, str2, matrix);
        this.x = abstractList;
    }
}
