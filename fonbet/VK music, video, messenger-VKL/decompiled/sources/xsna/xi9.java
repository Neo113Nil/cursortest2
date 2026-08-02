package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicCameraData;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.storycamera.CameraTooltipFromLink;
import com.vkontakte.android.attachments.PollAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import xsna.nsl0;

/* compiled from: CameraLinkProcessor.kt */
/* loaded from: classes17.dex */
public final class xi9 {
    public final LaunchContext a;
    public final peq0 b;
    public final Uri c;
    public final yp80 d;
    public final WeakReference<Context> e;

    /* compiled from: CameraLinkProcessor.kt */
    public static final class a {
        public final Poll a;
        public final StoryAnswer b;

        public a(Poll poll, StoryAnswer storyAnswer) {
            this.a = poll;
            this.b = storyAnswer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Poll poll = this.a;
            int hashCode = (poll == null ? 0 : poll.hashCode()) * 31;
            StoryAnswer storyAnswer = this.b;
            return hashCode + (storyAnswer != null ? storyAnswer.hashCode() : 0);
        }

        public final String toString() {
            return "CameraBuilderLoadedObjects(poll=" + this.a + ", answer=" + this.b + ')';
        }
    }

    public xi9(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        this.a = launchContext;
        this.b = peq0Var;
        this.c = uri;
        this.d = yp80Var;
        this.e = new WeakReference<>(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a() {
        StoryCameraMode storyCameraMode;
        ArrayList arrayList;
        boolean f;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        com.vk.storycamera.builder.a aVar;
        String str;
        String queryParameter4;
        io.reactivex.rxjava3.core.q H;
        Integer m;
        Long n;
        String queryParameter5;
        io.reactivex.rxjava3.core.t H2;
        Integer m2;
        Integer m3;
        Long n2;
        FragmentActivity fragmentActivity;
        Context context;
        StoryCameraMode storyCameraMode2;
        peq0 peq0Var = this.b;
        String str2 = peq0Var.d;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -427356054:
                    if (str2.equals("pingpong")) {
                        storyCameraMode = StoryCameraMode.PING_PONG;
                        break;
                    }
                    break;
                case 3617:
                    if (str2.equals("qr")) {
                        storyCameraMode = StoryCameraMode.QR_SCANNER;
                        break;
                    }
                    break;
                case 3322092:
                    if (str2.equals("live")) {
                        storyCameraMode = StoryCameraMode.LIVE;
                        break;
                    }
                    break;
                case 94750499:
                    if (str2.equals("clips")) {
                        storyCameraMode = StoryCameraMode.CLIPS;
                        break;
                    }
                    break;
                case 109770997:
                    if (str2.equals("story")) {
                        storyCameraMode = StoryCameraMode.STORY;
                        break;
                    }
                    break;
            }
            if (storyCameraMode != StoryCameraMode.CLIPS && !g620.f().getExperiments().c()) {
                yp80 yp80Var = this.d;
                if (yp80Var != null) {
                    yp80Var.U();
                }
                return Boolean.TRUE;
            }
            arrayList = new ArrayList(xa4.q());
            if (str2 != null && str2.length() != 0 && storyCameraMode != (storyCameraMode2 = StoryCameraMode.QR_SCANNER)) {
                arrayList.remove(storyCameraMode2);
            }
            Uri uri = this.c;
            f = epx.f(uri.getQueryParameter(X3.a.t), "qr");
            WeakReference<Context> weakReference = this.e;
            if (f && (context = weakReference.get()) != null) {
                String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE);
                com.vk.storycamera.builder.a aVar2 = new com.vk.storycamera.builder.a(a2, a2);
                aVar2.s();
                aVar2.C(context);
            }
            String queryParameter6 = uri.getQueryParameter("title");
            String queryParameter7 = uri.getQueryParameter("hashtag");
            queryParameter = uri.getQueryParameter("maskId");
            String queryParameter8 = uri.getQueryParameter("effect");
            queryParameter2 = uri.getQueryParameter("trackId");
            CameraTooltipFromLink.a aVar3 = CameraTooltipFromLink.Companion;
            queryParameter3 = uri.getQueryParameter("tooltip");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            aVar3.getClass();
            CameraTooltipFromLink a3 = CameraTooltipFromLink.a.a(queryParameter3);
            LaunchContext launchContext = this.a;
            str = launchContext.d;
            if (str == null) {
                str = "";
            }
            String str3 = launchContext.e;
            aVar = new com.vk.storycamera.builder.a(str, str3 != null ? str3 : "");
            aVar.f = storyCameraMode;
            aVar.u = queryParameter6;
            aVar.v = queryParameter7;
            if (queryParameter == null) {
                queryParameter = queryParameter8;
            }
            aVar.m = queryParameter;
            aVar.g = arrayList;
            aVar.j0 = a3;
            int i = 0;
            if (queryParameter2 != null) {
                aVar.u0 = new MusicCameraData(queryParameter2, false);
            }
            if (storyCameraMode == StoryCameraMode.QR_SCANNER && epx.f(peq0Var.a.getQueryParameter("hide_tabs"), "1")) {
                aVar.s();
            }
            queryParameter4 = uri.getQueryParameter("poll");
            if (queryParameter4 != null) {
                H = io.reactivex.rxjava3.core.q.T(new PollAttachment((Poll) null));
            } else {
                List b0 = drm0.b0(queryParameter4, new char[]{'_'}, 0, 6);
                String str4 = (String) j5g.b0(0, b0);
                UserId userId = new UserId((str4 == null || (n = arm0.n(str4)) == null) ? 0L : n.longValue());
                String str5 = (String) j5g.b0(1, b0);
                Pair pair = new Pair(userId, Integer.valueOf((str5 == null || (m = arm0.m(10, str5)) == null) ? 0 : m.intValue()));
                UserId userId2 = (UserId) pair.d();
                int intValue = ((Number) pair.g()).intValue();
                H = (!fkq0.c(userId2) || intValue == 0) ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Illegal poll: ".concat(queryParameter4))) : rsg0.y0(new cub0(intValue, userId2, false), null, null, 3);
            }
            queryParameter5 = uri.getQueryParameter("question");
            if (queryParameter5 != null) {
                H2 = io.reactivex.rxjava3.core.q.T(new nsl0.a(null));
            } else {
                List b02 = drm0.b0(queryParameter5, new char[]{'_'}, 0, 6);
                String str6 = (String) j5g.b0(0, b02);
                UserId userId3 = new UserId((str6 == null || (n2 = arm0.n(str6)) == null) ? 0L : n2.longValue());
                String str7 = (String) j5g.b0(1, b02);
                int intValue2 = (str7 == null || (m3 = arm0.m(10, str7)) == null) ? 0 : m3.intValue();
                String str8 = (String) j5g.b0(2, b02);
                if (str8 != null && (m2 = arm0.m(10, str8)) != null) {
                    i = m2.intValue();
                }
                Triple triple = new Triple(userId3, Integer.valueOf(intValue2), Integer.valueOf(i));
                UserId userId4 = (UserId) triple.d();
                int intValue3 = ((Number) triple.g()).intValue();
                int intValue4 = ((Number) triple.h()).intValue();
                H2 = (!fkq0.c(userId4) || intValue3 == 0 || intValue4 == 0) ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Illegal question: ".concat(queryParameter5))) : rsg0.y0(new nsl0(userId4, intValue3, intValue4), null, null, 3);
            }
            io.reactivex.rxjava3.core.q m4 = hg1.m(io.reactivex.rxjava3.core.q.I0(H, H2, new rq(5)), weakReference.get(), 0L, false, 62);
            asu0.a.getClass();
            io.reactivex.rxjava3.disposables.c subscribe = m4.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new defpackage.d(new defpackage.c(8, aVar, this), 11), new hv(new mo1(7), 8));
            Context context2 = weakReference.get();
            Activity h = context2 == null ? e3m.h(context2) : null;
            fragmentActivity = !(h instanceof FragmentActivity) ? (FragmentActivity) h : null;
            if (fragmentActivity != null) {
                ver0.b(fragmentActivity, subscribe);
            }
            return null;
        }
        storyCameraMode = StoryCameraMode.STORY;
        if (storyCameraMode != StoryCameraMode.CLIPS) {
        }
        arrayList = new ArrayList(xa4.q());
        if (str2 != null) {
            arrayList.remove(storyCameraMode2);
        }
        Uri uri2 = this.c;
        f = epx.f(uri2.getQueryParameter(X3.a.t), "qr");
        WeakReference<Context> weakReference2 = this.e;
        if (f) {
            String a22 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE);
            com.vk.storycamera.builder.a aVar22 = new com.vk.storycamera.builder.a(a22, a22);
            aVar22.s();
            aVar22.C(context);
        }
        String queryParameter62 = uri2.getQueryParameter("title");
        String queryParameter72 = uri2.getQueryParameter("hashtag");
        queryParameter = uri2.getQueryParameter("maskId");
        String queryParameter82 = uri2.getQueryParameter("effect");
        queryParameter2 = uri2.getQueryParameter("trackId");
        CameraTooltipFromLink.a aVar32 = CameraTooltipFromLink.Companion;
        queryParameter3 = uri2.getQueryParameter("tooltip");
        if (queryParameter3 == null) {
        }
        aVar32.getClass();
        CameraTooltipFromLink a32 = CameraTooltipFromLink.a.a(queryParameter3);
        LaunchContext launchContext2 = this.a;
        str = launchContext2.d;
        if (str == null) {
        }
        String str32 = launchContext2.e;
        aVar = new com.vk.storycamera.builder.a(str, str32 != null ? str32 : "");
        aVar.f = storyCameraMode;
        aVar.u = queryParameter62;
        aVar.v = queryParameter72;
        if (queryParameter == null) {
        }
        aVar.m = queryParameter;
        aVar.g = arrayList;
        aVar.j0 = a32;
        int i2 = 0;
        if (queryParameter2 != null) {
        }
        if (storyCameraMode == StoryCameraMode.QR_SCANNER) {
            aVar.s();
        }
        queryParameter4 = uri2.getQueryParameter("poll");
        if (queryParameter4 != null) {
        }
        queryParameter5 = uri2.getQueryParameter("question");
        if (queryParameter5 != null) {
        }
        io.reactivex.rxjava3.core.q m42 = hg1.m(io.reactivex.rxjava3.core.q.I0(H, H2, new rq(5)), weakReference2.get(), 0L, false, 62);
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c subscribe2 = m42.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new defpackage.d(new defpackage.c(8, aVar, this), 11), new hv(new mo1(7), 8));
        Context context22 = weakReference2.get();
        if (context22 == null) {
        }
        if (!(h instanceof FragmentActivity)) {
        }
        if (fragmentActivity != null) {
        }
        return null;
    }
}
