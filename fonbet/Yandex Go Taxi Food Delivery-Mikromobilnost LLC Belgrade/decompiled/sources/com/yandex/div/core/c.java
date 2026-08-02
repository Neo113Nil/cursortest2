package com.yandex.div.core;

import android.net.Uri;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import defpackage.aw5;
import defpackage.ny61;
import defpackage.rvo;
import defpackage.sls;
import defpackage.v3k;
import defpackage.wfx;
import defpackage.y4k;
import defpackage.y6k;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c {
    public final y6k a;
    public final y4k b;

    public c(y6k y6kVar, y4k y4kVar) {
        this.a = y6kVar;
        this.b = y4kVar;
    }

    public static /* synthetic */ void b(c cVar, Div2View div2View, rvo rvoVar, v3k v3kVar, String str, String str2, int i) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        cVar.a(div2View, rvoVar, v3kVar, str, str2, div2View.getActionHandler());
    }

    public static void c(c cVar, Div2View div2View, rvo rvoVar, List list, String str) {
        c cVar2;
        Div2View div2View2;
        rvo rvoVar2;
        String str2;
        cVar.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v3k v3kVar = (v3k) it.next();
                y6k actionHandler = div2View.getActionHandler();
                if (((Boolean) v3kVar.b.a(rvoVar)).booleanValue()) {
                    cVar2 = cVar;
                    div2View2 = div2View;
                    rvoVar2 = rvoVar;
                    str2 = str;
                    cVar2.a(div2View2, rvoVar2, v3kVar, str2, null, actionHandler);
                } else {
                    cVar2 = cVar;
                    div2View2 = div2View;
                    rvoVar2 = rvoVar;
                    str2 = str;
                }
                cVar = cVar2;
                div2View = div2View2;
                rvoVar = rvoVar2;
                str = str2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r5 == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Div2View div2View, rvo rvoVar, v3k v3kVar, String str, String str2, y6k y6kVar) {
        Div2View div2View2;
        v3k v3kVar2;
        rvo rvoVar2;
        String str3;
        String str4;
        y6k y6kVar2 = this.a;
        if (!y6kVar2.getUseActionUid() || str2 == null) {
            if (y6kVar == null || !y6kVar.handleActionWithReason(v3kVar, div2View, rvoVar, str)) {
                return y6kVar2.handleActionWithReason(v3kVar, div2View, rvoVar, str);
            }
            return true;
        }
        if (y6kVar != null) {
            boolean handleActionWithReason = y6kVar.handleActionWithReason(v3kVar, div2View, rvoVar, str2, str);
            v3kVar2 = v3kVar;
            div2View2 = div2View;
            rvoVar2 = rvoVar;
            str4 = str2;
            str3 = str;
        } else {
            div2View2 = div2View;
            v3kVar2 = v3kVar;
            rvoVar2 = rvoVar;
            str3 = str;
            str4 = str2;
        }
        return this.a.handleActionWithReason(v3kVar2, div2View2, rvoVar2, str4, str3);
    }

    public final void d(final aw5 aw5Var, final View view, final List list, final String str) {
        aw5Var.a.bulkActions$div_release(new sls() { // from class: com.yandex.div.core.DivActionPerformer$performBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str2;
                String uuid = UUID.randomUUID().toString();
                List<v3k> list2 = list;
                c cVar = this;
                aw5 aw5Var2 = aw5Var;
                String str3 = str;
                for (v3k v3kVar : list2) {
                    cVar.getClass();
                    Div2View div2View = aw5Var2.a;
                    rvo rvoVar = aw5Var2.b;
                    if (((Boolean) v3kVar.b.a(rvoVar)).booleanValue()) {
                        switch (str3.hashCode()) {
                            case -338877947:
                                str2 = "long_click";
                                break;
                            case -287575485:
                                str2 = "unhover";
                                break;
                            case 3027047:
                                str2 = "blur";
                                break;
                            case 94750088:
                                str2 = "click";
                                break;
                            case 96667352:
                                str2 = "enter";
                                break;
                            case 97604824:
                                str2 = "focus";
                                break;
                            case 99469628:
                                str2 = "hover";
                                break;
                            case 106931267:
                                str2 = "press";
                                break;
                            case 1090594823:
                                str2 = "release";
                                break;
                            case 1374143386:
                                str2 = "double_click";
                                break;
                        }
                        str3.equals(str2);
                        cVar.b.b(v3kVar, rvoVar);
                        c.b(cVar, div2View, rvoVar, v3kVar, str3, uuid, 32);
                        continue;
                    }
                }
                return zy11.a;
            }
        });
    }

    public final void e(final Div2View div2View, final rvo rvoVar, final View view, final List list) {
        div2View.bulkActions$div_release(new sls() { // from class: com.yandex.div.core.DivActionPerformer$performSwipeOutActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Uri uri;
                List<v3k> list2 = list;
                if (list2 != null) {
                    rvo rvoVar2 = rvoVar;
                    c cVar = this;
                    Div2View div2View2 = div2View;
                    for (v3k v3kVar : list2) {
                        if (((Boolean) v3kVar.b.a(rvoVar2)).booleanValue()) {
                            c.b(cVar, div2View2, rvoVar2, v3kVar, "state_swipe_out", null, 48);
                            y4k y4kVar = cVar.b;
                            y4kVar.getClass();
                            Expression expression = v3kVar.d;
                            if (expression != null && (uri = (Uri) expression.a(rvoVar2)) != null) {
                                if (!y4k.a(uri.getScheme())) {
                                    int i = wfx.a;
                                } else if (y4kVar.d && y4kVar.a.get() != null) {
                                    ny61.u();
                                    return null;
                                }
                            }
                        }
                    }
                }
                return zy11.a;
            }
        });
    }
}
