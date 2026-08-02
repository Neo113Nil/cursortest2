package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import xsna.b9a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hj7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hj7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                BoardTopicsFragment boardTopicsFragment = (BoardTopicsFragment) obj2;
                ii7 ii7Var = (ii7) obj;
                int i3 = BoardTopicsFragment.S0;
                jx2 jx2Var = new jx2(new zh7(boardTopicsFragment.No(), ii7Var.a), new kj7(boardTopicsFragment, ii7Var));
                jx2Var.g = boardTopicsFragment.getActivity();
                jx2Var.a();
                break;
            case 1:
                gzs gzsVar = (gzs) obj;
                ((Context) obj2).startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                ((com.vk.photos.root.photoflow.presentation.j) obj2).e.invoke(new a.s.b(((b9a0.c.a) obj).a));
                break;
            default:
                RadioStationCellVh radioStationCellVh = (RadioStationCellVh) obj2;
                radioStationCellVh.h.b(itg0.m(a630.h0(radioStationCellVh.c, ((UIBlockRadioStation) obj).y.b, null, 6)));
                break;
        }
    }
}
