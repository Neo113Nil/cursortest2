package ru.ok.android.externcalls.sdk.stat;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.SelfRefKeyProp;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import ru.ok.android.webrtc.topology.CallTopology;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.b09;
import xsna.epx;
import xsna.fpf0;
import xsna.gzs;
import xsna.j5g;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.u11;
import xsna.wzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Media extends StatGroup {
    public static final Media INSTANCE = new Media();

    /* compiled from: Stats.kt */
    public static final class AudioRecv extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final AudioRecv INSTANCE;
        private static final KeyProp bitrateEma$delegate;
        private static final KeyProp bitrateInstant$delegate;
        private static final KeyProp bytesReceived$delegate;
        private static final KeyProp codecName$delegate;
        private static final KeyProp concealedSamples$delegate;
        private static final KeyProp concealmentEvents$delegate;
        private static final KeyProp insertedSamplesForDeceleration$delegate;
        private static final KeyProp jitterBufferMs$delegate;
        private static final KeyProp packetsDiscarded$delegate;
        private static final KeyProp packetsLost$delegate;
        private static final KeyProp packetsReceived$delegate;
        private static final KeyProp payloadType$delegate;
        private static final KeyProp removedSamplesForAcceleration$delegate;
        private static final KeyProp sdpFmtp$delegate;
        private static final KeyProp silentConcealedSamples$delegate;
        private static final KeyProp ssrc$delegate;
        private static final KeyProp totalSamplesReceived$delegate;
        private static final KeyProp trackId$delegate;

        /* compiled from: Stats.kt */
        public static final class Loss extends StatGroup {
            static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
            public static final Loss INSTANCE;
            private static final KeyProp concealedPrcEma$delegate;
            private static final KeyProp concealedSamplesInstant$delegate;
            private static final KeyProp discardedInstant$delegate;
            private static final KeyProp discardedPrcEma$delegate;
            private static final KeyProp lossPrcEma$delegate;
            private static final KeyProp lostInstant$delegate;
            private static final KeyProp recvInstant$delegate;
            private static final KeyProp totalSamplesInstant$delegate;

            static {
                qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Loss.class, "recvInstant", "getRecvInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Loss.class, "lostInstant", "getLostInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Loss.class, "lossPrcEma", "getLossPrcEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Loss.class, "discardedInstant", "getDiscardedInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Loss.class, "discardedPrcEma", "getDiscardedPrcEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Loss.class, "concealedSamplesInstant", "getConcealedSamplesInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Loss.class, "totalSamplesInstant", "getTotalSamplesInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Loss.class, "concealedPrcEma", "getConcealedPrcEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
                $$delegatedProperties = qcyVarArr;
                Loss loss = new Loss();
                INSTANCE = loss;
                AudioRecv audioRecv = AudioRecv.INSTANCE;
                final StatKey<BigInteger> packetsReceived = audioRecv.getPacketsReceived();
                KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, false, false, true, false, 23, null);
                SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
                final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(keyPropBehavior, false, false, true, false, false, 27, null);
                recvInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$1

                    /* compiled from: Stats.kt */
                    /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$1$1, reason: invalid class name */
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
                            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$.inlined.perSecondBigInteger.default.1.1.1
                                @Override // xsna.gzs
                                public final String invoke() {
                                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                                }
                            });
                        }

                        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                        public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                            StatValue previousValue;
                            BigInteger bigInteger;
                            Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                            if (l != null) {
                                long longValue = l.longValue();
                                if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                    return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                        simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsReceived));
                        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                        return simpleKeyProp;
                    }
                }.provideDelegate(loss, qcyVarArr[0]);
                final StatKey<BigInteger> packetsLost = audioRecv.getPacketsLost();
                final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
                lostInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$2

                    /* compiled from: Stats.kt */
                    /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$2$1, reason: invalid class name */
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
                            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$.inlined.perSecondBigInteger.default.2.1.1
                                @Override // xsna.gzs
                                public final String invoke() {
                                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                                }
                            });
                        }

                        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                        public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                            StatValue previousValue;
                            BigInteger bigInteger;
                            Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                            if (l != null) {
                                long longValue = l.longValue();
                                if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                    return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                        simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsLost));
                        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                        return simpleKeyProp;
                    }
                }.provideDelegate(loss, qcyVarArr[1]);
                StatKey<Double> recvInstant = loss.getRecvInstant();
                StatKey<Double> lostInstant = loss.getLostInstant();
                KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, false, false, false, false, 31, null);
                SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
                lossPrcEma$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior2, false, false, true, false, false, 27, null), recvInstant, lostInstant, 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) loss, qcyVarArr[2]);
                final StatKey<BigInteger> packetsDiscarded = audioRecv.getPacketsDiscarded();
                final KeyPropBehavior copy$default3 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
                discardedInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$3

                    /* compiled from: Stats.kt */
                    /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecondBigInteger$default$3$1, reason: invalid class name */
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
                            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$.inlined.perSecondBigInteger.default.3.1.1
                                @Override // xsna.gzs
                                public final String invoke() {
                                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                                }
                            });
                        }

                        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                        public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                            StatValue previousValue;
                            BigInteger bigInteger;
                            Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                            if (l != null) {
                                long longValue = l.longValue();
                                if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                    return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                        simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsDiscarded));
                        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                        return simpleKeyProp;
                    }
                }.provideDelegate(loss, qcyVarArr[3]);
                discardedPrcEma$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), loss.getRecvInstant(), loss.getDiscardedInstant(), 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) loss, qcyVarArr[4]);
                final StatKey<Long> concealedSamples = audioRecv.getConcealedSamples();
                final KeyPropBehavior copy$default4 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
                concealedSamplesInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecond$default$1

                    /* compiled from: Stats.kt */
                    /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecond$default$1$1, reason: invalid class name */
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
                            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$.inlined.perSecond.default.1.1.1
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
                        simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, concealedSamples));
                        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                        return simpleKeyProp;
                    }
                }.provideDelegate(loss, qcyVarArr[5]);
                final StatKey<Long> totalSamplesReceived = audioRecv.getTotalSamplesReceived();
                final KeyPropBehavior copy$default5 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null);
                totalSamplesInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecond$default$2

                    /* compiled from: Stats.kt */
                    /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$$inlined$perSecond$default$2$1, reason: invalid class name */
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
                            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$Loss$special$.inlined.perSecond.default.2.1.1
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
                        simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, totalSamplesReceived));
                        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                        return simpleKeyProp;
                    }
                }.provideDelegate(loss, qcyVarArr[6]);
                concealedPrcEma$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), loss.getTotalSamplesInstant(), loss.getConcealedSamplesInstant(), 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) loss, qcyVarArr[7]);
            }

            private Loss() {
                super(BadConnectionSignaling.KEY_BAD_NET_LOSS, AudioRecv.INSTANCE, null);
            }

            public final StatKey<Double> getConcealedPrcEma() {
                return (StatKey) concealedPrcEma$delegate.getValue(this, $$delegatedProperties[7]);
            }

            public final StatKey<Double> getConcealedSamplesInstant() {
                return (StatKey) concealedSamplesInstant$delegate.getValue(this, $$delegatedProperties[5]);
            }

            public final StatKey<Double> getDiscardedInstant() {
                return (StatKey) discardedInstant$delegate.getValue(this, $$delegatedProperties[3]);
            }

            public final StatKey<Double> getDiscardedPrcEma() {
                return (StatKey) discardedPrcEma$delegate.getValue(this, $$delegatedProperties[4]);
            }

            public final StatKey<Double> getLossPrcEma() {
                return (StatKey) lossPrcEma$delegate.getValue(this, $$delegatedProperties[2]);
            }

            public final StatKey<Double> getLostInstant() {
                return (StatKey) lostInstant$delegate.getValue(this, $$delegatedProperties[1]);
            }

            public final StatKey<Double> getRecvInstant() {
                return (StatKey) recvInstant$delegate.getValue(this, $$delegatedProperties[0]);
            }

            public final StatKey<Double> getTotalSamplesInstant() {
                return (StatKey) totalSamplesInstant$delegate.getValue(this, $$delegatedProperties[6]);
            }
        }

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_TOTAL_SAMPLES_RECEIVED, "getTotalSamplesReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, AudioRecv.class, RTCStatsConstants.KEY_INSERTED_SAMPLES_FOR_DECELERATION, "getInsertedSamplesForDeceleration()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_REMOVED_SAMPLES_FOR_ACCELERATION, "getRemovedSamplesForAcceleration()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_CONCEALED_SAMPLES, "getConcealedSamples()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_SILENT_CONCEALED_SAMPLES, "getSilentConcealedSamples()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_CONCEALMENT_EVENTS, "getConcealmentEvents()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "packetsReceived", "getPacketsReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "packetsLost", "getPacketsLost()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_PACKETS_DISCARDED, "getPacketsDiscarded()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "bytesReceived", "getBytesReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "jitterBufferMs", "getJitterBufferMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "bitrateInstant", "getBitrateInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "bitrateEma", "getBitrateEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "codecName", "getCodecName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "sdpFmtp", "getSdpFmtp()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, RTCStatsConstants.KEY_PAYLOAD_TYPE, "getPayloadType()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "ssrc", "getSsrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioRecv.class, "trackId", "getTrackId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            AudioRecv audioRecv = new AudioRecv();
            INSTANCE = audioRecv;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 29, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            totalSamplesReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.totalSamplesReceived);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            insertedSamplesForDeceleration$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.insertedSamplesForDeceleration);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            removedSamplesForAcceleration$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.removedSamplesForAcceleration);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            concealedSamples$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.concealedSamples);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            silentConcealedSamples$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.silentConcealedSamples);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            concealmentEvents$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.concealmentEvents);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[5]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$7

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$7$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.7.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.packetsReceived;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[6]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsLost$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$8

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$8$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.8.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.packetsLost;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[7]);
            final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsDiscarded$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$9

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$9$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.9.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.packetsDiscarded;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[8]);
            final KeyPropBehavior keyPropBehavior10 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            bytesReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$10

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$10$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.10.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.bytesReceived;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[9]);
            final KeyPropBehavior keyPropBehavior11 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            jitterBufferMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.jitterBufferMs);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[10]);
            final StatKey<BigInteger> bytesReceived = audioRecv.getBytesReceived();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            bitrateInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$perSecondBigInteger$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$perSecondBigInteger$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.perSecondBigInteger.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf((r5.subtract(bigInteger).longValue() * 8) / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesReceived));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[11]);
            StatKey<Double> bitrateInstant = audioRecv.getBitrateInstant();
            KeyPropBehavior keyPropBehavior12 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
            bitrateEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior12, false, false, true, false, false, 27, null), bitrateInstant, 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) audioRecv, qcyVarArr[12]);
            final KeyPropBehavior keyPropBehavior13 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$11

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$11$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.11.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.codecInfo.codecName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[13]);
            final KeyPropBehavior keyPropBehavior14 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            sdpFmtp$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$12

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$12$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.12.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.codecInfo.sdpFmtpLine;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[14]);
            final KeyPropBehavior keyPropBehavior15 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            payloadType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$13

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$13$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.13.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.codecInfo.payloadType);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[15]);
            final KeyPropBehavior keyPropBehavior16 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            ssrc$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$14

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$14$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.14.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return Long.valueOf(audioRecv.ssrc);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[16]);
            final KeyPropBehavior keyPropBehavior17 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            trackId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$15

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$$inlined$prim$15$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioRecv$special$.inlined.prim.15.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        List<Ssrc.AudioRecv> list;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        Ssrc.AudioRecv audioRecv = (ssrcSplit == null || (list = ssrcSplit.incomingAudio) == null) ? null : (Ssrc.AudioRecv) j5g.a0(list);
                        if (audioRecv != null) {
                            return audioRecv.trackId;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioRecv, qcyVarArr[17]);
        }

        private AudioRecv() {
            super("audioIn", Media.INSTANCE, null);
        }

        private final <T> j7e0<StatGroup, KeyProp<T>> prim(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.AudioRecv, ? super InnerExtractionContext, ? extends T> wzsVar) {
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public static /* synthetic */ j7e0 prim$default(AudioRecv audioRecv, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$audioIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public final StatKey<Double> getBitrateEma() {
            return (StatKey) bitrateEma$delegate.getValue(this, $$delegatedProperties[12]);
        }

        public final StatKey<Double> getBitrateInstant() {
            return (StatKey) bitrateInstant$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<BigInteger> getBytesReceived() {
            return (StatKey) bytesReceived$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<String> getCodecName() {
            return (StatKey) codecName$delegate.getValue(this, $$delegatedProperties[13]);
        }

        public final StatKey<Long> getConcealedSamples() {
            return (StatKey) concealedSamples$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Long> getConcealmentEvents() {
            return (StatKey) concealmentEvents$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Long> getInsertedSamplesForDeceleration() {
            return (StatKey) insertedSamplesForDeceleration$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Long> getJitterBufferMs() {
            return (StatKey) jitterBufferMs$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<BigInteger> getPacketsDiscarded() {
            return (StatKey) packetsDiscarded$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<BigInteger> getPacketsLost() {
            return (StatKey) packetsLost$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<BigInteger> getPacketsReceived() {
            return (StatKey) packetsReceived$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<Long> getPayloadType() {
            return (StatKey) payloadType$delegate.getValue(this, $$delegatedProperties[15]);
        }

        public final StatKey<Long> getRemovedSamplesForAcceleration() {
            return (StatKey) removedSamplesForAcceleration$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<String> getSdpFmtp() {
            return (StatKey) sdpFmtp$delegate.getValue(this, $$delegatedProperties[14]);
        }

        public final StatKey<Long> getSilentConcealedSamples() {
            return (StatKey) silentConcealedSamples$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Long> getSsrc() {
            return (StatKey) ssrc$delegate.getValue(this, $$delegatedProperties[16]);
        }

        public final StatKey<Long> getTotalSamplesReceived() {
            return (StatKey) totalSamplesReceived$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<String> getTrackId() {
            return (StatKey) trackId$delegate.getValue(this, $$delegatedProperties[17]);
        }
    }

    /* compiled from: Stats.kt */
    public static final class AudioSend extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final AudioSend INSTANCE;
        private static final KeyProp bitrateEma$delegate;
        private static final KeyProp bitrateInstant$delegate;
        private static final KeyProp bytesSent$delegate;
        private static final KeyProp codecName$delegate;
        private static final KeyProp lossPrc$delegate;
        private static final KeyProp lostPerSec$delegate;
        private static final KeyProp packetsLost$delegate;
        private static final KeyProp packetsSent$delegate;
        private static final KeyProp payloadType$delegate;
        private static final KeyProp sdpFmtp$delegate;
        private static final KeyProp sentPerSec$delegate;
        private static final KeyProp ssrc$delegate;
        private static final KeyProp trackId$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(AudioSend.class, "packetsSent", "getPacketsSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, AudioSend.class, "packetsLost", "getPacketsLost()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(AudioSend.class, "bytesSent", "getBytesSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "bitrateInstant", "getBitrateInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "bitrateEma", "getBitrateEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "sentPerSec", "getSentPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "lostPerSec", "getLostPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "lossPrc", "getLossPrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "codecName", "getCodecName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "sdpFmtp", "getSdpFmtp()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, RTCStatsConstants.KEY_PAYLOAD_TYPE, "getPayloadType()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "ssrc", "getSsrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(AudioSend.class, "trackId", "getTrackId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            AudioSend audioSend = new AudioSend();
            INSTANCE = audioSend;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 13, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            packetsSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.packetsSent;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsLost$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.packetsLost;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            bytesSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.bytesSent;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[2]);
            final StatKey<BigInteger> bytesSent = audioSend.getBytesSent();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            bitrateInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.perSecondBigInteger.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf((r5.subtract(bigInteger).longValue() * 8) / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesSent));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[3]);
            StatKey<Double> bitrateInstant = audioSend.getBitrateInstant();
            KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
            bitrateEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior4, false, false, true, false, false, 27, null), bitrateInstant, 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) audioSend, qcyVarArr[4]);
            final StatKey<BigInteger> packetsSent = audioSend.getPacketsSent();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            sentPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$default$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.perSecondBigInteger.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsSent));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[5]);
            final StatKey<BigInteger> packetsLost = audioSend.getPacketsLost();
            final KeyPropBehavior copy$default3 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            lostPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$perSecondBigInteger$default$2$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.perSecondBigInteger.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsLost));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[6]);
            lossPrc$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), audioSend.getSentPerSec(), audioSend.getLostPerSec(), 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) audioSend, qcyVarArr[7]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.codecInfo.codecName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[8]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            sdpFmtp$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.codecInfo.sdpFmtpLine;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[9]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            payloadType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return Long.valueOf(audioSend.codecInfo.payloadType);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[10]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            ssrc$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$7

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$7$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.7.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return Long.valueOf(audioSend.ssrc);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[11]);
            final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            trackId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$8

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$$inlined$prim$8$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$AudioSend$special$.inlined.prim.8.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.AudioSend audioSend;
                        List<Ssrc.AudioSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingAudio) == null) {
                            audioSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            audioSend = (Ssrc.AudioSend) t;
                        }
                        if (audioSend != null) {
                            return audioSend.trackId;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(audioSend, qcyVarArr[12]);
        }

        private AudioSend() {
            super("audioOut", Media.INSTANCE, null);
        }

        private final <T> j7e0<StatGroup, KeyProp<T>> prim(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.AudioSend, ? super InnerExtractionContext, ? extends T> wzsVar) {
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$audioOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public static /* synthetic */ j7e0 prim$default(AudioSend audioSend, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$audioOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public final StatKey<Double> getBitrateEma() {
            return (StatKey) bitrateEma$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Double> getBitrateInstant() {
            return (StatKey) bitrateInstant$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<BigInteger> getBytesSent() {
            return (StatKey) bytesSent$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<String> getCodecName() {
            return (StatKey) codecName$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<Double> getLossPrc() {
            return (StatKey) lossPrc$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<Double> getLostPerSec() {
            return (StatKey) lostPerSec$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<BigInteger> getPacketsLost() {
            return (StatKey) packetsLost$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<BigInteger> getPacketsSent() {
            return (StatKey) packetsSent$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<Long> getPayloadType() {
            return (StatKey) payloadType$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<String> getSdpFmtp() {
            return (StatKey) sdpFmtp$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<Double> getSentPerSec() {
            return (StatKey) sentPerSec$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Long> getSsrc() {
            return (StatKey) ssrc$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<String> getTrackId() {
            return (StatKey) trackId$delegate.getValue(this, $$delegatedProperties[12]);
        }
    }

    /* compiled from: Stats.kt */
    public static final class VideoRecv extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final VideoRecv INSTANCE;
        private static final KeyProp bitrateEma$delegate;
        private static final KeyProp bitrateInstant$delegate;
        private static final KeyProp bytesReceived$delegate;
        private static final KeyProp codecImplName$delegate;
        private static final KeyProp codecName$delegate;
        private static final KeyProp decodeFpsEma$delegate;
        private static final KeyProp decodeFpsInstant$delegate;
        private static final KeyProp firSent$delegate;
        private static final KeyProp frameHeight$delegate;
        private static final KeyProp frameWidth$delegate;
        private static final KeyProp framesDecoded$delegate;
        private static final KeyProp framesDropped$delegate;
        private static final KeyProp framesReceived$delegate;
        private static final KeyProp freezeCount$delegate;
        private static final KeyProp freezeDuration$delegate;
        private static final KeyProp jitterBufferMs$delegate;
        private static final KeyProp lossPrc$delegate;
        private static final KeyProp lostPerSec$delegate;
        private static final KeyProp nacksSent$delegate;
        private static final KeyProp packetsLost$delegate;
        private static final KeyProp packetsReceived$delegate;
        private static final KeyProp payloadType$delegate;
        private static final KeyProp pliSent$delegate;
        private static final KeyProp recvInstant$delegate;
        private static final KeyProp sdpFmtp$delegate;
        private static final KeyProp ssrc$delegate;
        private static final KeyProp trackId$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(VideoRecv.class, "nacksSent", "getNacksSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, VideoRecv.class, "pliSent", "getPliSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(VideoRecv.class, "firSent", "getFirSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FRAMES_DECODED, "getFramesDecoded()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FRAMES_RECEIVED, "getFramesReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FRAME_HEIGHT, "getFrameHeight()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FRAME_WIDTH, "getFrameWidth()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FRAMES_DROPPED, "getFramesDropped()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_FREEZE_COUNT, "getFreezeCount()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "freezeDuration", "getFreezeDuration()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "decodeFpsInstant", "getDecodeFpsInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "decodeFpsEma", "getDecodeFpsEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "packetsReceived", "getPacketsReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "packetsLost", "getPacketsLost()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "bytesReceived", "getBytesReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "jitterBufferMs", "getJitterBufferMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "bitrateInstant", "getBitrateInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "bitrateEma", "getBitrateEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "recvInstant", "getRecvInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "lostPerSec", "getLostPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "lossPrc", "getLossPrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "codecName", "getCodecName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "codecImplName", "getCodecImplName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "sdpFmtp", "getSdpFmtp()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, RTCStatsConstants.KEY_PAYLOAD_TYPE, "getPayloadType()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "ssrc", "getSsrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoRecv.class, "trackId", "getTrackId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            VideoRecv videoRecv = new VideoRecv();
            INSTANCE = videoRecv;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 29, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            nacksSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.nacksSent);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            pliSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.pliSent);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            firSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.firSent);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesDecoded$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.framesDecoded);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.framesReceived);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameHeight$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.frameHeight);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[5]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameWidth$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.frameWidth);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[6]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesDropped$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.framesDropped);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[7]);
            final KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            freezeCount$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$7

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$7$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.7.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.freezeCount);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[8]);
            final KeyPropBehavior keyPropBehavior10 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            freezeDuration$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$8

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$8$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.8.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.totalFreezesDurationMs);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[9]);
            final StatKey<Long> framesDecoded = videoRecv.getFramesDecoded();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            decodeFpsInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecond$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecond$default$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.perSecond.default.1.1.1
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
            }.provideDelegate(videoRecv, qcyVarArr[10]);
            StatKey<Double> decodeFpsInstant = videoRecv.getDecodeFpsInstant();
            KeyPropBehavior keyPropBehavior11 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
            decodeFpsEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior11, false, false, true, false, false, 27, null), decodeFpsInstant, 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoRecv, qcyVarArr[11]);
            final KeyPropBehavior keyPropBehavior12 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$9

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$9$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.9.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.packetsReceived;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[12]);
            final KeyPropBehavior keyPropBehavior13 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsLost$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$10

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$10$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.10.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.packetsLost;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[13]);
            final KeyPropBehavior keyPropBehavior14 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            bytesReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$11

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$11$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.11.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.bytesReceived;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[14]);
            final KeyPropBehavior keyPropBehavior15 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            jitterBufferMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$default$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.default.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.jitterBufferMs);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[15]);
            final StatKey<BigInteger> bytesReceived = videoRecv.getBytesReceived();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            bitrateInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.perSecondBigInteger.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf((r5.subtract(bigInteger).longValue() * 8) / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesReceived));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[16]);
            bitrateEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), videoRecv.getBitrateInstant(), 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoRecv, qcyVarArr[17]);
            final StatKey<BigInteger> packetsReceived = videoRecv.getPacketsReceived();
            final KeyPropBehavior copy$default3 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            recvInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$default$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.perSecondBigInteger.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsReceived));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[18]);
            final StatKey<BigInteger> packetsLost = videoRecv.getPacketsLost();
            final KeyPropBehavior copy$default4 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            lostPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$perSecondBigInteger$default$2$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.perSecondBigInteger.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsLost));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[19]);
            lossPrc$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), videoRecv.getRecvInstant(), videoRecv.getLostPerSec(), 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoRecv, qcyVarArr[20]);
            final KeyPropBehavior keyPropBehavior16 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$12

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$12$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.12.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.codecInfo.codecName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[21]);
            final KeyPropBehavior keyPropBehavior17 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecImplName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$13

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$13$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.13.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.codecInfo.codecImplName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[22]);
            final KeyPropBehavior keyPropBehavior18 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            sdpFmtp$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$14

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$14$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.14.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.codecInfo.sdpFmtpLine;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[23]);
            final KeyPropBehavior keyPropBehavior19 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            payloadType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$15

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$15$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.15.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.codecInfo.payloadType);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[24]);
            final KeyPropBehavior keyPropBehavior20 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            ssrc$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$16

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$16$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.16.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return Long.valueOf(videoRecv.ssrc);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[25]);
            final KeyPropBehavior keyPropBehavior21 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            trackId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$17

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$$inlined$prim$17$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoRecv$special$.inlined.prim.17.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoRecv videoRecv;
                        List<Ssrc.VideoRecv> list;
                        T t;
                        CallVideoTrackParticipantKey keyByWebrtcTrackId;
                        ParticipantId participantId = innerExtractionContext.participantId();
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.incomingVideo) == null) {
                            videoRecv = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                Ssrc.VideoRecv videoRecv2 = (Ssrc.VideoRecv) t;
                                CallTopology topology = statPack.getTopology();
                                CallParticipant.ParticipantId participantId2 = (topology == null || (keyByWebrtcTrackId = topology.keyByWebrtcTrackId(videoRecv2.trackId)) == null) ? null : keyByWebrtcTrackId.getParticipantId();
                                if (participantId != null ? participantId.equals(participantId2 != null ? StatsKt.toExternal(participantId2, innerExtractionContext) : null) : false) {
                                    break;
                                }
                            }
                            videoRecv = t;
                        }
                        if (videoRecv != null) {
                            return videoRecv.trackId;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoRecv, qcyVarArr[26]);
        }

        private VideoRecv() {
            super("videoIn", Media.INSTANCE, null);
        }

        private final <T> j7e0<StatGroup, KeyProp<T>> prim(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.VideoRecv, ? super InnerExtractionContext, ? extends T> wzsVar) {
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$participantVideoIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public static /* synthetic */ j7e0 prim$default(VideoRecv videoRecv, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$participantVideoIn$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public final StatKey<Double> getBitrateEma() {
            return (StatKey) bitrateEma$delegate.getValue(this, $$delegatedProperties[17]);
        }

        public final StatKey<Double> getBitrateInstant() {
            return (StatKey) bitrateInstant$delegate.getValue(this, $$delegatedProperties[16]);
        }

        public final StatKey<BigInteger> getBytesReceived() {
            return (StatKey) bytesReceived$delegate.getValue(this, $$delegatedProperties[14]);
        }

        public final StatKey<String> getCodecImplName() {
            return (StatKey) codecImplName$delegate.getValue(this, $$delegatedProperties[22]);
        }

        public final StatKey<String> getCodecName() {
            return (StatKey) codecName$delegate.getValue(this, $$delegatedProperties[21]);
        }

        public final StatKey<Double> getDecodeFpsEma() {
            return (StatKey) decodeFpsEma$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<Double> getDecodeFpsInstant() {
            return (StatKey) decodeFpsInstant$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<Long> getFirSent() {
            return (StatKey) firSent$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<Long> getFrameHeight() {
            return (StatKey) frameHeight$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Long> getFrameWidth() {
            return (StatKey) frameWidth$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<Long> getFramesDecoded() {
            return (StatKey) framesDecoded$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Long> getFramesDropped() {
            return (StatKey) framesDropped$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<Long> getFramesReceived() {
            return (StatKey) framesReceived$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Long> getFreezeCount() {
            return (StatKey) freezeCount$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<Long> getFreezeDuration() {
            return (StatKey) freezeDuration$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<Long> getJitterBufferMs() {
            return (StatKey) jitterBufferMs$delegate.getValue(this, $$delegatedProperties[15]);
        }

        public final StatKey<Double> getLossPrc() {
            return (StatKey) lossPrc$delegate.getValue(this, $$delegatedProperties[20]);
        }

        public final StatKey<Double> getLostPerSec() {
            return (StatKey) lostPerSec$delegate.getValue(this, $$delegatedProperties[19]);
        }

        public final StatKey<Long> getNacksSent() {
            return (StatKey) nacksSent$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<BigInteger> getPacketsLost() {
            return (StatKey) packetsLost$delegate.getValue(this, $$delegatedProperties[13]);
        }

        public final StatKey<BigInteger> getPacketsReceived() {
            return (StatKey) packetsReceived$delegate.getValue(this, $$delegatedProperties[12]);
        }

        public final StatKey<Long> getPayloadType() {
            return (StatKey) payloadType$delegate.getValue(this, $$delegatedProperties[24]);
        }

        public final StatKey<Long> getPliSent() {
            return (StatKey) pliSent$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<Double> getRecvInstant() {
            return (StatKey) recvInstant$delegate.getValue(this, $$delegatedProperties[18]);
        }

        public final StatKey<String> getSdpFmtp() {
            return (StatKey) sdpFmtp$delegate.getValue(this, $$delegatedProperties[23]);
        }

        public final StatKey<Long> getSsrc() {
            return (StatKey) ssrc$delegate.getValue(this, $$delegatedProperties[25]);
        }

        public final StatKey<String> getTrackId() {
            return (StatKey) trackId$delegate.getValue(this, $$delegatedProperties[26]);
        }
    }

    /* compiled from: Stats.kt */
    public static final class VideoSend extends StatGroup {
        static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
        public static final VideoSend INSTANCE;
        private static final KeyProp adaptationChanges$delegate;
        private static final KeyProp avgEncodeMs$delegate;
        private static final KeyProp bitrateEma$delegate;
        private static final KeyProp bitrateInstant$delegate;
        private static final KeyProp bytesSent$delegate;
        private static final KeyProp codecImplName$delegate;
        private static final KeyProp codecName$delegate;
        private static final KeyProp encFpsEma$delegate;
        private static final KeyProp encFpsInstant$delegate;
        private static final KeyProp firReceived$delegate;
        private static final KeyProp frameHeight$delegate;
        private static final KeyProp frameWidth$delegate;
        private static final KeyProp framesEncoded$delegate;
        private static final KeyProp lossPrc$delegate;
        private static final KeyProp lostPerSec$delegate;
        private static final KeyProp nacksReceived$delegate;
        private static final KeyProp packetsLost$delegate;
        private static final KeyProp packetsSent$delegate;
        private static final KeyProp payloadType$delegate;
        private static final KeyProp pliReceived$delegate;
        private static final KeyProp sdpFmtp$delegate;
        private static final KeyProp sentPerSec$delegate;
        private static final KeyProp ssrc$delegate;
        private static final KeyProp trackId$delegate;

        static {
            qcy<?>[] qcyVarArr = {new PropertyReference1Impl(VideoSend.class, "nacksReceived", "getNacksReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, VideoSend.class, "pliReceived", "getPliReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(VideoSend.class, "firReceived", "getFirReceived()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, RTCStatsConstants.KEY_FRAMES_ENCODED, "getFramesEncoded()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "adaptationChanges", "getAdaptationChanges()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "avgEncodeMs", "getAvgEncodeMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, RTCStatsConstants.KEY_FRAME_WIDTH, "getFrameWidth()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, RTCStatsConstants.KEY_FRAME_HEIGHT, "getFrameHeight()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "encFpsInstant", "getEncFpsInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "encFpsEma", "getEncFpsEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "packetsSent", "getPacketsSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "packetsLost", "getPacketsLost()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "bytesSent", "getBytesSent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "bitrateInstant", "getBitrateInstant()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "bitrateEma", "getBitrateEma()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "sentPerSec", "getSentPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "lostPerSec", "getLostPerSec()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "lossPrc", "getLossPrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "codecName", "getCodecName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "codecImplName", "getCodecImplName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "sdpFmtp", "getSdpFmtp()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, RTCStatsConstants.KEY_PAYLOAD_TYPE, "getPayloadType()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "ssrc", "getSsrc()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(VideoSend.class, "trackId", "getTrackId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
            $$delegatedProperties = qcyVarArr;
            VideoSend videoSend = new VideoSend();
            INSTANCE = videoSend;
            final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(false, true, false, false, false, 29, null);
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            nacksReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.nacksReceived);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[0]);
            final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            pliReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.pliReceived);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[1]);
            final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            firReceived$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.firReceived);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[2]);
            final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(false, true, false, false, false, 29, null);
            framesEncoded$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.framesEncoded);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[3]);
            final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            adaptationChanges$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$1$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.adaptationChanges);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[4]);
            final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            avgEncodeMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$2$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.avgEncodeMs);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[5]);
            final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameWidth$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$3

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$3$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.default.3.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.frameWidth);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[6]);
            final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            frameHeight$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$4

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$default$4$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.default.4.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.frameHeight);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[7]);
            final StatKey<Long> framesEncoded = videoSend.getFramesEncoded();
            final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            encFpsInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecond$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecond$default$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.perSecond.default.1.1.1
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, framesEncoded));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[8]);
            StatKey<Double> encFpsInstant = videoSend.getEncFpsInstant();
            KeyPropBehavior keyPropBehavior9 = new KeyPropBehavior(false, false, false, false, false, 31, null);
            SelfRefKeyProp.Companion companion2 = SelfRefKeyProp.Companion;
            encFpsEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(keyPropBehavior9, false, false, true, false, false, 27, null), encFpsInstant, 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoSend, qcyVarArr[9]);
            final KeyPropBehavior keyPropBehavior10 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$5

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$5$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.5.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.packetsSent;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[10]);
            final KeyPropBehavior keyPropBehavior11 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            packetsLost$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$6

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$6$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.6.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.packetsLost;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[11]);
            final KeyPropBehavior keyPropBehavior12 = new KeyPropBehavior(false, true, false, false, false, 13, null);
            bytesSent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$7

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$7$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.7.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.bytesSent;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[12]);
            final StatKey<BigInteger> bytesSent = videoSend.getBytesSent();
            final KeyPropBehavior copy$default2 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            bitrateInstant$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.perSecondBigInteger.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf((r5.subtract(bigInteger).longValue() * 8) / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, bytesSent));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[13]);
            bitrateEma$delegate = (KeyProp) new StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), videoSend.getBitrateInstant(), 0.3d).provideDelegate((StatsKt$ema$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoSend, qcyVarArr[14]);
            final StatKey<BigInteger> packetsSent = videoSend.getPacketsSent();
            final KeyPropBehavior copy$default3 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            sentPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$default$1

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$default$1$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.perSecondBigInteger.default.1.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsSent));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[15]);
            final StatKey<BigInteger> packetsLost = videoSend.getPacketsLost();
            final KeyPropBehavior copy$default4 = KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, true, false, 23, null), false, false, true, false, false, 27, null);
            lostPerSec$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$default$2

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$perSecondBigInteger$default$2$1, reason: invalid class name */
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
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.perSecondBigInteger.default.2.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        StatValue previousValue;
                        BigInteger bigInteger;
                        Long l = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
                        if (l != null) {
                            long longValue = l.longValue();
                            if (((BigInteger) this.$source$inlined.extract(statPack, innerExtractionContext).getValue()) != null && (previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined)) != null && (bigInteger = (BigInteger) previousValue.getValue()) != null) {
                                return Double.valueOf(r5.subtract(bigInteger).longValue() / (longValue / 1000.0d));
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
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, packetsLost));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[16]);
            lossPrc$delegate = (KeyProp) new StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior.copy$default(new KeyPropBehavior(false, false, false, false, false, 31, null), false, false, true, false, false, 27, null), videoSend.getSentPerSec(), videoSend.getLostPerSec(), 0.3d).provideDelegate((StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1) videoSend, qcyVarArr[17]);
            final KeyPropBehavior keyPropBehavior13 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$8

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$8$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.8.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.codecInfo.codecName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[18]);
            final KeyPropBehavior keyPropBehavior14 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            codecImplName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$9

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$9$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.9.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.codecInfo.codecImplName;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[19]);
            final KeyPropBehavior keyPropBehavior15 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            sdpFmtp$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$10

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$10$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.10.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.codecInfo.sdpFmtpLine;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[20]);
            final KeyPropBehavior keyPropBehavior16 = new KeyPropBehavior(true, false, false, false, false, 30, null);
            payloadType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$11

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$11$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.11.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.codecInfo.payloadType);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[21]);
            final KeyPropBehavior keyPropBehavior17 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            ssrc$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$12

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$12$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.12.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return Long.valueOf(videoSend.ssrc);
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[22]);
            final KeyPropBehavior keyPropBehavior18 = new KeyPropBehavior(true, false, false, false, false, 14, null);
            trackId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$13

                /* compiled from: Stats.kt */
                /* renamed from: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$$inlined$prim$13$1, reason: invalid class name */
                public static final class AnonymousClass1 implements StatKey, StatBehavior {
                    private final /* synthetic */ KeyPropBehavior $$delegate_0;
                    private final Lazy fullName$delegate;
                    private final StatGroup group;
                    private final String name;

                    public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                        this.$$delegate_0 = keyPropBehavior;
                        this.name = str;
                        this.group = statGroup;
                        this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Media$VideoSend$special$.inlined.prim.13.1.1
                            @Override // xsna.gzs
                            public final String invoke() {
                                return pzl.b(StatGroup.this.getFullName(), ".", str);
                            }
                        });
                    }

                    @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                    public Object doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                        Ssrc.VideoSend videoSend;
                        List<Ssrc.VideoSend> list;
                        T t;
                        Ssrc.Pack ssrcSplit = statPack.getSsrcSplit();
                        if (ssrcSplit == null || (list = ssrcSplit.outgoingVideo) == null) {
                            videoSend = null;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = (T) null;
                                    break;
                                }
                                t = it.next();
                                if (epx.f(((Ssrc.Send) t).isMediaShare, Boolean.FALSE)) {
                                    break;
                                }
                            }
                            videoSend = (Ssrc.VideoSend) t;
                        }
                        if (videoSend != null) {
                            return videoSend.trackId;
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
                public final SimpleKeyProp provideDelegate(StatGroup statGroup, qcy qcyVar) {
                    SimpleKeyProp simpleKeyProp = new SimpleKeyProp(null);
                    simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                    statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                    return simpleKeyProp;
                }
            }.provideDelegate(videoSend, qcyVarArr[23]);
        }

        private VideoSend() {
            super("videoOut", Media.INSTANCE, null);
        }

        private final <T> j7e0<StatGroup, KeyProp<T>> prim(KeyPropBehavior keyPropBehavior, wzs<? super Ssrc.VideoSend, ? super InnerExtractionContext, ? extends T> wzsVar) {
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$videoOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public static /* synthetic */ j7e0 prim$default(VideoSend videoSend, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
            return new StatsKt$videoOut$$inlined$keyCreator$calls_sdk_stat_release$1(keyPropBehavior, wzsVar);
        }

        public final StatKey<Long> getAdaptationChanges() {
            return (StatKey) adaptationChanges$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final StatKey<Long> getAvgEncodeMs() {
            return (StatKey) avgEncodeMs$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final StatKey<Double> getBitrateEma() {
            return (StatKey) bitrateEma$delegate.getValue(this, $$delegatedProperties[14]);
        }

        public final StatKey<Double> getBitrateInstant() {
            return (StatKey) bitrateInstant$delegate.getValue(this, $$delegatedProperties[13]);
        }

        public final StatKey<BigInteger> getBytesSent() {
            return (StatKey) bytesSent$delegate.getValue(this, $$delegatedProperties[12]);
        }

        public final StatKey<String> getCodecImplName() {
            return (StatKey) codecImplName$delegate.getValue(this, $$delegatedProperties[19]);
        }

        public final StatKey<String> getCodecName() {
            return (StatKey) codecName$delegate.getValue(this, $$delegatedProperties[18]);
        }

        public final StatKey<Double> getEncFpsEma() {
            return (StatKey) encFpsEma$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final StatKey<Double> getEncFpsInstant() {
            return (StatKey) encFpsInstant$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final StatKey<Long> getFirReceived() {
            return (StatKey) firReceived$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final StatKey<Long> getFrameHeight() {
            return (StatKey) frameHeight$delegate.getValue(this, $$delegatedProperties[7]);
        }

        public final StatKey<Long> getFrameWidth() {
            return (StatKey) frameWidth$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final StatKey<Long> getFramesEncoded() {
            return (StatKey) framesEncoded$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final StatKey<Double> getLossPrc() {
            return (StatKey) lossPrc$delegate.getValue(this, $$delegatedProperties[17]);
        }

        public final StatKey<Double> getLostPerSec() {
            return (StatKey) lostPerSec$delegate.getValue(this, $$delegatedProperties[16]);
        }

        public final StatKey<Long> getNacksReceived() {
            return (StatKey) nacksReceived$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final StatKey<BigInteger> getPacketsLost() {
            return (StatKey) packetsLost$delegate.getValue(this, $$delegatedProperties[11]);
        }

        public final StatKey<BigInteger> getPacketsSent() {
            return (StatKey) packetsSent$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final StatKey<Long> getPayloadType() {
            return (StatKey) payloadType$delegate.getValue(this, $$delegatedProperties[21]);
        }

        public final StatKey<Long> getPliReceived() {
            return (StatKey) pliReceived$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final StatKey<String> getSdpFmtp() {
            return (StatKey) sdpFmtp$delegate.getValue(this, $$delegatedProperties[20]);
        }

        public final StatKey<Double> getSentPerSec() {
            return (StatKey) sentPerSec$delegate.getValue(this, $$delegatedProperties[15]);
        }

        public final StatKey<Long> getSsrc() {
            return (StatKey) ssrc$delegate.getValue(this, $$delegatedProperties[22]);
        }

        public final StatKey<String> getTrackId() {
            return (StatKey) trackId$delegate.getValue(this, $$delegatedProperties[23]);
        }
    }

    private Media() {
        super("webrtcMedia", null, 2, null);
    }
}
