package xsna;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Trace;
import android.provider.CalendarContract;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.source.i;
import com.ironsource.Aa;
import com.ironsource.C4654y9;
import com.ironsource.K9;
import com.ironsource.Yd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.appmetrica.analytics.impl.Pb;
import io.appmetrica.analytics.impl.V;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Ref$IntRef;
import one.video.calls.sdk_private.aG;
import xsna.dll;
import xsna.ewo0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long j;
        boolean z;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                Aa.d((LevelPlayAdInfo) this.c, (Aa) this.d);
                return;
            case 1:
                VideoFile videoFile = (VideoFile) this.c;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                Trace.beginSection("warmUpAutoPlays.getVideoAutoPlay");
                try {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    b.C1208b.a().e(videoFile, null);
                    ref$IntRef.element++;
                    s3q0 s3q0Var = s3q0.a;
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
                ((View) this.c).getViewTreeObserver().removeOnDrawListener((dll.b) this.d);
                return;
            case 3:
                androidx.media3.exoplayer.c cVar = (androidx.media3.exoplayer.c) this.c;
                d.e eVar = (d.e) this.d;
                int i2 = cVar.J - eVar.c;
                cVar.J = i2;
                if (eVar.d) {
                    cVar.K = eVar.e;
                    cVar.L = true;
                }
                if (i2 == 0) {
                    ewo0 ewo0Var = eVar.b.a;
                    int i3 = -1;
                    if (!cVar.p0.a.p() && ewo0Var.p()) {
                        cVar.q0 = -1;
                        cVar.r0 = 0L;
                    }
                    if (!ewo0Var.p()) {
                        List asList = Arrays.asList(((jeb0) ewo0Var).i);
                        fxc0.z(asList.size() == cVar.q.size());
                        for (int i4 = 0; i4 < asList.size(); i4++) {
                            ((c.d) cVar.q.get(i4)).b = (ewo0) asList.get(i4);
                        }
                    }
                    boolean z3 = cVar.L;
                    long j2 = C.TIME_UNSET;
                    if (z3) {
                        boolean z4 = eVar.b.a.p() && cVar.p0.a.p();
                        boolean equals = eVar.b.b.equals(cVar.p0.b);
                        boolean z5 = eVar.b.d == cVar.p0.s;
                        if (z4 || (equals && z5)) {
                            z2 = false;
                        }
                        if (z2) {
                            i3 = cVar.s();
                            if (ewo0Var.p() || eVar.b.b.b()) {
                                j2 = eVar.b.d;
                            } else {
                                fwa0 fwa0Var = eVar.b;
                                i.b bVar = fwa0Var.b;
                                long j3 = fwa0Var.d;
                                Object obj = bVar.a;
                                ewo0.b bVar2 = cVar.p;
                                ewo0Var.g(obj, bVar2);
                                j2 = j3 + bVar2.e;
                            }
                        }
                        i = i3;
                        j = j2;
                        z = z2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = false;
                    }
                    cVar.L = false;
                    cVar.V(eVar.b, 1, z, cVar.K, j, i);
                    return;
                }
                return;
            case 4:
                Pb.a((Pb) this.c, (V) this.d);
                return;
            case 5:
                ((ror) this.c).setWidthScreenView(((ViewGroup) this.d).getWidth());
                return;
            case 6:
                ((skm0.a) this.c).c0(o25.a().a(((StoryEntry) this.d).d), !r1.o0);
                return;
            case 7:
                j0p0 j0p0Var = (j0p0) this.c;
                String str = (String) this.d;
                j0p0Var.c.a(str);
                j0p0Var.d.a(str);
                j0p0Var.e.a(str);
                return;
            case 8:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                if (extendedUserProfile.s <= 0 || extendedUserProfile.t <= 0) {
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                int i5 = calendar.get(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append('-');
                sb.append(extendedUserProfile.t);
                sb.append('-');
                sb.append(extendedUserProfile.s);
                try {
                    Date parse = simpleDateFormat.parse(sb.toString());
                    if (parse == null) {
                        return;
                    }
                    calendar.setTime(parse);
                    if (parse.getTime() < System.currentTimeMillis()) {
                        calendar.add(1, 1);
                    }
                    long timeInMillis = calendar.getTimeInMillis();
                    String format = String.format(fragmentActivity.getResources().getString(R.string.profile_birthday_today_short), Arrays.copyOf(new Object[]{extendedUserProfile.d + ' ' + extendedUserProfile.g}, 1));
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    intent.putExtra("title", format);
                    intent.putExtra("beginTime", timeInMillis);
                    intent.putExtra("allDay", true);
                    intent.putExtra("rrule", "FREQ=YEARLY");
                    try {
                        fragmentActivity.startActivity(intent);
                        return;
                    } catch (ActivityNotFoundException e) {
                        L.i(e);
                        return;
                    }
                } catch (ParseException unused) {
                    return;
                }
            case 9:
                Yd.a((Yd) this.c, (K9) this.d);
                return;
            case 10:
                ((com.my.tracker.obfuscated.a) this.c).a((Activity) this.d);
                return;
            case 11:
                cny0 cny0Var = (cny0) this.c;
                aG aGVar = (aG) this.d;
                one.video.calls.sdk_private.x xVar = cny0Var.f;
                Object[] objArr = {new fhy0(), new fhy0()};
                ArrayList arrayList = new ArrayList(2);
                for (int i6 = 0; i6 < 2; i6++) {
                    Object obj2 = objArr[i6];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                }
                xVar.a(Collections.unmodifiableList(arrayList), aGVar.h());
                return;
            default:
                C4654y9.a((C4654y9) this.c, (IronSourceError) this.d);
                return;
        }
    }
}
