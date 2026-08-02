package xsna;

import com.vk.voip.api.dto.VoipChatInfo;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import xsna.nv3;
import xsna.pv3;
import xsna.xv3;
import xsna.yv3;

/* compiled from: AsrRecordFeature.kt */
/* loaded from: classes7.dex */
public final class ov3 {
    public final o4x0 a;
    public final io.reactivex.rxjava3.subjects.f<xv3> b = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.subjects.d<yv3> c = io.reactivex.rxjava3.subjects.d.O0(yv3.a.a);
    public final boolean d;

    public ov3(o4x0 o4x0Var) {
        this.a = o4x0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = true;
        io.reactivex.rxjava3.subjects.f<nv3> fVar = o4x0Var.i;
        bVar.b(fVar.b0(nv3.c.class).subscribe(new m20(new com.vk.im.engine.internal.api_commands.messages.a(this, 5), 4)));
        int i = 3;
        bVar.b(fVar.b0(nv3.a.class).subscribe(new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(this, 6), i)));
        bVar.b(fVar.b0(nv3.d.class).subscribe(new f60(new za(this, 5), i)));
        bVar.b(fVar.b0(nv3.b.class).subscribe(new com.vk.im.ui.components.dialogs_list.b(new g60(this, 6), 4)));
    }

    public final void a(pv3 pv3Var) {
        VoipChatInfo voipChatInfo;
        b();
        o4x0 o4x0Var = this.a;
        com.vk.voip.b bVar = o4x0Var.b;
        if (pv3Var instanceof pv3.b) {
            dhw0 L = o4x0Var.a.L();
            String str = (L == null || (voipChatInfo = L.B) == null) ? null : voipChatInfo.c;
            if (str == null) {
                str = o4x0Var.d.invoke().getString(R.string.voip_asr_file_name, new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
            }
            c(new yv3.c.C4139c(new hw3(str, str)));
            return;
        }
        boolean z = pv3Var instanceof tv3;
        io.reactivex.rxjava3.subjects.d<yv3> dVar = this.c;
        if (z) {
            tv3 tv3Var = (tv3) pv3Var;
            b();
            yv3 P0 = dVar.P0();
            if (P0 instanceof yv3.c) {
                c(new yv3.c.C4139c(new hw3((String) ((yv3.c) P0).a().a, tv3Var.a)));
                return;
            }
            return;
        }
        if (pv3Var instanceof rv3) {
            b();
            yv3 P02 = dVar.P0();
            if (P02 instanceof yv3.c) {
                yv3.c cVar = (yv3.c) P02;
                String str2 = (String) cVar.a().b;
                if (str2.length() == 0) {
                    str2 = (String) cVar.a().a;
                }
                String str3 = str2;
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.a aVar = new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 5);
                AsrManager asrManager = bVar.getAsrManager();
                if (asrManager == null) {
                    aVar.invoke(new RuntimeException("AsrManager doesn't exist"));
                } else {
                    AsrManager.startRecord$default(asrManager, str3, null, new x2j0(o4x0Var, 25), aVar, 2, null);
                }
                c(new yv3.c.b(cVar.a()));
                return;
            }
            return;
        }
        if (pv3Var instanceof sv3) {
            sv3 sv3Var = (sv3) pv3Var;
            c(new yv3.b.a(sv3Var.a, sv3Var.b));
            return;
        }
        boolean z2 = pv3Var instanceof qv3;
        yv3 yv3Var = yv3.a.a;
        if (z2) {
            qv3 qv3Var = (qv3) pv3Var;
            b();
            yv3 P03 = dVar.P0();
            if (P03 instanceof yv3.c) {
                c(new yv3.c.a(((yv3.c) P03).a(), qv3Var.a));
                c(yv3Var);
                return;
            }
            return;
        }
        if (pv3Var instanceof pv3.c) {
            mew0 mew0Var = ((pv3.c) pv3Var).a;
            whr0 whr0Var = mew0Var.c;
            String str4 = whr0Var.q;
            if (str4 == null) {
                str4 = whr0Var.h;
            }
            c(new yv3.b.C4138b(whr0Var.b, str4, mew0Var.a, mew0Var.b));
            return;
        }
        if (pv3Var instanceof vv3) {
            c(yv3.b.c.a);
            x7 x7Var = new x7(this, 4);
            AsrManager asrManager2 = bVar.getAsrManager();
            if (asrManager2 == null) {
                x7Var.invoke(new RuntimeException("AsrManager doesn't exist"));
                return;
            } else {
                o4x0Var.h = true;
                AsrManager.stopRecord$default(asrManager2, null, new m5o0(o4x0Var, 17), new dnh0(19, o4x0Var, x7Var), 1, null);
                return;
            }
        }
        if (pv3Var instanceof wv3) {
            mew0 mew0Var2 = ((wv3) pv3Var).a;
            boolean z3 = mew0Var2.a;
            Boolean bool = mew0Var2.d;
            if (bool == null) {
                c(yv3Var);
                return;
            } else {
                c(new yv3.d(z3, bool.booleanValue()));
                return;
            }
        }
        if (!(pv3Var instanceof uv3)) {
            if (!(pv3Var instanceof pv3.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c(yv3Var);
            return;
        }
        mew0 mew0Var3 = o4x0Var.f;
        this.b.onNext(new xv3.a(((uv3) pv3Var).a));
        if (mew0Var3 != null) {
            whr0 whr0Var2 = mew0Var3.c;
            String str5 = whr0Var2.q;
            if (str5 == null) {
                str5 = whr0Var2.h;
            }
            yv3Var = new yv3.b.C4138b(whr0Var2.b, str5, mew0Var3.a, mew0Var3.b);
        }
        c(yv3Var);
    }

    public final void b() {
        if (this.d) {
            return;
        }
        tv4.b("AsrRecordFeature Feature is destroyed", com.vk.metrics.eventtracking.b.a);
    }

    public final void c(yv3 yv3Var) {
        if (this.d) {
            this.c.onNext(yv3Var);
        }
    }
}
