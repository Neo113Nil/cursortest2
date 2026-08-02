package xsna;

import android.media.AudioManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lc50;

/* compiled from: MusicTrackMenuItemAdapter.kt */
/* loaded from: classes3.dex */
public final class vc50 extends zoj0<tc50, n840> {
    public final AudioManager e;
    public final FunctionReferenceImpl f;

    /* JADX WARN: Multi-variable type inference failed */
    public vc50(AudioManager audioManager, izs<? super lc50, s3q0> izsVar) {
        this.e = audioManager;
        this.f = (FunctionReferenceImpl) izsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        lc50.c cVar = ((tc50) this.c.c(i)).b;
        if (cVar instanceof lc50.c.r) {
            return 1;
        }
        if (cVar instanceof lc50.c.e) {
            return 2;
        }
        return cVar instanceof lc50.c.u ? 3 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((n840) e0Var).V5((tc50) this.c.c(i));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i != 1 ? i != 2 ? i != 3 ? R.layout.music_action_item : R.layout.music_action_item_with_subtitle : R.layout.music_action_seekbar_item : R.layout.music_separator_item, viewGroup, false);
        ?? r3 = this.f;
        return i != 1 ? i != 2 ? i != 3 ? new q840(b, r3) : new t840(b, r3) : new o840(b, this.e, r3) : new o550(b, r3);
    }
}
