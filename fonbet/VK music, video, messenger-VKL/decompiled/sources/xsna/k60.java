package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.im.ui.components.contacts.DonutContactsListFactory;
import com.vk.log.L;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.player.StartPlaySource;
import com.vk.newsfeed.impl.requests.SearchGetHintsWithAttachments;
import com.vk.photos.ui.album_list.AlbumImageView;
import com.vk.photos.ui.album_list.AlbumsListFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.dz40;
import xsna.f5h0;
import xsna.m99;
import xsna.v50;
import xsna.xaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ k60(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v102, types: [java.lang.Object[], xsna.xaf[]] */
    /* JADX WARN: Type inference failed for: r5v11, types: [xsna.xaf$c] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AudioBook audioBook;
        List<ClipsDraftablePlaylist> list;
        ApiSessionStore lambda$createConfRoomInternal$10;
        String str = null;
        switch (this.b) {
            case 0:
                return v50.a.a;
            case 1:
                qgi0.r((tgi0) obj, "AdditionalSettingsToolbarCloseButton");
                return s3q0.a;
            case 2:
                View view = (View) obj;
                int i = AlbumsListFragment.a0;
                ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.content).getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = -2;
                AlbumImageView albumImageView = (AlbumImageView) view.findViewById(R.id.cover);
                albumImageView.getLayoutParams().width = -1;
                albumImageView.setQuad(true);
                return s3q0.a;
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, null, 1007);
            case 4:
                StartPlaySource startPlaySource = ((sy40) obj).t;
                StartPlayAudioBookSource startPlayAudioBookSource = startPlaySource instanceof StartPlayAudioBookSource ? (StartPlayAudioBookSource) startPlaySource : null;
                if (startPlayAudioBookSource != null && (audioBook = startPlayAudioBookSource.c) != null) {
                    str = audioBook.c;
                }
                return new dz40.h.a(R.string.music_player_header_audiobook, str, true);
            case 5:
                return ((ku4) obj).d;
            case 6:
                float f = f17.a;
                return Boolean.TRUE;
            case 7:
                return Boolean.valueOf(epx.f(((m99.a) obj).a, Boolean.TRUE));
            case 8:
                ozf0 ozf0Var = (ozf0) obj;
                JSONArray jSONArray = new JSONArray();
                String str2 = ozf0Var.c;
                jSONArray.put(str2);
                String str3 = ozf0Var.d;
                if (!epx.f(str2, str3)) {
                    jSONArray.put(str3);
                    jSONArray.put(ozf0Var.e);
                }
                return jSONArray;
            case 9:
                return CatalogSectionScreenState.a((CatalogSectionScreenState) obj, null, null, null, null, null, 23);
            case 10:
                return air.b('\'', "'", (String) obj);
            case 11:
                return Boolean.valueOf(((bdb) obj).l);
            case 12:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.w().b();
                xgl0Var.d().k();
                xgl0Var.v().h(-1L);
                return s3q0.a;
            case 13:
                L.e("ClipItemUtils: Reversed file ".concat(((Boolean) obj).booleanValue() ? "deleted" : "not deleted"));
                return s3q0.a;
            case 14:
                ClipsCoauthorsSelectorMviState.c cVar = (ClipsCoauthorsSelectorMviState.c) obj;
                return fnd.d(cVar.c, cVar.e);
            case 15:
                int i2 = ClipsGridLikedClipsListFragment.i0;
                return s3q0.a;
            case 16:
                return (GroupsGroupFullDto) j5g.Y(((GroupsGetByIdObjectResponseDto) obj).d());
            case 17:
                return s3q0.a;
            case 18:
                L.g("ClipsTemplateEditorVideoViewHandlerImpl", (Throwable) obj);
                return s3q0.a;
            case 19:
                return Boolean.valueOf(((cbg) obj).c == 424);
            case 20:
                return Boolean.valueOf(((wah) obj).e);
            case 21:
                bwr0 bwr0Var = (bwr0) obj;
                if (bwr0Var instanceof pwr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.a.a);
                }
                if ((bwr0Var instanceof twr0) || (bwr0Var instanceof rwr0)) {
                    return io.reactivex.rxjava3.core.q.T(xaf.c.a);
                }
                if (bwr0Var instanceof qwr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.d.a);
                }
                if (bwr0Var instanceof uxr0) {
                    return io.reactivex.rxjava3.core.q.T(xaf.e.a);
                }
                if (!(bwr0Var instanceof fyr0)) {
                    return bwr0Var instanceof wxr0 ? ((wxr0) bwr0Var).a.k1() == 0 ? io.reactivex.rxjava3.core.q.T(xaf.f.a) : io.reactivex.rxjava3.core.q.T(xaf.e.a) : io.reactivex.rxjava3.core.q.T(xaf.b.a);
                }
                ?? r5 = xaf.c.a;
                VideoFile videoFile = ((fyr0) bwr0Var).a;
                ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                if (clipVideoFile != null && (list = clipVideoFile.M1) != null && (!list.isEmpty())) {
                    str = r5;
                }
                return io.reactivex.rxjava3.core.q.O(rl3.I(new xaf[]{xaf.f.a, str}));
            case 22:
                ((ojt) obj).l = f5h0.f.a;
                return s3q0.a;
            case 23:
                lambda$createConfRoomInternal$10 = ConversationFactory.lambda$createConfRoomInternal$10((ApiSessionStore) obj);
                return lambda$createConfRoomInternal$10;
            case 24:
                return Integer.valueOf((int) ((c9k) obj).r);
            case 25:
                return s3q0.a;
            case 26:
                w8j w8jVar = (w8j) obj;
                DonutContactsListFactory donutContactsListFactory = DonutContactsListFactory.SELECT_DONUT_USERS_VKAPP;
                return new obm(w8jVar.a, w8jVar.b, w8jVar.c);
            case 27:
                qgi0.r((tgi0) obj, "drafts_list_delete_dialog_title");
                return s3q0.a;
            case 28:
                SearchGetHintsWithAttachments.Response response = (SearchGetHintsWithAttachments.Response) obj;
                return new Pair(response.b.b, response.c);
            default:
                L.E((Throwable) obj, new Object[0]);
                return s3q0.a;
        }
    }

    public /* synthetic */ k60(fnd fndVar) {
        this.b = 14;
    }
}
