package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: FontFamilies.kt */
/* loaded from: classes17.dex */
public final class u4s {
    public static final b5s a;
    public static final b5s b;
    public static final b5s c;
    public static final HashMap<String, v4s> d;

    static {
        b6s b6sVar = b6s.k;
        uag0 b2 = a5s.b(R.font.vk_roboto_bold, b6sVar);
        b6s b6sVar2 = b6s.j;
        uag0 b3 = a5s.b(R.font.vk_roboto_semibold, b6sVar2);
        b6s b6sVar3 = b6s.i;
        uag0 b4 = a5s.b(R.font.vk_roboto_medium, b6sVar3);
        b6s b6sVar4 = b6s.h;
        uag0 b5 = a5s.b(R.font.vk_roboto_regular, b6sVar4);
        b6s b6sVar5 = b6s.g;
        a = new b5s(e43.l(b2, b3, b4, b5, a5s.b(R.font.vk_roboto_light, b6sVar5), a5s.b(R.font.vk_roboto_black, b6s.l)));
        b = new b5s(e43.l(a5s.b(R.font.vk_sans_display_bold, b6sVar), a5s.b(R.font.vk_sans_display_demibold, b6sVar2), a5s.b(R.font.vk_sans_display_medium, b6sVar3), a5s.b(R.font.vk_sans_display_regular, b6sVar4)));
        c = new b5s(e43.l(a5s.b(R.font.vk_sans_text_bold, b6sVar), a5s.b(R.font.vk_sans_text_demibold, b6sVar2), a5s.b(R.font.vk_sans_text_medium, b6sVar3), a5s.b(R.font.vk_sans_text_regular, b6sVar4), a5s.b(R.font.vk_sans_text_light, b6sVar5)));
        new b5s(e43.l(a5s.b(R.font.vk_sans_text_15pt_bold, b6sVar), a5s.b(R.font.vk_sans_text_15pt_demibold, b6sVar2), a5s.b(R.font.vk_sans_text_15pt_medium, b6sVar3), a5s.b(R.font.vk_sans_text_15pt_regular, b6sVar4), a5s.b(R.font.vk_sans_text_15pt_light, b6sVar5)));
        new b5s(e43.l(a5s.b(R.font.vk_sans_text_16pt_bold, b6sVar), a5s.b(R.font.vk_sans_text_16pt_demibold, b6sVar2), a5s.b(R.font.vk_sans_text_16pt_medium, b6sVar3), a5s.b(R.font.vk_sans_text_16pt_regular, b6sVar4), a5s.b(R.font.vk_sans_text_16pt_light, b6sVar5)));
        d = new HashMap<>();
    }

    public static final v4s a(fno0 fno0Var, b6s b6sVar) {
        String str;
        int i = b6sVar.b;
        if (fno0Var != null) {
            str = "opsz=" + fno0.d(fno0Var.a);
        } else {
            str = "";
        }
        String a2 = na8.a(i, str, "wght=");
        HashMap<String, v4s> hashMap = d;
        v4s v4sVar = hashMap.get(a2);
        if (v4sVar != null) {
            return v4sVar;
        }
        ArrayList arrayList = new ArrayList();
        if (fno0Var != null) {
            long j = fno0Var.a;
            if (!fno0.e(j)) {
                vzw.a("'opsz' must be provided in sp units");
            }
            arrayList.add(new z5s(j));
        }
        if (1 > i || i >= 1001) {
            vzw.a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        arrayList.add(new y5s(i));
        x5s[] x5sVarArr = (x5s[]) arrayList.toArray(new x5s[0]);
        b5s b5sVar = new b5s(Collections.singletonList(a5s.a(new a6s((x5s[]) Arrays.copyOf(x5sVarArr, x5sVarArr.length)))));
        hashMap.put(a2, b5sVar);
        return b5sVar;
    }

    public static final b5s b() {
        return a;
    }

    public static final b5s c() {
        return b;
    }
}
