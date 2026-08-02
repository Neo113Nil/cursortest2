package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.SpannableString;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.clips.viewer.impl.adapters.TimelineThumbsAdapter;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.mention.StoryHashtagSpan;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.hnj0;
import xsna.mwk0;
import xsna.no90;
import xsna.tj50;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ha40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UniversalRequestStoreOuterClass.UniversalRequestStore createDataStore$lambda$2;
        switch (this.b) {
            case 0:
                cvk.u(R.string.music_play_failed, false);
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(epx.f(((ib50) obj).a.c, o25.a().c()));
            case 2:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                VKList vKList = (VKList) obj;
                return new no90.a.b(vKList.size(), vKList, vKList.i() > vKList.size());
            case 5:
                cvk.u(R.string.podcast_toast_unfave_failed, false);
                return s3q0.a;
            case 6:
                Rect C = bwt0.C((View) obj);
                int i = C.left;
                C.set(i, C.top, (C.right - i) / 5, C.bottom);
                return C;
            case 7:
                Intent putExtra = new Intent("draft").putExtra("type", "draftRemoved");
                Context context = e43.a;
                cuz.a(context != null ? context : null).c(putExtra);
                return s3q0.a;
            case 8:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 9:
                return Float.valueOf(((hfk) obj).getX0());
            case 10:
                thg0 thg0Var = (thg0) obj;
                return Boolean.valueOf(thg0Var.h && !thg0Var.f);
            case 11:
                if (epx.f(obj, Boolean.FALSE)) {
                    return new ov70(9205357640488583168L);
                }
                List list = (List) obj;
                Object obj2 = list.get(0);
                float floatValue = (obj2 != null ? (Float) obj2 : null).floatValue();
                return new ov70((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits((list.get(1) != null ? (Float) r7 : null).floatValue()) & 4294967295L));
            case 12:
                return new ywi0.b(((tj50.a) obj).a(new h3e0(3), ao8.d));
            case 13:
                return Boolean.valueOf(((hnj0.a) obj).a);
            case 14:
                return new ylj(((mwk0.a) obj).b.a.b, r7.c / r7.d);
            case 15:
                String str = ((zk10) obj).b().get(0);
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new StoryHashtagSpan(str), 0, str.length(), 17);
                return spannableString;
            case 16:
                return ((GetStoriesResponse) obj).c;
            case 17:
                return s3q0.a;
            case 18:
                createDataStore$lambda$2 = UniversalRequestDataStoreProvider.createDataStore$lambda$2((CorruptionException) obj);
                return createDataStore$lambda$2;
            case 19:
                qgi0.r((tgi0) obj, "upload_cell_right_switch");
                return s3q0.a;
            case 20:
                int i2 = UserProfileHeaderView.G;
                qgi0.r((tgi0) obj, "topBarRightMainIcon");
                return s3q0.a;
            case 21:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 22:
                return s3q0.a;
            case 23:
                return new tfs0(((sfs0) obj).b);
            case 24:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(((UIBlock) it.next()) instanceof UIBlockPlaceholder)) {
                                r2 = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(r2);
            case 25:
                TimelineThumbs timelineThumbs = (TimelineThumbs) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (timelineThumbs != null) {
                    return new TimelineThumbsAdapter(timelineThumbs);
                }
                return null;
            case 26:
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.h((VideoMinimizableState) obj));
            case 27:
                return Long.valueOf(((Integer) obj).intValue() * 10000);
            case 28:
                String str2 = (String) obj;
                a1w a1wVar = q1w.a;
                (a1wVar != null ? a1wVar : null).r().O.w().a(str2);
                return s3q0.a;
            default:
                return Boolean.valueOf(((exv0) obj) instanceof nvv0);
        }
    }

    public /* synthetic */ ha40(com.vk.music.podcast.impl.ui.episode.b bVar) {
        this.b = 5;
    }
}
