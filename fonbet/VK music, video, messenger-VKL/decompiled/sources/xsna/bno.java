package xsna;

import android.content.Context;
import android.view.View;
import com.vk.design.inspector.dsl.LegoStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b5x;

/* compiled from: isDsComponent.kt */
/* loaded from: classes18.dex */
public final class bno extends fl10 {
    public final LegoStatus b;

    /* compiled from: isDsComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegoStatus.values().length];
            try {
                iArr[LegoStatus.Any.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegoStatus.Adopted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegoStatus.NotAdopted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bno(gl10 gl10Var, LegoStatus legoStatus) {
        this.b = legoStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.fl10, xsna.el10
    public final boolean d(b5x b5xVar) {
        return b(b5xVar.getDesignInspectorParams(), ((View) b5xVar).getContext());
    }

    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        String str;
        List<String> list;
        List<String> list2;
        List<String> list3;
        Object obj;
        if (cVar == null || (list3 = cVar.g) == null) {
            str = null;
        } else {
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str2 = (String) obj;
                if (epx.f(str2, "DesignUiComponent") || epx.f(str2, "ProductDesignUiComponent")) {
                    break;
                }
            }
            str = (String) obj;
        }
        ano anoVar = str != null ? new ano(str) : null;
        if (anoVar != null) {
            int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (cVar == null || (list2 = cVar.g) == null || !list2.contains("LegoThemeAdopted")) {
                    }
                } else if (cVar == null || (list = cVar.g) == null || !list.contains("LegoThemeAdopted")) {
                }
            }
            return anoVar;
        }
        return null;
    }
}
