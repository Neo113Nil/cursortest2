package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.music.attach.AttachMusicActivity;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;

/* compiled from: AttachMusicActivity.java */
/* loaded from: classes3.dex */
public final class o24 extends e.a {
    public final /* synthetic */ RecyclerView.Adapter[] b;
    public final /* synthetic */ AttachMusicActivity c;

    public o24(AttachMusicActivity attachMusicActivity, RecyclerView.Adapter[] adapterArr) {
        this.c = attachMusicActivity;
        this.b = adapterArr;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        int i = AttachMusicActivity.N;
        this.c.getClass();
        int i2 = 0;
        while (true) {
            RecyclerView.Adapter[] adapterArr = this.b;
            if (i2 >= adapterArr.length) {
                return;
            }
            RecyclerView.Adapter adapter = adapterArr[i2];
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            i2++;
        }
    }
}
