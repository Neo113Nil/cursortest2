package ru.ok.android.externcalls.sdk.stat;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.rtc.CandidatePair;
import ru.ok.android.webrtc.stat.rtc.RTCStat;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Connection extends StatGroup {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
    public static final Connection INSTANCE;
    private static final KeyProp channelId$delegate;
    private static final KeyProp localAddress$delegate;
    private static final KeyProp localCandidateType$delegate;
    private static final KeyProp pairName$delegate;
    private static final KeyProp remoteAddress$delegate;
    private static final KeyProp remoteCandidateType$delegate;
    private static final KeyProp rtt$delegate;
    private static final KeyProp transport$delegate;

    static {
        qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Connection.class, "pairName", "getPairName()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Connection.class, "localCandidateType", "getLocalCandidateType()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Connection.class, "localAddress", "getLocalAddress()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Connection.class, "remoteCandidateType", "getRemoteCandidateType()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Connection.class, "remoteAddress", "getRemoteAddress()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Connection.class, "rtt", "getRtt()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Connection.class, "transport", "getTransport()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Connection.class, "channelId", "getChannelId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
        $$delegatedProperties = qcyVarArr;
        Connection connection = new Connection();
        INSTANCE = connection;
        final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(true, false, false, false, false, 30, null);
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        pairName$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.name;
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
        }.provideDelegate(connection, qcyVarArr[0]);
        final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        localCandidateType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$2

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.2.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.localCandidateType;
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
        }.provideDelegate(connection, qcyVarArr[1]);
        final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        localAddress$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$3

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$3$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.3.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.localAddressWithPort;
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
        }.provideDelegate(connection, qcyVarArr[2]);
        final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        remoteCandidateType$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$4

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$4$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.4.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.remoteCandidateType;
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
        }.provideDelegate(connection, qcyVarArr[3]);
        final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        remoteAddress$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$5

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$5$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.5.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.remoteAddressWithPort;
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
        }.provideDelegate(connection, qcyVarArr[4]);
        final KeyPropBehavior keyPropBehavior6 = new KeyPropBehavior(false, false, false, false, false, 31, null);
        rtt$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$default$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$default$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.default.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    Double d;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null || (d = firstActiveConnection.rtt) == null) {
                        return null;
                    }
                    return String.valueOf(d.doubleValue());
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
        }.provideDelegate(connection, qcyVarArr[5]);
        final KeyPropBehavior keyPropBehavior7 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        transport$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$6

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$6$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.6.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.transport;
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
        }.provideDelegate(connection, qcyVarArr[6]);
        final KeyPropBehavior keyPropBehavior8 = new KeyPropBehavior(true, false, false, false, false, 30, null);
        channelId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$7

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Connection$special$$inlined$candidatePair$7$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Connection$special$.inlined.candidatePair.7.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CandidatePair firstActiveConnection;
                    RTCStat rtcStat = statPack.getRtcStat();
                    if (rtcStat == null || (firstActiveConnection = rtcStat.firstActiveConnection()) == null) {
                        return null;
                    }
                    return firstActiveConnection.channelId;
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
        }.provideDelegate(connection, qcyVarArr[7]);
    }

    private Connection() {
        super(SignalingProtocol.NOTIFY_CONNECTION, null, 2, null);
    }

    public final StatKey<String> getChannelId() {
        return (StatKey) channelId$delegate.getValue(this, $$delegatedProperties[7]);
    }

    public final StatKey<String> getLocalAddress() {
        return (StatKey) localAddress$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final StatKey<String> getLocalCandidateType() {
        return (StatKey) localCandidateType$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final StatKey<String> getPairName() {
        return (StatKey) pairName$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final StatKey<String> getRemoteAddress() {
        return (StatKey) remoteAddress$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final StatKey<String> getRemoteCandidateType() {
        return (StatKey) remoteCandidateType$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final StatKey<String> getRtt() {
        return (StatKey) rtt$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final StatKey<String> getTransport() {
        return (StatKey) transport$delegate.getValue(this, $$delegatedProperties[6]);
    }
}
