package xsna;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class q301 implements DialogInterface.OnClickListener {
    public final /* synthetic */ w301 b;
    public final /* synthetic */ w301 c;
    public final /* synthetic */ fip0 d;

    public q301(fip0 fip0Var, w301 w301Var, w301 w301Var2) {
        this.b = w301Var;
        this.c = w301Var2;
        this.d = fip0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fip0 fip0Var = this.d;
        if (!fip0Var.x) {
            AlertDialog alertDialog = fip0Var.B;
            if (alertDialog != null) {
                alertDialog.cancel();
                fip0Var.B = null;
                return;
            }
            return;
        }
        lvf0 lvf0Var = fip0Var.C;
        exc0.i(lvf0Var);
        if (!lvf0Var.k()) {
            AlertDialog alertDialog2 = fip0Var.B;
            if (alertDialog2 != null) {
                alertDialog2.cancel();
                fip0Var.B = null;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        w301 w301Var = this.b;
        int i2 = w301Var.c;
        MediaTrack mediaTrack = (i2 < 0 || i2 >= w301Var.getCount()) ? null : (MediaTrack) w301Var.getItem(w301Var.c);
        if (mediaTrack != null) {
            long j = mediaTrack.b;
            if (j != -1) {
                arrayList.add(Long.valueOf(j));
            }
        }
        w301 w301Var2 = this.c;
        int i3 = w301Var2.c;
        MediaTrack mediaTrack2 = (i3 < 0 || i3 >= w301Var2.getCount()) ? null : (MediaTrack) w301Var2.getItem(w301Var2.c);
        if (mediaTrack2 != null) {
            arrayList.add(Long.valueOf(mediaTrack2.b));
        }
        long[] jArr = fip0Var.A;
        if (jArr != null && jArr.length > 0) {
            HashSet hashSet = new HashSet();
            Iterator it = fip0Var.z.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it.next()).b));
            }
            Iterator it2 = fip0Var.y.iterator();
            while (it2.hasNext()) {
                hashSet.add(Long.valueOf(((MediaTrack) it2.next()).b));
            }
            for (long j2 : jArr) {
                Long valueOf = Long.valueOf(j2);
                if (!hashSet.contains(valueOf)) {
                    arrayList.add(valueOf);
                }
            }
        }
        long[] jArr2 = new long[arrayList.size()];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jArr2[i4] = ((Long) arrayList.get(i4)).longValue();
        }
        Arrays.sort(jArr2);
        exc0.e("Must be called from the main thread.");
        if (lvf0Var.H()) {
            lvf0.J(new br01(lvf0Var, jArr2));
        } else {
            lvf0.G();
        }
        AlertDialog alertDialog3 = fip0Var.B;
        if (alertDialog3 != null) {
            alertDialog3.cancel();
            fip0Var.B = null;
        }
    }
}
