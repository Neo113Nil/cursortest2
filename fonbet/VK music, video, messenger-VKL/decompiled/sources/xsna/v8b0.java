package xsna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.f0p;

/* compiled from: PlaylistEditorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class v8b0 extends dc40 {
    public final Playlist e;
    public final f0p.e.a f;

    public v8b0(Playlist playlist, f0p.e.a aVar) {
        super(false);
        this.e = playlist;
        this.f = aVar;
    }

    @Override // xsna.dc40
    public final List<RecyclerView.Adapter<?>> a(AppCompatActivity appCompatActivity) {
        ze5 ze5Var = new ze5(this.f, this);
        ArrayList arrayList = new ArrayList();
        Playlist playlist = this.e;
        arrayList.add(new ec40(R.id.music_action_attach_playlist_cover_image, playlist, R.string.music_action_attach_playlist_cover_image, R.string.music_action_attach_playlist_cover_image, R.drawable.vk_icon_picture_outline_24, R.attr.vk_ui_icon_accent, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        arrayList.add(new ec40(R.id.music_action_remove_playlist_cover_image, playlist, R.string.music_action_remove_playlist_cover_image, R.string.music_action_remove_playlist_cover_image, R.drawable.vk_icon_delete_24, R.attr.vk_ui_icon_accent, 0, VideoRecord.DEFAULT_MAX_DIMENSION));
        fc40 fc40Var = new fc40(ze5Var, this.b);
        fc40Var.setItems(arrayList);
        return Collections.singletonList(fc40Var);
    }
}
