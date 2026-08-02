package com.ybsdk.feature.savings.internal.screens.goal;

import com.ybsdk.core.utils.date.YbDateFormat;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.i6m0;
import defpackage.p6m0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zdk0;
import defpackage.zy11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SavingsAccountGoalFragment$getViewBinding$1$3 extends FunctionReferenceImpl implements tls {
    public SavingsAccountGoalFragment$getViewBinding$1$3(uc5 uc5Var) {
        super(1, uc5Var, p6m0.class, "onInputChangeDate", "onInputChangeDate(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        p6m0 p6m0Var = (p6m0) this.receiver;
        if (!str.equals(((i6m0) p6m0Var.X()).d)) {
            Locale locale = Locale.getDefault();
            List Y = evu0.Y(str, new char[]{'.'}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = Y.iterator();
            while (it.hasNext()) {
                Integer l = bvu0.l(10, (String) it.next());
                if (l != null) {
                    arrayList.add(l);
                }
            }
            Date date = null;
            if (arrayList.size() != 3) {
                arrayList = null;
            }
            if (arrayList != null) {
                try {
                    date = new SimpleDateFormat(YbDateFormat.SHORT_SERVER_DATE_ONLY.getPattern(), locale).parse(arrayList.get(2) + "-" + arrayList.get(1) + "-" + arrayList.get(0));
                } catch (ParseException unused) {
                }
            }
            p6m0Var.a0(new zdk0(15, p6m0Var, date, str));
        }
        return zy11.a;
    }
}
