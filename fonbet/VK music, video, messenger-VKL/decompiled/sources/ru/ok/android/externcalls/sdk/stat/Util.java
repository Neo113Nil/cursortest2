package ru.ok.android.externcalls.sdk.stat;

import android.os.SystemClock;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.externcalls.sdk.stat.SimpleKeyProp;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.cpu.CpuInfo;
import ru.ok.android.webrtc.topology.CallTopology;
import xsna.b09;
import xsna.fpf0;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.zcl;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class Util extends StatGroup {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties;
    public static final Util INSTANCE;
    private static final KeyProp conversationId$delegate;
    private static final KeyProp cpuUsagePercent$delegate;
    private static final KeyProp monotimeDiffMs$delegate;
    private static final KeyProp monotimeNowMs$delegate;
    private static final KeyProp topology$delegate;
    private static final KeyProp unixtimeNowMs$delegate;

    static {
        qcy<?>[] qcyVarArr = {new PropertyReference1Impl(Util.class, "cpuUsagePercent", "getCpuUsagePercent()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), b09.a(0, Util.class, SignalingProtocol.KEY_TOPOLOGY, "getTopology()Lru/ok/android/externcalls/sdk/stat/StatKey;", fpf0.a), new PropertyReference1Impl(Util.class, "conversationId", "getConversationId()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Util.class, "unixtimeNowMs", "getUnixtimeNowMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Util.class, "monotimeNowMs", "getMonotimeNowMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0), new PropertyReference1Impl(Util.class, "monotimeDiffMs", "getMonotimeDiffMs()Lru/ok/android/externcalls/sdk/stat/StatKey;", 0)};
        $$delegatedProperties = qcyVarArr;
        Util util = new Util();
        INSTANCE = util;
        SimpleKeyProp.Companion companion = SimpleKeyProp.Companion;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        final KeyPropBehavior keyPropBehavior = new KeyPropBehavior(z, z2, z3, z4, false, 31, null);
        cpuUsagePercent$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Float>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.keyCreator.calls_sdk_stat_release.default.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Float doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CpuInfo cpuInfo = statPack.getCpuInfo();
                    if (cpuInfo != null) {
                        return cpuInfo.getUsageFraction();
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

            public final SimpleKeyProp<Float> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                SimpleKeyProp<Float> simpleKeyProp = new SimpleKeyProp<>(null);
                simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                return simpleKeyProp;
            }
        }.provideDelegate(util, qcyVarArr[0]);
        int i = 31;
        zcl zclVar = null;
        boolean z5 = false;
        final KeyPropBehavior keyPropBehavior2 = new KeyPropBehavior(z5, z, z2, z3, z4, i, zclVar);
        topology$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$2

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Topology>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.keyCreator.calls_sdk_stat_release.default.2.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Topology doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    CallTopology topology = statPack.getTopology();
                    if (topology != null) {
                        return topology.getIdentity();
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

            public final SimpleKeyProp<Topology> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
                SimpleKeyProp<Topology> simpleKeyProp = new SimpleKeyProp<>(null);
                simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup));
                statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                return simpleKeyProp;
            }
        }.provideDelegate(util, qcyVarArr[1]);
        final KeyPropBehavior keyPropBehavior3 = new KeyPropBehavior(z5, z, z2, z3, z4, i, zclVar);
        conversationId$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$3

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$default$3$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<String>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.keyCreator.calls_sdk_stat_release.default.3.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public String doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    return innerExtractionContext.getConversation().getConversationId();
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
        }.provideDelegate(util, qcyVarArr[2]);
        final KeyPropBehavior keyPropBehavior4 = new KeyPropBehavior(z5, z, z2, z3, z4, 15, zclVar);
        unixtimeNowMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.keyCreator.calls_sdk_stat_release.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    return Long.valueOf(System.currentTimeMillis());
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
        }.provideDelegate(util, qcyVarArr[3]);
        final KeyPropBehavior keyPropBehavior5 = new KeyPropBehavior(z5, true, z2, z3, z4, 13, zclVar);
        monotimeNowMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$2

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$keyCreator$calls_sdk_stat_release$2$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
                private final /* synthetic */ KeyPropBehavior $$delegate_0;
                private final Lazy fullName$delegate;
                private final StatGroup group;
                private final String name;

                public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup) {
                    this.$$delegate_0 = keyPropBehavior;
                    this.name = str;
                    this.group = statGroup;
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.keyCreator.calls_sdk_stat_release.2.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    return Long.valueOf(SystemClock.elapsedRealtime());
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
        }.provideDelegate(util, qcyVarArr[4]);
        final StatKey<Long> monotimeNowMs = util.getMonotimeNowMs();
        final KeyPropBehavior copy$default = KeyPropBehavior.copy$default(new KeyPropBehavior(z5, false, z2, true, z4, 7, zclVar), false, false, true, false, false, 27, null);
        monotimeDiffMs$delegate = (KeyProp) new j7e0() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$diff$default$1

            /* compiled from: Stats.kt */
            /* renamed from: ru.ok.android.externcalls.sdk.stat.Util$special$$inlined$diff$default$1$1, reason: invalid class name */
            public static final class AnonymousClass1 implements StatKey<Long>, StatBehavior {
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
                    this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.Util$special$.inlined.diff.default.1.1.1
                        @Override // xsna.gzs
                        public final String invoke() {
                            return pzl.b(StatGroup.this.getFullName(), ".", str);
                        }
                    });
                }

                @Override // ru.ok.android.externcalls.sdk.stat.StatKey
                public Long doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
                    Long l;
                    Long l2 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                        if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                            return Long.valueOf(longValue - l.longValue());
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
                simpleKeyProp.setValue(new AnonymousClass1(KeyPropBehavior.this, qcyVar.getName(), statGroup, monotimeNowMs));
                statGroup.register$calls_sdk_stat_release(simpleKeyProp);
                return simpleKeyProp;
            }
        }.provideDelegate(util, qcyVarArr[5]);
    }

    private Util() {
        super("util", null, 2, null);
    }

    public final StatKey<String> getConversationId() {
        return (StatKey) conversationId$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final StatKey<Float> getCpuUsagePercent() {
        return (StatKey) cpuUsagePercent$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final StatKey<Long> getMonotimeDiffMs() {
        return (StatKey) monotimeDiffMs$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final StatKey<Long> getMonotimeNowMs() {
        return (StatKey) monotimeNowMs$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final StatKey<Topology> getTopology() {
        return (StatKey) topology$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final StatKey<Long> getUnixtimeNowMs() {
        return (StatKey) unixtimeNowMs$delegate.getValue(this, $$delegatedProperties[3]);
    }
}
