package xsna;

import android.graphics.Matrix;
import android.view.View;
import com.vk.dto.common.Source;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistPermissions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.o62;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class nz8 implements mz8, yuk, gc40 {
    public final Object b;
    public final Object c;

    public /* synthetic */ nz8(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.gc40
    public List a() {
        j7b0 j7b0Var = (j7b0) this.c;
        Playlist playlist = j7b0Var.c;
        ArrayList arrayList = new ArrayList();
        Playlist playlist2 = (Playlist) this.b;
        if (xx1.e(playlist2.Bb(o25.a().c()))) {
            arrayList.add(new ec40(R.id.music_action_edit, (Playlist) this.b, R.string.music_edit_button_label, R.string.music_talkback_playlist_edit, R.drawable.vk_icon_edit_outline_28, 0, 0, 992));
        }
        if (xx1.d(playlist)) {
            arrayList.add(new ec40(R.id.music_action_remove_from_my_music, (Playlist) this.b, j7b0Var.D() ? R.string.music_menu_playlist_delete : jnj.h(playlist2.O) ? R.string.music_menu_playlist_unfollow_from_collection : R.string.music_menu_playlist_unfollow, j7b0Var.D() ? R.string.music_talkback_playlist_delete : jnj.h(playlist2.O) ? R.string.music_talkback_remove_kids_playlist : R.string.music_talkback_remove_playlist, R.drawable.vk_icon_delete_outline_28, 0, 0, 992));
        } else if (xx1.b(playlist)) {
            arrayList.add(new ec40(R.id.music_action_add_to_my_music, (Playlist) this.b, jnj.h(playlist2.O) ? R.string.music_add_to_my_collection : R.string.music_add_to_my_music, jnj.h(playlist2.O) ? R.string.music_talkback_playlist_add_to_my_collection : R.string.music_talkback_playlist_add_to_my_music, R.drawable.vk_icon_add_outline_28, 0, 0, 992));
        }
        if (sp.f(j7b0Var.e) && !playlist2.Fb() && playlist2.v > 0) {
            arrayList.add(new ec40(R.id.music_action_play_next, playlist2, R.string.music_play_next, R.string.music_talkback_play_next, R.drawable.vk_icon_list_play_outline_28, 0, 0, 992));
        }
        if (xx1.t(playlist2)) {
            arrayList.add(new ec40(R.id.music_action_go_to_artists, (Playlist) this.b, R.string.music_artist_action_to_artist, R.string.music_talkback_go_to_artist, R.drawable.vk_icon_music_mic_outline_28, 0, 0, 992));
        } else if (xx1.s(playlist2)) {
            arrayList.add(new ec40(R.id.music_action_go_to_artists, (Playlist) this.b, R.string.music_artist_action_to_artist_search, R.string.music_talkback_to_artist_search, R.drawable.vk_icon_music_mic_outline_28, 0, 0, 992));
        }
        if (!playlist2.Fb()) {
            if (playlist2.v > 0 && !xx1.x(playlist2) && !xx1.u(playlist2)) {
                if (playlist2.S4()) {
                    arrayList.add(new ec40(R.id.music_action_toggle_download, (Playlist) this.b, R.string.music_action_remove_from_storage_description, R.string.music_talkback_remove_from_storage, R.drawable.vk_icon_download_cancel_outline_28, 0, 0, 992));
                } else {
                    arrayList.add(new ec40(R.id.music_action_toggle_download, (Playlist) this.b, R.string.music_menu_playlist_download, R.string.music_talkback_playlist_download, R.drawable.vk_icon_download_outline_28, 0, 0, 992));
                }
            }
            PlaylistPermissions playlistPermissions = playlist2.B;
            if (playlistPermissions != null ? playlistPermissions.e : false) {
                arrayList.add(new ec40(R.id.music_action_share_cover_to_story, (Playlist) this.b, R.string.music_share_to_story, R.string.music_talkback_share_to_story, R.drawable.vk_icon_story_outline_28, 0, 0, 992));
                arrayList.add(new ec40(R.id.music_action_share, (Playlist) this.b, R.string.music_share, R.string.music_talkback_share_playlist, R.drawable.vk_icon_share_outline_28, 0, 0, 992));
                arrayList.add(new ec40(R.id.music_action_copy_link, (Playlist) this.b, R.string.copy_link, R.string.music_talkback_copy_link_playlist, R.drawable.vk_icon_copy_outline_28, 0, 0, 992));
            }
        }
        return arrayList;
    }

    @Override // xsna.yuk
    public io.reactivex.rxjava3.core.x b(int i, String str, Object obj) {
        return new io.reactivex.rxjava3.internal.operators.single.r(((lzv) this.b).b(this, ((mjg) this.c).a(new i5w((wy1) obj, i, Source.CACHE, false))), new ql2(new hxl(this, 15), 24)).l(new xl0(new rl2(28), 25));
    }

    @Override // xsna.gc40
    public EmptyList c() {
        return EmptyList.b;
    }

    @Override // xsna.mz8
    public void d(View view, float[] fArr) {
        en10.e(fArr);
        e(view, fArr);
    }

    public void e(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.b;
        Object parent = view.getParent();
        if (parent instanceof View) {
            e((View) parent, fArr);
            o62.a aVar = o62.a;
            en10.e(fArr2);
            en10.i(-view.getScrollX(), -view.getScrollY(), fArr2);
            o62.c(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            en10.e(fArr2);
            en10.i(left, top, fArr2);
            o62.c(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.c;
            view.getLocationInWindow(iArr);
            o62.a aVar2 = o62.a;
            en10.e(fArr2);
            en10.i(-view.getScrollX(), -view.getScrollY(), fArr2);
            o62.c(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            en10.e(fArr2);
            en10.i(f, f2, fArr2);
            o62.c(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        alk.y(matrix, fArr2);
        o62.c(fArr, fArr2);
    }

    public nz8(float[] fArr) {
        this.b = fArr;
        this.c = new int[2];
    }
}
