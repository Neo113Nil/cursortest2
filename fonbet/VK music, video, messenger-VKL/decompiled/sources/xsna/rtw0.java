package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.duw0;

/* compiled from: VoipParticipantSettingsBottomSheet.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class rtw0 extends FunctionReferenceImpl implements izs<duw0.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(duw0.a aVar) {
        duw0.a aVar2 = aVar;
        cuw0 cuw0Var = (cuw0) this.receiver;
        View view = cuw0Var.x;
        View view2 = cuw0Var.m;
        View view3 = cuw0Var.j;
        View view4 = cuw0Var.l;
        View view5 = cuw0Var.k;
        View view6 = cuw0Var.i;
        View view7 = cuw0Var.w;
        View view8 = cuw0Var.v;
        if (aVar2 instanceof duw0.a.c) {
            bwt0.p0(view8, true);
            bwt0.p0(view7, true);
            bwt0.p0(view, false);
        } else if (aVar2 instanceof duw0.a.C2755a) {
            bwt0.p0(view8, true);
            bwt0.p0(view7, false);
            bwt0.p0(view, true);
            cuw0Var.y.setText(zk70.b(((duw0.a.C2755a) aVar2).a));
            bwt0.i0(cuw0Var.z, new wgm0(cuw0Var, 21));
        } else {
            if (!(aVar2 instanceof duw0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            duw0.a.b bVar = (duw0.a.b) aVar2;
            bwt0.p0(view8, false);
            bwt0.p0(view7, false);
            bwt0.p0(view, false);
            duw0.a.b.c cVar = bVar.a;
            View view9 = cuw0Var.d;
            View view10 = cuw0Var.h;
            bwt0.p0(view8, false);
            sew0 sew0Var = cVar.a;
            if (sew0Var != null) {
                cuw0Var.e.O(sew0Var);
            }
            cuw0Var.f.setText(cVar.b);
            bwt0.p0(cuw0Var.g, cVar.c);
            if (cVar.d) {
                bwt0.p0(view10, true);
                bwt0.i0(view9, new e0w0(cuw0Var, 5));
            } else {
                bwt0.p0(view10, false);
                view9.setOnClickListener(null);
            }
            duw0.a.b.d dVar = bVar.b;
            bwt0.p0(view8, false);
            if (dVar instanceof duw0.a.b.d.C2762b) {
                bwt0.p0(view6, true);
                bwt0.p0(view3, true);
                bwt0.p0(view5, true);
                bwt0.p0(view4, true);
                bwt0.p0(view2, true);
                duw0.a.b.d.C2762b c2762b = (duw0.a.b.d.C2762b) dVar;
                view6.setActivated(c2762b.a);
                view5.setActivated(c2762b.b);
                view4.setActivated(c2762b.c);
            } else {
                if (!(dVar instanceof duw0.a.b.d.C2761a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(view6, false);
                bwt0.p0(view3, false);
                bwt0.p0(view5, false);
                bwt0.p0(view4, false);
                bwt0.p0(view2, false);
            }
            duw0.a.b.C2756a c2756a = bVar.c;
            bwt0.p0(view8, false);
            bwt0.p0(cuw0Var.o, c2756a.a);
            bwt0.p0(cuw0Var.r, c2756a.b);
            bwt0.p0(cuw0Var.s, c2756a.c);
            bwt0.p0(cuw0Var.u, c2756a.d);
            cuw0Var.a();
            duw0.a.b.C2757b c2757b = bVar.d;
            bwt0.p0(view8, false);
            TextView textView = cuw0Var.n;
            duw0.a.b.C2757b.InterfaceC2758a interfaceC2758a = c2757b.a;
            if (interfaceC2758a instanceof duw0.a.b.C2757b.InterfaceC2758a.C2760b) {
                bwt0.p0(textView, true);
                if (((duw0.a.b.C2757b.InterfaceC2758a.C2760b) interfaceC2758a).a) {
                    his0.v(textView, R.drawable.vk_icon_pin_dot_slash_outline_28, 0);
                    textView.setText(R.string.voip_participant_settings_unpin);
                } else {
                    his0.v(textView, R.drawable.vk_icon_pin_dot_outline_28, 0);
                    textView.setText(R.string.voip_participant_settings_pin);
                }
            } else {
                if (!(interfaceC2758a instanceof duw0.a.b.C2757b.InterfaceC2758a.C2759a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(textView, false);
            }
            TextView textView2 = cuw0Var.q;
            duw0.a.b.C2757b.InterfaceC2758a interfaceC2758a2 = c2757b.b;
            if (interfaceC2758a2 instanceof duw0.a.b.C2757b.InterfaceC2758a.C2760b) {
                bwt0.p0(textView2, true);
                if (((duw0.a.b.C2757b.InterfaceC2758a.C2760b) interfaceC2758a2).a) {
                    his0.v(textView2, R.drawable.vk_icon_user_star_slash_outline_28, 0);
                    textView2.setText(R.string.voip_participant_settings_revoke_admin);
                } else {
                    his0.v(textView2, R.drawable.vk_icon_user_star_outline_28, 0);
                    textView2.setText(R.string.voip_participant_settings_grant_admin);
                }
            } else {
                if (!(interfaceC2758a2 instanceof duw0.a.b.C2757b.InterfaceC2758a.C2759a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(textView2, false);
            }
            cuw0Var.a();
        }
        return s3q0.a;
    }
}
