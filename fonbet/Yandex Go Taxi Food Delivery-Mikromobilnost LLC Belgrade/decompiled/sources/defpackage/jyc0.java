package defpackage;

import androidx.media3.ui.PlayerControlView;
import java.util.List;

/* loaded from: classes10.dex */
public final class jyc0 extends lyc0 {
    public final /* synthetic */ PlayerControlView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyc0(PlayerControlView playerControlView) {
        super(playerControlView);
        this.c = playerControlView;
    }

    @Override // defpackage.lyc0, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g */
    public final void onBindViewHolder(iyc0 iyc0Var, int i) {
        super.onBindViewHolder(iyc0Var, i);
        if (i > 0) {
            kyc0 kyc0Var = (kyc0) this.a.get(i - 1);
            iyc0Var.O.setVisibility(kyc0Var.a.e[kyc0Var.b] ? 0 : 4);
        }
    }

    @Override // defpackage.lyc0
    public final void h(iyc0 iyc0Var) {
        boolean z;
        iyc0Var.N.setText(i0i0.exo_track_selection_none);
        int i = 0;
        while (true) {
            if (i >= this.a.size()) {
                z = true;
                break;
            }
            kyc0 kyc0Var = (kyc0) this.a.get(i);
            if (kyc0Var.a.e[kyc0Var.b]) {
                z = false;
                break;
            }
            i++;
        }
        iyc0Var.O.setVisibility(z ? 0 : 4);
        iyc0Var.a.setOnClickListener(new d5b0(6, this));
    }

    @Override // defpackage.lyc0
    public final void i(String str) {
    }

    public final void j(List list) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            kyc0 kyc0Var = (kyc0) list.get(i);
            if (kyc0Var.a.e[kyc0Var.b]) {
                z = true;
                break;
            }
            i++;
        }
        PlayerControlView playerControlView = this.c;
        if (playerControlView.subtitleButton != null) {
            playerControlView.subtitleButton.setImageDrawable(z ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
            playerControlView.subtitleButton.setContentDescription(z ? playerControlView.subtitleOnContentDescription : playerControlView.subtitleOffContentDescription);
        }
        this.a = list;
    }
}
