package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vx90 implements izs {
    public final /* synthetic */ String[] b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ bwg d;
    public final /* synthetic */ vqb e;
    public final /* synthetic */ gzs f;
    public final /* synthetic */ String g;

    public /* synthetic */ vx90(String[] strArr, String[] strArr2, bwg bwgVar, vqb vqbVar, int i, gzs gzsVar, String str) {
        this.b = strArr;
        this.c = strArr2;
        this.d = bwgVar;
        this.e = vqbVar;
        this.f = gzsVar;
        this.g = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.permission.d dVar = (com.vk.permission.d) obj;
        String[] strArr = this.b;
        String[] strArr2 = this.c;
        bwg bwgVar = this.d;
        rx90 rx90Var = new rx90(strArr, strArr2, bwgVar, this.e, this.f);
        dVar.getClass();
        FragmentActivity activity = dVar.getActivity();
        if (activity != null) {
            PermissionHelper.a.getClass();
            if (tvo.a(activity, (String[]) Arrays.copyOf(strArr2, strArr2.length))) {
                bwgVar.invoke(rl3.u0(strArr2));
            } else {
                HashSet hashSet = new HashSet();
                g5g.A(hashSet, strArr2);
                int abs = (Math.abs(hashSet.hashCode()) % 255) / 100;
                dVar.h.put(Integer.valueOf(abs), rx90Var);
                PermissionHelper.s(dVar, Integer.parseInt(abs + "13"), strArr2, this.g, null);
            }
        }
        return s3q0.a;
    }
}
