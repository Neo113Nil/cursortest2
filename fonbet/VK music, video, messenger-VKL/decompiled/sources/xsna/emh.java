package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.h7u0;
import xsna.hmh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class emh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ emh(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hmh hmhVar = (hmh) this.d;
                o8 o8Var = hmhVar.b;
                int i = hmh.b.$EnumSwitchMapping$0[((hmh.a) hmh.a.h().get(((ModalActionSheetListItem) obj).a)).ordinal()];
                if (i == 1) {
                    o8Var.invoke(CommunityProfileAction.g.a.b);
                } else if (i == 2) {
                    final fmh fmhVar = new fmh(hmhVar, this.c);
                    Context context = hmhVar.a;
                    h7u0.a aVar = new h7u0.a(context);
                    aVar.h0(context.getString(R.string.community_cover_dialog_title_delete));
                    aVar.d0(context.getString(R.string.delete), new DialogInterface.OnClickListener() { // from class: xsna.gmh
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            fmh.this.invoke();
                        }
                    });
                    aVar.X(context.getString(R.string.cancel), null);
                    aVar.m();
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o8Var.invoke(new CommunityProfileAction.g.d.C1588g(true));
                }
                return s3q0.a;
            default:
                ggj ggjVar = (ggj) obj;
                ljo0 ljo0Var = (ljo0) ((mtk0) this.d).getValue();
                if ((ljo0Var != null && ljo0Var.e()) || this.c) {
                    ggjVar.s1();
                }
                return s3q0.a;
        }
    }
}
