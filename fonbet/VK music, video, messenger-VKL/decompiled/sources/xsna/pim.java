package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachPoll;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.models.messages.a;
import com.vkontakte.android.R;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b26;

/* compiled from: DialogPinnedMsgComponent.kt */
/* loaded from: classes2.dex */
public final class pim extends j8i {
    public static final f9w q = e9w.a(pim.class);
    public static final String r = pim.class.getSimpleName();
    public final a1w i;
    public final kkm j;
    public final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();
    public btk0 l = new btk0(new DialogExt(0, (ProfilesInfo) null, 2, (zcl) null));
    public tim m;
    public io.reactivex.rxjava3.disposables.c n;
    public b26.f o;
    public final v2n0 p;

    public pim(a1w a1wVar, pbw pbwVar, kkm kkmVar) {
        this.i = a1wVar;
        this.j = kkmVar;
        this.p = pbwVar.t().q();
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        tim timVar = new tim(layoutInflater, viewGroup, this.j);
        this.m = timVar;
        timVar.p = new hkp(this);
        d1();
        return this.m.b;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.l.b) {
            b1();
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        tim timVar = this.m;
        if (timVar != null) {
            timVar.p = null;
        }
        if (timVar != null) {
            timVar.o.dismiss();
        }
        this.m = null;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    public final void X0() {
        boolean d = this.l.a.d.d();
        boolean Gb = this.l.a.b.Gb();
        if (d || Gb) {
            c1();
        }
        Dialog Cb = this.l.a.Cb();
        if (Cb == null) {
            return;
        }
        PinnedMsg dc = Cb.dc();
        Peer peer = dc != null ? dc.d : null;
        if (peer != null) {
            wpp wppVar = (wpp) this.l.a.b.g.get(peer.c);
            Long valueOf = Long.valueOf(peer.d);
            if (wppVar.j(valueOf) || wppVar.b.contains(valueOf)) {
                c1();
            }
        }
        List singletonList = Collections.singletonList(Cb);
        t6g0 t6g0Var = t6g0.b;
        io.reactivex.rxjava3.internal.operators.completable.y q2 = new io.reactivex.rxjava3.internal.operators.completable.p(this.i.C(r, new wk70(singletonList, null, t6g0.d().k0().b(this.l.a.e), 2))).q(asu0.a.c());
        int i = kwg0.a;
        this.k.b(io.reactivex.rxjava3.kotlin.c.d(q2, new com.vk.movika.sdk.base.ui.g0(20), new nu2("DialogPinnedMsgComponent: checkConsistency failed", 2)));
    }

    public final void Y0(wpp<Long, Dialog> wppVar, boolean z) {
        b26.f fVar;
        btk0 btk0Var = this.l;
        long j = btk0Var.a.e;
        PinnedMsg a = btk0Var.a();
        boolean b = this.l.b();
        Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
        PinnedMsg dc = dialog != null ? dialog.dc() : null;
        Dialog dialog2 = (Dialog) wppVar.c.get(Long.valueOf(j));
        boolean ec = dialog2 != null ? dialog2.ec() : false;
        boolean f = epx.f(a != null ? Integer.valueOf(a.c) : null, dc != null ? Integer.valueOf(dc.c) : null);
        boolean z2 = b == ec;
        if ((f && z2) || (fVar = this.o) == null) {
            return;
        }
        b26 b26Var = b26.this;
        if (dc == null) {
            b26Var.g(b26.a.PINNED, true, 0L);
            return;
        }
        if (a == null && ec) {
            b26.n(b26Var, b26.a.PINNED, true);
            return;
        }
        if (!b || ec) {
            b26.n(b26Var, b26.a.PINNED, false);
        } else if (z) {
            b26Var.g(b26.a.PINNED, true, b26.p);
        } else {
            b26Var.g(b26.a.PINNED, false, 0L);
        }
    }

    public final boolean Z0() {
        btk0 btk0Var = this.l;
        return btk0Var.c && btk0Var.a.d.d();
    }

    public final void a1(DialogExt dialogExt) {
        btk0 btk0Var = new btk0(dialogExt);
        this.l = btk0Var;
        btk0Var.b = true;
        a1w a1wVar = this.i;
        io.reactivex.rxjava3.disposables.c subscribe = a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new myp(this));
        io.reactivex.rxjava3.disposables.b bVar = this.k;
        bVar.b(subscribe);
        d1();
        if (a1wVar.u()) {
            btk0 btk0Var2 = this.l;
            if (btk0Var2.c) {
                return;
            }
            btk0Var2.c = true;
            btk0Var2.e = null;
            d1();
            b26.f fVar = this.o;
            if (fVar != null) {
                b26.this.g(b26.a.PINNED, false, 0L);
            }
            int i = 0;
            bVar.b(a1wVar.F(this, new ppz(this.l.a.e, r)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lf1(new gl6(1, this, pim.class, "onLoadInitSuccess", "onLoadInitSuccess(Lcom/vk/im/engine/models/dialogs/DialogsExt;)V", i, 6), 21), new zl0(new wg1(1, this, pim.class, "onLoadInitError", "onLoadInitError(Ljava/lang/Throwable;)V", i, 9), 20)));
        }
    }

    public final void b1() {
        this.k.e();
        this.l = new btk0(new DialogExt(0L, (ProfilesInfo) null, 2, (zcl) null));
        d1();
    }

