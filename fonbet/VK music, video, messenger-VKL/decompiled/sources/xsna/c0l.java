package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import org.webrtc.PeerConnectionFactory;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: DatePickerScreenContent.kt */
/* loaded from: classes18.dex */
public final class c0l implements yah0 {
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50<InputSelect$State> h;
    public final wh50 i;
    public final DateTimePickerState j;
    public final DateTimePickerState k;

    public c0l() {
        zrp<EditingMode> h = EditingMode.h();
        int e = on00.e(c5g.u(h, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : h) {
            linkedHashMap.put(obj, ((EditingMode) obj).name());
        }
        this.b = linkedHashMap;
        zrp<DateTimePickerState.UpdateValueFromDialogsStrategy> h2 = DateTimePickerState.UpdateValueFromDialogsStrategy.h();
        int e2 = on00.e(c5g.u(h2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (Object obj2 : h2) {
            linkedHashMap2.put(obj2, ((DateTimePickerState.UpdateValueFromDialogsStrategy) obj2).name());
        }
        this.c = linkedHashMap2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        wh50 b = androidx.compose.runtime.k.b(calendar.getTime());
        this.d = b;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(((Date) ((zak0) b).getValue()).getTime());
        calendar2.set(1, 2101);
        calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 1);
        wh50 b2 = androidx.compose.runtime.k.b(calendar2.getTime());
        this.e = b2;
        this.f = androidx.compose.runtime.k.b(EditingMode.Keyboard);
        this.g = androidx.compose.runtime.k.b(Boolean.TRUE);
        this.h = androidx.compose.runtime.k.b(InputSelect$State.Default);
        this.i = androidx.compose.runtime.k.b(DateTimePickerState.UpdateValueFromDialogsStrategy.Instant);
        this.j = new DateTimePickerState((Date) ((zak0) b).getValue());
        this.k = new DateTimePickerState((Date) ((zak0) b2).getValue());
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        c0l c0lVar;
        androidx.compose.runtime.a M = aVar.M(-911877303);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73731 & i2) != 73730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-911877303, i2, -1, "com.vk.design.demo.presentation.screens.DatePickerScreenContent.Content (DatePickerScreenContent.kt:77)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = i2;
            muv0.e("Date Picker", null, null, b, null, gzsVar, false, null, false, null, M, 4102 | ((i2 << 15) & 458752), 0, 2006);
            djn0.a(true, true, M, 438, 0);
            float f2 = 8;
            q630 D2 = p490.D(s200.D(aVar2, f2), p490.x(M), 14);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.o, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            c0lVar = this;
            Date date = (Date) c0lVar.j.j.getValue();
            if (date == null) {
                date = (Date) ((zak0) c0lVar.d).getValue();
            }
            Date date2 = (Date) c0lVar.k.j.getValue();
            if (date2 == null) {
                date2 = (Date) ((zak0) c0lVar.e).getValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            k9x k9xVar = new k9x(calendar.get(1), calendar2.get(1), 1);
            com.vk.core.compose.component.datetime.l.a.getClass();
            fai0 fai0Var = new fai0(date, date2);
            wh50<InputSelect$State> wh50Var = c0lVar.h;
            zak0 zak0Var = (zak0) wh50Var;
            com.vk.core.compose.component.datetime.d a3 = com.vk.core.compose.component.datetime.e.a(null, (InputSelect$State) zak0Var.getValue(), k9xVar, fai0Var, M, 1);
            wh50 wh50Var2 = c0lVar.g;
            boolean booleanValue = ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue();
            wh50 wh50Var3 = c0lVar.f;
            apu0.a(a3, txj0.f(aVar2, 1.0f), null, null, null, booleanValue, (EditingMode) ((zak0) wh50Var3).getValue(), M, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            com.vk.core.compose.component.datetime.p.b(com.vk.core.compose.component.datetime.i.a(null, (InputSelect$State) zak0Var.getValue(), k9xVar, fai0Var, (DateTimePickerState.UpdateValueFromDialogsStrategy) ((zak0) c0lVar.i).getValue(), M, 0, 1), txj0.f(aVar2, 1.0f), null, null, null, null, ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue(), (EditingMode) ((zak0) wh50Var3).getValue(), M, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            M = M;
            InputSelect$State inputSelect$State = (InputSelect$State) zak0Var.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-749268661, 0, -1, "com.vk.core.compose.component.datetime.rememberDateRangePickerState (DateRangePickerState.kt:25)");
            }
            M.K(1507332266);
            Object[] objArr = new Object[0];
            fh9 C = q6x.C(new by5(9, k9xVar, fai0Var), new t8c(4));
            boolean y = M.y(null) | M.y(null) | M.y(k9xVar) | M.y(fai0Var);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new com.vk.movika.tools.controls.seekbar.g(4, k9xVar, fai0Var);
                M.R(x);
            }
            com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) crx0.D(objArr, C, (gzs) x, M, 0);
            ((zak0) gVar.c).setValue(k9xVar);
            ((zak0) gVar.d).setValue(fai0Var);
            ((zak0) gVar.b).setValue(inputSelect$State);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cpu0.a(gVar, txj0.f(aVar2, 1.0f), null, null, null, ((Boolean) ((zak0) wh50Var2).getValue()).booleanValue(), (EditingMode) ((zak0) wh50Var3).getValue(), M, 48);
            int i5 = (i4 >> 15) & 14;
            c0lVar.d(i5, M);
            g3x.g(wh50Var, null, M, 0);
            c0lVar.e(i5, M);
            c0lVar.b(i5, M);
            c0lVar.c(i5, M);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            c0lVar = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bdh(c0lVar, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1147416959);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1147416959, i2, -1, "com.vk.design.demo.presentation.screens.DatePickerScreenContent.ChangeEditingMode (DatePickerScreenContent.kt:155)");
            }
            EditingMode editingMode = (EditingMode) ((zak0) this.f).getValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new g1j(this, 3);
                M.R(x);
            }
            y9i0.a("Editing mode", this.b, editingMode, (izs) x, txj0.f(q630.a.a, 1.0f), M, 24582, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ds7(this, i, 1);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-431988889);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-431988889, i2, -1, "com.vk.design.demo.presentation.screens.DatePickerScreenContent.ChangeEnabled (DatePickerScreenContent.kt:166)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.g).getValue()).booleanValue();
            q630 f = txj0.f(q630.a.a, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z8f(this, 9);
                M.R(x);
            }
            zov0.b(booleanValue, PeerConnectionFactory.TRIAL_ENABLED, (izs) x, f, null, false, false, M, 3120, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a0l(this, i);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(209071897);
        if ((i & 6) == 0) {
            i2 = i | (M.J(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(209071897, i2, -1, "com.vk.design.demo.presentation.screens.DatePickerScreenContent.ChangeMinMaxDates (DatePickerScreenContent.kt:137)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            yqv0.c("Min datetime", txj0.f(aVar3, 1.0f), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, M, 54, 0, 16380);
            com.vk.core.compose.component.datetime.p.b(this.j, txj0.f(aVar3, 1.0f), null, null, null, null, false, null, M, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            M.G();
            q630 f2 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            aVar2 = M;
            yqv0.c("Max datetime", txj0.f(aVar3, 1.0f), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 54, 0, 16380);
            com.vk.core.compose.component.datetime.p.b(this.k, txj0.f(aVar3, 1.0f), null, null, null, null, false, null, aVar2, 48, IronSourceError.ERROR_CODE_INIT_FAILED);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b0l(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-116859954);
        if ((i & 6) == 0) {
            i2 = (M.J(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-116859954, i2, -1, "com.vk.design.demo.presentation.screens.DatePickerScreenContent.ChangeUpdateValueFromDialogsStrategy (DatePickerScreenContent.kt:176)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            DateTimePickerState.UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy = (DateTimePickerState.UpdateValueFromDialogsStrategy) ((zak0) this.i).getValue();
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new lrk(this, 1);
                M.R(x);
            }
            y9i0.a("Обновление поля DateTimePicker по диалогам", this.c, updateValueFromDialogsStrategy, (izs) x, f, M, 24582, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qma(this, i, 2);
        }
    }
}
