package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoUpload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: VideoUploadUtils.kt */
/* loaded from: classes.dex */
public final class wot0 {

    /* compiled from: _Sequences.kt */
    /* loaded from: classes16.dex */
    public static final class a implements izs<Object, Boolean> {
        public static final a b = new a();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof UIBlockVideo);
        }
    }

    public static boolean a(String str) {
        return str != null && new Regex(".+/(vk)?video.*/@.+/uploaded").f(str);
    }

    public static void b(UIBlockList uIBlockList, List list, boolean z) {
        Object obj;
        ArrayList<UIBlock> Sb = uIBlockList.Sb();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : Sb) {
            if (obj2 instanceof UIBlockVideoUpload) {
                arrayList.add(obj2);
            }
        }
        Set S0 = j5g.S0(arrayList);
        List list2 = list;
        Set C = rli0.C(new ulp0(rli0.j(new i5g(list2), new jvl0(10)), new d230(24)));
        ArrayList<UIBlock> Sb2 = uIBlockList.Sb();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : Sb2) {
            UIBlock uIBlock = (UIBlock) obj3;
            if ((uIBlock instanceof UIBlockVideo) && C.contains(((UIBlockVideo) uIBlock).A().r1())) {
                arrayList2.add(obj3);
            }
        }
        Set S02 = j5g.S0(arrayList2);
        uIBlockList.Sb().removeAll(S0);
        uIBlockList.Sb().removeAll(S02);
        List A = rli0.A(new ulp0(rli0.j(new i5g(list2), new il7(27, C, rli0.C(new ulp0(rli0.j(new i5g(uIBlockList.Sb()), a.b), new dl70(27))))), new tot0(0, uIBlockList, uIBlockList)));
        Iterator<T> it = uIBlockList.Sb().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((UIBlock) obj) instanceof UIBlockVideo) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        UIBlock uIBlock2 = (UIBlock) obj;
        ArrayList<UIBlock> Sb3 = uIBlockList.Sb();
        uIBlockList.Sb().addAll(uIBlock2 != null ? Sb3.indexOf(uIBlock2) : Sb3.size(), A);
        if (uIBlockList.Sb().size() <= 1 || !z) {
            return;
        }
        uIBlockList.Sb().removeIf(new ycg(new rgl0(14), 2));
    }
}