    public final void c1() {
        btk0 btk0Var = this.l;
        if (btk0Var.c || btk0Var.d) {
            return;
        }
        btk0Var.d = true;
        int i = 0;
        this.k.b(this.i.F(this, new moz(btk0Var.a.e, r)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new mf1(new r50(1, this, pim.class, "onUpdateAllByActualSuccess", "onUpdateAllByActualSuccess(Lcom/vk/im/engine/models/dialogs/DialogsExt;)V", i, 2), 20), new j50(new t50(1, this, pim.class, "onUpdateAllByActualError", "onUpdateAllByActualError(Ljava/lang/Throwable;)V", i, 7), 17)));
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d1() {
        CharSequence b;
        tim timVar;
        tim timVar2;
        btk0 btk0Var = this.l;
        if (btk0Var.c && btk0Var.a.d.d()) {
            tim timVar3 = this.m;
            if (timVar3 != null) {
                timVar3.c();
                timVar3.j.setVisibility(0);
            }
        } else {
            btk0 btk0Var2 = this.l;
            Throwable th = btk0Var2.e;
            if (th != null) {
                tim timVar4 = this.m;
                if (timVar4 != null) {
                    timVar4.c();
                    timVar4.k.setVisibility(0);
                    timVar4.l.setText(zk70.b(th));
                }
            } else {
                Dialog Cb = btk0Var2.a.Cb();
                PinnedMsg a = this.l.a();
                boolean b2 = this.l.b();
                if (Cb == null || a == null) {
                    tim timVar5 = this.m;
                    if (timVar5 != null) {
                        timVar5.c();
                    }
                } else {
                    ChatSettings Hb = Cb.Hb();
                    boolean z = Hb != null ? Hb.h : false;
                    ChatSettings Hb2 = Cb.Hb();
                    boolean z2 = !z && (Hb2 != null ? Hb2.q : false);
                    if (b2) {
                        tim timVar6 = this.m;
                        if (timVar6 != null) {
                            ProfilesSimpleInfo Ob = this.l.a.b.Ob();
                            timVar6.c();
                            timVar6.c.setVisibility(0);
                            timVar6.d.setText(timVar6.m.b(a.d, Ob));
                            TextView textView = timVar6.e;
                            roa0 roa0Var = timVar6.n;
                            long j = a.e;
                            StringBuffer stringBuffer = roa0Var.e;
                            stringBuffer.setLength(0);
                            FieldPosition fieldPosition = roa0Var.d;
                            ?? r9 = roa0Var.a;
                            Calendar calendar = (Calendar) r9.getValue();
                            xuo0.a.getClass();
                            calendar.setTimeInMillis(xuo0.a());
                            ?? r10 = roa0Var.b;
                            ((Calendar) r10.getValue()).setTimeInMillis(j);
                            Date date = roa0Var.c;
                            date.setTime(j);
                            if (c09.c((Calendar) r9.getValue(), (Calendar) r10.getValue())) {
                                ((SimpleDateFormat) roa0Var.g.getValue()).format(date, stringBuffer, fieldPosition);
                            } else if (c09.f((Calendar) r9.getValue(), (Calendar) r10.getValue())) {
                                ((SimpleDateFormat) roa0Var.h.getValue()).format(date, stringBuffer, fieldPosition);
                            } else if (c09.d((Calendar) r9.getValue(), (Calendar) r10.getValue())) {
                                ((SimpleDateFormat) roa0Var.i.getValue()).format(date, stringBuffer, fieldPosition);
                            } else {
                                ((SimpleDateFormat) roa0Var.j.getValue()).format(date, stringBuffer, fieldPosition);
                            }
                            textView.setText(stringBuffer.toString());
                            TextView textView2 = timVar6.f;
                            com.vk.im.ui.formatters.b bVar = new com.vk.im.ui.formatters.b(timVar6.a);
                            boolean P0 = a.P0();
                            gdp gdpVar = bVar.e;
                            Context context = bVar.a;
                            if (P0) {
                                String string = context.getString(R.string.vkim_msg_poll_single);
                                boolean P02 = a.P0();
                                if (!P02) {
                                    if (!P02) {
                                        throw new ImEngineException("Msg not contains Poll");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                String str = ((AttachPoll) a.C1125a.a(a, AttachPoll.class)).d.d;
                                if (!drm0.N(str)) {
                                    string = pzl.b(string, " · ", str);
                                }
                                cvk cvkVar = s420.a;
                                gdpVar.getClass();
                                b = s420.a(gdp.a(string));
                            } else if (!drm0.N(a.g)) {
                                String str2 = a.g;
                                cvk cvkVar2 = s420.a;
                                gdpVar.getClass();
                                b = s420.a(gdp.a(str2));
                            } else if (a.g8()) {
                                b = bVar.d.c(a.i);
                            } else {
                                boolean p3 = a.p3();
                                en30 en30Var = bVar.c;
                                b = p3 ? en30Var.b(a, NestedMsg.Type.REPLY) : a.db() ? en30Var.b(a, NestedMsg.Type.FWD) : context.getString(R.string.vkim_msg_empty);
                            }
                            textView2.setText(b);
                        }
                    } else {
                        tim timVar7 = this.m;
                        if (timVar7 != null) {
                            timVar7.c();
                            timVar7.h.setVisibility(0);
                            timVar7.i.setVisibility(z2 ? 0 : 8);
                        }
                    }
                }
            }
        }
        if (this.l.f && (timVar2 = this.m) != null) {
            timVar2.e();
        }
        if (!this.l.g || (timVar = this.m) == null) {
            return;
        }
        timVar.d();
    }
}
