package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.photo.PhotoAlbum;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.List;
import xsna.kn1;

/* compiled from: SystemAlbumsAdapter.kt */
/* loaded from: classes4.dex */
public final class opn0 extends androidx.recyclerview.widget.x<PhotoAlbum, lpn0> implements vic {
    public final ze1 c;
    public final kdg0 d;
    public final el1 e;

    public opn0(ze1 ze1Var, kdg0 kdg0Var, el1 el1Var) {
        super(new ci1());
        this.c = ze1Var;
        this.d = kdg0Var;
        this.e = el1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((lpn0) e0Var).V5(new kn1.a(getItem(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, R.layout.album_page_system_album_item, viewGroup, false);
        Context context = viewGroup.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            bwt0.m0(cn70.b(Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE), cn70.b(159), b);
        }
        return new lpn0(b, this.c, this.d, this.e, cn70.a() * 8.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((lpn0) e0Var).W5(new kn1.a(getItem(i)), list);
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
