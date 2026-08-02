package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class arc0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View.OnClickListener c;
    public final /* synthetic */ Serializer.StreamParcelableAdapter d;

    public /* synthetic */ arc0(View.OnClickListener onClickListener, Serializer.StreamParcelableAdapter streamParcelableAdapter, int i) {
        this.b = i;
        this.c = onClickListener;
        this.d = streamParcelableAdapter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                brc0 brc0Var = (brc0) this.c;
                ((c1c0) brc0Var.F.getValue()).v(brc0Var.itemView.getContext(), (Post) this.d);
                break;
            default:
                RadioStationVh radioStationVh = (RadioStationVh) this.c;
                radioStationVh.l.b(itg0.m(a630.h0(radioStationVh.c, ((UIBlockRadioStation) this.d).y.b, null, 6)));
                break;
        }
    }
}
