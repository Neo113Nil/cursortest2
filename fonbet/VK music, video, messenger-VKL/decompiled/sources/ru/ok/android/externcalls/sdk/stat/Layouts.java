package ru.ok.android.externcalls.sdk.stat;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import ru.ok.android.webrtc.layout.VideoDisplayLayout;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.videotracks.VideoTrackType;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Layouts extends StatGroup {
    public static final Layouts INSTANCE = new Layouts();

    /* compiled from: Stats.kt */
    public static final class Screenshare extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Screenshare INSTANCE;
        private static final KeyProp fit$delegate;
        private static final KeyProp height$delegate;
        private static final KeyProp width$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Screenshare.class, "width", "getWidth()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Screenshare.class, "height", "getHeight()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Screenshare.class, "fit", "getFit()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Screenshare screenshare = new Screenshare();
            INSTANCE = screenshare;
            final VideoTrackType videoTrackType = VideoTrackType.SCREEN_CAPTURE;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            width$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$.inlined.layout.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return Integer.valueOf(callDisplayLayoutItem.getLayout().getWidth());
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(screenshare, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            height$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$.inlined.layout.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return Integer.valueOf(callDisplayLayoutItem.getLayout().getHeight());
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(screenshare, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            fit$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$$inlined$layout$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<VideoDisplayLayout.Fit>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Screenshare$special$.inlined.layout.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public VideoDisplayLayout.Fit doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return callDisplayLayoutItem.getLayout().getFit();
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<VideoDisplayLayout.Fit> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<VideoDisplayLayout.Fit> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(screenshare, qcyVarArr[2]);
        }

        private Screenshare() {
            super("screenshare", Layouts.INSTANCE, null);
        }

        public final StatKey<VideoDisplayLayout.Fit> getFit() {
            return (StatKey) fit$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<Integer> getHeight() {
            return (StatKey) height$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Integer> getWidth() {
            return (StatKey) width$delegate.getValue(this, $$delegatedProperties[0]);
        }
    }

    /* compiled from: Stats.kt */
    public static final class Video extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Video INSTANCE;
        private static final KeyProp fit$delegate;
        private static final KeyProp height$delegate;
        private static final KeyProp width$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Video.class, "width", "getWidth()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Video.class, "height", "getHeight()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Video.class, "fit", "getFit()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Video video = new Video();
            INSTANCE = video;
            final VideoTrackType videoTrackType = VideoTrackType.VIDEO;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            width$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$.inlined.layout.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return Integer.valueOf(callDisplayLayoutItem.getLayout().getWidth());
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(video, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            height$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$.inlined.layout.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return Integer.valueOf(callDisplayLayoutItem.getLayout().getHeight());
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<Integer> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Integer> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(video, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            fit$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$$inlined$layout$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<VideoDisplayLayout.Fit>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ VideoTrackType $videoTrackType$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, VideoTrackType videoTrackType) {
                        this.$videoTrackType$inlined = videoTrackType;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Layouts$Video$special$.inlined.layout.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public VideoDisplayLayout.Fit doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        T t;
                        Map<CallParticipant.ParticipantId, List<CallDisplayLayoutItem>> latestLayouts = statPack.getLatestLayouts();
                        if (latestLayouts != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            List<CallDisplayLayoutItem> list = latestLayouts.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (((CallDisplayLayoutItem) t).getVideoTrackParticipantKey().getType() == this.$videoTrackType$inlined) {
                                        break;
                                    }
                                }
                                CallDisplayLayoutItem callDisplayLayoutItem = t;
                                if (callDisplayLayoutItem != null) {
                                    return callDisplayLayoutItem.getLayout().getFit();
                                }
                            }
                        }
                        return null;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getDerived() {
                        return this.$$delegate_0.getDerived();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getFullName() {
                        return (String) this.fullName$delegate.getValue();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public StatGroup getGroup() {
                        return this.group;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getHumanReadable() {
                        return this.$$delegate_0.getHumanReadable();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getMonotonic() {
                        return this.$$delegate_0.getMonotonic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String getName() {
                        return this.name;
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getStatic() {
                        return this.$$delegate_0.getStatic();
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
                    public boolean getSynthetic() {
                        return this.$$delegate_0.getSynthetic();
                    }
                }

                @Override // xsna.j7e0
                public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
                    return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
                }

                public final SimpleKeyProp<VideoDisplayLayout.Fit> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<VideoDisplayLayout.Fit> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, videoTrackType));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(video, qcyVarArr[2]);
        }

        private Video() {
            super("video", Layouts.INSTANCE, null);
        }

        public final StatKey<VideoDisplayLayout.Fit> getFit() {
            return (StatKey) fit$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<Integer> getHeight() {
            return (StatKey) height$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Integer> getWidth() {
            return (StatKey) width$delegate.getValue(this, $$delegatedProperties[0]);
        }
    }

    private Layouts() {
        super(TtmlNode.TAG_LAYOUT, null, 2, null);
    }
}
