package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.internal.view.timeline.c0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class dcv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c0 b;

    public /* synthetic */ dcv0(tse tseVar, c0 c0Var, int i) {
        this.a = i;
        this.b = c0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        int i2 = 0;
        c0 c0Var = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (list == null) {
                    Iterator it = c0Var.i.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((List) it.next()).iterator();
                        while (it2.hasNext()) {
                            oib1.d((AppCompatTextView) it2.next());
                        }
                    }
                } else {
                    Iterator it3 = c0Var.i.iterator();
                    int i3 = 0;
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        int i5 = 0;
                        for (Object obj2 : (List) next) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                scc.m();
                                throw null;
                            }
                            AppCompatTextView appCompatTextView = (AppCompatTextView) obj2;
                            String str = (String) ((List) list.get(i3)).get(i5);
                            if (str != null) {
                                appCompatTextView.setText(str);
                                appCompatTextView.setContentDescription(str);
                            } else {
                                oib1.d(appCompatTextView);
                            }
                            i5 = i6;
                        }
                        i3 = i4;
                    }
                }
                return zy11Var;
            default:
                List list2 = (List) obj;
                if (list2 == null) {
                    Iterator it4 = c0Var.g.iterator();
                    while (it4.hasNext()) {
                        oib1.d((AppCompatTextView) it4.next());
                    }
                } else {
                    Iterator it5 = c0Var.g.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) next2;
                        String str2 = (String) list2.get(i2);
                        if (str2 != null) {
                            appCompatTextView2.setText(str2);
                            appCompatTextView2.setContentDescription(str2);
                        } else {
                            oib1.d(appCompatTextView2);
                        }
                        i2 = i7;
                    }
                }
                return zy11Var;
        }
    }
}
