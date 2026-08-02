package xsna;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vk.music.player.presentation.widgets.PlayerBigWidget;
import com.vk.music.player.presentation.widgets.PlayerSmallWidget;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.baw0;
import xsna.is60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bws implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ bws(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4 A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        Iterator<T> it;
        GroupsGroupFullDto groupsGroupFullDto;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                cvk.u(R.string.error, false);
                L.g("Can't handle top gifs result", (Throwable) obj);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((ef00) obj).e);
            case 2:
                return Boolean.valueOf(((Attachment) obj) instanceof FwdMessagesAttachment);
            case 3:
                int i2 = MultiVideoTimelineView.y0;
                L.j((Throwable) obj, "MultiVideoTimelineView");
                return s3q0.a;
            case 4:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((MusicTrack) it2.next()).Fb());
                }
                return arrayList;
            case 5:
                qgi0.r((tgi0) obj, "downloads_settings_appbar_title");
                return s3q0.a;
            case 6:
                cvk.u(h03.a((Throwable) obj) ? R.string.video_common_network_error : R.string.err_internal, false);
                return s3q0.a;
            case 7:
                qgi0.r((tgi0) obj, "audiobookChapterName");
                return s3q0.a;
            case 8:
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((l3b0) obj).d);
            case 10:
                Context context = (Context) obj;
                try {
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) PlayerSmallWidget.class));
                    if (appWidgetIds != null && appWidgetIds.length != 0) {
                        PlayerSmallWidget.i(context, appWidgetManager, appWidgetIds);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Exception e) {
                    bn40.c(e, new Object[0]);
                }
                try {
                    AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
                    int[] appWidgetIds2 = appWidgetManager2.getAppWidgetIds(new ComponentName(context, (Class<?>) PlayerBigWidget.class));
                    if (appWidgetIds2 != null && appWidgetIds2.length != 0) {
                        PlayerBigWidget.i(context, appWidgetManager2, appWidgetIds2);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } catch (Exception e2) {
                    bn40.c(e2, new Object[0]);
                }
                return s3q0.a;
            case 11:
                m5c0 m5c0Var = (m5c0) obj;
                ur60 ur60Var = m5c0Var.h;
                NewsEntry newsEntry = m5c0Var.i;
                boolean ec = newsEntry instanceof Post ? ((Post) newsEntry).ec() : false;
                int i3 = m5c0Var.k;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i = R.string.video;
                    } else if (i3 != 7 && i3 != 9) {
                        i = R.string.wall_view;
                    }
                    p3p0 p3p0Var = new p3p0(i);
                    sq60 sq60Var = ur60Var.b;
                    boolean z = ur60Var.g;
                    boolean z2 = ur60Var.f;
                    ListLoadingState listLoadingState = ur60Var.e;
                    is60.a aVar = new is60.a(sq60Var, listLoadingState, z2, z);
                    boolean z3 = (sq60Var.a.isEmpty() || z || z2 || listLoadingState != ListLoadingState.IDLE) ? false : true;
                    it = ur60Var.b.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Object next = it.next();
                            if (((ol60) next).b == 350) {
                                obj2 = next;
                            }
                        }
                    }
                    return new v9c0(p3p0Var, aVar, z3, obj2 != null, ec);
                }
                i = R.string.photo;
                p3p0 p3p0Var2 = new p3p0(i);
                sq60 sq60Var2 = ur60Var.b;
                boolean z4 = ur60Var.g;
                boolean z22 = ur60Var.f;
                ListLoadingState listLoadingState2 = ur60Var.e;
                is60.a aVar2 = new is60.a(sq60Var2, listLoadingState2, z22, z4);
                if (sq60Var2.a.isEmpty()) {
                }
                it = ur60Var.b.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                return new v9c0(p3p0Var2, aVar2, z3, obj2 != null, ec);
            case 12:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 13:
                L.i((Throwable) obj);
                return s3q0.a;
            case 14:
                View view = new View(((ViewGroup) obj).getContext());
                u11.h(-1, -2, view);
                return new sod0(view);
            case 15:
                return ((VideoAlbumResultData) obj).c;
            case 16:
                LikeInfo likeInfo = (LikeInfo) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(likeInfo != null ? likeInfo.c.getString("firstName") : null);
                sb.append(' ');
                sb.append(likeInfo != null ? likeInfo.c.getString("lastName") : null);
                return sb.toString();
            case 17:
                qgi0.r((tgi0) obj, "reviewCounter");
                return s3q0.a;
            case 18:
                return new vet(new onh0(), ((u4a) obj).b.I);
            case 19:
                return oc4.d((AudioAudioDto) obj);
            case 20:
                return new w4m0((ivu) obj);
            case 21:
                return drm0.p0((String) obj).toString();
            case 22:
                ((Integer) obj).intValue();
                return true;
            case 23:
                return s3q0.a;
            case 24:
                a21 a21Var = (a21) obj;
                String str = a21Var.a;
                String str2 = a21Var.e;
                return new Pair(str, str2 != null ? str2 : null);
            case 25:
                List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d2 == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d2)) == null) {
                    return null;
                }
                new dqu();
                Group a = dqu.a(groupsGroupFullDto);
                UserProfile userProfile = new UserProfile();
                userProfile.c = fkq0.e(a.c);
                userProfile.e = a.d;
                userProfile.h = a.e;
                userProfile.g = a.f;
                return userProfile;
            case 26:
                qgi0.r((tgi0) obj, "topBarRightMainIcon");
                return s3q0.a;
            case 27:
                ((u3a0) obj).a();
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((baw0.a) obj).e instanceof baw0.a.AbstractC2601a.b);
            default:
                Throwable th = (Throwable) obj;
                Context context2 = e43.a;
                enj.r(context2 != null ? context2 : null, j03.g(context2 != null ? context2 : null, th, R.string.error), 0);
                return s3q0.a;
        }
    }

    public /* synthetic */ bws(k140 k140Var) {
        this.b = 10;
    }
}
