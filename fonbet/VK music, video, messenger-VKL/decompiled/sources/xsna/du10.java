package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import java.util.Collections;
import java.util.Iterator;
import kotlin.text.Regex;

/* compiled from: MediaPickerLink.kt */
/* loaded from: classes17.dex */
public final class du10 implements pje {
    public static final bpn0 c = new bpn0(new nm0(22));
    public static final bpn0 d = new bpn0(new kk1(12));
    public static final bpn0 e = new bpn0(new ig(17));
    public final mhd a;
    public final p1e b;

    public du10(mhd mhdVar, p1e p1eVar) {
        this.a = mhdVar;
        this.b = p1eVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (!this.a.c()) {
            return false;
        }
        if (peq0.p(peq0Var, (Regex) c.getValue(), null, null, 14)) {
            return true;
        }
        return peq0.p(peq0Var, (Regex) d.getValue(), null, null, 14) && epx.f(peq0Var.d, "clips");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    @Override // xsna.pje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, final Context context, final LaunchContext launchContext, final yp80 yp80Var) {
        final String str;
        String queryParameter;
        Uri uri = peq0Var.a;
        final String queryParameter2 = uri.getQueryParameter("tab");
        String queryParameter3 = uri.getQueryParameter("hashtag");
        if (queryParameter3 != null) {
            if (!myc0.f(queryParameter3)) {
                queryParameter3 = null;
            }
            if (queryParameter3 != null) {
                if (!brm0.B(queryParameter3, "#", false)) {
                    queryParameter3 = "#".concat(queryParameter3);
                }
                str = queryParameter3;
                queryParameter = uri.getQueryParameter("audio");
                if (queryParameter != null || !((Regex) e.getValue()).f(queryParameter)) {
                    queryParameter = null;
                }
                if (queryParameter == null) {
                    ver0.a(hg1.i(ktr.d(new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(yfb.x(hx4.o(k840.b, Collections.singletonList(queryParameter), null, 6))), new tt0(new pyz(4), 28)).l(new t7(new qcw(5), 21))).h(new jsv(new bbw(yp80Var, 5), 4)), new izs() { // from class: xsna.cu10
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            du10.this.c(context, launchContext, (MusicTrack) obj, str, queryParameter2);
                            yp80 yp80Var2 = yp80Var;
                            if (yp80Var2 != null) {
                                yp80Var2.onSuccess();
                            }
                            return s3q0.a;
                        }
                    }));
                    return true;
                }
                c(context, launchContext, null, str, queryParameter2);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return true;
            }
        }
        str = null;
        queryParameter = uri.getQueryParameter("audio");
        if (queryParameter != null) {
        }
        queryParameter = null;
        if (queryParameter == null) {
        }
    }

    public final void c(Context context, LaunchContext launchContext, MusicTrack musicTrack, String str, String str2) {
        Object obj;
        Object obj2;
        StoryMusicInfo storyMusicInfo;
        Iterator<E> it = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.h().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            String m = cqm0.m(((MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint) obj2).name());
            String str3 = launchContext.e;
            if (m.equals(str3 != null ? cqm0.m(str3) : null)) {
                break;
            }
        }
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = (MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint) obj2;
        if (creationEntryPoint == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.LINK;
        }
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint2 = creationEntryPoint;
        if (musicTrack != null) {
            String str4 = musicTrack.i;
            if (str4 == null) {
                str4 = "";
            }
            storyMusicInfo = new StoryMusicInfo(musicTrack, str4, 0, musicTrack.c0, 0, null, false, 0, false, false, null, false, false, 8160, null);
        } else {
            storyMusicInfo = null;
        }
        Iterator<E> it2 = ClipsMediaPickerTab.h().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (epx.f(((ClipsMediaPickerTab) next).i(), str2 != null ? cqm0.m(str2) : null)) {
                obj = next;
                break;
            }
        }
        ClipsMediaPickerTab clipsMediaPickerTab = (ClipsMediaPickerTab) obj;
        if (clipsMediaPickerTab == null) {
            clipsMediaPickerTab = ClipsMediaPickerTab.Gallery;
        }
        this.b.a(context, new ClipsEntryPointsParams(creationEntryPoint2, storyMusicInfo, str, false, false, null, false, clipsMediaPickerTab, 120, null));
    }
}
