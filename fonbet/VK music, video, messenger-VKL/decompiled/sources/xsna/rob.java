package xsna;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.views.RichEditText;
import com.vk.push.common.Logger;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.List;
import xsna.oob;

/* compiled from: ChatClipsMsgSendVc.kt */
/* loaded from: classes2.dex */
public final class rob implements e1y0, e4q, btk, rk01 {
    public final Object b;

    public /* synthetic */ rob(Object obj) {
        this.b = obj;
    }

    @Override // xsna.btk
    public long b(long j, long j2) {
        return C.TIME_UNSET;
    }

    @Override // xsna.rk01
    public void c(Bundle bundle, String str) {
        qj01 qj01Var = (qj01) this.b;
        if (!TextUtils.isEmpty(str)) {
            qj01Var.d().s(new v301(this, str, bundle));
            return;
        }
        mb01 mb01Var = qj01Var.m;
        if (mb01Var != null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.b("_err", "AppId not known when logging event");
        }
    }

    @Override // xsna.btk
    public boolean d() {
        return true;
    }

    @Override // xsna.e1y0
    public void e(Editable editable) {
        oob oobVar = (oob) this.b;
        if (editable.length() > 0 && oobVar.n == oob.b.NORMAL) {
            tob tobVar = oobVar.z;
            if (tobVar == null) {
                tobVar = null;
            }
            tobVar.getClass();
        }
        tob tobVar2 = oobVar.z;
        (tobVar2 != null ? tobVar2 : null).getClass();
    }

    @Override // xsna.btk
    public long f(long j, long j2) {
        return 0L;
    }

    @Override // xsna.e4q
    public k6o g() {
        return new u7v((List) this.b);
    }

    @Override // xsna.btk
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // xsna.btk
    public long h(long j, long j2) {
        return 0L;
    }

    @Override // xsna.btk
    public long i(long j) {
        return 1L;
    }

    @Override // xsna.e1y0
    public void j() {
        oob oobVar = (oob) this.b;
        int i = ify.a;
        if (ify.e(ify.c)) {
            oobVar.h(MsgSendHidePopupsReason.OTHER);
            return;
        }
        xgy xgyVar = oobVar.A;
        if (xgyVar == null || !xgyVar.e()) {
            return;
        }
        RichEditText richEditText = oobVar.v;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        StickersView stickersView = oobVar.w;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(4);
        tob tobVar = oobVar.z;
        (tobVar != null ? tobVar : null).getClass();
    }

    @Override // xsna.btk
    public long k() {
        return 0L;
    }

    @Override // xsna.btk
    public rwe0 l(long j) {
        return (rwe0) this.b;
    }

    @Override // xsna.e4q
    public h300 m() {
        return new u7v((List) this.b);
    }

    @Override // xsna.btk
    public long n(long j, long j2) {
        return 1L;
    }

    public rob(Logger logger) {
        this.b = logger.createLogger(this);
    }

    public rob() {
        this.b = new ArrayList();
    }

    @Override // xsna.btk
    public long a(long j, long j2) {
        return j2;
    }
}
