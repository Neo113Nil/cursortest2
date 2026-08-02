package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.mu90;
import xsna.pvj;

/* compiled from: AudioAdStateManagerImpl.kt */
/* loaded from: classes3.dex */
public final class pb4 implements nb4 {
    public final jb4 b;
    public final kb4 c;
    public final bhz d;
    public final hpj e = zvj.a(hqu0.a().plus(whn0.a()).plus(new vb4(pvj.a.b)));
    public yok0 f;
    public MusicTrack g;
    public Context h;
    public PlaybackLaunchMeta i;
    public final utk0 j;

    /* compiled from: AudioAdStateManagerImpl.kt */
    public static final class a {
        public final List<xm40> a;
        public final long b;
        public final long c;
        public final String d;

        public a(long j, long j2, String str, List list) {
            this.a = list;
            this.b = j;
            this.c = j2;
            this.d = str;
        }
    }

    /* compiled from: AudioAdStateManagerImpl.kt */
    @b6l(c = "com.vk.music.player.ads.impl.AudioAdStateManagerImpl$triggerAdUpdate$2", f = "AudioAdStateManagerImpl.kt", l = {120}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ PlaybackLaunchMeta $launchMeta;
        final /* synthetic */ MusicTrack $musicTrack;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PlaybackLaunchMeta playbackLaunchMeta, MusicTrack musicTrack, Context context, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$launchMeta = playbackLaunchMeta;
            this.$musicTrack = musicTrack;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return pb4.this.new b(this.$launchMeta, this.$musicTrack, this.$context, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                long a = qni0.a();
                my1.a(a);
                List<ax1> e = pb4.this.d.e(new s940(new i7z(a, -1, -1), 32));
                pb4 pb4Var = pb4.this;
                PlaybackLaunchMeta playbackLaunchMeta = this.$launchMeta;
                MusicTrack musicTrack = this.$musicTrack;
                Context context = this.$context;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (pb4.f(pb4Var, e, playbackLaunchMeta, musicTrack, context, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public pb4(jb4 jb4Var, kb4 kb4Var, bhz bhzVar) {
        this.b = jb4Var;
        this.c = kb4Var;
        this.d = bhzVar;
        bpn0 bpn0Var = new bpn0(new e20(2));
        this.j = vtk0.a(mu90.a.a);
        ub4 ub4Var = new ub4(this);
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            bhzVar.d(ub4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(pb4 pb4Var, List list, PlaybackLaunchMeta playbackLaunchMeta, MusicTrack musicTrack, Context context, ContinuationImpl continuationImpl) {
        wb4 wb4Var;
        wb4 wb4Var2;
        Object obj;
        int i;
        MusicTrack musicTrack2;
        Object aVar;
        PlaybackLaunchMeta playbackLaunchMeta2;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        String t;
        Object obj2;
        s940 s940Var;
        Context context2;
        a aVar2;
        utk0 utk0Var;
        Object b2;
        PlaybackLaunchMeta playbackLaunchMeta3;
        MusicTrack musicTrack3;
        s940 s940Var2;
        Context context3;
        xh50 xh50Var;
        PlaybackLaunchMeta playbackLaunchMeta4 = playbackLaunchMeta;
        bhz bhzVar = pb4Var.d;
        utk0 utk0Var2 = pb4Var.j;
        if (continuationImpl instanceof wb4) {
            wb4Var = (wb4) continuationImpl;
            int i2 = wb4Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wb4Var.label = i2 - Integer.MIN_VALUE;
                wb4Var2 = wb4Var;
                Object obj3 = wb4Var2.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wb4Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj3);
                    ArrayList E = g5g.E(list, xm40.class);
                    xm40 xm40Var = (xm40) j5g.k0(E);
                    long j = xm40Var != null ? xm40Var.b : 0L;
                    my1.a(j);
                    s940 s940Var3 = new s940(new i7z(j, -1, -1), 32);
                    String t2 = playbackLaunchMeta4.b.t();
                    wb4Var2.L$0 = null;
                    wb4Var2.L$1 = playbackLaunchMeta4;
                    musicTrack2 = musicTrack;
                    wb4Var2.L$2 = musicTrack2;
                    wb4Var2.L$3 = context;
                    wb4Var2.L$4 = null;
                    wb4Var2.L$5 = s940Var3;
                    wb4Var2.label = 1;
                    if (E.isEmpty()) {
                        aVar = new a(0L, 0L, t2, EmptyList.b);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = E.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            String str = ((xm40) next).g;
                            Object obj4 = linkedHashMap.get(str);
                            if (obj4 == null) {
                                obj4 = s5a.a(str, linkedHashMap);
                            }
                            ((List) obj4).add(next);
                        }
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                        final e3 e3Var = new e3(2, ref$LongRef2, ref$LongRef);
                        linkedHashMap.forEach(new BiConsumer() { // from class: xsna.ob4
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj5, Object obj6) {
                                e3.this.invoke(obj5, obj6);
                            }
                        });
                        Pair pair = new Pair(new Long(ref$LongRef.element), new Long(ref$LongRef2.element));
                        long longValue = ((Number) pair.d()).longValue();
                        long longValue2 = ((Number) pair.g()).longValue();
                        xm40 xm40Var2 = (xm40) j5g.k0(E);
                        aVar = new a(longValue, longValue2, (xm40Var2 == null || (playbackLaunchMeta2 = xm40Var2.f) == null || (musicPlaybackLaunchContext = playbackLaunchMeta2.b) == null || (t = musicPlaybackLaunchContext.t()) == null) ? t2 : t, E);
                    }
                    if (aVar != obj) {
                        obj2 = aVar;
                        s940Var = s940Var3;
                        context2 = context;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xh50Var = (xh50) wb4Var2.L$8;
                        kotlin.a.a(obj3);
                        xh50Var.setValue(obj3);
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.i, new Object[]{"pending ad state: " + utk0Var2.getValue()});
                        }
                        return s3q0.a;
                    }
                    s940Var2 = (s940) wb4Var2.L$5;
                    context3 = (Context) wb4Var2.L$3;
                    musicTrack3 = (MusicTrack) wb4Var2.L$2;
                    playbackLaunchMeta3 = (PlaybackLaunchMeta) wb4Var2.L$1;
                    kotlin.a.a(obj3);
                    utk0Var = utk0Var2;
                    j9q0 j9q0Var = (j9q0) obj3;
                    bhzVar.f(s940Var2);
                    if (epx.f(utk0Var.getValue(), mu90.a.a)) {
                        return s3q0.a;
                    }
                    wb4Var2.L$0 = null;
                    wb4Var2.L$1 = null;
                    wb4Var2.L$2 = null;
                    wb4Var2.L$3 = null;
                    wb4Var2.L$4 = null;
                    wb4Var2.L$5 = null;
                    wb4Var2.L$6 = null;
                    wb4Var2.L$7 = null;
                    utk0Var2 = utk0Var;
                    wb4Var2.L$8 = utk0Var2;
                    wb4Var2.label = 3;
                    obj3 = pb4Var.g(j9q0Var, musicTrack3, playbackLaunchMeta3, context3, wb4Var2);
                    if (obj3 != obj) {
                        xh50Var = utk0Var2;
                        xh50Var.setValue(obj3);
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                        }
                        return s3q0.a;
                    }
                    return obj;
                }
                s940 s940Var4 = (s940) wb4Var2.L$5;
                Context context4 = (Context) wb4Var2.L$3;
                MusicTrack musicTrack4 = (MusicTrack) wb4Var2.L$2;
                PlaybackLaunchMeta playbackLaunchMeta5 = (PlaybackLaunchMeta) wb4Var2.L$1;
                kotlin.a.a(obj3);
                s940Var = s940Var4;
                obj2 = obj3;
                context2 = context4;
                musicTrack2 = musicTrack4;
                playbackLaunchMeta4 = playbackLaunchMeta5;
                aVar2 = (a) obj2;
                if (aVar2.c >= 3000 && aVar2.a.size() > 0) {
                    bhzVar.f(s940Var);
                    return s3q0.a;
                }
                kb4 kb4Var = pb4Var.c;
                Bundle bundle = musicTrack2.v;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                utk0Var = utk0Var2;
                int seconds = (int) timeUnit.toSeconds(aVar2.b);
                s940 s940Var5 = s940Var;
                int seconds2 = (int) timeUnit.toSeconds(aVar2.c);
                String str2 = aVar2.d;
                wb4Var2.L$0 = null;
                wb4Var2.L$1 = playbackLaunchMeta4;
                wb4Var2.L$2 = musicTrack2;
                wb4Var2.L$3 = context2;
                wb4Var2.L$4 = null;
                wb4Var2.L$5 = s940Var5;
                wb4Var2.L$6 = null;
                wb4Var2.label = 2;
                b2 = kb4Var.b(bundle, seconds, seconds2, str2, wb4Var2);
                if (b2 != obj) {
                    playbackLaunchMeta3 = playbackLaunchMeta4;
                    musicTrack3 = musicTrack2;
                    s940Var2 = s940Var5;
                    context3 = context2;
                    obj3 = b2;
                    j9q0 j9q0Var2 = (j9q0) obj3;
                    bhzVar.f(s940Var2);
                    if (epx.f(utk0Var.getValue(), mu90.a.a)) {
                    }
                }
                return obj;
            }
        }
        wb4Var = new wb4(pb4Var, continuationImpl);
        wb4Var2 = wb4Var;
        Object obj32 = wb4Var2.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wb4Var2.label;
        if (i != 0) {
        }
        aVar2 = (a) obj2;
        if (aVar2.c >= 3000) {
        }
        kb4 kb4Var2 = pb4Var.c;
        Bundle bundle2 = musicTrack2.v;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        utk0Var = utk0Var2;
        int seconds3 = (int) timeUnit2.toSeconds(aVar2.b);
        s940 s940Var52 = s940Var;
        int seconds22 = (int) timeUnit2.toSeconds(aVar2.c);
        String str22 = aVar2.d;
        wb4Var2.L$0 = null;
        wb4Var2.L$1 = playbackLaunchMeta4;
        wb4Var2.L$2 = musicTrack2;
        wb4Var2.L$3 = context2;
        wb4Var2.L$4 = null;
        wb4Var2.L$5 = s940Var52;
        wb4Var2.L$6 = null;
        wb4Var2.label = 2;
        b2 = kb4Var2.b(bundle2, seconds3, seconds22, str22, wb4Var2);
        if (b2 != obj) {
        }
        return obj;
    }

    @Override // xsna.nb4
    public final xh50<mu90> a() {
        return this.j;
    }

    @Override // xsna.nb4
    public final boolean b(MusicTrack musicTrack) {
        String Fb = musicTrack.Fb();
        MusicTrack musicTrack2 = this.g;
        return epx.f(Fb, musicTrack2 != null ? musicTrack2.Fb() : null);
    }

    @Override // xsna.nb4
    public final void c(String str) {
        if (str.equals("im")) {
            yok0 yok0Var = this.f;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.j.setValue(mu90.a.a);
        }
    }

    @Override // xsna.nb4
    public final void d(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, Context context) {
        this.g = musicTrack;
        this.i = playbackLaunchMeta;
        this.h = context;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"music track: " + musicTrack});
        }
        yok0 yok0Var = this.f;
        if (yok0Var == null || !yok0Var.isActive()) {
            this.f = myc0.h(this.e, null, null, new b(playbackLaunchMeta, musicTrack, context, null), 3);
        }
    }

    @Override // xsna.nb4
    public final void e(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, PlayerService playerService, AudioAdConfig.Type type, boolean z) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{zhy0.a("wasListened: ", z)});
        }
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.j.setValue(mu90.a.a);
        if (MusicFeatures.AUDIO_REWORK_PLAYER_ADS.h()) {
            myc0.h(this.e, null, null, new qb4(this, z, type, musicTrack, playbackLaunchMeta, playerService, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(j9q0 j9q0Var, MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, Context context, ContinuationImpl continuationImpl) {
        rb4 rb4Var;
        int i;
        j9q0 j9q0Var2;
        if (continuationImpl instanceof rb4) {
            rb4Var = (rb4) continuationImpl;
            int i2 = rb4Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rb4Var.label = i2 - Integer.MIN_VALUE;
                rb4 rb4Var2 = rb4Var;
                Object obj = rb4Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rb4Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!j9q0Var.a) {
                        return mu90.a.a;
                    }
                    sb4 sb4Var = new sb4(this, musicTrack, playbackLaunchMeta, j9q0Var, context, null);
                    rb4Var2.L$0 = j9q0Var;
                    rb4Var2.L$1 = null;
                    rb4Var2.L$2 = null;
                    rb4Var2.L$3 = null;
                    rb4Var2.label = 1;
                    obj = oxo0.c(5000L, sb4Var, rb4Var2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j9q0Var2 = j9q0Var;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j9q0Var2 = (j9q0) rb4Var2.L$0;
                    kotlin.a.a(obj);
                }
                g8x g8xVar = (g8x) obj;
                return g8xVar == null ? new mu90.b(g8xVar, j9q0Var2.b) : mu90.a.a;
            }
        }
        rb4Var = new rb4(this, continuationImpl);
        rb4 rb4Var22 = rb4Var;
        Object obj2 = rb4Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rb4Var22.label;
        if (i != 0) {
        }
        g8x g8xVar2 = (g8x) obj2;
        if (g8xVar2 == null) {
        }
    }
}
