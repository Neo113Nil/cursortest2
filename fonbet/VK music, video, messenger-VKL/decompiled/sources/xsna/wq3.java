package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.channels.api.Channel;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Artist;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import com.vk.geo.impl.presentation.j;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.story.api.media.StoryMediaData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aue;
import xsna.cce;
import xsna.ij20;
import xsna.q2j;
import xsna.r6v;
import xsna.wwh;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wq3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wq3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String uri;
        Uri uri2 = null;
        int i = 0;
        r3 = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((yj40) obj) instanceof uq3);
            case 1:
                return ((Artist) obj).c;
            case 2:
                List<flb> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (flb flbVar : list) {
                    AudioBookChapter audioBookChapter = new AudioBookChapter(new JSONObject(flbVar.o));
                    DownloadingState downloadingState = flbVar.m;
                    AudioBooksChapterProgressStatus.a aVar = AudioBooksChapterProgressStatus.Companion;
                    String str = flbVar.h;
                    aVar.getClass();
                    arrayList.add(AudioBookChapter.zb(audioBookChapter, flbVar.g, AudioBooksChapterProgressStatus.a.a(str), downloadingState, null, 743));
                }
                return arrayList;
            case 3:
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    return 0;
                }
                Iterator it = list2.iterator();
                double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                while (it.hasNext()) {
                    d += ((Number) it.next()).intValue();
                    i++;
                    if (i < 0) {
                        e43.s();
                        throw null;
                    }
                }
                return Integer.valueOf((int) (i == 0 ? Double.NaN : d / i));
            case 4:
                return Boolean.valueOf(((OrdersGetAutoBuyStatusResponseDto) obj).d());
            case 5:
                return xwk.d().a().m((CharSequence) obj);
            case 6:
                StoryMediaData storyMediaData = (StoryMediaData) obj;
                if (storyMediaData != null) {
                    if (storyMediaData.e) {
                        uri = Uri.fromFile(storyMediaData.b).toString();
                    } else {
                        CameraVideoEncoderParameters cameraVideoEncoderParameters = storyMediaData.c;
                        uri = Uri.fromFile(cameraVideoEncoderParameters != null ? cameraVideoEncoderParameters.d : null).toString();
                    }
                    if (uri != null) {
                        uri2 = jeq0.g(uri);
                    }
                }
                return mcr0.i(uri2, 1080, 1920, 94848, null, null);
            case 7:
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 8:
                Channel channel = (Channel) obj;
                return new xf20(channel.i, channel.k, channel.h, 4);
            case 9:
                bdb bdbVar = (bdb) obj;
                if (bdbVar.l && bdbVar.m) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return ((com.vk.movika.sdk.base.model.f) obj).g;
            case 11:
                List<cyo> list3 = ((gxo) obj).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    cyo cyoVar = (cyo) obj2;
                    cyoVar.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (cyoVar.e && elapsedRealtime >= cyoVar.f) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 12:
                ybe.a aVar2 = (ybe.a) obj;
                List<zg5> list4 = aVar2.c;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                int i2 = 0;
                for (Object obj3 : list4) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    zg5 zg5Var = (zg5) obj3;
                    SdkImages sdkImages = zg5Var.a;
                    fi5 fi5Var = aVar2.g;
                    boolean z2 = (fi5Var != null && fi5Var.a == i2 && aVar2.j.a) ? false : true;
                    vae vaeVar = zg5Var.d;
                    fi5 fi5Var2 = aVar2.i;
                    arrayList3.add(new cce.c.a(sdkImages, z2, vaeVar, fi5Var2 != null && fi5Var2.a == i2 && aVar2.f, zg5Var.e));
                    i2 = i3;
                }
                return new cce.c(arrayList3);
            case 13:
                return Boolean.valueOf(((aue.b) obj).f != null);
            case 14:
                return Float.valueOf(((com.vk.photo.editor.features.colorgrading.a) obj).g);
            case 15:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_search_filters_icon");
                return s3q0.a;
            case 16:
                ((r6v.a) obj).g(80);
                return s3q0.a;
            case 17:
                return wwh.c.a;
            case 18:
                ((uzh0) obj).f();
                return s3q0.a;
            case 19:
                return p2j.k(((q2j.h) obj).i);
            case 20:
                return s3q0.a;
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_voip_call_audio, (Context) obj);
            case 22:
                return io.reactivex.rxjava3.core.q.O((List) obj);
            case 23:
                y1p0 y1p0Var = (y1p0) obj;
                return new w1p0(y1p0Var.a, y1p0Var.b, y1p0Var.c);
            case 24:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 25:
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                xgx0.a.getClass();
                xgx0.c("An error occurred on FullLogoutDelegate.CleanStoragesDelegate", th);
                return s3q0.a;
            case 26:
                cvk.u(R.string.error, false);
                L.g("Can't handle sticker local result", (Throwable) obj);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                return new j.c();
            default:
                ((ij20.a) obj).l(true);
                return s3q0.a;
        }
    }

    public /* synthetic */ wq3(p2j p2jVar) {
        this.b = 19;
    }
}
