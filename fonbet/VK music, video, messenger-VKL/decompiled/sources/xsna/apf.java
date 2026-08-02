package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.vk.companion.core.CompanionAppImpl;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.di.VoipCallComponentImpl;
import com.vkontakte.android.R;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.sp40;
import xsna.tin0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class apf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ apf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        androidx.media3.datasource.cache.c cVar;
        final File h;
        boolean z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                dpf dpfVar = (dpf) this.c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ClipsViewersExperiments", "Init ClipsViewerExperimentsAppStart"});
                }
                return new pof(dpfVar.b, dpfVar.d);
            case 1:
                return io.reactivex.rxjava3.subjects.d.O0(Boolean.valueOf(((CompanionAppImpl) this.c).j())).M0();
            case 2:
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = (FrameworkSQLiteOpenHelper) this.c;
                tin0.a aVar = frameworkSQLiteOpenHelper.d;
                String str = frameworkSQLiteOpenHelper.c;
                FrameworkSQLiteOpenHelper.OpenHelper openHelper = (str == null || !frameworkSQLiteOpenHelper.e) ? new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.b, frameworkSQLiteOpenHelper.c, new FrameworkSQLiteOpenHelper.a(), aVar, frameworkSQLiteOpenHelper.f) : new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.b, new File(frameworkSQLiteOpenHelper.b.getNoBackupFilesDir(), str).getAbsolutePath(), new FrameworkSQLiteOpenHelper.a(), aVar, frameworkSQLiteOpenHelper.f);
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.h);
                return openHelper;
            case 3:
                Context context = (Context) this.c;
                hjv.a.getClass();
                if (hjv.e.compareAndSet(false, true)) {
                    cvk.u(R.string.error_invalid_date, false);
                    Intent intent = new Intent("android.settings.DATE_SETTINGS");
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
                return s3q0.a;
            case 4:
                gxw gxwVar = (gxw) this.c;
                return new ekg(new bpn0(new bzj(gxwVar, 19)), (ProfileFragmentProviderComponent) gxwVar.c().a(fpf0.a(ProfileFragmentProviderComponent.class)), new bpn0(new nuj(gxwVar, 14)));
            case 5:
                final sp40 sp40Var = (sp40) this.c;
                MusicOfflineCacheStorage.Companion.getClass();
                MusicOfflineCacheStorage musicOfflineCacheStorage = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL;
                k850 k850Var = sp40Var.b;
                File file = null;
                for (final MusicOfflineCacheStorage musicOfflineCacheStorage2 : j5g.y0(k850Var.c())) {
                    if (epx.f(musicOfflineCacheStorage2.h(), file) || (h = musicOfflineCacheStorage2.h()) == null) {
                        cVar = null;
                    } else {
                        sp40.a aVar2 = sp40.k;
                        gzs gzsVar = new gzs() { // from class: xsna.rp40
                            @Override // xsna.gzs
                            public final Object invoke() {
                                sp40 sp40Var2 = sp40Var;
                                return new androidx.media3.datasource.cache.c(h, new tp40(sp40Var2, musicOfflineCacheStorage2), (swk) sp40Var2.h.getValue(), false);
                            }
                        };
                        synchronized (sp40.k) {
                            LinkedHashMap linkedHashMap = sp40.l;
                            cVar = (androidx.media3.datasource.cache.c) linkedHashMap.get(h.getAbsolutePath());
                            if (cVar == null) {
                                cVar = (androidx.media3.datasource.cache.c) gzsVar.invoke();
                                linkedHashMap.put(h.getAbsolutePath(), cVar);
                            }
                        }
                    }
                    if (cVar != null) {
                        ((Map) sp40Var.d.getValue()).put(musicOfflineCacheStorage2.k(), cVar);
                        file = musicOfflineCacheStorage2.h();
                        musicOfflineCacheStorage = musicOfflineCacheStorage2;
                    }
                }
                return new mu70(musicOfflineCacheStorage, new bd3(), new bpn0(new gbl(sp40Var, i)), k850Var);
            case 6:
                return ((jq40) this.c).a.n7();
            case 7:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return new ram0(storiesComponentImpl.eb(), xwk.d());
            case 8:
                if (((qks0) this.c).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_ADD_CARD_UPCOMING;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return ((VoipCallComponentImpl) this.c).i.getValue();
        }
    }
}
