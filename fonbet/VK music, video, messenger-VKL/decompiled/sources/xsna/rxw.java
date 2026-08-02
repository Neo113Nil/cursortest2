package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.upload.api.router.PublishArguments;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.PrivacyDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.delegate.InitDelegateKt$initEventBusListener$1;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.ln50;
import xsna.sbe0;

/* compiled from: InitDelegate.kt */
/* loaded from: classes7.dex */
public final class rxw {
    public static final List<PrivacySetting.PrivacyRule> a;

    /* compiled from: InitDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PublishArguments.Edit.PreOpenedMenu.values().length];
            try {
                iArr[PublishArguments.Edit.PreOpenedMenu.PRIVACY_WATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.a;
        a = Collections.singletonList(PrivacyRules.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gce0 gce0Var, VideoFile videoFile, ContinuationImpl continuationImpl) {
        uxw uxwVar;
        int i;
        Object c;
        Throwable a2;
        if (continuationImpl instanceof uxw) {
            uxwVar = (uxw) continuationImpl;
            int i2 = uxwVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uxwVar.label = i2 - Integer.MIN_VALUE;
                Object obj = uxwVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uxwVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (videoFile.j2() == null) {
                        if (epx.f(j5g.a0(videoFile.getPrivacy()), PrivacyRules.f)) {
                            return DonutLevel.f;
                        }
                        return null;
                    }
                    ice0 ice0Var = gce0Var.e;
                    uxwVar.L$0 = null;
                    uxwVar.L$1 = null;
                    uxwVar.label = 1;
                    c = ice0Var.c(videoFile, uxwVar);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    c = ((Result) obj).d();
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                a2 = Result.a(c);
                if (a2 != null) {
                    bVar.a(a2);
                }
                return (DonutLevel) (c instanceof Result.Failure ? null : c);
            }
        }
        uxwVar = new uxw(continuationImpl);
        Object obj2 = uxwVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uxwVar.label;
        if (i != 0) {
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        a2 = Result.a(c);
        if (a2 != null) {
        }
        return (DonutLevel) (c instanceof Result.Failure ? null : c);
    }

    public static final ArrayList b(gce0 gce0Var, UserId userId) {
        VideoAlbum videoAlbum;
        Context context = gce0Var.c;
        ArrayList arrayList = new ArrayList();
        if (!fkq0.b(userId)) {
            arrayList.add(new VideoAlbumResultData(-1, context.getString(R.string.video_publish_album_uploaded)));
        }
        arrayList.add(new VideoAlbumResultData(-2, context.getString(R.string.video_publish_album_added)));
        PublishArguments publishArguments = gce0Var.d;
        PublishArguments.Upload upload = publishArguments instanceof PublishArguments.Upload ? (PublishArguments.Upload) publishArguments : null;
        if (upload != null && (videoAlbum = upload.d) != null) {
            int i = videoAlbum.b;
            String str = videoAlbum.d;
            if (str == null) {
                str = "";
            }
            arrayList.add(new VideoAlbumResultData(i, str));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x016a, code lost:
    
        if (xsna.rsr.o(r1, r4, r2) == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x025e, code lost:
    
        if (r1 != r3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ac  */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(gce0 gce0Var, PublishState.Edit edit, ContinuationImpl continuationImpl) {
        ayw aywVar;
        int i;
        PublishState.Edit edit2;
        String str;
        Object d;
        gce0 gce0Var2;
        PublishState.Edit edit3;
        Throwable a2;
        VideoFile videoFile;
        gce0 gce0Var3;
        int i2;
        VideoInfoDo videoInfoDo;
        Date date;
        PublishState.Edit edit4;
        DonutLevel donutLevel;
        List<PrivacySetting.PrivacyRule> privacy;
        List<PrivacySetting.PrivacyRule> list;
        Object i3;
        gce0 gce0Var4;
        List<PrivacySetting.PrivacyRule> list2;
        DonutLevel donutLevel2;
        Object obj;
        PublishState.Edit edit5;
        Date date2;
        VideoFile videoFile2;
        PrivacyDo privacyDo;
        VideoInfoDo videoInfoDo2;
        Throwable a3;
        PrivacyDo privacyDo2;
        Object f;
        PrivacyDo privacyDo3;
        Object obj2;
        gce0 gce0Var5;
        final PrivacyDo privacyDo4;
        final EmptyList emptyList;
        OrdAdInfo p1;
        final OrdData ordData;
        PublishArguments.Edit edit6;
        PublishArguments.Edit.PreOpenedMenu preOpenedMenu;
        String str2;
        Throwable a4;
        gce0 gce0Var6 = gce0Var;
        if (continuationImpl instanceof ayw) {
            aywVar = (ayw) continuationImpl;
            int i4 = aywVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aywVar.label = i4 - Integer.MIN_VALUE;
                Object obj3 = aywVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aywVar.label;
                List<PrivacySetting.PrivacyRule> list3 = a;
                switch (i) {
                    case 0:
                        kotlin.a.a(obj3);
                        if (!((PublishState) gce0Var6.b.getCurrentState()).Q) {
                            gce0Var6.i.getClass();
                            b8f0 f2 = rsr.f(com.vk.core.utils.newtork.b.f);
                            byw bywVar = new byw(2, null);
                            aywVar.L$0 = gce0Var6;
                            edit2 = edit;
                            aywVar.L$1 = edit2;
                            aywVar.label = 1;
                            break;
                        } else {
                            return s3q0.a;
                        }
                    case 1:
                        PublishState.Edit edit7 = (PublishState.Edit) aywVar.L$1;
                        gce0 gce0Var7 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        edit2 = edit7;
                        gce0Var6 = gce0Var7;
                        PublishArguments publishArguments = gce0Var6.d;
                        PublishArguments.Edit edit8 = publishArguments instanceof PublishArguments.Edit ? (PublishArguments.Edit) publishArguments : null;
                        if (edit8 == null || (str = edit8.b) == null) {
                            str = "";
                        }
                        ice0 ice0Var = gce0Var6.e;
                        aywVar.L$0 = gce0Var6;
                        aywVar.L$1 = edit2;
                        aywVar.L$2 = null;
                        aywVar.label = 2;
                        d = ice0Var.d(str, aywVar);
                        if (d != coroutineSingletons) {
                            gce0Var2 = gce0Var6;
                            edit3 = edit2;
                            a2 = Result.a(d);
                            if (a2 != null) {
                                o3r0.c(gce0Var2);
                                gce0Var2.c(sbe0.a.a);
                                com.vk.metrics.eventtracking.b.a.a(a2);
                            }
                            if (Result.a(d) == null) {
                                return s3q0.a;
                            }
                            VideoFile videoFile3 = (VideoFile) d;
                            PublishState.Edit edit9 = new PublishState.Edit(videoFile3, edit3.c);
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            VideoInfoDo videoInfoDo3 = new VideoInfoDo(timeUnit.toMillis(videoFile3.getDuration()), false, videoFile3.getHeight(), videoFile3.getWidth(), null, null, 32, null);
                            int i5 = (edit9.Z1() || (gce0Var2.h.j0() && videoFile3.k1() > 0)) ? 1 : 0;
                            Date date3 = (i5 == 0 || videoFile3.k1() <= 0) ? null : new Date(timeUnit.toMillis(videoFile3.k1()));
                            aywVar.L$0 = gce0Var2;
                            aywVar.L$1 = null;
                            aywVar.L$2 = null;
                            aywVar.L$3 = videoFile3;
                            aywVar.L$4 = edit9;
                            aywVar.L$5 = videoInfoDo3;
                            aywVar.L$6 = date3;
                            aywVar.I$0 = i5;
                            aywVar.label = 3;
                            Object a5 = a(gce0Var2, videoFile3, aywVar);
                            if (a5 != coroutineSingletons) {
                                videoFile = videoFile3;
                                gce0Var3 = gce0Var2;
                                obj3 = a5;
                                i2 = i5;
                                videoInfoDo = videoInfoDo3;
                                date = date3;
                                edit4 = edit9;
                                donutLevel = (DonutLevel) obj3;
                                privacy = videoFile.getPrivacy();
                                if (privacy.isEmpty()) {
                                    privacy = null;
                                }
                                list = privacy != null ? list3 : privacy;
                                ice0 ice0Var2 = gce0Var3.e;
                                aywVar.L$0 = gce0Var3;
                                aywVar.L$1 = null;
                                aywVar.L$2 = null;
                                aywVar.L$3 = videoFile;
                                aywVar.L$4 = edit4;
                                aywVar.L$5 = videoInfoDo;
                                aywVar.L$6 = date;
                                aywVar.L$7 = donutLevel;
                                aywVar.L$8 = null;
                                aywVar.L$9 = list;
                                aywVar.I$0 = i2;
                                aywVar.label = 4;
                                i3 = ice0Var2.i(list, aywVar);
                                break;
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        edit3 = (PublishState.Edit) aywVar.L$1;
                        gce0Var2 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        d = ((Result) obj3).d();
                        a2 = Result.a(d);
                        if (a2 != null) {
                        }
                        if (Result.a(d) == null) {
                        }
                        break;
                    case 3:
                        i2 = aywVar.I$0;
                        Date date4 = (Date) aywVar.L$6;
                        VideoInfoDo videoInfoDo4 = (VideoInfoDo) aywVar.L$5;
                        PublishState.Edit edit10 = (PublishState.Edit) aywVar.L$4;
                        VideoFile videoFile4 = (VideoFile) aywVar.L$3;
                        gce0 gce0Var8 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        videoFile = videoFile4;
                        gce0Var3 = gce0Var8;
                        videoInfoDo = videoInfoDo4;
                        edit4 = edit10;
                        date = date4;
                        donutLevel = (DonutLevel) obj3;
                        privacy = videoFile.getPrivacy();
                        if (privacy.isEmpty()) {
                        }
                        if (privacy != null) {
                        }
                        ice0 ice0Var22 = gce0Var3.e;
                        aywVar.L$0 = gce0Var3;
                        aywVar.L$1 = null;
                        aywVar.L$2 = null;
                        aywVar.L$3 = videoFile;
                        aywVar.L$4 = edit4;
                        aywVar.L$5 = videoInfoDo;
                        aywVar.L$6 = date;
                        aywVar.L$7 = donutLevel;
                        aywVar.L$8 = null;
                        aywVar.L$9 = list;
                        aywVar.I$0 = i2;
                        aywVar.label = 4;
                        i3 = ice0Var22.i(list, aywVar);
                        break;
                    case 4:
                        i2 = aywVar.I$0;
                        list = (List) aywVar.L$9;
                        donutLevel = (DonutLevel) aywVar.L$7;
                        date = (Date) aywVar.L$6;
                        videoInfoDo = (VideoInfoDo) aywVar.L$5;
                        edit4 = (PublishState.Edit) aywVar.L$4;
                        videoFile = (VideoFile) aywVar.L$3;
                        gce0Var3 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        i3 = ((Result) obj3).d();
                        VideoInfoDo videoInfoDo5 = videoInfoDo;
                        List<PrivacySetting.PrivacyRule> list4 = list;
                        Date date5 = date;
                        gce0 gce0Var9 = gce0Var3;
                        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                        Throwable a6 = Result.a(i3);
                        if (a6 != null) {
                            bVar.a(a6);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        if (i3 instanceof Result.Failure) {
                            i3 = "";
                        }
                        PublishState.Edit edit11 = edit4;
                        VideoFile videoFile5 = videoFile;
                        PrivacyDo privacyDo5 = new PrivacyDo(list4, null, ucd0.b((String) i3, gce0Var9.c, donutLevel), 2, null);
                        List<PrivacySetting.PrivacyRule> i6 = videoFile5.i6();
                        if (i6.isEmpty()) {
                            i6 = null;
                        }
                        if (i6 != null) {
                            list3 = i6;
                        }
                        ice0 ice0Var3 = gce0Var9.e;
                        aywVar.L$0 = gce0Var9;
                        aywVar.L$1 = null;
                        aywVar.L$2 = null;
                        aywVar.L$3 = videoFile5;
                        aywVar.L$4 = edit11;
                        aywVar.L$5 = videoInfoDo5;
                        aywVar.L$6 = date5;
                        aywVar.L$7 = donutLevel;
                        aywVar.L$8 = null;
                        aywVar.L$9 = privacyDo5;
                        aywVar.L$10 = null;
                        aywVar.L$11 = list3;
                        aywVar.I$0 = i2;
                        aywVar.label = 5;
                        Object i7 = ice0Var3.i(list3, aywVar);
                        if (i7 != coroutineSingletons) {
                            gce0Var4 = gce0Var9;
                            list2 = list3;
                            donutLevel2 = donutLevel;
                            obj = i7;
                            edit5 = edit11;
                            date2 = date5;
                            videoFile2 = videoFile5;
                            privacyDo = privacyDo5;
                            videoInfoDo2 = videoInfoDo5;
                            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                            a3 = Result.a(obj);
                            if (a3 != null) {
                                bVar2.a(a3);
                                s3q0 s3q0Var2 = s3q0.a;
                            }
                            if (obj instanceof Result.Failure) {
                                obj = "";
                            }
                            privacyDo2 = new PrivacyDo(list2, null, (String) obj, 2, null);
                            if (edit5.Z1() && !gce0Var4.h.i1()) {
                                privacyDo4 = privacyDo2;
                                emptyList = EmptyList.b;
                                final PrivacyDo privacyDo6 = privacyDo;
                                final DonutLevel donutLevel3 = donutLevel2;
                                final Date date6 = date2;
                                final VideoInfoDo videoInfoDo6 = videoInfoDo2;
                                final PublishState.Edit edit12 = edit5;
                                final VideoFile videoFile6 = videoFile2;
                                p1 = videoFile6.p1();
                                if (p1 != null) {
                                }
                                if (i2 != 0) {
                                }
                                rdi.y(gce0Var4, new izs() { // from class: xsna.pxw
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj4) {
                                        PublishState publishState = (PublishState) obj4;
                                        VideoInfoDo videoInfoDo7 = videoInfoDo6;
                                        VideoFile videoFile7 = videoFile6;
                                        CoverDo a7 = k2k.a(publishState, videoInfoDo7, videoFile7);
                                        String title = videoFile7.getTitle();
                                        String j1 = videoFile7.j1();
                                        if (j1 == null) {
                                            j1 = "";
                                        }
                                        String str3 = j1;
                                        UserId I0 = videoFile7.I0();
                                        List<VideoFile> b7 = videoFile7.b7();
                                        List<VideoFile> b72 = videoFile7.b7();
                                        PublishState.Edit edit13 = PublishState.Edit.this;
                                        boolean z = r4;
                                        Date date7 = date6;
                                        PrivacyDo privacyDo7 = privacyDo6;
                                        PrivacyDo privacyDo8 = privacyDo4;
                                        DonutLevel donutLevel4 = donutLevel3;
                                        List list5 = emptyList;
                                        OrdData ordData2 = ordData;
                                        return PublishState.a(publishState, edit13, videoInfoDo7, a7, title, false, str3, I0, null, null, null, false, z, date7, null, privacyDo7, privacyDo7, privacyDo8, privacyDo8, donutLevel4, donutLevel4, b7, b72, false, false, false, list5, list5, ordData2, ordData2, false, null, null, false, false, null, false, false, null, false, false, false, false, -507500656, 1535);
                                    }
                                });
                                g3q.a(gce0Var4, new zxw(gce0Var4, "video:uploader_advanced_edit", null));
                                PublishArguments publishArguments2 = gce0Var4.d;
                                if (publishArguments2 instanceof PublishArguments.Edit) {
                                }
                                if (edit6 != null) {
                                    if (a.$EnumSwitchMapping$0[preOpenedMenu.ordinal()] == 1) {
                                    }
                                }
                                return s3q0.a;
                            }
                            cn1 cn1Var = gce0Var4.f;
                            UserId I0 = videoFile2.I0();
                            aywVar.L$0 = gce0Var4;
                            aywVar.L$1 = null;
                            aywVar.L$2 = null;
                            aywVar.L$3 = videoFile2;
                            aywVar.L$4 = edit5;
                            aywVar.L$5 = videoInfoDo2;
                            aywVar.L$6 = date2;
                            aywVar.L$7 = donutLevel2;
                            aywVar.L$8 = null;
                            aywVar.L$9 = privacyDo;
                            aywVar.L$10 = null;
                            aywVar.L$11 = privacyDo2;
                            aywVar.I$0 = i2;
                            aywVar.label = 6;
                            f = cn1Var.f(videoFile2, I0, aywVar);
                            if (f != coroutineSingletons) {
                                privacyDo3 = privacyDo2;
                                obj2 = f;
                                gce0Var5 = gce0Var4;
                                com.vk.metrics.eventtracking.b bVar3 = com.vk.metrics.eventtracking.b.a;
                                a4 = Result.a(obj2);
                                if (a4 != null) {
                                    bVar3.a(a4);
                                }
                                EmptyList emptyList2 = EmptyList.b;
                                if (obj2 instanceof Result.Failure) {
                                    obj2 = emptyList2;
                                }
                                emptyList = (List) obj2;
                                gce0Var4 = gce0Var5;
                                privacyDo4 = privacyDo3;
                                final PrivacyDo privacyDo62 = privacyDo;
                                final DonutLevel donutLevel32 = donutLevel2;
                                final Date date62 = date2;
                                final VideoInfoDo videoInfoDo62 = videoInfoDo2;
                                final PublishState.Edit edit122 = edit5;
                                final VideoFile videoFile62 = videoFile2;
                                p1 = videoFile62.p1();
                                if (p1 != null) {
                                    OrdAdvertiser ordAdvertiser = (OrdAdvertiser) j5g.a0(p1.c);
                                    if (ordAdvertiser == null || (str2 = ordAdvertiser.c) == null) {
                                        str2 = "";
                                    }
                                    ordData = new OrdData(true, "", str2);
                                } else {
                                    ordData = null;
                                }
                                final boolean z = i2 != 0;
                                rdi.y(gce0Var4, new izs() { // from class: xsna.pxw
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj4) {
                                        PublishState publishState = (PublishState) obj4;
                                        VideoInfoDo videoInfoDo7 = videoInfoDo62;
                                        VideoFile videoFile7 = videoFile62;
                                        CoverDo a7 = k2k.a(publishState, videoInfoDo7, videoFile7);
                                        String title = videoFile7.getTitle();
                                        String j1 = videoFile7.j1();
                                        if (j1 == null) {
                                            j1 = "";
                                        }
                                        String str3 = j1;
                                        UserId I02 = videoFile7.I0();
                                        List<VideoFile> b7 = videoFile7.b7();
                                        List<VideoFile> b72 = videoFile7.b7();
                                        PublishState.Edit edit13 = PublishState.Edit.this;
                                        boolean z2 = z;
                                        Date date7 = date62;
                                        PrivacyDo privacyDo7 = privacyDo62;
                                        PrivacyDo privacyDo8 = privacyDo4;
                                        DonutLevel donutLevel4 = donutLevel32;
                                        List list5 = emptyList;
                                        OrdData ordData2 = ordData;
                                        return PublishState.a(publishState, edit13, videoInfoDo7, a7, title, false, str3, I02, null, null, null, false, z2, date7, null, privacyDo7, privacyDo7, privacyDo8, privacyDo8, donutLevel4, donutLevel4, b7, b72, false, false, false, list5, list5, ordData2, ordData2, false, null, null, false, false, null, false, false, null, false, false, false, false, -507500656, 1535);
                                    }
                                });
                                g3q.a(gce0Var4, new zxw(gce0Var4, "video:uploader_advanced_edit", null));
                                PublishArguments publishArguments22 = gce0Var4.d;
                                edit6 = publishArguments22 instanceof PublishArguments.Edit ? (PublishArguments.Edit) publishArguments22 : null;
                                if (edit6 != null && (preOpenedMenu = edit6.c) != null) {
                                    if (a.$EnumSwitchMapping$0[preOpenedMenu.ordinal()] == 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (o3r0.a(gce0Var4)) {
                                        d3q.a(gce0Var4, see0.a, ln50.a.b, new ba40(gce0Var4, 15), new scd0(gce0Var4, null));
                                    }
                                }
                                return s3q0.a;
                            }
                        }
                        return coroutineSingletons;
                    case 5:
                        i2 = aywVar.I$0;
                        List<PrivacySetting.PrivacyRule> list5 = (List) aywVar.L$11;
                        PrivacyDo privacyDo7 = (PrivacyDo) aywVar.L$9;
                        DonutLevel donutLevel4 = (DonutLevel) aywVar.L$7;
                        Date date7 = (Date) aywVar.L$6;
                        VideoInfoDo videoInfoDo7 = (VideoInfoDo) aywVar.L$5;
                        PublishState.Edit edit13 = (PublishState.Edit) aywVar.L$4;
                        VideoFile videoFile7 = (VideoFile) aywVar.L$3;
                        gce0Var4 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        obj = ((Result) obj3).d();
                        list2 = list5;
                        privacyDo = privacyDo7;
                        donutLevel2 = donutLevel4;
                        date2 = date7;
                        videoInfoDo2 = videoInfoDo7;
                        edit5 = edit13;
                        videoFile2 = videoFile7;
                        com.vk.metrics.eventtracking.b bVar22 = com.vk.metrics.eventtracking.b.a;
                        a3 = Result.a(obj);
                        if (a3 != null) {
                        }
                        if (obj instanceof Result.Failure) {
                        }
                        privacyDo2 = new PrivacyDo(list2, null, (String) obj, 2, null);
                        if (edit5.Z1()) {
                            break;
                        }
                        cn1 cn1Var2 = gce0Var4.f;
                        UserId I02 = videoFile2.I0();
                        aywVar.L$0 = gce0Var4;
                        aywVar.L$1 = null;
                        aywVar.L$2 = null;
                        aywVar.L$3 = videoFile2;
                        aywVar.L$4 = edit5;
                        aywVar.L$5 = videoInfoDo2;
                        aywVar.L$6 = date2;
                        aywVar.L$7 = donutLevel2;
                        aywVar.L$8 = null;
                        aywVar.L$9 = privacyDo;
                        aywVar.L$10 = null;
                        aywVar.L$11 = privacyDo2;
                        aywVar.I$0 = i2;
                        aywVar.label = 6;
                        f = cn1Var2.f(videoFile2, I02, aywVar);
                        if (f != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 6:
                        i2 = aywVar.I$0;
                        privacyDo3 = (PrivacyDo) aywVar.L$11;
                        privacyDo = (PrivacyDo) aywVar.L$9;
                        donutLevel2 = (DonutLevel) aywVar.L$7;
                        date2 = (Date) aywVar.L$6;
                        videoInfoDo2 = (VideoInfoDo) aywVar.L$5;
                        edit5 = (PublishState.Edit) aywVar.L$4;
                        videoFile2 = (VideoFile) aywVar.L$3;
                        gce0Var5 = (gce0) aywVar.L$0;
                        kotlin.a.a(obj3);
                        obj2 = ((Result) obj3).d();
                        com.vk.metrics.eventtracking.b bVar32 = com.vk.metrics.eventtracking.b.a;
                        a4 = Result.a(obj2);
                        if (a4 != null) {
                        }
                        EmptyList emptyList22 = EmptyList.b;
                        if (obj2 instanceof Result.Failure) {
                        }
                        emptyList = (List) obj2;
                        gce0Var4 = gce0Var5;
                        privacyDo4 = privacyDo3;
                        final PrivacyDo privacyDo622 = privacyDo;
                        final DonutLevel donutLevel322 = donutLevel2;
                        final Date date622 = date2;
                        final VideoInfoDo videoInfoDo622 = videoInfoDo2;
                        final PublishState.Edit edit1222 = edit5;
                        final VideoFile videoFile622 = videoFile2;
                        p1 = videoFile622.p1();
                        if (p1 != null) {
                        }
                        if (i2 != 0) {
                        }
                        rdi.y(gce0Var4, new izs() { // from class: xsna.pxw
                            @Override // xsna.izs
                            public final Object invoke(Object obj4) {
                                PublishState publishState = (PublishState) obj4;
                                VideoInfoDo videoInfoDo72 = videoInfoDo622;
                                VideoFile videoFile72 = videoFile622;
                                CoverDo a7 = k2k.a(publishState, videoInfoDo72, videoFile72);
                                String title = videoFile72.getTitle();
                                String j1 = videoFile72.j1();
                                if (j1 == null) {
                                    j1 = "";
                                }
                                String str3 = j1;
                                UserId I022 = videoFile72.I0();
                                List<VideoFile> b7 = videoFile72.b7();
                                List<VideoFile> b72 = videoFile72.b7();
                                PublishState.Edit edit132 = PublishState.Edit.this;
                                boolean z2 = z;
                                Date date72 = date622;
                                PrivacyDo privacyDo72 = privacyDo622;
                                PrivacyDo privacyDo8 = privacyDo4;
                                DonutLevel donutLevel42 = donutLevel322;
                                List list52 = emptyList;
                                OrdData ordData2 = ordData;
                                return PublishState.a(publishState, edit132, videoInfoDo72, a7, title, false, str3, I022, null, null, null, false, z2, date72, null, privacyDo72, privacyDo72, privacyDo8, privacyDo8, donutLevel42, donutLevel42, b7, b72, false, false, false, list52, list52, ordData2, ordData2, false, null, null, false, false, null, false, false, null, false, false, false, false, -507500656, 1535);
                            }
                        });
                        g3q.a(gce0Var4, new zxw(gce0Var4, "video:uploader_advanced_edit", null));
                        PublishArguments publishArguments222 = gce0Var4.d;
                        if (publishArguments222 instanceof PublishArguments.Edit) {
                        }
                        if (edit6 != null) {
                        }
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        aywVar = new ayw(continuationImpl);
        Object obj32 = aywVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aywVar.label;
        List<PrivacySetting.PrivacyRule> list32 = a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x011a, code lost:
    
        if (r1 != r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0108, code lost:
    
        if (xsna.rsr.o(r1, r4, r2) == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(gce0 gce0Var, PublishState.Upload upload, ContinuationImpl continuationImpl) {
        cyw cywVar;
        int i;
        PublishState.Upload upload2;
        Object k;
        VideoAuthorDo videoAuthorDo;
        gce0 gce0Var2;
        VideoInfoDo videoInfoDo;
        int i2;
        Object obj;
        VideoAuthorDo videoAuthorDo2;
        Throwable a2;
        PrivacyDo privacyDo;
        List b;
        Object a3;
        PrivacyDo privacyDo2;
        VideoInfoDo videoInfoDo2;
        Object l;
        final List list;
        final VideoAuthorDo videoAuthorDo3;
        final gce0 gce0Var3;
        final PrivacyDo privacyDo3;
        Throwable a4;
        gce0 gce0Var4;
        gce0 gce0Var5 = gce0Var;
        if (continuationImpl instanceof cyw) {
            cywVar = (cyw) continuationImpl;
            int i3 = cywVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cywVar.label = i3 - Integer.MIN_VALUE;
                Object obj2 = cywVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cywVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    if (((PublishState) gce0Var5.b.getCurrentState()).Q) {
                        k2k.c(gce0Var5);
                        return s3q0.a;
                    }
                    gce0Var5.i.getClass();
                    b8f0 f = rsr.f(com.vk.core.utils.newtork.b.f);
                    dyw dywVar = new dyw(2, null);
                    cywVar.L$0 = gce0Var5;
                    upload2 = upload;
                    cywVar.L$1 = upload2;
                    cywVar.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            gce0Var5 = (gce0) cywVar.L$0;
                            kotlin.a.a(obj2);
                            k = ((Result) obj2).d();
                            Throwable a5 = Result.a(k);
                            if (a5 != null) {
                                o3r0.c(gce0Var5);
                                gce0Var5.c(sbe0.a.a);
                                com.vk.metrics.eventtracking.b.a.a(a5);
                            }
                            if (Result.a(k) != null) {
                                return s3q0.a;
                            }
                            VideoInfoDo videoInfoDo3 = (VideoInfoDo) k;
                            PublishArguments publishArguments = gce0Var5.d;
                            b25 b25Var = gce0Var5.j;
                            PublishArguments.Upload upload3 = publishArguments instanceof PublishArguments.Upload ? (PublishArguments.Upload) publishArguments : null;
                            int i4 = (upload3 != null ? upload3.d : null) == null ? 1 : 0;
                            if (i4 != 0) {
                                cn o = b25Var.o();
                                videoAuthorDo = new VideoAuthorDo(o.a, b25Var.d(), o.c, o.b);
                            } else {
                                videoAuthorDo = null;
                            }
                            ice0 ice0Var = gce0Var5.e;
                            cywVar.L$0 = gce0Var5;
                            cywVar.L$1 = null;
                            cywVar.L$2 = videoInfoDo3;
                            cywVar.L$3 = videoAuthorDo;
                            cywVar.I$0 = i4;
                            cywVar.label = 3;
                            Object i5 = ice0Var.i(a, cywVar);
                            if (i5 != coroutineSingletons) {
                                gce0Var2 = gce0Var5;
                                videoInfoDo = videoInfoDo3;
                                i2 = i4;
                                obj = i5;
                                videoAuthorDo2 = videoAuthorDo;
                                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                                a2 = Result.a(obj);
                                if (a2 != null) {
                                }
                                if (obj instanceof Result.Failure) {
                                }
                                privacyDo = new PrivacyDo(a, null, (String) obj, 2, null);
                                b = b(gce0Var2, ((PublishState) gce0Var2.b.getCurrentState()).h);
                                if (i2 != 0) {
                                }
                                videoInfoDo2 = videoInfoDo;
                                ice0 ice0Var2 = gce0Var2.e;
                                cywVar.L$0 = gce0Var2;
                                cywVar.L$1 = null;
                                cywVar.L$2 = videoInfoDo2;
                                cywVar.L$3 = videoAuthorDo2;
                                cywVar.L$4 = null;
                                cywVar.L$5 = privacyDo;
                                cywVar.L$6 = b;
                                cywVar.I$0 = i2;
                                cywVar.label = 5;
                                l = ice0Var2.l(cywVar);
                                if (l != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i == 3) {
                            i2 = cywVar.I$0;
                            VideoAuthorDo videoAuthorDo4 = (VideoAuthorDo) cywVar.L$3;
                            VideoInfoDo videoInfoDo4 = (VideoInfoDo) cywVar.L$2;
                            gce0 gce0Var6 = (gce0) cywVar.L$0;
                            kotlin.a.a(obj2);
                            obj = ((Result) obj2).d();
                            gce0Var2 = gce0Var6;
                            videoInfoDo = videoInfoDo4;
                            videoAuthorDo2 = videoAuthorDo4;
                            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                            a2 = Result.a(obj);
                            if (a2 != null) {
                                bVar2.a(a2);
                            }
                            if (obj instanceof Result.Failure) {
                                obj = "";
                            }
                            privacyDo = new PrivacyDo(a, null, (String) obj, 2, null);
                            b = b(gce0Var2, ((PublishState) gce0Var2.b.getCurrentState()).h);
                            if (i2 != 0) {
                                cywVar.L$0 = gce0Var2;
                                cywVar.L$1 = null;
                                cywVar.L$2 = videoInfoDo;
                                cywVar.L$3 = videoAuthorDo2;
                                cywVar.L$4 = null;
                                cywVar.L$5 = privacyDo;
                                cywVar.L$6 = b;
                                cywVar.I$0 = i2;
                                cywVar.label = 4;
                                a3 = a85.a(gce0Var2, videoAuthorDo2, cywVar);
                                if (a3 != coroutineSingletons) {
                                    privacyDo2 = privacyDo;
                                    if (Result.a(a3) == null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            videoInfoDo2 = videoInfoDo;
                            ice0 ice0Var22 = gce0Var2.e;
                            cywVar.L$0 = gce0Var2;
                            cywVar.L$1 = null;
                            cywVar.L$2 = videoInfoDo2;
                            cywVar.L$3 = videoAuthorDo2;
                            cywVar.L$4 = null;
                            cywVar.L$5 = privacyDo;
                            cywVar.L$6 = b;
                            cywVar.I$0 = i2;
                            cywVar.label = 5;
                            l = ice0Var22.l(cywVar);
                            if (l != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i2 = cywVar.I$0;
                            List list2 = (List) cywVar.L$6;
                            PrivacyDo privacyDo4 = (PrivacyDo) cywVar.L$5;
                            VideoAuthorDo videoAuthorDo5 = (VideoAuthorDo) cywVar.L$3;
                            videoInfoDo2 = (VideoInfoDo) cywVar.L$2;
                            gce0 gce0Var7 = (gce0) cywVar.L$0;
                            kotlin.a.a(obj2);
                            l = ((Result) obj2).d();
                            gce0Var3 = gce0Var7;
                            list = list2;
                            privacyDo3 = privacyDo4;
                            videoAuthorDo3 = videoAuthorDo5;
                            final VideoInfoDo videoInfoDo5 = videoInfoDo2;
                            com.vk.metrics.eventtracking.b bVar3 = com.vk.metrics.eventtracking.b.a;
                            a4 = Result.a(l);
                            if (a4 != null) {
                                bVar3.a(a4);
                            }
                            Boolean bool = Boolean.TRUE;
                            if (l instanceof Result.Failure) {
                                l = bool;
                            }
                            final boolean booleanValue = ((Boolean) l).booleanValue();
                            final boolean z = i2 == 0;
                            gce0Var4 = gce0Var3;
                            rdi.y(gce0Var4, new izs() { // from class: xsna.qxw
                                @Override // xsna.izs
                                public final Object invoke(Object obj3) {
                                    PublishState publishState = (PublishState) obj3;
                                    CoverDo b2 = k2k.b(publishState);
                                    boolean j0 = gce0Var3.h.j0();
                                    VideoInfoDo videoInfoDo6 = VideoInfoDo.this;
                                    VideoAuthorDo videoAuthorDo6 = videoAuthorDo3;
                                    boolean z2 = z;
                                    PrivacyDo privacyDo5 = privacyDo3;
                                    boolean z3 = booleanValue;
                                    List list3 = list;
                                    return PublishState.a(publishState, null, videoInfoDo6, b2, null, false, null, null, null, videoAuthorDo6, null, z2, j0, null, null, privacyDo5, privacyDo5, privacyDo5, privacyDo5, null, null, null, null, z3, false, false, list3, list3, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -105106695, 1535);
                                }
                            });
                            k2k.c(gce0Var4);
                            if (gce0Var4.h.l1()) {
                                g3q.a(gce0Var4, new InitDelegateKt$initEventBusListener$1(gce0Var4, null));
                            }
                            g3q.a(gce0Var4, new zxw(gce0Var4, "video:uploader_advanced_video_publish", null));
                            return s3q0.a;
                        }
                        i2 = cywVar.I$0;
                        b = (List) cywVar.L$6;
                        privacyDo2 = (PrivacyDo) cywVar.L$5;
                        videoAuthorDo2 = (VideoAuthorDo) cywVar.L$3;
                        videoInfoDo = (VideoInfoDo) cywVar.L$2;
                        gce0Var2 = (gce0) cywVar.L$0;
                        kotlin.a.a(obj2);
                        a3 = ((Result) obj2).d();
                        if (Result.a(a3) == null) {
                            o3r0.c(gce0Var2);
                            gce0Var2.c(sbe0.a.a);
                            return s3q0.a;
                        }
                        privacyDo = privacyDo2;
                        videoInfoDo2 = videoInfoDo;
                        ice0 ice0Var222 = gce0Var2.e;
                        cywVar.L$0 = gce0Var2;
                        cywVar.L$1 = null;
                        cywVar.L$2 = videoInfoDo2;
                        cywVar.L$3 = videoAuthorDo2;
                        cywVar.L$4 = null;
                        cywVar.L$5 = privacyDo;
                        cywVar.L$6 = b;
                        cywVar.I$0 = i2;
                        cywVar.label = 5;
                        l = ice0Var222.l(cywVar);
                        if (l != coroutineSingletons) {
                            list = b;
                            videoAuthorDo3 = videoAuthorDo2;
                            gce0Var3 = gce0Var2;
                            privacyDo3 = privacyDo;
                            final VideoInfoDo videoInfoDo52 = videoInfoDo2;
                            com.vk.metrics.eventtracking.b bVar32 = com.vk.metrics.eventtracking.b.a;
                            a4 = Result.a(l);
                            if (a4 != null) {
                            }
                            Boolean bool2 = Boolean.TRUE;
                            if (l instanceof Result.Failure) {
                            }
                            final boolean booleanValue2 = ((Boolean) l).booleanValue();
                            if (i2 == 0) {
                            }
                            gce0Var4 = gce0Var3;
                            rdi.y(gce0Var4, new izs() { // from class: xsna.qxw
                                @Override // xsna.izs
                                public final Object invoke(Object obj3) {
                                    PublishState publishState = (PublishState) obj3;
                                    CoverDo b2 = k2k.b(publishState);
                                    boolean j0 = gce0Var3.h.j0();
                                    VideoInfoDo videoInfoDo6 = VideoInfoDo.this;
                                    VideoAuthorDo videoAuthorDo6 = videoAuthorDo3;
                                    boolean z2 = z;
                                    PrivacyDo privacyDo5 = privacyDo3;
                                    boolean z3 = booleanValue2;
                                    List list3 = list;
                                    return PublishState.a(publishState, null, videoInfoDo6, b2, null, false, null, null, null, videoAuthorDo6, null, z2, j0, null, null, privacyDo5, privacyDo5, privacyDo5, privacyDo5, null, null, null, null, z3, false, false, list3, list3, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -105106695, 1535);
                                }
                            });
                            k2k.c(gce0Var4);
                            if (gce0Var4.h.l1()) {
                            }
                            g3q.a(gce0Var4, new zxw(gce0Var4, "video:uploader_advanced_video_publish", null));
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    }
                    PublishState.Upload upload4 = (PublishState.Upload) cywVar.L$1;
                    gce0 gce0Var8 = (gce0) cywVar.L$0;
                    kotlin.a.a(obj2);
                    upload2 = upload4;
                    gce0Var5 = gce0Var8;
                }
                ice0 ice0Var3 = gce0Var5.e;
                Uri uri = upload2.b;
                cywVar.L$0 = gce0Var5;
                cywVar.L$1 = null;
                cywVar.label = 2;
                k = ice0Var3.k(uri, cywVar);
            }
        }
        cywVar = new cyw(continuationImpl);
        Object obj22 = cywVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cywVar.label;
        if (i != 0) {
        }
        ice0 ice0Var32 = gce0Var5.e;
        Uri uri2 = upload2.b;
        cywVar.L$0 = gce0Var5;
        cywVar.L$1 = null;
        cywVar.label = 2;
        k = ice0Var32.k(uri2, cywVar);
    }
}
