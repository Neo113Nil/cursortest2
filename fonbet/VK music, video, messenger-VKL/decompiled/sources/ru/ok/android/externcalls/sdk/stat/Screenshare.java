package ru.ok.android.externcalls.sdk.stat;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.SelfRefKeyProp;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.protocol.screenshare.recv.ScreenshareRecvStat;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.u11;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Screenshare extends StatGroup {
    public static final Screenshare INSTANCE = new Screenshare();

    /* compiled from: Stats.kt */
    public static final class Recv extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final Recv INSTANCE;
        private static final KeyProp allocatedBuffers$delegate;
        private static final KeyProp allocatedMem$delegate;
        private static final KeyProp codecName$delegate;
        private static final KeyProp completeFrames$delegate;
        private static final KeyProp decodeErrors$delegate;
        private static final KeyProp deltaFramesEnq$delegate;
        private static final KeyProp fpsDecodeEma$delegate;
        private static final KeyProp fpsDecodePerSec$delegate;
        private static final KeyProp fpsRecvEma$delegate;
        private static final KeyProp fpsRecvPerSec$delegate;
        private static final KeyProp frameDecodeErrorEventRateMs$delegate;
        private static final KeyProp frameDecodedEventRateMs$delegate;
        private static final KeyProp frameHeight$delegate;
        private static final KeyProp frameReceivedEventRateMs$delegate;
        private static final KeyProp frameStartsRecv$delegate;
        private static final KeyProp frameWidth$delegate;
        private static final KeyProp framesDecoded$delegate;
        private static final KeyProp framesDroppedOnEnq$delegate;
        private static final KeyProp freezeCount$delegate;
        private static final KeyProp freezeDuration$delegate;
        private static final KeyProp implName$delegate;
        private static final KeyProp keyFramesEnq$delegate;
        private static final KeyProp packetReceivedEventRateMs$delegate;
        private static final KeyProp packetsRecv$delegate;
        private static final KeyProp recvOddities$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Recv.class, "packetsRecv", "getPacketsRecv()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Recv.class, "frameStartsRecv", "getFrameStartsRecv()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Recv.class, "recvOddities", "getRecvOddities()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "completeFrames", "getCompleteFrames()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "keyFramesEnq", "getKeyFramesEnq()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "deltaFramesEnq", "getDeltaFramesEnq()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "framesDroppedOnEnq", "getFramesDroppedOnEnq()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, RTCStatsConstants.KEY_FRAMES_DECODED, "getFramesDecoded()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "decodeErrors", "getDecodeErrors()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "allocatedBuffers", "getAllocatedBuffers()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "allocatedMem", "getAllocatedMem()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "packetReceivedEventRateMs", "getPacketReceivedEventRateMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "frameReceivedEventRateMs", "getFrameReceivedEventRateMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "frameDecodedEventRateMs", "getFrameDecodedEventRateMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "frameDecodeErrorEventRateMs", "getFrameDecodeErrorEventRateMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "codecName", "getCodecName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "implName", "getImplName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, RTCStatsConstants.KEY_FRAME_WIDTH, "getFrameWidth()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, RTCStatsConstants.KEY_FRAME_HEIGHT, "getFrameHeight()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "fpsRecvPerSec", "getFpsRecvPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "fpsRecvEma", "getFpsRecvEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "fpsDecodePerSec", "getFpsDecodePerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "fpsDecodeEma", "getFpsDecodeEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, RTCStatsConstants.KEY_FREEZE_COUNT, "getFreezeCount()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Recv.class, "freezeDuration", "getFreezeDuration()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            Recv recv = new Recv();
            INSTANCE = recv;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 13, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            packetsRecv$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.packetsRecvStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            frameStartsRecv$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.frameStartsRecvStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            recvOddities$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.recvOdditiesStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            completeFrames$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.completeFramesStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            keyFramesEnq$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.keyFramesEnqStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            deltaFramesEnq$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.deltaFramesEnqStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[5]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesDroppedOnEnq$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$7

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$7$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.7.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.framesDroppedOnEnqStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[6]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesDecoded$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$8

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$8$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.8.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.framesDecodedStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[7]);
            final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            decodeErrors$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$9

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$9$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.9.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.decodeErrors);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[8]);
            final KeyPropBehavior keyPropBehavior10 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            allocatedBuffers$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$10

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$10$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.10.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.allocatedBuffersStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[9]);
            final KeyPropBehavior keyPropBehavior11 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            allocatedMem$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$11

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$11$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.11.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.allocatedMemStat);
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[10]);
            final KeyPropBehavior keyPropBehavior12 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            packetReceivedEventRateMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$12

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$12$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.12.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Double.valueOf(screenshareRecvStat2.packetReceivedEventRateMs);
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[11]);
            final KeyPropBehavior keyPropBehavior13 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            frameReceivedEventRateMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$13

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$13$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.13.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Double.valueOf(screenshareRecvStat2.frameReceivedEventRateMs);
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[12]);
            final KeyPropBehavior keyPropBehavior14 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            frameDecodedEventRateMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$14

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$14$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.14.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Double.valueOf(screenshareRecvStat2.frameDecodedEventRateMs);
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[13]);
            final KeyPropBehavior keyPropBehavior15 = new KeyPropBehavior(false, false, false, false, false, 15, null);
            frameDecodeErrorEventRateMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$15

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$15$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.15.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Double.valueOf(screenshareRecvStat2.frameDecodeErrorEventRateMs);
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[14]);
            final KeyPropBehavior keyPropBehavior16 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$16

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$16$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.16.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return screenshareRecvStat2.codecName;
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

                public final SimpleKeyProp<String> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<String> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[15]);
            final KeyPropBehavior keyPropBehavior17 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            implName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$17

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$17$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.17.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return screenshareRecvStat2.implName;
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

                public final SimpleKeyProp<String> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<String> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[16]);
            final KeyPropBehavior keyPropBehavior18 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameWidth$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Integer.valueOf(screenshareRecvStat2.frameWidth);
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[17]);
            final KeyPropBehavior keyPropBehavior19 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameHeight$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Integer.valueOf(screenshareRecvStat2.frameHeight);
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[18]);
            final StatKey<Long> completeFrames = recv.getCompleteFrames();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            fpsRecvPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$perSecond$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$perSecond$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.perSecond.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, completeFrames));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[19]);
            StatKey<Double> fpsRecvPerSec = recv.getFpsRecvPerSec();
            KeyPropBehavior keyPropBehavior20 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
            fpsRecvEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior20, false, false, true, false, false, 27, null), fpsRecvPerSec, 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) recv, qcyVarArr[20]);
            final StatKey<Long> framesDecoded = recv.getFramesDecoded();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            fpsDecodePerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$perSecond$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$perSecond$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    final /* synthetic */ StatKey $source$inlined;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey) {
                        this.$source$inlined = statKey;
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.perSecond.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Long l;
                        Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                            if (l3 != null) {
                                long longValue2 = l3.longValue();
                                StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                                if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                                    return Double.valueOf((longValue2 - l.longValue()) / (longValue / 1000.0d));
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

                public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, framesDecoded));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[21]);
            fpsDecodeEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), recv.getFpsDecodePerSec(), 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) recv, qcyVarArr[22]);
            final KeyPropBehavior keyPropBehavior21 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            freezeCount$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$18

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$18$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Integer>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.18.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Integer doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Integer.valueOf(screenshareRecvStat2.freeze.getFreezeCount());
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[23]);
            final KeyPropBehavior keyPropBehavior22 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            freezeDuration$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$19

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$$inlined$screenshareRecv$19$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Screenshare$Recv$special$.inlined.screenshareRecv.19.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Map<CallParticipant.ParticipantId, ScreenshareRecvStat> screenshareRecvStat = statPack.getScreenshareRecvStat();
                        if (screenshareRecvStat != null) {
                            ParticipantId participantId = innerExtractionContext.participantId();
                            ScreenshareRecvStat screenshareRecvStat2 = screenshareRecvStat.get(participantId != null ? StatsKt.toInternal(participantId, innerExtractionContext) : null);
                            if (screenshareRecvStat2 != null) {
                                return Long.valueOf(screenshareRecvStat2.freeze.getTotalFreezeDuration());
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

                public final SimpleKeyProp<Long> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                    SimpleKeyProp<Long> simpleKeyProp = new SimpleKeyProp<>(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(recv, qcyVarArr[24]);
        }

        private Recv() {
            super("recv", Screenshare.INSTANCE, null);
        }

        public final StatKey<Long> getAllocatedBuffers() {
            return (StatKey) allocatedBuffers$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<Long> getAllocatedMem() {
            return (StatKey) allocatedMem$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<String> getCodecName() {
            return (StatKey) codecName$delegate.getValue(this, $$delegatedProperties[15]);
        }

        public final StatKey<Long> getCompleteFrames() {
            return (StatKey) completeFrames$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Long> getDecodeErrors() {
            return (StatKey) decodeErrors$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<Long> getDeltaFramesEnq() {
            return (StatKey) deltaFramesEnq$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Double> getFpsDecodeEma() {
            return (StatKey) fpsDecodeEma$delegate.getValue(this, $$delegatedProperties[22]);
        }

        public final StatKey<Double> getFpsDecodePerSec() {
            return (StatKey) fpsDecodePerSec$delegate.getValue(this, $$delegatedProperties[21]);
        }

        public final StatKey<Double> getFpsRecvEma() {
            return (StatKey) fpsRecvEma$delegate.getValue(this, $$delegatedProperties[20]);
        }

        public final StatKey<Double> getFpsRecvPerSec() {
            return (StatKey) fpsRecvPerSec$delegate.getValue(this, $$delegatedProperties[19]);
        }

        public final StatKey<Double> getFrameDecodeErrorEventRateMs() {
            return (StatKey) frameDecodeErrorEventRateMs$delegate.getValue(this, $$delegatedProperties[14]);
        }

        public final StatKey<Double> getFrameDecodedEventRateMs() {
            return (StatKey) frameDecodedEventRateMs$delegate.getValue(this, $$delegatedProperties[13]);
        }

        public final StatKey<Integer> getFrameHeight() {
            return (StatKey) frameHeight$delegate.getValue(this, $$delegatedProperties[18]);
        }

        public final StatKey<Double> getFrameReceivedEventRateMs() {
            return (StatKey) frameReceivedEventRateMs$delegate.getValue(this, $$delegatedProperties[12]);
        }

        public final StatKey<Long> getFrameStartsRecv() {
            return (StatKey) frameStartsRecv$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Integer> getFrameWidth() {
            return (StatKey) frameWidth$delegate.getValue(this, $$delegatedProperties[17]);
        }

        public final StatKey<Long> getFramesDecoded() {
            return (StatKey) framesDecoded$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<Long> getFramesDroppedOnEnq() {
            return (StatKey) framesDroppedOnEnq$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<Integer> getFreezeCount() {
            return (StatKey) freezeCount$delegate.getValue(this, $$delegatedProperties[23]);
        }

        public final StatKey<Long> getFreezeDuration() {
            return (StatKey) freezeDuration$delegate.getValue(this, $$delegatedProperties[24]);
        }

        public final StatKey<String> getImplName() {
            return (StatKey) implName$delegate.getValue(this, $$delegatedProperties[16]);
        }

        public final StatKey<Long> getKeyFramesEnq() {
            return (StatKey) keyFramesEnq$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Double> getPacketReceivedEventRateMs() {
            return (StatKey) packetReceivedEventRateMs$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<Long> getPacketsRecv() {
            return (StatKey) packetsRecv$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<Long> getRecvOddities() {
            return (StatKey) recvOddities$delegate.getValue(this, $$delegatedProperties[2]);
        }
    }

    private Screenshare() {
        super("screenshare", null, 2, null);
    }
}
