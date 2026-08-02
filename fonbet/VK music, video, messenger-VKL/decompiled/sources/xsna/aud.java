package xsna;

import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsDraftUtility.kt */
/* loaded from: classes17.dex */
public final class aud {
    public final Object a;
    public Object b;

    public /* synthetic */ aud(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public UiBlockInteractiveVkMix a() {
        Object obj;
        r80 a;
        if (b()) {
            return (UiBlockInteractiveVkMix) j5g.Y((List) this.b);
        }
        Iterator it = ((List) this.b).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((UiBlockInteractiveVkMix) next).y;
            l4v0 l4v0Var = (l4v0) this.a;
            if (l4v0Var != null && (a = l4v0Var.a()) != null) {
                obj = (String) a.a;
            }
            if (epx.f(str, obj)) {
                obj = next;
                break;
            }
        }
        return (UiBlockInteractiveVkMix) obj;
    }

    public boolean b() {
        return ((List) this.b).size() == 1 && ((UiBlockInteractiveVkMix) j5g.Y((List) this.b)).D != null;
    }

    public List c() {
        ArrayList arrayList;
        UIBlockPlaceholder uIBlockPlaceholder;
        ArrayList<UIBlockAction> arrayList2;
        UiBlockInteractiveVkMix a = a();
        if (a == null || (uIBlockPlaceholder = a.D) == null || (arrayList2 = uIBlockPlaceholder.G) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof UIBlockActionOpenUrl) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    public boolean d() {
        UIBlockPlaceholder uIBlockPlaceholder;
        r80 a;
        l4v0 l4v0Var = (l4v0) this.a;
        String str = null;
        String str2 = (l4v0Var == null || (a = l4v0Var.a()) == null) ? null : (String) a.a;
        UiBlockInteractiveVkMix a2 = a();
        if (a2 != null && (uIBlockPlaceholder = a2.D) != null) {
            str = uIBlockPlaceholder.z;
        }
        return epx.f(str2, str);
    }

    public aud(l4v0 l4v0Var) {
        this.a = l4v0Var;
        this.b = EmptyList.b;
    }
}
