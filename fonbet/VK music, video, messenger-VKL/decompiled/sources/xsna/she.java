package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.web.ClipBox;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.superapp.api.dto.clips.WebClipBox;
import com.vk.superapp.base.js.bridge.data.OnboardingStep;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import xsna.n3q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class she implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ she(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ClipVideoFile clipVideoFile;
        MusicTrack musicTrack;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((uhe) obj).e.P0() != null);
            case 1:
                ((n3q.a) obj).b.set(true);
                return s3q0.a;
            case 2:
                return Boolean.valueOf(rhs.b().d((Uri) obj));
            case 3:
                return (Bitmap) ((OnboardingStep) obj).i.getValue();
            case 4:
                p9w p9wVar = ((VoipCallServiceBannerHandler) obj).a.r().f;
                if (!p9wVar.c.f()) {
                    return VoipCallServiceBannerHandler.Restrict.GLOBAL_SYSTEM;
                }
                x870 x870Var = x870.a;
                Context context = e43.a;
                x870.a(context != null ? context : null);
                ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.CALLS_INCOMING;
                String c = p9wVar.c(type);
                zqn0.a.c();
                return !u370.e((NotificationManager) zqn0.e.getValue(), c) ? VoipCallServiceBannerHandler.Restrict.CHANNEL_GROUP_SYSTEM : !p9wVar.h(type) ? VoipCallServiceBannerHandler.Restrict.CHANNEL_SYSTEM : VoipCallServiceBannerHandler.Restrict.NOT_RESTRICT;
            default:
                WebClipBox webClipBox = (WebClipBox) obj;
                Object obj2 = ClipBox.d;
                qte qteVar = new qte(11);
                String str = webClipBox.b;
                Integer num = webClipBox.e;
                String str2 = webClipBox.c;
                String str3 = webClipBox.h;
                String str4 = webClipBox.d;
                ClipBox.a aVar = new ClipBox.a();
                aVar.a = str;
                aVar.b = str4;
                aVar.c = null;
                aVar.d = 0;
                aVar.e = null;
                aVar.f = true;
                aVar.g = null;
                String str5 = webClipBox.g;
                if (str5 != null) {
                    aVar.f = ((Boolean) ClipBox.b.b(str5, ClipBox.e)).booleanValue();
                }
                if (str3 != null) {
                    aVar.g = (DuetType) ClipBox.b.b(str3, ClipBox.d);
                }
                if (str != null) {
                    ClipBox.b.a(str);
                }
                if (str4 != null) {
                    ClipBox.b.a(str4);
                }
                aVar.c = str2 != null ? ClipBox.b.a(str2) : null;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue < 0) {
                        throw new ClipBox.ClipBoxException("audio_start must be positive");
                    }
                    aVar.d = intValue;
                }
                String str6 = webClipBox.f;
                if (str6 != null) {
                    if (str6.length() > 200) {
                        throw new ClipBox.ClipBoxException("description must not exceed 200 symbols length");
                    }
                    aVar.e = str6;
                }
                if (num != null && str4 == null) {
                    throw new ClipBox.ClipBoxException("Setting audio_start requires audio_id to be specified");
                }
                if (str3 != null && str2 == null) {
                    throw new ClipBox.ClipBoxException("Setting duet_type requires duet_id to be specified");
                }
                ClipBox.c cVar = aVar.c;
                if (cVar != null) {
                    VideoFile videoFile = (VideoFile) qteVar.invoke(cVar.a, Integer.valueOf(cVar.b));
                    if (videoFile == null) {
                        throw new ClipBox.ClipBoxException("Specified video not found");
                    }
                    clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                    if (clipVideoFile == null) {
                        throw new ClipBox.ClipBoxException("Specified video must be a clip");
                    }
                } else {
                    clipVideoFile = null;
                }
                if (str4 != null) {
                    ArrayList arrayList = (ArrayList) new zo4(Collections.singletonList(str4)).u(0L);
                    musicTrack = arrayList != null ? (MusicTrack) j5g.a0(arrayList) : null;
                    if (musicTrack == null) {
                        throw new ClipBox.ClipBoxException("Specified audio not found");
                    }
                } else {
                    musicTrack = null;
                }
                if ((clipVideoFile != null ? clipVideoFile.D1 : null) == null || musicTrack == null) {
                    return new ClipBox(aVar, musicTrack, clipVideoFile);
                }
                throw new ClipBox.ClipBoxException("audio_id is not allowed when duet specifies its own audio track");
        }
    }
}
