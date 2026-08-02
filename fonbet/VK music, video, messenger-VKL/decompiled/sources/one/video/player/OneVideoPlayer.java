package one.video.player;

import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a2t;
import xsna.asp;
import xsna.b2p;
import xsna.deb0;
import xsna.er10;
import xsna.hk0;
import xsna.ik80;
import xsna.lj00;
import xsna.lk80;
import xsna.ozl;
import xsna.rt4;
import xsna.sht0;
import xsna.wl80;
import xsna.xk80;
import xsna.y6b0;
import xsna.ymo;
import xsna.zrp;

/* compiled from: OneVideoPlayer.kt */
/* loaded from: classes8.dex */
public interface OneVideoPlayer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlayer.kt */
    public static final class DataType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DataType[] $VALUES;
        public static final DataType AD;
        public static final DataType DRM;
        public static final DataType MANIFEST;
        public static final DataType MEDIA;
        public static final DataType MEDIA_INITIALIZATION;
        public static final DataType MEDIA_PROGRESSIVE_LIVE;
        public static final DataType TIME_SYNCHRONIZATION;
        public static final DataType UNKNOWN;
        public static final DataType UNRESOLVED;

        static {
            DataType dataType = new DataType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = dataType;
            DataType dataType2 = new DataType("MEDIA", 1);
            MEDIA = dataType2;
            DataType dataType3 = new DataType("MEDIA_INITIALIZATION", 2);
            MEDIA_INITIALIZATION = dataType3;
            DataType dataType4 = new DataType("DRM", 3);
            DRM = dataType4;
            DataType dataType5 = new DataType("MANIFEST", 4);
            MANIFEST = dataType5;
            DataType dataType6 = new DataType("TIME_SYNCHRONIZATION", 5);
            TIME_SYNCHRONIZATION = dataType6;
            DataType dataType7 = new DataType("AD", 6);
            AD = dataType7;
            DataType dataType8 = new DataType("MEDIA_PROGRESSIVE_LIVE", 7);
            MEDIA_PROGRESSIVE_LIVE = dataType8;
            DataType dataType9 = new DataType("UNRESOLVED", 8);
            UNRESOLVED = dataType9;
            DataType[] dataTypeArr = {dataType, dataType2, dataType3, dataType4, dataType5, dataType6, dataType7, dataType8, dataType9};
            $VALUES = dataTypeArr;
            $ENTRIES = new asp(dataTypeArr);
        }

        public DataType() {
            throw null;
        }

        public static DataType valueOf(String str) {
            return (DataType) Enum.valueOf(DataType.class, str);
        }

        public static DataType[] values() {
            return (DataType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlayer.kt */
    public static final class DiscontinuityReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DiscontinuityReason[] $VALUES;
        public static final DiscontinuityReason AUTO_TRANSITION;
        public static final DiscontinuityReason INTERNAL;
        public static final DiscontinuityReason REMOVE;
        public static final DiscontinuityReason SEEK;
        public static final DiscontinuityReason SEEK_ADJUSTMENT;
        public static final DiscontinuityReason SKIP;
        public static final DiscontinuityReason UNKNOWN;

        static {
            DiscontinuityReason discontinuityReason = new DiscontinuityReason("AUTO_TRANSITION", 0);
            AUTO_TRANSITION = discontinuityReason;
            DiscontinuityReason discontinuityReason2 = new DiscontinuityReason("SEEK", 1);
            SEEK = discontinuityReason2;
            DiscontinuityReason discontinuityReason3 = new DiscontinuityReason("SEEK_ADJUSTMENT", 2);
            SEEK_ADJUSTMENT = discontinuityReason3;
            DiscontinuityReason discontinuityReason4 = new DiscontinuityReason(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 3);
            SKIP = discontinuityReason4;
            DiscontinuityReason discontinuityReason5 = new DiscontinuityReason(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 4);
            REMOVE = discontinuityReason5;
            DiscontinuityReason discontinuityReason6 = new DiscontinuityReason("INTERNAL", 5);
            INTERNAL = discontinuityReason6;
            DiscontinuityReason discontinuityReason7 = new DiscontinuityReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
            UNKNOWN = discontinuityReason7;
            DiscontinuityReason[] discontinuityReasonArr = {discontinuityReason, discontinuityReason2, discontinuityReason3, discontinuityReason4, discontinuityReason5, discontinuityReason6, discontinuityReason7};
            $VALUES = discontinuityReasonArr;
            $ENTRIES = new asp(discontinuityReasonArr);
        }

        public DiscontinuityReason() {
            throw null;
        }

        public static DiscontinuityReason valueOf(String str) {
            return (DiscontinuityReason) Enum.valueOf(DiscontinuityReason.class, str);
        }

        public static DiscontinuityReason[] values() {
            return (DiscontinuityReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OneVideoPlayer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State BUFFERING;
        public static final State ENDED;
        public static final State ERROR;
        public static final State IDLE;
        public static final State PAUSED;
        public static final State PLAYING;
        public static final State RELEASED;

        static {
            State state = new State("IDLE", 0);
            IDLE = state;
            State state2 = new State("BUFFERING", 1);
            BUFFERING = state2;
            State state3 = new State("PLAYING", 2);
            PLAYING = state3;
            State state4 = new State("PAUSED", 3);
            PAUSED = state4;
            State state5 = new State(SignalingProtocol.STATE_ENDED, 4);
            ENDED = state5;
            State state6 = new State("ERROR", 5);
            ERROR = state6;
            State state7 = new State("RELEASED", 6);
            RELEASED = state7;
            State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface a {
        void a(DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2);

        void b(OneVideoPlayer oneVideoPlayer, int i, long j, long j2);

        void c(OneVideoPlayer oneVideoPlayer, long j, int i);

        void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, DataType dataType, IOException iOException);

        void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation);

        void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, DataType dataType);

        void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2);

        void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, DataType dataType, er10 er10Var);
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface b {
        void a(String str);
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface c {
        void a(DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2);

        @ozl
        void b(OneVideoPlayer oneVideoPlayer, boolean z);

        void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var);

        void d(OneVideoPlayer oneVideoPlayer);

        void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar);

        @ozl
        void f(OneVideoPlayer oneVideoPlayer);

        void g(BaseVideoPlayer baseVideoPlayer, float f);

        @ozl
        void h(OneVideoPlayer oneVideoPlayer);

        void i(OneVideoPlayer oneVideoPlayer, int i);

        @ozl
        void j(OneVideoPlayer oneVideoPlayer);

        void k(OneVideoPlayer oneVideoPlayer, long j);

        void l(OneVideoPlayer oneVideoPlayer);

        void m(xk80 xk80Var, one.video.player.tracks.b bVar, boolean z);

        void n(xk80 xk80Var, one.video.player.tracks.c cVar);

        void o(BaseVideoPlayer baseVideoPlayer, float f);

        void p(OneVideoPlayer oneVideoPlayer);

        void q(OneVideoPlaybackException oneVideoPlaybackException, sht0 sht0Var, OneVideoPlayer oneVideoPlayer);

        @ozl
        void r(OneVideoPlayer oneVideoPlayer);

        @ozl
        void s(OneVideoPlayer oneVideoPlayer);

        void t(OneVideoPlayer oneVideoPlayer, one.video.player.tracks.a aVar);

        void u(BaseVideoPlayer baseVideoPlayer, RepeatMode repeatMode);

        @ozl
        void v(OneVideoPlayer oneVideoPlayer);

        void w(BaseVideoPlayer baseVideoPlayer);

        void x(OneVideoPlayer oneVideoPlayer);

        @ozl
        void y(OneVideoPlayer oneVideoPlayer, boolean z);

        void z(BaseVideoPlayer baseVideoPlayer, State state, State state2);
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface d {
        void C(BaseVideoPlayer baseVideoPlayer, long j);
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface e {
        void C(ArrayList arrayList);
    }

    /* compiled from: OneVideoPlayer.kt */
    public interface f {
        void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i);

        void b(OneVideoPlayer oneVideoPlayer, String str, String str2);

        void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z);

        void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z);

        void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z);
    }

    void A(y6b0 y6b0Var, deb0 deb0Var);

    void B(rt4 rt4Var);

    void C(sht0 sht0Var, long j);

    void D(a aVar);

    default one.video.player.tracks.c E() {
        return null;
    }

    default List<one.video.player.tracks.a> F() {
        return Collections.EMPTY_LIST;
    }

    void G(a2t a2tVar);

    void H(e eVar);

    void I(y6b0 y6b0Var, deb0 deb0Var);

    default one.video.player.tracks.c J() {
        return null;
    }

    void K(a aVar);

    default ymo L() {
        return null;
    }

    default one.video.player.tracks.a M() {
        return null;
    }

    int N();

    boolean O();

    hk0 P();

    default one.video.player.tracks.b Q() {
        return null;
    }

    void R(RepeatMode repeatMode);

    void T(d dVar);

    y6b0 U();

    void V(boolean z);

    void W(f fVar);

    void X(Size size);

    default List<one.video.player.tracks.b> Y() {
        return Collections.EMPTY_LIST;
    }

    long Z();

    long a();

    void a0(e eVar);

    float b();

    void b0(hk0 hk0Var);

    void c0(c cVar);

    boolean canPause();

    @ozl
    void clearVideoSurface();

    void d0(c cVar);

    void e();

    void e0(rt4 rt4Var);

    Size f();

    boolean f0();

    b2p g0();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getCurrentPosition();

    long getDuration();

    OneVideoPlaybackException getError();

    RepeatMode getRepeatMode();

    State getState();

    float getVolume();

    void h0(deb0 deb0Var);

    default boolean i() {
        return this instanceof wl80;
    }

    String i0();

    sht0 j();

    void j0(l lVar);

    default List<one.video.player.tracks.c> k0() {
        return Collections.EMPTY_LIST;
    }

    default long l0() {
        return 0L;
    }

    int m0();

    void n0(sht0 sht0Var, long j);

    default boolean o() {
        return false;
    }

    @ozl
    boolean p();

    default float[] p0() {
        return new float[0];
    }

    void pause();

    default boolean q(one.video.player.tracks.a aVar) {
        return false;
    }

    void r(f fVar);

    void release();

    void resume();

    void s(d dVar);

    void seekTo(long j);

    void setPlaybackSpeed(float f2);

    @ozl
    void setVideoSurface(Surface surface);

    void setVolume(float f2);

    void stop();

    Long u();

    boolean w();

    default ik80 x() {
        return null;
    }

    default boolean y() {
        return false;
    }

    default void o0() {
    }

    default void t() {
    }

    default void S(one.video.player.tracks.c cVar) {
    }

    default void v(lj00 lj00Var) {
    }

    default void z(one.video.player.tracks.b bVar) {
    }
}
