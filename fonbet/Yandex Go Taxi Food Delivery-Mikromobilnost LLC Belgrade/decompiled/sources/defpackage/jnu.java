package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class jnu extends j8q0 {
    public jnu(fe10 fe10Var, db7 db7Var, Executor executor) {
        super(fe10Var, new HlsPlaylistParser(), db7Var, executor);
    }

    public static void i(unu unuVar, rnu rnuVar, HashSet hashSet, ArrayList arrayList) {
        String str = unuVar.a;
        long j = unuVar.h + rnuVar.x;
        String str2 = rnuVar.z;
        if (str2 != null) {
            Uri j2 = m4m0.j(str, str2);
            if (hashSet.add(j2)) {
                arrayList.add(new h8q0(j, j8q0.d(j2)));
            }
        }
        arrayList.add(new h8q0(j, new npg(m4m0.j(str, rnuVar.a), rnuVar.B, rnuVar.C)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j8q0
    public final ArrayList e(eb7 eb7Var, o5r o5rVar, boolean z) {
        znu znuVar = (znu) o5rVar;
        ArrayList arrayList = new ArrayList();
        if (znuVar instanceof ynu) {
            List list = ((ynu) znuVar).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(j8q0.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(j8q0.d(Uri.parse(znuVar.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            npg npgVar = (npg) it.next();
            arrayList2.add(new h8q0(0L, npgVar));
            try {
                unu unuVar = (unu) ((o5r) c(new f8q0(this, eb7Var, npgVar), z));
                ImmutableList immutableList = unuVar.r;
                rnu rnuVar = null;
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    rnu rnuVar2 = (rnu) immutableList.get(i2);
                    rnu rnuVar3 = rnuVar2.b;
                    if (rnuVar3 != null && rnuVar3 != rnuVar) {
                        i(unuVar, rnuVar3, hashSet, arrayList2);
                        rnuVar = rnuVar3;
                    }
                    i(unuVar, rnuVar2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
