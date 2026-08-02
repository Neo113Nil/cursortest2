package xsna;

import android.view.View;
import com.vk.dto.common.Attachment;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import java.util.Calendar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m1l implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis;
        long currentTimeMillis2;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n1l n1lVar = (n1l) obj2;
                com.google.android.material.timepicker.b bVar = (com.google.android.material.timepicker.b) obj;
                int Dn = bVar.Dn();
                int En = bVar.En();
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = n1lVar.d;
                calendar.setTime(calendar2.getTime());
                calendar.set(11, Dn);
                calendar.set(12, En);
                long timeInMillis = calendar.getTimeInMillis();
                boolean z = n1lVar.e;
                if (z) {
                    xuo0.a.getClass();
                    currentTimeMillis = xuo0.a();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                boolean z2 = timeInMillis < currentTimeMillis + n1lVar.f;
                long timeInMillis2 = calendar.getTimeInMillis();
                if (z) {
                    xuo0.a.getClass();
                    currentTimeMillis2 = xuo0.a();
                } else {
                    currentTimeMillis2 = System.currentTimeMillis();
                }
                boolean z3 = timeInMillis2 > currentTimeMillis2 + n1lVar.g;
                if (!z2 && !z3) {
                    calendar2.set(11, Dn);
                    calendar2.set(12, En);
                    n1lVar.a();
                    break;
                } else {
                    cvk.w(z2 ? n1lVar.h : n1lVar.i, false);
                    break;
                }
            case 1:
                ListGroupCallView listGroupCallView = (ListGroupCallView) obj;
                kiu viewModel = ((ListGroupCallView.b.a) obj2).l.getViewModel();
                if (viewModel != null) {
                    GroupCallViewModel.b.getClass();
                    liu liuVar = GroupCallViewModel.r;
                    CallMemberId callMemberId = viewModel.a.a;
                    com.vk.voip.ui.c cVar = liuVar.a;
                    if (liuVar.e == null) {
                        liuVar.d = null;
                        if (callMemberId.equals(liuVar.c)) {
                            liuVar.c = null;
                            liuVar.f = null;
                            cVar.o1();
                        } else {
                            liuVar.c = callMemberId;
                            liuVar.f = callMemberId;
                            cVar.R0(callMemberId);
                        }
                        liuVar.a();
                        float f = ListGroupCallView.o0;
                        listGroupCallView.U4();
                        break;
                    } else {
                        izs<CallMemberId, s3q0> pinNotAllowedListener = listGroupCallView.getPinNotAllowedListener();
                        if (pinNotAllowedListener != null) {
                            pinNotAllowedListener.invoke(viewModel.a.a);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((qcc0) obj2).r.c((Attachment) obj);
                break;
            default:
                qot0 qot0Var = (qot0) obj2;
                xdd xddVar = (xdd) obj;
                qot0Var.s = null;
                utj utjVar = qot0Var.q;
                if (utjVar != null) {
                    utjVar.b();
                }
                if (xddVar != null) {
                    ((ylf) qot0Var.g.getValue()).f(xddVar, "clips_canceled_by_user_from_snackbar");
                    break;
                }
                break;
        }
    }
}
