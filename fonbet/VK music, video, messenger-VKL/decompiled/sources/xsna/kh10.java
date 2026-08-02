package xsna;

import com.vk.dto.masks.Mask;
import java.util.ArrayList;
import java.util.List;
import xsna.bi10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kh10 implements io.reactivex.rxjava3.functions.l {
    public static StringBuilder a(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(bi10.f.a);
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new bi10.d((Mask) list.get(i), null, false));
        }
        return arrayList;
    }
}
