package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.commands.dialogs.DialogArchiveUnarchiveCmd;
import com.vk.log.L;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.dto.group.WebGroupShortInfo;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cos;
import xsna.e3m;
import xsna.gi80;
import xsna.j3s;
import xsna.l3s;
import xsna.tj50;
import xsna.zjo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dam implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ dam(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<UIBlockMusicMixTopshelf.Item> list;
        UIBlockMusicMixTopshelf.Item item;
        VideoFile videoFile;
        switch (this.b) {
            case 0:
                DialogArchiveUnarchiveCmd.Action action = DialogArchiveUnarchiveCmd.Action.ARCHIVE;
                return new com.vk.im.engine.internal.jobs.dialogs.c((Peer) obj);
            case 1:
                return io.reactivex.rxjava3.core.q.O((List) obj);
            case 2:
                Context context = (Context) obj;
                e3m.a aVar = e3m.a;
                return new Tooltip.f(context.getColor(R.color.vk_tip_background), Integer.valueOf(context.getColor(R.color.vk_white)), null, 80, null, 0, 32505721);
            case 3:
                L.g("EduAchievementsHelper", (Throwable) obj);
                return s3q0.a;
            case 4:
                k4s k4sVar = (k4s) obj;
                return new l3s.e.b(new j3s.b(k4sVar.a, k4sVar.b));
            case 5:
                View view = (View) obj;
                if (!(view instanceof ViewGroup)) {
                    if (view instanceof VKEnhancedImageView) {
                        ((VKEnhancedImageView) view).X0(true);
                    } else if (view instanceof FrescoImageView) {
                        ((FrescoImageView) view).j(true);
                    }
                }
                return s3q0.a;
            case 6:
                return cos.b.a;
            case 7:
                return s3q0.a;
            case 8:
                cvk.u(R.string.error, false);
                L.g("Can't execute gif request", (Throwable) obj);
                return s3q0.a;
            case 9:
                return (WebGroupShortInfo) j5g.Y((List) obj);
            case 10:
                h03.b((Throwable) obj);
                return s3q0.a;
            case 11:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.e);
            case 12:
                return s3q0.a;
            case 13:
                return (VkAuthCredentials) obj;
            case 14:
                ((Integer) obj).intValue();
                return EmptyList.b;
            case 15:
                ((ljo0) obj).a.getClass();
                return s3q0.a;
            case 16:
                return new wv00((ViewGroup) obj);
            case 17:
                int i = MarketItemCommentsFragment.j0;
                String y1 = ((iag) obj).y1();
                return y1 == null ? "" : y1;
            case 18:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 19:
                return Long.valueOf(z4g.f((File) obj));
            case 20:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                RecyclerView.Adapter<? extends RecyclerView.e0> bindingAdapter = e0Var.getBindingAdapter();
                mo40 mo40Var = bindingAdapter instanceof mo40 ? (mo40) bindingAdapter : null;
                int bindingAdapterPosition = e0Var.getBindingAdapterPosition();
                if (mo40Var == null) {
                    return null;
                }
                UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = mo40Var.n;
                String r = (uIBlockMusicMixTopshelf == null || (list = uIBlockMusicMixTopshelf.y) == null || (item = (UIBlockMusicMixTopshelf.Item) j5g.b0(bindingAdapterPosition, list)) == null || (videoFile = (VideoFile) j5g.a0(item.g)) == null) ? null : videoFile.r();
                if (r != null) {
                    return new flt0(bindingAdapterPosition, r);
                }
                return null;
            case 21:
                Pair pair = (Pair) obj;
                int i2 = ((Playlist) pair.i()).Eb() ? R.string.music_toast_album_added : R.string.music_toast_playlist_added;
                int i3 = ((Playlist) pair.i()).Eb() ? R.string.music_toast_album_deletion_done : R.string.music_toast_playlist_deletion_done;
                if (((Playlist) pair.i()).g == null) {
                    i2 = i3;
                }
                cvk.u(i2, false);
                return s3q0.a;
            case 22:
                z4g.d().l();
                return s3q0.a;
            case 23:
                return new gi80.a(((tj50.a) obj).a(new kdw(9), ao8.d));
            case 24:
                tj50.a aVar2 = (tj50.a) obj;
                kdw kdwVar = new kdw(17);
                ao8 ao8Var = ao8.d;
                return new ifd0(aVar2.a(kdwVar, ao8Var), aVar2.a(gfd0.b, ao8Var), aVar2.a(new cd10(11), ao8Var));
            case 25:
                return Boolean.valueOf(((BaseOkResponseDto) obj).i() == 1);
            case 26:
                return s3q0.a;
            case 27:
                qgi0.r((tgi0) obj, "AntispamBadge");
                return s3q0.a;
            case 28:
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                int i4 = ((epx.f(obj2, Boolean.FALSE) || obj2 == null) ? null : (zjo0.a) ((izs) k2h0.e.c).invoke(obj2)).a;
                Object obj3 = list2.get(1);
                return new zjo0(i4, (obj3 != null ? (Boolean) obj3 : null).booleanValue());
            default:
                ysg0.b.a(new eru0((VkGroupsSearchParams) obj));
                return s3q0.a;
        }
    }
}
