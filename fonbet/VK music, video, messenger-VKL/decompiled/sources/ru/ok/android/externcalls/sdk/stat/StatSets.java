package ru.ok.android.externcalls.sdk.stat;

import java.util.LinkedHashSet;
import java.util.Set;
import ru.ok.android.externcalls.sdk.stat.Animoji;
import ru.ok.android.externcalls.sdk.stat.Layouts;
import ru.ok.android.externcalls.sdk.stat.Media;
import ru.ok.android.externcalls.sdk.stat.NoiseSuppressor;
import ru.ok.android.externcalls.sdk.stat.Screenshare;
import xsna.izi0;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatSets {
    public static final StatSets INSTANCE = new StatSets();
    private static final Set<StatKey<?>> all;
    private static final Set<StatKey<?>> allIn;
    private static final Set<StatKey<?>> allOut;
    private static final Set<StatKey<?>> animoji;
    private static final Set<StatKey<?>> animojiCommon;
    private static final Set<StatKey<?>> animojiForParticipant;
    private static final Set<StatKey<?>> audioIn;
    private static final Set<StatKey<?>> audioOut;
    private static final Set<StatKey<?>> camera;
    private static final Set<StatKey<?>> connection;
    private static final Set<StatKey<?>> layouts;
    private static final Set<StatKey<?>> ns;
    private static final Set<StatKey<?>> renderableAll;
    private static final Set<StatKey<?>> renderableIn;
    private static final Set<StatKey<?>> renderableOut;
    private static final Set<StatKey<?>> screenshareIn;
    private static final Set<StatKey<?>> util;
    private static final Set<StatKey<?>> videoIn;
    private static final Set<StatKey<?>> videoOut;

    static {
        Set<StatKey<?>> all2 = Media.VideoRecv.INSTANCE.getAll();
        videoIn = all2;
        LinkedHashSet j = izi0.j(Media.AudioRecv.INSTANCE.getAll(), Media.AudioRecv.Loss.INSTANCE.getAll());
        audioIn = j;
        LinkedHashSet j2 = izi0.j(Layouts.Screenshare.INSTANCE.getAll(), Layouts.Video.INSTANCE.getAll());
        layouts = j2;
        Set<StatKey<?>> all3 = Screenshare.Recv.INSTANCE.getAll();
        screenshareIn = all3;
        Set<StatKey<?>> all4 = Animoji.Common.INSTANCE.getAll();
        animojiCommon = all4;
        Set<StatKey<?>> all5 = Animoji.Participant.INSTANCE.getAll();
        animojiForParticipant = all5;
        Set<StatKey<?>> set = all5;
        animoji = izi0.j(all4, set);
        Set<StatKey<?>> all6 = Util.INSTANCE.getAll();
        util = all6;
        Set<StatKey<?>> all7 = Camera.INSTANCE.getAll();
        camera = all7;
        LinkedHashSet j3 = izi0.j(izi0.j(izi0.j(izi0.j(izi0.j(izi0.j(all2, j), j2), all3), set), all6), all7);
        allIn = j3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : j3) {
            StatKey statKey = (StatKey) obj;
            if (!statKey.getSynthetic() && statKey.getHumanReadable()) {
                linkedHashSet.add(obj);
            }
        }
        renderableIn = linkedHashSet;
        Set<StatKey<?>> all8 = Media.VideoSend.INSTANCE.getAll();
        videoOut = all8;
        Set<StatKey<?>> all9 = Media.AudioSend.INSTANCE.getAll();
        audioOut = all9;
        Set<StatKey<?>> all10 = Connection.INSTANCE.getAll();
        connection = all10;
        Set<StatKey<?>> all11 = NoiseSuppressor.Pretty.INSTANCE.getAll();
        ns = all11;
        LinkedHashSet j4 = izi0.j(izi0.j(izi0.j(izi0.j(izi0.j(izi0.j(all8, all9), all10), all11), animoji), util), camera);
        allOut = j4;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : j4) {
            StatKey statKey2 = (StatKey) obj2;
            if (!statKey2.getSynthetic() && statKey2.getHumanReadable()) {
                linkedHashSet2.add(obj2);
            }
        }
        renderableOut = linkedHashSet2;
        LinkedHashSet j5 = izi0.j(allIn, allOut);
        Set<StatKey<?>> set2 = animoji;
        LinkedHashSet j6 = izi0.j(izi0.g(j5, set2), set2);
        all = j6;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        for (Object obj3 : j6) {
            StatKey statKey3 = (StatKey) obj3;
            if (!statKey3.getSynthetic() && statKey3.getHumanReadable()) {
                linkedHashSet3.add(obj3);
            }
        }
        renderableAll = linkedHashSet3;
    }

    private StatSets() {
    }

    public final Set<StatKey<?>> getAll() {
        return all;
    }

    public final Set<StatKey<?>> getAllIn() {
        return allIn;
    }

    public final Set<StatKey<?>> getAllOut() {
        return allOut;
    }

    public final Set<StatKey<?>> getAnimoji() {
        return animoji;
    }

    public final Set<StatKey<?>> getAnimojiCommon() {
        return animojiCommon;
    }

    public final Set<StatKey<?>> getAnimojiForParticipant() {
        return animojiForParticipant;
    }

    public final Set<StatKey<?>> getAudioIn() {
        return audioIn;
    }

    public final Set<StatKey<?>> getAudioOut() {
        return audioOut;
    }

    public final Set<StatKey<?>> getCamera() {
        return camera;
    }

    public final Set<StatKey<?>> getConnection() {
        return connection;
    }

    public final Set<StatKey<?>> getLayouts() {
        return layouts;
    }

    public final Set<StatKey<?>> getNs() {
        return ns;
    }

    public final Set<StatKey<?>> getRenderableAll() {
        return renderableAll;
    }

    public final Set<StatKey<?>> getRenderableIn() {
        return renderableIn;
    }

    public final Set<StatKey<?>> getRenderableOut() {
        return renderableOut;
    }

    public final Set<StatKey<?>> getScreenshareIn() {
        return screenshareIn;
    }

    public final Set<StatKey<?>> getUtil() {
        return util;
    }

    public final Set<StatKey<?>> getVideoIn() {
        return videoIn;
    }

    public final Set<StatKey<?>> getVideoOut() {
        return videoOut;
    }
}
