package defpackage;

import androidx.media3.ui.PlayerControlView;
import java.util.List;

/* loaded from: classes10.dex */
public final class cyc0 extends lyc0 {
    public final /* synthetic */ PlayerControlView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyc0(PlayerControlView playerControlView) {
        super(playerControlView);
        this.c = playerControlView;
    }

    @Override // defpackage.lyc0
    public final void h(iyc0 iyc0Var) {
        iyc0Var.N.setText(i0i0.exo_track_selection_auto);
        zxc0 zxc0Var = this.c.player;
        zxc0Var.getClass();
        iyc0Var.O.setVisibility(j(zxc0Var.getTrackSelectionParameters()) ? 4 : 0);
        iyc0Var.a.setOnClickListener(new d5b0(4, this));
    }

    @Override // defpackage.lyc0
    public final void i(String str) {
        this.c.settingsAdapter.b[1] = str;
    }

    public final boolean j(r001 r001Var) {
        for (int i = 0; i < this.a.size(); i++) {
            if (r001Var.t.containsKey(((kyc0) this.a.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public final void k(List list) {
        this.a = list;
        PlayerControlView playerControlView = this.c;
        zxc0 zxc0Var = playerControlView.player;
        zxc0Var.getClass();
        r001 trackSelectionParameters = zxc0Var.getTrackSelectionParameters();
        if (list.isEmpty()) {
            hyc0 hyc0Var = playerControlView.settingsAdapter;
            hyc0Var.b[1] = playerControlView.getResources().getString(i0i0.exo_track_selection_none);
            return;
        }
        if (!j(trackSelectionParameters)) {
            hyc0 hyc0Var2 = playerControlView.settingsAdapter;
            hyc0Var2.b[1] = playerControlView.getResources().getString(i0i0.exo_track_selection_auto);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            kyc0 kyc0Var = (kyc0) list.get(i);
            q801 q801Var = kyc0Var.a;
            if (q801Var.e[kyc0Var.b]) {
                hyc0 hyc0Var3 = playerControlView.settingsAdapter;
                hyc0Var3.b[1] = kyc0Var.c;
                return;
            }
        }
    }
}
