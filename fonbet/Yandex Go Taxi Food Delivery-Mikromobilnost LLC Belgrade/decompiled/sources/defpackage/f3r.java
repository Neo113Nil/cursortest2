package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class f3r {
    public static final int a(String str) {
        int G;
        char c = File.separatorChar;
        int G2 = evu0.G(str, c, 0, 4);
        if (G2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (G = evu0.G(str, c, 2, 4)) < 0) {
                return 1;
            }
            int G3 = evu0.G(str, c, G + 1, 4);
            return G3 >= 0 ? G3 + 1 : str.length();
        }
        if (G2 > 0 && str.charAt(G2 - 1) == ':') {
            return G2 + 1;
        }
        if (G2 == -1 && evu0.B(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final s0r b(File file) {
        List list;
        String path = file.getPath();
        int a = a(path);
        String substring = path.substring(0, a);
        String substring2 = path.substring(a);
        if (substring2.length() == 0) {
            list = EmptyList.a;
        } else {
            List Y = evu0.Y(substring2, new char[]{File.separatorChar}, 0, 6);
            ArrayList arrayList = new ArrayList(tcc.n(Y, 10));
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new s0r(new File(substring), list);
    }
}
