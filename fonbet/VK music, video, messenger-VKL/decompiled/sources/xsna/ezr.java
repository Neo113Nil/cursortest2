package xsna;

import com.vk.im.engine.models.dialogs.DialogsHistory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ezr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ezr(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                wpp wppVar = (wpp) obj;
                boolean z = wppVar.a.size() + wppVar.c.values().size() == this.c;
                DialogsHistory dialogsHistory = new DialogsHistory(wppVar.c.values().size(), 30);
                dialogsHistory.k().addAll(j5g.D0(new fzr(0), wppVar.c.values()));
                dialogsHistory.d().addAll(wppVar.b);
                dialogsHistory.y(z);
                dialogsHistory.z(z);
                dialogsHistory.w(true);
                dialogsHistory.x(true);
                return new utk(new xrm(dialogsHistory, null, null, null, 14), z);
            default:
                tgi0 tgi0Var = (tgi0) obj;
                int i = this.c;
                lt40.i(tgi0Var, i);
                qgi0.r(tgi0Var, "MusicSnippetEditorBottomSheetTracksListItem" + i);
                return s3q0.a;
        }
    }
}
