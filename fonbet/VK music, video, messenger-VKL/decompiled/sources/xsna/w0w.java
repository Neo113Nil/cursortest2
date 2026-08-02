package xsna;

import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.conversations.PushSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: ImDialogsUtils.kt */
/* loaded from: classes2.dex */
public final class w0w {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0225, code lost:
    
        r6.hd(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
    
        if (com.vk.dto.common.b.d(r18) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022e, code lost:
    
        if (r10 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0230, code lost:
    
        r2 = r10.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0232, code lost:
    
        if (r2 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0234, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023e, code lost:
    
        if (r2.hasNext() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0240, code lost:
    
        r3 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024b, code lost:
    
        if (((com.vk.im.engine.models.InfoBar.Button) r3).d != com.vk.im.engine.models.InfoBar.ButtonType.SPAM) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0250, code lost:
    
        r3 = (com.vk.im.engine.models.InfoBar.Button) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0255, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0257, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0267, code lost:
    
        r6.Pc(r10);
        r6.md(r21.Q);
        r6.Lc(r21.R);
        r6.qd(r21.S);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0279, code lost:
    
        if (r1 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027b, code lost:
    
        r2 = new org.json.JSONObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0283, code lost:
    
        r6.nd(r2);
        r1 = r21.U;
        r2 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0297, code lost:
    
        if (r1.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0299, code lost:
    
        r3 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ae, code lost:
    
        if (r21.V.contains(java.lang.Integer.valueOf(((java.lang.Number) r3).intValue())) != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b0, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b4, code lost:
    
        r6.Ad(r2);
        r6.Zc(r21.W);
        r6.Wc(r21.Y);
        r6.Qc(r21.Z);
        r6.xd(r21.a0);
        r6.wd(r21.b0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d1, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0281, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0259, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0253, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025b, code lost:
    
        if (r2 <= 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0264, code lost:
    
        if (r20.f1() < r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0224, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0204, code lost:
    
        if (r6.Xb().k() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0206, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01bd, code lost:
    
        if (r14 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01bf, code lost:
    
        r4 = new java.util.ArrayList();
        r3 = r17.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d0, code lost:
    
        if (r3.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01d2, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01dd, code lost:
    
        if (((java.lang.Number) r5).intValue() <= r9) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01df, code lost:
    
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02d7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x018c, code lost:
    
        if (r13 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02dd, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0140, code lost:
    
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x010d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00e3, code lost:
    
        r3 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00d8, code lost:
    
        r18 = r4;
        r4 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00ca, code lost:
    
        r11 = r21.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x00c0, code lost:
    
        r11 = r21.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00a9, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0094, code lost:
    
        if (r21.y != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        if (r15 == com.vk.im.engine.models.MsgRequestStatus.REJECTED) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r6 = new com.vk.im.engine.models.dialogs.Dialog();
        r6.setId(r4);
        r6.yd(r21.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r12 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r6.rd(r11);
        r6.sd(r21.h);
        r6.fd(r21.i);
        r11 = r21.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        if (r11 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        r11 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
    
        r6.id(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r12 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
    
        r11 = r21.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cc, code lost:
    
        r6.Vc(r11);
        r11 = r21.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (r11 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r18 = r4;
        r4 = r11.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        r6.notificationsDisabledUntil = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r11 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        r3 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        r6.notificationsIsUseSound = r3;
        r6.Bd(r21.f);
        r6.Dd(r21.q);
        r6.Sc(r21.r);
        r6.Rc(r21.s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (xsna.k9q0.p(r20) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        if (r20.H0().b != r18) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
    
        r6.Cd(r3);
        r6.od(r21.t);
        r6.pd(r21.u);
        r6.Xc(r21.v);
        r6.Mc(r10);
        r6.Uc(r21.x);
        r6.Tc(r21.z);
        r6.bd(r21.A);
        r6.ad(r21.B);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        if (r22 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        r3 = com.vk.im.engine.models.dialogs.DialogTheme.f;
        r3 = com.vk.im.engine.models.dialogs.DialogTheme.a.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        r6.ud(r3);
        r6.vd(r6.hc().b);
        r6.dd(r21.D);
        r6.ed(r21.E);
        r6.ld(r15);
        r6.kd(r21.G);
        r6.jd(r21.H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        if (r13 != true) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0168, code lost:
    
        r3 = new java.util.ArrayList();
        r4 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        if (r4.hasNext() == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0184, code lost:
    
        if (((java.lang.Number) r5).intValue() <= r8) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0186, code lost:
    
        r3.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018a, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018e, code lost:
    
        r6.zd(r7);
        r6.td(r21.K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0197, code lost:
    
        if (r14 != true) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0199, code lost:
    
        r4 = new java.util.ArrayList();
        r3 = r17.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01aa, code lost:
    
        if (r3.hasNext() == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ac, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b7, code lost:
    
        if (((java.lang.Number) r5).intValue() <= r8) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e3, code lost:
    
        r6.Yc(r4);
        r6.Nc(r21.M);
        r6.Oc(r21.N);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f4, code lost:
    
        if (r6.Vb() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fa, code lost:
    
        if (r6.Jb() <= 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0208, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0209, code lost:
    
        r6.gd(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        if (r6.Vb() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0216, code lost:
    
        if (r6.Jb() != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        if (r6.Xb().k() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0222, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Dialog a(w2w w2wVar, com.vk.im.engine.models.dialogs.b bVar, DialogTheme dialogTheme) {
        boolean z;
        boolean z2;
        List<Integer> list;
        String str = bVar.T;
        int i = bVar.P;
        PushSettings pushSettings = bVar.o;
        long j = bVar.b;
        List<Integer> list2 = bVar.L;
        List<Integer> list3 = bVar.J;
        int i2 = bVar.k;
        int i3 = bVar.g;
        boolean z3 = i2 > i3;
        if (z3) {
            List<Integer> list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<T> it = list4.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() <= i2) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (z3) {
            List<Integer> list5 = list2;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator<T> it2 = list5.iterator();
                while (it2.hasNext()) {
                    if (((Number) it2.next()).intValue() <= i2) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        MsgRequestStatus msgRequestStatus = bVar.I;
        if (msgRequestStatus == null) {
            msgRequestStatus = bVar.F;
        }
        InfoBar infoBar = bVar.w;
        if (infoBar != null) {
            list = list2;
            if (epx.f(infoBar.b, "message_request_banner")) {
                msgRequestStatus.getClass();
            }
        } else {
            list = list2;
        }
    }
}
