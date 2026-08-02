package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.dto.articles.Article;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.data.VKList;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.rlottie.RLottieView;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategoriesSection;
import com.vk.superapp.api.dto.app.catalog.section.AppsCategory;
import com.vk.superapp.api.dto.app.catalog.section.AppsHorizontalListSection;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import xsna.pew0;
import xsna.tj50;
import xsna.x7a;
import xsna.yqi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class quz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ quz(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
    /* JADX WARN: Type inference failed for: r9v34, types: [xsna.x7a$b] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        List loadAlbums$lambda$7;
        String str;
        Iterable iterable;
        x7a.b.c cVar;
        char c = ')';
        boolean z = false;
        r5 = false;
        boolean z2 = false;
        z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                loadAlbums$lambda$7 = LocalGalleryProvider.loadAlbums$lambda$7((List) obj);
                return loadAlbums$lambda$7;
            case 1:
                return "geo";
            case 2:
                g610 g610Var = (g610) obj;
                return new h610(g610Var.c, g610Var.d);
            case 3:
                return "(" + ((yx4) obj) + ')';
            case 4:
                return Integer.valueOf(((List) obj).size());
            case 5:
                return Integer.valueOf(((AudioAudioDto) obj).getId());
            case 6:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 7:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 8:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator it = Sb.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((UIBlock) it.next()).Cb().i()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                kj70 kj70Var = (kj70) obj;
                x870 x870Var = x870.a;
                if (gz80.a(26)) {
                    Context context = e43.a;
                    Context context2 = context != null ? context : null;
                    ca70 ca70Var = ca70.a;
                    NotificationManager f = ca70.f(context2);
                    for (dk70 dk70Var : kj70Var.a) {
                        f.deleteNotificationChannelGroup(dk70Var.a);
                    }
                    f.deleteNotificationChannelGroup("messages");
                    f.deleteNotificationChannelGroup("community_channels");
                }
                return s3q0.a;
            case 10:
                CallsAudioManager.AudioDeviceInfoChangedEvent audioDeviceInfoChangedEvent = (CallsAudioManager.AudioDeviceInfoChangedEvent) obj;
                com.vk.voip.ui.c.b.getClass();
                CallsAudioDeviceInfo newDevice = audioDeviceInfoChangedEvent.getNewDevice();
                CallsAudioManager.AudioDeviceType deviceType = newDevice.getDeviceType();
                com.vk.voip.ui.c.Z0(deviceType == CallsAudioManager.AudioDeviceType.SPEAKER_PHONE);
                com.vk.voip.ui.c.I.onNext(newDevice);
                if (audioDeviceInfoChangedEvent.getOldDevice().getDeviceType().isHeadsetDevice() != deviceType.isHeadsetDevice()) {
                    com.vk.voip.ui.c.p1();
                }
                com.vk.voip.ui.a.h.onNext(new pew0.a.C3510a(audioDeviceInfoChangedEvent.getNewDevice().getDeviceType()));
                return s3q0.a;
            case 11:
                return io.reactivex.rxjava3.core.a.k(new RuntimeException("Timeout: initialization flag was not set to true within 3000 ms"));
            case 12:
                return new ins((ViewGroup) obj, R.layout.voip_past_asr_empty_space_item, i);
            case 13:
                ((Boolean) obj).getClass();
                return s3q0.a;
            case 14:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingChipsScrollView");
                qgi0.u(tgi0Var);
                return s3q0.a;
            case 15:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    Context context3 = e43.a;
                    j03.i(context3 != null ? context3 : null, (VKApiExecutionException) th);
                }
                return s3q0.a;
            case 16:
                Attachment attachment = (Attachment) obj;
                if (attachment != null && (attachment instanceof AttachmentWithMedia)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 17:
                return ((PostingState.Editing) obj).h;
            case 18:
                return (Article) j5g.Y((VKList) obj);
            case 19:
                int i2 = RLottieView.i;
                return s3q0.a;
            case 20:
                qgi0.j((tgi0) obj, 0);
                return s3q0.a;
            case 21:
                return ((qgl0) ((Enum) obj)).getKey();
            case 22:
                qgi0.r((tgi0) obj, "storefront_top_bar_bookmarks_icon");
                return s3q0.a;
            case 23:
                qgi0.r((tgi0) obj, "publish_button");
                return s3q0.a;
            case 24:
                tj50.a aVar = (tj50.a) obj;
                bwn0 bwn0Var = bwn0.b;
                ao8 ao8Var = ao8.d;
                return new yqi.a(aVar.a(bwn0Var, ao8Var), aVar.a(cwn0.b, ao8Var), aVar.a(dwn0.b, ao8Var), aVar.a(ewn0.b, ao8Var));
            case 25:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<ExtendedUserProfile.k> it2 = extendedUserProfile.D0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        Iterator<ExtendedUserProfile.l> it3 = extendedUserProfile.E0.iterator();
                        while (it3.hasNext()) {
                            ExtendedUserProfile.l next = it3.next();
                            String str2 = next.a;
                            if (next.d > 0) {
                                StringBuilder b = ho8.b(str2, " '");
                                b.append(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(next.d % 100)}, 1)));
                                str2 = b.toString();
                            }
                            String str3 = next.b != null ? "" + next.b : "";
                            if (next.c != null) {
                                if (myc0.f(str3)) {
                                    str3 = str3 + '\n';
                                }
                                StringBuilder e = fw3.e(str3);
                                e.append(next.c);
                                str3 = e.toString();
                            }
                            arrayList.add(new x4m(R.string.profile_university, v1v.a('\n', str2, str3)));
                        }
                        if (!arrayList.isEmpty()) {
                            arrayList.add(0, new o4m(R.string.profile_info_education, 14, null));
                        }
                        return arrayList;
                    }
                    ExtendedUserProfile.k next2 = it2.next();
                    if (next2 != null && (str = next2.a) != null) {
                        if (next2.g > 0) {
                            StringBuilder b2 = ho8.b(str, " '");
                            b2.append(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(next2.g % 100)}, 1)));
                            str = b2.toString();
                        }
                        String str4 = next2.c;
                        String str5 = str4 != null ? str4 : "";
                        if ((next2.f > 0 || next2.e > 0) && myc0.f(str5)) {
                            str5 = str5.concat(", ");
                        }
                        if (next2.f > 0) {
                            StringBuilder e2 = fw3.e(str5);
                            e2.append(next2.f);
                            str5 = e2.toString();
                        }
                        if (next2.f > 0 && next2.e > 0) {
                            str5 = str5 + '-';
                        }
                        if (next2.e > 0) {
                            StringBuilder e3 = fw3.e(str5);
                            e3.append(next2.e);
                            str5 = e3.toString();
                        }
                        String str6 = next2.b;
                        if (str6 != null && str6.length() > 0) {
                            str5 = ho8.a(ho8.b(str5, " ("), next2.b, c);
                        }
                        int length = str5.length() - 1;
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 <= length) {
                            boolean z4 = epx.g(str5.charAt(!z3 ? i3 : length), 32) <= 0;
                            if (z3) {
                                if (z4) {
                                    length--;
                                } else {
                                    String obj2 = str5.subSequence(i3, length + 1).toString();
                                    if (next2.d != null) {
                                        if (myc0.f(obj2)) {
                                            obj2 = obj2 + '\n';
                                        }
                                        StringBuilder e4 = fw3.e(obj2);
                                        e4.append(next2.d);
                                        obj2 = e4.toString();
                                    }
                                    arrayList.add(new x4m(R.string.profile_school, v1v.a('\n', str, obj2)));
                                }
                            } else if (z4) {
                                i3++;
                            } else {
                                z3 = true;
                            }
                            z3 = z3;
                        }
                        String obj22 = str5.subSequence(i3, length + 1).toString();
                        if (next2.d != null) {
                        }
                        arrayList.add(new x4m(R.string.profile_school, v1v.a('\n', str, obj22)));
                    }
                    c = ')';
                }
                break;
            case 26:
                ArrayList arrayList2 = ((ke3) obj).a;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    AppsCatalogSection appsCatalogSection = (AppsCatalogSection) arrayList2.get(i4);
                    SectionHeader e5 = appsCatalogSection.e();
                    if (e5 != null) {
                        if (appsCatalogSection instanceof AppsHorizontalListSection) {
                            AppsHorizontalListSection appsHorizontalListSection = (AppsHorizontalListSection) appsCatalogSection;
                            String str7 = appsHorizontalListSection.k;
                            if (epx.f(str7, "recent")) {
                                cVar = new x7a.b(appsHorizontalListSection.g, appsHorizontalListSection.h, str7, e5, 2);
                                arrayList3.add(cVar);
                            }
                        }
                        cVar = new x7a.b.c(appsCatalogSection.getId(), appsCatalogSection.r(), appsCatalogSection.f(), e5, 1);
                        arrayList3.add(cVar);
                    }
                    if (appsCatalogSection instanceof AppsHorizontalListSection) {
                        AppsHorizontalListSection appsHorizontalListSection2 = (AppsHorizontalListSection) appsCatalogSection;
                        iterable = Collections.singletonList(new x7a.d.c.C3980c(appsHorizontalListSection2.g, appsHorizontalListSection2.j, appsHorizontalListSection2.h));
                    } else if (appsCatalogSection instanceof AppsCategoriesSection) {
                        AppsCategoriesSection appsCategoriesSection = (AppsCategoriesSection) appsCatalogSection;
                        List<AppsCategory> list = appsCategoriesSection.j;
                        ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                        int i5 = 0;
                        for (Object obj3 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                e43.t();
                                throw null;
                            }
                            arrayList4.add(new x7a.d.b((AppsCategory) obj3, i5, appsCategoriesSection.h));
                            i5 = i6;
                        }
                        iterable = arrayList4;
                    } else {
                        iterable = EmptyList.b;
                    }
                    g5g.y(iterable, arrayList3);
                }
                return arrayList3;
            case 27:
                qgi0.d((tgi0) obj);
                return s3q0.a;
            case 28:
                qcy<Object>[] qcyVarArr = VkTopBarSearchQueryVh.s;
                qgi0.r((tgi0) obj, "vk_top_bar_search_avatar");
                return s3q0.a;
            default:
                return new s6w0((ViewGroup) obj);
        }
    }

    public /* synthetic */ quz(Object obj, int i) {
        this.b = i;
    }
}
