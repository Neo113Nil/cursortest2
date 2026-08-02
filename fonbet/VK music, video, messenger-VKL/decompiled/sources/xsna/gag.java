package xsna;

import android.content.DialogInterface;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.libvideo.live.impl.views.chat.elements.Comment;
import java.util.ArrayList;

/* compiled from: Comment.java */
/* loaded from: classes3.dex */
public final class gag implements DialogInterface.OnClickListener {
    public final /* synthetic */ qpb b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Comment d;

    public gag(Comment comment, qpb qpbVar, ArrayList arrayList) {
        this.d = comment;
        this.b = qpbVar;
        this.c = arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qpb qpbVar = this.b;
        if (qpbVar != null) {
            String str = (String) this.c.get(i);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1335458389:
                    if (str.equals("delete")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1266283874:
                    if (str.equals("friend")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934521548:
                    if (str.equals("report")) {
                        c = 2;
                        break;
                    }
                    break;
                case -840447568:
                    if (str.equals("unlike")) {
                        c = 3;
                        break;
                    }
                    break;
                case -379780489:
                    if (str.equals("unfriend")) {
                        c = 4;
                        break;
                    }
                    break;
                case -309425751:
                    if (str.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                        c = 5;
                        break;
                    }
                    break;
                case -293212780:
                    if (str.equals("unblock")) {
                        c = 6;
                        break;
                    }
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3059573:
                    if (str.equals("copy")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3321751:
                    if (str.equals("like")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 93832333:
                    if (str.equals("block")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 108401386:
                    if (str.equals("reply")) {
                        c = 11;
                        break;
                    }
                    break;
                case 111439964:
                    if (str.equals("unpin")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            Comment comment = this.d;
            switch (c) {
                case 0:
                    b25 a = o25.a();
                    comment.getContext();
                    a.getClass();
                    LiveEventModel liveEventModel = comment.h;
                    int i2 = liveEventModel.e;
                    qpbVar.c2(liveEventModel.m, liveEventModel.d);
                    break;
                case 1:
                    b25 a2 = o25.a();
                    comment.getContext();
                    a2.getClass();
                    qpbVar.H1(comment.h.j);
                    break;
                case 2:
                    LiveEventModel liveEventModel2 = comment.h;
                    UserId userId = liveEventModel2.d;
                    qpbVar.s0(liveEventModel2.m, liveEventModel2.j);
                    break;
                case 3:
                    b25 a3 = o25.a();
                    comment.getContext();
                    a3.getClass();
                    LiveEventModel liveEventModel3 = comment.h;
                    qpbVar.d1(liveEventModel3.m, liveEventModel3.d);
                    break;
                case 4:
                    b25 a4 = o25.a();
                    comment.getContext();
                    a4.getClass();
                    qpbVar.H0(comment.h.j);
                    break;
                case 5:
                    qpbVar.S0(comment.h.j);
                    break;
                case 6:
                    qpbVar.M1(comment.h.j);
                    break;
                case 7:
                    LiveEventModel liveEventModel4 = comment.h;
                    qpbVar.t0(liveEventModel4.m, liveEventModel4.d);
                    break;
                case '\b':
                    LiveEventModel liveEventModel5 = comment.h;
                    qpbVar.W0(liveEventModel5.m, liveEventModel5.j, liveEventModel5.n, liveEventModel5.c == 17);
                    break;
                case '\t':
                    b25 a5 = o25.a();
                    comment.getContext();
                    a5.getClass();
                    LiveEventModel liveEventModel6 = comment.h;
                    qpbVar.z0(liveEventModel6.m, liveEventModel6.d, liveEventModel6.j);
                    break;
                case '\n':
                    qpbVar.m2(comment.h.j);
                    break;
                case 11:
                    b25 a6 = o25.a();
                    comment.getContext();
                    a6.getClass();
                    LiveEventModel liveEventModel7 = comment.h;
                    qpbVar.q0(liveEventModel7.j, liveEventModel7.r);
                    break;
                case '\f':
                    LiveEventModel liveEventModel8 = comment.h;
                    qpbVar.U1(liveEventModel8.m, liveEventModel8.d);
                    break;
            }
        }
    }
}
