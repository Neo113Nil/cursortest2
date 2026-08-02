package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.plz;

/* compiled from: LiveSpectatorsView.kt */
/* loaded from: classes3.dex */
public final class cmz implements gm50 {
    public final plz.b b;
    public final View c;
    public final View d;
    public final RecyclerView e;
    public final View f;
    public final View g;
    public final View h;
    public final olz i;
    public final plz j;

    public cmz(plz plzVar, Context context, plz.b bVar) {
        this.b = bVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_spectators_view, (ViewGroup) null);
        this.c = inflate;
        this.d = inflate.findViewById(R.id.live_spectators_progress_bar);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.live_spectators_recycler);
        this.e = recyclerView;
        this.f = inflate.findViewById(R.id.live_spectators_empty_container);
        this.g = inflate.findViewById(R.id.live_spectators_error_container);
        View findViewById = inflate.findViewById(R.id.live_spectators_retry_text);
        this.h = findViewById;
        olz olzVar = new olz(new rop(this, 11));
        this.i = olzVar;
        this.j = plzVar;
        findViewById.setOnClickListener(new vr6(this, 4));
        recyclerView.setAdapter(olzVar);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.j;
    }
}
