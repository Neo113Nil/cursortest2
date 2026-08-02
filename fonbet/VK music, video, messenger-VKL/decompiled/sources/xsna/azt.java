package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import xsna.ksh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class azt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ azt(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        boolean z = true;
        MusicOfflineCacheStorage musicOfflineCacheStorage = null;
        String l2 = null;
        switch (this.b) {
            case 0:
                L.g("Can't handle gif typing reload", (Throwable) obj);
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                return (kru) obj;
            case 3:
                qgi0.r((tgi0) obj, "sub_title");
                return s3q0.a;
            case 4:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).j.k);
            case 5:
                return ((u180) obj).b.a(LongPollType.CHANNELS);
            case 6:
                int i = ImSettingsDialogThemeFragment.c0;
                return Boolean.valueOf(((ThemeChooserState) obj).e);
            case 7:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                new o8(LocationCommon.a, 7);
                return s3q0.a;
            case 10:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MusicTrack) it.next()).Fb());
                }
                return arrayList;
            case 11:
                String str = (String) obj;
                if (str == null) {
                    return new f500(0);
                }
                Uri parse = Uri.parse(str);
                String uri = parse.buildUpon().clearQuery().build().toString();
                String queryParameter = parse.getQueryParameter("ts");
                long parseLong = queryParameter != null ? Long.parseLong(queryParameter) : 0L;
                String queryParameter2 = parse.getQueryParameter("wait");
                return new f500(parseLong, queryParameter2 != null ? Long.parseLong(queryParameter2) : 0L, uri, parse.getQueryParameter("key"), parse.getQueryParameter("id"), parse.getQueryParameter("act"));
            case 12:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 13:
                qyg0 V0 = ((hyg0) obj).V0("\n        SELECT storage \n        FROM audio_track \n        WHERE storage IS NOT NULL \n        GROUP BY storage \n        ORDER BY COUNT(storage) DESC \n        LIMIT 1\n    ");
                try {
                    if (V0.step()) {
                        if (!V0.isNull(0)) {
                            l2 = V0.l2(0);
                        }
                        musicOfflineCacheStorage = uh.a(l2);
                    }
                    return musicOfflineCacheStorage;
                } finally {
                    V0.close();
                }
            case 14:
                Activity activity = (Activity) obj;
                x290 x290Var = x290.a;
                if (epx.f(x290.b(), activity)) {
                    x290.f.c(activity, true);
                    FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                    if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.r0(x290.n);
                    }
                }
                return s3q0.a;
            case 15:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 16:
                cvk.u(R.string.podcast_toast_fave_failed, false);
                return s3q0.a;
            case 17:
                View view = (View) obj;
                if (view instanceof ViewGroup) {
                    ((ViewGroup) view).setClipChildren(false);
                }
                return s3q0.a;
            case 18:
                int i2 = PostFragment.S0;
                return s3q0.a;
            case 19:
                int i3 = ((u1c0) obj).c;
                if (i3 != 73 && i3 != 341) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                return ((PostingState.Editing) obj).i.y;
            case 21:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 22:
                return new w990((ViewGroup) obj);
            case 23:
                qgi0.r((tgi0) obj, "search_database_geo_item_title");
                return s3q0.a;
            case 24:
                return Boolean.valueOf(((ksh0.b) obj).e);
            case 25:
                cvk.u(R.string.search_recent_delete_error_text, false);
                return s3q0.a;
            case 26:
                ((String) obj).equals("videos_pin");
                return s3q0.a;
            case 27:
                ((StoryEntry) obj).h = true;
                return s3q0.a;
            case 28:
                Bitmap bitmap = (Bitmap) obj;
                Bitmap b = kd7.b(bitmap, iah0.f().widthPixels, iah0.f().heightPixels, false, false);
                return b == null ? bitmap : b;
            default:
                SeekPreviewImageView seekPreviewImageView = new SeekPreviewImageView((Context) obj, null, 0, 14, 0);
                seekPreviewImageView.setClipToOutline(false);
                seekPreviewImageView.setOutlineProvider(null);
                seekPreviewImageView.setShowBorder(false);
                return seekPreviewImageView;
        }
    }

    public /* synthetic */ azt(boolean z) {
        this.b = 9;
    }
}
